package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.StudentService;

@RestController
@RequestMapping(value="/stu/api")

public class StudentController {
@Autowired
StudentService ss;
@PostMapping(value="/postvalue")
public String postAll(@RequestBody List<StudentEntity>a)
{
	return ss.postAll(a);
}
@GetMapping(value="/getstval")
public List<StudentEntity> getAll()
{
	return ss.getAll();
}

	

}
