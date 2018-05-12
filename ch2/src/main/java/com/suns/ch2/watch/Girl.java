package com.suns.ch2.watch;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-24 9:47
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public interface Girl {

    void addBoy(Boy boy);

    void removeBoy(Boy boy);

    void notifyBoys(String str);

}
