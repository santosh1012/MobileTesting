package property;

import java.io.File;

public class FileReading {

	public static void main(String[] args) {
		
		File file=new File("C:\\Mobile Setup\\Projects\\Java Learning\\src\\property\\OR1.properties");
		boolean exists = file.exists();
		System.out.println(exists);
		file.canRead();
	}
	
}
