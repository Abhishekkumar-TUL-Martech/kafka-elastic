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
"base_price",
"discount_percentage",
"quantity",
"manufacturer",
"tax_amount",
"product_id",
"category",
"sku",
"taxless_price",
"unit_discount_amount",
"min_price",
"_id",
"discount_amount",
"created_on",
"product_name",
"price",
"taxful_price",
"base_unit_price"
})
@Getter
@Setter
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Product {

    @JsonProperty("base_price")
    private double basePrice;
    @JsonProperty("discount_percentage")
    private int discountPercentage;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("tax_amount")
    private int taxAmount;
    @JsonProperty("product_id")
    private int productId;
    @JsonProperty("category")
    private String category;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("taxless_price")
    private double taxlessPrice;
    @JsonProperty("unit_discount_amount")
    private int unitDiscountAmount;
    @JsonProperty("min_price")
    private double minPrice;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("discount_amount")
    private int discountAmount;
    @JsonProperty("created_on")
    private String createdOn;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("price")
    private double price;
    @JsonProperty("taxful_price")
    private double taxfulPrice;
    @JsonProperty("base_unit_price")
    private double baseUnitPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
