package com.revature.hibernate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ImageTest {
	public static void main(String[] args) throws IOException
	{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		/*FileModel file=new FileModel("C:\\Users\\RamkumarC\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\HibernateDemo\\src\\main\\java\\com\\revature\\hibernate\\reportanime.jpg");
		byte[] byteImage=new byte[(int)file.length()];
		try {
		FileInputStream fileInputStream=new FileInputStream(file);
		fileInputStream.read(byteImage);
		fileInputStream.close();
		Image image=new Image();
		image.setImageId(101);
		image.setUserName("Ram");
		image.setImage(byteImage);
		session.beginTransaction();
		session.save(image);
		session.getTransaction().commit();
		System.out.println("Inserted successfully");
		}
		catch(IOException| HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}*/
		Image image1=session.get(Image.class, 101);
		byte[] byteImage=image1.getImage();
		File f1=new File("C:\\Users\\RamkumarC\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\HibernateDemo\\src\\main\\java\\com\\revature\\hibernate\\reportanime1.jpg");
		FileOutputStream fos=new FileOutputStream(f1);
		fos.write(byteImage);
		fos.close();
	}
}
