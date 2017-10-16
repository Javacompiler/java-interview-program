package com.job;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortMapByValue {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("1", "A");
		map.put(null, "A");
		map.put("2", "D");
		map.put("4", "B");
		
		
		Set<Entry<String, String>> set= map.entrySet();
		List<Entry<String, String>> list=new ArrayList<Entry<String,String>>(set);
		Collections.sort(list, new Comparator<Entry<String, String>>() {

			public int compare(Entry<String, String> o1,
					Entry<String, String> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println(list);
		
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(2);
		list1.add(9);
		list1.add(6);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		System.out.println(list1);
		
	}

}
