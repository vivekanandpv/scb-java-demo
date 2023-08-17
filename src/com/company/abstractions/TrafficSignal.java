package com.company.abstractions;

public class TrafficSignal {

	public static void main(String[] args) {
		Vehicle[] vehicles = {new Car("KA01MX0101"), new Motorcycle("KA02JR0202")};
		
		for (Vehicle v: vehicles) {
			v.turnLeft();
		}
	}
}
