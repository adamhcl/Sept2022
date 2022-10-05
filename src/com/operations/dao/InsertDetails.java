package com.operations.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertDetails")
public class InsertDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Jdbc Connection
		try {
			Class.forName(DbUtil.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {
			Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
			System.out.println("connection successful");
			
			// Query/statement to insert the values
			PreparedStatement st = conn.prepareStatement("insert into product values(?, ?, ?, ?)");

			// set values into the query
			st.setInt(1, Integer.valueOf(request.getParameter("id")));
			st.setString(2, request.getParameter("name"));
			st.setString(3, request.getParameter("price"));
			st.setString(4, request.getParameter("category"));

			// Execute the query
			st.executeUpdate();

			st.close();
			conn.close();

			// Redirect the response to success page
			response.sendRedirect("Success.jsp?msg=Insert");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
