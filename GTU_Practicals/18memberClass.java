/*new18. Create a class named 'Member' having the following members:
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
'Manager' classes have data members 'specialization' and 'department' respectively. Now,
assign name, age, phone number, address and salary to an employee and a manager by
making an object of both of these classes and print the same along with specialization and
department respectively.*/


package OOPJ;

import java.util.Scanner;

class Member {
	String name;
	int age;
	int phoneNumber;
	String address;
	double salary;
	
	void printSalary() {
		System.out.println("salary = "+salary);
	}
}

class Employee extends Member {
	String specialization;
	
	Employee(String n, int a, int ph, String add, double s, String spe){
		name = n;
		age = a;
		phoneNumber = ph;
		address = add;
		salary = s;
		specialization = spe;
	}
	
	void displayEmployeedetails(){
		System.out.println("\nEmployee Details:");
		System.out.println("Name = "+ name);
		System.out.println("Age = "+age);
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Address = "+address);
		printSalary();
		System.out.println("Specialization = "+specialization);
	}
}

class Manager extends Member{
	String department;
	
	Manager(String n, int a, int ph, String add, double s,String dept){
		name = n;
		age = a;
		phoneNumber = ph;
		salary = s;
		department = dept;
	}
	void displayManagerDetails() {
		System.out.println("\nManager Details: ");
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Phone Number = "+phoneNumber);
		System.out.println("Address = "+address);
		printSalary();
		System.out.println("Department = "+department);
	}
}

public class memberClass {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mayur",24,909997,"xyz,Surat",45000,"Finance");
		Manager m1 = new Manager("Manish",28,765434,"abc,Rajkot",55000,"HR");
		e1.displayEmployeedetails();
		m1.displayManagerDetails();
	}
}
