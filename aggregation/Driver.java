package aggregation;

public class Driver {
	public static void main(String[] args) {
		Sim sim=new Sim(12344444);
		Phone phone= new Phone("Redmi",sim);
		phone.display();
		phone=null;
		System.out.println(sim.phoneNo);
	
	}

}
