import java.util.Scanner;
public class Employee{
public static void main(String args[]){
int employeeId;
String employeeName;
float employeeSalary;
Scanner sc = new Scanner(System.in);
System.out.println("Enter employee ID");
employeeId = sc.nextInt();
System.out.println("Enter employee Name");
employeeName=sc.next();
sc.nextLine();
System.out.println("Enter employee Salary");
employeeSalary=sc.nextFloat();
System.out.println("Employee ID: "+employeeId);
System.out.println("Employee Name: "+employeeName);
System.out.println("Employee Salary: "+employeeSalary);








}
}