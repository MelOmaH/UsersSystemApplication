package com.example.UserSystem.controller;

import com.example.UserSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserManipulationController {

    @Autowired
    private UserService userService;


    @PostMapping("/add_user")
    public String addUser(@RequestParam String name, @RequestParam String password) {
        userService.addUser(name, password);
        return "redirect:/all_users";
    }

    @PostMapping("/update_user")
    public String updateUser(@RequestParam String oldName, @RequestParam String oldPassword, @RequestParam String newName, @RequestParam String newPassword) {
        userService.updateUserName(oldName, newName, newPassword);
        return "redirect:/all_users";
    }
}
