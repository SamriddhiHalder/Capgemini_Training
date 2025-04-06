package oops;
import java.util.*;

public class Student {
	String name;
	String college_name;
	int id;
	double marks;
	public Student() {
		System.out.println("This is a no arg constructor ");
	//	this.id=id;
	//	this.name=name;
	//	this.college_name=college_name;
	//	this.marks=marks;
	}
	public Student(int id) {
		this.id=id;
		System.out.println("one arg constructor");
	}
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("two arg cons");
	}
	public Student(int id, String name,String college_name) {
		this.id=id;
		this.name=name;
		this.college_name=college_name;
		System.out.println("three arg cons");
	}
	public void study() {
		System.out.println(name+" is studying ");
	}
	

}
