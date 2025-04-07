package singleLinkedlist;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			count++;
		} else {
			tail.next = node;
			tail = node;
			count++;
		}
	}

	public void update(int new_data, int position) {
		
		if (position > count || position < 1 || head == null) {
			System.out.println("invalid nodes");

		}
		else {
			Node current = head;
			int temp = 1;
			while(temp!=position) {
				current=current.next;
				temp++;
			}
			current.data=new_data;
		}

	}
	public void insert_any_position(int newData, int pos) {
		Node Node=new Node(newData);
		if(head==null) {
			head=Node;
			tail=Node;
			count++;
			return;
		}
		if(pos==1) {
			Node.next=head;
			head=Node;
			count++;
			return;
			
		}
		Node current=head;
		for(int i=0;i<=count;i++) {
			if(i==pos-1) {
				Node.next=current.next;
				current.next=Node;
				count++;
				return;
				
			}
			current=current.next;
			
		}
		
		
	}
	public void delete(int pos) {
		Node current = head;
		Node temp=head;
		int i=1;
		if(current==null) {
			System.out.println("no data deleted");
			
		}
		while(i!=pos-1) {
			System.out.println(current.data+" ");
			current=current.next;
			temp=current;
			i++;
		}
		current=current.next;
		temp.next=current.next;
		current.next=null;
		System.out.println();
		
		
	}

	public void display() {
		if (head == null) {
			System.err.println("no nodes created");
			return;
		} else {
			Node temp = head;
			while (temp != tail.next) {
				System.err.print(temp.data + "--->");
				temp = temp.next;
			}
			System.out.println();
		}

	}
}
