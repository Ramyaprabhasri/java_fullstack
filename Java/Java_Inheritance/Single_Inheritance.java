package com.ramya;
class TwoWheelers{
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}
class Bikes extends TwoWheelers{
	void brandName() {
		System.out.println("Brand Name is MRF");
	}
}
public class Single_Inheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bikes bike=new Bikes();
       bike.noOfWheels();
       bike.brandName();
	}

}
