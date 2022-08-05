package com.example.demo;

import org.springframework.stereotype.Component;

//Another component -- Xstream internet provider -- POJO Class -- Method switchOn()
@Component("Jio")

public class Jio {
	
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
	
	public void switchOn() {
		System.out.println("Switching on Jio.");
	}
}
