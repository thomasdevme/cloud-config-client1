package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thomasdutta on 8/11/17.
 */
@RestController
public class ClientController {

    @Value("${username: Thomas}")
    private String username;

    @RequestMapping("/")
    public String getUsername() {
        return "Hello " + username + "!";
    }
}
