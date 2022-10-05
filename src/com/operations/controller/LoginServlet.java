package com.operations.controller;



import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.operations.model.LoginBean;  

//Controller must be a servlet-> has model and view
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String username=request.getParameter("username");  
        String password=request.getParameter("password");  
          
        LoginBean bean=new LoginBean();  
        bean.setUsername(username);  
        bean.setPassword(password);  
        request.setAttribute("bean",bean);  
          
        boolean status=bean.validate();  
          
        if(status){  
            RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            rd.forward(request, response);  
        }  
      
    }  
  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }  
}  
