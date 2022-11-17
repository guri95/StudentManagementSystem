package com.guri.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guri.sms.entity.Student;
import com.guri.sms.repository.StudentRepository;
import com.guri.sms.service.StudentService;

@Service
public class StudentServiceImple implements StudentService{
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent(){
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student deleteStudentById(Long id) {
		Student student = getStudentById(id);
		studentRepository.deleteById(id);
		return student;
	}
}
