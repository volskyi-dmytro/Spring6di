package com.stpunk.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("In controller method");

        return "Hello, everyone!";
    }
}
