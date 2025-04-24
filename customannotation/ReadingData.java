package customannotation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadingData {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		String path="C:\\Users\\User\\Desktop\\filehandling\\Demo.txt";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		int x;
		while((x=fis.read())!=-1) {
			System.out.print((char)x);
		}
	}

}
