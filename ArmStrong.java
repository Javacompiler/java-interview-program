package com.job;

public class ArmStrong {
	public static void main(String[] args) {
		String s="371";
		int len=s.length();
		int sum=0;
		
		for (int i = 0; i < len; i++) {
			int m=1;
			int n=Character.getNumericValue(s.charAt(i));
			for (int j = 0; j < len; j++) {
			m*=n;
			}
			sum+=m;
		}
		if (Integer.valueOf(s)==sum) {
			System.out.println("arm strong");
		}else System.out.println("No");
		
		
		int num=153;
		int num1=num;
		int l=Integer.valueOf(num).toString().length();
		int add=0;
		while (num!=0) {
			int rem=num%10;
			int m=1;
			for (int i = 0; i < l; i++) {
				m*=rem;
			}
			num=num/10;
			add+=m;
					
		}
		
		if (num1==add) {
			System.out.println("arm strong");
		}else System.out.println("No");
		
	}

}
