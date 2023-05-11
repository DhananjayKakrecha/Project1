package com.data;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbOperation.*;
/**
 * Servlet implementation class ShowData
 */
@WebServlet("/ShowData")
public class ShowData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		
		ResultSet resultSet = DatabaseOperation.showData(fname);
		
		try {
			resultSet.next();
			for(int i=1;i<=5;i++) {
				System.out.println(resultSet.getString(i));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
