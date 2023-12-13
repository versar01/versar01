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

import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.blo.CommonBLOBinder;
import com.eppixcomm.eppix.common.blo.Language;
import com.eppixcomm.eppix.common.util.EppixLocale;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
 */
public abstract class BaseAbstractBLOBinder extends CommonBLOBinder {
  //~ Static variables/initializers //////////////////////////////////////////

  private static Thrower thrower = Thrower
      .getThrower(BaseAbstractBLOBinder.class);

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BaseAbstractBLOBinder object.
   *
   * @param locale DOCUMENT ME!
   * @param ctx DOCUMENT ME!
   *
   * @throws EPPIXFatalException DOCUMENT ME!
   */
//    public BaseAbstractBLOBinder( 
//     )
//      throws EPPIXFatalException {
//      super( BaseDACFactory.class, thrower );
  
      //
      // Now set the systemLanguageCode for this bloBinder
      //
  
      //try {
      //             
      //   systemLanguageCode = 
      //  language().getSystem().getLanguageId();    
      //} catch (EPPIXException e ) {
      //         
      //   thrower.fatal(e);
      //}   
//    }
  /**
   * Creates a new BaseAbstractBLOBinder object.
   *
   * @param loginName DOCUMENT ME!
   * @param locale DOCUMENT ME!
   * @param connection DOCUMENT ME!
   *
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public BaseAbstractBLOBinder(String loginName,
      EppixLocale locale,
      Connection connection) throws EPPIXFatalException {
    super(loginName, locale, BaseDACFactory.class, connection, thrower);
  }
  
  public BaseAbstractBLOBinder(String loginName,
	      EppixLocale locale, Class dac,
	      Connection connection) throws EPPIXFatalException {
	    super(loginName, locale, dac, connection, thrower);
	  }  

  //~ Methods ////////////////////////////////////////////////////////////////

  //-------------------------------------------------------
  // getters for all classes
  //-------------------------------------------------------


  public ActAccTypes actAccTypes() throws EPPIXFatalException {
	    return (ActAccTypes) getBLO(ActAccTypes.class);
  }

  // getter for AuxCustomers
  /**
   * Returns the AuxCustomers business logic object. Only creates one the first time its requested, all
   * subsequent requests return the same one.
   * @return the AuxCustomers business logic object.
   */
  public AuxCustomers auxCustomers() throws EPPIXFatalException {
    return (AuxCustomers) getBLO(AuxCustomers.class);
  }

  // getter for TtTypeText
  /**
   * Returns the TtTypeText business logic object. Only creates one the first time its requested, all
   * subsequent requests return the same one.
   * @return the TtTypeText business logic object.
   */
  public TtTypeText ttTypeText() throws EPPIXFatalException {
    return (TtTypeText) getBLO(TtTypeText.class);
  }

  // getter for NmNetmat
  /**
   * Returns the NmNetmat business logic object. Only creates one the first time its requested, all
   * subsequent requests return the same one.
   * @return the NmNetmat business logic object.
   */
  public NmNetmat nmNetmat() throws EPPIXFatalException {
    return (NmNetmat) getBLO(NmNetmat.class);
  }

  // getter for VamActiveMsisdn
  /**
   * Returns the VamActiveMsisdn business logic object. Only creates one the first time its requested, all
   * subsequent requests return the same one.
   * @return the VamActiveMsisdn business logic object.
   */
  public VamActiveMsisdn vamActiveMsisdn() throws EPPIXFatalException {
    return (VamActiveMsisdn) getBLO(VamActiveMsisdn.class);
  }

  // getter for Slcustm
  /**
   * Returns the Slcustm business logic object. Only creates one the first time its requested, all
   * subsequent requests return the same one.
   * @return the Slcustm business logic object.
   */
  public Slcustm slcustm() throws EPPIXFatalException {
    return (Slcustm) getBLO(Slcustm.class);
  }

  // getter for SbdSubDets
  /**
   * Returns the SbdSubDets business logic object. Only creates one the first time its requested, all
   * subsequent requests return the same one.
   * @return the SbdSubDets business logic object.
   */
  public SbdSubDets sbdSubDets() throws EPPIXFatalException {
    return (SbdSubDets) getBLO(SbdSubDets.class);
  }

  public CdiDatabaseInt cdiDatabaseInt() throws EPPIXFatalException {
    return (CdiDatabaseInt) getBLO(CdiDatabaseInt.class);
  }

