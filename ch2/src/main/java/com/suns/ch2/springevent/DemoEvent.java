package com.suns.ch2.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-23 13:36
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
