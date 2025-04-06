package array;
import java.util.*;

public class Transposematrics {
	public static void transpose(int arr[][]) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int r=sc.nextInt();
		System.out.println("Enter the columns:");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter the Numbers:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		transpose(arr);
	}

}
