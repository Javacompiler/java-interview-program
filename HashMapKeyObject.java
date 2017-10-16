package com.job;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
/* if two keys are the same (equals() returns true when you compare them), their hashCode() 
 * method must return the same number. If keys violate this, then keys that are equal might be 
 * stored in different buckets, and the hashmap would not be able to find key-value pairs
 *  (because it's going to look in the same bucket).
 *  
If two keys are different, then it doesn't matter if their hash codes are the same or not.
They will be stored in the same bucket if their hash codes are the same, and in this case,
the hashmap will use equals() to tell them apart. */

public class HashMapKeyObject {
	public static void main(String[] args) {
		HashMap<Employee, String> hashMap=new HashMap<Employee, String>();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("hello");
		Employee e2=new Employee();
		e2.setId(2);
		System.out.println(e1.hashCode()+" "+e2.hashCode());
		hashMap.put(e1, "e1employee");
		hashMap.put(e2, "e2employee");
		System.out.println(hashMap);
		System.out.println(e1.equals(e2));
	
		
	}

}
