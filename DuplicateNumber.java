package com.job;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
	public int findDuplicateNumber(List<Integer> numbers) {
		int size = numbers.size()-1 ;
		int sum = getSum(numbers);
		int duplicate = sum - (size * (size + 1) / 2);
		return duplicate;
	}

	public int getSum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String a[]) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.contains(3);
		for (int i = 1; i < 6; i++) {
			//System.out.println(i);
			//numbers.add(i);
		}
		// add duplicate number into the list
		numbers.add(0);
		numbers.add(1);
		
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(5);
		
		
	
		int aa[]={1,2,3,2,5,1};
		//System.out.println(numbers.size());
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number: "
				+ dn.findDuplicateNumber(numbers));
	}
}