  /**
   * Returns the DchDealerClmHdr business logic object. Only creates one the first time its requested, all
   * subsequent requests return the same one.
   * @return the DchDealerClmHdr business logic object.
   */
   public DchDealerClmHdr dchDealerClmHdr(  )
     throws EPPIXFatalException {
     return (DchDealerClmHdr) getBLO( DchDealerClmHdr.class );
   }

   /**
    * Returns the DlaDealClaimArc business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DlaDealClaimArc business logic object.
    */
    public DlaDealClaimArc dlaDealClaimArc(  )
      throws EPPIXFatalException {
      return (DlaDealClaimArc) getBLO( DlaDealClaimArc.class );
    }
    
    // getter for SksKeySetting
    /**
    * Returns the SksKeySetting business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the SksKeySetting business logic object.
    */
    public SksKeySetting sksKeySetting(  )
      throws EPPIXFatalException {
      return (SksKeySetting) getBLO( SksKeySetting.class );
    }
    
    // getter for Sysdirm
    /**
    * Returns the Sysdirm business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the Sysdirm business logic object.
    */
    public Sysdirm sysdirm(  )
      throws EPPIXFatalException {
      return (Sysdirm) getBLO( Sysdirm.class );
    } 
    
    // getter for AsMessage
    /**
    * Returns the AsMessage business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the AsMessage business logic object.
    */
    public AsMessage asMessage(  )
      throws EPPIXFatalException {
      return (AsMessage) getBLO( AsMessage.class );
    } 
    
    /**
     * Returns the AudAddress business logic object. Only creates one the first time its requested, all
     * subsequent requests return the same one.
     * @return the AudAddress business logic object.
     */
     public AudAddress audAddress(  )
       throws EPPIXFatalException {
       return (AudAddress) getBLO( AudAddress.class );
     }
    
    
    // getter for Dealers
    /**
    * Returns the Dealers business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the Dealers business logic object.
    */
    public Dealers dealers(  )
      throws EPPIXFatalException {
      return (Dealers) getBLO( Dealers.class );
    }
    
    // getter for BcyBillingCycle
    /**
    * Returns the BcyBillingCycle business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the BcyBillingCycle business logic object.
    */
    public BcyBillingCycle bcyBillingCycle(  )
      throws EPPIXFatalException {
      return (BcyBillingCycle) getBLO( BcyBillingCycle.class );
    }
    
    // getter for ChgCharges
    /**
    * Returns the ChgCharges business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the ChgCharges business logic object.
    */
    public ChgCharges chgCharges(  )
      throws EPPIXFatalException {
      return (ChgCharges) getBLO( ChgCharges.class );
    }
    
 // getter for DibDiscountBand
    /**
    * Returns the DibDiscountBand business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DibDiscountBand business logic object.
    */
    public DibDiscountBand dibDiscountBand(  )
      throws EPPIXFatalException {
      return (DibDiscountBand) getBLO( DibDiscountBand.class );
    }
    
    // getter for CnyCurrency
    /**
    * Returns the CnyCurrency business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the CnyCurrency business logic object.
    */
    public CnyCurrency cnyCurrency(  )
      throws EPPIXFatalException {
      return (CnyCurrency) getBLO( CnyCurrency.class );
    }

    // getter for CugUserGroup
    /**
    * Returns the CugUserGroup business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the CugUserGroup business logic object.
    */
    public CugUserGroup cugUserGroup(  )
      throws EPPIXFatalException {
      return (CugUserGroup) getBLO( CugUserGroup.class );
    }
    
 // getter for DirDiscountRule
    /**
    * Returns the DirDiscountRule business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DirDiscountRule business logic object.
    */
    public DirDiscountRule dirDiscountRule(  )
      throws EPPIXFatalException {
      return (DirDiscountRule) getBLO( DirDiscountRule.class );
    }
    
 // getter for DisDiscount
    /**
    * Returns the DisDiscount business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DisDiscount business logic object.
    */
    public DisDiscount disDiscount(  )
      throws EPPIXFatalException {
      return (DisDiscount) getBLO( DisDiscount.class );
    }
    
 // getter for DipDiscountPlan
    /**
    * Returns the DipDiscountPlan business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DipDiscountPlan business logic object.
    */
    public DipDiscountPlan dipDiscountPlan(  )
      throws EPPIXFatalException {
      return (DipDiscountPlan) getBLO( DipDiscountPlan.class );
    }
    
