package com.example.html_form.controller;

import com.example.html_form.model.User;
import com.example.html_form.repository.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/register")
    public String getForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String postEntity(@ModelAttribute("user") User user) {
        repository.save(user);

        return "redirect:/success";
    }

    @GetMapping("/success")
    public String getSuccessPage() {
        return "success";
    }

}
