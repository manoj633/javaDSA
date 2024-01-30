package com.java.patterns;

public class HourGlassPattern {
	
	public static void main(String[] args) {
		
		int n = 7; //Number of lines
		
		for(int line = 1; line <= n; line++) {
			for(int star = 1; star  <= n; star++) {
				if((line <= n/2 && star >= line && star <= n-line+1) || 
						(line > n/2 && star > n-line && star <= line)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
