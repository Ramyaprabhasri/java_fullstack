package com.ramya;
class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is MRF");
	}
}
class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is Fascino");
	}
}
public class Multilevel_Inheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bike bike=new Bike();
       bike.noOfWheels();
       bike.noOfEngine();
       bike.brandName();
       
       Scooty scooty =new Scooty();
       scooty.noOfEngine();
       scooty.noOfWheels();
       scooty.brandName();
	}

}
