package com.suns.springboot.ch3.conditional;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-11 14:53
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
