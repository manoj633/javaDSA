package com.java.patterns;

public class BasicTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int line = 1; line <= 4; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
