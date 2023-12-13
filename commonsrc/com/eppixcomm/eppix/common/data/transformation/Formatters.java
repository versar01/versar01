/*
 * Created on May 12, 2004
 *
 */
package com.eppixcomm.eppix.common.data.transformation;

import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;


/**
 * This class provides access to classes that provide formatting abilities based
 * on 'Type'.  This class is utilised by the {@link com.eppixcomm.eppix.common.data.DTO DTO}
 * class when it has to transform itself into/out of XML.  For each field type
 * on the DTO, a class designed to format it's value into and out of a String
 * has to exist.  These formatters can be overridden at runtime using the
 * {@link #setTypeFormatter(Class, TypeFormatter) setTypeFormatter} method
 * specifying the Type and any class that implements {@link com.eppixcomm.eppix.common.data.transformation.TypeFormatter
 * TypeFormatter} and Serializable.
 *
 * This class needs to be physically modified to support new DTO property types;
 * @see #initialiseTypeList()
 *
 * As an example of overriding the default formatters, the following shows how
 * to replace the Integer formatter for a DTO (and all child DTO's)
 *
 * theDTO.setTypeFormatter(Integer.class, new ReplacementIntegerFormatter());
 *
 * Another method of replacing the default formatters would be to replace the
 * Formatters object itself, like so:
 *
 * formatters = new Formatters( );
 *
 * DateFormatter dateFormatter = new DateFormatter();
 * DateFormatter dateTimeFormatter = new DateFormatter();
 * DateFormatter timeFormatter = new DateFormatter();
 *
 * formatters.setTypeFormatter(java.util.Date.class, dateFormatter);
 * formatters.setTypeFormatter(Date.class, dateFormatter);
 * formatters.setTypeFormatter(DateTime.class, dateTimeFormatter);
 * formatters.setTypeFormatter(Time.class, timeFormatter);
 *
 * @author $Author: rtweedie $
 * @version $Revision: 1.3 $
 */
public class Formatters implements Serializable {

  /** Internal Array of Types supported */
  private FormatterEntry[] formatterEntries;

  /**
   * Specifies a new object to use to format a Type.
   * @param clazz The Type to be formatted
   * @param formatter A class that implements TypeFormatter and Serializable
   */
  public void setTypeFormatter( Class clazz, TypeFormatter formatter ) {

    FormatterEntry fe = getFormatterEntry( clazz );

    if( fe != null ) {

      fe.setFormatter( formatter );
    }
  }

  /**
   * @param clazz The Class of the Type
   * @return A TypeFormatter for the specified Type
   */
  public TypeFormatter getTypeFormatter( Class clazz ) {

    TypeFormatter ff = null;

    FormatterEntry fe = getFormatterEntry( clazz );

    if( fe != null ) {

      ff = fe.getFormatter(  );
    }

    return ff;
  }

  /**
   * @param shortName Short name of a Type
   * @return A TypeFormatter appropriate for the type identified by the
   * supplied shortName
   */
  public TypeFormatter getTypeFormatterByShortName( String shortName ) {

    return getFormatterEntry( shortName ).getFormatter(  );
  }

  /**
   * @param clazz The Class of the Type
   * @return A FormatterEntry object with all the information about the Type
   */
  public FormatterEntry getFormatterEntry( Class clazz ) {

    FormatterEntry retFe = null;
    FormatterEntry[] feList = getTypeList(  );

    for( int i = 0; i < feList.length; i++ ) {

      FormatterEntry fe = formatterEntries[ i ];

      if( fe.getClassDef(  ) == clazz ) {

        retFe = fe;

        break;
      }
    }

    return retFe;
  }

  /**
   * @param shortName The short name of the Type
   * @return A FormatterEntry object with all the information about the Type
   */
  public FormatterEntry getFormatterEntry( String shortName ) {

    FormatterEntry retFe = null;

    FormatterEntry[] feList = getTypeList(  );

    for( int i = 0; i < feList.length; i++ ) {

      FormatterEntry fe = formatterEntries[ i ];

      if( fe.getShortName(  ).equals( shortName ) ) {

        retFe = fe;

        break;
      }
    }

    return retFe;
  }

