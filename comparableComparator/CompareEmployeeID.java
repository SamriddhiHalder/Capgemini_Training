package comparableComparator;

import java.util.Comparator;

public class CompareEmployeeID implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1=(Employee)o1;
		Employee emp2=(Employee)o2;
		// TODO Auto-generated method stub
		return emp1.id-emp2.id;
	}
	

}
