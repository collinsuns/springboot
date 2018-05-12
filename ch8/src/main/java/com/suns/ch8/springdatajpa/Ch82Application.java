package com.suns.ch8.springdatajpa;

import com.suns.ch8.springcache.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-25 15:07
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class Ch82Application {
    @Autowired
    PersonRepository personRepository;


    public static void main(String[] args) {
        SpringApplication.run(Ch82Application.class, args);

    }


}