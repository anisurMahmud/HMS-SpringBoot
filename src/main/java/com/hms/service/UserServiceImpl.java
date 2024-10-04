package com.hms.service;
import com.hms.dto.UserResponseDTO;
import com.hms.model.User;
import com.hms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User newUser) {
         userRepository.save(newUser);
    }

    @Override
    public List<UserResponseDTO> findAll() {
        List<User> user = userRepository.findAll();
        return user.stream().map(user1 -> {
            UserResponseDTO userDTO = new UserResponseDTO();
            userDTO.setId(user1.getId());
            userDTO.setUsername(user1.getName());
            userDTO.setSex(user1.getSex());
            userDTO.setAge(user1.getAge());
            return userDTO;
        }).collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO getUserById(long id) {
        User user = userRepository.findById(id).get();
        UserResponseDTO userDTO = new UserResponseDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getName());
        userDTO.setSex(user.getSex());
        userDTO.setAge(user.getAge());

        return userDTO;
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }


    @Override
    public User updateUserById(long id, User user) {
        User userToUpdate = userRepository.findById(id).get();
//Objects.nonNull(user.getName())
        if(!"".equalsIgnoreCase(user.getName())) {
            userToUpdate.setName(user.getName());
        }
//Objects.nonNull(user.getAge()) && !"".equalsIgnoreCase(String.valueOf(user.getAge())) //works for integer or string but not short data type
        else if(user.getAge()>0) {
            userToUpdate.setAge(user.getAge());
        }
        else if(Objects.nonNull(user.getSex()) && !"".equalsIgnoreCase(user.getSex())) {
            userToUpdate.setSex(user.getSex());
        }

        return userRepository.save(userToUpdate);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

}
