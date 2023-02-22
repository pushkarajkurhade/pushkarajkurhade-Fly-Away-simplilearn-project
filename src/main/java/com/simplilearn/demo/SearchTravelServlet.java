package com.simplilearn.demo;

public class SearchTravelServlet {

  private long ID;
  private String source;
  private String destination;
  private String ddate;
public SearchTravelServlet(String source, String destination, String ddate) {
	super();
	
	this.source = source;
	this.destination = destination;
	this.ddate = ddate;
}


public long getID() {
	return ID;
}


public void setID(long iD) {
	ID = iD;
}


public String getSource() {
	return source;
}


public void setSource(String source) {
	this.source = source;
}


public String getDestination() {
	return destination;
}


public void setDestination(String destination) {
	this.destination = destination;
}


public String getDdate() {
	return ddate;
}


public void setDdate(String ddate) {
	this.ddate = ddate;
}


public SearchTravelServlet() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
  

