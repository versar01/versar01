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
 * This table stores the captured values for a Parameterised service.
 * <p>
 *   For each service created for a subscriber, a record on this table will be created per record on spa_service_params.
 * </p>
 *
 * This class contains any additional logic for PsdParamServDet, if any.
 * It extends the PsdParamServDetAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class PsdParamServDet extends PsdParamServDetAbstractBLO {

  public PsdParamServDetDMO getForPshParam(Integer pshId, Short paramId)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    
    logger.debug("getForPshParam (pshId, paramId)");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, PsdParamServDetDMO.psdPshIdFilter, pshId);
    filter.add(FilterOp.EQUAL, PsdParamServDetDMO.psdParamIdFilter, paramId);

    return get(filter);

  }
}
