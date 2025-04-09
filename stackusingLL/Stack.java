package stackusingLL;

public class Stack {
	Node top;
	static int count=0;
	public void push(int data) {
		Node node=new Node(data);
		if (top == null) {
			top = node;
			count++;
			return;
		} else {
			node.next = top;
			top = node;
			count++;
			return;
		}
	} 
	public void pop(int data) {
		if(top==null) {
			System.out.println("stack is empty");
		} else {
			System.out.println(top.data);
			Node new_top=top.next;
			top.next=null;
			top=new_top;
			count--;
			
		}
		
	}
	public void peek() {
		if(top==null) {
			System.out.println("stack is empty");
		} else {
			System.out.println(top.data);
			
		}
	}
	public void isEmpty() {
		if(top==null) {
			System.out.println("stack is empty");
		}
	}
	public void display() {
		Node temp=top;
		if(temp==null) {
			System.out.println("stack is empty");
		} else {
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println();
		}
	}
	

}
