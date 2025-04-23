package treeSet;


import java.util.Comparator;

public class CompareByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee emp1=(Employee)o1;
		Employee emp2=(Employee)o2;
		
		return emp1.name.compareTo(emp2.name);
	}
	

}