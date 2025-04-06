package Inheritence;

public class Bikeclass extends Vehicleclass{
	private boolean hasGear;
	public Bikeclass(String vehicleNumber,String brand,String model,double rent,boolean isAvailable,boolean hasGear) {
		
		super(vehicleNumber,brand,model,rent,isAvailable);	
		this.hasGear=hasGear;
	}
	public void displayDetails() {
		System.out.println(hasGear);
	 displayDetails();
	}

}
