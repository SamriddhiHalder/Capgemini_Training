package composition;

public class Phone_battery {
	public static void main(String[] args) {
		Phone p=new Phone("Nokia","V3");
		p.display();
		p=null;
		p.display();
			
		
	}

}
