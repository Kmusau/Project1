package com.exampleone.springboot.assignmentone;

public class Students {

	private String fname; 
	private String lname; 
	private int idnum; 
	private String course;
	
	public Students(){
		
	}
	
	public Students(String fname, String lname) {
		super();
		this.fname=fname;
		this.lname=lname;
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getIdnum() {
		return idnum;
	}
	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	} 
	
}
