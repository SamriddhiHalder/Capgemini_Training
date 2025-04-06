package comparableComparator;

import java.util.Comparator;

public class Dogcomparable implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stu
		Dog dog1=(Dog)o1;
		Dog dog2=(Dog)o2;
		return (dog2.breed.compareTo(dog1.breed));
	}
	
	

}
