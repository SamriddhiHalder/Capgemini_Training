package doublyLL;
import java.util.Scanner;
public class Driver {
 public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
 		DoublyLinkedList list = new DoublyLinkedList();
 		boolean flag=true;
 		while(flag) {
 			System.out.println("enter 1 to insert\nEnter 2 to displayfoward\n Enter 3 to displaybackward\nEnter 4 to insertat\n enter 5 to update\nEnter 6 to delete ");
 			int choice=sc.nextInt();
 			switch(choice) {
 				case 1:
 					System.out.println("enter the data");
 					int data=sc.nextInt();
 					list.insert(data);
 					break;
 				
 				case 2:
 					list.displayforward();
 					break;
 				case 3:
 					list.displaybackward();
 					break;
 				case 4:
 					System.out.println("insert the data");
 					int newData=sc.nextInt();
 					System.out.println("enter the position");
 					int pos=sc.nextInt();
 					list.insertat(newData,  pos);
 					break;
 				case 5:
 					System.out.println("enter the data");
 					int new_data=sc.nextInt();
 					System.out.println("enter the position");
 					int posi=sc.nextInt();
 					list.update(new_data, posi);
 					break;
 				case 6:
 					System.out.println("enter the position");
 					int p=sc.nextInt();
 					list.delete(p);
 					break;
 				case 7:
 					flag=false;
 					break;

 				default :
 					System.out.println("invalid choice");
 			}		
 		}
 	}

 }

