package com.ssa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssa.dao.IStudentDAO;
import com.ssa.entity.Student;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudentDAO studentDAO;
	
	@Override
	public List<Student> getAllStudents(){
		return studentDAO.getAllStudents();
	}


	@Override
	public Student getStudentByID(int studentID) {
	return studentDAO.getStudentByID(studentID);
	}


	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteStudent(int studentID) {
		// TODO Auto-generated method stub
		
	}

}
