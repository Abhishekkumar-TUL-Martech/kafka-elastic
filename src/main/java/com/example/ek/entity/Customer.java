package com.example.ek.entity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"category",
"currency",
"customer_first_name",
"customer_full_name",
"customer_gender",
"customer_id",
"customer_last_name",
"customer_phone",
"day_of_week",
"day_of_week_i",
"email",
"manufacturer",
"order_date",
"order_id",
"products",
"sku",
"taxful_total_price",
"taxless_total_price",
"total_quantity",
"total_unique_products",
"type",
"user",
"geoip",
"event"
})
@Getter
@Setter
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Customer {

@JsonProperty("category")
private List<String> category;
@JsonProperty("currency")
private String currency;
@JsonProperty("customer_first_name")
private String customerFirstName;
@JsonProperty("customer_full_name")
private String customerFullName;
@JsonProperty("customer_gender")
private String customerGender;
@JsonProperty("customer_id")
private int customerId;
@JsonProperty("customer_last_name")
private String customerLastName;
@JsonProperty("customer_phone")
private String customerPhone;
@JsonProperty("day_of_week")
private String dayOfWeek;
@JsonProperty("day_of_week_i")
private int dayOfWeekI;
@JsonProperty("email")
private String email;
@JsonProperty("manufacturer")
private List<String> manufacturer;
@JsonProperty("order_date")
private String orderDate;
@JsonProperty("order_id")
private int orderId;
@JsonProperty("products")
private List<Product> products;
@JsonProperty("sku")
private List<String> sku;
@JsonProperty("taxful_total_price")
private double taxfulTotalPrice;
@JsonProperty("taxless_total_price")
private double taxlessTotalPrice;
@JsonProperty("total_quantity")
private int totalQuantity;
@JsonProperty("total_unique_products")
private int totalUniqueProducts;
@JsonProperty("type")
private String type;
@JsonProperty("user")
private String user;
@JsonProperty("geoip")
private Geoip geoip;
@JsonProperty("event")
private Event event;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}