package com.job;

public class EqualCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s11="bhanu";
		String s22="bhanu";
			String s1=new String("Bhanu");
			String s2=new String("bhanu");
			System.out.println(s11==s22);
		if(s11.equals(s22))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
