package org.ssa.tiy.createmajor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ssa.tiy.entity.Major;

public class QueryDelete {
		
public static void main(String[] args) {
		
	delete();	
	}

	public static void delete() {
		SessionFactory factory=new  Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Major.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try{
			//int id=12;
			//delete major alternate method
			session.beginTransaction();
			//Major major=session.get(Major.class, major_Id);
//			session.delete(major);
			session.createQuery("delete Major where id=12").executeUpdate();
			System.out.println("Major Deleted from Education Program");
			session.getTransaction().commit();
		
		}catch(Exception ex){ex.printStackTrace();

		}finally{
			factory.close();

				}
}
}
