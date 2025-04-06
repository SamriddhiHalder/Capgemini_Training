package comparableComparator;
import java.lang.*;

public class Employee implements Comparable {
    public int id;
	private String name;
	private double salary;
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary + " ";
	}
	public int compareTo(Object o) {
		Employee emp= (Employee)o;
		return (int)((this.name).compareTo(emp.name));
	//	return (int)(this.salary.compareTo(emp.salary));
		
		
	}
//	public int compareTo(Object o) {
		
//	}
	

}
