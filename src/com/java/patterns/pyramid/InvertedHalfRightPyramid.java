package com.java.patterns.pyramid;

public class InvertedHalfRightPyramid {

	public static void main(String[] args) {
		
		int n = 5; //Number of rows
		for(int row = 1; row <=n ;row++) {
			for (int column = 1; column <=n+1-row;column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
