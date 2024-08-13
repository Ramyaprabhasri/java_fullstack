package com.ramya;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	//constructor
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
//method
void display() {
	System.out.println("Employee Id: "+employeeId);
	System.out.println("Employee Name: "+employeeName);
	System.out.println("Employee Salary: "+employeeSalary);


}
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee emp1 = new Employee(101,"San",75000.0f);
      emp1.display();
      Employee emp2 = new Employee(102,"Ramya",65000.00f);
      emp2.display();

	}

}
