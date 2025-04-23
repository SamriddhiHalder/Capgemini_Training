package march_27;

public class EmpDriver {
	public static void main(String[] args) {
		FullTimeEmployee emp = new FullTimeEmployee("Rohit", 50000.00, 1000);
		emp.FullTimeEmployeeInfo();

		System.out.println();

		PartTimeEmployee emp1 = new PartTimeEmployee("Naveen", 500.00, 70);
		emp1.PartTimeEmployeeInfo();
	}

}
