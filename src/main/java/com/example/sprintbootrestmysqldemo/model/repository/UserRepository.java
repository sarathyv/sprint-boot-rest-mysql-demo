package com.example.sprintbootrestmysqldemo.model.repository;

import com.example.sprintbootrestmysqldemo.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

    User findByName(String name);
}
