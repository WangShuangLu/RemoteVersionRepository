package com.iotplat.demo.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContraller {


    @RequestMapping("/hello")
    public String hello(){
        return "HelloWorld!";
    }
}
