package com.example.springjwtauthnew.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDetailsService userDetailsService();

}
