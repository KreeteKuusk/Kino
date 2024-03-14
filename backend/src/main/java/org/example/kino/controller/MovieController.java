package org.example.kino.controller;

import org.example.kino.model.Movie;
import org.example.kino.repository.MovieRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @CrossOrigin
    @GetMapping("/api/movies")
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/api/movies/{id}")
    public Movie getMovie(@PathVariable Integer id) throws Exception {
        return movieRepository.findById(id)
                .orElseThrow(() -> new Exception("Movie not found with id " + id));
    }

}

