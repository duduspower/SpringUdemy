package com.example.TodoUdemy.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface RepoZadania extends JpaRepository<Zadania, Integer> {

}
