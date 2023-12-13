package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**
 * ----------------------------------------------------------------------------
 * ------------------
 * 
 * Version control details:
 * 
 * @version $Revision: $
 * @author $Author: $
 *         ------------------------------------------------------------
 *         ----------------------------------
 */

public class DpfDefPocFolderDMO extends DBO implements Serializable {

	// ~ Static variables/initializers
	// //////////////////////////////////////////

	// ---------------------
	// Field type declarations
	// ---------------------
	/**
	 * Defines the internal behaviour of the fields so the internal layers can
	 * manipulate them without needing to introspect them. The order of the
	 * fields in the definition must match the actual order in this DMO.
	 */
	private static final int[] fieldTypes = new int[] { 
			FIELD_TYPE_STRING /* std public attribute: dpf_eh_id*/,
			FIELD_TYPE_STRING /* std public attribute: dpf_name */,
			FIELD_TYPE_INTEGER /* std public attribute: dpf_folder_id */,
			FIELD_TYPE_STRING /* std public attribute: dpf_status */,
			FIELD_TYPE_DATEONLY /* std public attribute: dpf_creation_date */,
			FIELD_TYPE_DATEONLY /* std public attribute: dpf_connect_date */,
			FIELD_TYPE_STRING /* std public attribute: dpf_n2n_folder */,
			FIELD_TYPE_STRING /* std public attribute: dpf_msisdn_no */,
			FIELD_TYPE_STRING /* std public attribute: dpf_sim_no */,
			FIELD_TYPE_STRING /* std public attribute: dpf_product */,
			FIELD_TYPE_STRING /* std public attribute: dpf_reverse_bill */
	};

	/**
	 * TODO SJ Implement the array of field sizes Not implemented as it is not a
	 * MTN table
	 */
	private final int[] fieldSizes = new int[] {
			dpfEhIdSize,
			dpfNameSize,
			0,
			dpfStatusSize,
			0,
			0,
			dpfN2nFolderSize,
			dpfMsisdnNoSize,
			dpfSimNoSize,
			dpfProductSize,
			dpfReverseBillSize
	};

