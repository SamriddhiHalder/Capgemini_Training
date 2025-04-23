package treeSet;

import java.util.TreeSet;




public class TreeSetDemo  {
	public static void main(String[] args) {
		TreeSet set=new TreeSet(new CompareByName());
		set.add(new Employee(66.99,"sam"));
		set.add(new Employee(33.44,"sup"));
		set.add(new Employee(56.43,"shuv"));
		set.add(new Employee(50.84,"sap"));
		set.add(new Employee(42.74,"tat"));
		System.out.println(set); 
		
	}
	
	
	
	
	

}
