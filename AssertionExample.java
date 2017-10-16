package com.job;

import java.util.Scanner;

public class AssertionExample {
	public static void main( String args[] ){  
		  
		  Scanner scanner = new Scanner( System.in );  
		  System.out.print("Enter ur age ");  
		    
		  int value = scanner.nextInt();  
		  assert value>=18:"Age is less than 18yrs.";  
		  
		  System.out.println("value is "+value);  
		 }   
}