	public int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfEhIdFilter = 0; // filter index
	private static final int dpfEhIdSize = 2; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfNameFilter = 1; // filter index
	private static final int dpfNameSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfFolderIdFilter = 2; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfStatusFilter = 3; // filter index
	private static final int dpfStatusSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfCreationDateFilter = 4; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfConnectDateFilter = 5; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfN2nFolderFilter = 6; // filter index
	private static final int dpfN2nFolderSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfMsisdnNoFilter = 7; // filter index
	private static final int dpfMsisdnNoSize = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfSimNoFilter = 8; // filter index
	private static final int dpfSimNoSize = 14; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfProductFilter = 9; // filter index
	private static final int dpfProductSize = 7; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dpfReverseBillFilter = 10; // filter index
	private static final int dpfReverseBillSize = 1; // field size
	// ~ Instance variables
	// /////////////////////////////////////////////////////

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private String dpfEhId;
	private String dpfName;
	private Integer dpfFolderId;
	private String dpfStatus;
	private Date dpfCreationDate;
	private Date dpfConnectDate;
	private String dpfN2nFolder; // Loaded from Schema
	private String dpfMsisdnNo; // Loaded from Schema
	private String dpfSimNo; // Loaded from Schema
	private String dpfProduct; // Loaded from Schema
	private String dpfReverseBill; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new CuhCustomerHistoryDMO object.
	 */
	public DpfDefPocFolderDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new CuhCustomerHistoryDMO object.
	 * 
	 * @param dpfEhId
	 *            DOCUMENT ME!
	 * @param dpfName
	 *            DOCUMENT ME!
	 * @param dpfFolderId
	 *            DOCUMENT ME!
	 * @param dpfStatus
	 *            DOCUMENT ME!
	 * @param dpfCreationDate
	 *            DOCUMENT ME!
	 * @param dpfConnectDate
	 *            DOCUMENT ME!
	 * @param dpfN2nFolder
	 *            DOCUMENT ME!
	 * @param dpfMsisdnNo
	 *            DOCUMENT ME!
	 * @param dpfSimNo
	 *            DOCUMENT ME!
	 * @param dpfProduct
	 *            DOCUMENT ME!
	 * @param dpfReverseBill
	 *            DOCUMENT ME!
	 */
	public DpfDefPocFolderDMO(final String dpfEhId, final String dpfName,
			final Integer dpfFolderId, final String dpfStatus,
			final Date dpfCreationDate, final Date dpfConnectDate,
			final String dpfN2nFolder, final String dpfMsisdnNo,
			final String dpfSimNo, final String dpfProduct,
			final String dpfReverseBill) {

		this.dpfEhId = dpfEhId;
		this.dpfName = dpfName;
		this.dpfFolderId = dpfFolderId;
		this.dpfStatus = dpfStatus;
		this.dpfCreationDate = (dpfCreationDate != null) ? new Date(
				dpfCreationDate) : null;
		this.dpfConnectDate = (dpfConnectDate != null) ? new Date(
				dpfConnectDate) : null;
		this.dpfN2nFolder = dpfN2nFolder;
		this.dpfMsisdnNo = dpfMsisdnNo;
		this.dpfSimNo = dpfSimNo;
		this.dpfProduct = dpfProduct;
		this.dpfReverseBill = dpfReverseBill;
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	// DBO method implementations
	// ////////////////////////////////////////////////

	/**
	 * Not used by this class.
	 * 
	 */
	protected void generatedKey(final Integer key) {
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected Integer versionNumber() {
		return null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param recordVersion
	 *            DOCUMENT ME!
	 */
	protected void versionNumber(final Integer recordVersion) {
	}

	// DMO method implementations
	// ////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected DAOArgs primaryKey() {
		return new DAOArgs(1).arg((this.dpfFolderId == null) ? null: this.getDpfFolderId());
	}

	// methods for concrete classes follow...
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected int[] fieldTypes() {
		return fieldTypes;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	 protected Object[] get() {
		return new Object[] {
				(dpfEhId == null) ? null
						: ((dpfEhId.length() <= dpfEhIdSize) ? dpfEhId
								: dpfEhId.substring(0, dpfEhIdSize)),
				(dpfName == null) ? null
						: ((dpfName.length() <= dpfNameSize) ? dpfName
								: dpfName.substring(0, dpfNameSize)),
				dpfFolderId,
				(dpfStatus == null) ? null
						: ((dpfStatus.length() <= dpfStatusSize) ? dpfStatus
								: dpfStatus.substring(0, dpfStatusSize)),
				dpfCreationDate,
				dpfConnectDate,
				(dpfN2nFolder == null) ? null
						: ((dpfN2nFolder.length() <= dpfN2nFolderSize) ? dpfN2nFolder
								: dpfN2nFolder.substring(0, dpfN2nFolderSize)),
				(dpfMsisdnNo == null) ? null
						: ((dpfMsisdnNo.length() <= dpfMsisdnNoSize) ? dpfMsisdnNo
								: dpfMsisdnNo.substring(0, dpfMsisdnNoSize)),
				(dpfSimNo == null) ? null
						: ((dpfSimNo.length() <= dpfSimNoSize) ? dpfSimNo
								: dpfSimNo.substring(0, dpfSimNoSize)),
				(dpfProduct == null) ? null
						: ((dpfProduct.length() <= dpfProductSize) ? dpfSimNo
								: dpfProduct.substring(0, dpfProductSize)),
				(dpfReverseBill == null) ? null
						: ((dpfReverseBill.length() <= dpfReverseBillSize) ? dpfReverseBill
								: dpfReverseBill.substring(0,
										dpfReverseBillSize)) };
	 }

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		dpfEhId = rtrim((String) fields[0]);
		dpfName = rtrim((String) fields[1]);
		dpfFolderId = (Integer) fields[2];
		dpfStatus = rtrim((String) fields[3]);
		dpfCreationDate = (Date) fields[4];
		dpfConnectDate =(Date) fields[5];
		dpfN2nFolder = rtrim((String) fields[6]);;
		dpfMsisdnNo = rtrim((String) fields[7]);
		dpfSimNo = rtrim((String) fields[8]);
		dpfProduct = rtrim((String) fields[9]);
		dpfReverseBill = rtrim((String) fields[10]);
	}

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final String dpfEhId, final String dpfName,
			final Integer dpfFolderId, final String dpfStatus,
			final Date dpfCreationDate, final Date dpfConnectDate,
			final String dpfN2nFolder, final String dpfMsisdnNo,
			final String dpfSimNo, final String dpfProduct,
			final String dpfReverseBill) {
		this.dpfEhId = dpfEhId;
		this.dpfName = dpfName;
		this.dpfFolderId = dpfFolderId;
		this.dpfStatus = dpfStatus;
		this.dpfCreationDate = (dpfCreationDate != null) ? new Date(
				dpfCreationDate) : null;
		this.dpfConnectDate = (dpfConnectDate != null) ? new Date(
				dpfConnectDate) : null;
		this.dpfN2nFolder = dpfN2nFolder;
		this.dpfMsisdnNo = dpfMsisdnNo;
		this.dpfSimNo = dpfSimNo;
		this.dpfProduct = dpfProduct;
		this.dpfReverseBill = dpfReverseBill;
	}

	public String getDpfEhId() {
		return dpfEhId;
	}

	public void setDpfEhId(String dpfEhId) {
		this.dpfEhId = dpfEhId;
	}

	public String getDpfName() {
		return dpfName;
	}

	public void setDpfName(String dpfName) {
		this.dpfName = dpfName;
	}

	public Integer getDpfFolderId() {
		return dpfFolderId;
	}

	public void setDpfFolderId(Integer dpfFolderId) {
		this.dpfFolderId = dpfFolderId;
	}

	public String getDpfStatus() {
		return dpfStatus;
	}

	public void setDpfStatus(String dpfStatus) {
		this.dpfStatus = dpfStatus;
	}

	public Date getDpfCreationDate() {
		return dpfCreationDate;
	}

	public void setDpfCreationDate(Date dpfCreationDate) {
		this.dpfCreationDate = dpfCreationDate;
	}

	public Date getDpfConnectDate() {
		return dpfConnectDate;
	}

	public void setDpfConnectDate(Date dpfConnectDate) {
		this.dpfConnectDate = dpfConnectDate;
	}

	public String getDpfN2nFolder() {
		return dpfN2nFolder;
	}

	public void setDpfN2nFolder(String dpfN2nFolder) {
		this.dpfN2nFolder = dpfN2nFolder;
	}

	public String getDpfMsisdnNo() {
		return dpfMsisdnNo;
	}

	public void setDpfMsisdnNo(String dpfMsisdnNo) {
		this.dpfMsisdnNo = dpfMsisdnNo;
	}

	public String getDpfSimNo() {
		return dpfSimNo;
	}

	public void setDpfSimNo(String dpfSimNo) {
		this.dpfSimNo = dpfSimNo;
	}

	public String getDpfProduct() {
		return dpfProduct;
	}

	public void setDpfProduct(String dpfProduct) {
		this.dpfProduct = dpfProduct;
	}

	public String getDpfReverseBill() {
		return dpfReverseBill;
	}

	public void setDpfReverseBill(String dpfReverseBill) {
		this.dpfReverseBill = dpfReverseBill;
	}

}
