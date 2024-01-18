package com.example.springjwtauthnew.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String token;
}
