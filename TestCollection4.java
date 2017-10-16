package com.job;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestCollection4 {
	public static void main(String args[]){
		
		   
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ListIterator<String> iterator=al.listIterator();
		  while(iterator.hasNext()){
			 System.out.println(iterator.next()); 
			
		  }
		  while(iterator.hasPrevious()){
			  System.out.println(iterator.previous());
		  }
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Sonoo");  
		  al2.add("Hanumat"); 
		  al2.add("Ravi"); 
		    
		  al.addAll(al2);    
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  al.retainAll(al2);
		  Iterator itr3=al.iterator();
		 System.out.println("*******Retain*********");
		  while(itr3.hasNext()){  
		   System.out.println(itr3.next());  
		  } 
		  al.removeAll(al2);
		  Iterator itr2=al.iterator();
		 System.out.println("-------Remove--------");
		  while(itr2.hasNext()){  
		   System.out.println(itr2.next());  
		  }  
		  
		  
		 }  
}
