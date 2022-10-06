package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destinos;

@WebServlet("/listDestinity")
public class ListDestinyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException
		{
		
			// Return to frontend
			
			String pageRedirect = "/list-destino.jsp";
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pageRedirect);
			dispatcher.forward(request, response);
			
		}
}
