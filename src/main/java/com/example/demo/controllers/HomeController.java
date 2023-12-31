package com.example.demo.controllers;

import com.example.demo.models.data.EventRepository;
import com.example.demo.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "MyEvents");
        model.addAttribute("events", eventRepository.findAll());
        model.addAttribute("users", userRepository.findAll());

        return "View";
    }
}
