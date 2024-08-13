package com.ramya;
      
public class Rectangle {
	int width;
    int height;
    Rectangle(int width,int height){
  	  this.width=width;
  	  this.height=height;
}
    void calculate() {
    	int area=width*height;
    	System.out.println("Area of Rectangle: "+area);
    	int perimeter=2*(width+height);
    	System.out.println("Perimeter of Rectangle: "+perimeter);
    }
    public static void main(String args[] ){
      Rectangle a1=new Rectangle(15,25);
      a1.calculate();
      
    }

}
