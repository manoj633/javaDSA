package com.java.patterns;

public class ButterflyPattern {
	public static void main(String[] args) {
		
		int n=8; // number of lines
		for(int  line =1; line <= n; line++) {
			for(int column = 1; column <= n; column++) {
				if((column> line && column + line <n+1) || (column< line && column + line >n+1)) {
					System.out.print(" ");
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
