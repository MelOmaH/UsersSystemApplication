package com.example.UserSystem;

import com.example.UserSystem.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserSystemApplication  {

    public static void main(String[] args) {
        SpringApplication.run(UserSystemApplication.class, args);
        UserService userService = new UserService();
    }

}
