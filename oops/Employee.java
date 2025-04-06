package oops;

public class Employee {
	String name;
	String company_name;
	int id;
	double salary;
	public Employee() {
		System.out.println("Employee is working");
	}
	public Employee(int id) {
		this.id=id;
		System.out.println("one arg constructor");
	}
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("two arg cons");
	}
	public Employee(int id, String name,String company_name) {
		this.id=id;
		this.name=name;
		this.company_name=company_name;
		System.out.println("three arg cons");
	}
	public Employee(int id, String name,String company_name,double salary) {
		this.id=id;
		this.name=name;
		this.company_name=company_name;
		this.salary=salary;
		System.out.println("four arg cons");
	}
	

}
