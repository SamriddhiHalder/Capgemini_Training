package generics;
import java.util.ArrayList;

import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Employee1<Person> emp =new Employee1<Person>(new Person(20,"sam"));
		printDetails(emp);
		
		List<Boolean> list=new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		list.add(true);
		print(list);
	}
	
	private static void print(List<Boolean> list) {
		System.out.println(list);
		// TODO Auto-generated method stub
		
	}

	public static void printDetails(Employee1 <? extends Person> emp) {
		Person p= emp.obj;
		System.out.println(p);
		
	}
	

}
