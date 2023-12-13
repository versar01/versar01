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

import com.eppixcomm.eppix.base.error.Message;

/**
 * DOCUMENT ME!
 * 
 * @version $Revision: 1.3 $
 * @author
 */
public interface BaseMessagesAbstract {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/**
	 * Base/AUXCUSTOMERS/000: AuxCustomers does not exist:
	 * 
	 * 
	 * billAcNo=$0
	 */
	public static final Message Base_AUXCUSTOMERS_000 = new Message(
			"Base/AUXCUSTOMERS/000", "AuxCustomers does not exist: "
					+ "billAcNo=$0");

	/**
	 * Base/AUXCUSTOMERS/001: Unable to create AuxCustomers because it already
	 * exists:
	 * 
	 * 
	 * billAcNo=$0
	 */
	public static final Message Base_AUXCUSTOMERS_001 = new Message(
			"Base/AUXCUSTOMERS/001",
			"Unable to create AuxCustomers because it already exists: "
					+ "billAcNo=$0");

	/**
	 * Base/AUXCUSTOMERS/003: Unable to delete AuxCustomers because it is in
	 * use:
	 * 
	 * 
	 * billAcNo=$0
	 */
	public static final Message Base_AUXCUSTOMERS_003 = new Message(
			"Base/AuxCustomers/003",
			"Unable to delete AuxCustomers  because it is in use: "
					+ "billAcNo=$0");

	/**
	 * Base/AUXCUSTOMERS/005: Unable to create association with AUXCUSTOMERS
	 * because AUXCUSTOMERS is already in use: id=$0
	 */
	public static final Message Base_AUXCUSTOMERS_005 = new Message(
			"Base/AUXCUSTOMERS/005",
			"Unable to create association with AUXCUSTOMERS "
					+ "because AUXCUSTOMERS is " + "already in use: id=$0");

