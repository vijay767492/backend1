package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class movie1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String moviename;
    private String moviegenre;
    private boolean Hit;
    private String poster;
    private LocalDate releaseDate; // New field

    // Constructors
    public movie1(String poster) {
        this.poster = poster;
    }

    public movie1(long id, String moviename, String moviegenre, boolean hit, LocalDate releaseDate) {
        this.id = id;
        this.moviename = moviename;
        this.moviegenre = moviegenre;
        this.Hit = hit;
        this.releaseDate = releaseDate; // Set release date
    }

    public movie1() {
    }

    // Getters and Setters
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
