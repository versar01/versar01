package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOIterator;
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
 * This table holds call pre-charge details.
 *
 * This class contains any additional logic for CpcCallPrecharge, if any.
 * It extends the CpcCallPrechargeAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class CpcCallPrecharge extends CpcCallPrechargeAbstractBLO {

  public void modifyForCpcId(BigDecimal remaining, Date invoiceDate,
      Long invoiceNumber, BigDecimal lastCredit, Integer cpcId)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, CpcCallPrechargeDMO.cpcRemainingFilter, remaining);
    filter.add(FilterOp.SET, CpcCallPrechargeDMO.cpcLastBilldateFilter,
        invoiceDate);
    filter.add(FilterOp.SET, CpcCallPrechargeDMO.cpcLastInvoiceFilter, invoiceNumber);
    filter.add(FilterOp.SET, CpcCallPrechargeDMO.cpcLastCreditFilter,
        lastCredit);

    filter.add(FilterOp.EQUAL, CpcCallPrechargeDMO.cpcIdFilter, cpcId);

    modify(filter);
  }

  public DAOIterator getIteratorOnSubscriber(
      Integer subscriberId, boolean isCreditTotalBill)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    QueryFilter filter = new QueryFilter();

    filter.add(FilterOp.EQUAL, CpcCallPrechargeDMO.cpcSubscriberFilter,
        subscriberId);

    if (isCreditTotalBill) {
      filter.add(FilterOp.ORDERBYASC, CpcCallPrechargeDMO.cpcSimNoFilter);
      filter.add(FilterOp.ORDERBYASC,
          CpcCallPrechargeDMO.cpcPrechargeDateFilter);
    } else {
      filter.add(FilterOp.ORDERBYASC, CpcCallPrechargeDMO.cpcMsisdnFilter);
      filter.add(FilterOp.ORDERBYASC,
          CpcCallPrechargeDMO.cpcPrechargeDateFilter);
    }

    return iterateWithLock(filter);
  }

  public boolean getForDiallingNo() throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.LIKE, CpcCallPrechargeDMO.cpcMsisdnFilter, "%");

    return exists(filter);

  }
}
