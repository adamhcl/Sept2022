package com.operations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateDetails")
public class UpdateDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName(DbUtil.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {
			Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
			System.out.println("connection successful");
			PreparedStatement st = conn
					.prepareStatement("update employeedetails set empFirst=?, empLast=?, empAddress=? where empId=?");

			st.setString(1, request.getParameter("first"));
			st.setString(2, request.getParameter("last"));
			st.setString(3, request.getParameter("address"));
			st.setInt(4, Integer.valueOf(request.getParameter("id")));

			st.executeUpdate();

			st.close();
			conn.close();

			response.sendRedirect("Success.jsp?msg=Update");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
