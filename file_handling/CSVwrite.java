package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVwrite {
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\User\\Desktop\\filehandling\\Samriddhi.csv";
		File file=new File(path);
		file.createNewFile();
		
		try(FileWriter writer=new FileWriter(file)){
			writer.append("id ,name,age\n");
			writer.append("1,Rohit,25\n");
			writer.append("2,Sam,22\n");
			writer.append("3,Sap,23\n");
			System.out.println("CSV file written successfully");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
