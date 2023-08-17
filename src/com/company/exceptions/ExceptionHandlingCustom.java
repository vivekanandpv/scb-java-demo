package com.company.exceptions;

public class ExceptionHandlingCustom {
	public static void main(String[] args) {
		try {
			System.out.println(f(0));
			System.out.println(f(9));
		} catch (ArithmeticException ae) {
			System.out.println(String.format("ArithmeticException caught in main(): %s", ae.getMessage()));
		} catch (RecordNotFoundException e) {
			System.out.println(String.format("RecordNotFoundException caught in main(): %s", e.getMessage()));
		}
	}
	
	public static int f(int x) {
		if (x == 0) {
			throw new RecordNotFoundException("Record not found..!");
		}
		
		return 15/0;
	}
}
