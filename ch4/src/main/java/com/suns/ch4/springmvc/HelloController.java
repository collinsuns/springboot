package com.suns.ch4.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-12 9:48
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
