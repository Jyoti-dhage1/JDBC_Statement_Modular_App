package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdao {
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");	
		Statement s = c.createStatement();
		s.executeUpdate("insert into student values(10,'ramesh','Nagar','India')");
		System.out.println("Inserted");
	}
	
	public void deleteData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");	
		Statement s = c.createStatement();
		s.executeUpdate("delete from student where sid=7");
		System.out.println("Deleted");
		
	}
	
	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");	
		Statement s = c.createStatement();
		s.executeUpdate("update student set sname='Rahul'where sid=8");
		System.out.println("updated");
	}
	
	public void fetchData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");	
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		System.out.println("Fetched Student data");
	}

}
