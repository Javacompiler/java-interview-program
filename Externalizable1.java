package com.job;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Externalizable1 implements Externalizable {

	/**
	 * @param args
	 */
	Externalizable1(){
		
	}
	static void  m(int []b) throws NullPointerException{
		b[0]=b[b.length-1];
		
	}
	public static void main(String[] args) {
		int a[]={1,2,3};
	m(a);
	System.out.println(a[0]);
		System.out.println("BB");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		String s;

	}
	public void writeExternal(ObjectOutput out) throws IOException {
		
		
	}
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		
		
	}

}
