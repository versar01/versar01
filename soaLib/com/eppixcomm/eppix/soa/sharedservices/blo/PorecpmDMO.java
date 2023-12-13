package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PorecpmDMO extends DBO implements Serializable {

	private Integer uniqueNo;
	private String receiptNo;
	private String orderNo;
	private String supplier;
	private Date dateReceived;
	private Date dateRequired;
	private String comment;
	private String warehouse;
	private String product;
	private String moreToComeInd;
	private String deliveryNo;
	private BigDecimal qtyReceived;
	private BigDecimal localCost;
	private BigDecimal foreignCost;
	private String spare;
	private String unitCode;
	private String unitGroup;
	private BigDecimal unitFactor;
	private String unitOperand;
	private String stockUnitDp;
	private String originatorUserId;
	private Date creationDate;
	private String plCompany;
	private String levelOfDetail;
	private String returnCode;
	private String returnText1;
	private String returnText2;
	private String returnNumber;
	private BigDecimal qtyReturned;
	private BigDecimal qtyBookedOut;

	public static final int uniqueNoFilter = 0;
	private static final int uniqueNoSize = 2;

	public static final int receiptNoFilter = 1;
	private static final int receiptNoSize = 6;

	public static final int orderNoFilter = 2;
	private static final int orderNoSize = 10;

	public static final int supplierFilter = 3;
	private static final int supplierSize = 8;

	public static final int dateReceivedFilter = 4;

	public static final int dateRequiredFilter = 5;

	public static final int commentFilter = 6;
	private static final int commentSize = 20;

	public static final int warehouseFilter = 7;
	private static final int warehouseSize = 2;

	public static final int productFilter = 8;
	private static final int productSize = 20;

	public static final int moreToComeIndFilter = 9;
	private static final int moreToComeIndSize = 1;

	public static final int deliveryNoFilter = 10;
	private static final int deliveryNoSize = 8;

	public static final int qtyReceivedFilter = 11;

	public static final int localCostFilter = 12;

	public static final int foreignCostFilter = 13;

	public static final int spareFilter = 14;
	private static final int spareSize = 48;

	public static final int unitCodeFilter = 15;
	private static final int unitCodeSize = 6;

	public static final int unitGroupFilter = 16;
	private static final int unitGroupSize = 1;

	public static final int unitFactorFilter = 17;

	public static final int unitOperandFilter = 18;
	private static final int unitOperandSize = 1;

	public static final int stockUnitDpFilter = 19;
	private static final int stockUnitDpSize = 1;

	public static final int originatorUserIdFilter = 20;
	private static final int originatorUserIdSize = 8;

	public static final int creationDateFilter = 21;

	public static final int plCompanyFilter = 22;
	private static final int plCompanySize = 8;

	public static final int levelOfDetailFilter = 23;
	private static final int levelOfDetailSize = 1;

	public static final int returnCodeFilter = 24;
	private static final int returnCodeSize = 10;

	public static final int returnText1Filter = 25;
	private static final int returnText1Size = 60;

	public static final int returnText2Filter = 26;
	private static final int returnText2Size = 60;

	public static final int returnNumberFilter = 27;
	private static final int returnNumberSize = 10;

	public static final int qtyReturnedFilter = 28;

	public static final int qtyBookedOutFilter = 29;

	public PorecpmDMO() {
	};

	public PorecpmDMO(final Integer uniqueNo, final String receiptNo,
			final String orderNo, final String supplier,
			final Date dateReceived, final Date dateRequired,
			final String comment, final String warehouse, final String product,
			final String moreToComeInd, final String deliveryNo,
			final BigDecimal qtyReceived, final BigDecimal localCost,
			final BigDecimal foreignCost, final String spare,
			final String unitCode, final String unitGroup,
			final BigDecimal unitFactor, final String unitOperand,
			final String stockUnitDp, final String originatorUserId,
			final Date creationDate, final String plCompany,
			final String levelOfDetail, final String returnCode,
			final String returnText1, final String returnText2,
			final String returnNumber, final BigDecimal qtyReturned,
			final BigDecimal qtyBookedOut) {

		this.uniqueNo = uniqueNo;
		this.receiptNo = receiptNo;
		this.orderNo = orderNo;
		this.supplier = supplier;
		this.dateReceived = dateReceived;
		this.dateRequired = dateRequired;
		this.comment = comment;
		this.warehouse = warehouse;
		this.product = product;
		this.moreToComeInd = moreToComeInd;
		this.deliveryNo = deliveryNo;
		this.qtyReceived = qtyReceived;
		this.localCost = localCost;
		this.foreignCost = foreignCost;
		this.spare = spare;
		this.unitCode = unitCode;
		this.unitGroup = unitGroup;
		this.unitFactor = unitFactor;
		this.unitOperand = unitOperand;
		this.stockUnitDp = stockUnitDp;
		this.originatorUserId = originatorUserId;
		this.creationDate = creationDate;
		this.plCompany = plCompany;
		this.levelOfDetail = levelOfDetail;
		this.returnCode = returnCode;
		this.returnText1 = returnText1;
		this.returnText2 = returnText2;
		this.returnNumber = returnNumber;
		this.qtyReturned = qtyReturned;
		this.qtyBookedOut = qtyBookedOut;
	};

	private static final int[] fieldSizes = new int[] { uniqueNoSize,
			receiptNoSize, orderNoSize, supplierSize, 0, 0, commentSize,
			warehouseSize, productSize, moreToComeIndSize, deliveryNoSize, 0,
			0, 0, spareSize, unitCodeSize, unitGroupSize, 0, unitOperandSize,
			stockUnitDpSize, originatorUserIdSize, 0, plCompanySize,
			levelOfDetailSize, returnCodeSize, returnText1Size,
			returnText2Size, returnNumberSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.uniqueNo,
				((this.receiptNo == null) ? null
						: (this.receiptNo.length() <= receiptNoSize) ? this.receiptNo
								: this.receiptNo.substring(0,
										this.receiptNoSize)),
				((this.orderNo == null) ? null
						: (this.orderNo.length() <= orderNoSize) ? this.orderNo
								: this.orderNo.substring(0, this.orderNoSize)),
				((this.supplier == null) ? null
						: (this.supplier.length() <= supplierSize) ? this.supplier
								: this.supplier.substring(0, this.supplierSize)),
				this.dateReceived,
				this.dateRequired,
				((this.comment == null) ? null
						: (this.comment.length() <= commentSize) ? this.comment
								: this.comment.substring(0, this.commentSize)),
				((this.warehouse == null) ? null
						: (this.warehouse.length() <= warehouseSize) ? this.warehouse
								: this.warehouse.substring(0,
										this.warehouseSize)),
				((this.product == null) ? null
						: (this.product.length() <= productSize) ? this.product
								: this.product.substring(0, this.productSize)),
				((this.moreToComeInd == null) ? null : (this.moreToComeInd
						.length() <= moreToComeIndSize) ? this.moreToComeInd
						: this.moreToComeInd.substring(0,
								this.moreToComeIndSize)),
				((this.deliveryNo == null) ? null
						: (this.deliveryNo.length() <= deliveryNoSize) ? this.deliveryNo
								: this.deliveryNo.substring(0,
										this.deliveryNoSize)),
				this.qtyReceived,
				this.localCost,
				this.foreignCost,
				((this.spare == null) ? null
						: (this.spare.length() <= spareSize) ? this.spare
								: this.spare.substring(0, this.spareSize)),
				((this.unitCode == null) ? null
						: (this.unitCode.length() <= unitCodeSize) ? this.unitCode
								: this.unitCode.substring(0, this.unitCodeSize)),
				((this.unitGroup == null) ? null
						: (this.unitGroup.length() <= unitGroupSize) ? this.unitGroup
								: this.unitGroup.substring(0,
										this.unitGroupSize)),
				this.unitFactor,
				((this.unitOperand == null) ? null
						: (this.unitOperand.length() <= unitOperandSize) ? this.unitOperand
								: this.unitOperand.substring(0,
										this.unitOperandSize)),
				((this.stockUnitDp == null) ? null
						: (this.stockUnitDp.length() <= stockUnitDpSize) ? this.stockUnitDp
								: this.stockUnitDp.substring(0,
										this.stockUnitDpSize)),
				((this.originatorUserId == null) ? null
						: (this.originatorUserId.length() <= originatorUserIdSize) ? this.originatorUserId
								: this.originatorUserId.substring(0,
										this.originatorUserIdSize)),
				this.creationDate,
				((this.plCompany == null) ? null
						: (this.plCompany.length() <= plCompanySize) ? this.plCompany
								: this.plCompany.substring(0,
										this.plCompanySize)),
				((this.levelOfDetail == null) ? null : (this.levelOfDetail
						.length() <= levelOfDetailSize) ? this.levelOfDetail
						: this.levelOfDetail.substring(0,
								this.levelOfDetailSize)),
				((this.returnCode == null) ? null
						: (this.returnCode.length() <= returnCodeSize) ? this.returnCode
								: this.returnCode.substring(0,
										this.returnCodeSize)),
				((this.returnText1 == null) ? null
						: (this.returnText1.length() <= returnText1Size) ? this.returnText1
								: this.returnText1.substring(0,
										this.returnText1Size)),
				((this.returnText2 == null) ? null
						: (this.returnText2.length() <= returnText2Size) ? this.returnText2
								: this.returnText2.substring(0,
										this.returnText2Size)),
				((this.returnNumber == null) ? null : (this.returnNumber
						.length() <= returnNumberSize) ? this.returnNumber
						: this.returnNumber.substring(0, this.returnNumberSize)),
				this.qtyReturned, this.qtyBookedOut };
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
		return new DAOArgs(1).arg(this.uniqueNo);
	}

	protected void set(Object[] fields) {
		this.uniqueNo = (Integer) fields[0];
		this.receiptNo = rtrim((String) fields[1]);
		this.orderNo = rtrim((String) fields[2]);
		this.supplier = rtrim((String) fields[3]);
		this.dateReceived = ((fields[4] == null) ? null : new Date(fields[4]));
		this.dateRequired = ((fields[5] == null) ? null : new Date(fields[5]));
		this.comment = rtrim((String) fields[6]);
		this.warehouse = rtrim((String) fields[7]);
		this.product = rtrim((String) fields[8]);
		this.moreToComeInd = rtrim((String) fields[9]);
		this.deliveryNo = rtrim((String) fields[10]);
		this.qtyReceived = ((BigDecimal) fields[11]);
		this.localCost = ((BigDecimal) fields[12]);
		this.foreignCost = ((BigDecimal) fields[13]);
		this.spare = rtrim((String) fields[14]);
		this.unitCode = rtrim((String) fields[15]);
		this.unitGroup = rtrim((String) fields[16]);
		this.unitFactor = ((BigDecimal) fields[17]);
		this.unitOperand = rtrim((String) fields[18]);
		this.stockUnitDp = rtrim((String) fields[19]);
		this.originatorUserId = rtrim((String) fields[20]);
		this.creationDate = ((fields[21] == null) ? null : new Date(fields[21]));
		this.plCompany = rtrim((String) fields[22]);
		this.levelOfDetail = rtrim((String) fields[23]);
		this.returnCode = rtrim((String) fields[24]);
		this.returnText1 = rtrim((String) fields[25]);
		this.returnText2 = rtrim((String) fields[26]);
		this.returnNumber = rtrim((String) fields[27]);
		this.qtyReturned = ((BigDecimal) fields[28]);
		this.qtyBookedOut = ((BigDecimal) fields[29]);
	}

	public void set(final Integer uniqueNo, final String receiptNo,
			final String orderNo, final String supplier,
			final Date dateReceived, final Date dateRequired,
			final String comment, final String warehouse, final String product,
			final String moreToComeInd, final String deliveryNo,
			final BigDecimal qtyReceived, final BigDecimal localCost,
			final BigDecimal foreignCost, final String spare,
			final String unitCode, final String unitGroup,
			final BigDecimal unitFactor, final String unitOperand,
			final String stockUnitDp, final String originatorUserId,
			final Date creationDate, final String plCompany,
			final String levelOfDetail, final String returnCode,
			final String returnText1, final String returnText2,
			final String returnNumber, final BigDecimal qtyReturned,
			final BigDecimal qtyBookedOut) {

		this.uniqueNo = uniqueNo;
		this.receiptNo = receiptNo;
		this.orderNo = orderNo;
		this.supplier = supplier;
		this.dateReceived = dateReceived;
		this.dateRequired = dateRequired;
		this.comment = comment;
		this.warehouse = warehouse;
		this.product = product;
		this.moreToComeInd = moreToComeInd;
		this.deliveryNo = deliveryNo;
		this.qtyReceived = qtyReceived;
		this.localCost = localCost;
		this.foreignCost = foreignCost;
		this.spare = spare;
		this.unitCode = unitCode;
		this.unitGroup = unitGroup;
		this.unitFactor = unitFactor;
		this.unitOperand = unitOperand;
		this.stockUnitDp = stockUnitDp;
		this.originatorUserId = originatorUserId;
		this.creationDate = creationDate;
		this.plCompany = plCompany;
		this.levelOfDetail = levelOfDetail;
		this.returnCode = returnCode;
		this.returnText1 = returnText1;
		this.returnText2 = returnText2;
		this.returnNumber = returnNumber;
		this.qtyReturned = qtyReturned;
		this.qtyBookedOut = qtyBookedOut;
	}

	public Integer getUniqueNo() {
		return uniqueNo;
	}

	public void setUniqueNo(Integer uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Date getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Date getDateRequired() {
		return dateRequired;
	}

	public void setDateRequired(Date dateRequired) {
		this.dateRequired = dateRequired;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getMoreToComeInd() {
		return moreToComeInd;
	}

	public void setMoreToComeInd(String moreToComeInd) {
		this.moreToComeInd = moreToComeInd;
	}

	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public BigDecimal getQtyReceived() {
		return qtyReceived;
	}

	public void setQtyReceived(BigDecimal qtyReceived) {
		this.qtyReceived = qtyReceived;
	}

	public BigDecimal getLocalCost() {
		return localCost;
	}

	public void setLocalCost(BigDecimal localCost) {
		this.localCost = localCost;
	}

	public BigDecimal getForeignCost() {
		return foreignCost;
	}

	public void setForeignCost(BigDecimal foreignCost) {
		this.foreignCost = foreignCost;
	}

	public String getSpare() {
		return spare;
	}

	public void setSpare(String spare) {
		this.spare = spare;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitGroup() {
		return unitGroup;
	}

	public void setUnitGroup(String unitGroup) {
		this.unitGroup = unitGroup;
	}

	public BigDecimal getUnitFactor() {
		return unitFactor;
	}

	public void setUnitFactor(BigDecimal unitFactor) {
		this.unitFactor = unitFactor;
	}

	public String getUnitOperand() {
		return unitOperand;
	}

	public void setUnitOperand(String unitOperand) {
		this.unitOperand = unitOperand;
	}

	public String getStockUnitDp() {
		return stockUnitDp;
	}

	public void setStockUnitDp(String stockUnitDp) {
		this.stockUnitDp = stockUnitDp;
	}

	public String getOriginatorUserId() {
		return originatorUserId;
	}

	public void setOriginatorUserId(String originatorUserId) {
		this.originatorUserId = originatorUserId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getPlCompany() {
		return plCompany;
	}

	public void setPlCompany(String plCompany) {
		this.plCompany = plCompany;
	}

	public String getLevelOfDetail() {
		return levelOfDetail;
	}

	public void setLevelOfDetail(String levelOfDetail) {
		this.levelOfDetail = levelOfDetail;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnText1() {
		return returnText1;
	}

	public void setReturnText1(String returnText1) {
		this.returnText1 = returnText1;
	}

	public String getReturnText2() {
		return returnText2;
	}

	public void setReturnText2(String returnText2) {
		this.returnText2 = returnText2;
	}

	public String getReturnNumber() {
		return returnNumber;
	}

	public void setReturnNumber(String returnNumber) {
		this.returnNumber = returnNumber;
	}

	public BigDecimal getQtyReturned() {
		return qtyReturned;
	}

	public void setQtyReturned(BigDecimal qtyReturned) {
		this.qtyReturned = qtyReturned;
	}

	public BigDecimal getQtyBookedOut() {
		return qtyBookedOut;
	}

	public void setQtyBookedOut(BigDecimal qtyBookedOut) {
		this.qtyBookedOut = qtyBookedOut;
	}

}