    // getter for DgdDiscGrpDet
    /**
    * Returns the DgdDiscGrpDet business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DgdDiscGrpDet business logic object.
    */
    public DgdDiscGrpDet dgdDiscGrpDet(  )
      throws EPPIXFatalException {
      return (DgdDiscGrpDet) getBLO( DgdDiscGrpDet.class );
    }
    
 // getter for DghDiscGrpHead
    /**
    * Returns the DghDiscGrpHead business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DghDiscGrpHead business logic object.
    */
    public DghDiscGrpHead dghDiscGrpHead(  )
      throws EPPIXFatalException {
      return (DghDiscGrpHead) getBLO( DghDiscGrpHead.class );
    }
    
 // getter for DotDocType
    /**
    * Returns the DotDocType business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the DotDocType business logic object.
    */
    public DotDocType dotDocType(  )
      throws EPPIXFatalException {
      return (DotDocType) getBLO( DotDocType.class );
    }
    
 // getter for NgsNetGroupServ
    /**
    * Returns the NgsNetGroupServ business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the NgsNetGroupServ business logic object.
    */
    public NgsNetGroupServ ngsNetGroupServ(  )
      throws EPPIXFatalException {
      return (NgsNetGroupServ) getBLO( NgsNetGroupServ.class );
    }
    
    // getter for PptPrepaidTypes
    /**
    * Returns the PptPrepaidTypes business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the PptPrepaidTypes business logic object.
    */
    public PptPrepaidTypes pptPrepaidTypes(  )
      throws EPPIXFatalException {
      return (PptPrepaidTypes) getBLO( PptPrepaidTypes.class );
    }
    
    // getter for SpaServiceParams
    /**
    * Returns the SpaServiceParams business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the SpaServiceParams business logic object.
    */
    public SpaServiceParams spaServiceParams(  )
      throws EPPIXFatalException {
      return (SpaServiceParams) getBLO( SpaServiceParams.class );
    }
    
 // getter for SpdServParamDef
    /**
    * Returns the SpdServParamDef business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the SpdServParamDef business logic object.
    */
    public SpdServParamDef spdServParamDef(  )
      throws EPPIXFatalException {
      return (SpdServParamDef) getBLO( SpdServParamDef.class );
    }
    
 // getter for SvrServRule
    /**
    * Returns the SvrServRule business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the SvrServRule business logic object.
    */
    public SvrServRule svrServRule(  )
      throws EPPIXFatalException {
      return (SvrServRule) getBLO( SvrServRule.class );
    }

 // getter for TpTariffPlan
    /**
    * Returns the TpTariffPlan business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the TpTariffPlan business logic object.
    */
    public TpTariffPlan TpTariffPlan(  )
      throws EPPIXFatalException {
      return (TpTariffPlan) getBLO( TpTariffPlan.class );
    }
    
 // getter for VpkPackage
    /**
    * Returns the VpkPackage business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the VpkPackage business logic object.
    */
    public VpkPackage vpkPackage(  )
      throws EPPIXFatalException {
      return (VpkPackage) getBLO( VpkPackage.class );
    }

 // getter for VpnProviderNetwk
    /**
    * Returns the VpnProviderNetwk business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the VpnProviderNetwk business logic object.
    */
    public VpnProviderNetwk vpnProviderNetwk(  )
      throws EPPIXFatalException {
      return (VpnProviderNetwk) getBLO( VpnProviderNetwk.class );
    }
    
 // getter for VprProvider
    /**
    * Returns the VprProvider business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the VprProvider business logic object.
    */
    public VprProvider vprProvider(  )
      throws EPPIXFatalException {
      return (VprProvider) getBLO( VprProvider.class );
    }
    
 // getter for VpsPackageServ
    /**
    * Returns the VpsPackageServ business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the VpsPackageServ business logic object.
    */
    public VpsPackageServ vpsPackageServ(  )
      throws EPPIXFatalException {
      return (VpsPackageServ) getBLO( VpsPackageServ.class );
    }
    
 // getter for VsrService
    /**
    * Returns the VsrService business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the VsrService business logic object.
    */
    public VsrService vsrService(  )
      throws EPPIXFatalException {
      return (VsrService) getBLO( VsrService.class );
    }
    
