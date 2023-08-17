package com.company;

public class Sample {
	private int counter;
	private static double p;
	private static String name;
	
	static {
		p = 5.69;
		name = "Hello";
	}
	
	
	
	public Sample(int counter) {
		this.counter = counter;
	}



	public void foo() {
		System.out.println(counter);
		System.out.println(p);
		baz();
	}
	
	public static void bar() {
//		System.out.println(counter);
//		foo();
		System.out.println(p);
		baz();
	}
	
	public static void baz() {
//		System.out.println(counter);
	}
}
