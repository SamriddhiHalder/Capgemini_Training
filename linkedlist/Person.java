package linkedlist;

public class Person implements Comparable{
	int id;
	String name;
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}
	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		// TODO Auto-generated method stub
		return (int)this.id-p.id;
	}
	

}
