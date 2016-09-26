package org.ssa.tiy.createmajor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ssa.tiy.entity.Major;

public class QueryUpdate {
	public static void main(String[] args) {
				
	
	SessionFactory factory=new  Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Major.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		try{
			int major_id=10;
			session.beginTransaction();
			//query major
			Major major=session.get(Major.class, major_id);
			
		
			
			
						
			//session.save(major);
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update major m set m.description='Art' where s.id=10").executeUpdate();
			System.out.println("Major updated" );
			session.getTransaction().commit();
			
			session.getTransaction().commit();
		}catch(Exception ex){
			ex.printStackTrace();
		
		}finally{
			factory.close();

		}
	}
}

