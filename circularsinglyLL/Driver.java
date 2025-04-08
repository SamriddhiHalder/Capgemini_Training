package circularsinglyLL;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CircularLL list = new CircularLL();
		boolean flag=true;
		while(flag) {
			System.out.println("enter 1 to insert\nEnter 2 to display\n enter 3 to insertat\nEnter 4 to update\n enter 5 to delete ");
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
				case 3:
					System.out.println("insert the data");
					int newData=sc.nextInt();
					System.out.println("enter the position");
					int pos=sc.nextInt();
					list.insertat(newData,  pos);
					break;
				case 4:
					System.out.println("enter the data");
					int new_data=sc.nextInt();
					System.out.println("enter the position");
					int position=sc.nextInt();
					list.update(new_data, position);
					break;
				case 5:
					System.out.println("enter the position");
					int p=sc.nextInt();
					list.delete(p);
					break;
			}		
		}
	}
}
	
		
		
				


