package com.revature.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;



public class FileTest {
	public boolean addImage(FileModel fileModel)
	{
		boolean status=false;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		FileEntity fileEntity =FileMapper.mapFileDetails(fileModel);
		try
		{
			session.beginTransaction();
			session.save(fileEntity);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			status=true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return status;
	}
	public boolean get(int userId)
	{
		boolean status=false;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		try
		{
			FileEntity fileEntity=session.get(FileEntity.class, userId);
			byte[] imageArray=fileEntity.getImage();
			File file=new File("C:\\Users\\RamkumarC\\DB\\Retrived\\DB.jpg");
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(imageArray);
			fos.close();
			session.close();
			status=true;
		}
		catch(IOException|HibernateException e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
