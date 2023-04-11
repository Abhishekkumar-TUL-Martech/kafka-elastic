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
"dataset"
})
@Getter
@Setter
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Event {

@JsonProperty("dataset")
private String dataset;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();


}