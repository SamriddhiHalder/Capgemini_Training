package Polymorphismm;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	public void empInfo() {
		System.out.println(this.name+" "+this.salary);
	}

}
