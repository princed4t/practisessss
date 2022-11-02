package com.recursion;

public class Xtothepowern {
	static int result;

	public static int m1(int x, int n) {
		if (n == 0) {
			return 1;
		}
		 
		 return x* m1(x, n - 1);
		
		 

	}

	public static void main(String[] args) {
		System.out.println(m1(5,3));

	}

}
