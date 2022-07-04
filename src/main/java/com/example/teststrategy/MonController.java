package com.example.teststrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonController {

    @Autowired
    MonService monService;

    @GetMapping("/create")
    public String create(@RequestParam(value = "name", defaultValue = "World") String name) {

        this.monService.monTest("creation");

        return String.format("Hello %s!", name);
    }

    @GetMapping("/update")
    public String update(@RequestParam(value = "name", defaultValue = "World") String name) {

        this.monService.monTest("modif");

        return String.format("Hello %s!", name);
    }
}
