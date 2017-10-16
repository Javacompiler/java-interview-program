package com.job;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return e.id<this.id?1:e.id>this.id?-1:0;
	}
	
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
public class Comparable1 {
	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setId(1);
		employee1.setName("Bhanu");
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("Ravi");
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee.getId()+employee.getName());
		}
		System.out.println(list);
	}

}
