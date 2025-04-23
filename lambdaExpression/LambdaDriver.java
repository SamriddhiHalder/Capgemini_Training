package lambdaExpression;

public class LambdaDriver {
	public static void main(String[] args) {
		LambdaDemo l1=()->System.out.println("Bye");
	//	 l2=()->System.out.println("fuckoff");
	//	Demo d3=()->System.out.println("Bye");
		l1.print();
	//	l2.print();
		Demo1 d=(x,y)->{
			if(x>y) {
				return x;
			}
			else {
				return y;
			}
	};
	
	System.out.println(d.greater(29, 0));

}
}