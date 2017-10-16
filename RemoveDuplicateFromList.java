package com.job;

import java.util.ArrayList;
import java.util.List;
/**
 * Remove duplicate from list
 * @author tm_chandrabhanu
 *
 */
public class RemoveDuplicateFromList {
	public static void main(String[] args) {


	       List<String> lst = new ArrayList<String>();
	        lst.add("ABC");
	        lst.add("ABC");
	        lst.add("ABCD");
	        lst.add("ABCE");
	        lst.add("ABCD");

	        System.out.println("Duplicates List "+lst);

	        Object[] st = lst.toArray();
	          for (Object s : st) {
	        	  System.out.println(lst.indexOf(s)+"-"+lst.lastIndexOf(s));
	            if (lst.indexOf(s) != lst.lastIndexOf(s)) {
	                lst.remove(lst.lastIndexOf(s));
	             }
	          }

	        System.out.println("Distinct List "+lst);

	    }

}
