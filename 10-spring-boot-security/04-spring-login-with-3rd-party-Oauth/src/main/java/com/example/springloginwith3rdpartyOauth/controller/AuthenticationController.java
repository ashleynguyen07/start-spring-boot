package com.example.springloginwith3rdpartyOauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthenticationController {
    @GetMapping
    public String welcome(){
        return "Welcome to Google";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("username: " + principal.getName());
        return principal;
    }
}
