package Polymorphismm;

public class FullTimeEmp extends Employee {
	int bonus;
	
	public FullTimeEmp(String name,double salary,int bonus){
		super(name,salary,bonus);
		this.bonus=bonus;
	}
	public void empInfo() {
		System.out.println();
	}
	public void designation() {
		System.out.println("Designation is associate");
	}

}
