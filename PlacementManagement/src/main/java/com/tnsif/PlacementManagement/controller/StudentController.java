package com.tnsif.PlacementManagement.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.PlacementManagement.entity.Student;
import com.tnsif.PlacementManagement.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository repo;

	@GetMapping("/student")
	public Student addstudent()

	{

		return new Student("parameshwari", "palanivel", "Paramesh@gmail.com", LocalDate.of(2004,03,29),"CSE");

	}
}