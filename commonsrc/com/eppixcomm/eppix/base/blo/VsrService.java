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
 * Each entry defines a service (like voice mail or itemised invoice).
 * <p>
 *   These are grouped under packages (see PACKAGE_SERVICE). Note that there is a mandatory 1 to 1 relationship with
 *   vsr2_service_aux. These tables are to be merged in a later phase.
 * </p>
 * <p>
 *   See the vst_service_type section for details of how to set up the data.
 * </p>
 *
 * This class contains any additional logic for VsrService, if any.
 * It extends the VsrServiceAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class VsrService
  extends VsrServiceAbstractBLO {
}
