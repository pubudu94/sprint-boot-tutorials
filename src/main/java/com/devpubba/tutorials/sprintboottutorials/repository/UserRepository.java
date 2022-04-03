package com.devpubba.tutorials.sprintboottutorials.repository;

import com.devpubba.tutorials.sprintboottutorials.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(@Param("name") String name);

    List<User> findAll();

    User findById(long id);
}
