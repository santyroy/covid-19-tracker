package com.roy.covid19.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.roy.covid19.model.Country;
import com.roy.covid19.model.WorldData;
import com.roy.covid19.utility.Covid19Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Covid19Controller {

    Logger logger = LoggerFactory.getLogger(Covid19Controller.class);
    @Autowired
    private Covid19Service covid19Service;

    @GetMapping("/")
    public String getAddCountryData(Model model) {
        try {
            WorldData worldData = covid19Service.getWorldData();
            List<Country> countryData = covid19Service.getCountryData();

            model.addAttribute("worldData", worldData);
            model.addAttribute("countryData", countryData);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }
        return "index";
    }
}
