package com.ssa.tiy2.sqlstudent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;


public class DataConnection {
	
	public static Connection myConn=null;
	public static PreparedStatement myPrStmt=null;
	public static ResultSet myRs=null;
	public static Statement myStmt=null;

	public static void main(String[] args) {
	}
		
	private static void makeConnection() throws FileNotFoundException, IOException, SQLException{
			Properties prop = new Properties();
			prop.load(new FileInputStream("sqlpersistance.properties"));
			String dburl = prop.getProperty("dburl");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			myConn = (Connection)DriverManager.getConnection(dburl, user, password);
		}
//		public int executeSqlUpdate(String sql) throws SQLException {
//			Statement stmt = conn.createStatement();
//			try {ResultSEt rs = stmt.executeQuery(sql);
//				
//			}
		

		public static void close() throws SQLException{
			if(myConn!=null)
				myConn.close();
			if(myStmt != null)
				myStmt.close();
			if(myRs != null)
				myRs.close();
			

	}

static ArrayList<Student> getAllStudents() throws FileNotFoundException, IOException, SQLException{
			
	ArrayList<Student> studentList = new ArrayList<>();	
	Student std;
	
			try{//1. create a student object{
				// make conn
			makeConnection();
			//create stmt
		    myStmt=myConn.createStatement();
		    // Execution
		    myRs=myStmt.executeQuery("Select * from student");
			
			while(myRs.next()){
				std= new Student();
				std.setId(myRs.getInt("id"));
				std.setFirstName(myRs.getString("first_name"));
				std.setLastName(myRs.getString("last_name"));
				std.setGpa(myRs.getDouble("gpa"));
				std.setSat(myRs.getInt("sat"));
				studentList.add(std);
			}
			
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		return	studentList;	
			}


static Student getById(int id){
	
	//1. create a student object
	Student std = new Student();
	// open try catch
	try{
		makeConnection();
		myPrStmt= myConn.prepareStatement("select * from student where id=?");
	    myPrStmt.setInt(1, id);
	    myRs=myPrStmt.executeQuery();
	    while( myRs.next())
	    {
	    std.setId(myRs.getInt("id"));
	    std.setFirstName(myRs.getString("first_name"));
	    std.setLastName(myRs.getString("last_name"));
	    std.setGpa(myRs.getDouble("gpa"));
	    std.setSat(myRs.getInt("sat"));
	    }
		
	}catch(Exception ex){
		ex.printStackTrace();
	}

	 return std;
	 
}
			
}
	




