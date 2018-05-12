package com.suns.springboot.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-10 18:17
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executorAsyncTask(Integer i) {
        System.out.println("执行异步任务： " + i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1： " + i);
    }
}
