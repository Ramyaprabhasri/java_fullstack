package com.ramya;

class Person1
{
	void getFirstName(String fname)
	{
		System.out.println(fname);
	}
	void getLastName(String lname)
	{
		System.out.println(lname);
	}
}
class Employee2 extends Person1
{
	void getFirstName(String fname)
	{
		System.out.println(fname);
	}
	void getLastName(String jtitle)
	{
		System.out.println(jtitle);
	}
}
public class Main7 {

	public static void main(String[] args) {
  
		Person1 p=new Person1();
		p.getFirstName("San");
		p.getLastName("G");
		Employee2 e=new Employee2();
		e.getLastName("Designer");
	}

}