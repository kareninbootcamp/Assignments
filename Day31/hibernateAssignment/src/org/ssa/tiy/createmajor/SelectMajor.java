package org.ssa.tiy.createmajor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ssa.tiy.entity.Major;

public class SelectMajor {
	
	public static void main(String[] args) {
		SessionFactory factory=new  Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Major.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try{
			
			session.beginTransaction();
			//query major
			List<Major> majors= session.createQuery("from Major").list();
			
			
			//display major
			display(majors);
			
			session.getTransaction().commit();
			
		}catch(Exception ex){ex.printStackTrace();}
		finally{
			factory.close();

				}
		}

	private static void display(List<Major> majors) {
		for(Major major: majors)
			System.out.println(major);
	}
}
