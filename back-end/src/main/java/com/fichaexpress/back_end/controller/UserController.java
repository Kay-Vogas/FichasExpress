package com.fichaexpress.back_end.controller;

import com.fichaexpress.back_end.entities.User;
import com.fichaexpress.back_end.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/casdatro")
    @ResponseStatus(HttpStatus.CREATED)
    public User cadastrarUser(@RequestBody User user){
        return userService.cadastrarUser(user);
    }



}
