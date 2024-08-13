package com.ramya;
import java.util.*;

public class Student {
      int StudentRegNo;
      String StudentName;
      int[]arr= new int[5];
      Student( int StudentRegNo,String StudentName) {
    	  this.StudentRegNo=StudentRegNo;
    	  this.StudentName=StudentName;
   }
      void getMarks() {
    	  Scanner s = new Scanner(System.in);
    	  for(int i=0;i<5;i++) {
    		  arr[i]=s.nextInt();
    		  }
 }
      void displayGrade() {
    	  int sum=0;
    	  String grade;
    	  for(int i=0;i<5;i++) {
    		  sum+=arr[i];
    		  }
    	  System.out.println("Total Marks: "+sum);
    	  float avg=sum/5f;
    	  System.out.println("Average: "+avg);
    	  if(avg>90&&avg<=100) {
    		 grade="O";
    	  }
    	  else if(avg>80&&avg<=90) {
    		grade="A";
    	  }
    	  else if(avg>70&&avg<=80) {
    		  grade="B";
    	  }
    		  
    	  else if(avg>60&&avg<=70) {
    		  grade="C";
    	  }
    	
    	  else if(avg>50&&avg<=60) {
    		  grade="D";
    	  }
    	  else {
    		  grade="U";
    	  }
    	  System.out.println("Grade: "+grade);
    		  
    	   
    	  
      }
      void displayDetails() {
    	  System.out.println("Student Register Number:"+StudentRegNo);
    	  System.out.println("Student Name:"+StudentName);
    	  System.out.println("Marks:"+Arrays.toString(arr));

    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Ramya");
        s1.getMarks();
        s1.displayDetails();
        s1.displayGrade();

	}

}
