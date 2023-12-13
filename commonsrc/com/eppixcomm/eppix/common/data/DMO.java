/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.common.data.DTO;

import java.math.BigDecimal;

import org.jdom.Element;


/**
 * Data Model Object
 * 
 * @author $Author$
 * @version $Revision: 1.5 $
 * 
 * @since $jdk$
 * 
 * @hidden
 */
public abstract class DMO extends DTO implements Cloneable {

  /** Unknown field type */
  protected static final int FIELD_TYPE_UNKNOWN = 0;

  /** String field type */
  protected static final int FIELD_TYPE_STRING = 1;

  /** Date field type */
  protected static final int FIELD_TYPE_DATE = 2;

  /** BigDecimal field type */
  protected static final int FIELD_TYPE_BIGDECIMAL = 3;

  /** Short field type */
  protected static final int FIELD_TYPE_SHORT = 4;

  /** Integer field type */
  protected static final int FIELD_TYPE_INTEGER = 5;

  /** Long field type */
  protected static final int FIELD_TYPE_LONG = 6;

  /** Float field type */
  protected static final int FIELD_TYPE_FLOAT = 7;

  /** Double field type */
  protected static final int FIELD_TYPE_DOUBLE = 8;

  /** Boolean field type */
  protected static final int FIELD_TYPE_BOOLEAN = 9;

  /** Text field type */
  protected static final int FIELD_TYPE_TEXT = 10;

  /** Date only field type */
  protected static final int FIELD_TYPE_DATEONLY = 11;

  /** DateTime field type */
  protected static final int FIELD_TYPE_DATETIME = 12;

  /** Time only field type */
  protected static final int FIELD_TYPE_TIMEONLY = 13;

  /** Used to extract field type from attributes */
  protected static final int FIELD_TYPE = 15;

  /**
   * Read only field - it will not be bound to any INSERT or UPDATE statements 
   * and therefore can not be written to the database.
   */
  protected static final int FIELD_ATTR_QUERYONLY = 48;

  /** Field type string for unknown type */
  private static final String FIELD_TYPESTR_UNKNOWN = "";

  /** Field type string for String type */
  private static final String FIELD_TYPESTR_STRING = "string";

  /** Field type string for Date type */
  private static final String FIELD_TYPESTR_DATE = "date";

  /** Field type string for BigDecimal type */
  private static final String FIELD_TYPESTR_BIGDECIMAL = "decimal";

  /** Field type string for Short type */
  private static final String FIELD_TYPESTR_SHORT = "short";

  /** Field type string for Integer type */
  private static final String FIELD_TYPESTR_INTEGER = "int";

  /** Field type string for Long type */
  private static final String FIELD_TYPESTR_LONG = "long";

  /** Field type string for Float type */
  private static final String FIELD_TYPESTR_FLOAT = "float";

  /** Field type string for Double type */
  private static final String FIELD_TYPESTR_DOUBLE = "double";

  /** Field type string for Boolean type */
  private static final String FIELD_TYPESTR_BOOLEAN = "boolean";

  /** Field type string for Text type */
  private static final String FIELD_TYPESTR_TEXT = "text";

  /** Field type string for Date only type */
  private static final String FIELD_TYPESTR_DATEONLY = "dateonly";

  /** Field type string for DateTime type */
  private static final String FIELD_TYPESTR_DATETIME = "datetime";

  /** Field type string for Time only type */
  private static final String FIELD_TYPESTR_TIMEONLY = "timeonly";

  /**
   * Creates a new DMO object
   */
  public DMO() {
  }

