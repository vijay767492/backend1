package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Mservice {

    private final movieRepo repo;

    public Mservice(movieRepo repo) {
        this.repo = repo;
    }

    public movie1 sarigama(movie1 movie) {
        return repo.save(movie);
    }

    public List<movie1> getAllMovies() {
        return repo.findAll();
    }
}
