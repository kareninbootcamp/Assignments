package com.ssa.tiy2.sqlstudent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Students {
	
	//this is where i need the array 
	DataConnection dc= new DataConnection();
	
	ArrayList<Student> myArrayList=new ArrayList<Student>();
    Student student=new Student(1, "Karen", "Reiter", 1500, 3.5);
  //  myArrayList.add;
    
    
    

	//getbyid method
	Student getById(int id){
		
		return dc.getById(id);
			
		}
		
		
		//getall method
	ArrayList<Student> 	getAll() throws FileNotFoundException, IOException, SQLException{
		
		return dc.getAllStudents();
			
		}
}