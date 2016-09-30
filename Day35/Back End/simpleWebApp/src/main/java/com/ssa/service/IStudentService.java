package com.ssa.service;

import java.util.List;

import com.ssa.entity.Student;
/*Pull JSON data into html*/
public interface IStudentService {
	List<Student> getAllStudents();
	Student getStudentByID(int studentID);/*Karen, this is the first method to create*/
	void updateStudent(Student student);
	void deleteStudent(int studentID);
	boolean addStudent(Student student);

}
