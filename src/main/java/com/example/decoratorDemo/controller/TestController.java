package com.example.decoratorDemo.controller;

import com.example.decoratorDemo.entity.User;
import com.example.decoratorDemo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {

    @Autowired
    private TestServiceImpl testServiceImpl;

    @GetMapping("/hello/{name}")
    User test(@PathVariable String name) {
        try {
            System.out.println("REST request received.");
            //Integer num = Integer.parseInt(name);
            User user = testServiceImpl.findUser(name);
            return user;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
