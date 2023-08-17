package com.company.shapes;

public class Rectangle extends Shape {

	public Rectangle(String color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle is drawing...");
	}
}
