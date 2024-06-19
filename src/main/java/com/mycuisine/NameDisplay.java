package com.mycuisine;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NameDisplay")
public class NameDisplay extends HttpServlet {
     
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name="rooney";
		Student s=new Student("rooney",1);
		request.setAttribute("Student",s);
	
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
	}

	

}
