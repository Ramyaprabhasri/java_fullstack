package com.ramya;
class A{
	int a=10;
	A(String name){
		System.out.println("Welcome "+name);;
	}
	void myMethod1() {
		System.out.println("I am a super class method");
	}
}
class B extends A{
	B(){
		super("San");
	}
	void myMethod2() {
		System.out.println("Super class variable: "+super.a);
		super.myMethod1();
	}
}
public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.myMethod2();

	}

}
