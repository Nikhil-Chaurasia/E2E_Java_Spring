package com.nik.student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nik.student.entities.Student;
import com.nik.student.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void createStudent() {
		Student student = new Student();
		student.setName("Mike");
		student.setCourse("Java");
		student.setFee(10d);
		
		studentRepository.save(student);
	}

}
