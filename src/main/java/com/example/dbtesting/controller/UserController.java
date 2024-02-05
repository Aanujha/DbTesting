package com.example.dbtesting.controller;

import com.example.dbtesting.model.User;
import com.example.dbtesting.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/details")
    public ResponseEntity<?> userdetails(){
        List<User> userList = this.userRepo.userlist(PageRequest.of(0,10));
        return new ResponseEntity<>(userList, HttpStatus.ACCEPTED);
    }
}
