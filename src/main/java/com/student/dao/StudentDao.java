package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;

@Repository

public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String postAll(List<StudentEntity>a)
	{
		sr.saveAll(a);
		return "saved succesfully";
	}
	public List<StudentEntity> getAll()
	{
		return sr.findAll();
	}
	

}
