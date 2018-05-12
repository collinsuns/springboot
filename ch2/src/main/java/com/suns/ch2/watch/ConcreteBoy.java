package com.suns.ch2.watch;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-24 9:57
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class ConcreteBoy implements Boy {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
