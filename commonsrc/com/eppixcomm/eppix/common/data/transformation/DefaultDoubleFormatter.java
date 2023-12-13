/*
 * Created on May 12, 2004
 *
 */
package com.eppixcomm.eppix.common.data.transformation;

import java.io.Serializable;


/**
 * @author $Author: rtweedie $
 * @version $Revision: 1.1 $
 *
 */
public class DefaultDoubleFormatter implements TypeFormatter, Serializable {

  /* (non-Javadoc)
   * @see com.eppixcomm.eppix.common.data.FieldFormatter#format(java.lang.Object)
   */
  public String format( Object value ) throws Exception {

    return (value == null) ? "" : value.toString(  );
  }

  /* (non-Javadoc)
   * @see com.eppixcomm.eppix.common.data.FieldFormatter#parse(java.lang.String)
   */
  public Object parse( String source ) throws Exception {

    return new Double( source );
  }
}
