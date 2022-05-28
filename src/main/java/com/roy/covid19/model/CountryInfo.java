package com.roy.covid19.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "iso2",
        "iso3",
        "lat",
        "long",
        "flag"
})
public class CountryInfo {

    @JsonProperty("_id")
    private int id;
    @JsonProperty("iso2")
    private String iso2;
    @JsonProperty("iso3")
    private String iso3;
    @JsonProperty("lat")
    private int lat;
    @JsonProperty("long")
    private int _long;
    @JsonProperty("flag")
    private String flag;

    @JsonProperty("_id")
    public int getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("iso2")
    public String getIso2() {
        return iso2;
    }

    @JsonProperty("iso2")
    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    @JsonProperty("iso3")
    public String getIso3() {
        return iso3;
    }

    @JsonProperty("iso3")
    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    @JsonProperty("lat")
    public int getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(int lat) {
        this.lat = lat;
    }

    @JsonProperty("long")
    public int getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(int _long) {
        this._long = _long;
    }

    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

}
