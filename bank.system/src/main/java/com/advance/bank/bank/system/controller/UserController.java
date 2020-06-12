package com.advance.bank.bank.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test")
    private String test(){
        return"HELLO WORLD";
    }
}
