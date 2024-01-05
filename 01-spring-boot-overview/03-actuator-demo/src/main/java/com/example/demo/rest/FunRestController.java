package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String home() {
        return "Hello My";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/dev-tools")
    public String testDevTools() {
        return "Success!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String fortune() {
        return "Fortune!";
    }

}
