package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class movie1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String moviename;
    private String moviegenre;
    private boolean Hit;
    private String poster;
    
    public movie1(String poster) {
        this.poster = poster;
    }
    
    public String getPoster() {
        return poster;
    }
    
    public void setPoster(String poster) {
        this.poster = poster;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getMoviename() {
        return moviename;
    }
    
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
    
    public String getMoviegenre() {
        return moviegenre;
    }
    
    public void setMoviegenre(String moviegenre) {
        this.moviegenre = moviegenre;
    }
    
    public boolean isHit() {
        return Hit;
    }
    
    public void setHit(boolean hit) {
        Hit = hit;
    }
    
    public movie1(long id, String moviename, String moviegenre, boolean hit) {
        this.id = id;
        this.moviename = moviename;
        this.moviegenre = moviegenre;
        Hit = hit;
    }
    
    public movie1() {
    }
}
