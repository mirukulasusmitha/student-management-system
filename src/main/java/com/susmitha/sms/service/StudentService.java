package com.susmitha.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.susmitha.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	
	
}