  /**
   * Returns the Class of the Type identified by the specified short name
   * @param shortName The short name of the Type
   * @return
   */
  public Class getClassFromShortName( String shortName ) {

    return getFormatterEntry( shortName ).getClassDef(  );
  }

  /**
   * Returns the short name of the Type for the specified Class
   * @param clazz The Class of the Type
   * @return
   */
  public String getShortNameFromClass( Class clazz ) {

    return getFormatterEntry( clazz ).getShortName(  );
  }

  /**
   * Returns an Array of FormatterEntry's available
   * @return
   */
  protected FormatterEntry[] getTypeList(  ) {

    if( formatterEntries == null ) {

      formatterEntries = initialiseTypeList(  );
    }

    return formatterEntries;
  }

  /**
   * Initialises the Array of Type formatters
   * @return
   */
  protected FormatterEntry[] initialiseTypeList(  ) {

    FormatterEntry[] fe = new FormatterEntry[] {
        new FormatterEntry( 
          String.class, "String", new DefaultStringFormatter(  ) ),
        new FormatterEntry( 
          Integer.class, "Integer", new DefaultIntegerFormatter(  ) ),
        new FormatterEntry( int.class, "int", new DefaultIntegerFormatter(  ) ),
        new FormatterEntry( 
          Character.class, "Character", new DefaultCharacterFormatter(  ) ),
        new FormatterEntry( 
          char.class, "char", new DefaultCharacterFormatter(  ) ),
        new FormatterEntry( Date.class, "Date", new DefaultDateFormatter(  ) ),
        new FormatterEntry( 
          com.eppixcomm.eppix.common.util.Date.class, "DateOnly",
          new DefaultEppixDateFormatter(  ) ),
        new FormatterEntry( 
          DateTime.class, "DateTime", new DefaultDateTimeFormatter(  ) ),
        new FormatterEntry( 
          BigDecimal.class, "BigDecimal", new DefaultBigDecimalFormatter(  ) ),
        new FormatterEntry( 
          Time.class, "TimeOnly", new DefaultTimeFormatter(  ) ),
        new FormatterEntry( 
          boolean.class, "boolean", new DefaultBooleanFormatter(  ) ),
        new FormatterEntry( 
          Boolean.class, "Boolean", new DefaultBooleanFormatter(  ) ),
        new FormatterEntry( 
          double.class, "double", new DefaultDoubleFormatter(  ) ),
        new FormatterEntry( 
          Double.class, "Double", new DefaultDoubleFormatter(  ) ),
        new FormatterEntry( 
          Float.class, "Float", new DefaultFloatFormatter(  ) ),
        new FormatterEntry( 
          float.class, "float", new DefaultFloatFormatter(  ) ),
        new FormatterEntry( long.class, "long", new DefaultLongFormatter(  ) ),
        new FormatterEntry( Long.class, "Long", new DefaultLongFormatter(  ) ),
        new FormatterEntry( 
          short.class, "short", new DefaultShortFormatter(  ) ),
        new FormatterEntry( 
          Short.class, "Short", new DefaultShortFormatter(  ) )
      };

    return fe;
  }

  public class FormatterEntry implements Serializable {

    private Class clazz;
    private String shortName;
    private TypeFormatter formatter;

    FormatterEntry( Class clazz, String shortName, TypeFormatter formatter ) {

      this.clazz = clazz;
      this.shortName = shortName;
      this.formatter = formatter;
    }

    public Class getClassDef(  ) {

      return clazz;
    }

    public String getShortName(  ) {

      return shortName;
    }

    public TypeFormatter getFormatter(  ) {

      return formatter;
    }

    public void setFormatter( TypeFormatter ff ) {

      formatter = ff;
    }
  }
}
