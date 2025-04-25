package file_handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoserializeEmp {
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		String path="C:\\Users\\User\\Desktop\\filehandling\\serialize.txt";
		File file=new File(path);
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp);
		
	}
    
}
