package methodRef;

public class Driver {
	public static void main(String[] args) {
		Demo d=System.out::println;
		d.print("Hello World");
	}

}
