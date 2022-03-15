package com.example.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springbootmongodb.model.Books;

public interface BooksRepository extends MongoRepository<Books, Integer> {

}
