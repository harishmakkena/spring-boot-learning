package com.learningbydoing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningbydoing.domain.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {
	

}
