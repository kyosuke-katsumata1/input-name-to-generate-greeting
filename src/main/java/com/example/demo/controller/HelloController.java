package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String showForm() {
        return "hello-form";
    }

    @PostMapping("/hello")
    public String greet(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "こんにちは、" + name + "さん！");
        return "hello-result";
    }
}
