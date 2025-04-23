package hashSet;

import java.util.Objects;

public class Student {
	int id;
	String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass() !=obj.getClass())
			return false;
		Student other=(Student)obj;
		// TODO Auto-generated method stub
		return id==other.id && Objects.equals(name, other.name);
	}
	

}
