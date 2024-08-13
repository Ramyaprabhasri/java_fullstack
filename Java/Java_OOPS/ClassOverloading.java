
package com.ramya;

public class ClassOverloading {
	ClassOverloading(String name) {
		System.out.println("Welcome "+name);
	}
	ClassOverloading(int a,int b) {
		this("San");
		System.out.println("Addition: "+(a+b));
	}
	ClassOverloading(int n) {
		this(10,20);
    	int fact=1;
    	for(int i=1;i<=n;i++) 
    		fact=fact*i;
    	System.out.println("Factorial: "+fact);
    	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOverloading obj1 = new ClassOverloading(5);
		
		
		

	}

}
