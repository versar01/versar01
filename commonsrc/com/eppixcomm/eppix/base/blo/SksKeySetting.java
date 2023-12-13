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

import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
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
 * This table holds the actual system key settings  for the site.
 * <p>
 *   Its will in the future replace the use of the chameleon sysdirm table.
 * </p>
 *
 * This class contains any additional logic for SksKeySetting, if any.
 * It extends the SksKeySettingAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class SksKeySetting extends SksKeySettingAbstractBLO {

  /**
   * Updates the system key value for the specified key.
   * 
   * @param key
   * @param value
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void modifyValue(String key, String value)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    
    logger.debug("modifyValue( key, value )");

    QueryFilter filter = new QueryFilter();

    filter.add(FilterOp.SET, SksKeySettingDMO.sksValueFilter, value);
    filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter, key);

    modify(filter);

  }

protected Class getDACClass() {
	// TODO Auto-generated method stub
	return null;
}
}
