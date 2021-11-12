package keywordDrivenFramework;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDatafromPropertyFile {

	public static void main(String[] args) throws Throwable {
		
		//Open file in read
		FileInputStream fis = new FileInputStream("./data/config.properties");
		//Create an object of Properties class
		Properties prop = new Properties();
		//Keep the file ready for reading Purpose
		prop.load(fis);
		
		//Give the key to get its value
		//String value = prop.getProperty("browser");
		String value = prop.getProperty("browse", "Incorrect Key");
		//Print it
		System.out.println(value);
		 
	}

}
