package com.mixamus.buildingrest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class A {

    private B b;

//    public A(B b) {
//        this.b = b;
//        System.out.println("a created");
//    }


    @Autowired
    public void setB(B b) {
        this.b = b;
        System.out.println("a setter");
    }

    public void testA() {
        System.out.println(b);
    }
}
