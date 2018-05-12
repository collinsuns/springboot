package com.suns.ch4.springmvc.httpmessageconverter;

import com.suns.ch4.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project Name: springboot
 * User: Suns
 * Date: 2018-04-12 15:44
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = {"application/x-suns"})
    public @ResponseBody
    DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
