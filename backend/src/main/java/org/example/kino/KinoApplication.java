package org.example.kino;

import org.example.kino.model.Movie;
import org.example.kino.repository.MovieRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class KinoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(KinoApplication.class, args);
        MovieRepository movierepo = context.getBean(MovieRepository.class);

        Movie movie1 = context.getBean(Movie.class);

        // movie1.setId(2);
        movie1.setName("Dune");
        movie1.setGenre("adventure");
        movie1.setLanguage("english");
        movie1.setAgeRestriction(12);
        movie1.setStartTime("19:00");

        movierepo.save(movie1);
    }

}
