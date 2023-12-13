package com.eppixcomm.eppix.common.data;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

//import org.apache.log4j.Logger;
import org.jdom.Element;


public class DAOArgs {

  private static final int DEFAULT_MAX_ARGS = 10;

  protected Object[] args = null;

  protected int[] argTypes = null;

  /** The number of arguments. */
  protected int count = 0;

  private List clobArgs = null;

  private int maxField = -1;

  public int getMaxField() {
	return maxField;
  }

  public void setMaxField(int maxField) {
    this.maxField = maxField;
  }

  // Constructors //////////////////////////////////////////////////////////////

  /**
   * This constructor is invoked by the {@link com.eppixcomm.eppix.common.data.DBO} 
   * superclass to provide its fields to the DAOImpl so they can be bound to
   * placeholders in prepared SQL statements.
   */
  protected DAOArgs(int[] argTypes, Object[] args) {
    this.argTypes = argTypes;
    this.args = args;
    if (args != null)
      this.count = args.length;
  }


  public DAOArgs() {
    args = new Object[DEFAULT_MAX_ARGS];
    argTypes = new int[DEFAULT_MAX_ARGS];
  }

  public DAOArgs(int maxArgs) {
    if (maxArgs <= 0)
      maxArgs = 10;
    args = new Object[maxArgs];
    argTypes = new int[maxArgs];
  }

  public void checkArgs(int length) {
    if (count + length >= args.length) {
      Object[] temp = new Object[count + length];
      for (int i = 0; i < args.length; i++) {
        temp[i] = args[i];
      }
      args = temp;

      int[] ti = new int[count + length];
      for (int i = 0; i < argTypes.length; i++) {
        ti[i] = argTypes[i];
      }
      argTypes = ti;
    }
  }

  // Argument appender methods /////////////////////////////////////////////////

  public DAOArgs arg(Object o) {
    if (o instanceof String) {
      return arg((String) o);
    } else if (o instanceof com.eppixcomm.eppix.common.util.Date) {
      return arg((com.eppixcomm.eppix.common.util.Date) o);
    } else if (o instanceof com.eppixcomm.eppix.common.util.DateTime) {
      return arg((com.eppixcomm.eppix.common.util.DateTime) o);
    } else if (o instanceof com.eppixcomm.eppix.common.util.Time) {
      return arg((com.eppixcomm.eppix.common.util.Time) o);
    } else if (o instanceof BigDecimal) {
      return arg((BigDecimal) o);
    } else if (o instanceof Short) {
      return arg((Short) o);
    } else if (o instanceof Integer) {
      return arg((Integer) o);
    } else if (o instanceof Float) {
      return arg((Float) o);
    } else if (o instanceof Long) {
      return arg((Long) o);
    } else if (o instanceof Double) {
      return arg((Double) o);
    } else if (o instanceof Boolean) {
      return arg((Boolean) o);
    }else {
    }

    return this;
  }

  public DAOArgs arg(Object o, int type) {
      argTypes[count] = type;
      args[count++] = o;
      return this;
  }

  public DAOArgs arg(String s) {
    argTypes[count] = DMO.FIELD_TYPE_STRING;
    args[count++] = s;
    return this;
  }

  public DAOArgs arg(java.util.Date d) {
    argTypes[count] = DMO.FIELD_TYPE_DATE;
    args[count++] = d;
    return this;
  }

  public DAOArgs arg(com.eppixcomm.eppix.common.util.Date d) {
    argTypes[count] = DMO.FIELD_TYPE_DATEONLY;
    args[count++] = d;
    return this;
  }

  public DAOArgs arg(com.eppixcomm.eppix.common.util.DateTime dt) {
    argTypes[count] = DMO.FIELD_TYPE_DATETIME;
    args[count++] = dt;
    return this;
  }

  public DAOArgs arg(com.eppixcomm.eppix.common.util.Time t) {
    argTypes[count] = DMO.FIELD_TYPE_TIMEONLY;
    args[count++] = t;
    return this;
  }

  public DAOArgs arg(BigDecimal d) {
    argTypes[count] = DMO.FIELD_TYPE_BIGDECIMAL;
    args[count++] = d;
    return this;
  }

  public DAOArgs arg(Short s) {
    argTypes[count] = DMO.FIELD_TYPE_SHORT;
    args[count++] = s;
    return this;
  }

  public DAOArgs arg(short s) {
    argTypes[count] = DMO.FIELD_TYPE_SHORT;
    args[count++] = new Short(s);
    return this;
  }

  public DAOArgs arg(Integer i) {
    argTypes[count] = DMO.FIELD_TYPE_INTEGER;
    args[count++] = i;
    return this;
  }

  public DAOArgs arg(int i) {
    argTypes[count] = DMO.FIELD_TYPE_INTEGER;
    args[count++] = new Integer(i);
    return this;
  }

  public DAOArgs arg(Long l) {
    argTypes[count] = DMO.FIELD_TYPE_LONG;
    args[count++] = l;
    return this;
  }

  public DAOArgs arg(long l) {
    argTypes[count] = DMO.FIELD_TYPE_LONG;
    args[count++] = new Long(l);
    return this;
  }

