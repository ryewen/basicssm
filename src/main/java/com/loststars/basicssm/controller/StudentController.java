package com.loststars.basicssm.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.loststars.basicssm.model.Student;
import com.loststars.basicssm.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/listStudents")
	public String listStudents(Model model) {
		List<Student> students = studentService.listStudents();
		model.addAttribute("students", students);
		return "listStudents";
	}
	
	@RequestMapping(path = "/addStudent", method = RequestMethod.GET)
	public String addStudent() {
		return "addStudentForm";
	}
	
	@RequestMapping(path = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@RequestParam(name = "name") String name,  @RequestParam(name = "age") int age) {
		try {
			studentService.addStudent(name, age);
			return "addStudentSuccess";
		} catch (Exception e) {
			System.out.println(e.toString());
			return "addStudentFail";
		}
	}
}
