package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SodSimOrderDtDMO extends DBO implements Serializable {

	private String sodOrderNo;
	private String sodOrderLineNo;
	private String sodWarehouse;
	private String sodArticleNo;
	private String sodDescription;
	private String sodUnitCode;
	private String sodLongDesc;
	private String sodNlCategory;
	private Date sodDateRequired;
	private String sodStatus;
	private Date sodDateCompleted;
	private String sodSerialIndic;
	private BigDecimal sodQtyOrdered;
	private BigDecimal sodQtyReceived;
	private String sodProviderId;
	private String sodNetworkPrefix;
	private String sodFirstSim;
	private String sodFirstImsi;
	private BigDecimal sodCostPerSim;

	public static final int sodOrderNoFilter = 0;
	private static final int sodOrderNoSize = 10;

	public static final int sodOrderLineNoFilter = 1;
	private static final int sodOrderLineNoSize = 4;

	public static final int sodWarehouseFilter = 2;
	private static final int sodWarehouseSize = 2;

	public static final int sodArticleNoFilter = 3;
	private static final int sodArticleNoSize = 20;

	public static final int sodDescriptionFilter = 4;
	private static final int sodDescriptionSize = 20;

	public static final int sodUnitCodeFilter = 5;
	private static final int sodUnitCodeSize = 10;

	public static final int sodLongDescFilter = 6;
	private static final int sodLongDescSize = 40;

	public static final int sodNlCategoryFilter = 7;
	private static final int sodNlCategorySize = 3;

	public static final int sodDateRequiredFilter = 8;

	public static final int sodStatusFilter = 9;
	private static final int sodStatusSize = 1;

	public static final int sodDateCompletedFilter = 10;

	public static final int sodSerialIndicFilter = 11;
	private static final int sodSerialIndicSize = 1;

	public static final int sodQtyOrderedFilter = 12;

	public static final int sodQtyReceivedFilter = 13;

	public static final int sodProviderIdFilter = 14;
	private static final int sodProviderIdSize = 10;

	public static final int sodNetworkPrefixFilter = 15;
	private static final int sodNetworkPrefixSize = 5;

	public static final int sodFirstSimFilter = 16;
	private static final int sodFirstSimSize = 14;

	public static final int sodFirstImsiFilter = 17;
	private static final int sodFirstImsiSize = 15;

	public static final int sodCostPerSimFilter = 18;

	public SodSimOrderDtDMO() {
	};

	public SodSimOrderDtDMO(final String sodOrderNo,
			final String sodOrderLineNo, final String sodWarehouse,
			final String sodArticleNo, final String sodDescription,
			final String sodUnitCode, final String sodLongDesc,
			final String sodNlCategory, final Date sodDateRequired,
			final String sodStatus, final Date sodDateCompleted,
			final String sodSerialIndic, final BigDecimal sodQtyOrdered,
			final BigDecimal sodQtyReceived, final String sodProviderId,
			final String sodNetworkPrefix, final String sodFirstSim,
			final String sodFirstImsi, final BigDecimal sodCostPerSim) {

		this.sodOrderNo = sodOrderNo;
		this.sodOrderLineNo = sodOrderLineNo;
		this.sodWarehouse = sodWarehouse;
		this.sodArticleNo = sodArticleNo;
		this.sodDescription = sodDescription;
		this.sodUnitCode = sodUnitCode;
		this.sodLongDesc = sodLongDesc;
		this.sodNlCategory = sodNlCategory;
		this.sodDateRequired = sodDateRequired;
		this.sodStatus = sodStatus;
		this.sodDateCompleted = sodDateCompleted;
		this.sodSerialIndic = sodSerialIndic;
		this.sodQtyOrdered = sodQtyOrdered;
		this.sodQtyReceived = sodQtyReceived;
		this.sodProviderId = sodProviderId;
		this.sodNetworkPrefix = sodNetworkPrefix;
		this.sodFirstSim = sodFirstSim;
		this.sodFirstImsi = sodFirstImsi;
		this.sodCostPerSim = sodCostPerSim;
	};

	private static final int[] fieldSizes = new int[] { sodOrderNoSize,
			sodOrderLineNoSize, sodWarehouseSize, sodArticleNoSize,
			sodDescriptionSize, sodUnitCodeSize, sodLongDescSize,
			sodNlCategorySize, 0, sodStatusSize, 0, sodSerialIndicSize, 0, 0,
			sodProviderIdSize, sodNetworkPrefixSize, sodFirstSimSize,
			sodFirstImsiSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.sodOrderNo == null) ? null
						: (this.sodOrderNo.length() <= sodOrderNoSize) ? this.sodOrderNo
								: this.sodOrderNo.substring(0,
										this.sodOrderNoSize)),
				((this.sodOrderLineNo == null) ? null : (this.sodOrderLineNo
						.length() <= sodOrderLineNoSize) ? this.sodOrderLineNo
						: this.sodOrderLineNo.substring(0,
								this.sodOrderLineNoSize)),
				((this.sodWarehouse == null) ? null : (this.sodWarehouse
						.length() <= sodWarehouseSize) ? this.sodWarehouse
						: this.sodWarehouse.substring(0, this.sodWarehouseSize)),
				((this.sodArticleNo == null) ? null : (this.sodArticleNo
						.length() <= sodArticleNoSize) ? this.sodArticleNo
						: this.sodArticleNo.substring(0, this.sodArticleNoSize)),
				((this.sodDescription == null) ? null : (this.sodDescription
						.length() <= sodDescriptionSize) ? this.sodDescription
						: this.sodDescription.substring(0,
								this.sodDescriptionSize)),
				((this.sodUnitCode == null) ? null
						: (this.sodUnitCode.length() <= sodUnitCodeSize) ? this.sodUnitCode
								: this.sodUnitCode.substring(0,
										this.sodUnitCodeSize)),
				((this.sodLongDesc == null) ? null
						: (this.sodLongDesc.length() <= sodLongDescSize) ? this.sodLongDesc
								: this.sodLongDesc.substring(0,
										this.sodLongDescSize)),
				((this.sodNlCategory == null) ? null : (this.sodNlCategory
						.length() <= sodNlCategorySize) ? this.sodNlCategory
						: this.sodNlCategory.substring(0,
								this.sodNlCategorySize)),
				this.sodDateRequired,
				((this.sodStatus == null) ? null
						: (this.sodStatus.length() <= sodStatusSize) ? this.sodStatus
								: this.sodStatus.substring(0,
										this.sodStatusSize)),
				this.sodDateCompleted,
				((this.sodSerialIndic == null) ? null : (this.sodSerialIndic
						.length() <= sodSerialIndicSize) ? this.sodSerialIndic
						: this.sodSerialIndic.substring(0,
								this.sodSerialIndicSize)),
				this.sodQtyOrdered,
				this.sodQtyReceived,
				((this.sodProviderId == null) ? null : (this.sodProviderId
						.length() <= sodProviderIdSize) ? this.sodProviderId
						: this.sodProviderId.substring(0,
								this.sodProviderIdSize)),
				((this.sodNetworkPrefix == null) ? null
						: (this.sodNetworkPrefix.length() <= sodNetworkPrefixSize) ? this.sodNetworkPrefix
								: this.sodNetworkPrefix.substring(0,
										this.sodNetworkPrefixSize)),
				((this.sodFirstSim == null) ? null
						: (this.sodFirstSim.length() <= sodFirstSimSize) ? this.sodFirstSim
								: this.sodFirstSim.substring(0,
										this.sodFirstSimSize)),
				((this.sodFirstImsi == null) ? null : (this.sodFirstImsi
						.length() <= sodFirstImsiSize) ? this.sodFirstImsi
						: this.sodFirstImsi.substring(0, this.sodFirstImsiSize)),
				this.sodCostPerSim };
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs(2).arg(this.sodOrderNo).arg(this.sodOrderLineNo);
	}

	protected void set(Object[] fields) {
		this.sodOrderNo = rtrim((String) fields[0]);
		this.sodOrderLineNo = rtrim((String) fields[1]);
		this.sodWarehouse = rtrim((String) fields[2]);
		this.sodArticleNo = rtrim((String) fields[3]);
		this.sodDescription = rtrim((String) fields[4]);
		this.sodUnitCode = rtrim((String) fields[5]);
		this.sodLongDesc = rtrim((String) fields[6]);
		this.sodNlCategory = rtrim((String) fields[7]);
		this.sodDateRequired = ((fields[8] == null) ? null
				: new Date(fields[8]));
		this.sodStatus = rtrim((String) fields[9]);
		this.sodDateCompleted = ((fields[10] == null) ? null : new Date(
				fields[10]));
		this.sodSerialIndic = rtrim((String) fields[11]);
		this.sodQtyOrdered = ((BigDecimal) fields[12]);
		this.sodQtyReceived = ((BigDecimal) fields[13]);
		this.sodProviderId = rtrim((String) fields[14]);
		this.sodNetworkPrefix = rtrim((String) fields[15]);
		this.sodFirstSim = rtrim((String) fields[16]);
		this.sodFirstImsi = rtrim((String) fields[17]);
		this.sodCostPerSim = ((BigDecimal) fields[18]);
	}

	public void set(final String sodOrderNo, final String sodOrderLineNo,
			final String sodWarehouse, final String sodArticleNo,
			final String sodDescription, final String sodUnitCode,
			final String sodLongDesc, final String sodNlCategory,
			final Date sodDateRequired, final String sodStatus,
			final Date sodDateCompleted, final String sodSerialIndic,
			final BigDecimal sodQtyOrdered, final BigDecimal sodQtyReceived,
			final String sodProviderId, final String sodNetworkPrefix,
			final String sodFirstSim, final String sodFirstImsi,
			final BigDecimal sodCostPerSim) {

		this.sodOrderNo = sodOrderNo;
		this.sodOrderLineNo = sodOrderLineNo;
		this.sodWarehouse = sodWarehouse;
		this.sodArticleNo = sodArticleNo;
		this.sodDescription = sodDescription;
		this.sodUnitCode = sodUnitCode;
		this.sodLongDesc = sodLongDesc;
		this.sodNlCategory = sodNlCategory;
		this.sodDateRequired = sodDateRequired;
		this.sodStatus = sodStatus;
		this.sodDateCompleted = sodDateCompleted;
		this.sodSerialIndic = sodSerialIndic;
		this.sodQtyOrdered = sodQtyOrdered;
		this.sodQtyReceived = sodQtyReceived;
		this.sodProviderId = sodProviderId;
		this.sodNetworkPrefix = sodNetworkPrefix;
		this.sodFirstSim = sodFirstSim;
		this.sodFirstImsi = sodFirstImsi;
		this.sodCostPerSim = sodCostPerSim;
	}

	public String getSodOrderNo() {
		return sodOrderNo;
	}

	public void setSodOrderNo(String sodOrderNo) {
		this.sodOrderNo = sodOrderNo;
	}

	public String getSodOrderLineNo() {
		return sodOrderLineNo;
	}

	public void setSodOrderLineNo(String sodOrderLineNo) {
		this.sodOrderLineNo = sodOrderLineNo;
	}

	public String getSodWarehouse() {
		return sodWarehouse;
	}

	public void setSodWarehouse(String sodWarehouse) {
		this.sodWarehouse = sodWarehouse;
	}

	public String getSodArticleNo() {
		return sodArticleNo;
	}

	public void setSodArticleNo(String sodArticleNo) {
		this.sodArticleNo = sodArticleNo;
	}

	public String getSodDescription() {
		return sodDescription;
	}

	public void setSodDescription(String sodDescription) {
		this.sodDescription = sodDescription;
	}

	public String getSodUnitCode() {
		return sodUnitCode;
	}

	public void setSodUnitCode(String sodUnitCode) {
		this.sodUnitCode = sodUnitCode;
	}

	public String getSodLongDesc() {
		return sodLongDesc;
	}

	public void setSodLongDesc(String sodLongDesc) {
		this.sodLongDesc = sodLongDesc;
	}

	public String getSodNlCategory() {
		return sodNlCategory;
	}

	public void setSodNlCategory(String sodNlCategory) {
		this.sodNlCategory = sodNlCategory;
	}

	public Date getSodDateRequired() {
		return sodDateRequired;
	}

	public void setSodDateRequired(Date sodDateRequired) {
		this.sodDateRequired = sodDateRequired;
	}

	public String getSodStatus() {
		return sodStatus;
	}

	public void setSodStatus(String sodStatus) {
		this.sodStatus = sodStatus;
	}

	public Date getSodDateCompleted() {
		return sodDateCompleted;
	}

	public void setSodDateCompleted(Date sodDateCompleted) {
		this.sodDateCompleted = sodDateCompleted;
	}

	public String getSodSerialIndic() {
		return sodSerialIndic;
	}

	public void setSodSerialIndic(String sodSerialIndic) {
		this.sodSerialIndic = sodSerialIndic;
	}

	public BigDecimal getSodQtyOrdered() {
		return sodQtyOrdered;
	}

	public void setSodQtyOrdered(BigDecimal sodQtyOrdered) {
		this.sodQtyOrdered = sodQtyOrdered;
	}

	public BigDecimal getSodQtyReceived() {
		return sodQtyReceived;
	}

	public void setSodQtyReceived(BigDecimal sodQtyReceived) {
		this.sodQtyReceived = sodQtyReceived;
	}

	public String getSodProviderId() {
		return sodProviderId;
	}

	public void setSodProviderId(String sodProviderId) {
		this.sodProviderId = sodProviderId;
	}

	public String getSodNetworkPrefix() {
		return sodNetworkPrefix;
	}

	public void setSodNetworkPrefix(String sodNetworkPrefix) {
		this.sodNetworkPrefix = sodNetworkPrefix;
	}

	public String getSodFirstSim() {
		return sodFirstSim;
	}

	public void setSodFirstSim(String sodFirstSim) {
		this.sodFirstSim = sodFirstSim;
	}

	public String getSodFirstImsi() {
		return sodFirstImsi;
	}

	public void setSodFirstImsi(String sodFirstImsi) {
		this.sodFirstImsi = sodFirstImsi;
	}

	public BigDecimal getSodCostPerSim() {
		return sodCostPerSim;
	}

	public void setSodCostPerSim(BigDecimal sodCostPerSim) {
		this.sodCostPerSim = sodCostPerSim;
	}

}
