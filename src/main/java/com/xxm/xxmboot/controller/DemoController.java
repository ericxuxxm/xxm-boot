package com.xxm.xxmboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String hello(String name){
        return "hello"+name;
    }
    //dev test
    @GetMapping
    public String helloWorld(String name){
        return "hello world"+name;
    }

    @GetMapping
    public String helloWorldMirro(String name){
        return "hello world mirro: "+name;
    }
}
