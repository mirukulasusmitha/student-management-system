package com.susmitha.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.susmitha.sms.entity.Student;
import com.susmitha.sms.repository.StudentRepository;
import com.susmitha.sms.service.StudentService;
import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	@Transactional
	@GetMapping("/students")
	public List<Student> getAllStudents() {
	
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		 studentRepository.deleteById(id);
		 
	}

	
}
