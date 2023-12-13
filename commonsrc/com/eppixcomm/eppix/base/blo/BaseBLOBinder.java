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

import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.blo.Language;
import com.eppixcomm.eppix.common.data.ConnectionContext;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.EppixLocale;
import com.eppixcomm.eppix.common.util.ResourceLoader;

import java.sql.Connection;
import java.util.Properties;

/**
 * This class contains any additional logic for BaseBLOBinder, if any. It
 * extends the BaseAbstractBLOBinder which holds all the default logic for this
 * class.
 * 
 * @author ${Author}
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
public class BaseBLOBinder extends BaseAbstractBLOBinder {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	// private static Thrower thrower = Thrower.getThrower(BaseBLOBinder.class);

	// ~ Constructors
	// ///////////////////////////////////////////////////////////
	/**
	 * Creates a new BaseBLOBinder object.
	 * 
	 * @param locale
	 *            DOCUMENT ME!
	 * @param ctx
	 *            DOCUMENT ME!
	 * 
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	// public BaseBLOBinder(EppixLocale locale, SessionContext ctx)
	// throws EPPIXFatalException {
	// super(locale, ctx);
	// }
	/**
	 * Creates a new BaseBLOBinder object.
	 * 
	 * @param loginName
	 *            DOCUMENT ME!
	 * @param locale
	 *            DOCUMENT ME!
	 * @param connection
	 *            DOCUMENT ME!
	 * 
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public BaseBLOBinder(String loginName, EppixLocale locale,
			Connection connection) throws EPPIXFatalException {
		super(loginName, locale, connection);
	}

	public BaseBLOBinder(String loginName, EppixLocale locale, Class dac,
			Connection connection) throws EPPIXFatalException {
		super(loginName, locale, dac, connection);
	}

	public GetServiceDiscount getServiceDiscount() throws EPPIXFatalException {
		return (GetServiceDiscount) getBLO(GetServiceDiscount.class);
	}

	public GetRoamingAvgUsage getRoamingAvgUsage() throws EPPIXFatalException {
		return (GetRoamingAvgUsage) getBLO(GetRoamingAvgUsage.class);
	}
	
	public HeliosRpcServices getHeliosRpcServices() throws EPPIXFatalException {
		return (HeliosRpcServices) getBLO(HeliosRpcServices.class);
	}
	
	public SimAPNServices getSimAPNServices() throws EPPIXFatalException {
		return (SimAPNServices) getBLO(SimAPNServices.class);
	}
		
	public EppixDeviceInsPlatform getEppixDeviceInsPlatform() throws EPPIXFatalException {
		return (EppixDeviceInsPlatform) getBLO(EppixDeviceInsPlatform.class);
	}
	
	public GetCrbCharges getGetCrbCharges() throws EPPIXFatalException {
		return (GetCrbCharges) getBLO(GetCrbCharges.class);
	}
	
	public SubscriberActiveServices subscriberActiveServices() throws EPPIXFatalException {
		return (SubscriberActiveServices) getBLO(SubscriberActiveServices.class);
	}
	
	public SubscriberUpgradeMigrade subscriberUpgradeMigrade() throws EPPIXFatalException {
		return (SubscriberUpgradeMigrade) getBLO(SubscriberUpgradeMigrade.class);
	}
	
	public GetSULMaxUsageAllowed getGetSULMaxUsageAllowed() throws EPPIXFatalException {
		return (GetSULMaxUsageAllowed) getBLO(GetSULMaxUsageAllowed.class);
	}
		
	public SelfServBundleProv getSelfServBundleProv() throws EPPIXFatalException {
			return (SelfServBundleProv) getBLO(SelfServBundleProv.class);
	}
	
	public GetSubscriberUpgradeEligibility getGetSubscriberUpgradeEligibility() throws EPPIXFatalException {
		return (GetSubscriberUpgradeEligibility) getBLO(GetSubscriberUpgradeEligibility.class);
	}
		
	public IDAccSubServList getIDAccSubServList() throws EPPIXFatalException {
		return (IDAccSubServList) getBLO(IDAccSubServList.class);
	}
	
	public GetCustomer getGetCustomer() throws EPPIXFatalException {
		return (GetCustomer) getBLO(GetCustomer.class);
	}
	
	public CreateActionManagerNote getCreateActionManagerNote() throws EPPIXFatalException {
		return (CreateActionManagerNote) getBLO(CreateActionManagerNote.class);
	}
}
