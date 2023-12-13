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

import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import java.math.BigDecimal;

import java.util.Collection;

/**
 * Holds the next unique print number for printing purposes.
 * <p>
 *   Forms the name of the spool file generated through the Chameleon spool mechanism.
 * </p>
 *
 * This class contains any additional logic for NextPrn, if any.
 * It extends the NextPrnAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class NextPrn
  extends NextPrnAbstractBLO {
}
