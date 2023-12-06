package com.susmitha.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.susmitha.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findAll();



	
}
