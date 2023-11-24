package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.models.data.EventRepository;
import com.example.demo.models.data.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping("/AddUser")
    public String displayAddUser(Model model) {
        model.addAttribute("user", new User());
        return "AddUser";
    }

    @PostMapping("/AddUser")
    public String processAddUser(@ModelAttribute User newUser, Errors errors){
        if (errors.hasErrors()) {
            return "/AddUser";
        }else{
            userRepository.save(newUser);
            return  "redirect:";
        }
    }
}
