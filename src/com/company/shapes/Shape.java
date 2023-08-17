package com.company.shapes;

public class Shape {
	private String color;

	public Shape(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.println(String.format("Shape is drawing with %s color", color));
	}
	
	protected void foo() {
		
	}
}
