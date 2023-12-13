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

import com.eppixcomm.eppix.base.error.Message;

/**
 * DOCUMENT ME!
 * 
 * @version $Revision: 1.3 $
 * @author
 */
public interface BaseMessages extends BaseMessagesAbstract {

	public static final Message Base_SYSDIRM_000 = new Message(
			"Base/SYSDIRM/000", "Sysdirm does not exist: " + "systemKey=$0");

	/**
	 * Base/SYSDIRM/001: Unable to create Sysdirm because it already exists:
	 * 
	 * 
	 * systemKey=$0
	 */
	public static final Message Base_SYSDIRM_001 = new Message(
			"Base/SYSDIRM/001",
			"Unable to create Sysdirm because it already exists: "
					+ "systemKey=$0");

	/**
	 * Base/SYSDIRM/003: Unable to delete Sysdirm because it is in use:
	 * 
	 * 
	 * systemKey=$0
	 */
	public static final Message Base_SYSDIRM_003 = new Message(
			"Base/Sysdirm/003",
			"Unable to delete Sysdirm  because it is in use: " + "systemKey=$0");

	/**
	 * Base/SYSDIRM/005: Unable to create association with SYSDIRM because
	 * SYSDIRM is already in use: id=$0
	 */
	public static final Message Base_SYSDIRM_005 = new Message(
			"Base/SYSDIRM/005", "Unable to create association with SYSDIRM "
					+ "because SYSDIRM is " + "already in use: id=$0");

