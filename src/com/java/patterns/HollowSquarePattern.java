package com.java.patterns;

public class HollowSquarePattern {

	public static void main(String[] args) {
		int n = 7;
		
		for(int line = 1; line <= n; line++) {
			for(int star = 1; star <= n; star++) {
				if(star == 1 || line == n  || line == 1 || star == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}
}
