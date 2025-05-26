package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.NameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.example.demo.entity.Name;



@RestController
@RequestMapping("/names")
public class NameController {
    private final NameService service;
    
    public NameController(NameService service) {
        this.service = service;
    }

    @PostMapping
    public void addName(@RequestParam String name) {
        service.saveName(name);
    }

    @GetMapping
    public List<Name> getNames() {
        return service.getAllNames();
    }
    
    
}
