package com.example.dockercompose.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dockercompose.entity.Book;

public interface DockerComposeBookRepository extends JpaRepository<Book,Integer> {

}
