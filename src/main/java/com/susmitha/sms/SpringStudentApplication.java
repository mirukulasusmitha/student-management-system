package com.susmitha.sms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import com.susmitha.sms.entity.Student;
import com.susmitha.sms.repository.StudentRepository;

@Component
@EnableJpaAuditing
@SpringBootApplication
public class SpringStudentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student stud1= new Student("ramya","naik","ramya@gmail.com");
//		studentRepository.save(stud1);
//		
//		Student stud2= new Student("anu","mehta","anu@gmail.com");
//		studentRepository.save(stud2);
//		
//		Student stud3= new Student("susmitha","susmitha","susmitha123@gmail.com");
//		studentRepository.save(stud3);
		
	}

}
