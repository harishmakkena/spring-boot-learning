package com.learningbydoing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningbydoing.dao.StudentDAO;
import com.learningbydoing.domain.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDao;

	public void save(Student student) {
		studentDao.save(student);
	}

	public void update(Student student) {
		studentDao.save(student);
	}

	public void delete(int studentId) {
		studentDao.deleteById(studentId);
	}

	public Student getStudentById(int studentId) {

		Optional<Student> optional = studentDao.findById(studentId);

		if (optional.isPresent()) {
			return optional.get();
		}
		return new Student();
	}

	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}
}
