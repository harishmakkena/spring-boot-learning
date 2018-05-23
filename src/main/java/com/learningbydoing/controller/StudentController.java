package com.learningbydoing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learningbydoing.domain.Student;
import com.learningbydoing.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studService;
	
	@RequestMapping(method=RequestMethod.POST, value= "/student/save")
	public void save(@RequestBody Student student) {
		studService.save(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value= "/student/update")
	public void update(@RequestBody Student student) {
		studService.update(student);
	}
		
	@RequestMapping(method=RequestMethod.DELETE, value= "/student/{studentId}")
	public void delete(@PathVariable(name = "studentId") int studentId) {
			studService.delete(studentId);
		}
	@RequestMapping(method=RequestMethod.GET, value= "/student/{studentId}")
	public Student getStudentById(@PathVariable(name ="studentId") int studentId) {

		return studService.getStudentById(studentId);
	}
	
	@RequestMapping(method=RequestMethod.GET, value= "/students")
	public List<Student> getAllStudents() {
		return studService.getAllStudents();
	}
	
	
	

}