 // getter for Vsr2ServiceAux
    /**
    * Returns the Vsr2ServiceAux business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the Vsr2ServiceAux business logic object.
    */
    public Vsr2ServiceAux vsr2ServiceAux(  )
      throws EPPIXFatalException {
      return (Vsr2ServiceAux) getBLO( Vsr2ServiceAux.class );
    }
    
 // getter for VstServiceTypes
    /**
    * Returns the VstServiceTypes business logic object. Only creates one the first time its requested, all
    * subsequent requests return the same one.
    * @return the VstServiceTypes business logic object.
    */
    public VstServiceTypes vstServiceTypes(  )
      throws EPPIXFatalException {
      return (VstServiceTypes) getBLO( VstServiceTypes.class );
    }
    
	// getter for Sortcodes
	/**
	 * Returns the Sortcodes business logic object. Only creates one the first
	 * time its requested, all subsequent requests return the same one.
	 * 
	 * @return the Sortcodes business logic object.
	 */
	public Sortcodes sortcodes() throws EPPIXFatalException {
		return (Sortcodes) getBLO(Sortcodes.class);
	}
	
	public EqEventQueue eqEventQueue() throws EPPIXFatalException {
	return (EqEventQueue) getBLO(EqEventQueue.class);
}

public EcEventCommand ecEventCommand() throws EPPIXFatalException {
	return (EcEventCommand) getBLO(EcEventCommand.class);
}

public EdEventDepends edEventDepends() throws EPPIXFatalException {
	return (EdEventDepends) getBLO(EdEventDepends.class);
}

public EcdEventCmdDet ecdEventCmdDet() throws EPPIXFatalException {
	return (EcdEventCmdDet) getBLO(EcdEventCmdDet.class);
}

public NtpNetTransPend ntpNetTransPend() throws EPPIXFatalException {
	return (NtpNetTransPend) getBLO(NtpNetTransPend.class);
}

public PshParamServHdr pshParamServHdr() throws EPPIXFatalException {
	return (PshParamServHdr) getBLO(PshParamServHdr.class);
}

public PsdParamServDet psdParamServDet() throws EPPIXFatalException {
	return (PsdParamServDet) getBLO(PsdParamServDet.class);
}

public ApmApnPopMain apmApnPopMain() throws EPPIXFatalException {
	return (ApmApnPopMain) getBLO(ApmApnPopMain.class);
}

public AneApnNonEppix aneApnNonEppix() throws EPPIXFatalException {
	return (AneApnNonEppix) getBLO(AneApnNonEppix.class);
}

public VsmServiceMsisdn vsmServiceMsisdn() throws EPPIXFatalException {
	return (VsmServiceMsisdn) getBLO(VsmServiceMsisdn.class);
}

public TsTariffService tsTariffService() throws EPPIXFatalException {
	return (TsTariffService) getBLO(TsTariffService.class);
}

public SeqMapN2N seqMapN2N() throws EPPIXFatalException {
	return (SeqMapN2N) getBLO(SeqMapN2N.class);
}

public NctCompressType nctCompressType() throws EPPIXFatalException {
	return (NctCompressType) getBLO(NctCompressType.class);
}

public NcrCompressRule ncrCompressRule() throws EPPIXFatalException {
	return (NcrCompressRule) getBLO(NcrCompressRule.class);
}

public EiEppixIsis eiEppixIsis() throws EPPIXFatalException {
	return (EiEppixIsis) getBLO(EiEppixIsis.class);
}

public TolSimNos tolSimNos() throws EPPIXFatalException {
	return (TolSimNos) getBLO(TolSimNos.class);
}

public SmhSimHistory smhSimHistory() throws EPPIXFatalException {
	return (SmhSimHistory) getBLO(SmhSimHistory.class);
}

public Language language() throws EPPIXFatalException {
	return (Language) getBLO(Language.class);
}

public Opservm opservm() throws EPPIXFatalException {
	return (Opservm) getBLO(Opservm.class);
}

public PdPortDetails pdPortDetails() throws EPPIXFatalException {
	return (PdPortDetails) getBLO(PdPortDetails.class);
}

public BtcBatchControl btcBatchControl() throws EPPIXFatalException
{
		return (BtcBatchControl) getBLO(BtcBatchControl.class);
}	

public PtmPermToMarket ptmPermToMarket() throws EPPIXFatalException {
	return (PtmPermToMarket) getBLO(PtmPermToMarket.class);
}

