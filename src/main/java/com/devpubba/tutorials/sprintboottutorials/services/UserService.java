package com.devpubba.tutorials.sprintboottutorials.services;

import com.devpubba.tutorials.sprintboottutorials.entities.User;
import com.devpubba.tutorials.sprintboottutorials.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void  saveUser(User user) {
       userRepository.save(user);
    }

    public List<User> getUsersByName(String name) {
        return userRepository.findByName(name);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(int id){
        return userRepository.findById(id);
    }
}