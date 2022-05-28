package com.roy.covid19.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "updated",
        "country",
        "countryInfo",
        "cases",
        "todayCases",
        "deaths",
        "todayDeaths",
        "recovered",
        "todayRecovered",
        "active",
        "critical",
        "casesPerOneMillion",
        "deathsPerOneMillion",
        "tests",
        "testsPerOneMillion",
        "population",
        "continent",
        "oneCasePerPeople",
        "oneDeathPerPeople",
        "oneTestPerPeople",
        "activePerOneMillion",
        "recoveredPerOneMillion",
        "criticalPerOneMillion"
})
public class Country {

    @JsonProperty("updated")
    private long updated;
    @JsonProperty("country")
    private String country;
    @JsonProperty("countryInfo")
    private CountryInfo countryInfo;
    @JsonProperty("cases")
    private int cases;
    @JsonProperty("todayCases")
    private int todayCases;
    @JsonProperty("deaths")
    private int deaths;
    @JsonProperty("todayDeaths")
    private int todayDeaths;
    @JsonProperty("recovered")
    private int recovered;
    @JsonProperty("todayRecovered")
    private int todayRecovered;
    @JsonProperty("active")
    private int active;
    @JsonProperty("critical")
    private int critical;
    @JsonProperty("casesPerOneMillion")
    private int casesPerOneMillion;
    @JsonProperty("deathsPerOneMillion")
    private int deathsPerOneMillion;
    @JsonProperty("tests")
    private int tests;
    @JsonProperty("testsPerOneMillion")
    private int testsPerOneMillion;
    @JsonProperty("population")
    private int population;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("oneCasePerPeople")
    private int oneCasePerPeople;
    @JsonProperty("oneDeathPerPeople")
    private int oneDeathPerPeople;
    @JsonProperty("oneTestPerPeople")
    private int oneTestPerPeople;
    @JsonProperty("activePerOneMillion")
    private double activePerOneMillion;
    @JsonProperty("recoveredPerOneMillion")
    private double recoveredPerOneMillion;
    @JsonProperty("criticalPerOneMillion")
    private double criticalPerOneMillion;

    @JsonProperty("updated")
    public long getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(long updated) {
        this.updated = updated;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("countryInfo")
    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    @JsonProperty("countryInfo")
    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    @JsonProperty("cases")
    public int getCases() {
        return cases;
    }

    @JsonProperty("cases")
    public void setCases(int cases) {
        this.cases = cases;
    }

    @JsonProperty("todayCases")
    public int getTodayCases() {
        return todayCases;
    }

    @JsonProperty("todayCases")
    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    @JsonProperty("deaths")
    public int getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("todayDeaths")
    public int getTodayDeaths() {
        return todayDeaths;
    }

    @JsonProperty("todayDeaths")
    public void setTodayDeaths(int todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    @JsonProperty("recovered")
    public int getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("todayRecovered")
    public int getTodayRecovered() {
        return todayRecovered;
    }

    @JsonProperty("todayRecovered")
    public void setTodayRecovered(int todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    @JsonProperty("active")
    public int getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(int active) {
        this.active = active;
    }

    @JsonProperty("critical")
    public int getCritical() {
        return critical;
    }

    @JsonProperty("critical")
    public void setCritical(int critical) {
        this.critical = critical;
    }

    @JsonProperty("casesPerOneMillion")
    public int getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    @JsonProperty("casesPerOneMillion")
    public void setCasesPerOneMillion(int casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    @JsonProperty("deathsPerOneMillion")
    public int getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    @JsonProperty("deathsPerOneMillion")
    public void setDeathsPerOneMillion(int deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    @JsonProperty("tests")
    public int getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(int tests) {
        this.tests = tests;
    }

    @JsonProperty("testsPerOneMillion")
    public int getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    @JsonProperty("testsPerOneMillion")
    public void setTestsPerOneMillion(int testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    @JsonProperty("population")
    public int getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(int population) {
        this.population = population;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("oneCasePerPeople")
    public int getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    @JsonProperty("oneCasePerPeople")
    public void setOneCasePerPeople(int oneCasePerPeople) {
        this.oneCasePerPeople = oneCasePerPeople;
    }

    @JsonProperty("oneDeathPerPeople")
    public int getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    @JsonProperty("oneDeathPerPeople")
    public void setOneDeathPerPeople(int oneDeathPerPeople) {
        this.oneDeathPerPeople = oneDeathPerPeople;
    }

    @JsonProperty("oneTestPerPeople")
    public int getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    @JsonProperty("oneTestPerPeople")
    public void setOneTestPerPeople(int oneTestPerPeople) {
        this.oneTestPerPeople = oneTestPerPeople;
    }

    @JsonProperty("activePerOneMillion")
    public double getActivePerOneMillion() {
        return activePerOneMillion;
    }

    @JsonProperty("activePerOneMillion")
    public void setActivePerOneMillion(double activePerOneMillion) {
        this.activePerOneMillion = activePerOneMillion;
    }

    @JsonProperty("recoveredPerOneMillion")
    public double getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    @JsonProperty("recoveredPerOneMillion")
    public void setRecoveredPerOneMillion(double recoveredPerOneMillion) {
        this.recoveredPerOneMillion = recoveredPerOneMillion;
    }

    @JsonProperty("criticalPerOneMillion")
    public double getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    @JsonProperty("criticalPerOneMillion")
    public void setCriticalPerOneMillion(double criticalPerOneMillion) {
        this.criticalPerOneMillion = criticalPerOneMillion;
    }

}