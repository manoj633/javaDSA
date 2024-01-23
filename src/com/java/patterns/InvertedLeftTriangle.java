package com.java.patterns;

public class InvertedLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfLines = 5;
		for( int line = 1; line<=numberOfLines; line++)
		{
			for(int star = numberOfLines-line+1; star > 0; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
 	}

}
