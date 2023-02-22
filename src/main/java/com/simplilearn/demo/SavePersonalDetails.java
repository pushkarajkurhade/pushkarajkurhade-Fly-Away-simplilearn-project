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

@WebServlet("/detailss")
public class SavePersonalDetails extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		
		String myName=req.getParameter("myName");
	    String myAge=req.getParameter("myAge");
	    String myAdress=req.getParameter("myAdress");
	    String email=req.getParameter("email");
	    
	    PersonalDetails flightDetails=new PersonalDetails( 0, myName,myAge, myAdress,email);
	    
	    SessionFactory factory= HibernateUtil.getSessionfactory();
		Session session= factory.openSession();
		
		Transaction tx=session.beginTransaction();
		 session.save(flightDetails);
		 
		 tx.commit();
		 System.out.println("Data Added Successfully");
		 session.close();
		 resp.sendRedirect("welcome.html");
	

		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	
}
