package com.suns.springboot.ch3.combination_annotation;

import org.springframework.stereotype.Service;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-11 15:31
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
