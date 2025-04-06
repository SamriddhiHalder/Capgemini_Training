package abstraction;

public abstract class Payment {
	private double amount;
	private String transactionId;
	public Payment(double amount,String transactionId) {
		this.amount=amount;
		this.transactionId=transactionId;
	}
	public double getamount() {
		return amount;
	}
	public String gettransactionId() {
		return transactionId;
	}
	public double calculateDiscount() {
		return (amount >500)? amount*0.10 : 0;
		
	}
	public abstract void processPayment();
		
	}


