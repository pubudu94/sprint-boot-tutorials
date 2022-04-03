package com.devpubba.tutorials.sprintboottutorials.repository;

import com.devpubba.tutorials.sprintboottutorials.entities.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {

    List<UserEntity> findByName(@Param("name") String name);

    UserEntity findById(long id);
}
