package com.annotation;

public class Student {
	private String name;
	private Address address;
	
	Student(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCityName()
	{
		return address.getCity();
	}
	
}
