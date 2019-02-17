package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoader {
	
	public Properties pageElementsProperties;
	public Properties profileProperties;
	private static PropertiesFileLoader file;
	
	private PropertiesFileLoader(Object obj) throws FileNotFoundException, IOException {
		pageElementsProperties = new Properties();
		pageElementsProperties.load(new FileInputStream(obj.getClass().getName()+".properties"));
	}
	
	PropertiesFileLoader() throws FileNotFoundException, IOException{
		profileProperties = new Properties();
		profileProperties.load(new FileInputStream(".properties"));
	}
	
	public static PropertiesFileLoader getPropertyFileLoaderObject(Object obj) throws FileNotFoundException, IOException {
		if(file == null) {
			file = new PropertiesFileLoader(obj);
		}
		return file;
	}
	
}
