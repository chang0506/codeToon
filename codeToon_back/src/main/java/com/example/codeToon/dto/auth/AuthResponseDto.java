package com.example.codeToon.dto.auth;

import lombok.Builder;

@Builder
public class AuthResponseDto {
    private String grantType;
    private String accessToken;
    private String refreshToken;
}
