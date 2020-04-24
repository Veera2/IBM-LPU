package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.InstructorDetailDAO;
import com.example.entity.InstructorDetail;

@Service
public class InstructorDetailServiceImpl implements InstructorDetailService {

	@Autowired
	private InstructorDetailDAO dao;

	@Override
	public List<InstructorDetail> getInstructorsDetail() {
		return dao.getInstructorsDetail();
	}

	@Override
	public InstructorDetail createInstructorDetail(InstructorDetail instructorDetail) {

		return dao.createInstructorDetail(instructorDetail);
	}

	@Override
	public InstructorDetail findInstructorDetailByID(int Id) {
		return dao.findInstructorDetailByID(Id);
	}

	@Override
	public InstructorDetail updateInstructorDetail(InstructorDetail instructorDetail) {

		return dao.updateInstructorDetail(instructorDetail);
	}

	@Override
	public InstructorDetail deleteInstructorDetail(int id) {
		return dao.deleteInstructorDetail(id);
	}

}
