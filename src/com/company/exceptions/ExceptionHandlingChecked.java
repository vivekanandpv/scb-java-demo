package com.company.exceptions;

public class ExceptionHandlingChecked {
	public static void main(String[] args) {
		try {
			System.out.println(f(0));
			System.out.println(f(9));
		} catch (ArithmeticException ae) {
			System.out.println(String.format("ArithmeticException caught in main(): %s", ae.getMessage()));
		} catch (Exception e) {
			System.out.println(String.format("Exception caught in main(): %s", e.getMessage()));
		}
	}
	
	public static int f(int x) throws Exception {
		if (x == 0) {
			throw new Exception("Zero is not allowed");
		}
		
		return 15/0;
	}
}
