package org.example.kino.repository;

import org.example.kino.model.Watcher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatcherRepository extends CrudRepository<Watcher, Integer> {
    // This is empty because CrudRepository has methods for database operations, eg save(), findOne(), findAll(), delete(), etc.
}
