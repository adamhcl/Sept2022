package com.operations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectDetails")
public class SelectDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName(DbUtil.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		try {

			int id = 0;
			String first = "", last = "", address = "";

			Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
			System.out.println("connection successful");
			PreparedStatement st = conn.prepareStatement("select * from employeedetails where empId=?");

			st.setInt(1, Integer.valueOf(request.getParameter("id")));

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				id = rs.getInt(1);
				first = rs.getString(2);
				last = rs.getString(3);
				address = rs.getString(4);

			}

			rs.close();
			st.close();
			conn.close();

			response.sendRedirect("Result.jsp?id=" + id + "&first=" + first + "&last=" + last + "&address1=" + address);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
