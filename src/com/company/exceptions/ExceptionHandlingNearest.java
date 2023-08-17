package com.company.exceptions;

public class ExceptionHandlingNearest {
	public static void main(String[] args) {
		try {
			System.out.println(f());
		} catch (ArithmeticException ae) {
			System.out.println(String.format("Exception caught in main(): %s", ae.getMessage()));
		}
		
	}
	
	public static int f() {
		return g();
	}

	private static int g() {
		try {
			return h();
		} catch (ArithmeticException ae) {
			System.out.println(String.format("Exception caught in h(): %s", ae.getMessage()));
			throw ae;	//	rethrow the original exception
		}
	}

	private static int h() {
		return 15/0;
	}
}
