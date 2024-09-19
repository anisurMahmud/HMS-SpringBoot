package com.hms.service;

import com.hms.model.User;



public interface UserService {
    void save(User newUser);

    Iterable<User> findAll();

    User getUserById(long id);
}
