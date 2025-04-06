package comparableComparator;


public class EmployeeDriver {
	public static void main(String[] args) {
		Employee emp1=new Employee(1,"samriddhi", 500.55);
		Employee emp2=new Employee(2,"saptarshi",456.99);
		
		(new CompareEmployeeID()).compare(emp1, emp2);
//		compareBasedOnSalary(emp1,emp2);
	}
	public void Employee(Employee emp1,Employee emp2) {
		
		if(emp1.compareTo(emp2)>0)
		System.out.println("emp1 is greater");
		else if (emp1.compareTo(emp2)<0) {
			System.out.println("emp2 is greater");
				
			}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}

}
