package com.job;
class EagerSingleton{
	
	private static volatile EagerSingleton eagerSingleton=new EagerSingleton();
	
	private EagerSingleton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static EagerSingleton getEagerSingleton(){
		System.out.println(1);
		if (eagerSingleton==null) {
			System.out.println(2);
		return new EagerSingleton();	
		}
		System.out.println(3);
		return eagerSingleton;
		
	}
}
class LazySingleton{
 private static volatile LazySingleton lazySingleton=null;
 private LazySingleton(){
	 
 }

	public static LazySingleton getLazySingleton() {
		System.out.println(4);
		if (lazySingleton == null) {
			System.out.println(5);
			synchronized (LazySingleton.class) {
				if (lazySingleton == null) {
					System.out.println(6);
					lazySingleton= new LazySingleton();
				}

			}

		}
		System.out.println(7);
		return lazySingleton;
	}
}
public class SingletonPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EagerSingleton  eagerSingleton1=EagerSingleton.getEagerSingleton();
		//System.out.println(EagerSingleton.getEagerSingleton());
		EagerSingleton eagerSingleton2=EagerSingleton.getEagerSingleton();
		System.out.println(eagerSingleton1.equals(eagerSingleton2)+" "+eagerSingleton1.hashCode()+"--"+eagerSingleton2.hashCode());
		
		LazySingleton lazySingleton=LazySingleton.getLazySingleton();
		LazySingleton lazySingleton2=LazySingleton.getLazySingleton();
		System.out.println(lazySingleton.hashCode()==lazySingleton2.hashCode());
		
		String s = "hello";
		char[] charArray = s.toCharArray();

		Character character;

		int c = 0, i = 0;
		for (char ch : charArray) {
			// c++;
		}
		for (i = 0, c = 0; charArray[i] != '\0'; i++) {
			c++;
		}

		System.out.println(s.length() + " " + c);
	}

}
