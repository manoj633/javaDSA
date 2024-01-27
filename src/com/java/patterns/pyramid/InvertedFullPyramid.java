package com.java.patterns.pyramid;

public class InvertedFullPyramid {

	public static void main(String[] args) {

		int n = 5; // Number of lines
		boolean star = false;

		for (int row = 1; row <= n; row++) {
			for (int column = 1; column <= 2 * n - 1; column++) {
				if ( column >= row && column < 2*n+1-row && !star) {
					System.out.print("*");
					star = true;
				} else {
					System.out.print(" ");
					star = false;
				}
			}
			System.out.println();
		}
	}

}
