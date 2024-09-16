package com.hms.controller;

import com.hms.model.User;
import com.hms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //class is now controller
@RequestMapping(path = "/user") //url start with /user
public class UserController {
//    @Autowired        //autowired creates problems it seems. must learn more
//
//    private UserRepository userRepository;
//
//    @PostMapping(path="/add") // Map ONLY POST Requests
//    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam short age){
//        User newUser = new User();
//        newUser.setName(name);
//        newUser.setAge(age);
//        userRepository.save(newUser);
//        return "Saved";
//    }
//
//    @GetMapping(path = "/all")
//    public @ResponseBody Iterable<User> getAllUsers(){
//        //supposed to return json or xml with the users
//        return userRepository.findAll();
//    }
}
