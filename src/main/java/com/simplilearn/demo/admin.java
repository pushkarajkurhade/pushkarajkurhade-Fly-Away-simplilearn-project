package com.simplilearn.demo;



public class admin {
private long ID;
private String name;
private String password;
public admin(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public admin() {
	super();
	// TODO Auto-generated constructor stub
}


}