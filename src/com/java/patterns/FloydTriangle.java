package com.java.patterns;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int c = 1;
		for(int line = 1; line <= n; line++) {
			for(int num = 1; num <= line; num++) {
				System.out.print(c+++" ");
			}
			System.out.println();
		}
	}

}
