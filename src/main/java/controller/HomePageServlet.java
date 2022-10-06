package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomePageServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException
	{		
		// Return to frontend
		
		String pageRedirect = "/homepage.jsp";
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pageRedirect);
		dispatcher.forward(request, response);
		
	}
}
