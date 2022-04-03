package com.devpubba.tutorials.sprintboottutorials.controller;

import com.devpubba.tutorials.sprintboottutorials.entities.User;
import com.devpubba.tutorials.sprintboottutorials.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;

@RestController
@RequestMapping("users")
@Log4j2
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public List<User> getAllUser() {
        log.info("Getting all users");
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable int id) {        return userService.findUserById(id);
    }

    @PostMapping(value = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveUser(@RequestBody User newUser) throws ServerException {
        if (newUser == null) {
            throw new ServerException("Internal Server Error");
        } else {
            log.info("Inserting user");
            userService.saveUser(newUser);
        }
    }
}
