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

@WebServlet("/destino.do")
public class DestinosServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException
	{
		// Data Mock
		
		ArrayList<Destinos> db = new ArrayList<Destinos>();
		
		db.add(new Destinos(1, "Lucífer", "Los Angeles", "Estados Unidos", "USD", "Avião", "./assets/images/lucifer.jpg", "./assets/images/la.jpg", "https://www.youtube.com/embed/Jmn8pLnNvF0", "220 Volts", "Visa required", "A história de Lucífer se passa em Los Angeles.\n"
				+ "		Quando o anjo caído, filho de Deus, o diabo, fica entedeado no inferno e decide tirar umas férias em Los Angeles,\n"
				+ "		durante a trama ele conhece a detetive Chloe, dentre tantas surpresas, o que o diabo não esperava seria se apaixonar pela detetive. Lucifer é uma série de fantasia e investigação policial com elementos cômicos e sobrenaturais, baseada nos quadrinhos do selo Vertigo (uma divisão da DC Comics)."));
		
		db.add(new Destinos(2, "O Negócio", "São Paulo", "Brasil", "BRL", "Avião", "./assets/images/series/o-negocio1.png", "./assets/images/la.jpg", "https://www.youtube.com/embed/Jmn8pLnNvF0", "220 Volts", "RG", "Short Description"));
		
		db.add(new Destinos(3, "Soltos em Floripa", "Florianópolis", "Brasil", "BRL", "Avião", "./assets/images/soltos-em-floripa.jpg", "./assets/images/la.jpg", "https://www.youtube.com/embed/Jmn8pLnNvF0", "220 Volts", "RG", "Short Description"));
		
		// Get request parameter
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		// Logic Find
		
		Destinos result = null;
		ArrayList<Destinos> listDest = db;
		
		for (Destinos name : db) {
			if (name.getId() == id) {
				result = name;
				break;
			}
		}
		
		// Return to frontend
		
		String pageRedirect = "";
		if (result != null) {
			request.setAttribute("Destinos", result);
			pageRedirect = "/destinos.jsp";
		} else {
			request.setAttribute("Destinos", listDest);
			pageRedirect = "/list-destino.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pageRedirect);
		dispatcher.forward(request, response);
		
	}
}
