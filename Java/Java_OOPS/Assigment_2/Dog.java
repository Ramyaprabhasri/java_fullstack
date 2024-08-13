package com.ramya;

public class Dog {
     String name;
     String breed;
      Dog(String name,String breed){
    	 this.name=name;
    	 this.breed=breed;
     }
      void updateName(String name) {
    	 this.name=name;
     }
     void updateBreed(String breed) {
    	 this.breed=breed;
     }
      void display() {
    	 System.out.println("Dog's Name: "+name);
    	 System.out.println("Dog's Breed: "+breed);

     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Jarvis","Shih Tzu") ;
		d1.updateName("Zoe");
		d1.updateBreed("Maltipoo");
		d1.display();

    
	}

}