	public SbhSubHistory sbhSubHistory() throws EPPIXFatalException {
		return (SbhSubHistory) getBLO(SbhSubHistory.class);
}

	public SbuSubUpgrade sbuSubUpgrade() throws EPPIXFatalException {
		return (SbuSubUpgrade) getBLO(SbuSubUpgrade.class);
}
	
	public SmnSimNos smnSimNos() throws EPPIXFatalException {
		return (SmnSimNos) getBLO(SmnSimNos.class);
}	
	
	public CuhCustomerHistory cuhCustomerHistory() throws EPPIXFatalException {
		return (CuhCustomerHistory) getBLO(CuhCustomerHistory.class);
}		
	
	public MshMsisdnHistory mshMsisdnHistory() throws EPPIXFatalException {
		return (MshMsisdnHistory) getBLO(MshMsisdnHistory.class);
}
	
	public EanEpxactionNote eanEpxactionNote() throws EPPIXFatalException {
		return (EanEpxactionNote) getBLO(EanEpxactionNote.class);
}

	public EaaEpxactionAllw eaaEpxactionAllw() throws EPPIXFatalException {
		return (EaaEpxactionAllw) getBLO(EaaEpxactionAllw.class);
}
	
	public EapEpxactionPend eapEpxactionPend() throws EPPIXFatalException {
		return (EapEpxactionPend) getBLO(EapEpxactionPend.class);
}
	public EarEpxactionArch earEpxactionArch() throws EPPIXFatalException {
		return (EarEpxactionArch) getBLO(EarEpxactionArch.class);
}
	public SdrServDepoRule sdrServDepoRule() throws EPPIXFatalException {
		return (SdrServDepoRule) getBLO(SdrServDepoRule.class);
}
	public UdaUserDefAct udaUserDefAct() throws EPPIXFatalException {
		return (UdaUserDefAct) getBLO(UdaUserDefAct.class);
}
		
	public EcfEventCmdFile ecfEventCmdFile() throws EPPIXFatalException {
		return (EcfEventCmdFile) getBLO(EcfEventCmdFile.class);
}	
	
	public BthBatchHistory bthBatchHistory() throws EPPIXFatalException{
		return (BthBatchHistory)getBLO(BthBatchHistory.class);
	}
	
	public PgsProgramStatus pgsProgramStatus() throws EPPIXFatalException{
		return (PgsProgramStatus)getBLO(PgsProgramStatus.class);
	}
	
	public PgcProgramContrl pgcProgramContrl() throws EPPIXFatalException{
		return (PgcProgramContrl)getBLO(PgcProgramContrl.class);
	}
	
	public BillCccccyyyymmdd billCccccyyyymmdd() throws EPPIXFatalException{
		return (BillCccccyyyymmdd)getBLO(BillCccccyyyymmdd.class);
	}
	
	public BlhBillLimitHd blhBillLimitHd() throws EPPIXFatalException{
		return (BlhBillLimitHd)getBLO(BlhBillLimitHd.class);
	}

	public CrbCustRiskBal crbCustRiskBal() throws EPPIXFatalException{
		return (CrbCustRiskBal)getBLO(CrbCustRiskBal.class);
	}

	public CpcCallPrecharge cpcCallPrecharge() throws EPPIXFatalException{
		return (CpcCallPrecharge)getBLO(CpcCallPrecharge.class);
	}
	
	public HmHandsetManu hmHandsetManu() throws EPPIXFatalException{
		return (HmHandsetManu)getBLO(HmHandsetManu.class);
		
	}
	
	public Hm2HandsetModel hm2HandsetModel() throws EPPIXFatalException{
		return (Hm2HandsetModel)getBLO(Hm2HandsetModel.class);
		
	}
		
	public SbaSubAux sbaSubAux() throws EPPIXFatalException{
		return (SbaSubAux)getBLO(SbaSubAux.class);
		
	}
	
	public UrsUrlSetting ursUrlSetting() throws EPPIXFatalException{
		return (UrsUrlSetting)getBLO(UrsUrlSetting.class);
		
	}

	public RicaPersonVerification ricaPersonVerification() throws EPPIXFatalException{
		return (RicaPersonVerification)getBLO(RicaPersonVerification.class);
		
	}
	
	public RicaVerificationAudit ricaVerificationAudit() throws EPPIXFatalException{
		return (RicaVerificationAudit)getBLO(RicaVerificationAudit.class);
		
	}
	
