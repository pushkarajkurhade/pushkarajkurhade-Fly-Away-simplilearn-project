package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/UserInfo")
public class FetchDataServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		//read html type and syntax
		resp.setContentType("text/html");
		
		SessionFactory factory=HibernateUtil.getSessionfactory();
		Session session=factory.openSession();
		
		List<SearchTravelServlet>list=session.createQuery("from SearchTravelServlet").list();
		
		for(SearchTravelServlet p: list) {
			out.print("<br>--------------------------------------------------"+"<br>");
			out.print("<b>Id:</b> "+p.getID()+"<br>");
			out.print("<b>Source:</b> "+p.getSource()+"<br>");
			out.print("<b>Destination:</b> "+p.getDestination()+"<br>");
			out.print("<b>Date:</b> "+p.getDdate()+"<br>");
			out.print("*************<b>Prrsonal Details</b>*************"+"<br>");
			
		}
			
		List<PersonalDetails>listt=session.createQuery("from PersonalDetails").list();
		
		for(PersonalDetails c: listt) {
			out.print("<br>--------------------------------------------------"+"<br>");
			out.print("<b>Name:</b> "+c.getMyName()+"<br>");
			out.print("<b>Age:</b> "+c.getMyAge()+"<br>");
			out.print("<b>Adress:</b> "+c.getMyAdress()+"<br>");
			out.print("<b>Email:</b> "+c.getEmail()+"<br>");
			
		
		out.print("<br>--------------------------------------------------"+"<br>");
		
	}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
