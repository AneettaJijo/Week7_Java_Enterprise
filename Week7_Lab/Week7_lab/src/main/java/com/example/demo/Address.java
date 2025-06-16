package com.example.demo;

public class Address {
	
	private String no;
    private String street;
    private String city;
    
    
	public Address() {
		super();
		
	}
	
	
	public Address(String no, String street, String city) {
		this.no = no;
		this.street = street;
		this.city = city;
	}
	
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    


}
