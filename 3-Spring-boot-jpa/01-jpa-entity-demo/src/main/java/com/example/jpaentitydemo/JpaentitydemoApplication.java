package com.example.jpaentitydemo;

import com.example.jpaentitydemo.dao.StudentDAO;
import com.example.jpaentitydemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpaentitydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaentitydemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//				createStudent(studentDAO);
//				readStudent(studentDAO, 1);
//				readAllStudent(studentDAO);
//			updateStudent(studentDAO);
			deleteStudent(studentDAO,2);
		};
	}

	private void deleteStudent(StudentDAO studentDAO,Integer id) {
		studentDAO.delete(id);
		System.out.println("Student deleted with id: "+ id);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student editStudent = studentDAO.findById(2);
		editStudent.setEmail("smith@email.com");
		studentDAO.update(editStudent);
		System.out.println("updated Student:"+editStudent);
	}

	private void readAllStudent(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		for(Student student: students){
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO, Integer id) {
		Student student = studentDAO.findById(id);
		System.out.println("Student details:"+ student);
	}

	private void createStudent(StudentDAO studentDAO) {
		Student newStudent = new Student("John", "Peter", "john@email.com");
		studentDAO.save(newStudent);
		System.out.println("Saved student with id:"+ newStudent.getId());
	}


}
