package com.ramya;

public class Variables {
	int b=20;
	static int c=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;//local variable
		System.out.println("Local Variable: "+a);
		Variables obj = new Variables();
		System.out.println (obj.b);
		System.out.println(Variables.c);

	}

}
