package objectclass;

public class Driver {
	public static void main(String[] args) {
		Employee e1= new Employee("sam", 1, 22.44);
		Employee e2= new Employee("sam", 1, 22.44);
	//	System.out.println(emp);
	//	System.out.println(emp.toString());
	//	System.out.println(emp1==emp2);
	//	System.out.println(emp1.equals(emp2));
		e1.equals(e2);
		Object o= e2.clone();
	//	System.out.println(e1.getClass());
	//	System.out.println(e1.hashCode());
	//	System.out.println(e2.hashCode());
		
	}

}
