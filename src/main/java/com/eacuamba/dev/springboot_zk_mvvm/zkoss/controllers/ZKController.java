package com.eacuamba.dev.springboot_zk_mvvm.zkoss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZKController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
