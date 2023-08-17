package com.company.staticvar;

public class Person {
	private static int counter = 0;
	private final String name;	//	can only be assigned once; either here or in the constructor
	
	public Person(String name) {
		this.name = name;
		++counter;
	}

	public static int getCounter() {
		return counter;
	}

	public String getName() {
		return name;
	}
	
//	Setter doesn't work for a final field
//	public void setName(String name) {
//		this.name = name;
//	}
}
