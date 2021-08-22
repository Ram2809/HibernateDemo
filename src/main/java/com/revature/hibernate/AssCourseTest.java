package com.revature.hibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AssCourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Course c1 = new Course();
		c1.setCourseId(110);
		c1.setCourseName("Java");
		Course c2 = new Course();
		c2.setCourseId(111);
		c2.setCourseName("Big data");
		Course c3 = new Course();
		c3.setCourseId(113);
		c3.setCourseName("Python");
		Set<Course> courseList = new HashSet<>();
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		//Associates a1 = new Associates();
		//a1.setAssoicateId(10001);
		//a1.setAssociateName("Nanthak");
		Associates a2=new Associates();
		a2.setAssoicateId(10003);
		a2.setAssociateName("Indu");
		a2.setCourses(courseList);
		try {
			session.beginTransaction();
			session.save(a2);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
