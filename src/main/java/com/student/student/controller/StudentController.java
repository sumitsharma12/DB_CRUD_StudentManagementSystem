package com.student.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.beans.student.StudentVo;
import com.student.student.Service.StudentService;

@RestController

//@Controller
//@ResponseBody

public class StudentController {

	@Autowired
	private StudentService studentService;


//	For getting all student
	@RequestMapping(path = "/get/all/student", method = RequestMethod.GET)
	public List<StudentVo> getAllStudent() {
		List<StudentVo> allStudentDetails = studentService.getAllStudentDetails();
		return allStudentDetails;
	}

//	For getting student by id 
	@GetMapping(path = "/get/student/{id}")
	public StudentVo getStudentVo(@PathVariable("id") long id) {
		StudentVo studentVo = studentService.getStudentVo(id);
		return studentVo;
	}

//	for adding student
	@PostMapping(path = "/add/student")
	public ResponseEntity<Boolean> addStudent( @RequestBody StudentVo studentVo) {
		boolean information = studentService.addStudent(studentVo);
		if(information)
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		
	}
	
	
//	For update student by id 
	@PutMapping(path = "/update/id/{id}")
	public ResponseEntity<Boolean> updateStudent(@PathVariable("id") long id,@RequestBody StudentVo studentVo)
	{
		boolean updateStudent = studentService.updateStudent(id, studentVo);
		if(updateStudent)
		{
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();

	}
	
//	For delete student by id 
	@DeleteMapping(path = "/delete/student/id/{id}")
	public ResponseEntity<Boolean> delteStudent(@PathVariable("id") long id)
	{
		boolean updateStudent = studentService.deleteStudent(id);
		if(updateStudent)
		{
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();

	}
}

