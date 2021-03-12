package com.mixamus.buildingrest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class B {

    private A a;

//    @Lazy
//    public B(A a) {
//        this.a = a;
//        System.out.println("b created");
//    }

    @Autowired
    public void setA(A a) {
        this.a = a;
        System.out.println("b setter");
    }

    public void testB() {
        System.out.println(a);
    }
}
