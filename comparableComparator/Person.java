package comparableComparator;

public class Person implements Comparable{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p=(Person)o;
		if((this.name).compareTo(p.name)==0){
			if(this.age>p.age) {
				return 1;
				
			} else if(this.age<p.age) {
				return -1;
			} else {
				return 0;
			}
			
		} else {
			return((this.name).compareTo(p.name));
		}
	}
	

}
