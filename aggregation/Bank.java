package aggregation;

public class Bank {
	String bank_name;
	Customer cus;
	public Bank(String name,Customer cus) {
		this.bank_name=name;
		this.cus=cus;
	}
	public void display()
	{
		System.out.println(this.bank_name+" "+this.cus.cus_name);
	}
}
