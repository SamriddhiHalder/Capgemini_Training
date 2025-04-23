package march_28_2ndOne;

public class CreditCardPayment extends Payment {

	CreditCardPayment(double amount, long transactionId) {
		super(amount, transactionId);
	}

	@Override
	public double processPayment() {
		double fee = getAmount() * 0.04;
		return getAmount() - fee;
	}
}