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


public class UrsUrlSetting extends UrsUrlSettingAbstractBLO {


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


    filter.add(FilterOp.SET, UrsUrlSettingDMO.ursValueFilter, value);

    filter.add(FilterOp.EQUAL, UrsUrlSettingDMO.ursUrlCodeFilter, key);


    modify(filter);


  }


protected Class getDACClass() {

	// TODO Auto-generated method stub

	return null;

}

}
