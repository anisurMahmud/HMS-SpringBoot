package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User newUser) {
         userRepository.save(newUser);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
