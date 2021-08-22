package com.revature.hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		/*CustomerEntity c1=new CustomerEntity();
		c1.setCustomerId(104);
		c1.setCustomerName("Sandrya");
		c1.setCustomerSalary(300000.10);
		CustomerEntity c2=new CustomerEntity();
		c2.setCustomerId(102);
		c2.setCustomerName("Prem Chander");
		c2.setCustomerSalary(12000.0);
		try
		{
			session.beginTransaction();
			session.save(c1);
			session.save(c2);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}finally { 
			if(session!=null) { 
				session.close(); 
		} 
		}
		 */
		/*Query query1 = session.createSQLQuery("select * from Customer");
		List<Object[]> customerList1 = query1.list();
		CustomerEntity c1=new CustomerEntity();
		for (Object[] clist : customerList1) {
			c1.setCustomerId(Integer.parseInt(clist[0].toString()));
			c1.setCustomerName(clist[1].toString());
			c1.setCustomerSalary(Double.parseDouble(clist[2].toString()));
			System.out.println(c1);
		}
		//hibernate uses ResultSetMetaData to detect which type of query data type coming from the database
		Query query = session.createSQLQuery("select * from Customer").addScalar("customerId", new IntegerType()).addScalar("customerName",new StringType()).addScalar("customerSalary",new DoubleType());
		List<Object[]> customerList = query.list();
		CustomerEntity c=new CustomerEntity();
		for (Object[] clist : customerList) {
			c.setCustomerId(Integer.parseInt(clist[0].toString()));
			c.setCustomerName(clist[1].toString());
			c.setCustomerSalary(Double.parseDouble(clist[2].toString()));
			System.out.println(c);
		}*/
		Query query=session.createQuery("select count(*) from Customer c");
		List<Integer> countList=query.list();
		System.out.println(countList.get(0));
		
	}

}
