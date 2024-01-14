package com.spring.JDBC;

public class Student {
	
	private int id;
	private String name;
	private String city;
	private int rollNo;
	
	public Student() {
		
	}
	
	public Student(int id,String name,String city,int rollNo) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.rollNo = rollNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo =  rollNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", rollNo=" + rollNo + "]";
	}
	
	

}
