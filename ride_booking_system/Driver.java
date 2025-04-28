package ride_booking_system;

public class Driver extends User {
	private boolean available;

	public Driver(String id, String name) {
		super(id, name);
		this.available=true;
		// TODO Auto-generated constructor stub
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available=available;
	}
	@Override
	public void showProfile() {
		// TODO Auto-generated method stub

		System.out.println("driver name:"+ this.name);
		System.out.println("available:"+ this.available);
	}
	

}
