package abstraction;

public class Creditcard extends Payment{
	private static double  transaction_fee_percentage=0.02;
	public Creditcard(double amount,String transactionId) {
		super( amount,transactionId);
	}
	public void processPayment() {
		double originalAmount = getamount();
		double discount = calculateDiscount();
		double tranasctionFee=(originalAmount -discount)*transaction_fee_percentage;
		double final_amount=(originalAmount -discount)*tranasctionFee;
		System.out.println("\nprocessing creditcard payment.../n");
		System.out.println("Transaction Id:" + gettransactionId());
		System.out.println("OriginalAmount:" + getamount());
		System.out.println("Discount:" + calculateDiscount());
		System.out.println("tranasctionFee:$%.2f%n"+tranasctionFee);
		System.out.println("final_amount:$%.2f%n"+final_amount);
		System.out.println("creditcard payment succesful!");
		
		
		
		
		
		
		
			
		
	}

}
