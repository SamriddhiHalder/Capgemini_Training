package WrapperClass;

public class WrapperClasses {
	public static void main(String[] args) {
		int i =10;
		Integer x= new Integer(i); // depricated
		System.out.println("x :" +x);
		Integer z=Integer.valueOf(i);//boxing
		
		Integer y=30;
		System.out.println("y" + y);
		
		int a=y.intValue();
		Boolean flag=true;
		boolean b=flag.booleanValue();//unboxing
		System.out.println("a :" +a+" "+"b:"+b);
		
		Character ch='a';
		char c=ch;// auto-boxing
	}

}
