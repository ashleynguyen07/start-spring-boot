package com.example.springjwtauthnew.controller;

import com.example.springjwtauthnew.entity.User;
import com.example.springjwtauthnew.repository.UserRepository;
import com.example.springjwtauthnew.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {
    private final UserService userService;
    private final UserRepository userRepository;
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hi Admin");
    }

    @GetMapping("/list")
    public List<User> getList() {
        return userService.getListAdmin();
    }
    @GetMapping("/list-all-user")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