	public AsrAddServReq asrAddServReq() throws EPPIXFatalException{
		return (AsrAddServReq)getBLO(AsrAddServReq.class);
		
	}
	
	public NpsN2nPerformSendsms npsN2nPerformSendsms() throws EPPIXFatalException{
		return (NpsN2nPerformSendsms)getBLO(NpsN2nPerformSendsms.class);
	}	
	
	public NteNote nteNote() throws EPPIXFatalException{
		return (NteNote)getBLO(NteNote.class);
	}
	
	public EdfEnhancedDataFax edfEnhancedDataFax() throws EPPIXFatalException{
        return (EdfEnhancedDataFax)getBLO(EdfEnhancedDataFax.class);
 	}
	
	public RicaActionReq ricaActionReq() throws EPPIXFatalException{
        return (RicaActionReq)getBLO(RicaActionReq.class);
 	}
	
	public DpfDefPocFolder dpfDefPocFolder() throws EPPIXFatalException{
        return (DpfDefPocFolder)getBLO(DpfDefPocFolder.class);
 	}
	
	public FntNetTransPend fntNetTransPend() throws EPPIXFatalException{
        return (FntNetTransPend)getBLO(FntNetTransPend.class);
 	}
	
	public PfsPocFldrSubs pfsPocFldrSubs() throws EPPIXFatalException{
        return (PfsPocFldrSubs)getBLO(PfsPocFldrSubs.class);
 	}
	
	public SdSimDeactivate sdSimDeactivate() throws EPPIXFatalException{
        return (SdSimDeactivate)getBLO(SdSimDeactivate.class);
 	}
	
	public SfeSimFutEvent sfeSimFutEvent() throws EPPIXFatalException{
        return (SfeSimFutEvent)getBLO(SfeSimFutEvent.class);
 	}
	
	public SpvParamValues spvParamValues() throws EPPIXFatalException{
        return (SpvParamValues)getBLO(SpvParamValues.class);
 	}
	
	public VasActiveService vasActiveService() throws EPPIXFatalException{
        return (VasActiveService)getBLO(VasActiveService.class);
 	}
	
	public IluImsiLookup iluImsiLookup() throws EPPIXFatalException{
        return (IluImsiLookup)getBLO(IluImsiLookup.class);
 	}
 	
	public MsiMsisdnNos msiMsisdnNos() throws EPPIXFatalException{
        return (MsiMsisdnNos)getBLO(MsiMsisdnNos.class);
 	}
	
	public NttNtwrkTrfType nttNtwrkTrfType() throws EPPIXFatalException{
        return (NttNtwrkTrfType)getBLO(NttNtwrkTrfType.class);
 	}
	
	public PppPrepaidPairs pppPrepaidPairs() throws EPPIXFatalException{
        return (PppPrepaidPairs)getBLO(PppPrepaidPairs.class);
 	}
	
	public RcReasonCode rcReasonCode() throws EPPIXFatalException{
        return (RcReasonCode)getBLO(RcReasonCode.class);
 	}
	
	public SdcDualCall sdcDualCall() throws EPPIXFatalException{
        return (SdcDualCall)getBLO(SdcDualCall.class);
 	}
	
	public SdeServDeposit sdeServDeposit() throws EPPIXFatalException{
        return (SdeServDeposit)getBLO(SdeServDeposit.class);
 	}
	
	public TpaTariffAux tpaTariffAux() throws EPPIXFatalException{
        return (TpaTariffAux)getBLO(TpaTariffAux.class);
 	}
	
	public VraVrAccount vraVrAccount() throws EPPIXFatalException{
        return (VraVrAccount)getBLO(VraVrAccount.class);
 	}
	
	public VriVrRegInfo vriVrRegInfo() throws EPPIXFatalException{
        return (VriVrRegInfo)getBLO(VriVrRegInfo.class);
 	}
	
	public VrrVrRecurring vrrVrRecurring() throws EPPIXFatalException{
        return (VrrVrRecurring)getBLO(VrrVrRecurring.class);
 	}
		
	public VrtVrTracking vrtVrTracking() throws EPPIXFatalException{
        return (VrtVrTracking)getBLO(VrtVrTracking.class);
 	}
	
	public ActivationPend activationPend() throws EPPIXFatalException{
        return (ActivationPend)getBLO(ActivationPend.class);
 	}
	
