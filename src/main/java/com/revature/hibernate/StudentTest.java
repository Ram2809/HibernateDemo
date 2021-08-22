package com.revature.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

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
		  } 
		  catch (Exception e) 
		  {
			  e.printStackTrace(); 
		  } 
		  finally 
		  { 
			  if (session != null) 
			  { 
				  session.close(); 
			  } 
		  }
//		  //updation 
//		  Session session1 = sessionFactory.openSession();
//		  session1.beginTransaction(); 
//		  session1.find(Student.class, 11); 
//		  Student s = session1.load(Student.class, 11); 
//		  s.setName("Mubasheer"); 
//		  session1.merge(s);
//		  session1.flush(); 
//		  session1.getTransaction().commit(); 
//		  session1.close();
//      //deletion
//		Session session2 = sessionFactory.openSession();
//		session2.beginTransaction();
//		session2.find(Student.class, 10);
//		Student stu1 = session2.load(Student.class, 10);
//		session2.delete(stu1);
//		session2.flush();
//		session2.getTransaction().commit();
//		session2.close();
//
//		Session sessionObj = sessionFactory.openSession();
//		 Query q = sessionObj.createQuery("from Student s where marks<200");
//		List<Student> list = new ArrayList<>();
//		list = q.list();
//		Iterator<Student> listiterator = list.iterator();
//		while (listiterator.hasNext()) {
//			System.out.println(listiterator.next());
//		}
//		
//		Criteria c=sessionObj.createCriteria(Student.class);
//		c.setProjection(Projections.property("name"));
//		List<String> list1 = new ArrayList<>();
//		list1 = c.list();
//		for(String s: list1)
//		{
//			System.out.println(s);
//		}
//	}
		  Query query=session.create
}
}
