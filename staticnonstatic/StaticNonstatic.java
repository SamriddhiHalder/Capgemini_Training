 package staticnonstatic;

public class StaticNonstatic {
	static int id=10;
	String name="Sam";
	public StaticNonstatic() {
		System.out.println(id);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		StaticNonstatic s1= new StaticNonstatic();
		System.out.println(id);
		
		
	}

}
