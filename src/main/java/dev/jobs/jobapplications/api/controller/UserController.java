package dev.jobs.jobapplications.api.controller;

import dev.jobs.jobapplications.api.model.User;
import dev.jobs.jobapplications.api.service.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/User")
    public User getUser(@RequestParam int id){
        Optional<User> user = userService.getUser(id);
        if(user.isPresent()){
        return user.get();
        }
        return null;
    }
}
