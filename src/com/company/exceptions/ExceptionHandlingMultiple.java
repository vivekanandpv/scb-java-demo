package com.company.exceptions;

public class ExceptionHandlingMultiple {
	public static void main(String[] args) {
		try {
			System.out.println(f(0));
			System.out.println(f(9));
		} catch (ArithmeticException ae) {
			System.out.println(String.format("ArithmeticException caught in main(): %s", ae.getMessage()));
		} catch (IllegalArgumentException iae) {
			System.out.println(String.format("IllegalArgumentException caught in main(): %s", iae.getMessage()));
		}
		
	}
	
	public static int f(int x) {
		if (x == 0) {
			throw new IllegalArgumentException("Zero is not allowed");
		}
		
		return 15/0;
	}
}
