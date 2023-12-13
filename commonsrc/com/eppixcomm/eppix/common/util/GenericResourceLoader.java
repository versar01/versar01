package com.eppixcomm.eppix.common.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.Thrower;

/**
 * Simple utility that loads resources via InputStream.getResourceAsStream
 */
public class GenericResourceLoader {

	static Thrower thrower = Thrower.getThrower(GenericResourceLoader.class);
	protected static final String ENTITY_ID = "N2N";
	protected static Logger logger = thrower.getLogger();
	private static boolean debug = true;

  /**
   * <p>Utility method to get an InputStream for a given resoure path</p>
   *
   * @param pathToResource        path relative to the calling context.
   *                              For example: loadResource(/app.properties, false)
   *                              for an EAR/APP-INF/classes/app.properties
   * @param useContextClassLoader if <code>true</code> then use the
   *                              current Thread's context ClassLoader
   * @return an input stream for reading the resource, or <code>null</code>
   *         if the resource could not be found
   * @see java.lang.Thread#getContextClassLoader()
   */
  private static InputStream loadResource(String pathToResource, boolean useContextClassLoader) {
    if (debug) {
      say("loadResource with pathToResource : "+pathToResource+
          " useContextClassLoader "+useContextClassLoader);
    }
    if (useContextClassLoader) {
      if (debug) {
        say("using classloader : "+
            Thread.currentThread().getContextClassLoader().getClass().getName());
      }
      return Thread.currentThread().getContextClassLoader().getResourceAsStream(pathToResource);
    } else {
      if (debug) {
        say("using classloader : "+
            GenericResourceLoader.class.getClassLoader().getClass().getName());
      }
      return GenericResourceLoader.class.getClassLoader().getResourceAsStream(pathToResource);
    }
  }

  /**
   * <p>Utility method to get an InputStream for a given resoure path</p>
   *
   * @param pathToResource path relative to the calling context.
   *                       For example: loadResource(/app.properties, false)
   *                       for an EAR/APP-INF/classes/app.properties
   * @return an input stream for reading the resource, or <code>null</code>
   *         if the resource could not be found
   */
  private static InputStream loadResource(String pathToResource)
      throws IOException {
    return loadResource(pathToResource, false);
  }

  /**
   * <p>Utility method to get a Properties object for a given resoure path</p>
   *
   * @param pathToResource path relative to the calling context.
   *                       For example: loadResource(/app.properties, false)
   *                       for an EAR/APP-INF/classes/app.properties
   * @return an Properties object read from pathToResource
   * @throws IOException if the resource could not be found
   */
  public static Properties getProperties(String pathToResource) throws IOException {
    return getProperties(pathToResource, false);
  }

  /**
   * <p>Utility method to get a Properties object for a given resoure path</p>
   *
   * @param pathToResource        path relative to the calling context.
   *                              For example: loadResource(/app.properties, false)
   *                              for an EAR/APP-INF/classes/app.properties
   * @param useContextClassLoader if <code>true</code> then use the
   *                              current Thread's context ClassLoader
   * @return an Properties object read from pathToResource
   * @throws IOException if the resource could not be found
   * @see java.lang.Thread#getContextClassLoader()
   */
  public static Properties getProperties(String pathToResource, boolean useContextClassLoader)
      throws IOException {
    InputStream input = loadResource(pathToResource, useContextClassLoader);
    if (input == null) {
      throw new IOException("Resource "+pathToResource+" not found");
    }
    Properties p = new Properties();
    p.load(input);
    return p;
  }

  private static void say(String msg) {
    
    if(logger.isDebugEnabled()){
    	logger.debug("GenericResourceLoader "+msg);
    }
  }
  
  
  public static void main(String[] args){
	  GenericResourceLoader loader = new GenericResourceLoader();
	  try {
		Properties properties;  
		
		System.out.println(System.getProperty("user.dir","."));
		
		String propFilePath = System.getProperty("user.dir") + "\\eppix.base.properties";
		System.out.println(propFilePath);
		
		properties = loader.getProperties(propFilePath);
//
//		System.out.println(properties.getProperty("jdbc_driver"));
//		System.out.println(properties.getProperty("jdbc_url"));
//		System.out.println(properties.getProperty("jdbc_user"));
//		System.out.println(properties.getProperty("jdbc_pass"));
		
	} catch (IOException e) {
		e.printStackTrace();
	}
  }

}
