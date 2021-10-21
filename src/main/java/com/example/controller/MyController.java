package com.example.controller;

import com.example.service.MyService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping("counter")
    @ResponseBody
    public String counterTest() {
        myService.counterTest();
        return "hahahaha";
    }
}
