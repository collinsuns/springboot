package com.suns.ch6.spring_boot_starter_hello;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-13 16:45
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class HelloService {
    private String msg;

    public String sayHello() {
        return "hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
