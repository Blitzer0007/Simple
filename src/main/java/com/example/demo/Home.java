package com.example.demo;

import org.springframework.stereotype.Component;

//To create obj in JVM spring container to connect -- default singleton
@Component
//@Scope(value="prototype") //Multi bean to create 2 obj in spring conatainer
public class Home {
	
	public Home() {
		System.out.println("Home Constructor");
	}
	
	
	//POJO class
	private String owner;
	private int doorNo;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void connection() {
		System.out.println("Connecting to internet!!");
	}
}
