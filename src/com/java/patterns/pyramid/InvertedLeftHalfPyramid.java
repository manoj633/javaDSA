package com.java.patterns.pyramid;

public class InvertedLeftHalfPyramid {

	public static void main(String[] args) {

		int n = 5; // Number of rows

		for (int row = 1; row <= n; row++) {
			for (int column = 1; column <= n; column++) {
				if (column >= row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
