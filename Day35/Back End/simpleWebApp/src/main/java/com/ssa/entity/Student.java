package com.ssa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //Auto_increament
	@Column(name="id")
	int id;
	
	@Column(name="gpa")
	double gpa;
	
	@Column(name="sat")
	int sat;
	
	@Column(name="first_name")
	String first_name;
	
	@Column(name="last_name")
	String last_name;
	
	@Column(name="major_id")
	Integer major_id;
	
	public Student(){}
	
	public Student(double gpa, int sat, String first_name, String last_name) {
		this.gpa = gpa;
		this.sat = sat;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getMajor_id() {
		return major_id;
	}

	public void setMajor_id(Integer major_id) {
		this.major_id = major_id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", gpa=" + gpa + ", sat=" + sat + ", first_name=" + first_name + ", last_name="
				+ last_name + "]";
	}
	
}
