package ride_booking_system;

public class Customer extends User{

	public Customer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		super.showProfile();
		System.out.println("Customer name:"+ name);
	}
	

}
