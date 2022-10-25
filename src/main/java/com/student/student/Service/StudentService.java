package com.student.student.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.student.beans.student.StudentVo;
import com.student.repo.studentrepo;

@Service
public class StudentService {

	@Autowired
	private studentrepo studentrepo;

//	For getting all student
	public List<StudentVo> getAllStudentDetails() {
		return studentrepo.findAll();
	}

//	For getting student by id 
	public StudentVo getStudentVo(long id) {
		StudentVo studentVo = studentrepo.findById(id).orElse(null);
		return studentVo;
	}

	
//	for adding student
	public boolean addStudent( StudentVo studentVo) {
		boolean check = false;
		StudentVo saveStudentVo = studentrepo.save(studentVo);
		if (saveStudentVo != null) {
			check = true;
		}
		return check;
	}

	
	
//	For update student by id 
	public boolean updateStudent(long id, StudentVo studvo) {
		boolean check = false;
		StudentVo studentVo = studentrepo.findById(id).orElse(null);
		if (studentVo != null) {
			if (studvo.getName() != null) {
				studentVo.setName(studvo.getName());

			}
			if (studvo.getContectNumber() != null) {
				studentVo.setContectNumber(studvo.getContectNumber());
				StudentVo savestudent = studentrepo.save(studentVo);
				if (savestudent != null) {
					check = true;

				}
			}
			if (studvo.getEmail() != null) {
				studentVo.setEmail(studvo.getEmail());
				StudentVo savestudent = studentrepo.save(studentVo);
				if (savestudent != null) {
					check = true;

				}
			}

			if (studvo.getAddress() != null) {
				studentVo.setAddress(studvo.getAddress());
				StudentVo savestudent = studentrepo.save(studentVo);
				if (savestudent != null) {
					check = true;

				}
			}
		}
		return check;
	}

	
//	For delete student by id 
	public boolean deleteStudent(long id) {
		studentrepo.deleteById(id);
		return true;
	}

}
