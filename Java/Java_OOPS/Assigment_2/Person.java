package com.ramya;

public class Person {
	int age;
	String name;
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	void display() {
		System.out.println("Person Name:"+name);
		System.out.println("Person Age: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person(20,"San");
		p1.display();
		Person p2=new Person(21,"Ramya");
		p2.display();

	}

}
