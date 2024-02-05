package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfiles {


	public static void main(String[] args) throws IOException {
		File propFile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
		FileInputStream dataFis = new FileInputStream(propFile);
		// create an object of properties class
		Properties		p = new Properties();
		// load the file so that getProperty method will come to know where the file is
		p.load(dataFis);
		// read or get the data from the property file by passing the key
	
	System.out.println(p.getProperty("browser"));
	System.out.println(p.getProperty("url"));
	}
}