  /**
   * Creates and returns a copy of this object.
   * 
   * @return a clone of this instance.
   */
  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
    }
    return null;
  }

  /**
   * Instantiates a {@link DAOArgs}object that contains the DMO's primary key.
   * 
   * @return primary key.
   */
  abstract protected DAOArgs primaryKey();

  /**
   * Returns the XML representation of this DMO's primary key.
   * 
   * @return primary key converted to XML.
   */
  public Element primaryKeyToXML() {
    return primaryKey().toXML(new Element("key"));
  }

  /**
   * Returns the String representation of this DMO's primary key.
   * 
   * @return primary key converted to a String.
   */
  public String primaryKeyToString() {
    return primaryKey().toString();
  }

  /**
   * Provides the field types for the DMO.
   * 
   * @return array of field types.
   */
  abstract protected int[] fieldTypes();

  public int[] types() {
    return fieldTypes();
  }

  /**
   * Sets the field values for the DMO from an array of objects retrieved from
   * the database.
   * 
   * @param fields array of field objects.
   */
  abstract protected void set(Object[] fields);

  /**
   * A method implemented in data query objects that act as proxies to
   * instantiate an appropriate class of DMO depending of the data being
   * retrieved. This method should be invoked by the DAO implementation as part
   * of its database fetch routine.
   * 
   * @return Data Model Object.
   */
  protected DMO toDMO() {
    return this;
  }

  /**
   * 
   * @param text
   * @param index
   * @return
   */
  public String getPadded(final String text, final int index) {
    if (text != null) {
      final int[] sizes = fieldSizes();
      if ((sizes != null) && (index < sizes.length)) {
        int size = sizes[index];
        if ((size > 0) && (text.length() < size)) {
          StringBuffer s = new StringBuffer(text);
          size -= text.length();

          while (size-- > 0) {
            s.append(' ');
          }

          return s.toString();
        }
      }
    }
    return text;
  }

  abstract protected int[] fieldSizes();

  /**
   * Converts the integer field type to a string field type.
   * 
   * @param fieldType integer field type.
   * 
   * @return string field type.
   */
  protected static String fieldType(int fieldType) {
    switch (fieldType & FIELD_TYPE) {
    case FIELD_TYPE_STRING:
      return FIELD_TYPESTR_STRING;

    case FIELD_TYPE_DATE:
      return FIELD_TYPESTR_DATE;

    case FIELD_TYPE_BIGDECIMAL:
      return FIELD_TYPESTR_BIGDECIMAL;

    case FIELD_TYPE_SHORT:
      return FIELD_TYPESTR_SHORT;

    case FIELD_TYPE_INTEGER:
      return FIELD_TYPESTR_INTEGER;

    case FIELD_TYPE_LONG:
      return FIELD_TYPESTR_LONG;

    case FIELD_TYPE_FLOAT:
      return FIELD_TYPESTR_FLOAT;

    case FIELD_TYPE_DOUBLE:
      return FIELD_TYPESTR_DOUBLE;

    case FIELD_TYPE_BOOLEAN:
      return FIELD_TYPESTR_BOOLEAN;

    case FIELD_TYPE_TEXT:
      return FIELD_TYPESTR_TEXT;

    case FIELD_TYPE_DATEONLY:
      return FIELD_TYPESTR_DATEONLY;

    case FIELD_TYPE_DATETIME:
      return FIELD_TYPESTR_DATETIME;

    case FIELD_TYPE_TIMEONLY:
      return FIELD_TYPESTR_TIMEONLY;

    default:
      return FIELD_TYPESTR_UNKNOWN;
    }
  }

  /**
   * Converts a string field type into an integer field type.
   * 
   * @param fieldType string field type.
   * 
   * @return integer field type.
   */
  protected static int fieldType(String fieldType) {
    if ((fieldType == null) || (fieldType.length() == 0)) {
      return FIELD_TYPE_UNKNOWN;
    }

    if (fieldType.equals(FIELD_TYPESTR_STRING)) {
      return FIELD_TYPE_STRING;
    }

    if (fieldType.equals(FIELD_TYPESTR_DATE)) {
      return FIELD_TYPE_DATE;
    }

    if (fieldType.equals(FIELD_TYPESTR_BIGDECIMAL)) {
      return FIELD_TYPE_BIGDECIMAL;
    }

    if (fieldType.equals(FIELD_TYPESTR_SHORT)) {
      return FIELD_TYPE_SHORT;
    }

    if (fieldType.equals(FIELD_TYPESTR_INTEGER)) {
      return FIELD_TYPE_INTEGER;
    }

    if (fieldType.equals(FIELD_TYPESTR_LONG)) {
      return FIELD_TYPE_LONG;
    }

    if (fieldType.equals(FIELD_TYPESTR_FLOAT)) {
      return FIELD_TYPE_FLOAT;
    }

    if (fieldType.equals(FIELD_TYPESTR_DOUBLE)) {
      return FIELD_TYPE_DOUBLE;
    }

    if (fieldType.equals(FIELD_TYPESTR_BOOLEAN)) {
      return FIELD_TYPE_BOOLEAN;
    }

    if (fieldType.equals(FIELD_TYPESTR_TEXT)) {
      return FIELD_TYPE_TEXT;
    }

    if (fieldType.equals(FIELD_TYPESTR_DATEONLY)) {
      return FIELD_TYPE_DATEONLY;
    }

    if (fieldType.equals(FIELD_TYPESTR_DATETIME)) {
      return FIELD_TYPE_DATETIME;
    }

    if (fieldType.equals(FIELD_TYPESTR_TIMEONLY)) {
      return FIELD_TYPE_TIMEONLY;
    }

    return FIELD_TYPE_UNKNOWN;
  }

  /**
   * Converts DMO field parameter to a String. If the argument is null then the
   * empty string "" is returned.
   * 
   * @param s Short DMO field.
   * 
   * @return string representation of the parameter.
   */
  public static String toString(Short s) {
    return (s == null) ? "" : s.toString();
  }

  /**
   * Converts DMO field parameter to a String. If the argument is null then the
   * empty string "" is returned.
   * 
   * @param i Integer DMO field.
   * 
   * @return string representation of the parameter.
   */
  public static String toString(Integer i) {
    return (i == null) ? "" : i.toString();
  }

  /**
   * Converts DMO field parameter to a String. If the argument is null then the
   * empty string "" is returned.
   * 
   * @param l Long DMO field.
   * 
   * @return string representation of the parameter.
   */
  public static String toString(Long l) {
    return (l == null) ? "" : l.toString();
  }

  /**
   * Converts DMO field parameter to a String. If the argument is null then the
   * empty string "" is returned.
   * 
   * @param f Float DMO field.
   * 
   * @return string representation of the parameter.
   */
  public static String toString(Float f) {
    return (f == null) ? "" : f.toString();
  }

  /**
   * Converts DMO field parameter to a String. If the argument is null then the
   * empty string "" is returned.
   * 
   * @param d Double DMO field.
   * 
   * @return string representation of the parameter.
   */
  public static String toString(Double d) {
    return (d == null) ? "" : d.toString();
  }

  /**
   * Converts DMO field parameter to a String. If the argument is null then the
   * empty string "" is returned.
   * 
   * @param b Boolean DMO field.
   * 
   * @return string representation of the parameter.
   */
  public static String toString(Boolean b) {
    return (b == null) ? "" : b.toString();
  }

  /**
   * Converts DMO field parameter to a String. If the argument is null then the
   * empty string "" is returned.
   * 
   * @param d BigDecimal DMO field.
   * 
   * @return string representation of the parameter.
   */
  public static String toString(BigDecimal d) {
    return (d == null) ? "" : d.toString();
  }

  public static String getPadded(Class clazz, String text, int index) {
    Object instance;
    try {
      instance = clazz.newInstance();
    } catch (InstantiationException e) {
      return text;
    } catch (IllegalAccessException e) {
      return text;
    }
    return ((DMO) instance).getPadded(text, index);
  }

  /**
   * Trims spaces from the right-side of a string.
   * 
   * Noteably, leaves linebreaks etc.
   * 
   * @param txt the string to trim
   * @return the trimmed string.
   */
  public static String rtrim(String txt) {
    if (txt != null) {
      char[] val = txt.toCharArray();
      int i = val.length - 1;

      while (i >= 0 && val[i] <= ' ')
        i--;

      return i != val.length - 1 ? txt.substring(0, i + 1) : txt;
    }
    return null;
  }

}
