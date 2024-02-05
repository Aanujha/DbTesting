package com.example.dbtesting.service;

import com.example.dbtesting.dto.UserDto;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    UserDto registerNewUser(UserDto user);



}
