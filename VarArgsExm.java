package com.job;

import static java.lang.System.*;

public class VarArgsExm {
	void m(int i, String str,int a[]) {
a[0]=2;
		out.println(i);

	}
	void m(String ... i) {

		out.println(i[2]);

	}
	void m(Integer i, String s) {

		System.out.println(s);
	}

	public static void main(String[] args) {
		VarArgsExm argsExm = new VarArgsExm();
		String[] arr = new String[] { "bhanu1", "hello", "india" };
		int b[]={3,4,5};
		argsExm.m(12,"55", b);
		System.out.println("b: " +b[0]);
		argsExm.m("2", "bhanu", "hello", "");

		Externalizable1.main(arr);

	}

}
