package treeSet;

public class Employee implements Comparable {
	double salary;
	String name;
	Employee(double salary,String name){
		this.salary=salary;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return salary+" "+name;
	}
	@Override
	public int compareTo(Object o) {
		Employee emp=(Employee)o;
		// TODO Auto-generated method stub
		return (int)(this.salary-emp.salary);
	}
	

}
