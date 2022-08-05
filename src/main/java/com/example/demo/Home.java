package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	//To connect General internet provider in home 
	@Autowired
	@Qualifier("AAA")
	private InternetConnection modem;
	
	
	//private Jio modem2;
	
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
	
	//Accessing methods of InternetConnection file modem.switchOn();
	public void connection() {
		modem.switchOn1();
		modem.switchOn2();
	//	modem2.switchOn();
		System.out.println("Connecting to internet!!");
	}
}
