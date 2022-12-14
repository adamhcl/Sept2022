package com.saran.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {



   public static void main(String[] args)  {
        // try with resources block
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
                PreparedStatement pst =



                       con.prepareStatement(
                                "create table student(sno numeric(10),sname varchar(50),saddress varchar(100),primary key(sno))")) {
        
            pst.execute();
            
            PreparedStatement pst4=con.prepareStatement("insert into student(sno,sname,saddress) values(?,?,?)");
            pst4.setInt(1, 444);
            pst4.setString(2, "Amar");
            pst4.setString(3, "Palo Alto");
            PreparedStatement pst2=con.prepareStatement("insert into student(sno,sname,saddress) values(?,?,?)");
                
            pst2.setInt(1, 222);
            pst2.setString(2, "Rebecca");
            pst2.setString(3, "SantClara");
            
         
            
            
            
            int x=pst2.executeUpdate();int y=pst4.executeUpdate();
            
            
            System.out.println(x+" rows created");
           System.out.println(y+" rows created");
            
            PreparedStatement pst3=con.prepareStatement("select * from student");
            ResultSet rs1=pst3.executeQuery();
            while(rs1.next()) {
            	int studentnumber=rs1.getInt(1);
            	String studentname=rs1.getString(2);
            	String studentaddress=rs1.getString(3);
            	System.out.print(studentnumber);
            	System.out.print(studentname);;
            	System.out.println(studentaddress);
            }
            



       }catch(SQLException e) {e.printStackTrace();}



   }



}