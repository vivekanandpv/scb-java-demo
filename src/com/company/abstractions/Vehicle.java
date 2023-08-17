package com.company.abstractions;

public abstract class Vehicle {
	private String registrationNumber;

	public Vehicle(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public abstract void turnLeft();
	
	public abstract void turnRight();
	
	protected String getRegistrationNumber() {
		return registrationNumber;
	}
}
