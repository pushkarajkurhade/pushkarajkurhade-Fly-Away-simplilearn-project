package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/procced")
public class ProccedToDetails extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		
		String source=req.getParameter("source");
	    String destination=req.getParameter("destination");
	    String ddate=req.getParameter("ddate");
	    
	    SearchTravelServlet searchTravelServlet=new SearchTravelServlet(source,destination, ddate);
	    
	    SessionFactory munna= HibernateUtil.getSessionfactory();
		Session session= munna.openSession();
		
		Transaction tx=session.beginTransaction();
		 session.save(searchTravelServlet);
		 
		 tx.commit();
		 System.out.println("Data Added Successfully");
		 session.close();
		 

		 resp.sendRedirect("PersonalDetails.html");
			}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	
}
	