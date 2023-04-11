package com.example.ek.entity;

import java.util.LinkedHashMap;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"country_iso_code",
"location",
"region_name",
"continent_name",
"city_name"
})
@Getter
@Setter
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Geoip {

@JsonProperty("country_iso_code")
private String countryIsoCode;
@JsonProperty("location")
private Location location;
@JsonProperty("region_name")
private String regionName;
@JsonProperty("continent_name")
private String continentName;
@JsonProperty("city_name")
private String cityName;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}