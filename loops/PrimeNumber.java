package loops;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
			System.out.println("It is not a prime number");
		}
			System.out.println("It is a prime number");
	}

	}}
