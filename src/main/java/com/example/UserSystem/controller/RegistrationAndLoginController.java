package com.example.UserSystem.controller;


import com.example.UserSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationAndLoginController {


    @Autowired
    UserService userService;


    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Форма авторизації");
        return "login-form";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("title", "Форма реєстрації");
        return "registration-form";
    }
//
//    @PostMapping("/registration")
//
//    public String addUser(User user, Map<String, Object> model) {
//        User userFromDB = userRepository.findByUsername(user.getUsername());
//
//        if (userFromDB !=null){
//            model.put("message", "User exist!");
//            return "registration-form";
//        }
//
//        user.setActive(true);
//        user.setRoles(Collections.singleton(Role.USER));
//        userRepository.save(user);
//
//        return "redirect:/login";
//    }
}