	public SacSimAssignCus sacSimAssignCus() throws EPPIXFatalException{
        return (SacSimAssignCus)getBLO(SacSimAssignCus.class);
 	}
	
	public SbhdSplitBillHd sbhdSplitBillHd() throws EPPIXFatalException{
        return (SbhdSplitBillHd)getBLO(SbhdSplitBillHd.class);
 	}
	
	public SbhsSplitBillHs sbhsSplitBillHs() throws EPPIXFatalException{
        return (SbhsSplitBillHs)getBLO(SbhsSplitBillHs.class);
 	}
	
	public FtFreeairTime ftFreeairTime() throws EPPIXFatalException{
        return (FtFreeairTime)getBLO(FtFreeairTime.class);
 	}
	
	public FsFreeairService fsFreeairService() throws EPPIXFatalException{
        return (FsFreeairService)getBLO(FsFreeairService.class);
 	}
	
	public SvcSubVrCcard svcSubVrCcard() throws EPPIXFatalException{
        return (SvcSubVrCcard)getBLO(SvcSubVrCcard.class);
 	}
	
	public SmqSmsMesgQueue smqSmsMesgQueue() throws EPPIXFatalException{
        return (SmqSmsMesgQueue)getBLO(SmqSmsMesgQueue.class);
 	}
	
	public ShcSmsHistcode shcSmsHistcode() throws EPPIXFatalException{
        return (ShcSmsHistcode)getBLO(ShcSmsHistcode.class);
 	}
	
	public SpcParamConfig spcParamConfig() throws EPPIXFatalException{
        return (SpcParamConfig)getBLO(SpcParamConfig.class);
 	}
	
	public AchActionHistory achActionHistory() throws EPPIXFatalException{
        return (AchActionHistory)getBLO(AchActionHistory.class);
 	}
	
	public MahMassActionHd mahMassActionHd() throws EPPIXFatalException{
        return (MahMassActionHd)getBLO(MahMassActionHd.class);
 	}
	
	public FdFieldDef fdFieldDef() throws EPPIXFatalException{
        return (FdFieldDef)getBLO(FdFieldDef.class);
 	}
	
	public VcfVrbleChrgFee vcfVrbleChrgFee() throws EPPIXFatalException{
        return (VcfVrbleChrgFee)getBLO(VcfVrbleChrgFee.class);
 	}
	
	
	public SsrServiceReq ssrServiceReq() throws EPPIXFatalException{
        return (SsrServiceReq)getBLO(SsrServiceReq.class);
 	}
	
	public SulSubUseLimit sulSubUseLimit() throws EPPIXFatalException{
        return (SulSubUseLimit)getBLO(SulSubUseLimit.class);
 	}
	
	public PfhPocSubHist pfhPocSubHist() throws EPPIXFatalException{
        return (PfhPocSubHist)getBLO(PfhPocSubHist.class);
 	}	
	
	public PfuPocUsage pfuPocUsage() throws EPPIXFatalException{
        return (PfuPocUsage)getBLO(PfuPocUsage.class);
 	}	
	
	public SbeSubEquip sbeSubEquip() throws EPPIXFatalException{
        return (SbeSubEquip)getBLO(SbeSubEquip.class);
 	}
	
	public PswPrepaidSwap pswPrepaidSwap() throws EPPIXFatalException{
        return (PswPrepaidSwap)getBLO(PswPrepaidSwap.class);
 	}
	
	public EmqMessageQue emqMessageQue() throws EPPIXFatalException{
        return (EmqMessageQue)getBLO(EmqMessageQue.class);
 	}
	
	public MbmMailBatchMon mbmMailBatchMon() throws EPPIXFatalException{
        return (MbmMailBatchMon)getBLO(MbmMailBatchMon.class);
 	}
	
	public EmaMessageArchive emaMessageArchive() throws EPPIXFatalException{
        return (EmaMessageArchive)getBLO(EmaMessageArchive.class);
 	}
	
	public CrbaCustRiskAux crbaCustRiskAux() throws EPPIXFatalException{
        return (CrbaCustRiskAux)getBLO(CrbaCustRiskAux.class);
 	}
	
	public AuxCustEncrypted auxCustEncrypted() throws EPPIXFatalException{
		return (AuxCustEncrypted) getBLO(AuxCustEncrypted.class);
	}
}
