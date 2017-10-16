package com.job;

public class PassByValue {
public static void main(String[] args) {
	Value value=new Value();
	value.id=12;
	value.m1(value);
	System.out.println(value.id);
}
}
class Value{
	int id;
	
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

	public void m1(Value v){
		v.id=13;
		System.out.println(v.id);
	}
}