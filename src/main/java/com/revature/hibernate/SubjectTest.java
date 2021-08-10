package com.revature.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SubjectTest {
	public static void main(String[] args)
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Student student=new Student(100,"Ram",99);
		Subject subject=new Subject(1,"Tamil");
		student.setSubject(subject);
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
}
