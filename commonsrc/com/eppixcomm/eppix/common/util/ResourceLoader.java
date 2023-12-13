package com.eppixcomm.eppix.common.util;

import java.io.*;
import java.net.*;
import java.util.*;

public class ResourceLoader {
	private static Properties properties;
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir") + fileSep;

    /**
     * Making the default (no arg) constructor private
     * ensures that this class cannnot be instantiated.
     */
    private ResourceLoader() {  }

    public static Properties getAsProperties(String name) {
        Properties props = new Properties();
        URL url = ResourceLoader.getAsUrl(name);

         if (url != null) {
            try {
                 // Load the properties using the URL (from the CLASSPATH).
                 props.load(url.openStream());
            } catch (IOException e) {
            	// File does not exist
            	e.printStackTrace();
            	return null;
            }
        }

        return props;
    }

    public static URL getAsUrl(String name) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return classLoader.getResource(name);
    }
    
    public static Properties loadProperties() {

        FileInputStream propIn;
        properties = new Properties();
        try {

          propIn = new FileInputStream(RESOURCES_PATH + "eppix.base.properties");
          properties.load(propIn);

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
        
        return properties;

      }
    
    public static void main(String[] args){
//  	  ResourceLoader loader = new ResourceLoader();
    	
		Properties properties;
		properties = ResourceLoader.loadProperties();

		System.out.println(properties.getProperty("jdbc_driver"));
		System.out.println(properties.getProperty("jdbc_url"));
		System.out.println(properties.getProperty("jdbc_user"));
		System.out.println(properties.getProperty("jdbc_pass"));

    }
}

