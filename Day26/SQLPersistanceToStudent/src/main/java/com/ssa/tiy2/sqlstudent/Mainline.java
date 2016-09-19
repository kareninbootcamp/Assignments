package com.ssa.tiy2.sqlstudent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Mainline {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		
//		Retrieve a single Student instance by id (primary key)
//		Retrieve a collection of all Student instances into a collection of type List does this nicely.
		
		Students students = new Students();
	    // retrieve a single student with id = 1
		System.out.println("GET BY STUDENT ID");
		System.out.println("------------------");
		
	    Student aStudent = students.getById(100);
	    // display the student
	    System.out.println("First name        Last name            GPA         SAT");
		System.out.println("========================================================");
	   System.out.printf("%-16s    %-16s   %-4.2f   %-6d     \n", aStudent.firstName, aStudent.lastName, aStudent.gpa, aStudent.sat);
	   System.out.println("\n");
	   System.out.println("GET ALL STUDENTS");
	   System.out.println("------------------");
	   // displays the student data in a formatted way
	    // retrieve all the students into a collection
	   System.out.println("First name        Last name            GPA         SAT");
		System.out.println("========================================================");
	    ArrayList<Student> allStudents = students.getAll();
	    // iterate through the collection and display each student data in a formatted way
	    for(Student student : allStudents) {
	    
	    	System.out.printf("%-16s    %-16s   %-4.2f   %-6d     \n", student.firstName, student.lastName, student.gpa, student.sat);
		}
	    	
	    	System.out.println("-----------------------------------------------------------");
	    }

	}


