package loops;
import java.util.*;
public class Digit_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		System.out.println("number of digit in a number:" + count);
	}

}
