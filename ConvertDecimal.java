package com.job;
import java.text.DecimalFormat;


public class ConvertDecimal {
	public static void main(String args[]){
		 
    /* int num=5;
     int base=5;
     int rem,p=0;
     String sum="";
     int []aa=new int[2];
     while(num!=0){
    	
    	
    	 num=num/5;
    	 aa[p++]=num;
    	 
     }*/
    
		double angle = 10.00;

	    DecimalFormat df = new DecimalFormat("0.##");
	    String angleFormated = df.format(angle);
	    System.out.println(angleFormated); //output 20.30
         
    }
}
