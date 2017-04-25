package com.database.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
/**
 * 
 * @author k.stoyanova
 *
 */
public class PropertyUtil {

	static Logger log = Logger.getLogger(PropertyUtil.class.getName());

	protected static Properties prop = null;
	private static InputStream input = null;

	private static String PROPERTY_FILE = "/resources/settings.properties";
	
	
	protected static boolean isProperiesLoaded() {

		return prop != null && !prop.isEmpty();

	}

	protected static void loadPropertyFile() throws IOException {

		try {		
			prop = new Properties();
			input = PropertyUtil.class.getResourceAsStream(PROPERTY_FILE);
			prop.load(input);

		} catch (IOException ex) {
			log.error("Exception: ", ex);
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