package com.xxm.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderProviderController {


    @Autowired
    private ConfigurableApplicationContext applicationContext;


    @GetMapping(value = "/hi")
    public String sayhi() {
        return "Hello  " + applicationContext.getEnvironment().getProperty("user.name");
    }
}
