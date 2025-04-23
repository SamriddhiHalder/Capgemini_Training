package arrayDequeue;

import java.util.ArrayDeque;

public class ArrayDeqDemo {
	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(20);
		a.add("queer");
		a.add(50);
		a.add(40);
		a.add("sam");
		System.out.println(a);
		System.out.println(a.getFirst());
		System.out.println(a.pollFirst());
		System.out.println(a.isEmpty());
		System.out.println(a.removeFirst());
		System.out.println(a.poll());
		
	}

}
