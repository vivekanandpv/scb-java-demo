package com.company.userinput;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String name = scanner.next();
			int age = scanner.nextInt();
			double height = scanner.nextDouble();
			double weight = scanner.nextDouble();
			
			System.out.println(String.format("Hello, %s; you are %d years old, %.2f cm tall, and weigh %.2f kg", name, age, height, weight));
		}
	}

}
