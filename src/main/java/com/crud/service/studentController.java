package com.crud.service;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.models.students;
import com.crud.repository.studentRepository;

@RestController
public class studentController {
	
	@Autowired
	private studentRepository repository;
	 
	@PostMapping("/addStudents")
	public String saveStudent(@RequestBody students students) {
		repository.save(students);
		return("Added Student with id : \" + id;");
	}
	@GetMapping("/findStudents/{id}")
	public Optional<students> getstudents(@PathVariable int id) {
		return repository.findById(id);
	}
	@GetMapping("/findAllStudents")
	public List <students> getstudents() {
			return repository.findAll();
		}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		repository.deleteById(id);
		return "Student deleted with id : " + id;
	}
}
