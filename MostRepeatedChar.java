package com.job;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MostRepeatedChar {
	
	public static void main(String[] args) {
		String s="chandrabhanubb";
		int c=0;
		Map<Character, Integer> map=new TreeMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
			if(c<map.get(s.charAt(i)))
			c++;
			
			}
			else
				map.put(s.charAt(i), 1);
			
		}
		
		for (Map.Entry<Character, Integer> entry:map.entrySet()) {
			if (c==entry.getValue()) {
				System.out.println(entry.getKey()+"\n");
				break;
			}/*if (entry.getValue()==1) {
				System.out.println(entry.getKey());
			}*/
				
			
		}
	}

}
