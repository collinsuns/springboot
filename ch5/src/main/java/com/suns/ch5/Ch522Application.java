package com.suns.ch5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-13 15:47
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@RestController
@SpringBootApplication
public class Ch522Application {
    @RequestMapping("/")
    String index() {
        return "Hello Spring boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
    }
}
