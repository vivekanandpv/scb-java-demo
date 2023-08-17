package com.company.strings;

public class StringPlayground {
	public static void main(String[] args) {
		// Case conversion
		String city = "bengaluru";

		String cityU = city.toUpperCase();
		String cityL = city.toLowerCase();

		// Stripping and trimming
		String color = "   blue    ";
		String leftStrip = color.stripLeading();
		String rightStrip = color.stripTrailing();
		String colorStripAll = color.strip();
		String colorTrimAll = color.trim();

		// Substring
		String word = "education";
		String sub1 = word.substring(3);
		String sub2 = word.substring(3, 6);
		
		//	Splitting
		String log = "hi;hello;good morning;bye";
		String[] parts1 = log.split(";");
		String[] parts2 = log.split(";", 2);
		
		//	Character indexing
		char lc = log.charAt(5);
		int firstLIndex = log.indexOf('l');
		int lastNIndex = log.lastIndexOf('n');
		
		//	Searching and regular expressions
		boolean llExists = log.contains("ll");
		boolean isAlphaNumeric = "ABCD1234".matches("^[A-Z]{4}[0-9]{4}$");
		
		//	Equality
		boolean equalsIgnoreCase = "InDiA".equalsIgnoreCase("india");
		boolean equals = "onlooker".equals("Onlooker");
	}
}
