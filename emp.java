package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	
    @Autowired
    @Qualifier("temp2")
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
