package com.job;
import java.util.Arrays;


public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a={2,6,1,4,3};
		//Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if(a[j-1]>a[j]){
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
for (int i : a) {
	System.out.println(i);
}
	}

}
