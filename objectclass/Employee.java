package objectclass;

public class Employee {
	public String name;
	public int id;
	public double salary;
	public Employee(String name,int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	
@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}



	public boolean equals(Object o) {
		if(o instanceof Employee) {
			Employee e= (Employee) o;
			return this.id==e.id && this.salary==e.salary && this.name.equals(e.name);
			
		}
		return false;
		
	}
	
	public int hashCode() {
		return (int)(this.id+this.salary+this.name.hashCode());
	}
	//worst way of overriding hashCode
	public int hashcode() {
		return 1;
	}
	

}
