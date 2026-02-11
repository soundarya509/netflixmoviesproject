package com.example.netflixmovies.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.netflixmovies.dto.MovieDto;

import jakarta.validation.Valid;

public class MovieRepository {

    private static final List<MovieDto> movies = new ArrayList<>();
    private static long idCounter = 1;

    public static  MovieDto save( @Valid MovieDto movie) {
        movie.setId(idCounter++);
        movies.add(movie);
        return movie;
    }

    public static Optional<MovieDto> findById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }
}

