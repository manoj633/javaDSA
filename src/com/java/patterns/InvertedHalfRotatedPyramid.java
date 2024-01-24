package com.java.patterns;

public class InvertedHalfRotatedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; // Number of line
		for (int line = 1; line <= n; line++) {
			for (int star = 1; star <= n ; star++) {
				if(star <= n-line) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}


