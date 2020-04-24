package com.example.dao;

import java.util.List;

import com.example.entity.Instructor;

public interface InstructorDAO {

	public List<Instructor> getInstructors();
	
	public Instructor createInstructor(Instructor instructor);
	
	public Instructor findInstructorByID(int Id);
	
	public Instructor updateInstructor(Instructor instructor);
	
	public Instructor deleteInstructor(int id);
	
}
