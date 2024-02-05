package com.example.dbtesting.security;

import lombok.Data;

@Data
public class JwtAuthRequest {

    private String password;

    private String getCustomername;

}
