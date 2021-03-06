package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.InstructorDAO;
import com.example.entity.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService{
	
	@Autowired
	private InstructorDAO instructorDao;

	@Override
	public List<Instructor> getInstructors() {
		
		return instructorDao.getInstructors();
	}

	@Override
	public Instructor createInstructor(Instructor instructor) {
		
		return instructorDao.createInstructor(instructor);
	}

	@Override
	public Instructor findInstructorByID(int Id) {
		
		return instructorDao.findInstructorByID(Id);
	}

	@Override
	public Instructor updateInstructor(Instructor instructor) {
		
		return instructorDao.updateInstructor(instructor);
	}

	@Override
	public Instructor deleteInstructor(int id) {
	
		return instructorDao.deleteInstructor(id);
	}
	
	
	

}
