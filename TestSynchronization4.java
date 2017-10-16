package com.job;

class Table{  	  
	 synchronized static  void printTable(int n){  
	   for(int i=1;i<=5;i++){  
	     System.out.println(Thread.currentThread().getName()+"-->"+n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	   System.out.println("********###static###***********");  
	 }  
	 synchronized  void printTable1(int n){  
		   for(int i=1;i<=4;i++){  
		     System.out.println(n*i+"--"+Thread.currentThread().getName());  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){}  
		   } 
		   System.out.println("*********non-static**********");  
		 } 
	}  
	  
	class MyThread1 extends Thread{  
	public void run(){  
	//Table.printTable(1);  
	/*Table.printTable(10); 
	Table  table=new Table();*/
	Table  table1=new Table();
	/*table.printTable(11);
	table.printTable(22);*/
	table1.printTable1(1);
	}  
	}  
	  
	class MyThread2 extends Thread{  
	public void run(){  
	//Table.printTable(10); 
		Table  table1=new Table();
		
		table1.printTable1(10);
	}  
	}  
	  
	class MyThread3 extends Thread{  
	public void run(){  
	 Table.printTable(100);  
	}  
	}  
	  
	  
	  
	  
	class MyThread4 extends Thread{  
	public void run(){  
	//Table.printTable(1000);  
	}  
	}  
	  
	public class TestSynchronization4{  
	public static void main(String t[]){ 
	MyThread1 t1=new MyThread1();  
	MyThread1 t11=new MyThread1();  
	MyThread2 t2=new MyThread2(); 
	
	Thread thread1=new Thread(t1);
	Thread thread11=new Thread(t11);
	Thread thread2=new Thread(t2);
	
	thread1.setName("thread 1");
	thread11.setName("thread 11");
	thread2.setName("thread 2");
	
	thread1.start(); 
	thread11.start(); 
	thread2.start();
	
	 
	}  
	}  