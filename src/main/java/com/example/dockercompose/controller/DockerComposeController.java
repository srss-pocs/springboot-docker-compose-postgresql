package com.example.dockercompose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockercompose.entity.Book;
import com.example.dockercompose.repository.DockerComposeBookRepository;

@RestController
@RequestMapping("/api/books")
public class DockerComposeController {
	
	@Autowired
	DockerComposeBookRepository dockerComposeBookRepository;
	
	@PostMapping
	public Book saveBook(@RequestBody Book book){
		return dockerComposeBookRepository.save(book);
	}

	@GetMapping
	public List<Book> getBooks(){
		return dockerComposeBookRepository.findAll();
	}

}
