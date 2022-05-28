package com.roy.covid19.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "updated",
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
        "oneCasePerPeople",
        "oneDeathPerPeople",
        "oneTestPerPeople",
        "activePerOneMillion",
        "recoveredPerOneMillion",
        "criticalPerOneMillion",
        "affectedCountries"
})
@Generated("jsonschema2pojo")
public class WorldData {

    @JsonProperty("updated")
    private long updated;
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
    private double deathsPerOneMillion;
    @JsonProperty("tests")
    private long tests;
    @JsonProperty("testsPerOneMillion")
    private double testsPerOneMillion;
    @JsonProperty("population")
    private long population;
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
    @JsonProperty("affectedCountries")
    private int affectedCountries;

    @JsonProperty("updated")
    public long getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(long updated) {
        this.updated = updated;
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
    public double getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    @JsonProperty("deathsPerOneMillion")
    public void setDeathsPerOneMillion(double deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    @JsonProperty("tests")
    public long getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(long tests) {
        this.tests = tests;
    }

    @JsonProperty("testsPerOneMillion")
    public double getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    @JsonProperty("testsPerOneMillion")
    public void setTestsPerOneMillion(double testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    @JsonProperty("population")
    public long getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(long population) {
        this.population = population;
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

    @JsonProperty("affectedCountries")
    public int getAffectedCountries() {
        return affectedCountries;
    }

    @JsonProperty("affectedCountries")
    public void setAffectedCountries(int affectedCountries) {
        this.affectedCountries = affectedCountries;
    }

}
