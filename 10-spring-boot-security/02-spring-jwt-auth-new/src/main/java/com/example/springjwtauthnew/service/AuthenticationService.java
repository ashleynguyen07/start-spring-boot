package com.example.springjwtauthnew.service;

import com.example.springjwtauthnew.dto.JwtAuthenticationResponse;
import com.example.springjwtauthnew.dto.RefreshTokenRequest;
import com.example.springjwtauthnew.dto.SignInRequest;
import com.example.springjwtauthnew.dto.SignUpRequest;
import com.example.springjwtauthnew.entity.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
