package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dtos.UserDTO;
import com.blog.exceptions.DuplicateEntity;
import com.blog.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) throws DuplicateEntity {
        UserDTO createUser = this.userService.createUser(user);

        return new ResponseEntity<>(createUser, HttpStatus.CREATED);

    }

    @GetMapping("/all")
    ResponseEntity<List<UserDTO>> getListOfUser() {
        List<UserDTO> getAllUser = userService.getList();

        return new ResponseEntity<>(getAllUser, HttpStatus.OK);
    }
}
