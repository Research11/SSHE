package com.pb.dao;

import java.util.List;

import com.pb.domain.Student;

public interface StudentDao {

	void svae(Student student);
	void delete(Student student);
	void update(Student student);
	Student findBid(Integer id);
	List<Student> list();
	
}
