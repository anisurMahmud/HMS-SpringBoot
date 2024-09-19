package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //class is now controller
@RequestMapping(path="/user") //url start with /user

public class UserController {
    @Autowired        //Makes beans, must learn more

    private UserService userService;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public String addNewUser(@RequestParam String name, @RequestParam short age){
        User newUser = new User();
        newUser.setName(name);
        newUser.setAge(age);
        userService.save(newUser);
        return "Saved";
    }
    @PostMapping(path = "/adds")
    public @ResponseBody User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        //supposed to return json or xml with the users
        return userService.findAll();
    }

    @GetMapping(path = "/user/{id}")
    public @ResponseBody User getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }
}
