package com.job;

import java.util.HashMap;
import java.util.Map;

 final class Account{
	private final int accNo;
	private final String name;
	Account(int accno,String name){
		accNo=accno;
		this.name=name;
	}
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	/*public void setAccNo(int accNo) {
		this.accNo = accNo;
	}*/
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	/*public void setName(String name) {
		this.name = name;
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNo;
		return result;
	}
	 (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accNo != other.accNo)
			return false;
		return true;
	}
	*/
}
public class HashMapAsObject {
	public static void main(String[] args) {
		Map<Account, Integer> map=new HashMap<Account, Integer>();
		Account account1=new Account(1111,"Bhanu");
		

		Account account2=new Account(222222,"sweta");
		
		map.put(account1, account1.getAccNo());
		System.out.println(map.get(account1));
		
		
	}

}
