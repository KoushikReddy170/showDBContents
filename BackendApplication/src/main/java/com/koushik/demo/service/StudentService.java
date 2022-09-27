package com.koushik.demo.service;

import java.util.List;

import com.koushik.demo.entity.Student;

public interface StudentService 
{
	List<Student> getAllStudents();
	Student saveStudent(Student student);
}
