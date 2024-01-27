package com.java.patterns.pyramid;

public class RightHalfPyramid {

	public static void main(String[] args) {

		int n = 5; // number of lines
		for (int row = 1; row <= n; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
