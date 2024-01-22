package com.example.springjwtauthnew.service;

import com.example.springjwtauthnew.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserDetailsService userDetailsService();
    List<User> getListUser();
    List<User> getListAdmin();
}
