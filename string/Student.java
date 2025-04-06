package string;

import objectclass.Employee;

public class Student {
	String name;
	int id;
	String gender;
	double marks;
	public Student(String name,int id,String gender,double marks) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gender=" + gender + ", marks=" + marks + "]";
	}
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			Employee e= (Employee) o;
			return this.id==e.id && this.salary==e.salary && this.name.equals(e.name);
			
		}
		return false;
		
	}
	public int hashCode() {
		return (int)(this.marks+this.id+this.gender.hashCode()+this.name.hashCode());
	}
	

}
