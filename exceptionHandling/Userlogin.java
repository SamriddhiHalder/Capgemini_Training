package exceptionHandling;

public class Userlogin {
	private int  pin=1234;
	public void Userlogin(int pin) throws  InvalidPinException {
		if (this.pin==pin) {
			System.out.println("user succesfully logged in");
			
		}
		else {
			throw new InvalidPinException("The user pin is invalid");
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Userlogin user=new Userlogin();
		try {
			user.Userlogin(1234);
			
		}
		catch(InvalidPinException e){
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("new main");
	}

}


