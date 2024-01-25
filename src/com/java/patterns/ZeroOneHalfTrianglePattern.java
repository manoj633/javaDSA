package com.java.patterns;

public class ZeroOneHalfTrianglePattern {

	public static void main(String[] args) {

		int n = 5; // number of lines
		for (int line = 1; line <= n; line++) {
			for (int column = 1; column <= n; column++) {
				if (column > line) {
					System.out.print(" ");
				} else {
					System.out.print((column + line) % 2 == 0 ? '1' : '0');
				}
			}
			System.out.println();
		}
	}
}
