package com.recursion;

public class Printfibonaachiseriesusingrecursion {

	public static void m1(int a, int b, int n) {
		if (n == 0) {
			return;
		}
		int sum = a + b;
		System.out.print(sum+",");
		m1(b, sum, n - 1);

	}

	public static void main(String[] args) {
	int a=0;
	int b=1;
	int n=7;
	System.out.print(a+",");
	System.out.print(b+",");
	m1(a,b,n-2);

	}

}
