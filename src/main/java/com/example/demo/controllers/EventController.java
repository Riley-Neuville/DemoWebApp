package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.models.Event;
import com.example.demo.models.data.EventRepository;
import com.example.demo.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/AddEvent")
    public String displayAddUser(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("users", userRepository.findAll());
        return "AddEvent";
    }

    @PostMapping("/AddEvent")
    public String processAddUser(@ModelAttribute Event newEvent, Errors errors){
            eventRepository.save(newEvent);
            return  "redirect:";

    }
}
