package Inheritence;

public class Vehicleclass {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rent;
	private boolean isAvailable;
	public Vehicleclass(String vehicleNumber,String brand,String model,double rent,boolean isAvailable) {
		super();
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rent=rent;
		this.isAvailable=isAvailable;
	}
	public void displayDetails() {
		if(isAvailable==true) {
			System.out.println(vehicleNumber+" "+brand+" "+model+" "+rent+" It's available");
		}else {
			System.out.println(vehicleNumber+" "+brand+" "+model+" "+rent+" It's not available");
		}
	}

}
