package com.database.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author k.stoyanova
 *
 */
public class PropertyUtil {

	protected static Properties prop = null;
	private static InputStream input = null;

	private static String PROPERTY_FILE = "/resources/settings.properties";
	
	
	public static boolean isProperiesLoaded() {

		return prop != null && !prop.isEmpty();

	}

	public static void loadPropertyFile() throws IOException {

		try {		
			prop = new Properties();
			input = PropertyUtil.class.getResourceAsStream(PROPERTY_FILE);
			prop.load(input);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
	
	protected static void setPrperty(String value){
		PROPERTY_FILE = value;
	}

	public static String getValue(String key) throws IOException {

		if (!isProperiesLoaded()) {
			loadPropertyFile();
		}

		return prop.getProperty(key);

	}

}