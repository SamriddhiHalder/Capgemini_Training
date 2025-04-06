package comparableComparator;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1=new Person("samriddhi", 22);
		Person p2=new Person("saptarshi",23);
		PersonCompare( p1,p2);

//		compareBasedOnSalary(emp1,emp2);
	}
public static void PersonCompare(Person p1,Person p2) {
		
		if(p1.compareTo(p2)>0)
		System.out.println("p1 is greater");
		else if (p1.compareTo(p2)<0) {
			System.out.println("p2 is greater");
				
			}
		else {
			System.out.println("p1 and p2 is equal");
		}
	}

}
