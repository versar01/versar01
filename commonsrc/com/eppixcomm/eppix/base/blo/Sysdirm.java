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

//import com.eppixcomm.eppix.common.cache.MessageCache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;
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
 * CS3 table - used by Eppix to store system key details
 Description of the table is as found in the Oracle version of CS3
 *
 * This class contains any additional logic for Sysdirm, if any.
 * It extends the SysdirmAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class Sysdirm extends SysdirmAbstractBLO {

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

    filter.add(FilterOp.SET, SysdirmDMO.keyValueFilter, value);
    filter.add(FilterOp.EQUAL, SysdirmDMO.systemKeyFilter, key);

    modify(filter);

  }

//  public void checkAllocationActive(IpInstantParamDMO instantParamDMO)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
    //      CALL lock_system_key("ASALCRUNS") RETURNING l_status, l_value
    //
    //      IF l_status != 0 THEN
    //          # Unable to lock system key - Exit
    //          LET m_error_text = get_mess(30899),
    //              " ASALCRUNS - ",l_status USING "-<<<<<&"
    //          CALL report_error(m_error_text)
    //
    //          RETURN
    //      END IF
    //
    //      # Check that no call allocations are currently running
    //      IF l_value > 0 THEN
    //          # Call allocation running
    //          CALL update_ip_error(m_process_id,"","",30758,get_mess(30758))
    //          RETURNING l_status
    //
    //          # Unlock system key
    //          CALL unlock_system_key() RETURNING l_status
    //
    //          RETURN
    //      END IF
    //
    //      # Decrement system key to show demand bill running
    //      LET l_number = l_value
    //      LET l_value =(l_number - 1)
    //
    //      # Update and unlock currently locked system key
    //      CALL update_system_key(l_value) RETURNING l_status
//    DAOIterator<SysdirmDMO> iterator = null;
//    try {
//      QueryFilter filter = new QueryFilter();
//      filter.add(FilterOp.EQUAL, SysdirmDMO.systemKeyFilter, "ASALCRUNS");
//
//      iterator = iterateWithLock(filter);
//      
//      if(!iterator.hasNext()){
//          // Unable to get/lock system key - Exit
//          String errorText = messages.getMessage(30899);
//          base.ipInstantParam().maintainIpErrors(instantParamDMO, 0, "", 30899,
//              errorText);
//          throw new EPPIXFatalException(errorText);
//      }
//
//      while (iterator.hasNext()) {
//        SysdirmDMO sysdirmDMO = iterator.next();
//        // Check that no call allocations are currently running
//        if (Integer.parseInt(sysdirmDMO.getKeyValue()) > 0) {
//          String errorText = messages.getMessage(30758);
//          base.ipInstantParam().maintainIpErrors(instantParamDMO, 0, "", 30758,
//              errorText);
//          throw new EPPIXFatalException(errorText);
//        }
//        sysdirmDMO.setKeyValue("-1");
//        modify(sysdirmDMO);
//      }
//
//    } finally {
//      iterator.close();
//    }
//  }

//  public void resetAllocation(IpInstantParamDMO instantParamDMO)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//
//    DAOIterator<SysdirmDMO> iterator = null;
//    try {
//      QueryFilter filter = new QueryFilter();
//      filter.add(FilterOp.EQUAL, SysdirmDMO.systemKeyFilter, "ASALCRUNS");
//
//      iterator = iterateWithLock(filter);
//
//      if(!iterator.hasNext()){
//        // Unable to get/lock system key - Exit
//        String errorText = messages.getMessage(30899);
//        base.ipInstantParam().maintainIpErrors(instantParamDMO, 0, "", 30899,
//            errorText);
//        throw new EPPIXFatalException(errorText); 
//      }
//      
//      while (iterator.hasNext()) {
//        SysdirmDMO sysdirmDMO = iterator.next();
//
//        sysdirmDMO.setKeyValue("0");
//        modify(sysdirmDMO);
//      }
//
//    } finally {
//      iterator.close();
//    }
//  }
}
