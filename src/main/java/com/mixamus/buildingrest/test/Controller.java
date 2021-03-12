package com.mixamus.buildingrest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private A a;

    @Autowired
    private B b;


    @GetMapping("/test")
    public void process() {
        b.testB();
        a.testA();
    }
}
