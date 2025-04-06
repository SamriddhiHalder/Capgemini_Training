package methods;

public class Problem1 {
	public static void main(String[] args) {
		int arr[] = {5,8,3,6,1,0};
		search(arr,6);
	}
	static void search(int arr[],int key) {
		int flag = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Key not found");
		}
		else {
			System.out.println("Key found");
		}
	}
}
