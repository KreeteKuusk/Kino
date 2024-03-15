package org.example.kino.controller;

import org.example.kino.model.Watcher;
import org.example.kino.repository.WatcherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WatcherController {

    private final WatcherRepository watcherRepository;

    public WatcherController(WatcherRepository watcherRepository) {
        this.watcherRepository = watcherRepository;
    }

    // for fetching all the users
    @CrossOrigin
    @GetMapping("/api/users")
    public List<Watcher> getAllUsers() {
        return (List<Watcher>) watcherRepository.findAll();
    }

}

