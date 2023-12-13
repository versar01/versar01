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

import java.sql.Connection;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.dml.AneApnNonEppixDMLFactory;
import com.eppixcomm.eppix.base.dml.ApmApnPopMainDMLFactory;
import com.eppixcomm.eppix.base.dml.CreateActionManagerNoteDMLFactory;
import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.EcEventCommandDMLFactory;
import com.eppixcomm.eppix.base.dml.EcdEventCmdDetDMLFactory;
import com.eppixcomm.eppix.base.dml.EdEventDependsDMLFactory;
import com.eppixcomm.eppix.base.dml.EiEppixIsisAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.EppixDeviceInsPlatformDMLFactory;
import com.eppixcomm.eppix.base.dml.EqEventQueueDMLFactory;
import com.eppixcomm.eppix.base.dml.FdFieldDefAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.GetCrbChargesDMLFactory;
import com.eppixcomm.eppix.base.dml.GetCustomerDMLFactory;
import com.eppixcomm.eppix.base.dml.GetRoamingAvgUsageDMLFactory;
import com.eppixcomm.eppix.base.dml.GetSULMaxUsageAllowedDMLFactory;
import com.eppixcomm.eppix.base.dml.GetServiceDiscountDMLFactory;
import com.eppixcomm.eppix.base.dml.GetSubscriberUpgradeEligibilityDMLFactory;
import com.eppixcomm.eppix.base.dml.NcrCompressRuleAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.NctCompressTypeAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.NtpNetTransPendDMLFactory;
import com.eppixcomm.eppix.base.dml.OpservmAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.PdPortDetailsAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.PsdParamServDetDMLFactory;
import com.eppixcomm.eppix.base.dml.PshParamServHdrDMLFactory;
import com.eppixcomm.eppix.base.dml.SelfServBundleProvDMLFactory;
import com.eppixcomm.eppix.base.dml.SeqMapN2NAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.HeliosRpcServicesDMLFactory;
import com.eppixcomm.eppix.base.dml.IDAccSubServListDMLFactory;
import com.eppixcomm.eppix.base.dml.SimAPNServicesDMLFactory;
import com.eppixcomm.eppix.base.dml.SlcustmDMLFactory;
import com.eppixcomm.eppix.base.dml.SmhSimHistoryAbstractDMLFactory;
import com.eppixcomm.eppix.base.dml.SubscriberActiveServicesDMLFactory;
import com.eppixcomm.eppix.base.dml.SubscriberUpgradeMigradeDMLFactory;
import com.eppixcomm.eppix.base.dml.SysdirmDMLFactory;
import com.eppixcomm.eppix.base.dml.TolSimNosDMLFactory;
import com.eppixcomm.eppix.base.dml.TsTariffServiceDMLFactory;
import com.eppixcomm.eppix.base.dml.VamActiveMsisdnDMLFactory;
import com.eppixcomm.eppix.base.dml.VsmServiceMsisdnDMLFactory;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author
 */
