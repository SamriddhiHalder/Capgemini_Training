package generics;

import java.util.HashMap;

public class Employee<T>{
	T data2;
	T data1;
	
	public Employee(T data2,T data1) {
		this.data1=data1;
		this.data2=data2;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data1+" "+data2;
	}



	public static void main(String[] args) {
		Employee<Integer> e1=new Employee<Integer>(10,50);
		System.out.println(e1);
		System.out.println(e1.data1 instanceof Integer);
		Employee<String> s2=new Employee<String>("hello","world");
		HashMap<Integer, String> hm1=new HashMap<Integer, String>() ;
		hm1.put(null, null);
		HashMap<Integer, Integer> hm2=new HashMap<Integer, Integer>() ;

		
		Integer[] arr1= {1,49,13,50};
		String[] arr2= {"Sam","sap","Arkz"};
		print(arr1);
		
	}

	private static void print(Integer[] arr1) {
		// TODO Auto-generated method stub
		
	}

}
