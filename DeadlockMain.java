package com.job;

import java.awt.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


class BookeTicket extends Thread{
	
	Object train;
	Object compartment;

	

	public BookeTicket(Object train, Object compartment) {
		super();
		this.train = train;
		this.compartment = compartment;
	}



	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		synchronized(train){
			System.out.println("BookeTicket hold train thread ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("BookeTicket waiting for compartment thread " );
			synchronized (compartment) {
				System.out.println("train and compartment waiting");
			}
		}
		
	}
	
	
}
class CancelTicket extends Thread{
	Object train;
	Object compartment;

	

	public CancelTicket(Object train, Object compartment) {
		super();
		this.train = train;
		this.compartment = compartment;
	}

	public void run()  {
		
		synchronized(compartment){
			System.out.println("CancelTicket hold compartment thread");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CancelTicket waiting for train thread ");
		synchronized(train){
			System.out.println("train and compartment both waiting  ...");
			
		}
		}
		

	}
	
}

public class DeadlockMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentHashMap< String, String> concurrentHashMap=new ConcurrentHashMap<String, String>();
		Hashtable<String, String> hashtable=new Hashtable<String, String>();
		hashtable.put("12", "11");
		hashtable.put("13", "22");
		//hashtable.put(null, null);
		Set<Entry<String, String>> entries1=hashtable.entrySet();
		for (Entry<String, String> entry : entries1) {
			System.out.println(entry.getKey());
			hashtable.put("14", "33");
			
		}
		concurrentHashMap.put("12", "11");
		concurrentHashMap.put("13", "22");
		//concurrentHashMap.put(null, null);

		Set<Entry<String, String>> entries=concurrentHashMap.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey());
			concurrentHashMap.put("14", "33");
			
		}
		System.out.println(concurrentHashMap);
		
		Object train=new Object();
		Object comp=new Object();
		BookeTicket bookeTicket=new BookeTicket(train,comp);
		CancelTicket cancelTicket=new CancelTicket(train,comp);
		
		bookeTicket.start();
		cancelTicket.start();
		

	}

}
