package com.simplilearn.demo;

public class PersonalDetails {
  private long ID;
  private String myName;
  private String myAge;
  private String myAdress;
  private String email;
public PersonalDetails(int idp, String myName, String myAge, String myAdress, String email) {
	super();
	
	this.myName = myName;
	this.myAge = myAge;
	this.myAdress = myAdress;
	this.email = email;
}





public long getID() {
	return ID;
}





public void setID(long iD) {
	ID = iD;
}





public String getMyName() {
	return myName;
}
public void setMyName(String myName) {
	this.myName = myName;
}
public String getMyAge() {
	return myAge;
}
public void setMyAge(String myAge) {
	this.myAge = myAge;
}
public String getMyAdress() {
	return myAdress;
}
public void setMyAdress(String myAdress) {
	this.myAdress = myAdress;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


public PersonalDetails() {
	super();
	// TODO Auto-generated constructor stub
}
  
  

}