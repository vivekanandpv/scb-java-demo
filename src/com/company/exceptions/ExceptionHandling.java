package com.company.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println(f());
		} catch (ArithmeticException ae) {
			System.out.println(String.format("Exception caught: %s", ae.getMessage()));
		}
		
	}
	
	public static int f() {
		return g();
	}

	private static int g() {
		return h();
	}

	private static int h() {
		return 15/0;
	}

}
