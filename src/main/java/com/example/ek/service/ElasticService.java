package com.example.ek.service;

import com.example.ek.entity.Customer;

import java.util.List;

public interface ElasticService {
    List<Customer> findCustomerById(String id);
}
