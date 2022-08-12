package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDApp {

	public static void main(String[] args) {
		try {
		//Step-1 Register the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step-2 Connect to Driver
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","upendra","Uppu@2018");
			
			//For MySql 
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stuent","root","root");
		
			//Creating the table
			String sql1="create table emp1(id number, name varchar2(30))";
			
			//Inserting a record 
			String sql2="insert into emp1 values(1,'Ajay')";
			
			//Update the record
			String sql3="update emp1 set name='Srikanth' where id=1";
			
			//Delete the record
			String sql4="delete from emp1 where id=1";
			
		//Step-3
			Statement stmt=con.createStatement();
			
//			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
//			stmt.executeUpdate(sql3);
//			stmt.executeUpdate(sql4);
			
			System.out.println("Success");
			ResultSet rs=stmt.executeQuery("select * from emp1");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
