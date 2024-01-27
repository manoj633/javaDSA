package com.java.patterns;

public class RhombusPattern {

	public static void main(String[] args) {

		int n = 5; // Number of lines

		for (int row = 1; row <= n; row++) {
			for (int column = 1; column <= 2 * n - 1; column++) {
				if (column >= row && column <= n+row-1 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
