package com.koushik.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koushik.demo.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Long>
{
	
}
