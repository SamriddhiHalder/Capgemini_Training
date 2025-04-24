package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyImage {
	public static void main(String[] args) throws IOException {
		String ImagePath="C:\\Users\\User\\Desktop\\capgemini\\Beforesunrise.JPG";
		File destination=new File(ImagePath);
		destination.createNewFile();
		String srcPath="C:\\Users\\User\\Desktop\\filehandling\\Beforesunrise.JPG";
		
		File srcFile=new File(srcPath);
		FileInputStream fis=new FileInputStream(srcFile);
		byte[] arr=new byte[(int)srcFile.length()];
		fis.read(arr);
		
		FileOutputStream fos=new FileOutputStream(destination);
		
		fos.write(arr);
	}

}
