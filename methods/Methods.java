package methods;

public class Methods {
	public static void main(String[] args) {
		System.out.println("main start");
		Methods obj = new Methods();
		message2("look below");
		obj.message3();
		System.out.println("main end");
		System.out.println(args);
	}
	
	public void message1() {
		System.out.println("bolbo naaa Hello");
	}
	public void message3() {
		message1();
	}
	
	public static void message2(String s) {
		System.out.println(s);
	}
}
