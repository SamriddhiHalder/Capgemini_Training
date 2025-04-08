package abstraction;

public class Driverpayment {
	public static void main(String[] args) {
		Payment Creditcard=new Creditcard(100.88,"ertr222");
		Creditcard.processPayment();
		
		Payment PayPal=new PayPal(666.9,"ggj44");
		PayPal.processPayment();
	}

}
