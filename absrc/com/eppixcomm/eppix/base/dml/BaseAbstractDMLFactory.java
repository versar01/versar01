/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.dml;


/**
 * This is the superclass DMLFactory for Base.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class BaseAbstractDMLFactory
  extends DMLFactory {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BaseAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
	public BaseAbstractDMLFactory(  )
    throws DMLException {
    super( "base", // moduleName
      "base" // ModuleCode
     );
  }
}
