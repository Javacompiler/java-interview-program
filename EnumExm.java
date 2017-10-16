package com.job;

public class EnumExm {
	enum Week{
		MONDAY(1),TUESDAY(2);
		private int val;
		private Week(int val){
			this.val=val;
		}
		
	}
	public static void main(String[] args) {
		for (Week day : Week.values()) {
			System.out.println(day+"--"+day.val);
			
		}
	}

}
