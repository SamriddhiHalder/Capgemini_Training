package collections;

import java.util.Stack;


public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		
		Stack stack = new Stack();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		
		System.out.println(stack);
		System.out.println(stack.search(10));
		System.out.println(stack.search(30));
		System.out.println(s.search(10));
		System.out.println(s.search(30));
		System.out.println("..............");
		System.out.println(s.get(0));
		System.out.println(stack.get(0));
		
	}

}
