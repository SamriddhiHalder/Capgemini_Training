package array2D;
import java.util.*;

public class Array2D {
	static Scanner sc= new Scanner(System.in);
	public static int[][] declare() {
		System.out.println("enter no of rows: ");
		int r=sc.nextInt();
		System.out.println("enter no of columns");
		int c =sc.nextInt();
		int[][]arr= new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void maxi(int[][] arr) {
		int m=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>m) {
					m=arr[i][j];
				}
			}
			
		}
		System.out.println(m);
	}
	public static void main(String[] args) {
		symmetric(declare());
	}
	public static void symmetric(int[][]arr) {
		if(arr[0][1]==arr[1][0]) {
			if(arr[0][2]==arr[2][0]) {
				if(arr[1][2]==arr[2][1]) {
					System.out.println("the array is symmetric");
				}
			}
		}else {
			System.out.println("not symmetric");
		}
		
	}

}
