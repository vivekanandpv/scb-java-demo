package com.company.car;

public class Car {
	//	dependency
	private Engine engine;

	//	inverting the dependency
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		//	delegation
		engine.start();
	}
	
	public void stop() {
		//	delegation
		engine.stop();
	}
}
