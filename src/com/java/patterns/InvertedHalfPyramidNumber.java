package com.java.patterns;

public class InvertedHalfPyramidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Number of line
		for(int line = 1; line <= n; line++) {
			for(int num = 1; num <= n - line +1; num++) {
				System.out.print(num);
			}
		System.out.println();	
		}
	}

}
