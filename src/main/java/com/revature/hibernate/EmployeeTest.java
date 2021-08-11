package com.revature.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		/*Employee e=new Employee();
		e.setEmpId(201);
		e.setName("Kavi");
		Employee e2=new Employee();
		e2.setEmpId(999);
		e2.setName("Jayakumar");
		try
		{
			session.beginTransaction();
			session.save(e);
			session.save(e2);
			session.getTransaction().commit();
			System.out.println("inserted");
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}*/
//		List<Integer> idList=new ArrayList<>();
//		Query q=session.getNamedQuery("selectId");
//		idList=q.list();
//		for(Integer ele : idList)
//		{
//			System.out.println(ele);
//		}
//		List<String> nameList=new ArrayList<>();
//		Query q1=session.getNamedQuery("selectName");
//		nameList=q1.list();
//		for(String ele : nameList)
//		{
//			System.out.println(ele);
//		}
		/*Criteria c=session.createCriteria(Employee.class);
		c.add(Restrictions.eq("empId", 101));
		List<Integer> eqResult=c.list();
		System.out.println(eqResult);
		//eq,gt,lt,like,ilike,isNull,isNotNull,isEmpty,isNotEmpty
		c.setFirstResult(1);
		List<Employee> pageList=c.list();
		for(Employee emp:pageList)
		{
			System.out.println(emp.getEmpId()+" "+emp.getName());
		}
		c.addOrder(Order.asc("empId"));
		List<Employee> pageList=c.list();
		for(Employee emp:pageList)
		{
			System.out.println(emp.getEmpId()+" "+emp.getName());
		}
		c.setProjection(Projections.property("empId"));
		List<Integer> id1List=new ArrayList<>();
		id1List=c.list();
		for(Integer ele : id1List)
		{
			System.out.println(ele);
		}*/
		/*Query q=session.createQuery("Update Employee set emp");
		q.setParameter("empId", 101);
		List<Employee> empList=new ArrayList<>();
		empList=q.list();
		for(Employee e : empList)
		{
			System.out.println(e);
		}*/
		Query q=session.createQuery("Select sum(empId) from Employee e");
		List<Integer> sumList=q.list();
		System.out.println(sumList);
	}

}
 