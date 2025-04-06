package comparableComparator;

import java.util.Arrays;

public class Dog implements Comparable {
	String name;
	int age;
	String breed;
	public Dog(String name,int age,String breed) {
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	
	

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}



	public static void main(String[] args) {
		Dog[] dog= new Dog[3];
		dog[0]=new Dog("candy", 2,"Lab");
		dog[1]=new Dog("april", 3,"goldie");
		dog[2]=new Dog("Mico", 4,"Husky");
		Dogcomparable c=new Dogcomparable();
		Arrays.sort(dog, c);
		for(Dog g: dog) {
			System.out.println((dog));
			
		}
		
	}
	
		@Override
	public int compareTo(Object o) {
			Dog dog =(Dog) o;
			
			if(this.name.compareTo(dog.name)!=0) {
				return this.name.compareTo(dog.name);
			}
			if(this.age-dog.age !=0) {
				return this.age-dog.age;
			}
			else {
				return 0;
			}
		// TODO Auto-generated method stub
	}

		
		
	
	

}
