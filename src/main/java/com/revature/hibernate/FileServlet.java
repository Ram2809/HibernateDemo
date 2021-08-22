package com.revature.hibernate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileServlet
 */
@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		  maxFileSize = 1024 * 1024 * 10,      // 10 MB
		  maxRequestSize = 1024 * 1024 * 100   // 100 MB
		)

public class FileServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Integer id=Integer.parseInt(request.getParameter("id"));
		String userName=request.getParameter("name");
		Part filePart=request.getPart("uploadfile");
		String fileName=filePart.getSubmittedFileName();
		System.out.println(id+" "+userName+" "+fileName);
		FileModel fileModel=new FileModel();
		File file=new File(fileName);
		FileInputStream fileInputStream=null;
		byte imageArray[]=new byte[(int)fileName.length()];
		try {
			fileInputStream=new FileInputStream(file);
			fileInputStream.read(imageArray);
			fileInputStream.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		fileModel.setId(id);
		fileModel.setUserName(userName);
		fileModel.setImage(imageArray);
		FileTest fileTest=new FileTest();
		boolean status=false;
		status=fileTest.addImage(fileModel);
		System.out.println(status);
		boolean getStatus=fileTest.get(id);
		System.out.println(getStatus);
	}

}
