package com.ssa.tiy.studentenrollment;

import com.mysql.jdbc.Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class Enrollment {
	
	public static Connection myConn=null;
	public static PreparedStatement myStmt=null;
	public static ResultSet myRs=null;

	public static void main(String[] args) throws SQLException {
		//enrollStudent();
		//fetchData();
		addStudent("Adam", "Zapel", 1200, 3.0);
		addStudent("Graham", "Krakir", 500, 2.5);
		addStudent("Ella", "Vader", 800, 3.0);
		addStudent("Stanley", "Kupp", 1350, 3.3);
		addStudent("Lou", "Zar", 9500, 3.0);

		assignMajor("Adam","Zabel", "Finance");
	}
	
	private static void makeConnection() throws FileNotFoundException, IOException, SQLException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("studentenrollment.properties"));
		String dburl = prop.getProperty("dburl");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		myConn = (Connection)DriverManager.getConnection(dburl, user, password);
	}
	
	private static void addStudent(String firstName, String lastName, int sat, double gpa)throws SQLException{
		//this adds the student and assigns the major
		try{
			makeConnection();

			myStmt= myConn.prepareStatement("insert student (first_name, last_name, sat, gpa) values(?, ?, ?, ?)");
			myStmt.setString(1, firstName);
			myStmt.setString(2, lastName);
			myStmt.setInt(3, sat);
			myStmt.setDouble(4, gpa);
			
			myStmt.executeUpdate();
			System.out.println("It worked!");
			
		}catch(Exception ex){
			
		}finally{
		close();
	}
	}
	private static void assignMajor(int student_id, string majorDescription)throws SQLException{
		//work in progress
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("select * from student join major on student.major_id=major.id where student.id > ?");
			myStmt= myConn.prepareStatement("update student set gpa=?, sat = ? where id=?");
			myStmt.setDouble(1, 3.5);
			myStmt.setInt(2, 1600);
			myStmt.setInt(3, 100);
			
			myStmt.executeUpdate();
			
		}catch(Exception ex){
			
		}finally{
		close();
	}

}
	private static void enrollStudent()throws SQLException{
		//work in progress
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("insert student_class_relationship values(?, ?,?)");
			
			myStmt.setInt(1, 1);
			myStmt.setInt(2, 221);
			myStmt.setInt(3, 10101);
					
			myStmt.executeUpdate();
						
			
			System.out.println("Enrolled!");
			
		}catch(Exception ex){
			
		}finally{
		close();
	}
	}
	
	public static void display() throws SQLException{
		while(myRs.next()){/*only use rs.next with a select*/
			String fName= myRs.getString("first_name");
			String lName= myRs.getString("last_name");
			double gpa=myRs.getDouble("gpa");
			int sat=myRs.getInt("sat");
			int id=myRs.getInt("id");
			System.out.printf("%-20s  %4.1f %d %d", fName + " "+ lName, gpa, sat, id);
			System.out.println();
		}
		
	}
		
		private static void fetchData() throws SQLException{
			try{			
				makeConnection();
				myStmt= myConn.prepareStatement("select * from student where gpa > ? and sat > ?");
				
				//set parameter values
				myStmt.setDouble(1, 2.0);
				myStmt.setInt(2, 1000);
				
				//Execute the query 
				myRs= myStmt.executeQuery();
				
				//Process my ResultSet
				System.out.println("Education System - Enrollment Process");
				System.out.println("======================================");
				
				display();
				
				
				//reuse statement (process the second result)
				//set parameter values
				
				myStmt.setDouble(1, 1.0);
				myStmt.setInt(2, 900);
				myRs= myStmt.executeQuery();
				
//				System.out.println("Enrolled" concat full name" as a new student");
//				System.out.println(concat full name "has an SAT score of" + sat);
//				System.out.println("Assigned" +concat full name " to the " + major.description + " which requires");
//				System.out.println("Enrolled" + [full name] "in the following four classes:");
//				System.out.println([class name] + "required for major");
//				System.out.println([class name] + "required for major");
//				System.out.println[class name] elective (not required for major);
//				System.out.println[class name] elective (not required for major);
				
				
				display();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}finally{
				close();
				
			}
			}
			public static void close() throws SQLException{
				if(myConn!=null)
					myConn.close();
				if(myStmt != null)
					myStmt.close();
				if(myRs != null)
					myRs.close();
		
		}
	

}
