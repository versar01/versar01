package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * This table is used to group together the captured values for a Parameterised service.
 * <p>
 *   Via this table, the parameter values (psd_param_serv_det) will be linked at the appropriate level. Eg For a service
 *   relevant only at subscriber level, the SIM and MSISDN numbers will be blank.
 * </p>
 *
 * This class contains any additional logic for PshParamServHdr, if any.
 * It extends the PshParamServHdrAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class PshParamServHdr extends PshParamServHdrAbstractBLO {

  /**
   * Gets a {@link PshParamServHdrDMO} for the specified parameters.
   * 
   * @param subscriberId
   * @param serviceCode
   * @param simNo (optional)
   * @param msisdnNo (optional)
   * @return a {@link PshParamServHdrDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * TODO SJ Maybe need to change this method to address 
   * additional field PshserviceType
   * 
   */
  public PshParamServHdrDMO getForSubServSim(Integer subscriberId,
      String serviceCode, String simNo, String msisdnNo) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getForSubServSim( subscriberId, serviceCode, simNo, msisdnNo )");
    
    thrower.ifParameterMissing("subscriberId", subscriberId);
    thrower.ifParameterMissing("serviceCode", serviceCode);
    
    QueryFilter filter = new QueryFilter();

    filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshSubscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshServiceCodeFilter,
        serviceCode);
    
//    filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshServiceTypeFilter,
//            serviceType);
    
    if (!DMO.isNull(simNo)) {
      filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshSimNoFilter, simNo);
    } else {
      
      if (!DMO.isNull(msisdnNo)) {
        filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshMsisdnNoFilter, msisdnNo);
      } else {
        filter.add(FilterOp.NULL, PshParamServHdrDMO.pshSimNoFilter);
        filter.add(FilterOp.NULL, PshParamServHdrDMO.pshMsisdnNoFilter);
      }
    }
    filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshArchivedFilter, "N");

    return get(filter);
  }
}
