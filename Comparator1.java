package com.job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  Emp{
	private int eId;
	private String eName;
	
	/**
	 * @return the eId
	 */
	public int geteId() {
		return eId;
	}

	/**
	 * @param eId the eId to set
	 */
	public void seteId(int eId) {
		this.eId = eId;
	}

	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}

	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}

	public Emp(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	
	
}
class NameComp implements Comparator<Emp>{

	public int compare(Emp e1, Emp e2) {
		
		//return e1.geteName().compareTo(e2.geteName());
		return e1.geteId()>e2.geteId()?1:e1.geteId()<e2.geteId()?-1:0;
	}
	
}
public class Comparator1 {
	public static void main(String[] args) {
		Emp employee1=new Emp(2,"Bhanu");
		
		Emp employee2=new Emp(1,"Ravi");
		Emp employee3=new Emp(3,"Abhi");
		
		List<Emp> list=new ArrayList<Emp>();
		list.add(employee1);
		
		list.add(employee2);
		list.add(employee3);
		//Collections.sort(list, new NameComp());
	Collections.sort(list, new Comparator<Emp>() {

		@Override
		public int compare(Emp e1, Emp e2) {
			// TODO Auto-generated method stub
			return e1.geteId()>e2.geteId()?1:e1.geteId()<e2.geteId()?-1:0;
		}
	});
	for (Emp emp : list) {
		System.out.println(emp.geteId()+emp.geteName());
	}
	Collections.sort(list, new Comparator<Emp>() {

		@Override
		public int compare(Emp e1, Emp e2) {
			// TODO Auto-generated method stub
			return e1.geteName().compareTo(e2.geteName());
		}
	});
	
		for (Emp emp : list) {
			System.out.println(emp.geteId()+emp.geteName());
		}
	}
	

	
	
}
