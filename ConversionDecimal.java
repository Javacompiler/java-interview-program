package com.job;
import java.util.Scanner;


public class ConversionDecimal {
	static int r=0;
	static int dec=0;
	static int p=0;
	static int j = 0;
	static int octal = 0;
	public static void main(String[] args) {
		
	
	Scanner scanner=new Scanner(System.in);
	String in=scanner.next();
	int binary=Integer.parseInt(in);
	
	
	
	int decimal=binaryToDecimal(binary);
	System.err.println("decimal  "+ decimal);
	int octal=binaryToOctal(binary);
	
	//System.out.println(decimal);
	System.out.println("octal "+octal);
	
	//decimalToBinary(8);
	
	}

	private static void decimalToBinary(int d) {
	
		int rem[] = new int[30];
		int i=0;
		while (d!=0) {
			rem[i++]=d%2;
			//b+=rem;
			d/=2;
			
		}
		for (int j = i-1; j >=0; j--) {
			System.out.print(rem[j]);
		}
		
	}

	private static int binaryToOctal(int binary) {
		
		while (binary!= 0) {
			r = binary % 10;
			
			octal += r *Math.pow(8, j);
			
			binary /= 10;
			j++;
		}
		
		return octal;
		
	}

	private static int binaryToDecimal(int binary) {
		while(binary>0){
			r=binary%10;
			dec+=(int) (r*Math.pow(2, p));
			binary=binary/10;
			p++;
			
			
		}
		return dec;
		
	}

}
