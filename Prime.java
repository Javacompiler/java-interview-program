package com.job;

public class Prime {
	
	public static void main(String[] args) {
		int num=2;
		//boolean b=prime(num);
		boolean b=prime(num,2);
		if(b==true)
		System.out.println("prime no");
		else
			System.out.println("Not prime no");
		
		
		firstNthPrime(10);
			
	}

	private static void firstNthPrime(int n) {
		for (int i = 2; i < n; i++) {
			int count=0;
			for (int j =2; j <i ; j++) {
				if (i%j==0) {
					count++;
				}
				
			}
			if (count==0) {
				System.out.println(i);
			}
			
		}
		
	}

	private static boolean prime(int num,int i) {
		
		/*for (int i = 2; i < num/2; i++) {
			if (num%2==0) {
				return false;
				
			}
			
		}
		return true;*/
		
		if(num!=i){
		if (num%i==0) {
			return false;
			
		}else
			return prime(num, i+1);
		
		}
		return true;
		
		
		
	}

}
