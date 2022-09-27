package com.koushik.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.koushik.demo.entity.Student;
import com.koushik.demo.repository.StudentRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Student student1 = new Student("Koushik", "Reddy", "koushik@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("Suneel", "Kumar", "suneel@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Karthik", "Punumalli", "karthik@gmail.com");
		studentRepository.save(student3);
		*/
	}

}
