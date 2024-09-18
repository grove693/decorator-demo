package com.example.decoratorDemo.repository;

import com.example.decoratorDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}
