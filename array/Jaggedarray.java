package array;
import java.util.*;
public class Jaggedarray {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	public static int[][] createjaggedarray() {
		System.out.println("enter no rows");
		int r=sc.nextInt();
		int[][]arr=new int[r][];
		for(int i=0;i<r;i++) {
			System.out.println("specify the size of row" + (i+1));
			int c=sc.nextInt();
			arr[i]=new int[c];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter no: ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		return arr;
		
		
	}

}
