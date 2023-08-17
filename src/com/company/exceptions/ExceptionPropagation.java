package com.company.exceptions;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println(f());
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
