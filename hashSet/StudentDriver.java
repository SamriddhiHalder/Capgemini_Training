package hashSet;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		
		hs.add(new Student(1,"sam"));
		hs.add(new Student(2,"sap"));
		hs.add(new Student(3,"rio"));
		hs.add(new Student(4,"amy"));
		hs.add(new Student(4,"amy"));
		System.out.println(hs);
		
		
		
	}

}
