package singleLinkedlist;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag=true;
		while(flag) {
			System.out.println("enter 1 to insert\nEnter 2 to display\nEnter 3 to update\nEnter 4 to insert_at_any_position\nEnter 5 to delete\n Enter 6 to exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the data");
				int data=sc.nextInt();
				list.insert(data);
				break;
			
			case 2:
				list.display();
				break;
				
			case 4:
				System.out.println("insert the data");
				int newData=sc.nextInt();
				System.out.println("enter the position");
				int pos=sc.nextInt();
				list.insert_any_position(newData,  pos);
				break;
			case 5:
				
				System.out.println("enter the position");
				int p=sc.nextInt();
				list.delete(p);
				break;
				
			case 6:
				flag=false;
				break;
				
			
			case 3:
				System.out.println("enter the data");
				int new_data=sc.nextInt();
				System.out.println("enter the position");
				int position=sc.nextInt();
				list.update(new_data, position);
				break;
				
			
			default :
				System.out.println("invalid choice");
			
			}
		}
		
	}

}
