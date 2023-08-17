package com.company.abstractions;

public class Car extends Vehicle {

	public Car(String registrationNumber) {
		super(registrationNumber);
	}

	@Override
	public void turnLeft() {
		System.out.println(String.format("Car %s is taking the left turn", getRegistrationNumber()));
	}

	@Override
	public void turnRight() {
		System.out.println(String.format("Car %s is taking the right turn", getRegistrationNumber()));
	}
}
