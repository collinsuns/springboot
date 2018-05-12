package com.suns.ch2.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-23 13:38
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的信息：" + msg);
    }
}
