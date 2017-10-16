package com.job;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CheckDuplicateInList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("bhanu");
		list.add("bhanu2");
		list.add("bhanu");
		list.add("bhanu1");
		Object[] ls = list.toArray();
		for (Object i : ls) {
			if (list.indexOf(i) != list.lastIndexOf(i)) {
				list.remove(list.lastIndexOf(i));
			}
		}
		System.out.println(list);
		List<Integer> integers = new ArrayList<>();
		List<Integer> retain = new ArrayList<>();
		integers.add(2);
		integers.add(3);
		integers.add(1);
		integers.add(6);
		integers.add(5);
		integers.add(2);
		integers.add(5);
		Object[]lss = integers.toArray();
		
		for (Integer integer : integers) {
			//System.out.println(integer);
			
			if (!retain.contains(integer)) {
				retain.add(integer);
				
				
			}else{
				System.out.println(integers.get(integers.indexOf(integer)));
			}
			
			
		}
		
		
	}

}
