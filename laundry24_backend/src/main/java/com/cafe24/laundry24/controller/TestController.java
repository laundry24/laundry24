package com.cafe24.laundry24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test() {
        return "HelloWord";
    }

    @GetMapping("/hello2")
    public String test2() {
        return "HelloWord~~~~~~~~~~~~~~~~!!!!22";
    }
}
