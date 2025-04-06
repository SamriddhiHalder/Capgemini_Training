package oops;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1= new Employee(1,"Sam","Amazon",33.88);
		System.out.println(e1.name+" "+e1.company_name+" "+e1.id+" "+e1.salary+" ");
		System.out.println("..................");
		
		Employee e2=new Employee(2,"Sap","Google",99.88);
		System.out.println(e2.name+" "+e2.company_name+" "+e2.id+" "+e2.salary+" ");
	}

}
