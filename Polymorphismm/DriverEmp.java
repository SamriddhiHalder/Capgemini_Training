package Polymorphismm;

public class DriverEmp {
	static void Details(Employee emp) {
		if(emp instanceof FullTimeEmp) {
			emp.jobRole();
		} else {
			emp.jobRole();
		}

		
	}
	public static void main(String[] args) {
		Employee Ft_emp= new FullTimeEmp("Sam",23.88,222);
		Employee Pt_emp= new PartTimeEmp("Sap",44.88,6);
		Ft_emp.empInfo();
		((FullTimeEmp)Ft_emp).designation();
		Pt_emp.empInfo();
		((PartTimeEmp)Pt_emp).jobRole();
		
	}

}
