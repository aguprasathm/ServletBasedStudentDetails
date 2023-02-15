package com.techpalle.dao;

import java.sql.*;

import com.techpalle.model.Student;


public class DataAccess
{
	public static Connection con=null;
	public static PreparedStatement ps=null;
	public static void insertStudent(Student s)
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agu","root","admin");
			String qry="insert into students(name,email,subject,password,mobile) values(?,?,?,?,?)";
			ps=con.prepareStatement(qry);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getSubject());
			ps.setString(4, s.getPassword());
			ps.setLong(5, s.getMobile());
			
			ps.executeUpdate();
		} 
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
				try
		        {
					ps.close();
				} 
			    catch (SQLException e1) 
			    {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if(con!=null)
				try
			    {
					con.close();
				} 
			    catch (SQLException e1) 
			    {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		
	}
}
