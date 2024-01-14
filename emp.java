package com.spring2.autowired;

public class emp {
	
	private Address address;
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public emp() {
		super();
	}
	
	public emp(Address address) {
		super();
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}
	
    
}
