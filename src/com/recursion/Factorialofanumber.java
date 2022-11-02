package com.recursion;

public class Factorialofanumber {

	public static int fact1(int n) {
		if (n == 1) {
			return 1;
		}
		int fact = 1;
		fact = fact * n;
		return fact*fact1(n - 1);// this is known as recursion leaps of faith
		   //finding the relation between problems and sub problems

	}

	public static void main(String[] args) {
           System.out.println(fact1(3));
	}

}
