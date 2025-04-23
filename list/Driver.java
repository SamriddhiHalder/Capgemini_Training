package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList();
		emp.add(new Employee(1, "sam"));
		emp.add(new Employee(2, "sap"));
		emp.add(new Employee(3, "tan"));
	//	for (Employee e : emp) {
	//		System.out.println(e);
	//	}

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		// for(int i :al) {
		// if(i==10) {
		// Integer x=i;
		// al.remove(x);
		// break;

		// }

		// }
//		Iterator<Employee> itr = emp.iterator();
//		while (itr.hasNext()) {
//			Employee e = itr.next();
//			if (e.name.equals("sup")) {
//				itr.remove();
//			} else
//				System.out.println(e);
//
//		}
	//	ListIterator list=al.listIterator();
	//	while(list.hasNext()) {
	//		System.out.println("index:"+list.nextIndex()+" "+"element:"+list.next());
	//	}
	//	while(list.hasPrevious()) {
	//		list.previous();
	//	}
	//	System.out.println("...............");
		
	//	while(list.hasNext()) {
	//		int index=list.nextIndex();
	//		if(index==1) {
	//			list.add(60);
	//		}
	//		int element=(int) list.next();
	//		if(element==40) {
	//			list.set(100);
	//		}
	//	}
	//	System.out.println(al);
		
		ArrayList al2=new ArrayList<>();
		al2.add(10);
		al2.add("sam");
		al2.add('c');
		al2.add(null);
		
		Collections.sort(emp);
		System.out.println(emp);
		
		
	emp.add(new Employee(4,"Arkz"));
		Collections.sort(emp,new CompareByName());
		System.out.println(emp);
		
		
		
		

	}
}
