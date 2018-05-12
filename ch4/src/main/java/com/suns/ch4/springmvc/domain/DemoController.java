package com.suns.ch4.springmvc.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-12 10:47
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Controller
@RequestMapping("/suns")
public class DemoController {
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String index(HttpServletRequest request) {
        return "url:" + request.getRequestURI() + "can access";
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURI() + "can access, str:" + str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String passRequestParam(@RequestParam Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURI() + "can access, id:" + id;
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return "url:" + request.getRequestURI() + "can access,obj id:" + obj.getId() + "obj name:" + obj.getName();
    }

    @RequestMapping(value = {"/name1", "name2"}, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURI() + "can access";
    }
}
