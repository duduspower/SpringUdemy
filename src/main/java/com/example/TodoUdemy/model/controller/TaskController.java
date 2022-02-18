package com.example.TodoUdemy.model.controller;

import com.example.TodoUdemy.model.SqlZadaniaRepository;
import com.example.TodoUdemy.model.Zadanie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
class TaskController {
    public static final Logger logger = (Logger) LoggerFactory.getLogger(TaskController.class);
    private final SqlZadaniaRepository repository;

    TaskController(SqlZadaniaRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/zadanies", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Zadanie>> readAllTasks() {
        logger.warn("Pokazywanie wszystkich tasków");
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/zadanies")
    ResponseEntity<List<Zadanie>> readAllTasks(Pageable page) {
        logger.warn("Custom pageable");
        return ResponseEntity.ok(repository.findAll((org.springframework.data.domain.Pageable) page).getContent());
    }
}