  public DAOArgs arg(Float f) {
    argTypes[count] = DMO.FIELD_TYPE_FLOAT;
    args[count++] = f;
    return this;
  }

  public DAOArgs arg(float f) {
    argTypes[count] = DMO.FIELD_TYPE_FLOAT;
    args[count++] = new Float(f);
    return this;
  }

  public DAOArgs arg(Double d) {
    argTypes[count] = DMO.FIELD_TYPE_DOUBLE;
    args[count++] = d;
    return this;
  }

  public DAOArgs arg(double d) {
    argTypes[count] = DMO.FIELD_TYPE_DOUBLE;
    args[count++] = new Double(d);
    return this;
  }

  public DAOArgs arg(Boolean b) {
    argTypes[count] = DMO.FIELD_TYPE_BOOLEAN;
    args[count++] = b;
    return this;
  }

  public DAOArgs arg(boolean b) {
    argTypes[count] = DMO.FIELD_TYPE_BOOLEAN;
    args[count++] = new Boolean(b);
    return this;
  }

  public DAOArgs reset() {
    count = 0;
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
   * Formats the arguments into a pipe delimited string. Arguments provided by
   * a DMO that have attributes of {@link DMO#FIELD_ATTR_QUERYONLY} or
   * {@link DMO#FIELD_ATTR_QUERYONLY} are omitted from the string.
   * 
   * @return pipe delimited string representation of the arguments.  
   */
  public String toString() {
    return toString(null);
  }

  /**
   * Formats the arguments into a pipe delimited string and appends them to 
   * argString.
   * 
   * @param argString string of arguments to append.
   * 
   * @return pipe delimited string representation of the arguments.
   */
  public String toString(String argString) {

    StringBuffer stringBuffer = new StringBuffer(100);
    if (argString != null) {
      stringBuffer.append(argString);
    }
    for (int argTypeIdx = 0, argIdx = 0; argTypeIdx < argTypes.length
        && argIdx < count; ++argTypeIdx) {

      // do not bind read/query only fields
      if ((argTypes[argTypeIdx] & DMO.FIELD_ATTR_QUERYONLY) == DMO.FIELD_ATTR_QUERYONLY) {
        continue;
      }

      if (stringBuffer.length() > 0) {
        stringBuffer.append("|");
      }

      stringBuffer
          .append((args[argIdx] == null ? "" : args[argIdx].toString()));

      ++argIdx;
    }

    return stringBuffer.toString();
  }

  /**
   * Formats the arguments into XML. Arguments provided by
   * a DMO that have attributes of {@link DMO#FIELD_ATTR_QUERYONLY} or
   * {@link DMO#FIELD_ATTR_QUERYONLY} are omitted.  
   */
  public Element toXML(Element xml) {

    xml.setAttribute("numArgs", Integer.toString(count));

    for (int argTypeIdx = 0, argIdx = 0; argTypeIdx < argTypes.length
        && argIdx < count; ++argTypeIdx) {

      // do not bind read/query only fields
      if ((argTypes[argTypeIdx] & DMO.FIELD_ATTR_QUERYONLY) == DMO.FIELD_ATTR_QUERYONLY) {
        continue;
      }

      xml.addContent(new Element("arg").setAttribute("type",
          DMO.fieldType(argTypes[argIdx]))
          .setText(this.args[argIdx].toString()));

      ++argIdx;
    }
    return xml;
  }

  /**
   * This method is invoked by the DAOImpl to bind the arguments to placeholders
   * in the prepared statement.
   * 
   * @param ps prepared statemnt.
   * @param pos position of the next placeholder to bind.
   * 
   * @throws SQLException
   */
  protected int bind(PreparedStatement ps, int pos) throws SQLException {

    if (clobArgs != null) {
      clobArgs.clear();
    }
    
//    System.out.println("ARGUMENTS SET FOR THIS DAOArgs: " + argTypes);
    
    for (int argTypeIdx = 0, argIdx = 0; argTypeIdx < argTypes.length; ++argTypeIdx) {
  
      // do not bind read/query only fields
      if ((argTypes[argTypeIdx] & DMO.FIELD_ATTR_QUERYONLY) == DMO.FIELD_ATTR_QUERYONLY) {
        continue;
      }

//      System.out.println("ARGUMENTS TO SET IN PSTM: LOOP: " + argIdx);
      
      switch (argTypes[argTypeIdx] & DMO.FIELD_TYPE) {

      case DMO.FIELD_TYPE_STRING:
        ps.setString(pos++, (String) args[argIdx]);
        break;

      case DMO.FIELD_TYPE_DATE:

        if (args[argIdx] == null) {
//        	System.out.println("FIELD_TYPE_DATE: IS NULL AND SET TO NULL" );
        	
          ps.setNull(pos++, Types.TIMESTAMP);

        } else {

          ps.setTimestamp(pos++, new java.sql.Timestamp(
              ((java.util.Date) args[argIdx]).getTime()));
        }
        break;

      case DMO.FIELD_TYPE_DATEONLY:

        if (args[argIdx] == null) {
//        	System.out.println("FIELD_TYPE_DATEONLY: IS NULL AND SET TO NULL");
          ps.setNull(pos++, Types.DATE);

        } else {

          ps.setDate(pos++, new java.sql.Date(((java.util.Date) args[argIdx])
              .getTime()));
        }
        break;

      case DMO.FIELD_TYPE_DATETIME:

        if (args[argIdx] == null) {
//        	System.out.println("FIELD_TYPE_DATETIME: IS NULL AND SET TO NULL");
          ps.setNull(pos++, Types.TIMESTAMP);

        } else {

          ps.setTimestamp(pos++, new java.sql.Timestamp(
              ((java.util.Date) args[argIdx]).getTime() / 1000 * 1000));
        }
        break;

      case DMO.FIELD_TYPE_TIMEONLY:

        if (args[argIdx] == null) {

          ps.setNull(pos++, Types.TIME);

        } else {

          ps.setTime(pos++, new java.sql.Time(((java.util.Date) args[argIdx])
              .getTime()));
        }
        break;

      case DMO.FIELD_TYPE_BIGDECIMAL:
        ps.setBigDecimal(pos++, (BigDecimal) args[argIdx]);
        break;

      case DMO.FIELD_TYPE_SHORT:
        if (args[argIdx] == null) {

          ps.setNull(pos++, Types.SMALLINT);

        } else {

          ps.setShort(pos++, ((Short) args[argIdx]).shortValue());
        }
        break;

      case DMO.FIELD_TYPE_INTEGER:
        if (args[argIdx] == null) {

          ps.setNull(pos++, Types.INTEGER);

        } else {

          ps.setInt(pos++, ((Integer) args[argIdx]).intValue());
        }
        break;

      case DMO.FIELD_TYPE_LONG:
        if (args[argIdx] == null) {

          ps.setNull(pos++, Types.BIGINT);

        } else {

          ps.setLong(pos++, ((Long) args[argIdx]).longValue());
        }
        break;

      case DMO.FIELD_TYPE_FLOAT:
        if (args[argIdx] == null) {

          ps.setNull(pos++, Types.FLOAT);

        } else {
//        System.out.println("FLOAT VALUE: " + args[argIdx] + " INDEX POS: " + argIdx);
          ps.setFloat(pos++, ((Float) args[argIdx]).floatValue());
        }
        break;

      case DMO.FIELD_TYPE_DOUBLE:
        if (args[argIdx] == null) {

          ps.setNull(pos++, Types.DOUBLE);

        } else {

          ps.setDouble(pos++, ((Double) args[argIdx]).doubleValue());
        }
        break;

      case DMO.FIELD_TYPE_BOOLEAN:
        if (args[argIdx] == null) {

          ps.setNull(pos++, Types.BIT);

        } else {

          ps.setBoolean(pos++, ((Boolean) args[argIdx]).booleanValue());
        }
        break;

      /**
       * This field type is only ever bound as a placeholder for an INSERT or
       * UPDATE statement. It can not be bound as a filter.
       */
      case DMO.FIELD_TYPE_TEXT:
        ps.setString(pos, " "); // Initialise the CLOB for INSERT.
        if (clobArgs == null) {
          clobArgs = new ArrayList();
        }
        clobArgs.add(new ClobArg(argTypeIdx + 1, pos++, (String) args[argIdx]));
        break;
      }
      ++argIdx;
    }
    return pos;
  }

  /**
   * Only valid succeeding a call to {@link DAOArgs#bind(PreparedStatement, int)},
   * this method indicates whether this DAOArgs object contains any arguments of 
   * type CLOB (or {@link DMO#FIELD_TYPE_TEXT}).
   */
  boolean containsClob() {
    return (clobArgs != null);
  }

  /**
   * Only valid succeeding a call to {@link DAOArgs#bind(PreparedStatement, int)},
   * this method returns the list of CLOB arguments or null if this DAOArgs 
   * object does not contain any arguments of type CLOB.
   */
  List getClobArgs() {
    return clobArgs;
  }

  class ClobArg {

    private int getPos;

    private int setPos;

    private String argStr;

    /**
     * Creates a new ClobArg.
     * 
     * @param getPos argument position in result set.
     * @param setPos argument position in prepared statement.
     * @param argStr the argument string.
     */
    private ClobArg(int getPos, int setPos, String argStr) {
      this.getPos = getPos;
      this.setPos = setPos;
      this.argStr = argStr;
    }

    /**
     * Returns the position of the argument in the result set.
     */
    int getPos() {
      return getPos;
    }

    /**
     * Returns the position of the argument in the prepared statement (INSERT or
     * UPDATE).
     */
    int getSetPos() {
      return setPos;
    }

    /**
     * Returns true if the argument is null.
     */
    boolean isNull() {
      return argStr == null || argStr.length() == 0;
    }

    /**
     * Writes the argument to the specified writer.
     */
    void write(Writer w) throws IOException {

      w.write(argStr);
      w.flush();
      w.close();
    }
  }

  public int getCount() {
    return count;
  }
}