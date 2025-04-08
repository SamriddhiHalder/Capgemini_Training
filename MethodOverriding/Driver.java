package MethodOverriding;

public class Driver {
	public static void main(String[] args) {
		Animal Dog= new Dog("labrador");
		((Dog)Dog).sound();
		MethodOverriding.Dog dogAnimal = null;
		String  dogBreed=((Dog)dogAnimal).breed;
		System.out.println(dogBreed);
		dogAnimal.sound();
		System.out.println("................");
		Animal catAnimal= new Cat("persian");
		catAnimal.sound();
		
		
	}

}
