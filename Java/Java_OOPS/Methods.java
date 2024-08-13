package com.ramya;

public class Methods {
	void myMethod1() {
		
		System.out.println("Instance or Object Method");
	}
	static void myMethod2() {
		System.out.println("Static or Class Method");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj=new Methods();
		obj.myMethod1();
		Methods.myMethod2();

	}

}
