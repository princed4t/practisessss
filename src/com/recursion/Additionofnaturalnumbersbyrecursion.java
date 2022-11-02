package com.recursion;

public class Additionofnaturalnumbersbyrecursion {
	
	public  static void m1(int n,int sum) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		
		sum=sum+n;
		m1(n-1,sum);
		
	}
	
	
	
	

	public static void main(String[] args) {
       m1(3,0);
	}

}
