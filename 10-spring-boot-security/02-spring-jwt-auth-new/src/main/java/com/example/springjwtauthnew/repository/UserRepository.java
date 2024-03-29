package com.example.springjwtauthnew.repository;

import com.example.springjwtauthnew.entity.Role;
import com.example.springjwtauthnew.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    List<User> findByRole(Role role);
}
