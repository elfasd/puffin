package com.asd.puffin.modules.controller;

import com.asd.puffin.modules.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/demo")
    public String test(){

        System.out.println("qqq");
        testService.test();
        return "asd";
    }


}
