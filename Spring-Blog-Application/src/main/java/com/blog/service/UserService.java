package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.dtos.UserDTO;
import com.blog.exceptions.DuplicateEntity;
import com.blog.utility.ApiResponse;

@Service
public interface UserService {

    // Create User
    UserDTO createUser(UserDTO user) throws DuplicateEntity;

    // Update User
    UserDTO updateUser(UserDTO userDTO, Long user_id);

    // Get User By Id
    UserDTO getById(Long user_id);

    // List Of User
    List<UserDTO> getList();

    // Delete User By Id
    ApiResponse deleteUser(Long user_id);

}
