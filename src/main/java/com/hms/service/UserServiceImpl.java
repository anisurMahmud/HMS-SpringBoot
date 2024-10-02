package com.hms.service;
import com.hms.model.User;
import com.hms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

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
        return userRepository.findById(id).get();
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
