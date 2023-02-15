package com.techpalle.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.Student;


@WebServlet("/My")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//read the data given by user
		
		String n=request.getParameter("tbName");
		String e=request.getParameter("tbEmail");
		String[] q=request.getParameterValues("chkqual");
		String p=request.getParameter("pass");
		long mob=Long.parseLong(request.getParameter("tbPhone"));
		
		
		//calling the insertStudent method and pass the above value as input
		//DataAccess.insertStudent(n, e, Arrays.deepToString(q), p);
		Student stu=new Student(n,e,Arrays.deepToString(q),p,mob);
		DataAccess.insertStudent(stu);
		
		
		response.getWriter().append("<h1>Data is inserted....<h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
