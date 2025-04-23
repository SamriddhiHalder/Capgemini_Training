package lambdaExpression;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
	//	Employee e= new Employee("Gandu",1);
		List list=new ArrayList();
		list.add(new Employee("gandu",56));
		list.add(new Employee("tor baba",9));
		list.add(new Employee("chutiya",5));
		list.add(new Employee("asshole",4));
	//	Comparator<Employee> c=(o1,o2)->((Employee)o1).name.compareTo(((Employee)o2).name);
		Comparator<Employee> c=(o1,o2)->o1.id-o2.id;
		Collections.sort(list,c);
		System.out.println(list);
	}

}
