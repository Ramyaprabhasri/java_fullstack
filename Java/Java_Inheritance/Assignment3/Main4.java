package com.ramya;
class Employee1{
	void work() {
		System.out.println("Employee is Working!");
	}
	void getSalary() {
		System.out.println("Salary: Rs.50000");
	}
}
class HRManager extends Employee1{
	void work() {
		System.out.println("HR is managing everything");
	}
	void addEmployee() {
		System.out.println("New employee added");
	}
}
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1();
		e1.work();
		e1.getSalary();
		HRManager h1 = new HRManager();
		h1.work();
		h1.addEmployee();
		h1.getSalary();

	}

}
