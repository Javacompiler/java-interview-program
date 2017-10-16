package com.job;

public class MaximumDiffrence {
	public static void main(String[] args) {
		int a[]={3,-1,4,6,-2};
		
		int max_diff = a[1] - a[0];
		int currentDiff=0;
		  int i, j;
		  for(i = 0; i < a.length; i++)
		  {
		    for(j = i+1; j < a.length; j++)
		    {      currentDiff=  a[j] - a[i];
		      if( currentDiff> max_diff)   
		         max_diff = currentDiff;
		    }    
		  }   
		  System.out.println(max_diff);
			
		
	}

}
