package com.blog.serviceimp;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dtos.UserDTO;
import com.blog.exceptions.DuplicateEntity;
import com.blog.model.User;
import com.blog.repository.UserRepository;
import com.blog.service.UserService;
import com.blog.utility.ApiResponse;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO createUser(UserDTO user) throws DuplicateEntity {
        if (!userRepository.existsByUserName(user.getUserName())) {
            User createUser = this.dtoToUser(user);
            User saveUser = this.userRepository.save(createUser);

            return this.userToDto(saveUser);
        }
        throw new DuplicateEntity("User already exists");

    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Long user_id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public UserDTO getById(Long user_id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<UserDTO> getList() {
        List<User> getAllUser = this.userRepository.findAll();
        return getAllUser.stream().map(all -> this.userToDto(all)).collect(Collectors.toList());
    }

    @Override
    public ApiResponse deleteUser(Long user_id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    private UserDTO userToDto(User user) {
        return this.modelMapper.map(user, UserDTO.class);
    }

    private User dtoToUser(UserDTO userDTO) {
        return this.modelMapper.map(userDTO, User.class);
    }

}
