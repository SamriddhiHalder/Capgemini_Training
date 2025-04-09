package stackusingArray;

public class Stack {
	private int maxSize;
	private int[] stackArr;
	private int top;
	public Stack(int size) {
		this.maxSize=size;
		this.stackArr=new int[maxSize];
		this.top=-1;
	}
	public void push(int val) {
		if(isFull()) {
			System.out.println("stackoverflow :" + val);
			return;
		}
		stackArr[++top]=val;
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stackoverflow occurs");
			return -1;
		}
		return stackArr[top--];
		
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty!");
			return -1;
		}
		return stackArr[top];
		
	}
	public  boolean isEmpty() {
		return(top==-1);
	}
	public boolean isFull() {
		return(top==maxSize -1);
	}
	public int size() {
		return top+1;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println("stack(top to bottom):");
		for(int i=top;i>=0;i--) {
			System.out.println(stackArr[i] + " ");
		}
		System.out.println();
		
	}
	

}

