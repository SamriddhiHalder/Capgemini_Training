package Inheritence;

public class Carclass extends Vehicleclass{
	private int numberofDoors;
	public Carclass(String vehicleNumber,String brand,String model,double rent,boolean isAvailable,int numberofDoooors) {
		super(vehicleNumber,brand,model,rent,isAvailable);
		this.numberofDoors=numberofDoooors;
		
	}
	public void displayDetails() {
		System.out.println(numberofDoors);
	 displayDetails();
	}
	

}
