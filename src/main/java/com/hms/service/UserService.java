package com.hms.service;

import com.hms.dto.UserResponseDTO;
import com.hms.model.User;

import java.util.List;


public interface UserService {
    void save(User newUser);

    List<UserResponseDTO> findAll();

    UserResponseDTO getUserById(long id);

    void deleteUserById(long id);

    User updateUserById(long id, User user);

    User addUser(User user);
}
