package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.entity.StudentEntity;

@Service

public class StudentService {
	@Autowired
	StudentDao sd;
	public String postAll(List<StudentEntity>a)
	{
		return sd.postAll(a);
	}
	public List<StudentEntity>getAll()
	{
		return sd.getAll();
	}

}
