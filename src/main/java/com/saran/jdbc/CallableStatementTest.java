package com.saran.jdbc;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class CallableStatementTest {



   public static void main(String[] args) throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
                CallableStatement cst =    con.prepareCall("{call getEmp(?,?,?)}")) {
                cst.setInt(1, 101);
                cst.registerOutParameter(2, java.sql.Types.VARCHAR);
                cst.registerOutParameter(3, java.sql.Types.VARCHAR);
                cst.executeUpdate();



           String empName = cst.getString(2);
            String empAddress = cst.getString(3);
            System.out.println(empName);
            System.out.println(empAddress);



       }



   }



}
