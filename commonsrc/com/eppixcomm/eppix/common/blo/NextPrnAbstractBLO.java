/*============================================================================================= *
 *
 * (c) 2006 Copyright Eppixcomm.
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
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.base.blo.BaseBLO;
import com.eppixcomm.eppix.base.blo.BaseMessages;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DMO;

// import java.util.*;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Message;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Holds the next unique print number for printing purposes.
 * <p>
 * Forms the name of the spool file generated through the Chameleon spool
 * mechanism.
 * </p>
 * 
 * This abstract business logic class holds all the logic for the NextPrn class.
 * It is extended by NextPrn class which holds the additional logic that is
 * required, if any.
 * 
 * @author
 * @version $Revision: $
 * 
 * @since $jdk$
 */
public abstract class NextPrnAbstractBLO extends BaseBLO implements
    DTOActionTypes, BaseMessages {
  // ~ Static variables/initializers
  // //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower(NextPrn.class);

  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "NEXP";

  // ~ Instance variables
  // /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger();

  /** Data Access Controller. */
  protected NextPrnDAC nextPrnDAC;

  // ~ Methods
  // ////////////////////////////////////////////////////////////////

//  @Override
  protected Class getDACClass() {
    return NextPrnDAC.class;
  }
  
  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC(DAC dac) {
    this.nextPrnDAC = (NextPrnDAC) dac;
  }

  /**
   * Retrieve a nextPrn data model object from persistent storage. The
   * nextPrnDMO passed in must contain a valid existing nextPrnId.
   * Optionally, the return nextPrnDMO may be include a flag that
   * indicates if the nextPrn object is referenced elsewhere within the
   * module, depending on the value of the getIsUsed parameter. Finally,
   * optionally, this method can return the set of audit records for the
   * nextPrn object depending on the value of the getAudits parameter.
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl>
   * <dd>
   * <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#NEXTPRN_000}</li>
   * <li> The normal general errors:
   * {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd>
   * </dl>
   * <br>
   * 
   * @param nextPrnDMO
   *                the nextPrn object that must contain either the unique
   *                nextPrnId or the displayCode/languageCode pair
   * 
   * @return nextPrnDMO the nextPrn data model object
   * 
   * @throws EPPIXBusinessException
   * @throws EPPIXFatalException
   * @throws EPPIXUnexpectedException
   */
  public NextPrnDMO get(NextPrnDMO nextPrnDMO) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {
    logger.debug("get(nextPrnDMO" + ")");

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing("nextPrnDMO", nextPrnDMO);

    //
    // Each attribute that is part of the primary key is mandatory
    //

    //
    // Attempt to get the NextPrnDMO
    //
    NextPrnDMO returnNextPrnDMO = nextPrnDAC.get(nextPrnDMO);

    //
    // Could not find the NextPrnDMO
    //
    if (returnNextPrnDMO == null) {
      thrower.business(new Message("", ""), new Object[] {});
    }

    //
    // Now, based on the values of the flags on this method signature, which
    // in turn,
    // are based on this objects associations, get all associated, embedded
    // objects
    //
    return returnNextPrnDMO;
  }

  /**
   * Return a list of NextPrn objects matching the passed in values. A
   * partial match is performed on the description argument and/or the
   * nextPrns displayCode. If no values have been passed in, all NextPrn
   * objects are retrieved. Note: if a language specific description does
   * not exist, then the NextPrn is retrieved with the special 'NOCODE'
   * description.
   * 
   * @param state
   *                previous state of the list
   * @param nextPrnDMO
   *                NextPrnDMO object
   * 
   * @return DTOList of NextPrn objects
   * 
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList(DTOListState state, NextPrnDMO nextPrnDMO)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug("getList( state, nextPrnDMO )");

    return nextPrnDAC.getList(state, nextPrnDMO);
  }

  /**
   * Modifies the NextPrn object. On any modification, an audit object is
   * created.
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl>
   * <dd>
   * <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#NEXTPRN_002}</li>
   * <li>The normal general errors:
   * {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd>
   * </dl>
   * <br>
   * 
   * @param nextPrnDMO
   *                nextPrnDMO object<br>
   *                <dl>
   *                <dd> </dd>
   *                </dl>
   *                <br>
   * 
   * @return populated nextPrnDMO object.
   * 
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public NextPrnDMO nextPrn() throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {
    logger.debug("nextPrn()");

    NextPrnDMO updateNextPrnDMO = new NextPrnDMO();

    updateNextPrnDMO = nextPrnDAC.lock(updateNextPrnDMO);

    // increment the next Prn number
    int nextNum = updateNextPrnDMO.getNextPrn().intValue() + 1;

    // wrap around, if required
    if (nextNum >= 999999) {
      nextNum = 0;
    }
    updateNextPrnDMO.setNextPrn(new Integer(nextNum));

    //
    // Modify the nextPrnDMO
    //
    nextPrnDAC.modify(updateNextPrnDMO);

    // Create a new DMO, set keys, and fetch from the database...
    NextPrnDMO returnNextPrnDMO = new NextPrnDMO();

    returnNextPrnDMO = get(returnNextPrnDMO);

    return returnNextPrnDMO;
  }

  /**
   * Deletes the NextPrn object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl>
   * <dd>Base_NEXTPRN_003
   * <li>{@link #Base#NEXTPRN_000} if the NextPrn does not exist.</li>
   * <li>{@link #Base#NEXTPRN_003} if the NextPrn is in use.</li>
   * <li>The normal general errors:
   * {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd>
   * </dl>
   * 
   * @param NextPrnDMO
   *                NextPrn object with embedded displayCode and
   *                languageCode.
   * 
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete(NextPrnDMO nextPrnDMO) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {
    logger.debug("delete( nextPrnDMO )");

    thrower.ifParameterMissing("nextPrnDMO", nextPrnDMO);

    NextPrnDMO updateNextPrnDMO = null;

    updateNextPrnDMO = get(nextPrnDMO);

    // delete self...
    nextPrnDAC.delete(nextPrnDMO);
  }

}