public class BaseDACFactory extends BaseAbstractDACFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////
	/** Error handler/logger. */
	static Thrower thrower = Thrower.getThrower(BaseDACFactory.class);
	private Logger logger = thrower.getLogger();

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	// private Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new BaseDACFactory object.
	 *
	 * @param userContext
	 *            the user's context.
	 *
	 * @throws EPPIXFatalException
	 */
	public BaseDACFactory(UserContext userContext) throws EPPIXFatalException {
		super(userContext);
	}

	/**
	 * Creates a new BaseDACFactory object.
	 *
	 * @param userContext
	 *            DOCUMENT ME!
	 * @param connection
	 *            DOCUMENT ME!
	 *
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public BaseDACFactory(UserContext userContext, Connection connection)
			throws EPPIXFatalException {
		super(userContext, connection);
	}

	public DAC getDAC(Class clazz) throws EPPIXFatalException {

		if (clazz == EqEventQueueDAC.class) {
			return (DAC) getEqEventQueueDAC();
		} else if (clazz == EcEventCommandDAC.class) {
			return (DAC) getEcEventCommandDAC();
		}

		return super.getDAC(clazz);
	}

	public EqEventQueueDAC getEqEventQueueDAC() throws EPPIXFatalException {
		logger.debug("getEqEventQueueDAC()");

		try {
			return (EqEventQueueDAC) getDAC(EqEventQueueDACImpl.class,
					EqEventQueueDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public EcEventCommandDAC getEcEventCommandDAC() throws EPPIXFatalException {
		logger.debug("getEcEventCommandDAC()");

		try {

			return (EcEventCommandDAC) getDAC(EcEventCommandDACImpl.class,
					EcEventCommandDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public EdEventDependsAbstractDAC getEdEventDependsDAC()
			throws EPPIXFatalException {
		logger.debug("getEdEventDependsDAC()");

		try {

			return (EdEventDependsAbstractDAC) getDAC(
					EdEventDependsAbstractDACImpl.class,
					EdEventDependsDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public EcdEventCmdDetDAC getEcdEventCmdDetDAC() throws EPPIXFatalException {
		logger.debug("getEcdEventCmdDetDAC()");

		try {

			return (EcdEventCmdDetDAC) getDAC(EcdEventCmdDetDACImpl.class,
					EcdEventCmdDetDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public NtpNetTransPendAbstractDAC getNtpNetTransPendDAC()
			throws EPPIXFatalException {
		logger.debug("getNtpNetTransPendDAC()");

		try {

			return (NtpNetTransPendAbstractDAC) getDAC(
					NtpNetTransPendAbstractDACImpl.class,
					NtpNetTransPendDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	// ==========================================================================================

	public PshParamServHdrDAC getPshParamServHdrDAC()
			throws EPPIXFatalException {
		logger.debug("getPshParamServHdrDAC()");

		try {

			return (PshParamServHdrDAC) getDAC(PshParamServHdrDACImpl.class,
					PshParamServHdrDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public PsdParamServDetDAC getPsdParamServDetDAC()
			throws EPPIXFatalException {
		logger.debug("getPsdParamServDetDAC()");

		try {

			return (PsdParamServDetDAC) getDAC(PsdParamServDetDACImpl.class,
					PsdParamServDetDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public ApmApnPopMainAbstractDAC getApmApnPopMainDAC()
			throws EPPIXFatalException {
		logger.debug("getApmApnPopMainDAC()");

		try {

			return (ApmApnPopMainAbstractDAC) getDAC(
					ApmApnPopMainAbstractDACImpl.class,
					ApmApnPopMainDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public AneApnNonEppixAbstractDAC getAneApnNonEppixDAC()
			throws EPPIXFatalException {
		logger.debug("getAneApnNonEppixDAC()");

		try {

			return (AneApnNonEppixAbstractDAC) getDAC(
					AneApnNonEppixAbstractDACImpl.class,
					AneApnNonEppixDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public VamActiveMsisdnDAC getVamActiveMsisdnDAC()
			throws EPPIXFatalException {
		logger.debug("getVamActiveMsisdnDAC()");

		try {

			return (VamActiveMsisdnDAC) getDAC(VamActiveMsisdnDACImpl.class,
					VamActiveMsisdnDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public VsmServiceMsisdnDAC getVsmServiceMsisdnDAC()
			throws EPPIXFatalException {
		logger.debug("getVsmServiceMsisdnDAC()");
		try {

			return (VsmServiceMsisdnDAC) getDAC(VsmServiceMsisdnDACImpl.class,
					VsmServiceMsisdnDMLFactory.getDMLFactory());
		}

		catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;

	}

	public TsTariffServiceDAC getTsTariffServiceDAC()
			throws EPPIXFatalException {
		logger.debug("getTsTariffServiceDAC()");
		try {
			return (TsTariffServiceDAC) getDAC(TsTariffServiceDACImpl.class,
					TsTariffServiceDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;

	}

	public SeqMapN2NAbstractDAC getSeqMapN2NDAC() throws EPPIXFatalException {
		logger.debug("getSeqMapN2NDAC()");

		try {

			return (SeqMapN2NAbstractDAC) getDAC(
					SeqMapN2NAbstractDACImpl.class,
					SeqMapN2NAbstractDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public NctCompressTypeAbstractDAC getNctCompressTypeDAC()
			throws EPPIXFatalException {
		logger.debug("getNctCompressTypeDAC()");

		try {

			return (NctCompressTypeAbstractDAC) getDAC(
					NctCompressTypeAbstractDACImpl.class,
					NctCompressTypeAbstractDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public NcrCompressRuleAbstractDAC getNcrCompressRuleDAC()
			throws EPPIXFatalException {
		logger.debug("getNcrCompressRuleDAC()");

		try {

			return (NcrCompressRuleAbstractDAC) getDAC(
					NcrCompressRuleAbstractDACImpl.class,
					NcrCompressRuleAbstractDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public EiEppixIsisAbstractDAC getEiEppixIsisDAC()
			throws EPPIXFatalException {
		logger.debug("getEiEppixIsisDAC()");

		try {

			return (EiEppixIsisAbstractDAC) getDAC(
					EiEppixIsisAbstractDACImpl.class,
					EiEppixIsisAbstractDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public TolSimNosDAC getTolSimNosDAC() throws EPPIXFatalException {
		logger.debug("getTolSimNosDAC()");

		try {

			return (TolSimNosDAC) getDAC(TolSimNosDACImpl.class,
					TolSimNosDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public OpservmAbstractDAC getOpservmDAC() throws EPPIXFatalException {
		logger.debug("getOpservmDAC()");

		try {

			return (OpservmAbstractDAC) getDAC(OpservmDACImpl.class,
					OpservmAbstractDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public SmhSimHistoryAbstractDAC getSmhSimHistoryDAC()
			throws EPPIXFatalException {
		logger.debug("getTolSimNosDAC()");

		try {

			return (SmhSimHistoryAbstractDAC) getDAC(
					SmhSimHistoryAbstractDACImpl.class,
					SmhSimHistoryAbstractDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public PdPortDetailsDAC getPdPortDetailsDAC() throws EPPIXFatalException {
		logger.debug("getPdPortDetailsDAC()");

		try {

			return (PdPortDetailsDAC) getDAC(PdPortDetailsDACImpl.class,
					PdPortDetailsAbstractDMLFactory.getDMLFactory());

		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public GetServiceDiscountDAC getGetServiceDiscountDAC()
			throws EPPIXFatalException {
		logger.debug("getGetServiceDiscountDAC()");

		try {
			return (GetServiceDiscountDAC) getDAC(
					GetServiceDiscountDACImpl.class,
					GetServiceDiscountDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public GetRoamingAvgUsageDAC getGetRoamingAvgUsageDAC()
			throws EPPIXFatalException {
		logger.debug("getRoamingAvgUsageDAC()");

		try {
			return (GetRoamingAvgUsageDAC) getDAC(
					GetRoamingAvgUsageDACImpl.class,
					GetRoamingAvgUsageDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public HeliosRpcServicesDAC getHeliosRpcServicesDAC()
			throws EPPIXFatalException {
		logger.debug("getSimGetForMsisdnDAC()");

		try {
			return (HeliosRpcServicesDAC) getDAC(HeliosRpcServicesDACImpl.class,
					HeliosRpcServicesDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public SimAPNServicesDAC getSimAPNServicesDAC()
			throws EPPIXFatalException {
		logger.debug("getSimAPNServicesDAC");

		try {
			return (SimAPNServicesDAC) getDAC(SimAPNServicesDACImpl.class,
					SimAPNServicesDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public EppixDeviceInsPlatformDAC getEppixDeviceInsPlatformDAC()
			throws EPPIXFatalException {
		logger.debug("getEppixDeviceInsPlatformDAC");

		try {
			return (EppixDeviceInsPlatformDAC) getDAC(EppixDeviceInsPlatformDACImpl.class,
					EppixDeviceInsPlatformDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public GetCrbChargesDAC getGetCrbChargesDAC()
			throws EPPIXFatalException {
		logger.debug("getGetCrbChargesDAC");

		try {
			return (GetCrbChargesDAC) getDAC(GetCrbChargesDACImpl.class,
					GetCrbChargesDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public SubscriberActiveServicesDAC getSubscriberActiveServicesDAC()
			throws EPPIXFatalException {
		logger.debug("getSubscriberActiveServicesDAC");

		try {
			return (SubscriberActiveServicesDAC) getDAC(SubscriberActiveServicesDACImpl.class,
					SubscriberActiveServicesDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public SubscriberUpgradeMigradeDAC getSubscriberUpgradeMigradeDAC()
			throws EPPIXFatalException {
		logger.debug("getSubscriberUpgradeMigradeDAC");

		try {
			return (SubscriberUpgradeMigradeDAC) getDAC(SubscriberUpgradeMigradeDACImpl.class,
					SubscriberUpgradeMigradeDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public GetSULMaxUsageAllowedDAC getGetSULMaxUsageAllowedDAC()
			throws EPPIXFatalException {
		logger.debug("getGetSULMaxUsageAllowedDAC");

		try {
			return (GetSULMaxUsageAllowedDAC) getDAC(GetSULMaxUsageAllowedDACImpl.class,
					GetSULMaxUsageAllowedDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public SelfServBundleProvDAC getSelfServBundleProvDAC()
			throws EPPIXFatalException {
		logger.debug("getSelfServBundleProvDAC");

		try {
			return (SelfServBundleProvDAC) getDAC(SelfServBundleProvDACImpl.class,
					SelfServBundleProvDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public GetSubscriberUpgradeEligibilityDAC getGetSubscriberUpgradeEligibilityDAC()
			throws EPPIXFatalException {
		logger.debug("GetSubscriberUpgradeEligibilityDAC");

		try {
			return (GetSubscriberUpgradeEligibilityDAC) getDAC(GetSubscriberUpgradeEligibilityDACImpl.class,
					GetSubscriberUpgradeEligibilityDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

	public IDAccSubServListDAC getIDAccSubServListDAC()
			throws EPPIXFatalException {
		logger.debug("getIDAccSubServListDAC");

		try {
			return (IDAccSubServListDAC) getDAC(IDAccSubServListDACImpl.class,
					IDAccSubServListDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public GetCustomerDAC getGetCustomerDAC()
			throws EPPIXFatalException {
		logger.debug("getGetCustomerDAC");

		try {
			return (GetCustomerDAC) getDAC(GetCustomerDACImpl.class,
					GetCustomerDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}
	
	public CreateActionManagerNoteDAC getCreateActionManagerNoteDAC()
			throws EPPIXFatalException {
		logger.debug("getGetCustomerDAC");

		try {
			return (CreateActionManagerNoteDAC) getDAC(CreateActionManagerNoteDACImpl.class,
					CreateActionManagerNoteDMLFactory.getDMLFactory());
		} catch (DMLException e) {
			thrower.fatal(e);
		}
		return null;
	}

}
