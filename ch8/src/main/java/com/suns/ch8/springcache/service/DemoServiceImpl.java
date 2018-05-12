package com.suns.ch8.springcache.service;

import com.suns.ch8.springcache.dao.PersonRepository;
import com.suns.ch8.springcache.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-25 16:38
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id，key为：" + p.getId() + "数据做缓存");
        return p;
    }

    @Override
    @CacheEvict(value = "peopele")
    public void remove(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("为id、key为：" + p.getId() + "数据做了缓存");
        return p;
    }
}
