package com.eacuamba.dev.springboot_zk_mvvm.endpoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "api")
public class HelloWorld {

    @GetMapping()
    public String getHelloWorld(){
        return "Ola mundo, RestController";
    }
}
