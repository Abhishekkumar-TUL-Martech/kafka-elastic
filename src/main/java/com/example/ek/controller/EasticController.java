package com.example.ek.controller;

import com.example.ek.entity.Customer;
import com.example.ek.service.elasticservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class EasticController {

    @Autowired
    private elasticservice elasticservice;


    @GetMapping("/message")
   public Customer displaydata(@RequestBody int customerId)
   {
      return  elasticservice.findCustomerById(customerId);
   }
}
