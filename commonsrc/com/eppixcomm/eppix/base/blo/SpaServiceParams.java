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
package com.eppixcomm.eppix.base.blo;

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
 * Defines the parameters relevant to services of this parameterised service type.
 * <p>
 *   A group of records will exist for each Parameterised Service Type record on vst_service_types.
 * </p>
 * <p>
 *   A tt_type_text group will exist for each parameter. The group name will be the same as the parameter name. The records in
 *   the group for a given parameter will provide a list of the valid values for that parameter.
 * </p>
 *
 * This class contains any additional logic for SpaServiceParams, if any.
 * It extends the SpaServiceParamsAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class SpaServiceParams
  extends SpaServiceParamsAbstractBLO {
}
