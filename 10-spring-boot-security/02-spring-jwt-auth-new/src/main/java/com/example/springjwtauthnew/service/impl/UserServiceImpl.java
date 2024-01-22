package com.example.springjwtauthnew.service.impl;

import com.example.springjwtauthnew.entity.Role;
import com.example.springjwtauthnew.entity.User;
import com.example.springjwtauthnew.repository.UserRepository;
import com.example.springjwtauthnew.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {

            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not founf"));
            }
        };

    }

    @Override
    public List<User> getListUser() {
        List<User> ls = userRepository.findByRole(Role.USER);
        return ls;
    }

    @Override
    public List<User> getListAdmin() {
        List<User> ls = userRepository.findByRole(Role.ADMIN);
        return ls;
    }


}
