package org.example.kino.repository;

import org.example.kino.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    // This is empty because CrudRepository has methods for database operations, eg save(), findOne(), findAll(), delete(), etc.
}
