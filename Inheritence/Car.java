package Inheritence;

public class Car extends Vehicle{
	int hp;
	public Car(String name, int hp,String engType) {
		super( name,engType);
	//	this.name=name;
	//	this.price=price;
	//	this.type=type;
		this.hp=hp;
		System.out.println("child");
		
	}

}
