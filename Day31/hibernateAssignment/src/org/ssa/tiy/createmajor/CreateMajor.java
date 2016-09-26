package org.ssa.tiy.createmajor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ssa.tiy.entity.Major;;

public class CreateMajor {

	public static void main(String[] args) {
	SessionFactory factory=new  Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	try{
		Major major = new Major( "Yoga",  3300);

		//begin transaction
		session.beginTransaction();
		session.save(major);
		System.out.println("Create New Major" );
		session.getTransaction().commit();
		System.out.println("New Major Created" );
	}catch(Exception ex){ex.printStackTrace();}
	finally{
		factory.close();

			}
	}
	
	
		}
	
	
	

