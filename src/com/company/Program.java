package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Shape;

public class Program {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello";
		String s4 = "Hello";
		
		System.out.println(s1 == s2);
		
		s2 = new String("Hello");
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
	}
}
