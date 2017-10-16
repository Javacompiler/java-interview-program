package com.job;


public class Fibonacci {
	public static void main(String[] args) {
		int fib0=0;
		int fib1=1;
		int sum=0;
		for (int i = 1; i < 11; i++) {
			fib0=fib1;
			fib1=sum;
			sum=fib0+fib1;
			System.out.println(fib1);
		}
		
		
	}

}


