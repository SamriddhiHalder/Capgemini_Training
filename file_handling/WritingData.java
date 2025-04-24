package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingData {
	public static void main(String[] args) throws IOException {
	//	Scanner sc=new Scanner(System.in);
		String path="C:\\Users\\User\\Desktop\\filehandling\\Demo.txt";
		File file=new File(path);
		FileOutputStream fos=new FileOutputStream(file,true);
		String message="Human is shit. Pet a dog. Soumyadip is a dog";
	//	byte[] arr=message.getBytes();
	//	fos.write(arr);
		for(int i=0;i<message.length();i++) {
			fos.write(message.charAt(i));
			
		}
		fos.flush();
		
	}

}
