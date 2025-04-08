package mathClass;

public class MathClass {
	public static void main(String[] args) {
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		System.out.println(Math.ceil(76.98));
		System.out.println(Math.floor(65.78));
		System.out.println(Math.round(56.45));
		System.out.println(Math.round(56.55));
		System.out.println(Math.abs(-45));
		System.out.println(Math.subtractExact(10,20));
		absolute(subtract(10,20));
	}
	private static int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static int absolute(int x) {
		System.out.println(Math.abs(x));
		return x;
	}
	public static int absolute(int a, int b) {
		return absolute(subtract(a,b));
		
	}

}
