package exceptionHandling;

public class ATM {
	private int pin=1234;
	private double balance=6000;
	public void ATM(int pin,double balance) throws InvalidPinException {
	//	this.pin=pin;
	//	this.balance=balance;
		if(this.pin==pin) {
			System.out.println("user succesfully logged in");
			
		}
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Userlogin user=new Userlogin();
		try {
			user.Userlogin(1236);
			
		}
		catch(InvalidPinException e){
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("new main");
	}

}
