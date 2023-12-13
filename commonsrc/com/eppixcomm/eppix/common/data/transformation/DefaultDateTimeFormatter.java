/*
 * Created on May 17, 2004
 *
 */
package com.eppixcomm.eppix.common.data.transformation;

import java.io.Serializable;

import com.eppixcomm.eppix.common.util.DateTime;


/**
 * @author $Author: rtweedie $
 * @version $Revision: 1.1 $
 */
public class DefaultDateTimeFormatter implements TypeFormatter, Serializable {

  /* (non-Javadoc)
   * @see com.eppixcomm.eppix.common.data.transformation.FieldFormatter#format(java.lang.Object)
   */
  public String format( Object value ) throws Exception {

    return (value == null) ? "" : String.valueOf( ( (DateTime) value ).getTime(  ) );
  }

  /* (non-Javadoc)
   * @see com.eppixcomm.eppix.common.data.transformation.FieldFormatter#parse(java.lang.String)
   */
  public Object parse( String source ) throws Exception {

    return new DateTime( new Long( source ).longValue(  ) );
  }
}
