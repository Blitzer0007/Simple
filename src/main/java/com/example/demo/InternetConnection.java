package com.example.demo;

import org.springframework.stereotype.Component;

//Another component -- General internet provider -- POJO Class -- 2 Methods switchOn()
@Component("AAA")
public class InternetConnection {
	private String ipAddress;
	private int speed;
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void switchOn1() {
		System.out.println("Switching on Xstream G.");
	}
	
	public void switchOn2() {
		System.out.println("Switching on Jio G.");
	}
}
