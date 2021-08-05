package com.revature.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student s1 = new Student();
		s1.setId(11);
		s1.setName("Meena");
		s1.setMarks(100);
		Student s2 = new Student();
		s2.setId(12);
		s2.setName("Haritha");
		s2.setMarks(200);
		try {
			session.save(s1);
			session.save(s2);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