	/**
	 * Base/SYSDIRM/006: Unable to delete AAA because this will orphan B: id=$0
	 */
	public static final Message Base_SYSDIRM_006 = new Message(
			"Base/SYSDIRM/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SYSDIRM/009: Unable to create association because SYSDIRM is already
	 * associated to the child object: id=$0
	 */
	public static final Message Base_SYSDIRM_009 = new Message(
			"Base/SYSDIRM/009", "Unable to create association because SYSDIRM"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SYSDIRM/013: Unable to disassociate SYSDIRM AAA because this will
	 * orphan B: id=$0" );
	 */
	public static final Message Base_SYSDIRM_013 = new Message(
			"Base/SYSDIRM/013", "Unable to disassociate because SYSDIRM "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/PTMPERMTOMARKET/000: PtmPermToMarket does not exist:
	 * 
	 * 
	 * ptmBillAcNo=$0
	 * 
	 */
	public static final Message Base_PTMPERMTOMARKET_000 = new Message(
			"Base/PTMPERMTOMARKET/000", "PtmPermToMarket does not exist: "
					+ "ptmBillAcNo=$0");

	/**
	 * Base/PTMPERMTOMARKET/001: Unable to create PtmPermToMarket because it
	 * already exists:
	 * 
	 * 
	 * ptmBillAcNo=$0
	 * 
	 * 
	 */
	public static final Message Base_PTMPERMTOMARKET_001 = new Message(
			"Base/PTMPERMTOMARKET/001",
			"Unable to create PtmPermToMarket because it already exists: "
					+ "ptmBillAcNo=$0");

	/**
	 * Base/PTMPERMTOMARKET/003: Unable to delete PtmPermToMarket because it is
	 * in use:
	 * 
	 * 
	 * ptmBillAcNo=$0
	 * 
	 * 
	 */
	public static final Message Base_PTMPERMTOMARKET_003 = new Message(
			"Base/PtmPermToMarket/003",
			"Unable to delete PtmPermToMarket  because it is in use: "
					+ "ptmBillAcNo=$0");

	/**
	 * Base/PTMPERMTOMARKET/005: Unable to create association with
	 * PTMPERMTOMARKET because PTMPERMTOMARKET is already in use: id=$0
	 */
	public static final Message Base_PTMPERMTOMARKET_005 = new Message(
			"Base/PTMPERMTOMARKET/005",
			"Unable to create association with PTMPERMTOMARKET "
					+ "because PTMPERMTOMARKET is " + "already in use: id=$0");

	/**
	 * Base/PTMPERMTOMARKET/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_PTMPERMTOMARKET_006 = new Message(
			"Base/PTMPERMTOMARKET/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/PTMPERMTOMARKET/009: Unable to create association because
	 * PTMPERMTOMARKET is already associated to the child object: id=$0
	 */
	public static final Message Base_PTMPERMTOMARKET_009 = new Message(
			"Base/PTMPERMTOMARKET/009",
			"Unable to create association because PTMPERMTOMARKET"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/PTMPERMTOMARKET/013: Unable to disassociate PTMPERMTOMARKET AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_PTMPERMTOMARKET_013 = new Message(
			"Base/PTMPERMTOMARKET/013",
			"Unable to disassociate because PTMPERMTOMARKET "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SORTCODES/000: Sortcodes does not exist:
	 * 
	 * 
	 * sortcode=$0
	 */
	public static final Message Base_SORTCODES_000 = new Message(
			"Base/SORTCODES/000", "Sortcodes does not exist: " + "sortcode=$0");

	/**
	 * Base/SORTCODES/001: Unable to create Sortcodes because it already exists:
	 * 
	 * 
	 * sortcode=$0
	 */
	public static final Message Base_SORTCODES_001 = new Message(
			"Base/SORTCODES/001",
			"Unable to create Sortcodes because it already exists: "
					+ "sortcode=$0");

	/**
	 * Base/SORTCODES/003: Unable to delete Sortcodes because it is in use:
	 * 
	 * 
	 * sortcode=$0
	 */
	public static final Message Base_SORTCODES_003 = new Message(
			"Base/Sortcodes/003",
			"Unable to delete Sortcodes  because it is in use: "
					+ "sortcode=$0");

	/**
	 * Base/SORTCODES/005: Unable to create association with SORTCODES because
	 * SORTCODES is already in use: id=$0
	 */
	public static final Message Base_SORTCODES_005 = new Message(
			"Base/SORTCODES/005",
			"Unable to create association with SORTCODES "
					+ "because SORTCODES is " + "already in use: id=$0");

	/**
	 * Base/SORTCODES/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SORTCODES_006 = new Message(
			"Base/SORTCODES/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SORTCODES/009: Unable to create association because SORTCODES is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_SORTCODES_009 = new Message(
			"Base/SORTCODES/009",
			"Unable to create association because SORTCODES"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SORTCODES/013: Unable to disassociate SORTCODES AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_SORTCODES_013 = new Message(
			"Base/SORTCODES/013", "Unable to disassociate because SORTCODES "
					+ " AAA because this will orphan B: id=$0");

	public static final Message Base_TPTARIFFPLAN_000 = new Message(
			"Base/TPTARIFFPLAN/000", "Tariff Plan does not exist: "
					+ "tariff=$0");

	public static final Message Base_TPTARIFFPLAN_001 = new Message(
			"Base/TPTARIFFPLAN/001",
			"Unable to create TpTariffPlan because it already exists: "
					+ "tariff=$0");

	/**
	 * Base/DEALERS/000: Dealers does not exist:
	 * 
	 * 
	 * dealerId=$0
	 */
	public static final Message Base_DEALERS_000 = new Message(
			"Base/DEALERS/000", "Dealers does not exist: " + "dealerId=$0");

	/**
	 * Base/DEALERS/001: Unable to create Dealers because it already exists:
	 * 
	 * 
	 * dealerId=$0
	 */
	public static final Message Base_DEALERS_001 = new Message(
			"Base/DEALERS/001",
			"Unable to create Dealers because it already exists: "
					+ "dealerId=$0");

	/**
	 * Base/DEALERS/003: Unable to delete Dealers because it is in use:
	 * 
	 * 
	 * dealerId=$0
	 */
	public static final Message Base_DEALERS_003 = new Message(
			"Base/Dealers/003",
			"Unable to delete Dealers  because it is in use: " + "dealerId=$0");

	/**
	 * Base/DEALERS/005: Unable to create association with DEALERS because
	 * DEALERS is already in use: id=$0
	 */
	public static final Message Base_DEALERS_005 = new Message(
			"Base/DEALERS/005", "Unable to create association with DEALERS "
					+ "because DEALERS is " + "already in use: id=$0");

	/**
	 * Base/DEALERS/006: Unable to delete AAA because this will orphan B: id=$0
	 */
	public static final Message Base_DEALERS_006 = new Message(
			"Base/DEALERS/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DEALERS/009: Unable to create association because DEALERS is already
	 * associated to the child object: id=$0
	 */
	public static final Message Base_DEALERS_009 = new Message(
			"Base/DEALERS/009", "Unable to create association because DEALERS"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DEALERS/013: Unable to disassociate DEALERS AAA because this will
	 * orphan B: id=$0" );
	 */
	public static final Message Base_DEALERS_013 = new Message(
			"Base/DEALERS/013", "Unable to disassociate because DEALERS "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/BCYBILLINGCYCLE/000: BcyBillingCycle does not exist:
	 * 
	 * 
	 * bcyBillCycle=$0
	 */
	public static final Message Base_BCYBILLINGCYCLE_000 = new Message(
			"Base/BCYBILLINGCYCLE/000", "BcyBillingCycle does not exist: "
					+ "bcyBillCycle=$0");

	/**
	 * Base/BCYBILLINGCYCLE/001: Unable to create BcyBillingCycle because it
	 * already exists:
	 * 
	 * 
	 * bcyBillCycle=$0
	 */
	public static final Message Base_BCYBILLINGCYCLE_001 = new Message(
			"Base/BCYBILLINGCYCLE/001",
			"Unable to create BcyBillingCycle because it already exists: "
					+ "bcyBillCycle=$0");

	/**
	 * Base/BCYBILLINGCYCLE/003: Unable to delete BcyBillingCycle because it is
	 * in use:
	 * 
	 * 
	 * bcyBillCycle=$0
	 */
	public static final Message Base_BCYBILLINGCYCLE_003 = new Message(
			"Base/BcyBillingCycle/003",
			"Unable to delete BcyBillingCycle  because it is in use: "
					+ "bcyBillCycle=$0");

	/**
	 * Base/BCYBILLINGCYCLE/005: Unable to create association with
	 * BCYBILLINGCYCLE because BCYBILLINGCYCLE is already in use: id=$0
	 */
	public static final Message Base_BCYBILLINGCYCLE_005 = new Message(
			"Base/BCYBILLINGCYCLE/005",
			"Unable to create association with BCYBILLINGCYCLE "
					+ "because BCYBILLINGCYCLE is " + "already in use: id=$0");

	/**
	 * Base/BCYBILLINGCYCLE/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_BCYBILLINGCYCLE_006 = new Message(
			"Base/BCYBILLINGCYCLE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/BCYBILLINGCYCLE/009: Unable to create association because
	 * BCYBILLINGCYCLE is already associated to the child object: id=$0
	 */
	public static final Message Base_BCYBILLINGCYCLE_009 = new Message(
			"Base/BCYBILLINGCYCLE/009",
			"Unable to create association because BCYBILLINGCYCLE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/BCYBILLINGCYCLE/013: Unable to disassociate BCYBILLINGCYCLE AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_BCYBILLINGCYCLE_013 = new Message(
			"Base/BCYBILLINGCYCLE/013",
			"Unable to disassociate because BCYBILLINGCYCLE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DIBDISCOUNTBAND/000: DibDiscountBand does not exist:
	 * 
	 * 
	 * dibBandId=$0
	 * 
	 * 
	 * dibRuleId=$1
	 * 
	 * 
	 * dibBandEnd=$2
	 */
	public static final Message Base_DIBDISCOUNTBAND_000 = new Message(
			"Base/DIBDISCOUNTBAND/000", "DibDiscountBand does not exist: "
					+ "dibBandId=$0" + "dibRuleId=$1" + "dibBandEnd=$2");

	/**
	 * Base/DIBDISCOUNTBAND/001: Unable to create DibDiscountBand because it
	 * already exists:
	 * 
	 * 
	 * dibBandId=$0
	 * 
	 * 
	 * dibRuleId=$1
	 * 
	 * 
	 * dibBandEnd=$2
	 */
	public static final Message Base_DIBDISCOUNTBAND_001 = new Message(
			"Base/DIBDISCOUNTBAND/001",
			"Unable to create DibDiscountBand because it already exists: "
					+ "dibBandId=$0" + "dibRuleId=$1" + "dibBandEnd=$2");

	/**
	 * Base/DIBDISCOUNTBAND/003: Unable to delete DibDiscountBand because it is
	 * in use:
	 * 
	 * 
	 * dibBandId=$0
	 * 
	 * 
	 * dibRuleId=$1
	 * 
	 * 
	 * dibBandEnd=$2
	 */
	public static final Message Base_DIBDISCOUNTBAND_003 = new Message(
			"Base/DibDiscountBand/003",
			"Unable to delete DibDiscountBand  because it is in use: "
					+ "dibBandId=$0" + "dibRuleId=$1" + "dibBandEnd=$2");

	/**
	 * Base/DIBDISCOUNTBAND/005: Unable to create association with
	 * DIBDISCOUNTBAND because DIBDISCOUNTBAND is already in use: id=$0
	 */
	public static final Message Base_DIBDISCOUNTBAND_005 = new Message(
			"Base/DIBDISCOUNTBAND/005",
			"Unable to create association with DIBDISCOUNTBAND "
					+ "because DIBDISCOUNTBAND is " + "already in use: id=$0");

	/**
	 * Base/DIBDISCOUNTBAND/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_DIBDISCOUNTBAND_006 = new Message(
			"Base/DIBDISCOUNTBAND/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DIBDISCOUNTBAND/009: Unable to create association because
	 * DIBDISCOUNTBAND is already associated to the child object: id=$0
	 */
	public static final Message Base_DIBDISCOUNTBAND_009 = new Message(
			"Base/DIBDISCOUNTBAND/009",
			"Unable to create association because DIBDISCOUNTBAND"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DIBDISCOUNTBAND/013: Unable to disassociate DIBDISCOUNTBAND AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_DIBDISCOUNTBAND_013 = new Message(
			"Base/DIBDISCOUNTBAND/013",
			"Unable to disassociate because DIBDISCOUNTBAND "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/CHGCHARGES/000: ChgCharges does not exist:
	 * 
	 * 
	 * chgCode=$0
	 * 
	 * 
	 * chgNetid=$1
	 * 
	 * 
	 * chgEffectiveDate=$2
	 */
	public static final Message Base_CHGCHARGES_000 = new Message(
			"Base/CHGCHARGES/000", "ChgCharges does not exist: " + "chgCode=$0"
					+ "chgNetid=$1" + "chgEffectiveDate=$2");

	/**
	 * Base/CHGCHARGES/001: Unable to create ChgCharges because it already
	 * exists:
	 * 
	 * 
	 * chgCode=$0
	 * 
	 * 
	 * chgNetid=$1
	 * 
	 * 
	 * chgEffectiveDate=$2
	 */
	public static final Message Base_CHGCHARGES_001 = new Message(
			"Base/CHGCHARGES/001",
			"Unable to create ChgCharges because it already exists: "
					+ "chgCode=$0" + "chgNetid=$1" + "chgEffectiveDate=$2");

	/**
	 * Base/CHGCHARGES/003: Unable to delete ChgCharges because it is in use:
	 * 
	 * 
	 * chgCode=$0
	 * 
	 * 
	 * chgNetid=$1
	 * 
	 * 
	 * chgEffectiveDate=$2
	 */
	public static final Message Base_CHGCHARGES_003 = new Message(
			"Base/ChgCharges/003",
			"Unable to delete ChgCharges  because it is in use: "
					+ "chgCode=$0" + "chgNetid=$1" + "chgEffectiveDate=$2");

	/**
	 * Base/CHGCHARGES/005: Unable to create association with CHGCHARGES because
	 * CHGCHARGES is already in use: id=$0
	 */
	public static final Message Base_CHGCHARGES_005 = new Message(
			"Base/CHGCHARGES/005",
			"Unable to create association with CHGCHARGES "
					+ "because CHGCHARGES is " + "already in use: id=$0");

	/**
	 * Base/CHGCHARGES/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_CHGCHARGES_006 = new Message(
			"Base/CHGCHARGES/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/CHGCHARGES/009: Unable to create association because CHGCHARGES is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_CHGCHARGES_009 = new Message(
			"Base/CHGCHARGES/009",
			"Unable to create association because CHGCHARGES"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/CHGCHARGES/013: Unable to disassociate CHGCHARGES AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_CHGCHARGES_013 = new Message(
			"Base/CHGCHARGES/013", "Unable to disassociate because CHGCHARGES "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/CNYCURRENCY/000: CnyCurrency does not exist:
	 * 
	 * 
	 * cnyCurrencyRef=$0
	 */
	public static final Message Base_CNYCURRENCY_000 = new Message(
			"Base/CNYCURRENCY/000", "CnyCurrency does not exist: "
					+ "cnyCurrencyRef=$0");

	/**
	 * Base/CNYCURRENCY/001: Unable to create CnyCurrency because it already
	 * exists:
	 * 
	 * 
	 * cnyCurrencyRef=$0
	 */
	public static final Message Base_CNYCURRENCY_001 = new Message(
			"Base/CNYCURRENCY/001",
			"Unable to create CnyCurrency because it already exists: "
					+ "cnyCurrencyRef=$0");

	/**
	 * Base/CNYCURRENCY/003: Unable to delete CnyCurrency because it is in use:
	 * 
	 * 
	 * cnyCurrencyRef=$0
	 */
	public static final Message Base_CNYCURRENCY_003 = new Message(
			"Base/CnyCurrency/003",
			"Unable to delete CnyCurrency  because it is in use: "
					+ "cnyCurrencyRef=$0");

	/**
	 * Base/CNYCURRENCY/005: Unable to create association with CNYCURRENCY
	 * because CNYCURRENCY is already in use: id=$0
	 */
	public static final Message Base_CNYCURRENCY_005 = new Message(
			"Base/CNYCURRENCY/005",
			"Unable to create association with CNYCURRENCY "
					+ "because CNYCURRENCY is " + "already in use: id=$0");

	/**
	 * Base/CNYCURRENCY/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_CNYCURRENCY_006 = new Message(
			"Base/CNYCURRENCY/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/CNYCURRENCY/009: Unable to create association because CNYCURRENCY is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_CNYCURRENCY_009 = new Message(
			"Base/CNYCURRENCY/009",
			"Unable to create association because CNYCURRENCY"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/CNYCURRENCY/013: Unable to disassociate CNYCURRENCY AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_CNYCURRENCY_013 = new Message(
			"Base/CNYCURRENCY/013",
			"Unable to disassociate because CNYCURRENCY "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/CUGUSERGROUP/000: CugUserGroup does not exist:
	 * 
	 * 
	 * cugId=$0
	 */
	public static final Message Base_CUGUSERGROUP_000 = new Message(
			"Base/CUGUSERGROUP/000", "CugUserGroup does not exist: "
					+ "cugId=$0");

	/**
	 * Base/CUGUSERGROUP/001: Unable to create CugUserGroup because it already
	 * exists:
	 * 
	 * 
	 * cugId=$0
	 */
	public static final Message Base_CUGUSERGROUP_001 = new Message(
			"Base/CUGUSERGROUP/001",
			"Unable to create CugUserGroup because it already exists: "
					+ "cugId=$0");

	/**
	 * Base/CUGUSERGROUP/003: Unable to delete CugUserGroup because it is in
	 * use:
	 * 
	 * 
	 * cugId=$0
	 */
	public static final Message Base_CUGUSERGROUP_003 = new Message(
			"Base/CugUserGroup/003",
			"Unable to delete CugUserGroup  because it is in use: "
					+ "cugId=$0");

	/**
	 * Base/CUGUSERGROUP/005: Unable to create association with CUGUSERGROUP
	 * because CUGUSERGROUP is already in use: id=$0
	 */
	public static final Message Base_CUGUSERGROUP_005 = new Message(
			"Base/CUGUSERGROUP/005",
			"Unable to create association with CUGUSERGROUP "
					+ "because CUGUSERGROUP is " + "already in use: id=$0");

	/**
	 * Base/CUGUSERGROUP/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_CUGUSERGROUP_006 = new Message(
			"Base/CUGUSERGROUP/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/CUGUSERGROUP/009: Unable to create association because CUGUSERGROUP
	 * is already associated to the child object: id=$0
	 */
	public static final Message Base_CUGUSERGROUP_009 = new Message(
			"Base/CUGUSERGROUP/009",
			"Unable to create association because CUGUSERGROUP"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/CUGUSERGROUP/013: Unable to disassociate CUGUSERGROUP AAA because
	 * this will orphan B: id=$0" );
	 */
	public static final Message Base_CUGUSERGROUP_013 = new Message(
			"Base/CUGUSERGROUP/013",
			"Unable to disassociate because CUGUSERGROUP "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SPASERVICEPARAMS/000: SpaServiceParams does not exist:
	 * 
	 * 
	 * spaServiceType=$0
	 * 
	 * 
	 * spaParamId=$1
	 */
	public static final Message Base_SPASERVICEPARAMS_000 = new Message(
			"Base/SPASERVICEPARAMS/000", "SpaServiceParams does not exist: "
					+ "spaServiceType=$0" + "spaParamId=$1");

	/**
	 * Base/SPASERVICEPARAMS/001: Unable to create SpaServiceParams because it
	 * already exists:
	 * 
	 * 
	 * spaServiceType=$0
	 * 
	 * 
	 * spaParamId=$1
	 */
	public static final Message Base_SPASERVICEPARAMS_001 = new Message(
			"Base/SPASERVICEPARAMS/001",
			"Unable to create SpaServiceParams because it already exists: "
					+ "spaServiceType=$0" + "spaParamId=$1");

	/**
	 * Base/SPASERVICEPARAMS/003: Unable to delete SpaServiceParams because it
	 * is in use:
	 * 
	 * 
	 * spaServiceType=$0
	 * 
	 * 
	 * spaParamId=$1
	 */
	public static final Message Base_SPASERVICEPARAMS_003 = new Message(
			"Base/SpaServiceParams/003",
			"Unable to delete SpaServiceParams  because it is in use: "
					+ "spaServiceType=$0" + "spaParamId=$1");

	/**
	 * Base/SPASERVICEPARAMS/005: Unable to create association with
	 * SPASERVICEPARAMS because SPASERVICEPARAMS is already in use: id=$0
	 */
	public static final Message Base_SPASERVICEPARAMS_005 = new Message(
			"Base/SPASERVICEPARAMS/005",
			"Unable to create association with SPASERVICEPARAMS "
					+ "because SPASERVICEPARAMS is " + "already in use: id=$0");

	/**
	 * Base/SPASERVICEPARAMS/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_SPASERVICEPARAMS_006 = new Message(
			"Base/SPASERVICEPARAMS/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SPASERVICEPARAMS/009: Unable to create association because
	 * SPASERVICEPARAMS is already associated to the child object: id=$0
	 */
	public static final Message Base_SPASERVICEPARAMS_009 = new Message(
			"Base/SPASERVICEPARAMS/009",
			"Unable to create association because SPASERVICEPARAMS"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SPASERVICEPARAMS/013: Unable to disassociate SPASERVICEPARAMS AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_SPASERVICEPARAMS_013 = new Message(
			"Base/SPASERVICEPARAMS/013",
			"Unable to disassociate because SPASERVICEPARAMS "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DGHDISCGRPHEAD/000: DghDiscGrpHead does not exist:
	 * 
	 * 
	 * dghGroupId=$0
	 */
	public static final Message Base_DGHDISCGRPHEAD_000 = new Message(
			"Base/DGHDISCGRPHEAD/000", "DghDiscGrpHead does not exist: "
					+ "dghGroupId=$0");

	/**
	 * Base/DGHDISCGRPHEAD/001: Unable to create DghDiscGrpHead because it
	 * already exists:
	 * 
	 * 
	 * dghGroupId=$0
	 */
	public static final Message Base_DGHDISCGRPHEAD_001 = new Message(
			"Base/DGHDISCGRPHEAD/001",
			"Unable to create DghDiscGrpHead because it already exists: "
					+ "dghGroupId=$0");

	/**
	 * Base/DGHDISCGRPHEAD/003: Unable to delete DghDiscGrpHead because it is in
	 * use:
	 * 
	 * 
	 * dghGroupId=$0
	 */
	public static final Message Base_DGHDISCGRPHEAD_003 = new Message(
			"Base/DghDiscGrpHead/003",
			"Unable to delete DghDiscGrpHead  because it is in use: "
					+ "dghGroupId=$0");

	/**
	 * Base/DGHDISCGRPHEAD/005: Unable to create association with DGHDISCGRPHEAD
	 * because DGHDISCGRPHEAD is already in use: id=$0
	 */
	public static final Message Base_DGHDISCGRPHEAD_005 = new Message(
			"Base/DGHDISCGRPHEAD/005",
			"Unable to create association with DGHDISCGRPHEAD "
					+ "because DGHDISCGRPHEAD is " + "already in use: id=$0");

	/**
	 * Base/DGHDISCGRPHEAD/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_DGHDISCGRPHEAD_006 = new Message(
			"Base/DGHDISCGRPHEAD/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DGHDISCGRPHEAD/009: Unable to create association because
	 * DGHDISCGRPHEAD is already associated to the child object: id=$0
	 */
	public static final Message Base_DGHDISCGRPHEAD_009 = new Message(
			"Base/DGHDISCGRPHEAD/009",
			"Unable to create association because DGHDISCGRPHEAD"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DGHDISCGRPHEAD/013: Unable to disassociate DGHDISCGRPHEAD AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_DGHDISCGRPHEAD_013 = new Message(
			"Base/DGHDISCGRPHEAD/013",
			"Unable to disassociate because DGHDISCGRPHEAD "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VPKPACKAGE/000: VpkPackage does not exist:
	 * 
	 * 
	 * vpkPackageCode=$0
	 */
	public static final Message Base_VPKPACKAGE_000 = new Message(
			"Base/VPKPACKAGE/000", "VpkPackage does not exist: "
					+ "vpkPackageCode=$0");

	/**
	 * Base/VPKPACKAGE/001: Unable to create VpkPackage because it already
	 * exists:
	 * 
	 * 
	 * vpkPackageCode=$0
	 */
	public static final Message Base_VPKPACKAGE_001 = new Message(
			"Base/VPKPACKAGE/001",
			"Unable to create VpkPackage because it already exists: "
					+ "vpkPackageCode=$0");

	/**
	 * Base/VPKPACKAGE/003: Unable to delete VpkPackage because it is in use:
	 * 
	 * 
	 * vpkPackageCode=$0
	 */
	public static final Message Base_VPKPACKAGE_003 = new Message(
			"Base/VpkPackage/003",
			"Unable to delete VpkPackage  because it is in use: "
					+ "vpkPackageCode=$0");

	/**
	 * Base/VPKPACKAGE/005: Unable to create association with VPKPACKAGE because
	 * VPKPACKAGE is already in use: id=$0
	 */
	public static final Message Base_VPKPACKAGE_005 = new Message(
			"Base/VPKPACKAGE/005",
			"Unable to create association with VPKPACKAGE "
					+ "because VPKPACKAGE is " + "already in use: id=$0");

	/**
	 * Base/VPKPACKAGE/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_VPKPACKAGE_006 = new Message(
			"Base/VPKPACKAGE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VPKPACKAGE/009: Unable to create association because VPKPACKAGE is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_VPKPACKAGE_009 = new Message(
			"Base/VPKPACKAGE/009",
			"Unable to create association because VPKPACKAGE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VPKPACKAGE/013: Unable to disassociate VPKPACKAGE AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_VPKPACKAGE_013 = new Message(
			"Base/VPKPACKAGE/013", "Unable to disassociate because VPKPACKAGE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VPNPROVIDERNETWK/000: VpnProviderNetwk does not exist:
	 * 
	 * 
	 * vpnProviderId=$0
	 * 
	 * 
	 * vpnNetworkPrefix=$1
	 */
	public static final Message Base_VPNPROVIDERNETWK_000 = new Message(
			"Base/VPNPROVIDERNETWK/000", "VpnProviderNetwk does not exist: "
					+ "vpnProviderId=$0" + "vpnNetworkPrefix=$1");

	/**
	 * Base/VPNPROVIDERNETWK/001: Unable to create VpnProviderNetwk because it
	 * already exists:
	 * 
	 * 
	 * vpnProviderId=$0
	 * 
	 * 
	 * vpnNetworkPrefix=$1
	 */
	public static final Message Base_VPNPROVIDERNETWK_001 = new Message(
			"Base/VPNPROVIDERNETWK/001",
			"Unable to create VpnProviderNetwk because it already exists: "
					+ "vpnProviderId=$0" + "vpnNetworkPrefix=$1");

	/**
	 * Base/VPNPROVIDERNETWK/003: Unable to delete VpnProviderNetwk because it
	 * is in use:
	 * 
	 * 
	 * vpnProviderId=$0
	 * 
	 * 
	 * vpnNetworkPrefix=$1
	 */
	public static final Message Base_VPNPROVIDERNETWK_003 = new Message(
			"Base/VpnProviderNetwk/003",
			"Unable to delete VpnProviderNetwk  because it is in use: "
					+ "vpnProviderId=$0" + "vpnNetworkPrefix=$1");

	/**
	 * Base/VPNPROVIDERNETWK/005: Unable to create association with
	 * VPNPROVIDERNETWK because VPNPROVIDERNETWK is already in use: id=$0
	 */
	public static final Message Base_VPNPROVIDERNETWK_005 = new Message(
			"Base/VPNPROVIDERNETWK/005",
			"Unable to create association with VPNPROVIDERNETWK "
					+ "because VPNPROVIDERNETWK is " + "already in use: id=$0");

	/**
	 * Base/VPNPROVIDERNETWK/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_VPNPROVIDERNETWK_006 = new Message(
			"Base/VPNPROVIDERNETWK/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VPNPROVIDERNETWK/009: Unable to create association because
	 * VPNPROVIDERNETWK is already associated to the child object: id=$0
	 */
	public static final Message Base_VPNPROVIDERNETWK_009 = new Message(
			"Base/VPNPROVIDERNETWK/009",
			"Unable to create association because VPNPROVIDERNETWK"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VPNPROVIDERNETWK/013: Unable to disassociate VPNPROVIDERNETWK AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_VPNPROVIDERNETWK_013 = new Message(
			"Base/VPNPROVIDERNETWK/013",
			"Unable to disassociate because VPNPROVIDERNETWK "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VPRPROVIDER/000: VprProvider does not exist:
	 * 
	 * 
	 * vprProviderId=$0
	 */
	public static final Message Base_VPRPROVIDER_000 = new Message(
			"Base/VPRPROVIDER/000", "VprProvider does not exist: "
					+ "vprProviderId=$0");

	/**
	 * Base/VPRPROVIDER/001: Unable to create VprProvider because it already
	 * exists:
	 * 
	 * 
	 * vprProviderId=$0
	 */
	public static final Message Base_VPRPROVIDER_001 = new Message(
			"Base/VPRPROVIDER/001",
			"Unable to create VprProvider because it already exists: "
					+ "vprProviderId=$0");

	/**
	 * Base/VPRPROVIDER/003: Unable to delete VprProvider because it is in use:
	 * 
	 * 
	 * vprProviderId=$0
	 */
	public static final Message Base_VPRPROVIDER_003 = new Message(
			"Base/VprProvider/003",
			"Unable to delete VprProvider  because it is in use: "
					+ "vprProviderId=$0");

	/**
	 * Base/VPRPROVIDER/005: Unable to create association with VPRPROVIDER
	 * because VPRPROVIDER is already in use: id=$0
	 */
	public static final Message Base_VPRPROVIDER_005 = new Message(
			"Base/VPRPROVIDER/005",
			"Unable to create association with VPRPROVIDER "
					+ "because VPRPROVIDER is " + "already in use: id=$0");

	/**
	 * Base/VPRPROVIDER/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_VPRPROVIDER_006 = new Message(
			"Base/VPRPROVIDER/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VPRPROVIDER/009: Unable to create association because VPRPROVIDER is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_VPRPROVIDER_009 = new Message(
			"Base/VPRPROVIDER/009",
			"Unable to create association because VPRPROVIDER"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VPRPROVIDER/013: Unable to disassociate VPRPROVIDER AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_VPRPROVIDER_013 = new Message(
			"Base/VPRPROVIDER/013",
			"Unable to disassociate because VPRPROVIDER "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VPSPACKAGESERV/000: VpsPackageServ does not exist:
	 * 
	 * 
	 * vpsPackageCode=$0
	 * 
	 * 
	 * vpsServiceCode=$1
	 */
	public static final Message Base_VPSPACKAGESERV_000 = new Message(
			"Base/VPSPACKAGESERV/000", "VpsPackageServ does not exist: "
					+ "vpsPackageCode=$0" + "vpsServiceCode=$1");

	/**
	 * Base/VPSPACKAGESERV/001: Unable to create VpsPackageServ because it
	 * already exists:
	 * 
	 * 
	 * vpsPackageCode=$0
	 * 
	 * 
	 * vpsServiceCode=$1
	 */
	public static final Message Base_VPSPACKAGESERV_001 = new Message(
			"Base/VPSPACKAGESERV/001",
			"Unable to create VpsPackageServ because it already exists: "
					+ "vpsPackageCode=$0" + "vpsServiceCode=$1");

	/**
	 * Base/VPSPACKAGESERV/003: Unable to delete VpsPackageServ because it is in
	 * use:
	 * 
	 * 
	 * vpsPackageCode=$0
	 * 
	 * 
	 * vpsServiceCode=$1
	 */
	public static final Message Base_VPSPACKAGESERV_003 = new Message(
			"Base/VpsPackageServ/003",
			"Unable to delete VpsPackageServ  because it is in use: "
					+ "vpsPackageCode=$0" + "vpsServiceCode=$1");

	/**
	 * Base/VPSPACKAGESERV/005: Unable to create association with VPSPACKAGESERV
	 * because VPSPACKAGESERV is already in use: id=$0
	 */
	public static final Message Base_VPSPACKAGESERV_005 = new Message(
			"Base/VPSPACKAGESERV/005",
			"Unable to create association with VPSPACKAGESERV "
					+ "because VPSPACKAGESERV is " + "already in use: id=$0");

	/**
	 * Base/VPSPACKAGESERV/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_VPSPACKAGESERV_006 = new Message(
			"Base/VPSPACKAGESERV/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VPSPACKAGESERV/009: Unable to create association because
	 * VPSPACKAGESERV is already associated to the child object: id=$0
	 */
	public static final Message Base_VPSPACKAGESERV_009 = new Message(
			"Base/VPSPACKAGESERV/009",
			"Unable to create association because VPSPACKAGESERV"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VPSPACKAGESERV/013: Unable to disassociate VPSPACKAGESERV AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_VPSPACKAGESERV_013 = new Message(
			"Base/VPSPACKAGESERV/013",
			"Unable to disassociate because VPSPACKAGESERV "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/NGSNETGROUPSERV/000: NgsNetGroupServ does not exist:
	 * 
	 * 
	 * ngsCode=$0
	 * 
	 * 
	 * ngsNetwork=$1
	 * 
	 * 
	 * ngsNetServCode=$2
	 * 
	 * 
	 * ngsSequence=$3
	 */
	public static final Message Base_NGSNETGROUPSERV_000 = new Message(
			"Base/NGSNETGROUPSERV/000", "NgsNetGroupServ does not exist: "
					+ "ngsCode=$0" + "ngsNetwork=$1" + "ngsNetServCode=$2"
					+ "ngsSequence=$3");

	/**
	 * Base/NGSNETGROUPSERV/001: Unable to create NgsNetGroupServ because it
	 * already exists:
	 * 
	 * 
	 * ngsCode=$0
	 * 
	 * 
	 * ngsNetwork=$1
	 * 
	 * 
	 * ngsNetServCode=$2
	 * 
	 * 
	 * ngsSequence=$3
	 */
	public static final Message Base_NGSNETGROUPSERV_001 = new Message(
			"Base/NGSNETGROUPSERV/001",
			"Unable to create NgsNetGroupServ because it already exists: "
					+ "ngsCode=$0" + "ngsNetwork=$1" + "ngsNetServCode=$2"
					+ "ngsSequence=$3");

	/**
	 * Base/NGSNETGROUPSERV/003: Unable to delete NgsNetGroupServ because it is
	 * in use:
	 * 
	 * 
	 * ngsCode=$0
	 * 
	 * 
	 * ngsNetwork=$1
	 * 
	 * 
	 * ngsNetServCode=$2
	 * 
	 * 
	 * ngsSequence=$3
	 */
	public static final Message Base_NGSNETGROUPSERV_003 = new Message(
			"Base/NgsNetGroupServ/003",
			"Unable to delete NgsNetGroupServ  because it is in use: "
					+ "ngsCode=$0" + "ngsNetwork=$1" + "ngsNetServCode=$2"
					+ "ngsSequence=$3");

	/**
	 * Base/NGSNETGROUPSERV/005: Unable to create association with
	 * NGSNETGROUPSERV because NGSNETGROUPSERV is already in use: id=$0
	 */
	public static final Message Base_NGSNETGROUPSERV_005 = new Message(
			"Base/NGSNETGROUPSERV/005",
			"Unable to create association with NGSNETGROUPSERV "
					+ "because NGSNETGROUPSERV is " + "already in use: id=$0");

	/**
	 * Base/NGSNETGROUPSERV/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_NGSNETGROUPSERV_006 = new Message(
			"Base/NGSNETGROUPSERV/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/NGSNETGROUPSERV/009: Unable to create association because
	 * NGSNETGROUPSERV is already associated to the child object: id=$0
	 */
	public static final Message Base_NGSNETGROUPSERV_009 = new Message(
			"Base/NGSNETGROUPSERV/009",
			"Unable to create association because NGSNETGROUPSERV"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/NGSNETGROUPSERV/013: Unable to disassociate NGSNETGROUPSERV AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_NGSNETGROUPSERV_013 = new Message(
			"Base/NGSNETGROUPSERV/013",
			"Unable to disassociate because NGSNETGROUPSERV "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DIPDISCOUNTPLAN/000: DipDiscountPlan does not exist:
	 * 
	 * 
	 * dipDiscountId=$0
	 * 
	 * 
	 * dipSequence=$1
	 */
	public static final Message Base_DIPDISCOUNTPLAN_000 = new Message(
			"Base/DIPDISCOUNTPLAN/000", "DipDiscountPlan does not exist: "
					+ "dipDiscountId=$0" + "dipSequence=$1");

	/**
	 * Base/DIPDISCOUNTPLAN/001: Unable to create DipDiscountPlan because it
	 * already exists:
	 * 
	 * 
	 * dipDiscountId=$0
	 * 
	 * 
	 * dipSequence=$1
	 */
	public static final Message Base_DIPDISCOUNTPLAN_001 = new Message(
			"Base/DIPDISCOUNTPLAN/001",
			"Unable to create DipDiscountPlan because it already exists: "
					+ "dipDiscountId=$0" + "dipSequence=$1");

	/**
	 * Base/DIPDISCOUNTPLAN/003: Unable to delete DipDiscountPlan because it is
	 * in use:
	 * 
	 * 
	 * dipDiscountId=$0
	 * 
	 * 
	 * dipSequence=$1
	 */
	public static final Message Base_DIPDISCOUNTPLAN_003 = new Message(
			"Base/DipDiscountPlan/003",
			"Unable to delete DipDiscountPlan  because it is in use: "
					+ "dipDiscountId=$0" + "dipSequence=$1");

	/**
	 * Base/DIPDISCOUNTPLAN/005: Unable to create association with
	 * DIPDISCOUNTPLAN because DIPDISCOUNTPLAN is already in use: id=$0
	 */
	public static final Message Base_DIPDISCOUNTPLAN_005 = new Message(
			"Base/DIPDISCOUNTPLAN/005",
			"Unable to create association with DIPDISCOUNTPLAN "
					+ "because DIPDISCOUNTPLAN is " + "already in use: id=$0");

	/**
	 * Base/DIPDISCOUNTPLAN/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_DIPDISCOUNTPLAN_006 = new Message(
			"Base/DIPDISCOUNTPLAN/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DIPDISCOUNTPLAN/009: Unable to create association because
	 * DIPDISCOUNTPLAN is already associated to the child object: id=$0
	 */
	public static final Message Base_DIPDISCOUNTPLAN_009 = new Message(
			"Base/DIPDISCOUNTPLAN/009",
			"Unable to create association because DIPDISCOUNTPLAN"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DIPDISCOUNTPLAN/013: Unable to disassociate DIPDISCOUNTPLAN AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_DIPDISCOUNTPLAN_013 = new Message(
			"Base/DIPDISCOUNTPLAN/013",
			"Unable to disassociate because DIPDISCOUNTPLAN "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VSRSERVICE/000: VsrService does not exist:
	 * 
	 * 
	 * vsrServiceCode=$0
	 */
	public static final Message Base_VSRSERVICE_000 = new Message(
			"Base/VSRSERVICE/000", "VsrService does not exist: "
					+ "vsrServiceCode=$0");

	/**
	 * Base/VSRSERVICE/001: Unable to create VsrService because it already
	 * exists:
	 * 
	 * 
	 * vsrServiceCode=$0
	 */
	public static final Message Base_VSRSERVICE_001 = new Message(
			"Base/VSRSERVICE/001",
			"Unable to create VsrService because it already exists: "
					+ "vsrServiceCode=$0");

	/**
	 * Base/VSRSERVICE/003: Unable to delete VsrService because it is in use:
	 * 
	 * 
	 * vsrServiceCode=$0
	 */
	public static final Message Base_VSRSERVICE_003 = new Message(
			"Base/VsrService/003",
			"Unable to delete VsrService  because it is in use: "
					+ "vsrServiceCode=$0");

	/**
	 * Base/VSRSERVICE/005: Unable to create association with VSRSERVICE because
	 * VSRSERVICE is already in use: id=$0
	 */
	public static final Message Base_VSRSERVICE_005 = new Message(
			"Base/VSRSERVICE/005",
			"Unable to create association with VSRSERVICE "
					+ "because VSRSERVICE is " + "already in use: id=$0");

	/**
	 * Base/VSRSERVICE/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_VSRSERVICE_006 = new Message(
			"Base/VSRSERVICE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VSRSERVICE/009: Unable to create association because VSRSERVICE is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_VSRSERVICE_009 = new Message(
			"Base/VSRSERVICE/009",
			"Unable to create association because VSRSERVICE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VSRSERVICE/013: Unable to disassociate VSRSERVICE AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_VSRSERVICE_013 = new Message(
			"Base/VSRSERVICE/013", "Unable to disassociate because VSRSERVICE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DIRDISCOUNTRULE/000: DirDiscountRule does not exist:
	 * 
	 * 
	 * dirRuleId=$0
	 */
	public static final Message Base_DIRDISCOUNTRULE_000 = new Message(
			"Base/DIRDISCOUNTRULE/000", "DirDiscountRule does not exist: "
					+ "dirRuleId=$0");

	/**
	 * Base/DIRDISCOUNTRULE/001: Unable to create DirDiscountRule because it
	 * already exists:
	 * 
	 * 
	 * dirRuleId=$0
	 */
	public static final Message Base_DIRDISCOUNTRULE_001 = new Message(
			"Base/DIRDISCOUNTRULE/001",
			"Unable to create DirDiscountRule because it already exists: "
					+ "dirRuleId=$0");

	/**
	 * Base/DIRDISCOUNTRULE/003: Unable to delete DirDiscountRule because it is
	 * in use:
	 * 
	 * 
	 * dirRuleId=$0
	 */
	public static final Message Base_DIRDISCOUNTRULE_003 = new Message(
			"Base/DirDiscountRule/003",
			"Unable to delete DirDiscountRule  because it is in use: "
					+ "dirRuleId=$0");

	/**
	 * Base/DIRDISCOUNTRULE/005: Unable to create association with
	 * DIRDISCOUNTRULE because DIRDISCOUNTRULE is already in use: id=$0
	 */
	public static final Message Base_DIRDISCOUNTRULE_005 = new Message(
			"Base/DIRDISCOUNTRULE/005",
			"Unable to create association with DIRDISCOUNTRULE "
					+ "because DIRDISCOUNTRULE is " + "already in use: id=$0");

	/**
	 * Base/DIRDISCOUNTRULE/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_DIRDISCOUNTRULE_006 = new Message(
			"Base/DIRDISCOUNTRULE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DIRDISCOUNTRULE/009: Unable to create association because
	 * DIRDISCOUNTRULE is already associated to the child object: id=$0
	 */
	public static final Message Base_DIRDISCOUNTRULE_009 = new Message(
			"Base/DIRDISCOUNTRULE/009",
			"Unable to create association because DIRDISCOUNTRULE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DIRDISCOUNTRULE/013: Unable to disassociate DIRDISCOUNTRULE AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_DIRDISCOUNTRULE_013 = new Message(
			"Base/DIRDISCOUNTRULE/013",
			"Unable to disassociate because DIRDISCOUNTRULE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DISDISCOUNT/000: DisDiscount does not exist:
	 * 
	 * 
	 * disDiscountId=$0
	 */
	public static final Message Base_DISDISCOUNT_000 = new Message(
			"Base/DISDISCOUNT/000", "DisDiscount does not exist: "
					+ "disDiscountId=$0");

	/**
	 * Base/DISDISCOUNT/001: Unable to create DisDiscount because it already
	 * exists:
	 * 
	 * 
	 * disDiscountId=$0
	 */
	public static final Message Base_DISDISCOUNT_001 = new Message(
			"Base/DISDISCOUNT/001",
			"Unable to create DisDiscount because it already exists: "
					+ "disDiscountId=$0");

	/**
	 * Base/DISDISCOUNT/003: Unable to delete DisDiscount because it is in use:
	 * 
	 * 
	 * disDiscountId=$0
	 */
	public static final Message Base_DISDISCOUNT_003 = new Message(
			"Base/DisDiscount/003",
			"Unable to delete DisDiscount  because it is in use: "
					+ "disDiscountId=$0");

	/**
	 * Base/DISDISCOUNT/005: Unable to create association with DISDISCOUNT
	 * because DISDISCOUNT is already in use: id=$0
	 */
	public static final Message Base_DISDISCOUNT_005 = new Message(
			"Base/DISDISCOUNT/005",
			"Unable to create association with DISDISCOUNT "
					+ "because DISDISCOUNT is " + "already in use: id=$0");

	/**
	 * Base/DISDISCOUNT/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_DISDISCOUNT_006 = new Message(
			"Base/DISDISCOUNT/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DISDISCOUNT/009: Unable to create association because DISDISCOUNT is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_DISDISCOUNT_009 = new Message(
			"Base/DISDISCOUNT/009",
			"Unable to create association because DISDISCOUNT"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DISDISCOUNT/013: Unable to disassociate DISDISCOUNT AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_DISDISCOUNT_013 = new Message(
			"Base/DISDISCOUNT/013",
			"Unable to disassociate because DISDISCOUNT "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DOTDOCTYPE/000: DotDocType does not exist:
	 * 
	 * 
	 * dotTypeCode=$0
	 */
	public static final Message Base_DOTDOCTYPE_000 = new Message(
			"Base/DOTDOCTYPE/000", "DotDocType does not exist: "
					+ "dotTypeCode=$0");

	/**
	 * Base/DOTDOCTYPE/001: Unable to create DotDocType because it already
	 * exists:
	 * 
	 * 
	 * dotTypeCode=$0
	 */
	public static final Message Base_DOTDOCTYPE_001 = new Message(
			"Base/DOTDOCTYPE/001",
			"Unable to create DotDocType because it already exists: "
					+ "dotTypeCode=$0");

	/**
	 * Base/DOTDOCTYPE/003: Unable to delete DotDocType because it is in use:
	 * 
	 * 
	 * dotTypeCode=$0
	 */
	public static final Message Base_DOTDOCTYPE_003 = new Message(
			"Base/DotDocType/003",
			"Unable to delete DotDocType  because it is in use: "
					+ "dotTypeCode=$0");

	/**
	 * Base/DOTDOCTYPE/005: Unable to create association with DOTDOCTYPE because
	 * DOTDOCTYPE is already in use: id=$0
	 */
	public static final Message Base_DOTDOCTYPE_005 = new Message(
			"Base/DOTDOCTYPE/005",
			"Unable to create association with DOTDOCTYPE "
					+ "because DOTDOCTYPE is " + "already in use: id=$0");

	/**
	 * Base/DOTDOCTYPE/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_DOTDOCTYPE_006 = new Message(
			"Base/DOTDOCTYPE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DOTDOCTYPE/009: Unable to create association because DOTDOCTYPE is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_DOTDOCTYPE_009 = new Message(
			"Base/DOTDOCTYPE/009",
			"Unable to create association because DOTDOCTYPE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DOTDOCTYPE/013: Unable to disassociate DOTDOCTYPE AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_DOTDOCTYPE_013 = new Message(
			"Base/DOTDOCTYPE/013", "Unable to disassociate because DOTDOCTYPE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/PPTPREPAIDTYPES/000: PptPrepaidTypes does not exist:
	 * 
	 * 
	 * pptType=$0
	 */
	public static final Message Base_PPTPREPAIDTYPES_000 = new Message(
			"Base/PPTPREPAIDTYPES/000", "PptPrepaidTypes does not exist: "
					+ "pptType=$0");

	/**
	 * Base/PPTPREPAIDTYPES/001: Unable to create PptPrepaidTypes because it
	 * already exists:
	 * 
	 * 
	 * pptType=$0
	 */
	public static final Message Base_PPTPREPAIDTYPES_001 = new Message(
			"Base/PPTPREPAIDTYPES/001",
			"Unable to create PptPrepaidTypes because it already exists: "
					+ "pptType=$0");

	/**
	 * Base/PPTPREPAIDTYPES/003: Unable to delete PptPrepaidTypes because it is
	 * in use:
	 * 
	 * 
	 * pptType=$0
	 */
	public static final Message Base_PPTPREPAIDTYPES_003 = new Message(
			"Base/PptPrepaidTypes/003",
			"Unable to delete PptPrepaidTypes  because it is in use: "
					+ "pptType=$0");

	/**
	 * Base/PPTPREPAIDTYPES/005: Unable to create association with
	 * PPTPREPAIDTYPES because PPTPREPAIDTYPES is already in use: id=$0
	 */
	public static final Message Base_PPTPREPAIDTYPES_005 = new Message(
			"Base/PPTPREPAIDTYPES/005",
			"Unable to create association with PPTPREPAIDTYPES "
					+ "because PPTPREPAIDTYPES is " + "already in use: id=$0");

	/**
	 * Base/PPTPREPAIDTYPES/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_PPTPREPAIDTYPES_006 = new Message(
			"Base/PPTPREPAIDTYPES/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/PPTPREPAIDTYPES/009: Unable to create association because
	 * PPTPREPAIDTYPES is already associated to the child object: id=$0
	 */
	public static final Message Base_PPTPREPAIDTYPES_009 = new Message(
			"Base/PPTPREPAIDTYPES/009",
			"Unable to create association because PPTPREPAIDTYPES"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/PPTPREPAIDTYPES/013: Unable to disassociate PPTPREPAIDTYPES AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_PPTPREPAIDTYPES_013 = new Message(
			"Base/PPTPREPAIDTYPES/013",
			"Unable to disassociate because PPTPREPAIDTYPES "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SPDSERVPARAMDEF/000: SpdServParamDef does not exist:
	 * 
	 * 
	 * spdServiceCode=$0
	 * 
	 * 
	 * spdParamId=$1
	 */
	public static final Message Base_SPDSERVPARAMDEF_000 = new Message(
			"Base/SPDSERVPARAMDEF/000", "SpdServParamDef does not exist: "
					+ "spdServiceCode=$0" + "spdParamId=$1");

	/**
	 * Base/SPDSERVPARAMDEF/001: Unable to create SpdServParamDef because it
	 * already exists:
	 * 
	 * 
	 * spdServiceCode=$0
	 * 
	 * 
	 * spdParamId=$1
	 */
	public static final Message Base_SPDSERVPARAMDEF_001 = new Message(
			"Base/SPDSERVPARAMDEF/001",
			"Unable to create SpdServParamDef because it already exists: "
					+ "spdServiceCode=$0" + "spdParamId=$1");

	/**
	 * Base/SPDSERVPARAMDEF/003: Unable to delete SpdServParamDef because it is
	 * in use:
	 * 
	 * 
	 * spdServiceCode=$0
	 * 
	 * 
	 * spdParamId=$1
	 */
	public static final Message Base_SPDSERVPARAMDEF_003 = new Message(
			"Base/SpdServParamDef/003",
			"Unable to delete SpdServParamDef  because it is in use: "
					+ "spdServiceCode=$0" + "spdParamId=$1");

	/**
	 * Base/SPDSERVPARAMDEF/005: Unable to create association with
	 * SPDSERVPARAMDEF because SPDSERVPARAMDEF is already in use: id=$0
	 */
	public static final Message Base_SPDSERVPARAMDEF_005 = new Message(
			"Base/SPDSERVPARAMDEF/005",
			"Unable to create association with SPDSERVPARAMDEF "
					+ "because SPDSERVPARAMDEF is " + "already in use: id=$0");

	/**
	 * Base/SPDSERVPARAMDEF/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_SPDSERVPARAMDEF_006 = new Message(
			"Base/SPDSERVPARAMDEF/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SPDSERVPARAMDEF/009: Unable to create association because
	 * SPDSERVPARAMDEF is already associated to the child object: id=$0
	 */
	public static final Message Base_SPDSERVPARAMDEF_009 = new Message(
			"Base/SPDSERVPARAMDEF/009",
			"Unable to create association because SPDSERVPARAMDEF"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SPDSERVPARAMDEF/013: Unable to disassociate SPDSERVPARAMDEF AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_SPDSERVPARAMDEF_013 = new Message(
			"Base/SPDSERVPARAMDEF/013",
			"Unable to disassociate because SPDSERVPARAMDEF "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SVRSERVRULE/000: SvrServRule does not exist:
	 * 
	 * 
	 * svrPrimaryServ=$0
	 * 
	 * 
	 * svrServType=$1
	 * 
	 * 
	 * svrTargetServ=$2
	 */
	public static final Message Base_SVRSERVRULE_000 = new Message(
			"Base/SVRSERVRULE/000", "SvrServRule does not exist: "
					+ "svrPrimaryServ=$0" + "svrServType=$1"
					+ "svrTargetServ=$2");

	/**
	 * Base/SVRSERVRULE/001: Unable to create SvrServRule because it already
	 * exists:
	 * 
	 * 
	 * svrPrimaryServ=$0
	 * 
	 * 
	 * svrServType=$1
	 * 
	 * 
	 * svrTargetServ=$2
	 */
	public static final Message Base_SVRSERVRULE_001 = new Message(
			"Base/SVRSERVRULE/001",
			"Unable to create SvrServRule because it already exists: "
					+ "svrPrimaryServ=$0" + "svrServType=$1"
					+ "svrTargetServ=$2");

	/**
	 * Base/SVRSERVRULE/003: Unable to delete SvrServRule because it is in use:
	 * 
	 * 
	 * svrPrimaryServ=$0
	 * 
	 * 
	 * svrServType=$1
	 * 
	 * 
	 * svrTargetServ=$2
	 */
	public static final Message Base_SVRSERVRULE_003 = new Message(
			"Base/SvrServRule/003",
			"Unable to delete SvrServRule  because it is in use: "
					+ "svrPrimaryServ=$0" + "svrServType=$1"
					+ "svrTargetServ=$2");

	/**
	 * Base/SVRSERVRULE/005: Unable to create association with SVRSERVRULE
	 * because SVRSERVRULE is already in use: id=$0
	 */
	public static final Message Base_SVRSERVRULE_005 = new Message(
			"Base/SVRSERVRULE/005",
			"Unable to create association with SVRSERVRULE "
					+ "because SVRSERVRULE is " + "already in use: id=$0");

	/**
	 * Base/SVRSERVRULE/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SVRSERVRULE_006 = new Message(
			"Base/SVRSERVRULE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SVRSERVRULE/009: Unable to create association because SVRSERVRULE is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_SVRSERVRULE_009 = new Message(
			"Base/SVRSERVRULE/009",
			"Unable to create association because SVRSERVRULE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SVRSERVRULE/013: Unable to disassociate SVRSERVRULE AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_SVRSERVRULE_013 = new Message(
			"Base/SVRSERVRULE/013",
			"Unable to disassociate because SVRSERVRULE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VSTSERVICETYPES/000: VstServiceTypes does not exist:
	 * 
	 * 
	 * vstServiceType=$0
	 */
	public static final Message Base_VSTSERVICETYPES_000 = new Message(
			"Base/VSTSERVICETYPES/000", "VstServiceTypes does not exist: "
					+ "vstServiceType=$0");

	/**
	 * Base/VSTSERVICETYPES/001: Unable to create VstServiceTypes because it
	 * already exists:
	 * 
	 * 
	 * vstServiceType=$0
	 */
	public static final Message Base_VSTSERVICETYPES_001 = new Message(
			"Base/VSTSERVICETYPES/001",
			"Unable to create VstServiceTypes because it already exists: "
					+ "vstServiceType=$0");

	/**
	 * Base/VSTSERVICETYPES/003: Unable to delete VstServiceTypes because it is
	 * in use:
	 * 
	 * 
	 * vstServiceType=$0
	 */
	public static final Message Base_VSTSERVICETYPES_003 = new Message(
			"Base/VstServiceTypes/003",
			"Unable to delete VstServiceTypes  because it is in use: "
					+ "vstServiceType=$0");

	/**
	 * Base/VSTSERVICETYPES/005: Unable to create association with
	 * VSTSERVICETYPES because VSTSERVICETYPES is already in use: id=$0
	 */
	public static final Message Base_VSTSERVICETYPES_005 = new Message(
			"Base/VSTSERVICETYPES/005",
			"Unable to create association with VSTSERVICETYPES "
					+ "because VSTSERVICETYPES is " + "already in use: id=$0");

	/**
	 * Base/VSTSERVICETYPES/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_VSTSERVICETYPES_006 = new Message(
			"Base/VSTSERVICETYPES/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VSTSERVICETYPES/009: Unable to create association because
	 * VSTSERVICETYPES is already associated to the child object: id=$0
	 */
	public static final Message Base_VSTSERVICETYPES_009 = new Message(
			"Base/VSTSERVICETYPES/009",
			"Unable to create association because VSTSERVICETYPES"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VSTSERVICETYPES/013: Unable to disassociate VSTSERVICETYPES AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_VSTSERVICETYPES_013 = new Message(
			"Base/VSTSERVICETYPES/013",
			"Unable to disassociate because VSTSERVICETYPES "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/BTCBATCHCONTROL/000: BtcBatchControl does not exist:
	 * 
	 * 
	 * btcBatchType=$0
	 * 
	 * 
	 * btcBatchId=$1
	 */
	public static final Message Base_BTCBATCHCONTROL_000 = new Message(
			"Base/BTCBATCHCONTROL/000", "BtcBatchControl does not exist: "
					+ "btcBatchType=$0" + "btcBatchId=$1");

	/**
	 * Base/BTCBATCHCONTROL/001: Unable to create BtcBatchControl because it
	 * already exists:
	 * 
	 * 
	 * btcBatchType=$0
	 * 
	 * 
	 * btcBatchId=$1
	 */
	public static final Message Base_BTCBATCHCONTROL_001 = new Message(
			"Base/BTCBATCHCONTROL/001",
			"Unable to create BtcBatchControl because it already exists: "
					+ "btcBatchType=$0" + "btcBatchId=$1");

	/**
	 * Base/BTCBATCHCONTROL/003: Unable to delete BtcBatchControl because it is
	 * in use:
	 * 
	 * 
	 * btcBatchType=$0
	 * 
	 * 
	 * btcBatchId=$1
	 */
	public static final Message Base_BTCBATCHCONTROL_003 = new Message(
			"Base/BtcBatchControl/003",
			"Unable to delete BtcBatchControl  because it is in use: "
					+ "btcBatchType=$0" + "btcBatchId=$1");

	/**
	 * Base/BTCBATCHCONTROL/005: Unable to create association with
	 * BTCBATCHCONTROL because BTCBATCHCONTROL is already in use: id=$0
	 */
	public static final Message Base_BTCBATCHCONTROL_005 = new Message(
			"Base/BTCBATCHCONTROL/005",
			"Unable to create association with BTCBATCHCONTROL "
					+ "because BTCBATCHCONTROL is " + "already in use: id=$0");

	/**
	 * Base/BTCBATCHCONTROL/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_BTCBATCHCONTROL_006 = new Message(
			"Base/BTCBATCHCONTROL/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/BTCBATCHCONTROL/009: Unable to create association because
	 * BTCBATCHCONTROL is already associated to the child object: id=$0
	 */
	public static final Message Base_BTCBATCHCONTROL_009 = new Message(
			"Base/BTCBATCHCONTROL/009",
			"Unable to create association because BTCBATCHCONTROL"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/BTCBATCHCONTROL/013: Unable to disassociate BTCBATCHCONTROL AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_BTCBATCHCONTROL_013 = new Message(
			"Base/BTCBATCHCONTROL/013",
			"Unable to disassociate because BTCBATCHCONTROL "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SMNSIMNOS/000: SmnSimNos does not exist:
	 * 
	 * 
	 * smnSimNo=$0
	 */
	public static final Message Base_SMNSIMNOS_000 = new Message(
			"Base/SMNSIMNOS/000", "SmnSimNos does not exist: " + "smnSimNo=$0");

	/**
	 * Base/SMNSIMNOS/001: Unable to create SmnSimNos because it already exists:
	 * 
	 * 
	 * smnSimNo=$0
	 */
	public static final Message Base_SMNSIMNOS_001 = new Message(
			"Base/SMNSIMNOS/001",
			"Unable to create SmnSimNos because it already exists: "
					+ "smnSimNo=$0");

	/**
	 * Base/SMNSIMNOS/003: Unable to delete SmnSimNos because it is in use:
	 * 
	 * 
	 * smnSimNo=$0
	 */
	public static final Message Base_SMNSIMNOS_003 = new Message(
			"Base/SmnSimNos/003",
			"Unable to delete SmnSimNos  because it is in use: "
					+ "smnSimNo=$0");

	/**
	 * Base/SMNSIMNOS/005: Unable to create association with SMNSIMNOS because
	 * SMNSIMNOS is already in use: id=$0
	 */
	public static final Message Base_SMNSIMNOS_005 = new Message(
			"Base/SMNSIMNOS/005",
			"Unable to create association with SMNSIMNOS "
					+ "because SMNSIMNOS is " + "already in use: id=$0");

	/**
	 * Base/SMNSIMNOS/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SMNSIMNOS_006 = new Message(
			"Base/SMNSIMNOS/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SMNSIMNOS/009: Unable to create association because SMNSIMNOS is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_SMNSIMNOS_009 = new Message(
			"Base/SMNSIMNOS/009",
			"Unable to create association because SMNSIMNOS"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SMNSIMNOS/013: Unable to disassociate SMNSIMNOS AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_SMNSIMNOS_013 = new Message(
			"Base/SMNSIMNOS/013", "Unable to disassociate because SMNSIMNOS "
					+ " AAA because this will orphan B: id=$0");

	
public static final Message Base_EAAEPXACTIONALLW_000 = new Message(
		"Base/EAAEPXACTIONALLW/000", "EAAEPXACTIONALLW does not exist: "
				+ "=$0");

/**
 * Base/EAAEPXACTIONALLW/001: Unable to create EAAEPXACTIONALLW because it already
 * exists:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_EAAEPXACTIONALLW_001 = new Message(
		"Base/EAAEPXACTIONALLW/001",
		"Unable to create EAAEPXACTIONALLW because it already exists: "
				+ "=$0");

/**
 * Base/EAAEPXACTIONALLW/003: Unable to delete EAAEPXACTIONALLW because it is in use:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_EAAEPXACTIONALLW_003 = new Message(
		"Base/EAAEPXACTIONALLW/003",
		"Unable to delete EAAEPXACTIONALLW  because it is in use: "
				+ "=$0");

/**
 * Base/EAAEPXACTIONALLW/005: Unable to create association with EAAEPXACTIONALLW
 * because EAAEPXACTIONALLW is already in use: id=$0
 */
public static final Message Base_EAAEPXACTIONALLW_005 = new Message(
		"Base/EAAEPXACTIONALLW/005",
		"Unable to create association with EAAEPXACTIONALLW "
				+ "because EAAEPXACTIONALLW is " + "already in use: id=$0");

/**
 * Base/EAAEPXACTIONALLW/006: Unable to delete AAA because this will orphan B:
 * id=$0
 */
public static final Message Base_EAAEPXACTIONALLW_006 = new Message(
		"Base/EAAEPXACTIONALLW/006",
		"Unable to delete AAA because this will orphan B: id=$0");

/**
 * Base/EAAEPXACTIONALLW/009: Unable to create association because EAAEPXACTIONALLW is
 * already associated to the child object: id=$0
 */
public static final Message Base_EAAEPXACTIONALLW_009 = new Message(
		"Base/EAAEPXACTIONALLW/009",
		"Unable to create association because EAAEPXACTIONALLW"
				+ " is already associated to the child object: id=$0");

/**
 * Base/EAAEPXACTIONALLW/013: Unable to disassociate EAAEPXACTIONALLW AAA because this
 * will orphan B: id=$0" );
 */
public static final Message Base_EAAEPXACTIONALLW_013 = new Message(
		"Base/EAAEPXACTIONALLW/013",
		"Unable to disassociate because EAAEPXACTIONALLW "
				+ " AAA because this will orphan B: id=$0");



public static final Message Base_UDAUSERDEFACT_000 = new Message(
		"Base/UDAUSERDEFACT/000", "UDAUSERDEFACT does not exist: "
				+ "=$0");

/**
 * Base/UDAUSERDEFACT/001: Unable to create UDAUSERDEFACT because it already
 * exists:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_UDAUSERDEFACT_001 = new Message(
		"Base/UDAUSERDEFACT/001",
		"Unable to create UDAUSERDEFACT because it already exists: "
				+ "=$0");

/**
 * Base/UDAUSERDEFACT/003: Unable to delete UDAUSERDEFACT because it is in use:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_UDAUSERDEFACT_003 = new Message(
		"Base/UDAUSERDEFACT/003",
		"Unable to delete UDAUSERDEFACT  because it is in use: "
				+ "=$0");

/**
 * Base/UDAUSERDEFACT/005: Unable to create association with UDAUSERDEFACT
 * because UDAUSERDEFACT is already in use: id=$0
 */
public static final Message Base_UDAUSERDEFACT_005 = new Message(
		"Base/UDAUSERDEFACT/005",
		"Unable to create association with UDAUSERDEFACT "
				+ "because UDAUSERDEFACT is " + "already in use: id=$0");

/**
 * Base/UDAUSERDEFACT/006: Unable to delete AAA because this will orphan B:
 * id=$0
 */
public static final Message Base_UDAUSERDEFACT_006 = new Message(
		"Base/UDAUSERDEFACT/006",
		"Unable to delete AAA because this will orphan B: id=$0");

/**
 * Base/UDAUSERDEFACT/009: Unable to create association because UDAUSERDEFACT is
 * already associated to the child object: id=$0
 */
public static final Message Base_UDAUSERDEFACT_009 = new Message(
		"Base/UDAUSERDEFACT/009",
		"Unable to create association because UDAUSERDEFACT"
				+ " is already associated to the child object: id=$0");

/**
 * Base/UDAUSERDEFACT/013: Unable to disassociate UDAUSERDEFACT AAA because this
 * will orphan B: id=$0" );
 */
public static final Message Base_UDAUSERDEFACT_013 = new Message(
		"Base/UDAUSERDEFACT/013",
		"Unable to disassociate because UDAUSERDEFACT "
				+ " AAA because this will orphan B: id=$0");


public static final Message Base_SDRSERVDEPORULE_000 = new Message(
		"Base/SDRSERVDEPORULE/000", "SDRSERVDEPORULE does not exist: "
				+ "=$0");

/**
 * Base/SDRSERVDEPORULE/001: Unable to create SDRSERVDEPORULE because it already
 * exists:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_SDRSERVDEPORULE_001 = new Message(
		"Base/SDRSERVDEPORULE/001",
		"Unable to create SDRSERVDEPORULE because it already exists: "
				+ "=$0");

/**
 * Base/SDRSERVDEPORULE/003: Unable to delete SDRSERVDEPORULE because it is in use:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_SDRSERVDEPORULE_003 = new Message(
		"Base/SDRSERVDEPORULE/003",
		"Unable to delete SDRSERVDEPORULE  because it is in use: "
				+ "=$0");

/**
 * Base/SDRSERVDEPORULE/005: Unable to create association with SDRSERVDEPORULE
 * because SDRSERVDEPORULE is already in use: id=$0
 */
public static final Message Base_SDRSERVDEPORULE_005 = new Message(
		"Base/SDRSERVDEPORULE/005",
		"Unable to create association with SDRSERVDEPORULE "
				+ "because SDRSERVDEPORULE is " + "already in use: id=$0");

/**
 * Base/SDRSERVDEPORULE/006: Unable to delete AAA because this will orphan B:
 * id=$0
 */
public static final Message Base_SDRSERVDEPORULE_006 = new Message(
		"Base/SDRSERVDEPORULE/006",
		"Unable to delete AAA because this will orphan B: id=$0");

/**
 * Base/SDRSERVDEPORULE/009: Unable to create association because SDRSERVDEPORULE is
 * already associated to the child object: id=$0
 */
public static final Message Base_SDRSERVDEPORULE_009 = new Message(
		"Base/SDRSERVDEPORULE/009",
		"Unable to create association because SDRSERVDEPORULE"
				+ " is already associated to the child object: id=$0");

/**
 * Base/SDRSERVDEPORULE/013: Unable to disassociate SDRSERVDEPORULE AAA because this
 * will orphan B: id=$0" );
 */
public static final Message Base_SDRSERVDEPORULE_013 = new Message(
		"Base/SDRSERVDEPORULE/013",
		"Unable to disassociate because SDRSERVDEPORULE "
				+ " AAA because this will orphan B: id=$0");

public static final Message Base_PGSPROGRAMSTATUS_000 = new Message(
		"Base/PGSPROGRAMSTATUS/000", "PGSPROGRAMSTATUS does not exist: "
				+ "=$0");

/**
 * Base/PGSPROGRAMSTATUS/001: Unable to create PGSPROGRAMSTATUS because it already
 * exists:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_PGSPROGRAMSTATUS_001 = new Message(
		"Base/PGSPROGRAMSTATUS/001",
		"Unable to create PGSPROGRAMSTATUS because it already exists: "
				+ "=$0");

/**
 * Base/PGSPROGRAMSTATUS/003: Unable to delete PGSPROGRAMSTATUS because it is in use:
 * 
 * 
 * cnyCurrencyRef=$0
 */
public static final Message Base_PGSPROGRAMSTATUS_003 = new Message(
		"Base/PGSPROGRAMSTATUS/003",
		"Unable to delete PGSPROGRAMSTATUS  because it is in use: "
				+ "=$0");

/**
 * Base/PGSPROGRAMSTATUS/005: Unable to create association with PGSPROGRAMSTATUS
 * because PGSPROGRAMSTATUS is already in use: id=$0
 */
public static final Message Base_PGSPROGRAMSTATUS_005 = new Message(
		"Base/PGSPROGRAMSTATUS/005",
		"Unable to create association with PGSPROGRAMSTATUS "
				+ "because PGSPROGRAMSTATUS is " + "already in use: id=$0");

/**
 * Base/PGSPROGRAMSTATUS/006: Unable to delete AAA because this will orphan B:
 * id=$0
 */
public static final Message Base_PGSPROGRAMSTATUS_006 = new Message(
		"Base/PGSPROGRAMSTATUS/006",
		"Unable to delete AAA because this will orphan B: id=$0");

/**
 * Base/PGSPROGRAMSTATUS/009: Unable to create association because PGSPROGRAMSTATUS is
 * already associated to the child object: id=$0
 */
public static final Message Base_PGSPROGRAMSTATUS_009 = new Message(
		"Base/PGSPROGRAMSTATUS/009",
		"Unable to create association because PGSPROGRAMSTATUS"
				+ " is already associated to the child object: id=$0");

/**
 * Base/PGSPROGRAMSTATUS/013: Unable to disassociate PGSPROGRAMSTATUS AAA because this
 * will orphan B: id=$0" );
 */
public static final Message Base_PGSPROGRAMSTATUS_013 = new Message(
		"Base/PGSPROGRAMSTATUS/013",
		"Unable to disassociate because PGSPROGRAMSTATUS "
				+ " AAA because this will orphan B: id=$0");

/**
 * Base/BILLCCCCCYYYYMMDD/000: BillCccccyyyymmdd
 * does not exist:


 billId=$0


 */
 public static final Message Base_BILLCCCCCYYYYMMDD_000 = new Message( "Base/BILLCCCCCYYYYMMDD/000",
     "BillCccccyyyymmdd does not exist: " + "billId=$0" );

 /**
 * Base/BILLCCCCCYYYYMMDD/001:
 * Unable to create BillCccccyyyymmdd because it already exists:


 billId=$0


 */
 public static final Message Base_BILLCCCCCYYYYMMDD_001 = new Message( "Base/BILLCCCCCYYYYMMDD/001",
     "Unable to create BillCccccyyyymmdd because it already exists: "
     + "billId=$0" );

 /**
 * Base/BILLCCCCCYYYYMMDD/003:
 * Unable to delete BillCccccyyyymmdd  because it is in use:


 billId=$0


 */
 public static final Message Base_BILLCCCCCYYYYMMDD_003 = new Message( "Base/BillCccccyyyymmdd/003",
     "Unable to delete BillCccccyyyymmdd  because it is in use: "
     + "billId=$0" );

 /**
       * Base/BILLCCCCCYYYYMMDD/005:
       * Unable to create association with BILLCCCCCYYYYMMDD because
       * BILLCCCCCYYYYMMDD is already in use: id=$0
       */
 public static final Message Base_BILLCCCCCYYYYMMDD_005 = new Message( "Base/BILLCCCCCYYYYMMDD/005",
     "Unable to create association with BILLCCCCCYYYYMMDD "
     + "because BILLCCCCCYYYYMMDD is " + "already in use: id=$0" );

 /**
       * Base/BILLCCCCCYYYYMMDD/006:
       * Unable to delete AAA because this will orphan B: id=$0
       */
 public static final Message Base_BILLCCCCCYYYYMMDD_006 = new Message( "Base/BILLCCCCCYYYYMMDD/006",
     "Unable to delete AAA because this will orphan B: id=$0" );

 /**
               * Base/BILLCCCCCYYYYMMDD/009:
               * Unable to create association because BILLCCCCCYYYYMMDD
               * is already associated to the child object: id=$0
               */
 public static final Message Base_BILLCCCCCYYYYMMDD_009 = new Message( "Base/BILLCCCCCYYYYMMDD/009",
     "Unable to create association because BILLCCCCCYYYYMMDD"
     + " is already associated to the child object: id=$0" );

 /**
               * Base/BILLCCCCCYYYYMMDD/013:
               * Unable to disassociate BILLCCCCCYYYYMMDD
               * AAA because this will orphan B: id=$0" );
               */
 public static final Message Base_BILLCCCCCYYYYMMDD_013 = new Message( "Base/BILLCCCCCYYYYMMDD/013",
     "Unable to disassociate because BILLCCCCCYYYYMMDD "
     + " AAA because this will orphan B: id=$0" );

 /**
  * Base/CrbCustRiskBal/000: CrbCustRiskBal
  * does not exist:


  billId=$0


  */
  public static final Message Base_CRBCUSTRISKBAL_000 = new Message( "Base/CrbCustRiskBal/000",
      "CrbCustRiskBal does not exist: " + "CrbBillAcNo=$0" );

  /**
  * Base/CrbCustRiskBal/001:
  * Unable to create CrbCustRiskBal because it already exists:


  billId=$0


  */
  public static final Message Base_CRBCUSTRISKBAL_001 = new Message( "Base/CrbCustRiskBal/001",
      "Unable to create CrbCustRiskBal because it already exists: "
      + "CrbBillAcNo=$0" );

  /**
  * Base/CrbCustRiskBal/003:
  * Unable to delete CrbCustRiskBal  because it is in use:


  billId=$0


  */
  public static final Message Base_CRBCUSTRISKBAL_003 = new Message( "Base/CrbCustRiskBal/003",
      "Unable to delete CrbCustRiskBal  because it is in use: "
      + "CrbBillAcNo=$0" );

  /**
        * Base/CrbCustRiskBal/005:
        * Unable to create association with CrbCustRiskBal because
        * CrbCustRiskBal is already in use: id=$0
        */
  public static final Message Base_CRBCUSTRISKBAL_005 = new Message( "Base/CrbCustRiskBal/005",
      "Unable to create association with CrbCustRiskBal "
      + "because CrbCustRiskBal is " + "already in use: CrbBillAcNo=$0" );

  /**
        * Base/CrbCustRiskBal/006:
        * Unable to delete AAA because this will orphan B: CrbBillAcNo=$0
        */
  public static final Message Base_CRBCUSTRISKBAL_006 = new Message( "Base/CrbCustRiskBal/006",
      "Unable to delete AAA because this will orphan B: CrbBillAcNo=$0" );

  /**
                * Base/CrbCustRiskBal/009:
                * Unable to create association because CrbCustRiskBal
                * is already associated to the child object: CrbBillAcNo=$0
                */
  public static final Message Base_CRBCUSTRISKBAL_009 = new Message( "Base/CrbCustRiskBal/009",
      "Unable to create association because CrbCustRiskBal"
      + " is already associated to the child object: CrbBillAcNo=$0" );

  /**
                * Base/CrbCustRiskBal/013:
                * Unable to disassociate CrbCustRiskBal
                * AAA because this will orphan B: CrbBillAcNo=$0" );
                */
  public static final Message Base_CRBCUSTRISKBAL_013 = new Message( "Base/CrbCustRiskBal/013",
      "Unable to disassociate because CrbCustRiskBal "
      + " AAA because this will orphan B: CrbBillAcNo=$0" );

  public static final Message Base_CRBCUSTRISKBAL_014 = new Message( "Base/CrbCustRiskBal/013",
	      "Unable to get unbilled charges for CrbBillAcNo=$0" );  
  
  /**
   * Base/BLHBILLLIMITHD/000: BLHBILLLIMITHD
   * does not exist:


   billId=$0


   */
   public static final Message Base_BLHBILLLIMITHD_000 = new Message( "Base/BLHBILLLIMITHD/000",
       "BLHBILLLIMITHD does not exist: " + "BlhSubscriberId=$0" );

   /**
   * Base/BLHBILLLIMITHD/001:
   * Unable to create BLHBILLLIMITHD because it already exists:


   billId=$0


   */
   public static final Message Base_BLHBILLLIMITHD_001 = new Message( "Base/BLHBILLLIMITHD/001",
       "Unable to create BLHBILLLIMITHD because it already exists: "
       + "getBlhSubscriberId=$0" );

   /**
   * Base/BLHBILLLIMITHD/003:
   * Unable to delete BLHBILLLIMITHD  because it is in use:


   billId=$0


   */
   public static final Message Base_BLHBILLLIMITHD_003 = new Message( "Base/BLHBILLLIMITHD/003",
       "Unable to delete BLHBILLLIMITHD  because it is in use: "
       + "getBlhSubscriberId=$0" );

   /**
         * Base/BLHBILLLIMITHD/005:
         * Unable to create association with BLHBILLLIMITHD because
         * BLHBILLLIMITHD is already in use: id=$0
         */
   public static final Message Base_BLHBILLLIMITHD_005 = new Message( "Base/BLHBILLLIMITHD/005",
       "Unable to create association with BLHBILLLIMITHD "
       + "because BLHBILLLIMITHD is " + "already in use: getBlhSubscriberId=$0" );

   /**
         * Base/BLHBILLLIMITHD/006:
         * Unable to delete AAA because this will orphan B: CrbBillAcNo=$0
         */
   public static final Message Base_BLHBILLLIMITHD_006 = new Message( "Base/BLHBILLLIMITHD/006",
       "Unable to delete AAA because this will orphan B: CrbBillAcNo=$0" );

   /**
                 * Base/BLHBILLLIMITHD/009:
                 * Unable to create association because BLHBILLLIMITHD
                 * is already associated to the child object: CrbBillAcNo=$0
                 */
   public static final Message Base_BLHBILLLIMITHD_009 = new Message( "Base/BLHBILLLIMITHD/009",
       "Unable to create association because BLHBILLLIMITHD"
       + " is already associated to the child object: getBlhSubscriberId=$0" );

   /**
                 * Base/BLHBILLLIMITHD/013:
                 * Unable to disassociate BLHBILLLIMITHD
                 * AAA because this will orphan B: CrbBillAcNo=$0" );
                 */
   public static final Message Base_BLHBILLLIMITHD_013 = new Message( "Base/BLHBILLLIMITHD/013",
       "Unable to disassociate because BLHBILLLIMITHD "
       + " AAA because this will orphan B: getBlhSubscriberId=$0" );

 }