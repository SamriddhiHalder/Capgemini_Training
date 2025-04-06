package array;
import java.util.*;
public class Array {
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			palindrome(array());
		}
		public static int[] array() {
			System.out.println("define the size of the array :");
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] =sc.nextInt();
			}
			return arr;
		}
		public static void palindrome(int[] arr) {
			for(int a : arr) {
				int temp=a, rev=0,num;
				while(temp !=0) {
					num=temp%10;
					rev=rev*10 + num;
					num/=10;
					
				}
				if(rev==a) {
					System.out.println(a + "is palindrome");
				}
				else {
					System.out.println(a + "is not a palindrome");
					
				}
				
				
		}
			
		
		
		
		
		
	}

}
