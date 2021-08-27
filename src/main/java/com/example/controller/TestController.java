package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test02")
    public String test() {
        System.out.println("test method()......");
        return "test method()......";
    }

    @RequestMapping("test03")
    public String test03() {
        return "test03";
    }
}
