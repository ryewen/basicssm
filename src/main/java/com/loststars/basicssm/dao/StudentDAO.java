package com.loststars.basicssm.dao;

import java.util.List;

import com.loststars.basicssm.model.Student;

public interface StudentDAO {

	public List<Student> listStudents();
	
	public void addStudent(Student student);
}
