package com.ramya;
class Vehicles{
	void drive() {
		System.out.println("The Service Man");
	}
}
class Car extends Vehicles{
	void drive() {
		System.out.println("Repairing a car");
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v1=new Vehicles();
		Car c1 = new Car();
		v1.drive();
		c1.drive();
		

	}

}
