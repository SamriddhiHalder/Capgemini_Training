package aggregation;

public class Driver_bank {
	public static void main(String[] args) {
		Customer cus=new Customer("sam");
		Bank b= new Bank("SBI", cus);
		b.display();
		b=null;
		System.out.println(cus.cus_name);
	
	}

}
