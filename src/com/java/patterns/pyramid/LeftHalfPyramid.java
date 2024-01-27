package com.java.patterns.pyramid;

public class LeftHalfPyramid {
	
	public static void main(String[] args) {
		int n = 5; //Number of lines
		
		for(int row = 1; row <= n; row++) {
			for(int column = 1; column <= n; column++) {
				if(column > n-row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
