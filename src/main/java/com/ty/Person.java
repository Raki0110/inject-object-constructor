package com.ty;

public class Person {
	private Mobile mobile;
	
	public Person(Mobile mobile) {
		this.mobile = mobile;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void use() {
		System.out.println("Person is Using Mobile");
		mobile.ring();
	}
	
	

}
