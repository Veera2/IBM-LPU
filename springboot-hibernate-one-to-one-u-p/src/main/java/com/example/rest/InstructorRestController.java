package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Instructor;
import com.example.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorRestController 
{
	@Autowired
	private InstructorService instructorService;
	
	
	@RequestMapping("/instructors")
	public List<Instructor>getInstructors()
	{
		return instructorService.getInstructors();
		
	}

	
	

}
