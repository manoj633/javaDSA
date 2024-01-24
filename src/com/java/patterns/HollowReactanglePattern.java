package com.java.patterns;

public class HollowReactanglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 8;
		int columns = 8;
		
		for(int line = 1; line <= rows; line++) {
			for(int star = 1; star <= columns; star++) {
				if(line==1 || line == rows || star == 1 || star == columns) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
