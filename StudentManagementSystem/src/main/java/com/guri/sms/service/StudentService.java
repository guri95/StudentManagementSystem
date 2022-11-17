package com.guri.sms.service;

import java.util.List;

import com.guri.sms.entity.Student;

public interface StudentService {
	public List<Student> getAllStudent();

	public Student saveStudent(Student student);
	
	public Student getStudentById(Long id);
	public Student updateStudent(Student student);

	public Student deleteStudentById(Long id);
}
