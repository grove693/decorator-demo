package com.example.decoratorDemo.service;

import com.example.decoratorDemo.entity.User;
import com.example.decoratorDemo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {

    @Autowired
    private TestRepository testRepository;

    public User findUser(String name) {
        User user = testRepository.findByName(name);
        return user;
    }
}
