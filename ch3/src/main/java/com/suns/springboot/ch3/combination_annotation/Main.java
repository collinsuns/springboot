package com.suns.springboot.ch3.combination_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-11 15:34
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();

        context.close();
    }

}
