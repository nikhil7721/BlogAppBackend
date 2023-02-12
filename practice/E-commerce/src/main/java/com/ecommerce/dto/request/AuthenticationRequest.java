package com.ecommerce.dto.request;

import lombok.Getter;

@Getter
public class AuthenticationRequest {
    private String userName;
    private String password;

}
