package many_to_many;
import java.util.*;
public class Studentdriver {
	public static void main(String[] args) {
		Student s1=new Student("Sam",3);
		Student s2=new Student("Sap",2);
	//	Student s3=new Student("Rio",3);
		
		Course c1=new Course("Math",2);
		Course c2=new Course("French",2);
		Course c3=new Course("Eng",2);
		
		s1.addCourse(c1);
		s2.addCourse(c2);
		s2.addCourse(c3);
		s2.addCourse(c1);
		System.out.println(Arrays.toString(s1.arr)+" "+Arrays.toString(s1.arr));
	}
	

}
