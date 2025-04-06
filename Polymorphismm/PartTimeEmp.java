package Polymorphismm;

public class PartTimeEmp extends Employee {
	private int workingHour;
	public PartTimeEmp(String name,double salary,int workingHour) {
		super(name,salary);
		this.workingHour=workingHour;
		
	}
	public void empInfo() {
		super.empInfo();
		System.out.println(this.workingHour);
	}
	public void jobRole() {
		System.out.println("jobrole of a parttime emp is Cloud Engineer");
	}
	public void designation() {
		System.out.println("Designation is associate");
	}

	

}
