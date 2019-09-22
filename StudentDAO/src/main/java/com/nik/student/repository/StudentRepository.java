package com.nik.student.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nik.student.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
