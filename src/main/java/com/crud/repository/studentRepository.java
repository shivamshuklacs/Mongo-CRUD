package com.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crud.models.students;

public interface studentRepository extends MongoRepository<students, Integer> {

	
}
