package com.example.netflixmovies.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.netflixmovies.dto.MovieDto;
import com.example.netflixmovies.repository.MovieRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/movies")
public class Controller {

    @PostMapping
    public MovieDto addMovie(@Valid @RequestBody MovieDto movie) {
        return MovieRepository.save(movie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long id) {
        return MovieRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}