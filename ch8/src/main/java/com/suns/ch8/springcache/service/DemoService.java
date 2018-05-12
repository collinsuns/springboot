package com.suns.ch8.springcache.service;

import com.suns.ch8.springcache.po.Person;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-25 16:36
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public interface DemoService {

    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);
}
