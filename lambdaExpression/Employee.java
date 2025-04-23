package lambdaExpression;

public class Employee implements Comparable {
	String name;
	int id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+id;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		// TODO Auto-generated method stub
		return(int) this.id-e.id;
	}
	
	

}
