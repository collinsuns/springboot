package com.suns.ch2.watch;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-24 9:50
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class ConcreteGirl implements Girl {
    private List<Boy> boyList = new ArrayList<>();

    @Override
    public void addBoy(Boy boy) {
        boyList.add(boy);
    }

    @Override
    public void removeBoy(Boy boy) {
        boyList.remove(boy);
    }

    @Override
    public void notifyBoys(String str) {
        for (Boy boy : boyList) {
            boy.update(str);
        }
    }
}
