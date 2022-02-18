package com.example.TodoUdemy.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlZadaniaRepository extends TaskRepository, JpaRepository<Zadanie, Integer> {
}
