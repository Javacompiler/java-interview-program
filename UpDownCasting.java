package com.job;
abstract class   AB{
	abstract void m();
}
interface A{  
	abstract void a();  
	void b();  
	void c();  
	void d();  
	}  
	  
 class B extends AB implements A{

	public void a() {
		// TODO Auto-generated method stub
		
	}

	public void b() {
		// TODO Auto-generated method stub
		
	}

	public void c() {
		// TODO Auto-generated method stub
		
	}

	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m() {
		// TODO Auto-generated method stub
		
	}  
	//public void c(){System.out.println("I am C");}  
	}


class Animal {
	int d=12;
}  

class UpDownCasting extends Animal {  
  static void method(Animal a) {  
    if(a instanceof UpDownCasting){  
    	UpDownCasting d=(UpDownCasting)a;//downcasting  
      System.out.println("ok downcasting performed"+d);  
   } else if(a instanceof Animal){
	 UpDownCasting d=(UpDownCasting)a;//downcasting  
	   System.out.println(" downcasting performed"+d.d); 
   }
  }  
   
  public static void main (String [] args) {  
    Animal a=new UpDownCasting();
    System.out.println(a.d);
    Animal b = new Animal();
    ((UpDownCasting) a).method(a);  
    UpDownCasting.method(b); ;
    
  }  
    
 }  