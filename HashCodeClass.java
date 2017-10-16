package com.job;

import java.util.HashMap;
import java.util.Map;

public class HashCodeClass {
	public static void main(String[] args) {
		String obj1 = new String("BB");
		String obj2 = new String("BB");
		System.out.println(obj1.intern().equals(obj2));
		System.out.println(obj1==obj2);
		System.out.println("hashCode for an obj1 is " + obj1.hashCode());
		System.out.println("hashCode for a obj2 is " + obj2.hashCode());
		int o3=obj1.length();
		//long o1=(int) ((int) ((int) (obj1.charAt(0)*Math.pow(31, 3))+(obj1.charAt(1)*Math.pow(31, 2)))+(obj1.charAt(2)*Math.pow(31, 1))+(obj1.charAt(3)*Math.pow(31, 0)));
		//System.out.println(o1);
		String s[]="india is a great country in Asia a great country".split(" ");
		Map<String, Integer> map=new HashMap<String, Integer>();
		Integer freq;
		for (String str : s) {
			freq=map.get(str);
			if(freq==null)
				freq=1;
			else
				freq++;
			map.put(str, freq);
			
		}
		System.out.println(map);
		System.out.println(1&3);
	}

}
