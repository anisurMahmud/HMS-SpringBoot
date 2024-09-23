package com.hms.service;

import com.hms.model.User;



public interface UserService {
    public void save(User newUser);

    public Iterable<User> findAll();

    public User getUserById(long id);

    public void deleteUserById(long id);

    public User updateUserById(long id, User user);
}
