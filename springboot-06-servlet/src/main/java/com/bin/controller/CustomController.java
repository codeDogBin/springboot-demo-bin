package com.bin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
    @RequestMapping("/servlet ")
    public String servlet(){
        System.out.println("controller执行");
        return "你好";
    }
}
