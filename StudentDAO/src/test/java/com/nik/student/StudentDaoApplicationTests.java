package com.nik.student;

import java.util.Optional;

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
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Mike");
		student.setCourse("Java");
		student.setFee(10d);
		
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> optionalStudent = studentRepository.findById(1l);
		if (optionalStudent.isPresent()) {
			System.out.println(optionalStudent.get());
		}
	}

}
