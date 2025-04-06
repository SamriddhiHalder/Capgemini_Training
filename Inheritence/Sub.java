package Inheritence;

public class Sub extends Superclass{
	double a=1.1;
	static int b;
	public void print() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(super. b);
	}

}
