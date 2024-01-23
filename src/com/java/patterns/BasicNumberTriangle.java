package com.java.patterns;

public class BasicNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLines = 4;
		
		for(int line = 1; line <=numberOfLines; line++) {
			for(int number = 1; number <= line; number++) {
				System.out.print(number);
			}
			System.out.println();
		}
	}

}
