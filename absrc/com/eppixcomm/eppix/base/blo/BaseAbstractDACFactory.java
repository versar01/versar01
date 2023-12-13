/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
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

import java.sql.Connection;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.dml.*;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DACFactory;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public abstract class BaseAbstractDACFactory
  extends DACFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static Thrower thrower = Thrower.getThrower( BaseAbstractDACFactory.class );

  //~ Instance variables /////////////////////////////////////////////////////

  private Logger logger = thrower.getLogger(  );

  //~ Constructors ////////////////////////////////////

  /**
   * Creates a new BaseAbstractDACFactory object.
   *
   * @param userContext the user's context.
   *
   * @throws EPPIXFatalException
   */
  public BaseAbstractDACFactory( UserContext userContext )
    throws EPPIXFatalException {
    super(  "java:comp/env/eppix/Base/DataSource", thrower );
  }

  /**
   * Creates a new BaseAbstractDACFactory object.
   *
   * @param userContext DOCUMENT ME!
   * @param connection DOCUMENT ME!
   *
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public BaseAbstractDACFactory( 
    UserContext userContext,
    Connection  connection )
    throws EPPIXFatalException {
    super(  connection, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  public DAC getDAC( Class clazz )
  throws EPPIXFatalException {
  if ( clazz == SysdirmDAC.class ) {
    return (DAC) getSysdirmDAC(  );
  } else if ( clazz == AuxCustomersDAC.class ) {
    return (DAC) getAuxCustomersDAC(  );
  } else if ( clazz == TtTypeTextDAC.class ) {
    return (DAC) getTtTypeTextDAC(  );
  } else if ( clazz == NmNetmatDAC.class ) {
    return (DAC) getNmNetmatDAC(  );
  } else if ( clazz == SlcustmDAC.class ) {
    return (DAC) getSlcustmDAC(  );
  } else if ( clazz == SksKeySettingDAC.class ) {
    return (DAC) getSksKeySettingDAC(  );
  } else if ( clazz == SbdSubDetsDAC.class ) {
    return (DAC) getSbdSubDetsDAC(  );
  } 


  return null;
}  
  
  public ActAccTypesDAC getActAccTypesDAC(  )
  throws EPPIXFatalException {
  logger.debug( "getActAccTypesDAC()" );

  try {
    return (ActAccTypesDAC) getDAC( ActAccTypesDACImpl.class,
    		ActAccTypesDMLFactory.getDMLFactory(  ) );
  } catch ( DMLException e ) {
    thrower.fatal( e );
  }

  return null;
}
 
  /**
   * Instantiates a Data Access Controller for use in the AuxCustomers
   * Business Logic Object.
   *
   * @return AuxCustomers Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public AuxCustomersDAC getAuxCustomersDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getAuxCustomersDAC()" );

    try {
      return (AuxCustomersDAC) getDAC( AuxCustomersDACImpl.class,
        AuxCustomersDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }

  /**
   * Instantiates a Data Access Controller for use in the TtTypeText
   * Business Logic Object.
   *
   * @return TtTypeText Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public TtTypeTextDAC getTtTypeTextDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getTtTypeTextDAC()" );

    try {
      return (TtTypeTextDAC) getDAC( TtTypeTextDACImpl.class,
        TtTypeTextDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }


  /**
   * Instantiates a Data Access Controller for use in the NmNetmat
   * Business Logic Object.
   *
   * @return NmNetmat Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public NmNetmatDAC getNmNetmatDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getNmNetmatDAC()" );

    try {
      return (NmNetmatDAC) getDAC( NmNetmatDACImpl.class,
        NmNetmatDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }

  /**
   * Instantiates a Data Access Controller for use in the VamActiveMsisdn
   * Business Logic Object.
   *
   * @return VamActiveMsisdn Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public VamActiveMsisdnDAC getVamActiveMsisdnDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getVamActiveMsisdnDAC()" );

    try {
      return (VamActiveMsisdnDAC) getDAC( VamActiveMsisdnDACImpl.class,
        VamActiveMsisdnDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }


  /**
   * Instantiates a Data Access Controller for use in the Slcustm
   * Business Logic Object.
   *
   * @return Slcustm Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public SlcustmDAC getSlcustmDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getSlcustmDAC()" );

    try {
      return (SlcustmDAC) getDAC( SlcustmDACImpl.class,
        SlcustmDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }

  /**
   * Instantiates a Data Access Controller for use in the SbdSubDets
   * Business Logic Object.
   *
   * @return SbdSubDets Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public SbdSubDetsDAC getSbdSubDetsDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getSbdSubDetsDAC()" );

    try {
      return (SbdSubDetsDAC) getDAC( SbdSubDetsDACImpl.class,
        SbdSubDetsDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }

  public CdiDatabaseIntDAC getCdiDatabaseIntDAC(  )
  throws EPPIXFatalException {
  logger.debug( "getCdiDatabaseIntDAC()" );

  try {
    return (CdiDatabaseIntDAC) getDAC( CdiDatabaseIntDACImpl.class,
        CdiDatabaseIntDMLFactory.getDMLFactory(  ) );
  } catch ( DMLException e ) {
    thrower.fatal( e );
  }

  return null;
}

  /**
   * Instantiates a Data Access Controller for use in the DchDealerClmHdr
   * Business Logic Object.
   *
   * @return DchDealerClmHdr Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public DchDealerClmHdrDAC getDchDealerClmHdrDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getDchDealerClmHdrDAC()" );

    try {
      return (DchDealerClmHdrDAC) getDAC( DchDealerClmHdrDACImpl.class,
        DchDealerClmHdrDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }

  /**
   * Instantiates a Data Access Controller for use in the DlaDealClaimArc
   * Business Logic Object.
   *
   * @return DlaDealClaimArc Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public DlaDealClaimArcDAC getDlaDealClaimArcDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getDlaDealClaimArcDAC()" );

    try {
      return (DlaDealClaimArcDAC) getDAC( DlaDealClaimArcDACImpl.class,
        DlaDealClaimArcDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }
  
  /**
   * Instantiates a Data Access Controller for use in the SksKeySetting
   * Business Logic Object.
   *
   * @return SksKeySetting Data Access Controller.
   *
   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
   */
  public SksKeySettingDAC getSksKeySettingDAC(  )
    throws EPPIXFatalException {
    logger.debug( "getSksKeySettingDAC()" );

    try {
      return (SksKeySettingDAC) getDAC( SksKeySettingDACImpl.class,
        SksKeySettingDMLFactory.getDMLFactory(  ) );
    } catch ( DMLException e ) {
      thrower.fatal( e );
    }

    return null;
  }
  
  public SysdirmDAC getSysdirmDAC()throws EPPIXFatalException {
	    logger.debug("getSysdirmDAC()");

	    try {
	        return (SysdirmDAC) getDAC( SysdirmDACImpl.class,
	          SysdirmDMLFactory.getDMLFactory(  ) );
	      } catch ( DMLException e ) {
	        thrower.fatal( e );
	      }
	    return null;
	  }
  
  public PptPrepaidTypesDAC getPptPrepaidTypesDAC() throws EPPIXFatalException{
	    logger.debug("getSysdirmDAC()");

	    try {
	        return (PptPrepaidTypesDAC) getDAC( PptPrepaidTypesDACImpl.class,
	        		PptPrepaidTypesDMLFactory.getDMLFactory(  ) );
	      } catch ( DMLException e ) {
	        thrower.fatal( e );
	      }
	    return null;
  }
  
  public PtmPermToMarketDAC getPtmPermToMarketDAC() throws EPPIXFatalException{
	    logger.debug("getSysdirmDAC()");

	    try {
	        return (PtmPermToMarketDAC) getDAC( PtmPermToMarketDACImpl.class,
	        		PtmPermToMarketDMLFactory.getDMLFactory(  ) );
	      } catch ( DMLException e ) {
	        thrower.fatal( e );
	      }
	    return null;
  }
  
  public SbhSubHistoryDAC getSbhSubHistoryDAC() throws EPPIXFatalException{
	    logger.debug("getSysdirmDAC()");

	    try {
	        return (SbhSubHistoryDAC) getDAC( SbhSubHistoryDACImpl.class,
	        		SbhSubHistoryDMLFactory.getDMLFactory(  ) );
	      } catch ( DMLException e ) {
	        thrower.fatal( e );
	      }
	    return null;
  }
  
	  public SbuSubUpgradeDAC getSbuSubUpgradeDAC() throws EPPIXFatalException{
		    logger.debug("getSysdirmDAC()");
	
		    try {
		        return (SbuSubUpgradeDAC) getDAC( SbuSubUpgradeDACImpl.class,
		        		SbuSubUpgradeDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;
	  }
	  
	  public SmnSimNosDAC getSmnSimNosDAC() throws EPPIXFatalException{
		    logger.debug("getSmnSimNosDAC()");
	
		    try {
		        return (SmnSimNosDAC) getDAC( SmnSimNosDACImpl.class,
		        		SmnSimNosDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;
	  }
	  
	  public SvrServRuleDAC getSvrServRuleDAC()throws EPPIXFatalException{
		    logger.debug("getSvrServRuleDAC()");
	
		    try {
		        return (SvrServRuleDAC) getDAC( SvrServRuleDACImpl.class,
		        		SvrServRuleDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;
	  }
	  
	  public TpTariffPlanDAC getTpTariffPlanDAC()throws EPPIXFatalException{
		    logger.debug("getTpTariffPlanDAC()");
	
		    try {
		        return (TpTariffPlanDAC) getDAC( TpTariffPlanDACImpl.class,
		        		TpTariffPlanDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;
	  }
	  
	  public SortcodesDAC getSortcodesDAC()throws EPPIXFatalException{
		    logger.debug("getSortcodesDAC()");
	
		    try {
		        return (SortcodesDAC) getDAC( SortcodesDACImpl.class,
		        		SortcodesDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;
	  }	  
	  
	  public VpnProviderNetwkDAC getVpnProviderNetwkDAC()throws EPPIXFatalException{
		    logger.debug("getVpnProviderNetwkDAC()");
			
		    try {
		        return (VpnProviderNetwkDAC) getDAC( VpnProviderNetwkDACImpl.class,
		        		VpnProviderNetwkDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;		  
	  }
	  

	  public VpkPackageDAC getVpkPackageDAC()throws EPPIXFatalException{
		    logger.debug("getVpnProviderNetwkDAC()");
			
		    try {
		        return (VpkPackageDAC) getDAC( VpkPackageDACImpl.class,
		        		VpkPackageDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;		  
	  }
	  
	  public VprProviderDAC getVprProviderDAC()throws EPPIXFatalException{
		    logger.debug("getVprProviderDAC()");
			
		    try {
		        return (VprProviderDAC) getDAC( VprProviderDACImpl.class,
		        		VprProviderDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;		  
		  
	  }
	  
	  public VpsPackageServDAC getVpsPackageServDAC()throws EPPIXFatalException{
		    logger.debug("getVpsPackageServDAC()");
			
		    try {
		        return (VpsPackageServDAC) getDAC( VpsPackageServDACImpl.class,
		        		VpsPackageServDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;		  
		  
	  }
	  
	  public VsrServiceDAC getVsrServiceDAC()throws EPPIXFatalException{
		    logger.debug("getVsrServiceDAC()");
			
		    try {
		        return (VsrServiceDAC) getDAC( VsrServiceDACImpl.class,
		        		VsrServiceDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;		  
		  
	  }
	  
	  public VstServiceTypesDAC getVstServiceTypesDAC()throws EPPIXFatalException{
		    logger.debug("getVstServiceTypesDAC()");
			
		    try {
		        return (VstServiceTypesDAC) getDAC( VstServiceTypesDACImpl.class,
		        		VstServiceTypesDMLFactory.getDMLFactory(  ) );
		      } catch ( DMLException e ) {
		        thrower.fatal( e );
		      }
		    return null;		  
		  
	  }
	  
	  // Added for Sai test clases: 23/03/2009 by Sarel
	  /**
	   * Instantiates a Data Access Controller for use in the AsMessage
	   * Business Logic Object.
	   *
	   * @return AsMessage Data Access Controller.
	   *
	   * @throws EPPIXFatalException if the DMLFactory fails to initialise.
	   */
	  public AsMessageDAC getAsMessageDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getAsMessageDAC()" );

	    try {
	      return (AsMessageDAC) getDAC( AsMessageDACImpl.class,
	        AsMessageDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }  
	    
	    return null;
	  }
	  
	    public AudAddressDAC getAudAddressDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getAudAddressDAC()" );

	    try {
	      return (AudAddressDAC) getDAC( AudAddressDACImpl.class,
	        AudAddressDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    public BcyBillingCycleDAC getBcyBillingCycleDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getBcyBillingCycleDAC()" );

	    try {
	      return (BcyBillingCycleDAC) getDAC( BcyBillingCycleDACImpl.class,
	        BcyBillingCycleDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }  
	    
	    public BtcBatchControlDAC getBtcBatchControlDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getBtcBatchControlDAC()" );

	    try {
	      return (BtcBatchControlDAC) getDAC( BtcBatchControlDACImpl.class,
	        BtcBatchControlDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    public ChgChargesDAC getChgChargesDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getChgChargesDAC()" );

	    try {
	      return (ChgChargesDAC) getDAC( ChgChargesDACImpl.class,
	        ChgChargesDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }  
	    
	    public CnyCurrencyDAC getCnyCurrencyDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getCnyCurrencyDAC()" );

	    try {
	      return (CnyCurrencyDAC) getDAC( CnyCurrencyDACImpl.class,
	        CnyCurrencyDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  } 
	    
	    public CugUserGroupDAC getCugUserGroupDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getCugUserGroupDAC()" );

	    try {
	      return (CugUserGroupDAC) getDAC( CugUserGroupDACImpl.class,
	        CugUserGroupDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    public CuhCustomerHistoryDAC getCuhCustomerHistoryDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getCuhCustomerHistoryDAC()" );

	    try {
	      return (CuhCustomerHistoryDAC) getDAC( CuhCustomerHistoryDACImpl.class,
	    		  CuhCustomerHistoryDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }	    
	    
	    public DealersDAC getDealersDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDealersDAC()" );

	    try {
	      return (DealersDAC) getDAC( DealersDACImpl.class,
	        DealersDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    
	    public DgdDiscGrpDetDAC getDgdDiscGrpDetDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDgdDiscGrpDetDAC()" );

	    try {
	      return (DgdDiscGrpDetDAC) getDAC( DgdDiscGrpDetDACImpl.class,
	        DgdDiscGrpDetDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  } 
	    
	    public DghDiscGrpHeadDAC getDghDiscGrpHeadDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDghDiscGrpHeadDAC()" );

	    try {
	      return (DghDiscGrpHeadDAC) getDAC( DghDiscGrpHeadDACImpl.class,
	        DghDiscGrpHeadDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }  
	   
	    public DibDiscountBandDAC getDibDiscountBandDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDibDiscountBandDAC()" );

	    try {
	      return (DibDiscountBandDAC) getDAC( DibDiscountBandDACImpl.class,
	        DibDiscountBandDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }  
	    
	    public DipDiscountPlanDAC getDipDiscountPlanDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDipDiscountPlanDAC()" );

	    try {
	      return (DipDiscountPlanDAC) getDAC( DipDiscountPlanDACImpl.class,
	        DipDiscountPlanDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }  
	  
	    
	    public DirDiscountRuleDAC getDirDiscountRuleDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDirDiscountRuleDAC()" );

	    try {
	      return (DirDiscountRuleDAC) getDAC( DirDiscountRuleDACImpl.class,
	        DirDiscountRuleDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    public DisDiscountDAC getDisDiscountDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDisDiscountDAC()" );

	    try {
	      return (DisDiscountDAC) getDAC( DisDiscountDACImpl.class,
	        DisDiscountDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    public DotDocTypeDAC getDotDocTypeDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getDotDocTypeDAC()" );

	    try {
	      return (DotDocTypeDAC) getDAC( DotDocTypeDACImpl.class,
	        DotDocTypeDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    public NgsNetGroupServDAC getNgsNetGroupServDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getNgsNetGroupServDAC()" );

	    try {
	      return (NgsNetGroupServDAC) getDAC( NgsNetGroupServDACImpl.class,
	        NgsNetGroupServDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }

	    return null;
	  }
	    
	    public MshMsisdnHistoryDAC getMshMsisdnHistoryDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getMshMsisdnHistoryDAC()" );

	    try {
	      return (MshMsisdnHistoryDAC) getDAC( MshMsisdnHistoryDACImpl.class,
	    		  MshMsisdnHistoryDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }	    
	    
	    public EanEpxactionNoteDAC getEanEpxactionNoteDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getEanEpxactionNoteDAC()" );

	    try {
	      return (EanEpxactionNoteDAC) getDAC( EanEpxactionNoteDACImpl.class,
	    		  EanEpxactionNoteDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public EaaEpxactionAllwDAC getEaaEpxactionAllwDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getEaaEpxactionAllwDAC()" );

	    try {
	      return (EaaEpxactionAllwDAC) getDAC( EaaEpxactionAllwDACImpl.class,
	    		  EaaEpxactionAllwDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public EapEpxactionPendDAC getEapEpxactionPendDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getEapEpxactionPendDAC()" );

	    try {
	      return (EapEpxactionPendDAC) getDAC( EapEpxactionPendDACImpl.class,
	    		  EapEpxactionPendDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public EarEpxactionArchDAC getEarEpxactionArchDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getEarEpxactionArchDAC()" );

	    try {
	      return (EarEpxactionArchDAC) getDAC( EarEpxactionArchDACImpl.class,
	    		  EarEpxactionArchDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public SdrServDepoRuleDAC getSdrServDepoRuleDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getEaaEpxactionAllwDAC()" );

	    try {
	      return (SdrServDepoRuleDAC) getDAC( SdrServDepoRuleDACImpl.class,
	    		  SdrServDepoRuleDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public UdaUserDefActDAC getUdaUserDefActDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getUdaUserDefActDAC()" );

	    try {
	      return (UdaUserDefActDAC) getDAC( UdaUserDefActDACImpl.class,
	    		  UdaUserDefActDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public EcfEventCmdFileDAC getEcfEventCmdFileDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getEcfEventCmdFileDAC()" );

	    try {
	      return (EcfEventCmdFileDAC) getDAC( EcfEventCmdFileDACImpl.class,
	    		  EcfEventCmdFileDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }	    
	    
	    public BthBatchHistoryDAC getBthBatchHistoryDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getBthBatchHistoryDAC()" );

	    try {
	      return (BthBatchHistoryDAC) getDAC( BthBatchHistoryDACImpl.class,
	    		  BthBatchHistoryDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }	    

	    public PgsProgramStatusDAC getPgsProgramStatusDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getPgsProgramStatusDAC()" );

	    try {
	      return (PgsProgramStatusDAC) getDAC( PgsProgramStatusDACImpl.class,
	    		  PgsProgramStatusDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public PgcProgramContrlDAC getPgcProgramContrlDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getPgcProgramContrlDAC()" );

	    try {
	      return (PgcProgramContrlDAC) getDAC( PgcProgramContrlDACImpl.class,
	    		  PgcProgramContrlDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }
	    
	    public BillCccccyyyymmddDAC getBillCccccyyyymmddDAC(  )
	    throws EPPIXFatalException {
	    logger.debug( "getBillCccccyyyymmddDAC()" );

	    try {
	      return (BillCccccyyyymmddDAC) getDAC( BillCccccyyyymmddDACImpl.class,
	    		  BillCccccyyyymmddDMLFactory.getDMLFactory(  ) );
	    } catch ( DMLException e ) {
	      thrower.fatal( e );
	    }
	    return null;
	  }  
	    
		  public Vsr2ServiceAuxDAC getVsr2ServiceAuxDAC()throws EPPIXFatalException{
			    logger.debug("getVsr2ServiceAuxDAC()");
				
			    try {
			        return (Vsr2ServiceAuxDAC) getDAC( Vsr2ServiceAuxDACImpl.class,
			        		Vsr2ServiceAuxDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }	
		  
		  public BlhBillLimitHdDAC getBlhBillLimitHdDAC()throws EPPIXFatalException{
			    logger.debug("getBlhBillLimitHdDAC()");
				
			    try {
			        return (BlhBillLimitHdDAC) getDAC( BlhBillLimitHdDACImpl.class,
			        		BlhBillLimitHdDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }	
		  
		  public CrbCustRiskBalDAC getCrbCustRiskBalDAC()throws EPPIXFatalException{
			    logger.debug("getCrbCustRiskBalDAC()");
				
			    try {
			        return (CrbCustRiskBalDAC) getDAC( CrbCustRiskBalDACImpl.class,
			        		CrbCustRiskBalDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }
		  
		  public CpcCallPrechargeDAC getCpcCallPrechargeDAC()throws EPPIXFatalException{
			    logger.debug("getCpcCallPrechargeDAC()");
				
			    try {
			        return (CpcCallPrechargeDAC) getDAC( CpcCallPrechargeDACImpl.class,
			        		CpcCallPrechargeDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }

		  public HmHandsetManuDAC getHmHandsetManuDAC()throws EPPIXFatalException{
			    logger.debug("getHmHandsetManuDAC()");
				
			    try {
			        return (HmHandsetManuDAC) getDAC( HmHandsetManuDACImpl.class,
			        		HmHandsetManuDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }
		  
		  public Hm2HandsetModelDAC getHm2HandsetModelDAC()throws EPPIXFatalException{
			    logger.debug("getHm2HandsetModelDAC()");
				
			    try {
			        return (Hm2HandsetModelDAC) getDAC( Hm2HandsetModelDACImpl.class,
			        		Hm2HandsetModelDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }
		  
		  public SbaSubAuxDAC getSbaSubAuxDAC()throws EPPIXFatalException{
			    logger.debug("getSbaSubAuxDAC()");
				
			    try {
			        return (SbaSubAuxDAC) getDAC( SbaSubAuxDACImpl.class,
			        		SbaSubAuxDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }
		  
		  public UrsUrlSettingDAC getUrsUrlSettingDAC()throws EPPIXFatalException{
			    logger.debug("getUrsUrlSettingDAC()");
				
			    try {
			        return (UrsUrlSettingDAC) getDAC( UrsUrlSettingDACImpl.class,
			        		UrsUrlSettingDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
			  
		  }		 
		  
		  public RicaPersonVerificationDAC getRicaPersonVerificationDAC()throws EPPIXFatalException{
			    logger.debug("getRicaPersonVerificationDAC()");
				
			    try {
			        return (RicaPersonVerificationDAC) getDAC( RicaPersonVerificationDACImpl.class,
			        		RicaPersonVerificationDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
		  }		
		  
		  public RicaVerificationAuditDAC getRicaVerificationAuditDAC()throws EPPIXFatalException{
			    logger.debug("getRicaVerificationAuditDAC()");
				
			    try {
			        return (RicaVerificationAuditDAC) getDAC( RicaVerificationAuditDACImpl.class,
			        		RicaVerificationAuditDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
		  }
		  
		  public AsrAddServReqDAC getAsrAddServReqDAC()throws EPPIXFatalException{
			    logger.debug("getAsrAddServReqDAC()");
				
			    try {
			        return (AsrAddServReqDAC) getDAC( AsrAddServReqDACImpl.class,
			        		AsrAddServReqDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
		  }
		  
		  public NpsN2nPerformSendsmsDAC getNpsN2nPerformSendsmsDAC()throws EPPIXFatalException{
			    logger.debug("getNpsN2nPerformSendsmsDAC()");
				
			    try {
			        return (NpsN2nPerformSendsmsDAC) getDAC( NpsN2nPerformSendsmsDACImpl.class,
			        		NpsN2nPerformSendsmsDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
		  }
		  
		  public NteNoteDAC getNteNoteDAC()throws EPPIXFatalException{
			    logger.debug("getNteNoteDAC()");
				
			    try {
			        return (NteNoteDAC) getDAC( NteNoteDACImpl.class,
			        		NteNoteDMLFactory.getDMLFactory(  ) );
			      } catch ( DMLException e ) {
			        thrower.fatal( e );
			      }
			    return null;		  
		  }	
		  
		  public EdfEnhancedDataFaxDAC getEdfEnhancedDataFaxDAC()throws EPPIXFatalException{
              logger.debug("getEdfEnhancedDataFaxDAC()");
                
              try {
                  return (EdfEnhancedDataFaxDAC) getDAC( EdfEnhancedDataFaxDACImpl.class,
                            EdfEnhancedDataFaxDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }   
		  
		  public RicaActionReqDAC getRicaActionReqDAC()throws EPPIXFatalException{
              logger.debug("getRicaActionReqDAC()");
                
              try {
                  return (RicaActionReqDAC) getDAC( RicaActionReqDACImpl.class,
                		  RicaActionReqDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }

		  public DpfDefPocFolderDAC getDpfDefPocFolderDAC()throws EPPIXFatalException{
              logger.debug("getDpfDefPocFolderDAC()");
                
              try {
                  return (DpfDefPocFolderDAC) getDAC( DpfDefPocFolderDACImpl.class,
                		  DpfDefPocFolderDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  			
		  public FntNetTransPendDAC getFntNetTransPendDAC()throws EPPIXFatalException{
              logger.debug("getFntNetTransPendDAC()");
                
              try {
                  return (FntNetTransPendDAC) getDAC( FntNetTransPendDACImpl.class,
                		  FntNetTransPendDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public PfsPocFldrSubsDAC getPfsPocFldrSubsDAC()throws EPPIXFatalException{
              logger.debug("getPfsPocFldrSubsDAC()");
                
              try {
                  return (PfsPocFldrSubsDAC) getDAC( PfsPocFldrSubsDACImpl.class,
                		  PfsPocFldrSubsDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SdSimDeactivateDAC getSdSimDeactivateDAC()throws EPPIXFatalException{
              logger.debug("getSdSimDeactivateDAC()");
                
              try {
                  return (SdSimDeactivateDAC) getDAC( SdSimDeactivateDACImpl.class,
                		  SdSimDeactivateDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SfeSimFutEventDAC getSfeSimFutEventDAC()throws EPPIXFatalException{
              logger.debug("getSfeSimFutEventDAC()");
                
              try {
                  return (SfeSimFutEventDAC) getDAC( SfeSimFutEventDACImpl.class,
                		  SfeSimFutEventDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SpvParamValuesDAC getSpvParamValuesDAC()throws EPPIXFatalException{
              logger.debug("getSpvParamValuesDAC()");
                
              try {
                  return (SpvParamValuesDAC) getDAC( SpvParamValuesDACImpl.class,
                		  SpvParamValuesDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public VasActiveServiceDAC getVasActiveServiceDAC()throws EPPIXFatalException{
              logger.debug("getVasActiveServiceDAC()");
                
              try {
                  return (VasActiveServiceDAC) getDAC( VasActiveServiceDACImpl.class,
                		  VasActiveServiceDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public IluImsiLookupDAC getIluImsiLookupDAC()throws EPPIXFatalException{
              logger.debug("getIluImsiLookupDAC()");
                
              try {
                  return (IluImsiLookupDAC) getDAC( IluImsiLookupDACImpl.class,
                		  IluImsiLookupDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public MsiMsisdnNosDAC getMsiMsisdnNosDAC()throws EPPIXFatalException{
              logger.debug("getMsiMsisdnNosDAC()");
                
              try {
                  return (MsiMsisdnNosDAC) getDAC( MsiMsisdnNosDACImpl.class,
                		  MsiMsisdnNosDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public NttNtwrkTrfTypeDAC getNttNtwrkTrfTypeDAC()throws EPPIXFatalException{
              logger.debug("getNttNtwrkTrfTypeDAC()");
                
              try {
                  return (NttNtwrkTrfTypeDAC) getDAC( NttNtwrkTrfTypeDACImpl.class,
                		  NttNtwrkTrfTypeDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public PppPrepaidPairsDAC getPppPrepaidPairsDAC()throws EPPIXFatalException{
              logger.debug("getPppPrepaidPairsDAC()");
                
              try {
                  return (PppPrepaidPairsDAC) getDAC( PppPrepaidPairsDACImpl.class,
                		  PppPrepaidPairsDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public RcReasonCodeDAC getRcReasonCodeDAC()throws EPPIXFatalException{
              logger.debug("getRcReasonCodeDAC()");
                
              try {
                  return (RcReasonCodeDAC) getDAC( RcReasonCodeDACImpl.class,
                		  RcReasonCodeDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SdcDualCallDAC getSdcDualCallDAC()throws EPPIXFatalException{
              logger.debug("getSdcDualCallDAC()");
                
              try {
                  return (SdcDualCallDAC) getDAC( SdcDualCallDACImpl.class,
                		  SdcDualCallDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SdeServDepositDAC getSdeServDepositDAC()throws EPPIXFatalException{
              logger.debug("getSdeServDepositDAC()");
                
              try {
                  return (SdeServDepositDAC) getDAC( SdeServDepositDACImpl.class,
                		  SdeServDepositDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public TpaTariffAuxDAC getTpaTariffAuxDAC()throws EPPIXFatalException{
              logger.debug("getTpaTariffAuxDAC()");
                
              try {
                  return (TpaTariffAuxDAC) getDAC( TpaTariffAuxDACImpl.class,
                		  TpaTariffAuxDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public VraVrAccountDAC getVraVrAccountDAC()throws EPPIXFatalException{
              logger.debug("getVraVrAccountDAC()");
                
              try {
                  return (VraVrAccountDAC) getDAC( VraVrAccountDACImpl.class,
                		  VraVrAccountDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public VriVrRegInfoDAC getVriVrRegInfoDAC()throws EPPIXFatalException{
              logger.debug("getVriVrRegInfoDAC()");
                
              try {
                  return (VriVrRegInfoDAC) getDAC( VriVrRegInfoDACImpl.class,
                		  VriVrRegInfoDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public VrrVrRecurringDAC getVrrVrRecurringDAC()throws EPPIXFatalException{
              logger.debug("getVrrVrRecurringDAC()");
                
              try {
                  return (VrrVrRecurringDAC) getDAC( VrrVrRecurringDACImpl.class,
                		  VrrVrRecurringDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public VrtVrTrackingDAC getVrtVrTrackingDAC()throws EPPIXFatalException{
              logger.debug("getVrtVrTrackingDAC()");
                
              try {
                  return (VrtVrTrackingDAC) getDAC( VrtVrTrackingDACImpl.class,
                		  VrtVrTrackingDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public ActivationPendDAC getActivationPendDAC()throws EPPIXFatalException{
              logger.debug("getActivationPendDAC()");
                
              try {
                  return (ActivationPendDAC) getDAC( ActivationPendDACImpl.class,
                		  ActivationPendDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SacSimAssignCusDAC getSacSimAssignCusDAC()throws EPPIXFatalException{
              logger.debug("getSacSimAssignCusDAC()");
                
              try {
                  return (SacSimAssignCusDAC) getDAC( SacSimAssignCusDACImpl.class,
                		  SacSimAssignCusDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SbhdSplitBillHdDAC getSbhdSplitBillHdDAC()throws EPPIXFatalException{
              logger.debug("getSbhdSplitBillHdDAC()");
                
              try {
                  return (SbhdSplitBillHdDAC) getDAC( SbhdSplitBillHdDACImpl.class,
                		  SbhdSplitBillHdDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SbhsSplitBillHsDAC getSbhsSplitBillHsDAC()throws EPPIXFatalException{
              logger.debug("getSbhsSplitBillHsDAC()");
                
              try {
                  return (SbhsSplitBillHsDAC) getDAC( SbhsSplitBillHsDACImpl.class,
                		  SbhsSplitBillHsDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public FtFreeairTimeDAC getFtFreeairTimeDAC()throws EPPIXFatalException{
              logger.debug("getFtFreeairTimeDAC()");
                
              try {
                  return (FtFreeairTimeDAC) getDAC( FtFreeairTimeDACImpl.class,
                		  FtFreeairTimeDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public FsFreeairServiceDAC getFsFreeairServiceDAC()throws EPPIXFatalException{
              logger.debug("getFsFreeairServiceDAC()");
                
              try {
                  return (FsFreeairServiceDAC) getDAC( FsFreeairServiceDACImpl.class,
                		  FsFreeairServiceDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SvcSubVrCcardDAC getSvcSubVrCcardDAC()throws EPPIXFatalException{
              logger.debug("getSvcSubVrCcardDAC()");
                
              try {
                  return (SvcSubVrCcardDAC) getDAC( SvcSubVrCcardDACImpl.class,
                		  SvcSubVrCcardDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SmqSmsMesgQueueDAC getSmqSmsMesgQueueDAC()throws EPPIXFatalException{
              logger.debug("getSmqSmsMesgQueueDAC()");
                
              try {
                  return (SmqSmsMesgQueueDAC) getDAC( SmqSmsMesgQueueDACImpl.class,
                		  SmqSmsMesgQueueDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public ShcSmsHistcodeDAC getShcSmsHistcodeDAC()throws EPPIXFatalException{
              logger.debug("getShcSmsHistcodeDAC()");
                
              try {
                  return (ShcSmsHistcodeDAC) getDAC( ShcSmsHistcodeDACImpl.class,
                		  ShcSmsHistcodeDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SpcParamConfigDAC getSpcParamConfigDAC()throws EPPIXFatalException{
              logger.debug("getSpcParamConfigDAC()");
                
              try {
                  return (SpcParamConfigDAC) getDAC( SpcParamConfigDACImpl.class,
                		  SpcParamConfigDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public AchActionHistoryDAC getAchActionHistoryDAC()throws EPPIXFatalException{
              logger.debug("getSpcParamConfigDAC()");
                
              try {
                  return (AchActionHistoryDAC) getDAC( AchActionHistoryDACImpl.class,
                		  AchActionHistoryDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public FdFieldDefAbstractDAC getFdFieldDefDAC()throws EPPIXFatalException{
              logger.debug("getFdFieldDefDAC()");
                
              try {
                  return (FdFieldDefDAC) getDAC( FdFieldDefDACImpl.class,
                		  FdFieldDefDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public VcfVrbleChrgFeeDAC getVcfVrbleChrgFeeDAC()throws EPPIXFatalException{
              logger.debug("getVcfVrbleChrgFeeDAC()");
                
              try {
                  return (VcfVrbleChrgFeeDAC) getDAC( VcfVrbleChrgFeeDACImpl.class,
                		  VcfVrbleChrgFeeDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  
		  public SsrServiceReqDAC getSsrServiceReqDAC()throws EPPIXFatalException{
              logger.debug("getSsrServiceReqDAC()");
                
              try {
                  return (SsrServiceReqDAC) getDAC( SsrServiceReqDACImpl.class,
                		  SsrServiceReqDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  
		  public SulSubUseLimitDAC getSulSubUseLimitDAC()throws EPPIXFatalException{
              logger.debug("getSulSubUseLimitDAC()");
                
              try {
                  return (SulSubUseLimitDAC) getDAC( SulSubUseLimitDACImpl.class,
                		  SulSubUseLimitDMLFactory.getDMLFactory(  ) );
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  
		  public PfhPocSubHistDAC getPfhPocSubHistDAC()throws EPPIXFatalException{
              logger.debug("getSulSubUseLimitDAC()");
                
              try {
                  return (PfhPocSubHistDAC) getDAC( PfhPocSubHistDACImpl.class,
                		  PfhPocSubHistDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public PfuPocUsageDAC getPfuPocUsageDAC()throws EPPIXFatalException{
              logger.debug("getPfuPocUsageDAC()");
                
              try {
                  return (PfuPocUsageDAC) getDAC( PfuPocUsageDACImpl.class,
                		  PfuPocUsageDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public SbeSubEquipDAC getSbeSubEquipDAC()throws EPPIXFatalException{
              logger.debug("getSbeSubEquipDAC()");
                
              try {
                  return (SbeSubEquipDAC) getDAC( SbeSubEquipDACImpl.class,
                		  SbeSubEquipDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public PswPrepaidSwapDAC getPswPrepaidSwapDAC()throws EPPIXFatalException{
              logger.debug("getPswPrepaidSwapDAC()");
                
              try {
                  return (PswPrepaidSwapDAC) getDAC(PswPrepaidSwapDACImpl.class,
                		  PswPrepaidSwapDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public EmqMessageQueDAC getEmqMessageQueDAC()throws EPPIXFatalException{
              logger.debug("getEmqMessageQueDAC()");
                
              try {
                  return (EmqMessageQueDAC) getDAC(EmqMessageQueDACImpl.class,
                		  EmqMessageQueDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  
		  public MbmMailBatchMonDAC getMbmMailBatchMonDAC()throws EPPIXFatalException{
              logger.debug("getMbmMailBatchMonDAC()");
                
              try {
                  return (MbmMailBatchMonDAC) getDAC(MbmMailBatchMonDACImpl.class,
                		  MbmMailBatchMonDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public EmaMessageArchiveDAC getEmaMessageArchiveDAC()throws EPPIXFatalException{
              logger.debug("getEmaMessageArchiveDAC()");
                
              try {
                  return (EmaMessageArchiveDAC) getDAC(EmaMessageArchiveDACImpl.class,
                		  EmaMessageArchiveDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public CrbaCustRiskAuxDAC getCrbaCustRiskAuxDAC()throws EPPIXFatalException{
              logger.debug("getCrbaCustRiskAuxDAC()");
                
              try {
                  return (CrbaCustRiskAuxDAC) getDAC(CrbaCustRiskAuxDACImpl.class,
                		  CrbaCustRiskAuxDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public AuxCustEncryptedDAC getAuxCustEncryptedDAC()throws EPPIXFatalException{
              logger.debug("getAuxCustEncryptedDAC()");
                
              try {
                  return (AuxCustEncryptedDAC) getDAC(AuxCustEncryptedDACImpl.class,
                		  AuxCustEncryptedDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
		  
		  public MahMassActionHdDAC getMahMassActionHdDAC()throws EPPIXFatalException{
              logger.debug("getMahMassActionHdDAC()");
                
              try {
                  return (MahMassActionHdDAC) getDAC(MahMassActionHdDACImpl.class,
                		  MahMassActionHdDMLFactory.getDMLFactory());
                } catch ( DMLException e ) {
                  thrower.fatal( e );
                }
              return null;          
		  }
}
