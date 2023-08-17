package com.company.staticvar;

public class Program {

	public static void main(String[] args) {
		Person p1 = new Person("Amrit");
		
		System.out.println(Person.getCounter());
		
		Person p2 = new Person("Rajan");
		
		System.out.println(Person.getCounter());
		
		Person p3 = new Person("Pranesh");
	
		System.out.println(Person.getCounter());
	}

}
