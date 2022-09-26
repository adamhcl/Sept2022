package com.saran.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestMySQL {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022","root","root");
		Statement st=con.createStatement();
		
		//Creating a table
		//st.execute("create table emp(eno numeric(10),ename varchar(50),esal numeric(10),primary key(eno))");
		//Inserting values
		//st.execute("insert into emp values(100,'Rebeka',12345)");
		//st.execute("insert into emp values(101,'Jaiden',54321)");
		//st.execute("insert into emp values(102,'Jeathon',22222)");
		//st.execute("insert into emp values(103,'Adem',44444)");
		//st.execute("insert into emp values(104,'Dumme',44444)");
	
		//Scanner sc= new Scanner(System.in);
		
		//updating table by making esal = 3333 if eno is = 102 in the table
		//st.execute("update emp set esal=33333 where eno=102");
		//updates table by deleting emp (employee) if eno = 104 
		//st.execute("delete from emp where eno=104");
		//Setting rs to select all of the data from emp
		//ResultSet rs=st.executeQuery("Select * From emp");
		
		
		ResultSet rs=st.executeQuery("Select * From student");
		while(rs.next()) {
			
			//Printing out text and data
			//System.out.println("Emp No "+rs.getInt("eno"));
			//System.out.println("Emp Name "+rs.getString(2));
			//System.out.println("Emp Sal "+rs.getInt("esal"));
			System.out.println("student number: "+rs.getInt("sno"));
			System.out.println("student name: "+rs.getString("sname"));
			System.out.println("student address: "+rs.getString("saddress"));
			System.out.println("\n");
			
		}
	
	}

}
