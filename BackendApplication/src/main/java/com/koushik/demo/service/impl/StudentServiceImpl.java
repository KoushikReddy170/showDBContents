package com.koushik.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koushik.demo.entity.Student;
import com.koushik.demo.repository.StudentRepository;
import com.koushik.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService
{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() 
	{
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
}
