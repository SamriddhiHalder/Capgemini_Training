package circularsinglyLL;

import singleLinkedlist.Node;

public class CircularLL {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			node.next=head;
			count++;
		} else {
			Node temp=head;
			while(temp.next !=head) {
				temp=temp.next;
			}
			temp.next = node;
			node.next=head;
			count++;
		
		}
	}
	
public void update(int new_data, int position) {
		
		if (position > count || position < 1 || head == null) {
			System.out.println("invalid nodes");

		}
		else {
			Node current = head;
			
			for(int i=0;i<position;i++) {
				current=current.next;
				
			}
			current.data=new_data;
			System.out.println("insert position at :" + position + new_data);
		}

	}

public void insertat(int newData, int pos) {
	Node Node=new Node(newData);
	if(head==null) {
		head=Node;
		tail=Node;
		Node.next=head;
		count++;
		return;
	}
	if(pos==1) {
		Node.next=head;
		head=Node;
		tail.next=head;
		count++;
		return;
		
	}
	Node current=head;
	for(int i=0;i<pos-1 && current.next !=head; i++ ) {
		current=current.next;
	}
	Node.next=current.next;
	current.next=Node;
	if(current==null) {
		tail=Node;
		
	}
	count++;
}
public void delete(int pos) {
	if(head==null || pos<=0 || pos>count) {
		return;
	}
	if(pos==1) {
		if(head==tail) {
			head=tail=null;
		} 
		else {
			head=head.next;
			tail.next=head;
		}
		
	} else {
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
			
		}
		if(temp.next==tail) {
			tail=temp;
			temp.next=temp.next.next;
		}
		count++;
	}
}
	
	public void display() {
		if (head == null) {
			System.err.println("no nodes created");
			return;
		} else {
			Node temp = head;
			System.out.print(temp.data + "--->");
			temp=temp.next;
			while (temp != head) {
				System.out.print(temp.data + "--->");
				temp = temp.next;
			}
			System.out.println();
		}

	}

}
