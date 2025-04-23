package hashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Student(1,"sam"));
		hs.add(new Student(2,"sap"));
		hs.add(new Student(3,"rio"));
		hs.add(new Student(4,"amy"));
		
	//	System.out.println(hs.hashCode());
		System.out.println(hs);
		
	}

}
