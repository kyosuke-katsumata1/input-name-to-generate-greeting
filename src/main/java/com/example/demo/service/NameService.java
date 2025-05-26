package com.example.demo.service;

import com.example.demo.entity.Name;
import com.example.demo.repository.NameRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NameService {
    private final NameRepository repository;
    
    /** constracta. */
    public NameService(NameRepository repository) {
        this.repository = repository;
    }


    public void saveName(String name) {
        Name newName = new Name();
        newName.setName(name);
        repository.save(newName);
    }

    public List<Name> getAllNames() {
        return repository.findAll();
    }
}
