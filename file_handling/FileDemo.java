package file_handling;
import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\User\\Desktop\\filehandling\\demo\\test";
		String renamePath="C:\\Users\\User\\Desktop\\filehandling\\Batman\\DarkKnight";
		File file=new File(path);
		File rename=new File(renamePath);
//		file.mkdirs();
		System.out.println(file.renameTo(rename));
//		System.out.println(file.getAbsolutePath());
		
//		file.createNewFile("Batman");
//		String[]arr=file.list();
//		for(String s: arr) {
//			System.out.println(s);
//		}
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		
		
	}

}
