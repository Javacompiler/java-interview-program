package com.job;

public class EqualsComp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="Bhanu";
		String s2="Bhanu";
		String s3=new String("bhanu");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
