package com.neighbor.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neighbor.sample.Chef;

@RestController
@RequestMapping("/test")
public class TestController {
    
    @GetMapping("/chef")
    public Chef goTestPage(){
    	 Chef chef = new Chef();
    	 chef.setId(0);
    	 chef.setName("Chef1");
         return chef;
    }
}