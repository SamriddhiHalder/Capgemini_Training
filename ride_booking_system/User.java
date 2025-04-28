package ride_booking_system;

public abstract class User {
	protected String id;
	protected String name;
	public User(String id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void showProfile() {
		System.out.println("user name:"+ this.name);
	}

}
