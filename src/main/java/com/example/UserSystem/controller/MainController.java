package com.example.UserSystem.controller;


import com.example.UserSystem.service.UserService;
import com.example.UserSystem.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("title", "Головна сторінка");
        return "main";
    }

    @GetMapping("/add_user")
    public String addUser(Model model) {
        model.addAttribute("title", "Додати нового користувача");
        return "add-user";
    }

    @GetMapping("/update_user")
    public String updateUser(Model model) {
        model.addAttribute("title", "Відредагувати користувача");
        return "update-user";
    }


    @GetMapping("/all_users")
    public String allUsers(Model model) {
        List<Users> users = userService.showAllUsers();

        model.addAttribute("users", users);
        model.addAttribute("title", "Всі користувачі");
        return "all-users";
    }

}
