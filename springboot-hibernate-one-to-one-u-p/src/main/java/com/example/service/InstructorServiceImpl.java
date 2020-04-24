package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.InstructorDAO;
import com.example.entity.Instructor;
@Service
public class InstructorServiceImpl implements InstructorService
{ 
	@Autowired
	private InstructorDAO instructorDao;

	
	@Override
	public List<Instructor> getInstructors() {
		// TODO Auto-generated method stub
		return instructorDao.getInstructors();
	}

	@Override
	public Instructor createInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructor findInstructorByID(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructor updateInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructor deleteInstructor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
