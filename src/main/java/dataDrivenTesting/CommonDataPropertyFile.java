package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonDataPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		//Open the document in java read format
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		//Create Object of Properties Class-Java .util
		Properties p=new Properties();
		
		//Load the file to Properties Class
		p.load(fis);
		
		//Provide the key and capture the value
		String value=p.getProperty("username");
		System.out.println(value);
		
		String value1=p.getProperty("Password");
		System.out.println(value1);
		
	}

}
