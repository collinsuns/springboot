package com.suns.ch8.springcache.dao;

import com.suns.ch8.springcache.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-25 14:53
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
