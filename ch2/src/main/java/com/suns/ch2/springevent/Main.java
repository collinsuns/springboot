package com.suns.ch2.springevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-23 13:42
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello application event");
        demoPublisher.toString();
        context.close();
    }
}
