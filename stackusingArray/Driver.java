package stackusingArray;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of arr");
		 int size=sc.nextInt();
		 Stack s=new Stack(size);
		 boolean flag=true;
		 while(flag) {
				System.out.println("enter 1 to push\nEnter 2 to pop\nEnter 3 to peek\nEnter 4 to check empty\nEnter 5 to check full\nEnter 6 to check current size\nEnter 7 to display\nEnter 8 to exit");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("enter the val to push:");
					int val=  sc.nextInt();
					s.push(val);
					break;
				case 2:
				
					int popped=  s.pop();
					if(popped !=-1) {
						System.out.println("popped val:" + popped);
					}
					break;
					
				case 3:
					int top=s.peek();
					if(top!= -1) {
						System.out.println("top element:" + top);
					}
					break;
					
				case 4:
					System.out.println("stack is empty:" + s.isEmpty());
					break;
				case 5:
					System.out.println("stack is full:" + s.isFull());
					break;
				case 6:
					System.out.println("curret stack size:" + s.size());
					break;
					
				case 7:	
					s.display();
					break;
				case 8:
					flag=false;
					return;
				default:
					System.out.println("invalid choice");
			
			
		}
			
		
	}
       
		
		
	}
		

}
