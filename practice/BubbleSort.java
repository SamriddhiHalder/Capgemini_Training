package practice;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[]arr= {23,2,56,4,32,7};
		int n=arr.length;
		for (int i = n - 1; i >= 0; i--) {
	        for (int j = 0; j <= i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j + 1];
	                arr[j + 1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	    }

	}

}
