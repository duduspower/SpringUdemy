package com.example.TodoUdemy.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Zadanie> findAll();
    List<Zadanie> findByDone(@Param("state") boolean done);

    Page<Zadanie> findAll(Pageable page);
    Optional<Zadanie> findById(Integer id);

    Zadanie save(Zadanie entity);


}
