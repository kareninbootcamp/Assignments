package org.ssa.tiy.createmajor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ssa.tiy.entity.Major;

public class Day31 {
	
	public static void main(String[] args) {
			
				//delete();
				//add();
				//update();
				select();

	}

	
	public static void add(){
			SessionFactory factory=new  Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Major.class)
				.buildSessionFactory();
		
			Session session=factory.getCurrentSession();
		
		try{
			Major major = new Major( "Meditation",  1122);

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
	
	public static void delete() {
			SessionFactory factory=new  Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Major.class)
				.buildSessionFactory();
			Session session=factory.getCurrentSession();
		
		try{
			session.beginTransaction();
			session.createQuery("delete Major where id=14").executeUpdate();
			System.out.println("Major Deleted from Mock Education Program");
			session.getTransaction().commit();
		
		}catch(Exception ex){ex.printStackTrace();

		}finally{
			factory.close();

		}
	}

	public static void update() {
		SessionFactory factory=new  Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
		Session session=factory.getCurrentSession();
	
	try{
		int major_id=9;
		session.beginTransaction();
		//query major
		Major major=session.get(Major.class, major_id);
		
		//session.save(major);
		session=factory.getCurrentSession();
		session.beginTransaction();
		
		session.createQuery("update Major m set m.description='Bowling' where m.id=9").executeUpdate();
		System.out.println("Major updated" );
		session.getTransaction().commit();
		
		session.getTransaction().commit();
	}catch(Exception ex){
		ex.printStackTrace();
	
	}finally{
		factory.close();

	}
	}
	
	public static void select() {
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

	




