package generics;

public class Person<T,K> {
	T  id;
	K name;
	Person(T  id,K name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name;
	}
	
	

}
