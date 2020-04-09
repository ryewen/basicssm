package com.loststars.basicssm.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loststars.basicssm.dao.StudentDAO;
import com.loststars.basicssm.model.Student;

@Service
public class StudentService {
    
    @Autowired
    private StudentDAO studentDAO;

    public List<Student> listStudents() {
        List<Student> students = studentDAO.listStudents();
        return students;
    }
    
    @Transactional
    public void addStudent(String name, int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentDAO.addStudent(student);
    }
}
