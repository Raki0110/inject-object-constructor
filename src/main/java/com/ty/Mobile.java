package com.ty;

public class Mobile {
	private String name;
	private String model;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public Mobile(String name, String model) {
		this.name = name;
		this.model = model;
	}
	public void ring() {
		System.out.println(name+model+" Mobile is Ringing");
	}

}
