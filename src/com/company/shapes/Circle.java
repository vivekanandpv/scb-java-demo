package com.company.shapes;

public class Circle extends Shape {
	public Circle(String color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.println("Circle is drawing...");
	}
	
	@Override
	public void foo() {
		
	}
}
