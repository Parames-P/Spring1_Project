package com.tnsif.PlacementManagement.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.PlacementManagement.entity.Student;
import com.tnsif.PlacementManagement.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository repo;

	@GetMapping("/student")
	public List<Student> addstudent() {
       return repo.findAll();
       }
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
}
