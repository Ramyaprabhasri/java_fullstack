package com.ramya;
class Shape{
	void getArea() {
		System.out.println("Area of the rectangle ");
	}
}
class Rectangles extends Shape{
	void getArea( int length, int width) {
		int area = length*width;
		System.out.println(area);
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		Rectangles r1= new Rectangles();
		s1.getArea();
		r1.getArea(40,2);

	}

}
