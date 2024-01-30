package com.java.patterns;

public class DiamondPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 11; // Number of lines
		
		for(int line = 1; line <= n; line++) {
			for(int star = 1; star <= n; star++) {
				if((star > n/2+1 - line && star <= n/2+line && line <= n/2) || 
						(line > n/2  && star < (3*n)/2-line+2 && star > line-n/2-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
