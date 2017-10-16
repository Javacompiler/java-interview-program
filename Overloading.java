package com.job;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Overloading {
	static int j=0;
	public static void m1(Integer i){
		//int r=10/0;

	}
	public void m1(int i){
		
	}
	public static void main(String[] args) throws IOException {
		m1(new Integer(0));
		
		/*System.out.println(new Integer("12"));
		System.out.println(new Long("12"));
		System.out.println(new Double("12.00"));
		System.out.println(new Character('4')+""+"str".matches("str"));*/
		File file=new File("readfile.txt");
		InputStream inputStream=new FileInputStream(file);
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
		String line="";
		int c=0;
		while((line=bufferedReader.readLine())!=null){
			for (int j = 0; j < line.length(); j++) {
				if(line.charAt(j)==' '){
					c++;
				}
			}
			
			
		}
		
		System.out.println(c);
		
		
		
	}
}
