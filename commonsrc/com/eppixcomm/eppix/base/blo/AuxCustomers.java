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

//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.StringHelper;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import java.util.Collection;

/**
 * Any customer details held in addition to those on CUSTOMER (which is a shadow of the chameleon table and hence can not itself be extended).
 * <p>
 *   The customers' physical address is no longer stored on this table. It has moved to the aud_address table, which also
 *   holds any other addresses for the customer. The physical address is stored on there with an address_type of "CPHY".
 * </p>
 *
 * This class contains any additional logic for AuxCustomers, if any.
 * It extends the AuxCustomersAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class AuxCustomers
  extends AuxCustomersAbstractBLO {
	
	public String getKeyFieldValue(String accountNumber, String field) throws EPPIXBusinessException, EPPIXUnexpectedException, EPPIXFatalException {
		
		AuxCustomersDMO cust = new AuxCustomersDMO();
		cust.setBillAcNo(accountNumber);
		
		cust = get(cust);
		
		String attributeName = StringHelper.toLcase(StringHelper.underscoreSeperatedToCamelCase(field));
		String value = null;
		
		Class c = cust.getClass();
		
    try {
    /**]
     * TODO SJ: THe fioelds of a DMO class is declared private
     * and cannot be accessed outside of the class.
     * The method c.getField(attributeName) will therefore fail.
     * 
     *  Need to changes this to alternative method using the fields 
     *  getter method to retrive information.	
     */
    	
      Field keyField = c.getField(attributeName);
      value = (String)keyField.get(cust);
    } catch (NoSuchFieldException e) {
			e.printStackTrace();
    } catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		    
		return value;
	}

	protected Class getDACClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
