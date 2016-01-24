package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class check {

	
	
	public static void main(String[] args) throws IOException {
		
		
		String file="C:\\Mobile Setup\\Projects\\Java Learning\\src\\OR1.properties";
		Properties pro=new Properties();
		FileInputStream fis=null;
			fis = new FileInputStream(file);
		
		
			pro.load(fis);
		
		
				
		pro.getProperty("Register");
		
		
		
	}
}
