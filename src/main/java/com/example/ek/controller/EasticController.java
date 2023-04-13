package com.example.ek.controller;

import com.example.ek.entity.Customer;
import com.example.ek.service.elasticservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class EasticController {

    @Autowired
    private elasticservice elasticservice;


    @GetMapping("/message")
   public List<Customer> displaydata(@RequestParam String customer_id)
   {
       return elasticservice.findCustomerById(customer_id);
   }
}
