package oops;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1= new Student(1,"Sam","UEM");
		System.out.println(s1.id+" "+s1.name+" "+s1.college_name+" "+s1.marks+" ");
	//	s1.study();
		System.out.println("...........................");
		
		Student s2= new Student(2,"sap","IEM");
	//	s2.name="Sap";
	//	s2.college_name="IEM";
	//	s2.id=2;
	//	s2.marks=23.77;
		System.out.println(s2.id+" "+s2.name+" "+s2.college_name+" "+s2.marks+" ");
	//	s2.study();
	//	System.out.println("...........................");
		
	//	e=new Employee();
		
	}

}
