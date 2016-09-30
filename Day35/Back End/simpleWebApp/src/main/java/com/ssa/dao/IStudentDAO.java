package com.ssa.dao;

import java.util.List;

import com.ssa.entity.Student;

public interface IStudentDAO {
	
	List<Student> getAllStudents();/*understand this one, consume with jquery, and understand it*/
	Student getStudentByID(int studentID);
	boolean addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentID);

}
