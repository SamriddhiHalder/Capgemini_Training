package many_to_many;

public class Course {
	String name;
	Student[]student;
	Course(String name, int size){
		this.name=name;
		this.student=new Student[size];
	}

}
