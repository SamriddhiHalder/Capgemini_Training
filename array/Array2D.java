package array;
import java.util.*;
import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int[][] arr= new int [3][3];
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int []i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
	
		
			
	}	
}		
		
		
		
	


