package com.example.dbtesting.service.imp;

import com.example.dbtesting.dto.UserDto;
import com.example.dbtesting.repo.UserRepo;
import com.example.dbtesting.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public UserDto registerNewUser(UserDto userDto) {
        return null;
    }

    private User toEntity(UserDto dto) {
        return modelMapper.map(dto,User.class);
    }

    private UserDto toDto(User entity) {
        return modelMapper.map(entity,UserDto.class);
    }
}
