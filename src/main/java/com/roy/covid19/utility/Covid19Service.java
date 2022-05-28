package com.roy.covid19.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roy.covid19.model.Country;
import com.roy.covid19.model.WorldData;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class Covid19Service {

    Logger logger = LoggerFactory.getLogger(Covid19Service.class);
    private final String BASE_URL = "https://corona.lmao.ninja/v2";
    private final String OVERALL_DATA_URL = "/all?yesterday";
    private final String ALL_CONTINENTS_URL = "/continents?yesterday=true&sort";
    private final String ALL_COUNTRIES_URL = "/countries?yesterday&sort";
    private final String SPECIFIC_COUNTRY_URL = "/countries/India?yesterday=true&strict=true&query";


    public WorldData getWorldData() {

        RestTemplate restTemplate = new RestTemplate();
        WorldData worldData = restTemplate.getForObject(BASE_URL + OVERALL_DATA_URL, WorldData.class);
        logger.debug("received world data");
        return worldData;
    }

    public List<Country> getCountryData() throws JsonProcessingException {
        List<Country> countries = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(BASE_URL + ALL_COUNTRIES_URL, String.class);
        logger.info("received countries response");

        JSONArray jsonArray = new JSONArray(response);
        if (!jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.length(); i++) {
                logger.info("iterating countries response: #{}", i);
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                ObjectMapper objectMapper = new ObjectMapper();
                Country country = objectMapper.readValue(jsonObject.toString(), Country.class);
                logger.info("adding {} to list", country.getCountry());
                countries.add(country);
            }
        }
        return countries;
    }
}
