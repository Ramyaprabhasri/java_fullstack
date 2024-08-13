package com.ramya;

 class Animal{
	 void makeSound() {
		 System.out.println("Animal makes a sound");
		 }
 }
 class Cat extends Animal{
	 void makeSound() {
		 System.out.println("The Cat barks");
	 }
 }
 public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		Cat c1 = new Cat();
		a1.makeSound();
		c1.makeSound();
		

	}

}
