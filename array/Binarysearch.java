package array;

import java.util.Arrays;

public class Binarysearch {
	public static void main(String[] args) {
		int[] arr= new int[] {1,4,45,65,78};
		int target=45;
		System.out.println("position" + Arrays.binarySearch(arr,target));
		int[] array=Arrays.copyOfRange(arr,0,3);
		for(int a : array) {
			System.out.println(a);
		}
		
		
	}


}
