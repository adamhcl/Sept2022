package com.saran.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcAssignment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022","root","root");
		System.out.println("Successfully Connected");
		
		//Insert Employee Record into database
		Statement st=con.createStatement();
		//Create emp (employee) table
		//st.execute("create table emp(eno numeric(10),ename varchar(50),esal numeric(10),primary key(eno))");
		
		
		//Read User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		String ename = sc.nextLine();
		System.out.println("Enter employee ID: ");
		int eno = sc.nextInt();
		System.out.println("Enter employee salary: ");
		int esal = sc.nextInt();
		
		//st.execute("delete from emp where eno = 104");
		//st.execute("delete from emp where eno = 105");
		//st.execute("delete from emp where eno = 106");
		
		st.execute("insert into emp values('"+eno+"','"+ename+"','"+esal+"')");
		System.out.println("Employee data has been added!");
		
		
		//Update Employee Record
		st.execute("update emp set esal=12345 where eno = ('"+eno+"')");
		System.out.println("Employee data has been updated!");
		
		
		//Read Employee Records
		ResultSet rs=st.executeQuery("Select * From emp");
		while(rs.next()) {			
			System.out.println("Employee ID: " + rs.getInt("eno"));
			System.out.println("Employee Name: " + rs.getString(2));
			System.out.println("Employee Salary: " + rs.getInt("esal"));
			System.out.println("\n");			
		}
		
		//Delete Employee record
		st.execute("delete from emp where ename = ('"+ename+"')");
		System.out.println("Employee data has been deleted!");
		
	}
}