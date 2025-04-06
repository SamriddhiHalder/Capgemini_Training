package string_buffer;

public class Rio {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		sb1.append(true);
		sb1.append("hello");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2);
		char[]arr={'k','h','f'};
		StringBuffer sb3=new StringBuffer(150);
		sb3.append(arr);
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer("Uemistheworst");
		
		sb4.delete(0, 3);
		sb4.append("uem");
		sb4.insert(0, "IEm");
		System.out.println(sb4);
		StringBuffer sb5= new StringBuffer("OIR");
		System.out.println(sb5.reverse());
		
		
	}

}
