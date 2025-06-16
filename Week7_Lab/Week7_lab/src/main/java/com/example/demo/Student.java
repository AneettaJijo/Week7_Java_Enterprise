package com.example.demo;

import java.util.Date;


public class Student {

	private int studentID;
	    private String fname;
	    private String lname;
	    private String phone;
	    private String dob;
	    private Address address;
	    
	    
		public Student() {
			super();
		}
		
		
		public Student(int studentID, String fname, String lname, String phone, String dob, Address address) {
		
			this.studentID = studentID;
			this.fname = fname;
			this.lname = lname;
			this.phone = phone;
			this.dob = dob;
			this.address = address;
		}
		public int getStudentID() {
			return studentID;
		}
		public void setStudentID(int studentID) {
			this.studentID = studentID;
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
	    
		
	    
}
	    
	    
	   