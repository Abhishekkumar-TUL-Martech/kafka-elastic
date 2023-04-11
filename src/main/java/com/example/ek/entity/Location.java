package com.example.ek.entity;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"lon",
"lat"
})
@Getter
@Setter
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Location {

@JsonProperty("lon")
private double lon;
@JsonProperty("lat")
private double lat;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();


}