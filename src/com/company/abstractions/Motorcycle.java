package com.company.abstractions;

public class Motorcycle extends Vehicle {

	public Motorcycle(String registrationNumber) {
		super(registrationNumber);
	}

	@Override
	public void turnLeft() {
		System.out.println(String.format("Motorcycle %s is taking the left turn", getRegistrationNumber()));
	}

	@Override
	public void turnRight() {
		System.out.println(String.format("Motorcycle %s is taking the right turn", getRegistrationNumber()));
	}
}
