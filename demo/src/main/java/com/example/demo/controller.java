package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class controller {

    private Mservice service;

    public controller(Mservice service) {
        this.service = service;
    }

    @PostMapping("/thisAPI")
    public movie1 addMovie(@RequestBody movie1 movie) {
        return service.sarigama(movie);
    }

    @GetMapping("/thisAPI")
    public List<movie1> getAllMovies() {
        return service.getAllMovies(); 
    }
}
