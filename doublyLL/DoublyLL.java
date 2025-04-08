package doublyLL;
class DoublyLinkedList {
Node head;
Node tail;
Node temp;
static int count;

 
 public void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         tail=newNode;
         count++;
     }
     else {
         tail.next = newNode;
         newNode.prev=tail;
         tail=newNode;
         count++;
     }

    
 }

 
 public void delete(int data) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     Node temp = head;

     
     if (temp !=null && temp.data==data) {
         head = head.next;
         if (head != null)
             head.prev = null;
         return;
     }

     while (temp != null && temp.data != data) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("val not found");
         return;
          
     }

     if (temp.next != null)
         temp.next.prev = temp.prev;
     if (temp.prev != null)
         temp.prev.next = temp.next;
 }

 
 public void update(int new_data, int pos) {
     if(head==null) {
    	 System.out.println("list is empty");
    	 return;
     }
     if(pos==1) {
    	 head.data=new_data;
    	 return;
     }
     if(pos==count) {
    	 tail.data=new_data;
    	 return;
     } 
     Node current=head;
     int i=1;
     while(current!=null) {
    	 if(i==pos) {
    		 current.data=new_data;
    		 return;
    	 }
    	 i++;
    	 current=current.next;
     }
 }
public void insertat(int pos, int data) {
	Node node= new Node(data);
	if(head==null) {
		head=node;
		tail=node;
		count++;
		return;
	}
	if(pos<1 || pos>count) {
		System.out.println("postion out of bound");
		return;
	}
	
}
 
 public void displayforward() {
     Node temp = head;
     while (temp != null) {
         System.out.print(temp.data + " <---> ");
         temp = temp.next;
     }
     System.out.println();
 }
 
 public void displaybackward() {
     Node temp = tail;
     while (temp != null) {
         System.out.print(temp.data + " <---> ");
         temp = temp.prev;
     }
     System.out.println();
 }
}
