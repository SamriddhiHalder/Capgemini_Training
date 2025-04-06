package Covarientreturntype;

public class Bike extends Vehicle{
	public Vehicle getObject() {
		return new Bike();
	}


}
