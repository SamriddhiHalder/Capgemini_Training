package stackusingLL;

import java.util.Scanner;

import stackusingArray.Stack;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of arr");
		 int size=sc.nextInt();
		 Stack s=new Stack(size);
		 boolean flag=true;
		 while(flag) {
				System.out.println("enter 1 to push\nEnter 2 to pop\nEnter 3 to peek\nEnter 4 to check empty\nEnter 5 to display\nEnter 6 to exit");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("enter your data:");
					int data=  sc.nextInt();
					s.push(data);
					break;
				case 2:
					s.pop();
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
					s.display();
					break;
				case 6:
					flag=false;
					return;
				default:
					System.out.println("invalid choice");
			
			
		}
			
		
	}
      
	
	}

}
