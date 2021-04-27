package com.example.msauserservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/test")
    public String getUser() {
        System.out.println("AAAAAAAAAAAAAAAAAA");
        return "user Information";
    }
}
