package Polymorphismm;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name,double salary,int id) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
		
	}
	
	
	

	public void empInfo() {
		System.out.println(this.name+" "+this.salary);
	}




	public void jobRole() {
		// TODO Auto-generated method stub
		
	}

}
