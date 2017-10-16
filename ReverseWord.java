package com.job;

public class ReverseWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="chandra bhanu pratap mindtree";
		String[] s=str.split(" ");
		String rev ="";
		String rev1 ="";
		for (int i = 0; i < s.length; i++) {
			rev=s[i]+" "+rev;
			
			for (int j = s[i].length()-1; j >=0 ;) {
				rev1+=s[i].charAt(j);
				 j--;
			}
			rev1+=" ";
		}
		System.out.println(rev);
		System.out.println(rev1);
		
		String string="abccabb";
		
		char[] ch=string.toCharArray();
		char[] c = new char[10];
		int j=0;
		for (int i = 1; i < ch.length; i++) {
			while(ch[i]==ch[j]&&(j>=0)) {
				i++;
				j--;
			}
			c[++j]=ch[i];
			
		}
		
		String s1=removeDuplicates(string);
		System.out.println(s1);
		
	}
	
	public static String removeDuplicates(String s) {
		if (s.equals("")) {
		    return s;
		}
		char[] buf = s.toCharArray();
		char lastchar = buf[0];

		// i: index of input char
		// o: index of output char
		int j = 1;
		for (int i = 1; i < buf.length; i++) {
		    if (j > 0 && buf[i] == buf[j-1]) {
		        lastchar = buf[j-1];
		        while (j > 0 && buf[j-1] == lastchar) {
		            j--;
		        }
		    } else if (buf[i]!= lastchar) {
		    	buf[j++] = buf[i];
		    } 
		}
		return new String(buf, 0, j);
		
		
		}
	
	
	
	

}
