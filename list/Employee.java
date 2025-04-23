package list;

public  class Employee implements Comparable<Employee> {
	int id;
	public String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}
	@Override
	public int compareTo(Employee o) {
		Employee e=(Employee)o;
		// TODO Auto-generated method stub
		
		return(int) (this.id-e.id);
	}
	
	

}
