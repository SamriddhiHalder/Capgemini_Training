package composition;

public class Phone {
	String phone_name;
	Battery b;
	public Phone(String phone_name,String battery_type ) {
		this.phone_name=phone_name;
		this.b=new Battery(battery_type);
	}
	public void display() {
		System.out.println(this.phone_name+""+b.type);
	}

}
