package com.suns.ch2.watch;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-24 9:57
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteGirl Lucy = new ConcreteGirl();

        ConcreteBoy Tom = new ConcreteBoy();
        ConcreteBoy Steven = new ConcreteBoy();
        ConcreteBoy Jim = new ConcreteBoy();

        Lucy.addBoy(Tom);
        Lucy.addBoy(Steven);
        Lucy.addBoy(Jim);

        Lucy.notifyBoys("I an single!");

    }
}
