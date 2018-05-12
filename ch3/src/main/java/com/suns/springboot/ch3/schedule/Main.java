package com.suns.springboot.ch3.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-11 14:41
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
