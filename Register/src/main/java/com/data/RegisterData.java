package com.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbOperation.*;
/**
 * Servlet implementation class RegisterData
 */
@WebServlet("/RegisterData")
public class RegisterData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body><center>");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mail = request.getParameter("mail");
		String address = request.getParameter("address");
		String mobnum = request.getParameter("mobnum");
		
		int i = DatabaseOperation.insertData(fname, lname, mail, address, mobnum);
		if(i==1) {
			System.out.println("Registered");
			out.println("<h1>Registeration Done!!</h1>");
			out.println("<a href='index.html'>Home</a>");
		}
		else {
			System.out.println("Unsuccessful");
			out.println("<h1>Unsuccessful</h1>");
			out.println("<a href='index.html'>Home</a>");
		}
		out.println("</center></body></html>");
	}

	

}