	/**
	 * Base/AUXCUSTOMERS/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_AUXCUSTOMERS_006 = new Message(
			"Base/AUXCUSTOMERS/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/AUXCUSTOMERS/009: Unable to create association because AUXCUSTOMERS
	 * is already associated to the child object: id=$0
	 */
	public static final Message Base_AUXCUSTOMERS_009 = new Message(
			"Base/AUXCUSTOMERS/009",
			"Unable to create association because AUXCUSTOMERS"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/AUXCUSTOMERS/013: Unable to disassociate AUXCUSTOMERS AAA because
	 * this will orphan B: id=$0" );
	 */
	public static final Message Base_AUXCUSTOMERS_013 = new Message(
			"Base/AUXCUSTOMERS/013",
			"Unable to disassociate because AUXCUSTOMERS "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/TTTYPETEXT/000: TtTypeText does not exist:
	 * 
	 * 
	 * ttGroup=$0
	 * 
	 * 
	 * ttLang=$1
	 * 
	 * 
	 * ttType=$2
	 */
	public static final Message Base_TTTYPETEXT_000 = new Message(
			"Base/TTTYPETEXT/000", "TtTypeText does not exist: " + "ttGroup=$0"
					+ "ttLang=$1" + "ttType=$2");

	/**
	 * Base/TTTYPETEXT/001: Unable to create TtTypeText because it already
	 * exists:
	 * 
	 * 
	 * ttGroup=$0
	 * 
	 * 
	 * ttLang=$1
	 * 
	 * 
	 * ttType=$2
	 */
	public static final Message Base_TTTYPETEXT_001 = new Message(
			"Base/TTTYPETEXT/001",
			"Unable to create TtTypeText because it already exists: "
					+ "ttGroup=$0" + "ttLang=$1" + "ttType=$2");

	/**
	 * Base/TTTYPETEXT/003: Unable to delete TtTypeText because it is in use:
	 * 
	 * 
	 * ttGroup=$0
	 * 
	 * 
	 * ttLang=$1
	 * 
	 * 
	 * ttType=$2
	 */
	public static final Message Base_TTTYPETEXT_003 = new Message(
			"Base/TtTypeText/003",
			"Unable to delete TtTypeText  because it is in use: "
					+ "ttGroup=$0" + "ttLang=$1" + "ttType=$2");

	/**
	 * Base/TTTYPETEXT/005: Unable to create association with TTTYPETEXT because
	 * TTTYPETEXT is already in use: id=$0
	 */
	public static final Message Base_TTTYPETEXT_005 = new Message(
			"Base/TTTYPETEXT/005",
			"Unable to create association with TTTYPETEXT "
					+ "because TTTYPETEXT is " + "already in use: id=$0");

	/**
	 * Base/TTTYPETEXT/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_TTTYPETEXT_006 = new Message(
			"Base/TTTYPETEXT/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/TTTYPETEXT/009: Unable to create association because TTTYPETEXT is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_TTTYPETEXT_009 = new Message(
			"Base/TTTYPETEXT/009",
			"Unable to create association because TTTYPETEXT"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/TTTYPETEXT/013: Unable to disassociate TTTYPETEXT AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_TTTYPETEXT_013 = new Message(
			"Base/TTTYPETEXT/013", "Unable to disassociate because TTTYPETEXT "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/NMNETMAT/000: NmNetmat does not exist:
	 * 
	 * 
	 * nmInternalTariff=$0
	 */
	public static final Message Base_NMNETMAT_000 = new Message(
			"Base/NMNETMAT/000", "NmNetmat does not exist: "
					+ "nmInternalTariff=$0");

	/**
	 * Base/NMNETMAT/001: Unable to create NmNetmat because it already exists:
	 * 
	 * 
	 * nmInternalTariff=$0
	 */
	public static final Message Base_NMNETMAT_001 = new Message(
			"Base/NMNETMAT/001",
			"Unable to create NmNetmat because it already exists: "
					+ "nmInternalTariff=$0");

	/**
	 * Base/NMNETMAT/003: Unable to delete NmNetmat because it is in use:
	 * 
	 * 
	 * nmInternalTariff=$0
	 */
	public static final Message Base_NMNETMAT_003 = new Message(
			"Base/NmNetmat/003",
			"Unable to delete NmNetmat  because it is in use: "
					+ "nmInternalTariff=$0");

	/**
	 * Base/NMNETMAT/005: Unable to create association with NMNETMAT because
	 * NMNETMAT is already in use: id=$0
	 */
	public static final Message Base_NMNETMAT_005 = new Message(
			"Base/NMNETMAT/005", "Unable to create association with NMNETMAT "
					+ "because NMNETMAT is " + "already in use: id=$0");

	/**
	 * Base/NMNETMAT/006: Unable to delete AAA because this will orphan B: id=$0
	 */
	public static final Message Base_NMNETMAT_006 = new Message(
			"Base/NMNETMAT/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/NMNETMAT/009: Unable to create association because NMNETMAT is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_NMNETMAT_009 = new Message(
			"Base/NMNETMAT/009",
			"Unable to create association because NMNETMAT"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/NMNETMAT/013: Unable to disassociate NMNETMAT AAA because this will
	 * orphan B: id=$0" );
	 */
	public static final Message Base_NMNETMAT_013 = new Message(
			"Base/NMNETMAT/013", "Unable to disassociate because NMNETMAT "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VAMACTIVEMSISDN/000: VamActiveMsisdn does not exist:
	 * 
	 * 
	 * vamMsisdnNo=$0
	 */
	public static final Message Base_VAMACTIVEMSISDN_000 = new Message(
			"Base/VAMACTIVEMSISDN/000", "VamActiveMsisdn does not exist: "
					+ "vamMsisdnNo=$0");

	/**
	 * Base/VAMACTIVEMSISDN/001: Unable to create VamActiveMsisdn because it
	 * already exists:
	 * 
	 * 
	 * vamMsisdnNo=$0
	 */
	public static final Message Base_VAMACTIVEMSISDN_001 = new Message(
			"Base/VAMACTIVEMSISDN/001",
			"Unable to create VamActiveMsisdn because it already exists: "
					+ "vamMsisdnNo=$0");

	/**
	 * Base/VAMACTIVEMSISDN/003: Unable to delete VamActiveMsisdn because it is
	 * in use:
	 * 
	 * 
	 * vamMsisdnNo=$0
	 */
	public static final Message Base_VAMACTIVEMSISDN_003 = new Message(
			"Base/VamActiveMsisdn/003",
			"Unable to delete VamActiveMsisdn  because it is in use: "
					+ "vamMsisdnNo=$0");

	/**
	 * Base/VAMACTIVEMSISDN/005: Unable to create association with
	 * VAMACTIVEMSISDN because VAMACTIVEMSISDN is already in use: id=$0
	 */
	public static final Message Base_VAMACTIVEMSISDN_005 = new Message(
			"Base/VAMACTIVEMSISDN/005",
			"Unable to create association with VAMACTIVEMSISDN "
					+ "because VAMACTIVEMSISDN is " + "already in use: id=$0");

	/**
	 * Base/VAMACTIVEMSISDN/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_VAMACTIVEMSISDN_006 = new Message(
			"Base/VAMACTIVEMSISDN/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VAMACTIVEMSISDN/009: Unable to create association because
	 * VAMACTIVEMSISDN is already associated to the child object: id=$0
	 */
	public static final Message Base_VAMACTIVEMSISDN_009 = new Message(
			"Base/VAMACTIVEMSISDN/009",
			"Unable to create association because VAMACTIVEMSISDN"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VAMACTIVEMSISDN/013: Unable to disassociate VAMACTIVEMSISDN AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_VAMACTIVEMSISDN_013 = new Message(
			"Base/VAMACTIVEMSISDN/013",
			"Unable to disassociate because VAMACTIVEMSISDN "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SLCUSTM/000: Slcustm does not exist:
	 * 
	 * 
	 * customer=$0
	 */
	public static final Message Base_SLCUSTM_000 = new Message(
			"Base/SLCUSTM/000", "Slcustm does not exist: " + "customer=$0");

	/**
	 * Base/SLCUSTM/001: Unable to create Slcustm because it already exists:
	 * 
	 * 
	 * customer=$0
	 */
	public static final Message Base_SLCUSTM_001 = new Message(
			"Base/SLCUSTM/001",
			"Unable to create Slcustm because it already exists: "
					+ "customer=$0");

	/**
	 * Base/SLCUSTM/003: Unable to delete Slcustm because it is in use:
	 * 
	 * 
	 * customer=$0
	 */
	public static final Message Base_SLCUSTM_003 = new Message(
			"Base/Slcustm/003",
			"Unable to delete Slcustm  because it is in use: " + "customer=$0");

	/**
	 * Base/SLCUSTM/005: Unable to create association with SLCUSTM because
	 * SLCUSTM is already in use: id=$0
	 */
	public static final Message Base_SLCUSTM_005 = new Message(
			"Base/SLCUSTM/005", "Unable to create association with SLCUSTM "
					+ "because SLCUSTM is " + "already in use: id=$0");

	/**
	 * Base/SLCUSTM/006: Unable to delete AAA because this will orphan B: id=$0
	 */
	public static final Message Base_SLCUSTM_006 = new Message(
			"Base/SLCUSTM/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SLCUSTM/009: Unable to create association because SLCUSTM is already
	 * associated to the child object: id=$0
	 */
	public static final Message Base_SLCUSTM_009 = new Message(
			"Base/SLCUSTM/009", "Unable to create association because SLCUSTM"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SLCUSTM/013: Unable to disassociate SLCUSTM AAA because this will
	 * orphan B: id=$0" );
	 */
	public static final Message Base_SLCUSTM_013 = new Message(
			"Base/SLCUSTM/013", "Unable to disassociate because SLCUSTM "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SBDSUBDETS/000: SbdSubDets does not exist:
	 * 
	 * 
	 * sbdSubscriberId=$0
	 */
	public static final Message Base_SBDSUBDETS_000 = new Message(
			"Base/SBDSUBDETS/000", "SbdSubDets does not exist: "
					+ "sbdSubscriberId=$0");

	/**
	 * Base/SBDSUBDETS/001: Unable to create SbdSubDets because it already
	 * exists:
	 * 
	 * 
	 * sbdSubscriberId=$0
	 */
	public static final Message Base_SBDSUBDETS_001 = new Message(
			"Base/SBDSUBDETS/001",
			"Unable to create SbdSubDets because it already exists: "
					+ "sbdSubscriberId=$0");

	/**
	 * Base/SBDSUBDETS/003: Unable to delete SbdSubDets because it is in use:
	 * 
	 * 
	 * sbdSubscriberId=$0
	 */
	public static final Message Base_SBDSUBDETS_003 = new Message(
			"Base/SbdSubDets/003",
			"Unable to delete SbdSubDets  because it is in use: "
					+ "sbdSubscriberId=$0");

	/**
	 * Base/SBDSUBDETS/005: Unable to create association with SBDSUBDETS because
	 * SBDSUBDETS is already in use: id=$0
	 */
	public static final Message Base_SBDSUBDETS_005 = new Message(
			"Base/SBDSUBDETS/005",
			"Unable to create association with SBDSUBDETS "
					+ "because SBDSUBDETS is " + "already in use: id=$0");

	/**
	 * Base/SBDSUBDETS/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SBDSUBDETS_006 = new Message(
			"Base/SBDSUBDETS/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SBDSUBDETS/009: Unable to create association because SBDSUBDETS is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_SBDSUBDETS_009 = new Message(
			"Base/SBDSUBDETS/009",
			"Unable to create association because SBDSUBDETS"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SBDSUBDETS/013: Unable to disassociate SBDSUBDETS AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_SBDSUBDETS_013 = new Message(
			"Base/SBDSUBDETS/013", "Unable to disassociate because SBDSUBDETS "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/CDIDATABASEINT/000: CdiDatabaseInt does not exist:
	 * 
	 * 
	 * cdiSerial=$0
	 */
	public static final Message Base_CDIDATABASEINT_000 = new Message(
			"Base/CDIDATABASEINT/000", "CdiDatabaseInt does not exist: "
					+ "cdiSerial=$0");

	/**
	 * Base/CDIDATABASEINT/001: Unable to create CdiDatabaseInt because it
	 * already exists:
	 * 
	 * 
	 * cdiSerial=$0
	 */
	public static final Message Base_CDIDATABASEINT_001 = new Message(
			"Base/CDIDATABASEINT/001",
			"Unable to create CdiDatabaseInt because it already exists: "
					+ "cdiSerial=$0");

	/**
	 * Base/CDIDATABASEINT/003: Unable to delete CdiDatabaseInt because it is in
	 * use:
	 * 
	 * 
	 * cdiSerial=$0
	 */
	public static final Message Base_CDIDATABASEINT_003 = new Message(
			"Base/CdiDatabaseInt/003",
			"Unable to delete CdiDatabaseInt  because it is in use: "
					+ "cdiSerial=$0");

	/**
	 * Base/CDIDATABASEINT/005: Unable to create association with CDIDATABASEINT
	 * because CDIDATABASEINT is already in use: id=$0
	 */
	public static final Message Base_CDIDATABASEINT_005 = new Message(
			"Base/CDIDATABASEINT/005",
			"Unable to create association with CDIDATABASEINT "
					+ "because CDIDATABASEINT is " + "already in use: id=$0");

	/**
	 * Base/CDIDATABASEINT/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_CDIDATABASEINT_006 = new Message(
			"Base/CDIDATABASEINT/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/CDIDATABASEINT/009: Unable to create association because
	 * CDIDATABASEINT is already associated to the child object: id=$0
	 */
	public static final Message Base_CDIDATABASEINT_009 = new Message(
			"Base/CDIDATABASEINT/009",
			"Unable to create association because CDIDATABASEINT"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/CDIDATABASEINT/013: Unable to disassociate CDIDATABASEINT AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_CDIDATABASEINT_013 = new Message(
			"Base/CDIDATABASEINT/013",
			"Unable to disassociate because CDIDATABASEINT "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DCHDEALERCLMHDR/000: DchDealerClmHdr does not exist:
	 * 
	 * 
	 * dchClaimId=$0
	 */
	public static final Message Base_DCHDEALERCLMHDR_000 = new Message(
			"Base/DCHDEALERCLMHDR/000", "DchDealerClmHdr does not exist: "
					+ "dchClaimId=$0");

	/**
	 * Base/DCHDEALERCLMHDR/001: Unable to create DchDealerClmHdr because it
	 * already exists:
	 * 
	 * 
	 * dchClaimId=$0
	 */
	public static final Message Base_DCHDEALERCLMHDR_001 = new Message(
			"Base/DCHDEALERCLMHDR/001",
			"Unable to create DchDealerClmHdr because it already exists: "
					+ "dchClaimId=$0");

	/**
	 * Base/DCHDEALERCLMHDR/003: Unable to delete DchDealerClmHdr because it is
	 * in use:
	 * 
	 * 
	 * dchClaimId=$0
	 */
	public static final Message Base_DCHDEALERCLMHDR_003 = new Message(
			"Base/DchDealerClmHdr/003",
			"Unable to delete DchDealerClmHdr  because it is in use: "
					+ "dchClaimId=$0");

	/**
	 * Base/DCHDEALERCLMHDR/005: Unable to create association with
	 * DCHDEALERCLMHDR because DCHDEALERCLMHDR is already in use: id=$0
	 */
	public static final Message Base_DCHDEALERCLMHDR_005 = new Message(
			"Base/DCHDEALERCLMHDR/005",
			"Unable to create association with DCHDEALERCLMHDR "
					+ "because DCHDEALERCLMHDR is " + "already in use: id=$0");

	/**
	 * Base/DCHDEALERCLMHDR/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_DCHDEALERCLMHDR_006 = new Message(
			"Base/DCHDEALERCLMHDR/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DCHDEALERCLMHDR/009: Unable to create association because
	 * DCHDEALERCLMHDR is already associated to the child object: id=$0
	 */
	public static final Message Base_DCHDEALERCLMHDR_009 = new Message(
			"Base/DCHDEALERCLMHDR/009",
			"Unable to create association because DCHDEALERCLMHDR"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DCHDEALERCLMHDR/013: Unable to disassociate DCHDEALERCLMHDR AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_DCHDEALERCLMHDR_013 = new Message(
			"Base/DCHDEALERCLMHDR/013",
			"Unable to disassociate because DCHDEALERCLMHDR "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/DLADEALCLAIMARC/000: DlaDealClaimArc does not exist:
	 * 
	 * 
	 * dlaClaimId=$0
	 */
	public static final Message Base_DLADEALCLAIMARC_000 = new Message(
			"Base/DLADEALCLAIMARC/000", "DlaDealClaimArc does not exist: "
					+ "dlaClaimId=$0");

	/**
	 * Base/DLADEALCLAIMARC/001: Unable to create DlaDealClaimArc because it
	 * already exists:
	 * 
	 * 
	 * dlaClaimId=$0
	 */
	public static final Message Base_DLADEALCLAIMARC_001 = new Message(
			"Base/DLADEALCLAIMARC/001",
			"Unable to create DlaDealClaimArc because it already exists: "
					+ "dlaClaimId=$0");

	/**
	 * Base/DLADEALCLAIMARC/003: Unable to delete DlaDealClaimArc because it is
	 * in use:
	 * 
	 * 
	 * dlaClaimId=$0
	 */
	public static final Message Base_DLADEALCLAIMARC_003 = new Message(
			"Base/DlaDealClaimArc/003",
			"Unable to delete DlaDealClaimArc  because it is in use: "
					+ "dlaClaimId=$0");

	/**
	 * Base/DLADEALCLAIMARC/005: Unable to create association with
	 * DLADEALCLAIMARC because DLADEALCLAIMARC is already in use: id=$0
	 */
	public static final Message Base_DLADEALCLAIMARC_005 = new Message(
			"Base/DLADEALCLAIMARC/005",
			"Unable to create association with DLADEALCLAIMARC "
					+ "because DLADEALCLAIMARC is " + "already in use: id=$0");

	/**
	 * Base/DLADEALCLAIMARC/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_DLADEALCLAIMARC_006 = new Message(
			"Base/DLADEALCLAIMARC/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DLADEALCLAIMARC/009: Unable to create association because
	 * DLADEALCLAIMARC is already associated to the child object: id=$0
	 */
	public static final Message Base_DLADEALCLAIMARC_009 = new Message(
			"Base/DLADEALCLAIMARC/009",
			"Unable to create association because DLADEALCLAIMARC"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DLADEALCLAIMARC/013: Unable to disassociate DLADEALCLAIMARC AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_DLADEALCLAIMARC_013 = new Message(
			"Base/DLADEALCLAIMARC/013",
			"Unable to disassociate because DLADEALCLAIMARC "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SKSKEYSETTING/000: SksKeySetting does not exist:
	 * 
	 * 
	 * sksKeyCode=$0
	 */
	public static final Message Base_SKSKEYSETTING_000 = new Message(
			"Base/SKSKEYSETTING/000", "SksKeySetting does not exist: "
					+ "sksKeyCode=$0");

	/**
	 * Base/SKSKEYSETTING/001: Unable to create SksKeySetting because it already
	 * exists:
	 * 
	 * 
	 * sksKeyCode=$0
	 */
	public static final Message Base_SKSKEYSETTING_001 = new Message(
			"Base/SKSKEYSETTING/001",
			"Unable to create SksKeySetting because it already exists: "
					+ "sksKeyCode=$0");

	/**
	 * Base/SKSKEYSETTING/003: Unable to delete SksKeySetting because it is in
	 * use:
	 * 
	 * 
	 * sksKeyCode=$0
	 */
	public static final Message Base_SKSKEYSETTING_003 = new Message(
			"Base/SksKeySetting/003",
			"Unable to delete SksKeySetting  because it is in use: "
					+ "sksKeyCode=$0");

	/**
	 * Base/SKSKEYSETTING/005: Unable to create association with SKSKEYSETTING
	 * because SKSKEYSETTING is already in use: id=$0
	 */
	public static final Message Base_SKSKEYSETTING_005 = new Message(
			"Base/SKSKEYSETTING/005",
			"Unable to create association with SKSKEYSETTING "
					+ "because SKSKEYSETTING is " + "already in use: id=$0");

	/**
	 * Base/SKSKEYSETTING/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SKSKEYSETTING_006 = new Message(
			"Base/SKSKEYSETTING/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SKSKEYSETTING/009: Unable to create association because
	 * SKSKEYSETTING is already associated to the child object: id=$0
	 */
	public static final Message Base_SKSKEYSETTING_009 = new Message(
			"Base/SKSKEYSETTING/009",
			"Unable to create association because SKSKEYSETTING"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SKSKEYSETTING/013: Unable to disassociate SKSKEYSETTING AAA because
	 * this will orphan B: id=$0" );
	 */
	public static final Message Base_SKSKEYSETTING_013 = new Message(
			"Base/SKSKEYSETTING/013",
			"Unable to disassociate because SKSKEYSETTING "
					+ " AAA because this will orphan B: id=$0");

	public static final Message Base_VSMSERVICEMSISDN_000 = new Message(
			"Base/VSMSERVICEMSISDN/000",
			"Could not return a VsmServiceMsisdnDMO");

	public static final Message Base_VSMSERVICEMSISDN_001 = new Message(
			"Base/VSMSERVICEMSISDN/001", "vsmServiceMsisdnDMO does exist");

	public static final Message Base_TSTARIFFSERVICE_000 = new Message(
			"Base/TSTARIFFSERVICE/000",
			"Could not return the TsTariffServiceDMO");

	public static final Message Base_TSTARIFFSERVICE_001 = new Message(
			"Base/TSTARIFFSERVICE/001", "tsTariffServiceDMO does not exist");
	
	public static final Message Base_TSTARIFFSERVICE_002 = new Message(
			"Base/TSTARIFFSERVICE/002",
			"Failed to get TS record for package code: $0 service code: $1 tariff code: $2");

	public static final Message Base_TOLSIMNOS_001 = new Message(
			"Base/TOLSIMNOS/001", "tolSimNosDMO does not exist");

	/**
	 * Base/ASMESSAGE/000: AsMessage does not exist: mcode=$0
	 */
	public static final Message Base_ASMESSAGE_000 = new Message(
			"Base/ASMESSAGE/000", "AsMessage does not exist: " + "mcode=$0");

	/**
	 * Base/ASMESSAGE/001: Unable to create AsMessage because it already exists:
	 * mcode=$0
	 */
	public static final Message Base_ASMESSAGE_001 = new Message(
			"Base/ASMESSAGE/001",
			"Unable to create AsMessage because it already exists: "
					+ "mcode=$0");

	/**
	 * Base/ASMESSAGE/003: Unable to delete AsMessage because it is in use:
	 * mcode=$0
	 */
	public static final Message Base_ASMESSAGE_003 = new Message(
			"Base/AsMessage/003",
			"Unable to delete AsMessage  because it is in use: " + "mcode=$0");

	/**
	 * Base/ASMESSAGE/005: Unable to create association with ASMESSAGE because
	 * ASMESSAGE is already in use: id=$0
	 */
	public static final Message Base_ASMESSAGE_005 = new Message(
			"Base/ASMESSAGE/005",
			"Unable to create association with ASMESSAGE "
					+ "because ASMESSAGE is " + "already in use: id=$0");

	/**
	 * Base/ASMESSAGE/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_ASMESSAGE_006 = new Message(
			"Base/ASMESSAGE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/ASMESSAGE/009: Unable to create association because ASMESSAGE is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_ASMESSAGE_009 = new Message(
			"Base/ASMESSAGE/009",
			"Unable to create association because ASMESSAGE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/ASMESSAGE/013: Unable to disassociate ASMESSAGE AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_ASMESSAGE_013 = new Message(
			"Base/ASMESSAGE/013", "Unable to disassociate because ASMESSAGE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/ACTACCTYPES/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_ACTACCTYPES_000 = new Message(
			"Base/ACTACCTYPES/000", "ActAccTypes does not exist: "
					+ "actAccId=$0");

	/**
	 * Base/ACTACCTYPES/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_ACTACCTYPES_001 = new Message(
			"Base/ACTACCTYPES/001",
			"Unable to create ActAccTypes because it already exists: "
					+ "actAccId=$0");

	/**
	 * Base/ACTACCTYPES/003: Unable to delete ActAccTypes because it is in use:
	 * actAccId=$0
	 */
	public static final Message Base_ACTACCTYPES_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ActAccTypes  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/ACTACCTYPES/005: Unable to create association with ACTACCTYPES
	 * because ACTACCTYPES is already in use: id=$0
	 */
	public static final Message Base_ACTACCTYPES_005 = new Message(
			"Base/ACTACCTYPES/005",
			"Unable to create association with ACTACCTYPES "
					+ "because ACTACCTYPES is " + "already in use: id=$0");

	/**
	 * Base/ACTACCTYPES/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_ACTACCTYPES_006 = new Message(
			"Base/ACTACCTYPES/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/ACTACCTYPES/009: Unable to create association because ACTACCTYPES is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_ACTACCTYPES_009 = new Message(
			"Base/ACTACCTYPES/009",
			"Unable to create association because ACTACCTYPES"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/ACTACCTYPES/013: Unable to disassociate ACTACCTYPES AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_ACTACCTYPES_013 = new Message(
			"Base/ACTACCTYPES/013",
			"Unable to disassociate because ACTACCTYPES "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/AUDADDRESS/000: AudAddress does not exist:
	 * 
	 * 
	 * audAddrid=$0
	 * 
	 * 
	 */
	public static final Message Base_AUDADDRESS_000 = new Message(
			"Base/AUDADDRESS/000", "AudAddress does not exist: "
					+ "audAddrid=$0");

	/**
	 * Base/AUDADDRESS/001: Unable to create AudAddress because it already
	 * exists:
	 * 
	 * 
	 * audAddrid=$0
	 * 
	 * 
	 */
	public static final Message Base_AUDADDRESS_001 = new Message(
			"Base/AUDADDRESS/001",
			"Unable to create AudAddress because it already exists: "
					+ "audAddrid=$0");

	/**
	 * Base/AUDADDRESS/003: Unable to delete AudAddress because it is in use:
	 * 
	 * 
	 * audAddrid=$0
	 * 
	 * 
	 */
	public static final Message Base_AUDADDRESS_003 = new Message(
			"Base/AudAddress/003",
			"Unable to delete AudAddress  because it is in use: "
					+ "audAddrid=$0");

	/**
	 * Base/AUDADDRESS/005: Unable to create association with AUDADDRESS because
	 * AUDADDRESS is already in use: id=$0
	 */
	public static final Message Base_AUDADDRESS_005 = new Message(
			"Base/AUDADDRESS/005",
			"Unable to create association with AUDADDRESS "
					+ "because AUDADDRESS is " + "already in use: id=$0");

	/**
	 * Base/AUDADDRESS/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_AUDADDRESS_006 = new Message(
			"Base/AUDADDRESS/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/AUDADDRESS/009: Unable to create association because AUDADDRESS is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_AUDADDRESS_009 = new Message(
			"Base/AUDADDRESS/009",
			"Unable to create association because AUDADDRESS"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/AUDADDRESS/013: Unable to disassociate AUDADDRESS AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_AUDADDRESS_013 = new Message(
			"Base/AUDADDRESS/013", "Unable to disassociate because AUDADDRESS "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/BTHBATCHHISTORY/000: BthBatchHistory does not exist:
	 * 
	 * 
	 * bthBatchRunNum=$0
	 */
	public static final Message Base_BTHBATCHHISTORY_000 = new Message(
			"Base/BTHBATCHHISTORY/000", "BthBatchHistory does not exist: "
					+ "bthBatchRunNum=$0");

	/**
	 * Base/BTHBATCHHISTORY/001: Unable to create BthBatchHistory because it
	 * already exists:
	 * 
	 * 
	 * bthBatchRunNum=$0
	 */
	public static final Message Base_BTHBATCHHISTORY_001 = new Message(
			"Base/BTHBATCHHISTORY/001",
			"Unable to create BthBatchHistory because it already exists: "
					+ "bthBatchRunNum=$0");

	/**
	 * Base/BTHBATCHHISTORY/003: Unable to delete BthBatchHistory because it is
	 * in use:
	 * 
	 * 
	 * bthBatchRunNum=$0
	 */
	public static final Message Base_BTHBATCHHISTORY_003 = new Message(
			"Base/BthBatchHistory/003",
			"Unable to delete BthBatchHistory  because it is in use: "
					+ "bthBatchRunNum=$0");

	/**
	 * Base/BTHBATCHHISTORY/005: Unable to create association with
	 * BTHBATCHHISTORY because BTHBATCHHISTORY is already in use: id=$0
	 */
	public static final Message Base_BTHBATCHHISTORY_005 = new Message(
			"Base/BTHBATCHHISTORY/005",
			"Unable to create association with BTHBATCHHISTORY "
					+ "because BTHBATCHHISTORY is " + "already in use: id=$0");

	/**
	 * Base/BTHBATCHHISTORY/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_BTHBATCHHISTORY_006 = new Message(
			"Base/BTHBATCHHISTORY/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/BTHBATCHHISTORY/009: Unable to create association because
	 * BTHBATCHHISTORY is already associated to the child object: id=$0
	 */
	public static final Message Base_BTHBATCHHISTORY_009 = new Message(
			"Base/BTHBATCHHISTORY/009",
			"Unable to create association because BTHBATCHHISTORY"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/BTHBATCHHISTORY/013: Unable to disassociate BTHBATCHHISTORY AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_BTHBATCHHISTORY_013 = new Message(
			"Base/BTHBATCHHISTORY/013",
			"Unable to disassociate because BTHBATCHHISTORY "
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
	 * Base/OPSERVM/000: Opservm does not exist:
	 * 
	 * 
	 * product=$0
	 */
	public static final Message Base_OPSERVM_000 = new Message(
			"Base/OPSERVM/000", "Opservm does not exist: " + "product=$0");

	/**
	 * Base/OPSERVM/001: Unable to create Opservm because it already exists:
	 * 
	 * 
	 * product=$0
	 */
	public static final Message Base_OPSERVM_001 = new Message(
			"Base/OPSERVM/001",
			"Unable to create Opservm because it already exists: "
					+ "product=$0");

	/**
	 * Base/OPSERVM/003: Unable to delete Opservm because it is in use:
	 * 
	 * 
	 * product=$0
	 */
	public static final Message Base_OPSERVM_003 = new Message(
			"Base/Opservm/003",
			"Unable to delete Opservm  because it is in use: " + "product=$0");

	/**
	 * Base/OPSERVM/005: Unable to create association with OPSERVM because
	 * OPSERVM is already in use: id=$0
	 */
	public static final Message Base_OPSERVM_005 = new Message(
			"Base/OPSERVM/005", "Unable to create association with OPSERVM "
					+ "because OPSERVM is " + "already in use: id=$0");

	/**
	 * Base/OPSERVM/006: Unable to delete AAA because this will orphan B: id=$0
	 */
	public static final Message Base_OPSERVM_006 = new Message(
			"Base/OPSERVM/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/OPSERVM/009: Unable to create association because OPSERVM is already
	 * associated to the child object: id=$0
	 */
	public static final Message Base_OPSERVM_009 = new Message(
			"Base/OPSERVM/009", "Unable to create association because OPSERVM"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/OPSERVM/013: Unable to disassociate OPSERVM AAA because this will
	 * orphan B: id=$0" );
	 */
	public static final Message Base_OPSERVM_013 = new Message(
			"Base/OPSERVM/013", "Unable to disassociate because OPSERVM "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/OPCOSM/000: Opcosm does not exist:
	 * 
	 * 
	 * costOfSales=$0
	 */
	public static final Message Base_OPCOSM_000 = new Message(
			"Base/OPCOSM/000", "Opcosm does not exist: " + "costOfSales=$0");

	/**
	 * Base/OPCOSM/001: Unable to create Opcosm because it already exists:
	 * 
	 * 
	 * costOfSales=$0
	 */
	public static final Message Base_OPCOSM_001 = new Message(
			"Base/OPCOSM/001",
			"Unable to create Opcosm because it already exists: "
					+ "costOfSales=$0");

	/**
	 * Base/OPCOSM/003: Unable to delete Opcosm because it is in use:
	 * 
	 * 
	 * costOfSales=$0
	 */
	public static final Message Base_OPCOSM_003 = new Message(
			"Base/Opcosm/003",
			"Unable to delete Opcosm  because it is in use: "
					+ "costOfSales=$0");

	/**
	 * Base/OPCOSM/005: Unable to create association with OPCOSM because OPCOSM
	 * is already in use: id=$0
	 */
	public static final Message Base_OPCOSM_005 = new Message(
			"Base/OPCOSM/005", "Unable to create association with OPCOSM "
					+ "because OPCOSM is " + "already in use: id=$0");

	/**
	 * Base/OPCOSM/006: Unable to delete AAA because this will orphan B: id=$0
	 */
	public static final Message Base_OPCOSM_006 = new Message(
			"Base/OPCOSM/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/OPCOSM/009: Unable to create association because OPCOSM is already
	 * associated to the child object: id=$0
	 */
	public static final Message Base_OPCOSM_009 = new Message(
			"Base/OPCOSM/009", "Unable to create association because OPCOSM"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/OPCOSM/013: Unable to disassociate OPCOSM AAA because this will
	 * orphan B: id=$0" );
	 */
	public static final Message Base_OPCOSM_013 = new Message(
			"Base/OPCOSM/013", "Unable to disassociate because OPCOSM "
					+ " AAA because this will orphan B: id=$0");

	public static final Message Base_PDPORTDETAILS_000 = new Message(
			"Base/PDPORTDETAIL/000", "PdPortDetails does not exist: "
					+ "PdSerials=$0");

	public static final Message Base_PDPORTDETAILS_001 = new Message(
			"Base/PDPORTDETAILS/001",
			"Unable to create PdPortDetails because it already exists: "
					+ "PdSerial=$0");

	public static final Message Base_PDPORTDETAILS_003 = new Message(
			"Base/PDPORTDETAILS/003",
			"Unable to delete Opcosm  because it is in use: " + "PdSales=$0");

	public static final Message Base_PDPORTDETAILS_005 = new Message(
			"Base/PDPORTDETAILS/005",
			"Unable to create association with PDPORTDETAILS "
					+ "because PDPORTDETAILS is "
					+ "already in use: PdSerial=$0");

	public static final Message Base_PDPORTDETAILS_006 = new Message(
			"Base/PDPORTDETAILS/006",
			"Unable to delete AAA because this will orphan B: PdSerial=$0");

	public static final Message Base_PDPORTDETAILS_009 = new Message(
			"Base/PDPORTDETAILS/009",
			"Unable to create association because PDPORTDETAILS"
					+ " is already associated to the child object: id=$0");

	public static final Message Base_PDPORTDETAILS_013 = new Message(
			"Base/PDPORTDETAILS/013",
			"Unable to disassociate because PDPORTDETAILS "
					+ " AAA because this will orphan B: id=$0");

	public static final Message Base_SEQMAPN2N_000 = new Message(
			"Base/SEQMAPN2N/000", "SEQMAPN2N does not exist:");

	public static final Message Base_SEQMAPN2N_001 = new Message(
			"Base/SEQMAPN2N/001",
			"Unable to create SeqMapN2N because it already exists: ");

	public static final Message Base_ECFEVENTCMDFILE_000 = new Message(
			"Base/ECFEVENTCMDFILE/000", "ECFEVENTCMDFILE does not exist:");

	public static final Message Base_ECFEVENTCMDFILE_001 = new Message(
			"Base/ECFEVENTCMDFILE/001",
			"Unable to create ECFEVENTCMDFILE because it already exists: ");

	public static final Message Base_PGCPROGRAMCONTRL_000 = new Message(
			"Base/PGCPROGRAMCONTRL/000", "PgcProgramContrl does not exist: "
					+ "PdSerials=$0");

	public static final Message Base_PGCPROGRAMCONTRL_001 = new Message(
			"Base/PGCPROGRAMCONTRLS/001",
			"Unable to create PgcProgramContrl because it already exists: "
					+ "PdSerial=$0");

	public static final Message Base_PGCPROGRAMCONTRL_003 = new Message(
			"Base/PGCPROGRAMCONTRLS/003",
			"Unable to delete PGCPROGRAMCONTRL  because it is in use: "
					+ "PdSales=$0");

	public static final Message Base_PGCPROGRAMCONTRL_005 = new Message(
			"Base/PGCPROGRAMCONTRLS/005",
			"Unable to create association with PGCPROGRAMCONTRLS "
					+ "because PGCPROGRAMCONTRLS is "
					+ "already in use: PdSerial=$0");

	public static final Message Base_PGCPROGRAMCONTRL_006 = new Message(
			"Base/PGCPROGRAMCONTRLS/006",
			"Unable to delete AAA because this will orphan B: PdSerial=$0");

	public static final Message Base_PGCPROGRAMCONTRL_009 = new Message(
			"Base/PGCPROGRAMCONTRLS/009",
			"Unable to create association because PGCPROGRAMCONTRLS"
					+ " is already associated to the child object: id=$0");

	public static final Message Base_PGCPROGRAMCONTRL_013 = new Message(
			"Base/PGCPROGRAMCONTRLS/013",
			"Unable to disassociate because PGCPROGRAMCONTRLS "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VSR2SERVICEAUX/000: Vsr2ServiceAux does not exist:
	 * 
	 * 
	 * vsr2ServiceCode=$0
	 */
	public static final Message Base_VSR2SERVICEAUX_000 = new Message(
			"Base/VSR2SERVICEAUX/000", "Vsr2ServiceAux does not exist: "
					+ "vsr2ServiceCode=$0");

	/**
	 * Base/VSR2SERVICEAUX/001: Unable to create Vsr2ServiceAux because it
	 * already exists:
	 * 
	 * 
	 * vsr2ServiceCode=$0
	 */
	public static final Message Base_VSR2SERVICEAUX_001 = new Message(
			"Base/VSR2SERVICEAUX/001",
			"Unable to create Vsr2ServiceAux because it already exists: "
					+ "vsr2ServiceCode=$0");

	/**
	 * Base/VSR2SERVICEAUX/003: Unable to delete Vsr2ServiceAux because it is in
	 * use:
	 * 
	 * 
	 * vsr2ServiceCode=$0
	 */
	public static final Message Base_VSR2SERVICEAUX_003 = new Message(
			"Base/Vsr2ServiceAux/003",
			"Unable to delete Vsr2ServiceAux  because it is in use: "
					+ "vsr2ServiceCode=$0");

	/**
	 * Base/VSR2SERVICEAUX/005: Unable to create association with VSR2SERVICEAUX
	 * because VSR2SERVICEAUX is already in use: id=$0
	 */
	public static final Message Base_VSR2SERVICEAUX_005 = new Message(
			"Base/VSR2SERVICEAUX/005",
			"Unable to create association with VSR2SERVICEAUX "
					+ "because VSR2SERVICEAUX is " + "already in use: id=$0");

	/**
	 * Base/VSR2SERVICEAUX/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_VSR2SERVICEAUX_006 = new Message(
			"Base/VSR2SERVICEAUX/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VSR2SERVICEAUX/009: Unable to create association because
	 * VSR2SERVICEAUX is already associated to the child object: id=$0
	 */
	public static final Message Base_VSR2SERVICEAUX_009 = new Message(
			"Base/VSR2SERVICEAUX/009",
			"Unable to create association because VSR2SERVICEAUX"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VSR2SERVICEAUX/013: Unable to disassociate VSR2SERVICEAUX AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_VSR2SERVICEAUX_013 = new Message(
			"Base/VSR2SERVICEAUX/013",
			"Unable to disassociate because VSR2SERVICEAUX "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/CPCCALLPRECHARGE/000: CPCCALLPRECHARGE does not exist:
	 * 
	 * 
	 * cpcId=$0
	 */
	public static final Message Base_CPCCALLPRECHARGE_000 = new Message(
			"Base/CPCCALLPRECHARGE/000", "CPCCALLPRECHARGE does not exist:"
					+ "cpcId=$0");

	/**
	 * Base/CPCCALLPRECHARGE/001: Unable to create CPCCALLPRECHARGE because it
	 * already exists: cpcId=$0
	 */
	public static final Message Base_CPCCALLPRECHARGE_001 = new Message(
			"Base/CPCCALLPRECHARGE/001",
			"Unable to create CPCCALLPRECHARGE because it already exists: "
					+ "cpcId=$0");

	/**
	 * Base/CPCCALLPRECHARGE/003: Unable to delete CPCCALLPRECHARGE because it
	 * is in use:
	 * 
	 * 
	 * cpcId=$0
	 */
	public static final Message Base_CPCCALLPRECHARGE_003 = new Message(
			"Base/CPCCALLPRECHARGE/003",
			"Unable to delete CPCCALLPRECHARGE  because it is in use: "
					+ "cpcId=$0");

	/**
	 * Base/CPCCALLPRECHARGE/005: Unable to create association with
	 * CPCCALLPRECHARGE because CPCCALLPRECHARGE is already in use: id=$0
	 */
	public static final Message Base_CPCCALLPRECHARGE_005 = new Message(
			"Base/CPCCALLPRECHARGE/005",
			"Unable to create association with CPCCALLPRECHARGE "
					+ "because CPCCALLPRECHARGE is " + "already in use: id=$0");

	/**
	 * Base/CPCCALLPRECHARGE/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_CPCCALLPRECHARGE_006 = new Message(
			"Base/CPCCALLPRECHARGE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/CPCCALLPRECHARGE/009: Unable to create association because
	 * CPCCALLPRECHARGE is already associated to the child object: id=$0
	 */
	public static final Message Base_CPCCALLPRECHARGE_009 = new Message(
			"Base/CPCCALLPRECHARGE/009",
			"Unable to create association because CPCCALLPRECHARGE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/CPCCALLPRECHARGE/013: Unable to disassociate CPCCALLPRECHARGE AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_CPCCALLPRECHARGE_013 = new Message(
			"Base/CPCCALLPRECHARGE/013",
			"Unable to disassociate because CPCCALLPRECHARGE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/ACTACCTYPES/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_HMHANDSETMANU_000 = new Message(
			"Base/ACTACCTYPES/000", "ActAccTypes does not exist: "
					+ "actAccId=$0");

	/**
	 * Base/ACTACCTYPES/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_HMHANDSETMANU_001 = new Message(
			"Base/HMHANDSETMANU/001",
			"Unable to create ActAccTypes because it already exists: "
					+ "actAccId=$0");

	/**
	 * Base/HMHANDSETMANU/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_HMHANDSETMANU_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ActAccTypes  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/HMHANDSETMANU/005: Unable to create association with HMHANDSETMANU
	 * because HMHANDSETMANU is already in use: id=$0
	 */
	public static final Message Base_HMHANDSETMANU_005 = new Message(
			"Base/HMHANDSETMANU/005",
			"Unable to create association with HMHANDSETMANU "
					+ "because HMHANDSETMANU is " + "already in use: id=$0");

	/**
	 * Base/HMHANDSETMANU/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_HMHANDSETMANU_006 = new Message(
			"Base/HMHANDSETMANU/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/HMHANDSETMANU/009: Unable to create association because
	 * HMHANDSETMANU is already associated to the child object: id=$0
	 */
	public static final Message Base_HMHANDSETMANU_009 = new Message(
			"Base/HMHANDSETMANU/009",
			"Unable to create association because HMHANDSETMANU"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/HMHANDSETMANU/013: Unable to disassociate HMHANDSETMANU AAA because
	 * this will orphan B: id=$0" );
	 */
	public static final Message Base_HMHANDSETMANU_013 = new Message(
			"Base/HMHANDSETMANU/013",
			"Unable to disassociate because HMHANDSETMANU "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/ACTACCTYPES/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_HM2HANDSETMODEL_000 = new Message(
			"Base/ACTACCTYPES/000", "ActAccTypes does not exist: "
					+ "actAccId=$0");

	/**
	 * Base/ACTACCTYPES/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_HM2HANDSETMODEL_001 = new Message(
			"Base/HM2HANDSETMODEL/001",
			"Unable to create HM_HAND_SET because it already exists: "
					+ "HmManuId=$0");

	/**
	 * Base/HM2HANDSETMODEL/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_HM2HANDSETMODEL_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete HM_HAND_SET  because it is in use: "
					+ "HmManuId=$0");

	/**
	 * Base/HM2HANDSETMODEL/005: Unable to create association with
	 * HM2HANDSETMODEL because HM2HANDSETMODEL is already in use: id=$0
	 */
	public static final Message Base_HM2HANDSETMODEL_005 = new Message(
			"Base/HM2HANDSETMODEL/005",
			"Unable to create association with HM2HANDSETMODEL "
					+ "because HM2HANDSETMODEL is " + "already in use: id=$0");

	/**
	 * Base/HM2HANDSETMODEL/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_HM2HANDSETMODEL_006 = new Message(
			"Base/HM2HANDSETMODEL/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/HM2HANDSETMODEL/009: Unable to create association because
	 * HM2HANDSETMODEL is already associated to the child object: id=$0
	 */
	public static final Message Base_HM2HANDSETMODEL_009 = new Message(
			"Base/HM2HANDSETMODEL/009",
			"Unable to create association because HM2HANDSETMODEL"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/HM2HANDSETMODEL/013: Unable to disassociate HM2HANDSETMODEL AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_HM2HANDSETMODEL_013 = new Message(
			"Base/HM2HANDSETMODEL/013",
			"Unable to disassociate because HM2HANDSETMODEL "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/AUXCUSTOMERS/000: AuxCustomers does not exist:
	 * 
	 * 
	 * billAcNo=$0
	 */
	public static final Message Base_SBASUBAUX_000 = new Message(
			"Base/SBASUBAUX/000", "SbaSubAux does not exist: " + "billAcNo=$0");

	/**
	 * Base/SBASUBAUX/001: Unable to create SbaSubAux because it already exists:
	 * 
	 * 
	 * billAcNo=$0
	 */
	public static final Message Base_SBASUBAUX_001 = new Message(
			"Base/SBASUBAUX/001",
			"Unable to create SbaSubAux because it already exists: "
					+ "billAcNo=$0");

	/**
	 * Base/SBASUBAUX/003: Unable to delete SbaSubAux because it is in use:
	 * 
	 * 
	 * billAcNo=$0
	 */
	public static final Message Base_SBASUBAUX_003 = new Message(
			"Base/SbaSubAux/003",
			"Unable to delete SbaSubAux  because it is in use: "
					+ "billAcNo=$0");

	/**
	 * Base/SBASUBAUX/005: Unable to create association with SBASUBAUX because
	 * SBASUBAUX is already in use: id=$0
	 */
	public static final Message Base_SBASUBAUX_005 = new Message(
			"Base/SBASUBAUX/005",
			"Unable to create association with SBASUBAUX "
					+ "because SBASUBAUX is " + "already in use: id=$0");

	/**
	 * Base/SBASUBAUX/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SBASUBAUX_006 = new Message(
			"Base/SBASUBAUX/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SBASUBAUX/009: Unable to create association because SBASUBAUX is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_SBASUBAUX_009 = new Message(
			"Base/SBASUBAUX/009",
			"Unable to create association because SBASUBAUX"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SBASUBAUX/013: Unable to disassociate SBASUBAUX AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_SBASUBAUX_013 = new Message(
			"Base/SBASUBAUX/013", "Unable to disassociate because SBASUBAUX "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/URSURLSETTING/000: URSURLSetting does not exist:
	 * 
	 * 
	 * URSURLCode=$0
	 */
	public static final Message Base_URSURLSETTING_000 = new Message(
			"Base/URSURLSETTING/000", "URSURLSetting does not exist: "
					+ "URSURLCode=$0");

	/**
	 * Base/URSURLSETTING/001: Unable to create URSURLSetting because it already
	 * exists:
	 * 
	 * 
	 * URSURLCode=$0
	 */
	public static final Message Base_URSURLSETTING_001 = new Message(
			"Base/URSURLSETTING/001",
			"Unable to create URSURLSetting because it already exists: "
					+ "URSURLCode=$0");

	/**
	 * Base/URSURLSETTING/003: Unable to delete URSURLSetting because it is in
	 * use:
	 * 
	 * 
	 * URSURLCode=$0
	 */
	public static final Message Base_URSURLSETTING_003 = new Message(
			"Base/URSURLSetting/003",
			"Unable to delete URSURLSetting  because it is in use: "
					+ "URSURLCode=$0");

	/**
	 * Base/URSURLSETTING/005: Unable to create association with URSURLSETTING
	 * because URSURLSETTING is already in use: id=$0
	 */
	public static final Message Base_URSURLSETTING_005 = new Message(
			"Base/URSURLSETTING/005",
			"Unable to create association with URSURLSETTING "
					+ "because URSURLSETTING is " + "already in use: id=$0");

	/**
	 * Base/URSURLSETTING/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_URSURLSETTING_006 = new Message(
			"Base/URSURLSETTING/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/URSURLSETTING/009: Unable to create association because
	 * URSURLSETTING is already associated to the child object: id=$0
	 */
	public static final Message Base_URSURLSETTING_009 = new Message(
			"Base/URSURLSETTING/009",
			"Unable to create association because URSURLSETTING"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/URSURLSETTING/013: Unable to disassociate URSURLSETTING AAA because
	 * this will orphan B: id=$0" );
	 */
	public static final Message Base_URSURLSETTING_013 = new Message(
			"Base/URSURLSETTING/013",
			"Unable to disassociate because URSURLSETTING "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/ASRADDSERVREQ/000: AsrAddServReq does not exist: actAccId=$0
	 */
	public static final Message Base_ASRADDSERVREQ_000 = new Message(
			"Base/ASRADDSERVREQ/000", "AsrAddServReq does not exist: "
					+ "actAccId=$0");

	/**
	 * Base/ASRADDSERVREQ/001: Unable to create AsrAddServReq because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_ASRADDSERVREQ_001 = new Message(
			"Base/ASRADDSERVREQ/001",
			"Unable to create AsrAddServReq because it already exists: "
					+ "actAccId=$0");

	/**
	 * Base/ASRADDSERVREQ/003: Unable to delete AsrAddServReq because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_ASRADDSERVREQ_003 = new Message(
			"Base/AsrAddServReq/003",
			"Unable to delete AsrAddServReq  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/ASRADDSERVREQ/005: Unable to create association with ASRADDSERVREQ
	 * because ASRADDSERVREQ is already in use: id=$0
	 */
	public static final Message Base_ASRADDSERVREQ_005 = new Message(
			"Base/ASRADDSERVREQ/005",
			"Unable to create association with ASRADDSERVREQ "
					+ "because ASRADDSERVREQ is " + "already in use: id=$0");

	/**
	 * Base/ASRADDSERVREQ/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_ASRADDSERVREQ_006 = new Message(
			"Base/ASRADDSERVREQ/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/ASRADDSERVREQ/009: Unable to create association because
	 * ASRADDSERVREQ is already associated to the child object: id=$0
	 */
	public static final Message Base_ASRADDSERVREQ_009 = new Message(
			"Base/ASRADDSERVREQ/009",
			"Unable to create association because ASRADDSERVREQ"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/ASRADDSERVREQ/013: Unable to disassociate ASRADDSERVREQ AAA because
	 * this will orphan B: id=$0" );
	 */
	public static final Message Base_ASRADDSERVREQ_013 = new Message(
			"Base/ASRADDSERVREQ/013",
			"Unable to disassociate because ASRADDSERVREQ "
					+ " AAA because this will orphan B: id=$0");

	public static final Message Base_EDFPRIMSIM_000 = new Message(
			"Base/EDF-PRIM-SIM/000", "EdfPrimarySim does not exist: "
					+ "EdfPrimarySim=$0");
	/*
	 * ==========================================================================
	 * ============================================
	 */

	/**
	 * Base/DPFDEFPOCFOLDER/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_DPFDEFPOCFOLDER_000 = new Message(
			"Base/DPFDEFPOCFOLDER/000", "DpfFolderId does not exist: "
					+ "DpfFolderId=$0");

	/**
	 * Base/DPFDEFPOCFOLDER/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_DPFDEFPOCFOLDER_001 = new Message(
			"Base/DPFDEFPOCFOLDER/001",
			"Unable to create DPFDEFPOCFOLDER because it already exists: "
					+ "DpfFolderId=$0");

	/**
	 * Base/DPFDEFPOCFOLDER/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_DPFDEFPOCFOLDER_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ActAccTypes  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/DPFDEFPOCFOLDER/005: Unable to create association with
	 * DPFDEFPOCFOLDER because DPFDEFPOCFOLDER is already in use: id=$0
	 */
	public static final Message Base_DPFDEFPOCFOLDER_005 = new Message(
			"Base/DPFDEFPOCFOLDER/005",
			"Unable to create association with DPFDEFPOCFOLDER "
					+ "because DPFDEFPOCFOLDER is " + "already in use: id=$0");

	/**
	 * Base/DPFDEFPOCFOLDER/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_DPFDEFPOCFOLDER_006 = new Message(
			"Base/DPFDEFPOCFOLDER/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/DPFDEFPOCFOLDER/009: Unable to create association because
	 * DPFDEFPOCFOLDER is already associated to the child object: id=$0
	 */
	public static final Message Base_DPFDEFPOCFOLDER_009 = new Message(
			"Base/DPFDEFPOCFOLDER/009",
			"Unable to create association because DPFDEFPOCFOLDER"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/DPFDEFPOCFOLDER/013: Unable to disassociate DPFDEFPOCFOLDER AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_DPFDEFPOCFOLDER_013 = new Message(
			"Base/DPFDEFPOCFOLDER/013",
			"Unable to disassociate because DPFDEFPOCFOLDER "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/FNTNETTRANSPEND/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_FNTNETTRANSPEND_000 = new Message(
			"Base/FNTNETTRANSPEND/000", "FNTNETTRANSPEND does not exist: "
					+ "FntSerialId=$0");

	/**
	 * Base/FNTNETTRANSPEND/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_FNTNETTRANSPEND_001 = new Message(
			"Base/FNTNETTRANSPEND/001",
			"Unable to create FntNetTransPend because it already exists: "
					+ "FntSerialId=$0");

	/**
	 * Base/FNTNETTRANSPEND/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_FNTNETTRANSPEND_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ActAccTypes  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/FNTNETTRANSPEND/005: Unable to create association with
	 * FNTNETTRANSPEND because FNTNETTRANSPEND is already in use: id=$0
	 */
	public static final Message Base_FNTNETTRANSPEND_005 = new Message(
			"Base/FNTNETTRANSPEND/005",
			"Unable to create association with FNTNETTRANSPEND "
					+ "because FNTNETTRANSPEND is " + "already in use: id=$0");

	/**
	 * Base/FNTNETTRANSPEND/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_FNTNETTRANSPEND_006 = new Message(
			"Base/FNTNETTRANSPEND/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/FNTNETTRANSPEND/009: Unable to create association because
	 * FNTNETTRANSPEND is already associated to the child object: id=$0
	 */
	public static final Message Base_FNTNETTRANSPEND_009 = new Message(
			"Base/FNTNETTRANSPEND/009",
			"Unable to create association because FNTNETTRANSPEND"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/FNTNETTRANSPEND/013: Unable to disassociate FNTNETTRANSPEND AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_FNTNETTRANSPEND_013 = new Message(
			"Base/FNTNETTRANSPEND/013",
			"Unable to disassociate because FNTNETTRANSPEND "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/PFSPOCFLDRSUBS/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_PFSPOCFLDRSUBS_000 = new Message(
			"Base/PFSPOCFLDRSUBS/000", "PFSPOCFLDRSUBS does not exist: "
					+ "PfsSubscriberId=$0");

	/**
	 * Base/PFSPOCFLDRSUBS/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_PFSPOCFLDRSUBS_001 = new Message(
			"Base/PFSPOCFLDRSUBS/001",
			"Unable to create PFSPOCFLDRSUBS because it already exists: "
					+ "PfsSubscriberId=$0");

	/**
	 * Base/PFSPOCFLDRSUBS/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_PFSPOCFLDRSUBS_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ActAccTypes  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/PFSPOCFLDRSUBS/005: Unable to create association with PFSPOCFLDRSUBS
	 * because PFSPOCFLDRSUBS is already in use: id=$0
	 */
	public static final Message Base_PFSPOCFLDRSUBS_005 = new Message(
			"Base/PFSPOCFLDRSUBS/005",
			"Unable to create association with PFSPOCFLDRSUBS "
					+ "because PFSPOCFLDRSUBS is " + "already in use: id=$0");

	/**
	 * Base/PFSPOCFLDRSUBS/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_PFSPOCFLDRSUBS_006 = new Message(
			"Base/PFSPOCFLDRSUBS/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/PFSPOCFLDRSUBS/009: Unable to create association because
	 * PFSPOCFLDRSUBS is already associated to the child object: id=$0
	 */
	public static final Message Base_PFSPOCFLDRSUBS_009 = new Message(
			"Base/PFSPOCFLDRSUBS/009",
			"Unable to create association because PFSPOCFLDRSUBS"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/PFSPOCFLDRSUBS/013: Unable to disassociate PFSPOCFLDRSUBS AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_PFSPOCFLDRSUBS_013 = new Message(
			"Base/PFSPOCFLDRSUBS/013",
			"Unable to disassociate because PFSPOCFLDRSUBS "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SDSIMDEACTIVATE/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_SDSIMDEACTIVATE_000 = new Message(
			"Base/SDSIMDEACTIVATE/000", "SDSIMDEACTIVATE does not exist: "
					+ "SdSubscriberId=$0");

	/**
	 * Base/SDSIMDEACTIVATE/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_SDSIMDEACTIVATE_001 = new Message(
			"Base/SDSIMDEACTIVATE/001",
			"Unable to create SDSIMDEACTIVATE because it already exists: "
					+ "SdSubscriberId=$0");

	/**
	 * Base/SDSIMDEACTIVATE/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_SDSIMDEACTIVATE_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ActAccTypes  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/SDSIMDEACTIVATE/005: Unable to create association with
	 * SDSIMDEACTIVATE because SDSIMDEACTIVATE is already in use: id=$0
	 */
	public static final Message Base_SDSIMDEACTIVATE_005 = new Message(
			"Base/SDSIMDEACTIVATE/005",
			"Unable to create association with SDSIMDEACTIVATE "
					+ "because SDSIMDEACTIVATE is " + "already in use: id=$0");

	/**
	 * Base/SDSIMDEACTIVATE/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_SDSIMDEACTIVATE_006 = new Message(
			"Base/SDSIMDEACTIVATE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SDSIMDEACTIVATE/009: Unable to create association because
	 * SDSIMDEACTIVATE is already associated to the child object: id=$0
	 */
	public static final Message Base_SDSIMDEACTIVATE_009 = new Message(
			"Base/SDSIMDEACTIVATE/009",
			"Unable to create association because SDSIMDEACTIVATE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SDSIMDEACTIVATE/013: Unable to disassociate SDSIMDEACTIVATE AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_SDSIMDEACTIVATE_013 = new Message(
			"Base/SDSIMDEACTIVATE/013",
			"Unable to disassociate because SDSIMDEACTIVATE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SFESIMFUTEVENT/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_SFESIMFUTEVENT_000 = new Message(
			"Base/SFESIMFUTEVENT/000", "SFESIMFUTEVENT does not exist: "
					+ "SfeServiceCode=$0");

	/**
	 * Base/SFESIMFUTEVENT/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_SFESIMFUTEVENT_001 = new Message(
			"Base/SFESIMFUTEVENT/001",
			"Unable to create SFESIMFUTEVENT because it already exists: "
					+ "SfeServiceCode=$0");

	/**
	 * Base/SFESIMFUTEVENT/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_SFESIMFUTEVENT_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ActAccTypes  because it is in use: "
					+ "actAccId=$0");

	/**
	 * Base/SFESIMFUTEVENT/005: Unable to create association with SFESIMFUTEVENT
	 * because SFESIMFUTEVENT is already in use: id=$0
	 */
	public static final Message Base_SFESIMFUTEVENT_005 = new Message(
			"Base/SFESIMFUTEVENT/005",
			"Unable to create association with SFESIMFUTEVENT "
					+ "because SFESIMFUTEVENT is " + "already in use: id=$0");

	/**
	 * Base/SFESIMFUTEVENT/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SFESIMFUTEVENT_006 = new Message(
			"Base/SFESIMFUTEVENT/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SFESIMFUTEVENT/009: Unable to create association because
	 * SFESIMFUTEVENT is already associated to the child object: id=$0
	 */
	public static final Message Base_SFESIMFUTEVENT_009 = new Message(
			"Base/SFESIMFUTEVENT/009",
			"Unable to create association because SFESIMFUTEVENT"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SFESIMFUTEVENT/013: Unable to disassociate SFESIMFUTEVENT AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_SFESIMFUTEVENT_013 = new Message(
			"Base/SFESIMFUTEVENT/013",
			"Unable to disassociate because SFESIMFUTEVENT "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SPVPARAMVALUES/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_SPVPARAMVALUES_000 = new Message(
			"Base/SPVPARAMVALUES/000", "SPVPARAMVALUES does not exist: "
					+ "SpvParamValue=$0");

	/**
	 * Base/SPVPARAMVALUES/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_SPVPARAMVALUES_001 = new Message(
			"Base/SPVPARAMVALUES/001",
			"Unable to create SPVPARAMVALUES because it already exists: "
					+ "SpvParamValue=$0");

	/**
	 * Base/SPVPARAMVALUES/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_SPVPARAMVALUES_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete SPVPARAMVALUES  because it is in use: "
					+ "SpvParamValue=$0");

	/**
	 * Base/SPVPARAMVALUES/005: Unable to create association with SPVPARAMVALUES
	 * because SPVPARAMVALUES is already in use: id=$0
	 */
	public static final Message Base_SPVPARAMVALUES_005 = new Message(
			"Base/SPVPARAMVALUES/005",
			"Unable to create association with SPVPARAMVALUES "
					+ "because SPVPARAMVALUES is " + "already in use: id=$0");

	/**
	 * Base/SPVPARAMVALUES/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SPVPARAMVALUES_006 = new Message(
			"Base/SPVPARAMVALUES/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SPVPARAMVALUES/009: Unable to create association because
	 * SPVPARAMVALUES is already associated to the child object: id=$0
	 */
	public static final Message Base_SPVPARAMVALUES_009 = new Message(
			"Base/SPVPARAMVALUES/009",
			"Unable to create association because SPVPARAMVALUES"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SPVPARAMVALUES/013: Unable to disassociate SPVPARAMVALUES AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_SPVPARAMVALUES_013 = new Message(
			"Base/SPVPARAMVALUES/013",
			"Unable to disassociate because SPVPARAMVALUES "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/VASACTIVESERVICE/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_VASACTIVESERVICE_000 = new Message(
			"Base/VASACTIVESERVICE/000", "VASACTIVESERVICE does not exist: "
					+ "VasSubscriberId=$0");

	/**
	 * Base/VASACTIVESERVICE/001: Unable to create ActAccTypes because it
	 * already exists: actAccId=$0
	 */
	public static final Message Base_VASACTIVESERVICE_001 = new Message(
			"Base/VASACTIVESERVICE/001",
			"Unable to create VASACTIVESERVICE because it already exists: "
					+ "VasSubscriberId=$0");

	/**
	 * Base/VASACTIVESERVICE/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_VASACTIVESERVICE_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete VASACTIVESERVICE  because it is in use: "
					+ "VasSubscriberId=$0");

	/**
	 * Base/VASACTIVESERVICE/005: Unable to create association with
	 * VASACTIVESERVICE because VASACTIVESERVICE is already in use: id=$0
	 */
	public static final Message Base_VASACTIVESERVICE_005 = new Message(
			"Base/VASACTIVESERVICE/005",
			"Unable to create association with VASACTIVESERVICE "
					+ "because VASACTIVESERVICE is " + "already in use: id=$0");

	/**
	 * Base/VASACTIVESERVICE/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_VASACTIVESERVICE_006 = new Message(
			"Base/VASACTIVESERVICE/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/VASACTIVESERVICE/009: Unable to create association because
	 * VASACTIVESERVICE is already associated to the child object: id=$0
	 */
	public static final Message Base_VASACTIVESERVICE_009 = new Message(
			"Base/VASACTIVESERVICE/009",
			"Unable to create association because VASACTIVESERVICE"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/VASACTIVESERVICE/013: Unable to disassociate VASACTIVESERVICE AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_VASACTIVESERVICE_013 = new Message(
			"Base/VASACTIVESERVICE/013",
			"Unable to disassociate because VASACTIVESERVICE "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/ILUIMSIlOOKUP/000: ActAccTypes does not exist: actAccId=$0
	 */
	public static final Message Base_ILUIMSIlOOKUP_000 = new Message(
			"Base/ILUIMSIlOOKUP/000", "ILUIMSIlOOKUP does not exist: "
					+ "VasSubscriberId=$0");

	/**
	 * Base/ILUIMSIlOOKUP/001: Unable to create ActAccTypes because it already
	 * exists: actAccId=$0
	 */
	public static final Message Base_ILUIMSIlOOKUP_001 = new Message(
			"Base/ILUIMSIlOOKUP/001",
			"Unable to create ILUIMSIlOOKUP because it already exists: "
					+ "IluSimNo=$0");

	/**
	 * Base/ILUIMSIlOOKUP/003: Unable to delete ActAccTypes because it is in
	 * use: actAccId=$0
	 */
	public static final Message Base_ILUIMSIlOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete ILUIMSIlOOKUP  because it is in use: "
					+ "IluSimNo=$0");

	/**
	 * Base/ILUIMSIlOOKUP/005: Unable to create association with ILUIMSIlOOKUP
	 * because ILUIMSIlOOKUP is already in use: id=$0
	 */
	public static final Message Base_ILUIMSIlOOKUP_005 = new Message(
			"Base/ILUIMSIlOOKUP/005",
			"Unable to create association with ILUIMSIlOOKUP "
					+ "because ILUIMSIlOOKUP is " + "already in use: id=$0");

	/**
	 * Base/ILUIMSIlOOKUP/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_ILUIMSIlOOKUP_006 = new Message(
			"Base/ILUIMSIlOOKUP/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/ILUIMSIlOOKUP/009: Unable to create association because
	 * ILUIMSIlOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_ILUIMSIlOOKUP_009 = new Message(
			"Base/ILUIMSIlOOKUP/009",
			"Unable to create association because ILUIMSIlOOKUP"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/ILUIMSIlOOKUP/013: Unable to disassociate ILUIMSIlOOKUP AAA because
	 * this will orphan B: id=$0" );
	 */
	public static final Message Base_ILUIMSIlOOKUP_013 = new Message(
			"Base/ILUIMSIlOOKUP/013",
			"Unable to disassociate because ILUIMSIlOOKUP "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SBHDSPLITBILLHDlOOKUP/000: ActAccTypes does not exist:
	 * sbhd_subscriber_id=$0
	 */
	public static final Message Base_SBHDSPLITBILLHDlOOKUP_000 = new Message(
			"Base/SBHDSPLITBILLHDlOOKUP/000",
			"SBHDSPLITBILLHDlOOKUP does not exist: " + "VasSubscriberId=$0");

	/**
	 * Base/SBHDSPLITBILLHDlOOKUP/001: Unable to create ActAccTypes because it
	 * already exists: sbhd_subscriber_id=$0
	 */
	public static final Message Base_SBHDSPLITBILLHDlOOKUP_001 = new Message(
			"Base/SBHDSPLITBILLHDlOOKUP/001",
			"Unable to create SBHDSPLITBILLHDlOOKUP because it already exists: "
					+ "IluSimNo=$0");

	/**
	 * Base/SBHDSPLITBILLHDlOOKUP/003: Unable to delete ActAccTypes because it
	 * is in use: sbhd_subscriber_id=$0
	 */
	public static final Message Base_SBHDSPLITBILLHDlOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete SBHDSPLITBILLHDlOOKUP  because it is in use: "
					+ "IluSimNo=$0");

	/**
	 * Base/SBHDSPLITBILLHDlOOKUP/005: Unable to create association with
	 * SBHDSPLITBILLHDlOOKUP because SBHDSPLITBILLHDlOOKUP is already in use:
	 * id=$0
	 */
	public static final Message Base_SBHDSPLITBILLHDlOOKUP_005 = new Message(
			"Base/SBHDSPLITBILLHDlOOKUP/005",
			"Unable to create association with SBHDSPLITBILLHDlOOKUP "
					+ "because SBHDSPLITBILLHDlOOKUP is "
					+ "already in use: id=$0");

	/**
	 * Base/SBHDSPLITBILLHDlOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_SBHDSPLITBILLHDlOOKUP_006 = new Message(
			"Base/SBHDSPLITBILLHDlOOKUP/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SBHDSPLITBILLHDlOOKUP/009: Unable to create association because
	 * SBHDSPLITBILLHDlOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_SBHDSPLITBILLHDlOOKUP_009 = new Message(
			"Base/SBHDSPLITBILLHDlOOKUP/009",
			"Unable to create association because SBHDSPLITBILLHDlOOKUP"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SBHDSPLITBILLHDlOOKUP/013: Unable to disassociate
	 * SBHDSPLITBILLHDlOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_SBHDSPLITBILLHDlOOKUP_013 = new Message(
			"Base/SBHDSPLITBILLHDlOOKUP/013",
			"Unable to disassociate because SBHDSPLITBILLHDlOOKUP "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/SBHSSPLITBILLHSlOOKUP/000: ActAccTypes does not exist: sbhs_sb_id=$0
	 */
	public static final Message Base_SBHSSPLITBILLHSlOOKUP_000 = new Message(
			"Base/SBHSSPLITBILLHSlOOKUP/000",
			"SBHSSPLITBILLHSlOOKUP does not exist: " + "VasSubscriberId=$0");

	/**
	 * Base/SBHSSPLITBILLHSlOOKUP/001: Unable to create ActAccTypes because it
	 * already exists: sbhs_sb_id=$0
	 */
	public static final Message Base_SBHSSPLITBILLHSlOOKUP_001 = new Message(
			"Base/SBHSSPLITBILLHSlOOKUP/001",
			"Unable to create SBHSSPLITBILLHSlOOKUP because it already exists: "
					+ "IluSimNo=$0");

	/**
	 * Base/SBHSSPLITBILLHSlOOKUP/003: Unable to delete ActAccTypes because it
	 * is in use: sbhs_sb_id=$0
	 */
	public static final Message Base_SBHSSPLITBILLHSlOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete SBHSSPLITBILLHSlOOKUP  because it is in use: "
					+ "IluSimNo=$0");

	/**
	 * Base/SBHSSPLITBILLHSlOOKUP/005: Unable to create association with
	 * SBHSSPLITBILLHSlOOKUP because SBHSSPLITBILLHSlOOKUP is already in use:
	 * id=$0
	 */
	public static final Message Base_SBHSSPLITBILLHSlOOKUP_005 = new Message(
			"Base/SBHSSPLITBILLHSlOOKUP/005",
			"Unable to create association with SBHSSPLITBILLHSlOOKUP "
					+ "because SBHSSPLITBILLHSlOOKUP is "
					+ "already in use: id=$0");

	/**
	 * Base/SBHSSPLITBILLHSlOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_SBHSSPLITBILLHSlOOKUP_006 = new Message(
			"Base/SBHSSPLITBILLHSlOOKUP/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SBHSSPLITBILLHSlOOKUP/009: Unable to create association because
	 * SBHSSPLITBILLHSlOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_SBHSSPLITBILLHSlOOKUP_009 = new Message(
			"Base/SBHSSPLITBILLHSlOOKUP/009",
			"Unable to create association because SBHSSPLITBILLHSlOOKUP"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SBHSSPLITBILLHSlOOKUP/013: Unable to disassociate
	 * SBHSSPLITBILLHSlOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_SBHSSPLITBILLHSlOOKUP_013 = new Message(
			"Base/SBHSSPLITBILLHSlOOKUP/013",
			"Unable to disassociate because SBHSSPLITBILLHSlOOKUP "
					+ " AAA because this will orphan B: id=$0");

	/**
	 * Base/FTFREEAIRTIMElOOKUP/000: FTFREEAIRTIME does not exist:
	 * FtSubscriberId=$0
	 */
	public static final Message Base_FTFREEAIRTIMElOOKUP_000 = new Message(
			"Base/FTFREEAIRTIMElOOKUP/000",
			"FTFREEAIRTIMElOOKUP does not exist: " + "FtSubscriberId=$0");

	/**
	 * Base/FTFREEAIRTIMElOOKUP/001: Unable to create FTFREEAIRTIME because it
	 * already exists: sbhs_sb_id=$0
	 */
	public static final Message Base_FTFREEAIRTIMElOOKUP_001 = new Message(
			"Base/FTFREEAIRTIMElOOKUP/001",
			"Unable to create FTFREEAIRTIMElOOKUP because it already exists: "
					+ "FtSubscriberId=$0");

	/**
	 * Base/FTFREEAIRTIMElOOKUP/003: Unable to delete FTFREEAIRTIME because it
	 * is in use: sbhs_sb_id=$0
	 */
	public static final Message Base_FTFREEAIRTIMElOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete FTFREEAIRTIMElOOKUP  because it is in use: "
					+ "FtSubscriberId=$0");

	/**
	 * Base/FTFREEAIRTIMElOOKUP/005: Unable to create association with
	 * FTFREEAIRTIMElOOKUP because FTFREEAIRTIMElOOKUP is already in use: id=$0
	 */
	public static final Message Base_FTFREEAIRTIMElOOKUP_005 = new Message(
			"Base/FTFREEAIRTIMElOOKUP/005",
			"Unable to create association with FTFREEAIRTIMElOOKUP "
					+ "because FTFREEAIRTIMElOOKUP is "
					+ "already in use: FtSubscrberId=$0");

	/**
	 * Base/FTFREEAIRTIMElOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_FTFREEAIRTIMElOOKUP_006 = new Message(
			"Base/FTFREEAIRTIMElOOKUP/006",
			"Unable to delete AAA because this will orphan B: FtSubscrberId=$0");

	/**
	 * Base/FTFREEAIRTIMElOOKUP/009: Unable to create association because
	 * FTFREEAIRTIMElOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_FTFREEAIRTIMElOOKUP_009 = new Message(
			"Base/FTFREEAIRTIMElOOKUP/009",
			"Unable to create association because FTFREEAIRTIMElOOKUP"
					+ " is already associated to the child object: FtSubscrberId=$0");

	/**
	 * Base/FTFREEAIRTIMElOOKUP/013: Unable to disassociate FTFREEAIRTIMElOOKUP
	 * AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_FTFREEAIRTIMElOOKUP_013 = new Message(
			"Base/FTFREEAIRTIMElOOKUP/013",
			"Unable to disassociate because FTFREEAIRTIMElOOKUP "
					+ " AAA because this will orphan B: FtSubscrberId=$0");

	/**
	 * Base/FSFREEAIRSERVICElOOKUP/000: FSFREEAIRSERVICE does not exist:
	 * FsServiceCode=$0
	 */
	public static final Message Base_FSFREEAIRSERVICElOOKUP_000 = new Message(
			"Base/FSFREEAIRSERVICElOOKUP/000",
			"FSFREEAIRSERVICElOOKUP does not exist: " + "FsServiceCode=$0");

	/**
	 * Base/FSFREEAIRSERVICElOOKUP/001: Unable to create FSFREEAIRSERVICE
	 * because it already exists: sbhs_sb_id=$0
	 */
	public static final Message Base_FSFREEAIRSERVICElOOKUP_001 = new Message(
			"Base/FSFREEAIRSERVICElOOKUP/001",
			"Unable to create FSFREEAIRSERVICElOOKUP because it already exists: "
					+ "FsServiceCode=$0");

	/**
	 * Base/FSFREEAIRSERVICElOOKUP/003: Unable to delete FSFREEAIRSERVICE
	 * because it is in use: sbhs_sb_id=$0
	 */
	public static final Message Base_FSFREEAIRSERVICElOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete FSFREEAIRSERVICElOOKUP  because it is in use: "
					+ "FsServiceCode=$0");

	/**
	 * Base/FSFREEAIRSERVICElOOKUP/005: Unable to create association with
	 * FSFREEAIRSERVICElOOKUP because FSFREEAIRSERVICElOOKUP is already in use:
	 * id=$0
	 */
	public static final Message Base_FSFREEAIRSERVICElOOKUP_005 = new Message(
			"Base/FSFREEAIRSERVICElOOKUP/005",
			"Unable to create association with FSFREEAIRSERVICElOOKUP "
					+ "because FSFREEAIRSERVICElOOKUP is "
					+ "already in use: FtSubscrberId=$0");

	/**
	 * Base/FSFREEAIRSERVICElOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_FSFREEAIRSERVICElOOKUP_006 = new Message(
			"Base/FSFREEAIRSERVICElOOKUP/006",
			"Unable to delete AAA because this will orphan B: FtSubscrberId=$0");

	/**
	 * Base/FSFREEAIRSERVICElOOKUP/009: Unable to create association because
	 * FSFREEAIRSERVICElOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_FSFREEAIRSERVICElOOKUP_009 = new Message(
			"Base/FSFREEAIRSERVICElOOKUP/009",
			"Unable to create association because FSFREEAIRSERVICElOOKUP"
					+ " is already associated to the child object: FtSubscrberId=$0");

	/**
	 * Base/FSFREEAIRSERVICElOOKUP/013: Unable to disassociate
	 * FSFREEAIRSERVICElOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_FSFREEAIRSERVICElOOKUP_013 = new Message(
			"Base/FSFREEAIRSERVICElOOKUP/013",
			"Unable to disassociate because FSFREEAIRSERVICElOOKUP "
					+ " AAA because this will orphan B: FtSubscrberId=$0");

	/**
	 * Base/SVCSUBVRCCARDlOOKUP/001: Unable to create SVCSUBVRCCARD because it
	 * already exists: sbhs_sb_id=$0
	 */
	public static final Message Base_SVCSUBVRCCARDlOOKUP_001 = new Message(
			"Base/SVCSUBVRCCARDlOOKUP/001",
			"Unable to create SVCSUBVRCCARDlOOKUP because it already exists: "
					+ "SvcMsisdnNo=$0");

	/**
	 * Base/SVCSUBVRCCARDlOOKUP/003: Unable to delete SVCSUBVRCCARD because it
	 * is in use: sbhs_sb_id=$0
	 */
	public static final Message Base_SVCSUBVRCCARDlOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete SVCSUBVRCCARDlOOKUP  because it is in use: "
					+ "SvcMsisdnNo=$0");

	/**
	 * Base/SVCSUBVRCCARDlOOKUP/005: Unable to create association with
	 * SVCSUBVRCCARDlOOKUP because SVCSUBVRCCARDlOOKUP is already in use: id=$0
	 */
	public static final Message Base_SVCSUBVRCCARDlOOKUP_005 = new Message(
			"Base/SVCSUBVRCCARDlOOKUP/005",
			"Unable to create association with SVCSUBVRCCARDlOOKUP "
					+ "because SVCSUBVRCCARDlOOKUP is "
					+ "already in use: SvcMsisdnNo=$0");

	/**
	 * Base/SVCSUBVRCCARDlOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_SVCSUBVRCCARDlOOKUP_006 = new Message(
			"Base/SVCSUBVRCCARDlOOKUP/006",
			"Unable to delete AAA because this will orphan B: SvcMsisdnNo=$0");

	/**
	 * Base/SVCSUBVRCCARDlOOKUP/009: Unable to create association because
	 * SVCSUBVRCCARDlOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_SVCSUBVRCCARDlOOKUP_009 = new Message(
			"Base/SVCSUBVRCCARDlOOKUP/009",
			"Unable to create association because SVCSUBVRCCARDlOOKUP"
					+ " is already associated to the child object: SvcMsisdnNo=$0");

	/**
	 * Base/SVCSUBVRCCARDlOOKUP/013: Unable to disassociate SVCSUBVRCCARDlOOKUP
	 * AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_SVCSUBVRCCARDlOOKUP_013 = new Message(
			"Base/SVCSUBVRCCARDlOOKUP/013",
			"Unable to disassociate because SVCSUBVRCCARDlOOKUP "
					+ " AAA because this will orphan B: SvcMsisdnNo=$0");

	/**
	 * Base/SMQSMSMESGQUEUElOOKUP/000: SMQSMSMESGQUEUE does not exist: SmqId=$0
	 */
	public static final Message Base_SMQSMSMESGQUEUElOOKUP_000 = new Message(
			"Base/SMQSMSMESGQUEUElOOKUP/000",
			"SMQSMSMESGQUEUElOOKUP does not exist: " + "SmqId=$0");

	/**
	 * Base/SMQSMSMESGQUEUElOOKUP/001: Unable to create SMQSMSMESGQUEUE because
	 * it already exists: sbhs_sb_id=$0
	 */
	public static final Message Base_SMQSMSMESGQUEUElOOKUP_001 = new Message(
			"Base/SMQSMSMESGQUEUElOOKUP/001",
			"Unable to create SMQSMSMESGQUEUElOOKUP because it already exists: "
					+ "SmqId=$0");

	/**
	 * Base/SMQSMSMESGQUEUElOOKUP/003: Unable to delete SMQSMSMESGQUEUE because
	 * it is in use: sbhs_sb_id=$0
	 */
	public static final Message Base_SMQSMSMESGQUEUElOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete SMQSMSMESGQUEUElOOKUP  because it is in use: "
					+ "SmqId=$0");

	/**
	 * Base/SMQSMSMESGQUEUElOOKUP/005: Unable to create association with
	 * SMQSMSMESGQUEUElOOKUP because SMQSMSMESGQUEUElOOKUP is already in use:
	 * id=$0
	 */
	public static final Message Base_SMQSMSMESGQUEUElOOKUP_005 = new Message(
			"Base/SMQSMSMESGQUEUElOOKUP/005",
			"Unable to create association with SMQSMSMESGQUEUElOOKUP "
					+ "because SMQSMSMESGQUEUElOOKUP is "
					+ "already in use: SmqId=$0");

	/**
	 * Base/SMQSMSMESGQUEUElOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_SMQSMSMESGQUEUElOOKUP_006 = new Message(
			"Base/SMQSMSMESGQUEUElOOKUP/006",
			"Unable to delete AAA because this will orphan B: SmqId=$0");

	/**
	 * Base/SMQSMSMESGQUEUElOOKUP/009: Unable to create association because
	 * SMQSMSMESGQUEUElOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_SMQSMSMESGQUEUElOOKUP_009 = new Message(
			"Base/SMQSMSMESGQUEUElOOKUP/009",
			"Unable to create association because SMQSMSMESGQUEUElOOKUP"
					+ " is already associated to the child object: SmqId=$0");

	/**
	 * Base/SMQSMSMESGQUEUElOOKUP/013: Unable to disassociate
	 * SMQSMSMESGQUEUElOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_SMQSMSMESGQUEUElOOKUP_013 = new Message(
			"Base/SMQSMSMESGQUEUElOOKUP/013",
			"Unable to disassociate because SMQSMSMESGQUEUElOOKUP "
					+ " AAA because this will orphan B: SmqId=$0");

	/**
	 * Base/SHCSMSHISTCODElOOKUP/000: SHCSMSHISTCODE does not exist:
	 * ShcHistCode=$0
	 */
	public static final Message Base_SHCSMSHISTCODElOOKUP_000 = new Message(
			"Base/SHCSMSHISTCODElOOKUP/000",
			"SHCSMSHISTCODElOOKUP does not exist: " + "ShcHistCode=$0");

	/**
	 * Base/SHCSMSHISTCODElOOKUP/001: Unable to create SHCSMSHISTCODE because it
	 * already exists: sbhs_sb_id=$0
	 */
	public static final Message Base_SHCSMSHISTCODElOOKUP_001 = new Message(
			"Base/SHCSMSHISTCODElOOKUP/001",
			"Unable to create SHCSMSHISTCODElOOKUP because it already exists: "
					+ "ShcHistCode=$0");

	/**
	 * Base/SHCSMSHISTCODElOOKUP/003: Unable to delete SHCSMSHISTCODE because it
	 * is in use: sbhs_sb_id=$0
	 */
	public static final Message Base_SHCSMSHISTCODElOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete SHCSMSHISTCODElOOKUP  because it is in use: "
					+ "ShcHistCode=$0");

	/**
	 * Base/SHCSMSHISTCODElOOKUP/005: Unable to create association with
	 * SHCSMSHISTCODElOOKUP because SHCSMSHISTCODElOOKUP is already in use:
	 * id=$0
	 */
	public static final Message Base_SHCSMSHISTCODElOOKUP_005 = new Message(
			"Base/SHCSMSHISTCODElOOKUP/005",
			"Unable to create association with SHCSMSHISTCODElOOKUP "
					+ "because SHCSMSHISTCODElOOKUP is "
					+ "already in use: ShcHistCode=$0");

	/**
	 * Base/SHCSMSHISTCODElOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_SHCSMSHISTCODElOOKUP_006 = new Message(
			"Base/SHCSMSHISTCODElOOKUP/006",
			"Unable to delete AAA because this will orphan B: ShcHistCode=$0");

	/**
	 * Base/SHCSMSHISTCODElOOKUP/009: Unable to create association because
	 * SHCSMSHISTCODElOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_SHCSMSHISTCODElOOKUP_009 = new Message(
			"Base/SHCSMSHISTCODElOOKUP/009",
			"Unable to create association because SHCSMSHISTCODElOOKUP"
					+ " is already associated to the child object: ShcHistCode=$0");

	/**
	 * Base/SHCSMSHISTCODElOOKUP/013: Unable to disassociate
	 * SHCSMSHISTCODElOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_SHCSMSHISTCODElOOKUP_013 = new Message(
			"Base/SHCSMSHISTCODElOOKUP/013",
			"Unable to disassociate because SHCSMSHISTCODElOOKUP "
					+ " AAA because this will orphan B: ShcHistCode=$0");

	/**
	 * Base/FDFIELDDEFlOOKUP/000: FDFIELDDEF does not exist: ShcHistCode=$0
	 */
	public static final Message Base_FDFIELDDEFlOOKUP_000 = new Message(
			"Base/FDFIELDDEFlOOKUP/000", "FDFIELDDEFlOOKUP does not exist: "
					+ "ShcHistCode=$0");

	/**
	 * Base/FDFIELDDEFlOOKUP/001: Unable to create FDFIELDDEF because it already
	 * exists: sbhs_sb_id=$0
	 */
	public static final Message Base_FDFIELDDEFlOOKUP_001 = new Message(
			"Base/FDFIELDDEFlOOKUP/001",
			"Unable to create FDFIELDDEFlOOKUP because it already exists: "
					+ "ShcHistCode=$0");

	/**
	 * Base/FDFIELDDEFlOOKUP/003: Unable to delete FDFIELDDEF because it is in
	 * use: sbhs_sb_id=$0
	 */
	public static final Message Base_FDFIELDDEFlOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete FDFIELDDEFlOOKUP  because it is in use: "
					+ "ShcHistCode=$0");

	/**
	 * Base/FDFIELDDEFlOOKUP/005: Unable to create association with
	 * FDFIELDDEFlOOKUP because FDFIELDDEFlOOKUP is already in use: id=$0
	 */
	public static final Message Base_FDFIELDDEFlOOKUP_005 = new Message(
			"Base/FDFIELDDEFlOOKUP/005",
			"Unable to create association with FDFIELDDEFlOOKUP "
					+ "because FDFIELDDEFlOOKUP is "
					+ "already in use: ShcHistCode=$0");

	/**
	 * Base/FDFIELDDEFlOOKUP/006: Unable to delete AAA because this will orphan
	 * B: id=$0
	 */
	public static final Message Base_FDFIELDDEFlOOKUP_006 = new Message(
			"Base/FDFIELDDEFlOOKUP/006",
			"Unable to delete AAA because this will orphan B: ShcHistCode=$0");

	/**
	 * Base/FDFIELDDEFlOOKUP/009: Unable to create association because
	 * FDFIELDDEFlOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_FDFIELDDEFlOOKUP_009 = new Message(
			"Base/FDFIELDDEFlOOKUP/009",
			"Unable to create association because FDFIELDDEFlOOKUP"
					+ " is already associated to the child object: ShcHistCode=$0");

	/**
	 * Base/FDFIELDDEFlOOKUP/013: Unable to disassociate FDFIELDDEFlOOKUP AAA
	 * because this will orphan B: id=$0" );
	 */
	public static final Message Base_FDFIELDDEFlOOKUP_013 = new Message(
			"Base/FDFIELDDEFlOOKUP/013",
			"Unable to disassociate because FDFIELDDEFlOOKUP "
					+ " AAA because this will orphan B: ShcHistCode=$0");

	/**
	 * Base/VCFVRBLECHRGFEElOOKUP/000: VCFVRBLECHRGFEE does not exist:
	 * ShcHistCode=$0
	 */
	public static final Message Base_VCFVRBLECHRGFEElOOKUP_000 = new Message(
			"Base/VCFVRBLECHRGFEElOOKUP/000",
			"VCFVRBLECHRGFEElOOKUP does not exist: " + "VCF_EQUIP_ID=$0");

	/**
	 * Base/VCFVRBLECHRGFEElOOKUP/001: Unable to create VCFVRBLECHRGFEE because
	 * it already exists: sbhs_sb_id=$0
	 */
	public static final Message Base_VCFVRBLECHRGFEElOOKUP_001 = new Message(
			"Base/VCFVRBLECHRGFEElOOKUP/001",
			"Unable to create VCFVRBLECHRGFEElOOKUP because it already exists: "
					+ "VCF_EQUIP_ID=$0");

	/**
	 * Base/VCFVRBLECHRGFEElOOKUP/003: Unable to delete VCFVRBLECHRGFEE because
	 * it is in use: sbhs_sb_id=$0
	 */
	public static final Message Base_VCFVRBLECHRGFEElOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete VCFVRBLECHRGFEElOOKUP  because it is in use: "
					+ "VCF_EQUIP_ID=$0");

	/**
	 * Base/VCFVRBLECHRGFEElOOKUP/005: Unable to create association with
	 * VCFVRBLECHRGFEElOOKUP because VCFVRBLECHRGFEElOOKUP is already in use:
	 * id=$0
	 */
	public static final Message Base_VCFVRBLECHRGFEElOOKUP_005 = new Message(
			"Base/VCFVRBLECHRGFEElOOKUP/005",
			"Unable to create association with VCFVRBLECHRGFEElOOKUP "
					+ "because VCFVRBLECHRGFEElOOKUP is "
					+ "already in use: VCF_EQUIP_ID=$0");

	/**
	 * Base/VCFVRBLECHRGFEElOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_VCFVRBLECHRGFEElOOKUP_006 = new Message(
			"Base/VCFVRBLECHRGFEElOOKUP/006",
			"Unable to delete AAA because this will orphan B: VCF_EQUIP_ID=$0");

	/**
	 * Base/VCFVRBLECHRGFEElOOKUP/009: Unable to create association because
	 * VCFVRBLECHRGFEElOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_VCFVRBLECHRGFEElOOKUP_009 = new Message(
			"Base/VCFVRBLECHRGFEElOOKUP/009",
			"Unable to create association because VCFVRBLECHRGFEElOOKUP"
					+ " is already associated to the child object: VCF_EQUIP_ID=$0");

	/**
	 * Base/VCFVRBLECHRGFEElOOKUP/013: Unable to disassociate
	 * VCFVRBLECHRGFEElOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_VCFVRBLECHRGFEElOOKUP_013 = new Message(
			"Base/VCFVRBLECHRGFEElOOKUP/013",
			"Unable to disassociate because VCFVRBLECHRGFEElOOKUP "
					+ " AAA because this will orphan B: VCF_EQUIP_ID=$0");

	/**
	 * Base/SSRSELFSERVRECURRlOOKUP/000: SSRSELFSERVRECURR does not exist:
	 * ShcHistCode=$0
	 */
	public static final Message Base_SSRSELFSERVRECURRlOOKUP_000 = new Message(
			"Base/SSRSELFSERVRECURRlOOKUP/000",
			"SSRSELFSERVRECURRlOOKUP does not exist: " + "SSR_MSISDN_NO=$0");

	/**
	 * Base/SSRSELFSERVRECURRlOOKUP/001: Unable to create SSRSELFSERVRECURR
	 * because it already exists: ssr_msisdn_no=$0
	 */
	public static final Message Base_SSRSELFSERVRECURRlOOKUP_001 = new Message(
			"Base/SSRSELFSERVRECURRlOOKUP/001",
			"Unable to create SSRSELFSERVRECURRlOOKUP because it already exists: "
					+ "ssr_msisdn_no=$0");

	/**
	 * Base/SSRSELFSERVRECURRlOOKUP/003: Unable to delete SSRSELFSERVRECURR
	 * because it is in use: ssr_msisdn_no=$0
	 */
	public static final Message Base_SSRSELFSERVRECURRlOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete SSRSELFSERVRECURRlOOKUP  because it is in use: "
					+ "ssr_msisdn_no=$0");

	/**
	 * Base/SSRSELFSERVRECURRlOOKUP/005: Unable to create association with
	 * SSRSELFSERVRECURRlOOKUP because SSRSELFSERVRECURRlOOKUP is already in
	 * use: id=$0
	 */
	public static final Message Base_SSRSELFSERVRECURRlOOKUP_005 = new Message(
			"Base/SSRSELFSERVRECURRlOOKUP/005",
			"Unable to create association with SSRSELFSERVRECURRlOOKUP "
					+ "because SSRSELFSERVRECURRlOOKUP is "
					+ "already in use: ssr_msisdn_no=$0");

	/**
	 * Base/SSRSELFSERVRECURRlOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_SSRSELFSERVRECURRlOOKUP_006 = new Message(
			"Base/SSRSELFSERVRECURRlOOKUP/006",
			"Unable to delete AAA because this will orphan B: ssr_msisdn_no=$0");

	/**
	 * Base/SSRSELFSERVRECURRlOOKUP/009: Unable to create association because
	 * SSRSELFSERVRECURRlOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_SSRSELFSERVRECURRlOOKUP_009 = new Message(
			"Base/SSRSELFSERVRECURRlOOKUP/009",
			"Unable to create association because SSRSELFSERVRECURRlOOKUP"
					+ " is already associated to the child object: ssr_msisdn_no=$0");

	/**
	 * Base/SSRSELFSERVRECURRlOOKUP/013: Unable to disassociate
	 * SSRSELFSERVRECURRlOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_SSRSELFSERVRECURRlOOKUP_013 = new Message(
			"Base/SSRSELFSERVRECURRlOOKUP/013",
			"Unable to disassociate because SSRSELFSERVRECURRlOOKUP "
					+ " AAA because this will orphan B: ssr_msisdn_no=$0");

	/**
	 * Base/PFUPOCUSAGElOOKUP/000: PFUPOCUSAGE does not exist:
	 * ShcHistCode=$0
	 */
	public static final Message Base_PFUPOCUSAGElOOKUP_000 = new Message(
			"Base/PFUPOCUSAGElOOKUP/000",
			"PFUPOCUSAGElOOKUP does not exist: " + "PFU_SERIAL_ID=$0");

	/**
	 * Base/PFUPOCUSAGElOOKUP/001: Unable to create PFUPOCUSAGE
	 * because it already exists: ssr_msisdn_no=$0
	 */
	public static final Message Base_PFUPOCUSAGElOOKUP_001 = new Message(
			"Base/PFUPOCUSAGElOOKUP/001",
			"Unable to create PFUPOCUSAGElOOKUP because it already exists: "
					+ "PFU_SERIAL_ID=$0");

	/**
	 * Base/PFUPOCUSAGElOOKUP/003: Unable to delete PFUPOCUSAGE
	 * because it is in use: ssr_msisdn_no=$0
	 */
	public static final Message Base_PFUPOCUSAGElOOKUP_003 = new Message(
			"Base/ActAccTypes/003",
			"Unable to delete PFUPOCUSAGElOOKUP  because it is in use: "
					+ "PFU_SERIAL_ID=$0");

	/**
	 * Base/PFUPOCUSAGElOOKUP/005: Unable to create association with
	 * PFUPOCUSAGElOOKUP because PFUPOCUSAGElOOKUP is already in
	 * use: id=$0
	 */
	public static final Message Base_PFUPOCUSAGElOOKUP_005 = new Message(
			"Base/PFUPOCUSAGElOOKUP/005",
			"Unable to create association with PFUPOCUSAGElOOKUP "
					+ "because PFUPOCUSAGElOOKUP is "
					+ "already in use: PFU_SERIAL_ID=$0");

	/**
	 * Base/PFUPOCUSAGElOOKUP/006: Unable to delete AAA because this will
	 * orphan B: id=$0
	 */
	public static final Message Base_PFUPOCUSAGElOOKUP_006 = new Message(
			"Base/PFUPOCUSAGElOOKUP/006",
			"Unable to delete AAA because this will orphan B: PFU_SERIAL_ID=$0");

	/**
	 * Base/PFUPOCUSAGElOOKUP/009: Unable to create association because
	 * PFUPOCUSAGElOOKUP is already associated to the child object: id=$0
	 */
	public static final Message Base_PFUPOCUSAGElOOKUP_009 = new Message(
			"Base/PFUPOCUSAGElOOKUP/009",
			"Unable to create association because PFUPOCUSAGElOOKUP"
					+ " is already associated to the child object: PFU_SERIAL_ID=$0");

	/**
	 * Base/PFUPOCUSAGElOOKUP/013: Unable to disassociate
	 * PFUPOCUSAGElOOKUP AAA because this will orphan B: id=$0" );
	 */
	public static final Message Base_PFUPOCUSAGElOOKUP_013 = new Message(
			"Base/PFUPOCUSAGElOOKUP/013",
			"Unable to disassociate because PFUPOCUSAGElOOKUP "
					+ " AAA because this will orphan B: PFU_SERIAL_ID=$0");
	
	
	/**
	 * Base/SBESUBEQUIP/000: SbeSubEquip does not exist: sbeSubEquipId=$0
	 */
	public static final Message Base_SBESUBEQUIP_000 = new Message(
			"Base/SBESUBEQUIP/000", "SbeSubEquip does not exist: "
					+ "sbeSubEquipId=$0");

	/**
	 * Base/SBESUBEQUIP/001: Unable to create SbeSubEquip because it already
	 * exists: sbeSubEquipId=$0
	 */
	public static final Message Base_SBESUBEQUIP_001 = new Message(
			"Base/SBESUBEQUIP/001",
			"Unable to create SbeSubEquip because it already exists: "
					+ "sbeSubEquipId=$0");

	/**
	 * Base/SBESUBEQUIP/003: Unable to delete SbeSubEquip because it is in use:
	 * sbeSubEquipId=$0
	 */
	public static final Message Base_SBESUBEQUIP_003 = new Message(
			"Base/SbeSubEquip/003",
			"Unable to delete SbeSubEquip  because it is in use: "
					+ "sbeSubEquipId=$0");

	/**
	 * Base/SBESUBEQUIP/005: Unable to create association with SBESUBEQUIP
	 * because SBESUBEQUIP is already in use: id=$0
	 */
	public static final Message Base_SBESUBEQUIP_005 = new Message(
			"Base/SBESUBEQUIP/005",
			"Unable to create association with SBESUBEQUIP "
					+ "because SBESUBEQUIP is " + "already in use: id=$0");

	/**
	 * Base/SBESUBEQUIP/006: Unable to delete AAA because this will orphan B:
	 * id=$0
	 */
	public static final Message Base_SBESUBEQUIP_006 = new Message(
			"Base/SBESUBEQUIP/006",
			"Unable to delete AAA because this will orphan B: id=$0");

	/**
	 * Base/SBESUBEQUIP/009: Unable to create association because SBESUBEQUIP is
	 * already associated to the child object: id=$0
	 */
	public static final Message Base_SBESUBEQUIP_009 = new Message(
			"Base/SBESUBEQUIP/009",
			"Unable to create association because SBESUBEQUIP"
					+ " is already associated to the child object: id=$0");

	/**
	 * Base/SBESUBEQUIP/013: Unable to disassociate SBESUBEQUIP AAA because this
	 * will orphan B: id=$0" );
	 */
	public static final Message Base_SBESUBEQUIP_013 = new Message(
			"Base/SBESUBEQUIP/013",
			"Unable to disassociate because SBESUBEQUIP "
					+ " AAA because this will orphan B: id=$0");
	

		/**
		 * Base/PswPrepaidSwap/000: pswPrepaidSwap does not exist: pswSubscriberId=$0
		 */
		public static final Message Base_PswPrepaidSwap_000 = new Message(
				"Base/PswPrepaidSwap/000", "pswPrepaidSwap does not exist: "
						+ "pswSubscriberId=$0");

		/**
		 * Base/PswPrepaidSwap/001: Unable to create pswPrepaidSwap because it already
		 * exists: pswSubscriberId=$0
		 */
		public static final Message Base_PswPrepaidSwap_001 = new Message(
				"Base/PswPrepaidSwap/001",
				"Unable to create pswPrepaidSwap because it already exists: "
						+ "pswSubscriberId=$0");

		/**
		 * Base/PswPrepaidSwap/003: Unable to delete pswPrepaidSwap because it is in use:
		 * pswSubscriberId=$0
		 */
		public static final Message Base_PswPrepaidSwap_003 = new Message(
				"Base/pswPrepaidSwap/003",
				"Unable to delete pswPrepaidSwap  because it is in use: "
						+ "pswSubscriberId=$0");

		/**
		 * Base/PswPrepaidSwap/005: Unable to create association with PswPrepaidSwap
		 * because PswPrepaidSwap is already in use: id=$0
		 */
		public static final Message Base_PswPrepaidSwap_005 = new Message(
				"Base/PswPrepaidSwap/005",
				"Unable to create association with PswPrepaidSwap "
						+ "because PswPrepaidSwap is " + "already in use: id=$0");

		/**
		 * Base/PswPrepaidSwap/006: Unable to delete AAA because this will orphan B:
		 * id=$0
		 */
		public static final Message Base_PswPrepaidSwap_006 = new Message(
				"Base/PswPrepaidSwap/006",
				"Unable to delete AAA because this will orphan B: id=$0");

		/**
		 * Base/PswPrepaidSwap/009: Unable to create association because PswPrepaidSwap is
		 * already associated to the child object: id=$0
		 */
		public static final Message Base_PswPrepaidSwap_009 = new Message(
				"Base/PswPrepaidSwap/009",
				"Unable to create association because PswPrepaidSwap"
						+ " is already associated to the child object: id=$0");

		/**
		 * Base/PswPrepaidSwap/013: Unable to disassociate PswPrepaidSwap AAA because this
		 * will orphan B: id=$0" );
		 */
		public static final Message Base_PswPrepaidSwap_013 = new Message(
				"Base/PswPrepaidSwap/013",
				"Unable to disassociate because PswPrepaidSwap "
						+ " AAA because this will orphan B: id=$0");


		/**
		 * Base/EMQMESSAGEQUE/000: EMQMESSAGEQUE does not exist: emqSerial=$0
		 */
		public static final Message Base_EMQMESSAGEQUE_000 = new Message(
				"Base/EMQMESSAGEQUE/000", "EMQMESSAGEQUE does not exist: "
						+ "emqSerial=$0");

		/**
		 * Base/EMQMESSAGEQUE/001: Unable to create EMQMESSAGEQUE because it already
		 * exists: emqSerial=$0
		 */
		public static final Message Base_EMQMESSAGEQUE_001 = new Message(
				"Base/EMQMESSAGEQUE/001",
				"Unable to create EMQMESSAGEQUE because it already exists: "
						+ "emqSerial=$0");

		/**
		 * Base/EMQMESSAGEQUE/003: Unable to delete EMQMESSAGEQUE because it is in use:
		 * emqSerial=$0
		 */
		public static final Message Base_EMQMESSAGEQUE_003 = new Message(
				"Base/EMQMESSAGEQUE/003",
				"Unable to delete EMQMESSAGEQUE  because it is in use: "
						+ "emqSerial=$0");

		/**
		 * Base/EMQMESSAGEQUE/005: Unable to create association with EMQMESSAGEQUE
		 * because EMQMESSAGEQUE is already in use: id=$0
		 */
		public static final Message Base_EMQMESSAGEQUE_005 = new Message(
				"Base/EMQMESSAGEQUE/005",
				"Unable to create association with EMQMESSAGEQUE "
						+ "because EMQMESSAGEQUE is " + "already in use: id=$0");

		/**
		 * Base/EMQMESSAGEQUE/006: Unable to delete AAA because this will orphan B:
		 * id=$0
		 */
		public static final Message Base_EMQMESSAGEQUE_006 = new Message(
				"Base/EMQMESSAGEQUE/006",
				"Unable to delete AAA because this will orphan B: id=$0");

		/**
		 * Base/EMQMESSAGEQUE/009: Unable to create association because EMQMESSAGEQUE is
		 * already associated to the child object: id=$0
		 */
		public static final Message Base_EMQMESSAGEQUE_009 = new Message(
				"Base/EMQMESSAGEQUE/009",
				"Unable to create association because EMQMESSAGEQUE"
						+ " is already associated to the child object: id=$0");

		/**
		 * Base/EMQMESSAGEQUE/013: Unable to disassociate EMQMESSAGEQUE AAA because this
		 * will orphan B: id=$0" );
		 */
		public static final Message Base_EMQMESSAGEQUE_013 = new Message(
				"Base/EMQMESSAGEQUE/013",
				"Unable to disassociate because EMQMESSAGEQUE "
						+ " AAA because this will orphan B: id=$0");
		
		/**
		 * Base/MBMMAILBATCHMON/000: MBMMAILBATCHMON does not exist: mbmId=$0
		 */
		public static final Message Base_MBMMAILBATCHMON_000 = new Message(
				"Base/MBMMAILBATCHMON/000", "MBMMAILBATCHMON does not exist: "
						+ "mbmId=$0");

		/**
		 * Base/MBMMAILBATCHMON/001: Unable to create MBMMAILBATCHMON because it already
		 * exists: mbmId=$0
		 */
		public static final Message Base_MBMMAILBATCHMON_001 = new Message(
				"Base/MBMMAILBATCHMON/001",
				"Unable to create MBMMAILBATCHMON because it already exists: "
						+ "mbmId=$0");

		/**
		 * Base/MBMMAILBATCHMON/003: Unable to delete MBMMAILBATCHMON because it is in use:
		 * mbmId=$0
		 */
		public static final Message Base_MBMMAILBATCHMON_003 = new Message(
				"Base/MBMMAILBATCHMON/003",
				"Unable to delete MBMMAILBATCHMON  because it is in use: "
						+ "mbmId=$0");

		/**
		 * Base/MBMMAILBATCHMON/005: Unable to create association with MBMMAILBATCHMON
		 * because MBMMAILBATCHMON is already in use: id=$0
		 */
		public static final Message Base_MBMMAILBATCHMON_005 = new Message(
				"Base/MBMMAILBATCHMON/005",
				"Unable to create association with MBMMAILBATCHMON "
						+ "because MBMMAILBATCHMON is " + "already in use: id=$0");

		/**
		 * Base/MBMMAILBATCHMON/006: Unable to delete AAA because this will orphan B:
		 * id=$0
		 */
		public static final Message Base_MBMMAILBATCHMON_006 = new Message(
				"Base/MBMMAILBATCHMON/006",
				"Unable to delete AAA because this will orphan B: id=$0");

		/**
		 * Base/MBMMAILBATCHMON/009: Unable to create association because MBMMAILBATCHMON is
		 * already associated to the child object: id=$0
		 */
		public static final Message Base_MBMMAILBATCHMON_009 = new Message(
				"Base/MBMMAILBATCHMON/009",
				"Unable to create association because MBMMAILBATCHMON"
						+ " is already associated to the child object: id=$0");

		/**
		 * Base/MBMMAILBATCHMON/013: Unable to disassociate MBMMAILBATCHMON AAA because this
		 * will orphan B: id=$0" );
		 */
		public static final Message Base_MBMMAILBATCHMON_013 = new Message(
				"Base/MBMMAILBATCHMON/013",
				"Unable to disassociate because MBMMAILBATCHMON "
						+ " AAA because this will orphan B: id=$0");
		
		/**
		 * Base/EMAMESSAGEARCHIVE/000: EMAMESSAGEARCHIVE does not exist: EmaSerial=$0
		 */
		public static final Message Base_EMAMESSAGEARCHIVE_000 = new Message(
				"Base/EMAMESSAGEARCHIVE/000", "EMAMESSAGEARCHIVE does not exist: "
						+ "EmaSerial=$0");

		/**
		 * Base/EMAMESSAGEARCHIVE/001: Unable to create EMAMESSAGEARCHIVE because it already
		 * exists: EmaSerial=$0
		 */
		public static final Message Base_EMAMESSAGEARCHIVE_001 = new Message(
				"Base/EMAMESSAGEARCHIVE/001",
				"Unable to create EMAMESSAGEARCHIVE because it already exists: "
						+ "EmaSerial=$0");

		/**
		 * Base/EMAMESSAGEARCHIVE/003: Unable to delete EMAMESSAGEARCHIVE because it is in use:
		 * EmaSerial=$0
		 */
		public static final Message Base_EMAMESSAGEARCHIVE_003 = new Message(
				"Base/EMAMESSAGEARCHIVE/003",
				"Unable to delete EMAMESSAGEARCHIVE  because it is in use: "
						+ "EmaSerial=$0");

		/**
		 * Base/EMAMESSAGEARCHIVE/005: Unable to create association with EMAMESSAGEARCHIVE
		 * because EMAMESSAGEARCHIVE is already in use: id=$0
		 */
		public static final Message Base_EMAMESSAGEARCHIVE_005 = new Message(
				"Base/EMAMESSAGEARCHIVE/005",
				"Unable to create association with EMAMESSAGEARCHIVE "
						+ "because EMAMESSAGEARCHIVE is " + "already in use: id=$0");

		/**
		 * Base/EMAMESSAGEARCHIVE/006: Unable to delete AAA because this will orphan B:
		 * id=$0
		 */
		public static final Message Base_EMAMESSAGEARCHIVE_006 = new Message(
				"Base/EMAMESSAGEARCHIVE/006",
				"Unable to delete AAA because this will orphan B: id=$0");

		/**
		 * Base/EMAMESSAGEARCHIVE/009: Unable to create association because EMAMESSAGEARCHIVE is
		 * already associated to the child object: id=$0
		 */
		public static final Message Base_EMAMESSAGEARCHIVE_009 = new Message(
				"Base/EMAMESSAGEARCHIVE/009",
				"Unable to create association because EMAMESSAGEARCHIVE"
						+ " is already associated to the child object: id=$0");

		/**
		 * Base/EMAMESSAGEARCHIVE/013: Unable to disassociate EMAMESSAGEARCHIVE AAA because this
		 * will orphan B: id=$0" );
		 */
		public static final Message Base_EMAMESSAGEARCHIVE_013 = new Message(
				"Base/EMAMESSAGEARCHIVE/013",
				"Unable to disassociate because EMAMESSAGEARCHIVE "
						+ " AAA because this will orphan B: id=$0");
		
		/**
		 * Base/CRBACUSTRISKAUX/000: CRBACUSTRISKAUX does not exist: crbaBillAcNo=$0
		 */
		public static final Message Base_CRBACUSTRISKAUX_000 = new Message(
				"Base/CRBACUSTRISKAUX/000", "CRBACUSTRISKAUX does not exist: "
						+ "crbaBillAcNo=$0");

		/**
		 * Base/CRBACUSTRISKAUX/001: Unable to create CRBACUSTRISKAUX because it already
		 * exists: crbaBillAcNo=$0
		 */
		public static final Message Base_CRBACUSTRISKAUX_001 = new Message(
				"Base/CRBACUSTRISKAUX/001",
				"Unable to create CRBACUSTRISKAUX because it already exists: "
						+ "crbaBillAcNo=$0");

		/**
		 * Base/CRBACUSTRISKAUX/003: Unable to delete CRBACUSTRISKAUX because it is in use:
		 * crbaBillAcNo=$0
		 */
		public static final Message Base_CRBACUSTRISKAUX_003 = new Message(
				"Base/CRBACUSTRISKAUX/003",
				"Unable to delete CRBACUSTRISKAUX  because it is in use: "
						+ "crbaBillAcNo=$0");

		/**
		 * Base/CRBACUSTRISKAUX/005: Unable to create association with CRBACUSTRISKAUX
		 * because CRBACUSTRISKAUX is already in use: id=$0
		 */
		public static final Message Base_CRBACUSTRISKAUX_005 = new Message(
				"Base/CRBACUSTRISKAUX/005",
				"Unable to create association with CRBACUSTRISKAUX "
						+ "because CRBACUSTRISKAUX is " + "already in use: id=$0");

		/**
		 * Base/CRBACUSTRISKAUX/006: Unable to delete AAA because this will orphan B:
		 * id=$0
		 */
		public static final Message Base_CRBACUSTRISKAUX_006 = new Message(
				"Base/CRBACUSTRISKAUX/006",
				"Unable to delete AAA because this will orphan B: id=$0");

		/**
		 * Base/CRBACUSTRISKAUX/009: Unable to create association because CRBACUSTRISKAUX is
		 * already associated to the child object: id=$0
		 */
		public static final Message Base_CRBACUSTRISKAUX_009 = new Message(
				"Base/CRBACUSTRISKAUX/009",
				"Unable to create association because CRBACUSTRISKAUX"
						+ " is already associated to the child object: id=$0");

		/**
		 * Base/CRBACUSTRISKAUX/013: Unable to disassociate CRBACUSTRISKAUX AAA because this
		 * will orphan B: id=$0" );
		 */
		public static final Message Base_CRBACUSTRISKAUX_013 = new Message(
				"Base/CRBACUSTRISKAUX/013",
				"Unable to disassociate because CRBACUSTRISKAUX "
						+ " AAA because this will orphan B: id=$0");


}
