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



//    @PostMapping(path="/add") // Map ONLY POST Requests
////    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam short age){
////        User newUser = new User();
////        newUser.setName(name);
////        newUser.setAge(age);
////        userService.save(newUser);
////        return "Saved";
////    }
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody User addUser(@RequestBody User user) {
        return userService.addUser(user);
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

    @DeleteMapping(path = "/user/{id}")
    public @ResponseBody String deleteUserById(@PathVariable long id){
        userService.deleteUserById(id);
        return "Record deleted";
    }

    @PutMapping(path = "user/{id}")
    public @ResponseBody User updateUserById(@PathVariable long id, @RequestBody User user){
        return userService.updateUserById(id, user);
    }


}
