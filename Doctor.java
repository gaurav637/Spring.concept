package com.spring1;


public class Doctor {
	
	private int id;
	
	private String name;
	
	
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
	
	public Doctor() {
		super();
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + "]";
	}

}
