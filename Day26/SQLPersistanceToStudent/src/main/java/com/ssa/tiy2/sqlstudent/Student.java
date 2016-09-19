package com.ssa.tiy2.sqlstudent;

import java.util.ArrayList;

public class Student {
	int id;
	String firstName;
	String lastName;
	double gpa;
	int sat;
	
	
	public Student(){}
	public Student(int id,String firstName, String lastName, int sat, double gpa){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.sat = sat;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public int getSat() {
		return sat;
	}


	public void setSat(int sat) {
		this.sat = sat;
	}


}
