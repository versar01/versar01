package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

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

public class PfsPocFldrSubsDMO extends DBO implements Serializable {

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
			FIELD_TYPE_INTEGER /* std public attribute: pfs_subscriber_id */,
			FIELD_TYPE_INTEGER /* std public attribute: pfs_folder_id */,
			FIELD_TYPE_STRING /* std public attribute: pfs_status */
	};

	/**
	 * TODO SJ Implement the array of field sizes Not implemented as it is not a
	 * MTN table
	 */
	private final int[] fieldSizes = new int[] { 0, 0, pfsStatusSize };

	public int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int pfsSubscriberIdFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int pfsFolderIdFilter = 1; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int pfsStatusFilter = 2; // filter index
	private static final int pfsStatusSize = 20; // field size

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer pfsSubscriberId;
	private Integer pfsFolderId;
	private String pfsStatus;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	public PfsPocFldrSubsDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new FntNetTransendDMO object.
	 * 
	 * @param pfsSubscriberId
	 *            DOCUMENT ME!
	 * @param pfsFolderId
	 *            DOCUMENT ME!
	 * @param pfsStatus
	 *            DOCUMENT ME!
	 */
	public PfsPocFldrSubsDMO(final Integer pfsSubscriberId,
			final Integer pfsFolderId, final String pfsStatus) {

		this.pfsSubscriberId = pfsSubscriberId;

		this.pfsFolderId = pfsFolderId;

		this.pfsStatus = pfsStatus;
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
		return new DAOArgs(1).arg(this.getPfsSubscriberId());
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
				pfsSubscriberId,
				pfsFolderId,
				// trimmed to fit, if required.
				(pfsStatus == null) ? null
						: ((pfsStatus.length() <= pfsStatusSize) ? pfsStatus
								: pfsStatus.substring(0, pfsStatusSize)) };
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		pfsSubscriberId = (Integer) fields[0];
		pfsFolderId = (Integer) fields[1];
		pfsStatus = rtrim((String) fields[2]);
	}

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer pfsSubscriberId, final Integer pfsFolderId,
			final String pfsStatus) {
		this.pfsSubscriberId = pfsSubscriberId;
		this.pfsFolderId = pfsFolderId;
		this.pfsStatus = pfsStatus;
	}

	public Integer getPfsSubscriberId() {
		return pfsSubscriberId;
	}

	public void setPfsSubscriberId(Integer pfsSubscriberId) {
		this.pfsSubscriberId = pfsSubscriberId;
	}

	public Integer getPfsFolderId() {
		return pfsFolderId;
	}

	public void setPfsFolderId(Integer pfsFolderId) {
		this.pfsFolderId = pfsFolderId;
	}

	public String getPfsStatus() {
		return pfsStatus;
	}

	public void setPfsStatus(String pfsStatus) {
		this.pfsStatus = pfsStatus;
	}
}