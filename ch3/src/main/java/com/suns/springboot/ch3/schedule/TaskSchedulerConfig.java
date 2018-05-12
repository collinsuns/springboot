package com.suns.springboot.ch3.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-11 14:40
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Configuration
@ComponentScan("com.suns.springboot.ch3.schedule")
@EnableScheduling
public class TaskSchedulerConfig {
}
