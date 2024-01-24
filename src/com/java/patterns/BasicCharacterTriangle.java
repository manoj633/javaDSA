package com.java.patterns;

public class BasicCharacterTriangle {

	public static void main(String[] args) {
		
		int n = 5; // Number of lines
		int ch = 64;
		
		for(int line = 1; line <= n; line++) {
			for(int charcter = 1; charcter <= line; charcter++) {
				ch++;
				System.out.print((char)ch);
			}
			System.out.println();
		}
	}
}

