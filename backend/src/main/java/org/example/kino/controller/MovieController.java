package org.example.kino.controller;

import org.example.kino.model.Movie;
import org.example.kino.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    // for fetching all the movies
    @CrossOrigin
    @GetMapping("/api/movies")
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    // for fetching a specific movie
    @CrossOrigin
    @GetMapping("/api/movies/{id}")
    public Movie getMovie(@PathVariable Integer id) throws Exception {
        return movieRepository.findById(id)
                .orElseThrow(() -> new Exception("Movie not found with id " + id));
    }

    // for updating a specific movie (seats)
    @CrossOrigin
    @PutMapping("/api/movies/{id}")
    public Movie updateMovie(@PathVariable Integer id, @RequestBody Movie updatedMovie) throws Exception {
        return movieRepository.findById(id)
                .map(movie -> {
                    movie.setName(updatedMovie.getName());
                    movie.setGenre(updatedMovie.getGenre());
                    movie.setLanguage(updatedMovie.getLanguage());
                    movie.setAgeRestriction(updatedMovie.getAgeRestriction());
                    movie.setStartTime(updatedMovie.getStartTime());
                    movie.setSeats(updatedMovie.getSeats());
                    return movieRepository.save(movie);
                })
                .orElseThrow(() -> new Exception("Movie not found with id " + id));
    }

}

