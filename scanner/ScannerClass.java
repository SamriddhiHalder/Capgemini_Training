package scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int num= sc.nextInt();
		if(num <0 && num%2 !=0) {
			System.out.println("The num is negative and odd");
		}
		else if(num>0 && num%2==0) {
			System.out.println("The num  is positive and even");
		}
		else if(num<0 && num%2 ==0) {
			System.out.println("num is negative and even");
	
		}
		else if(num>0 && num%2 !=0) {
			System.out.println("num is positive and odd");
		}
			
		
	//	System.out.println("Enter the first number");
	//	int num1= sc.nextInt();
	//	System.out.println(sc.nextByte());
	//	int num2= sc.nextInt();
	//	System.out.println(sc.nextBoolean());
	//	System.out.println(sc.nextShort());
	//	System.out.println("enter short");
	//	System.out.println(sc.nextLong());
	//	System.out.println("enter long");
	//	System.out.println(sc.nextFloat());
	//	System.out.println("enter float");
	//	System.out.println(sc.nextDouble());
	//	System.out.println("enter double");
	//	System.out.println(sc.nextInt());
	//	System.out.println(sc.next());
	}

}
