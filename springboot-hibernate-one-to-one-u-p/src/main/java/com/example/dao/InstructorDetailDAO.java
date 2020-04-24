package com.example.dao;

import java.util.List;

import com.example.entity.InstructorDetail;

public interface InstructorDetailDAO {

	public List<InstructorDetail> getInstructorsDetail();

	public InstructorDetail createInstructorDetail(InstructorDetail instructorDetail);

	public InstructorDetail findInstructorDetailByID(int Id);

	public InstructorDetail updateInstructorDetail(InstructorDetail instructorDetail);

	public InstructorDetail deleteInstructorDetail(int id);

}
