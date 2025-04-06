package MethodOverriding;

public class Cat extends Animal {
	public String breed;
	public Cat(String breed) {
		this.breed=breed;
		
	}
	public void sound() {
		System.out.println("cat is meowing");
	}

}
