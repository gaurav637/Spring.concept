package com.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Student {
	
	@Value("91491026")
	private int pin;

	@Override
	public String toString() {
		return "Student [pin=" + pin + "]";
	}
	
	
	

}
