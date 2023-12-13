/*
 * Created on May 11, 2004
 *
 */
package com.eppixcomm.eppix.common.data.transformation;


/**
 * This interface is used to define a 'type' supported by a DTO property.  For 
 * each property type a DTO can have, such as Integer, int, char, Character,
 * Date, a class implementing this interface must be registered.  The 
 * {@link com.eppixcomm.eppix.common.data.transformation.Formatters Formatters} class
 * deals with the registration of Type to TypeFormatter class.
 * 
 * The interface provides two methods, {@link #format(Object) format} is called
 * to convert a type into a String value to be stored in the XML and {@link #parse(String)
 * parse} is called to convert the String back into the type when converting 
 * back into an object.
 * 
 * @author $Author: rtweedie $
 * @version $Revision: 1.1 $
 */
public interface TypeFormatter {

  /**
   * Formats an object into a String.
   *
   * @param value
   * @return
   * @throws Exception
   */
  public String format( Object value ) throws Exception;

  /**
   * Parses the String and returns an object of the appropriate type
   * @param source
   * @return
   * @throws Exception
   */
  public Object parse( String source ) throws Exception;
}
