package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class StkhstmDMO extends DBO implements Serializable {


private String warehouse;
private String product;
private Date dated;
private String sequenceNo;
private String movementReference;
private String movementSource;
private Date movementDate;
private String transactionType;
private String comments;
private String fromBinNumber;
private String toBinNumber;
private String batchNumber;
private String lotNumber;
private Date expiryDate;
private String nlCategory;
private String serialNumber;
private String userId;
private BigDecimal movementQuantity;
private BigDecimal movementCost;
private BigDecimal totalLabourCost;
private BigDecimal totalOverheadCos;
private BigDecimal subContractCost;
private BigDecimal openingBalance;
private String valOnlyAdjInd;
private String spare;



public static final int warehouseFilter = 0;
private static final int warehouseSize = 2;


public static final int productFilter = 1;
private static final int productSize = 20;


public static final int datedFilter = 2;

public static final int sequenceNoFilter = 3;
private static final int sequenceNoSize = 6;


public static final int movementReferenceFilter = 4;
private static final int movementReferenceSize = 10;


public static final int movementSourceFilter = 5;
private static final int movementSourceSize = 10;


public static final int movementDateFilter = 6;

public static final int transactionTypeFilter = 7;
private static final int transactionTypeSize = 4;


public static final int commentsFilter = 8;
private static final int commentsSize = 60;


public static final int fromBinNumberFilter = 9;
private static final int fromBinNumberSize = 10;


public static final int toBinNumberFilter = 10;
private static final int toBinNumberSize = 10;


public static final int batchNumberFilter = 11;
private static final int batchNumberSize = 10;


public static final int lotNumberFilter = 12;
private static final int lotNumberSize = 10;


public static final int expiryDateFilter = 13;

public static final int nlCategoryFilter = 14;
private static final int nlCategorySize = 3;


public static final int serialNumberFilter = 15;
private static final int serialNumberSize = 20;


public static final int userIdFilter = 16;
private static final int userIdSize = 8;


public static final int movementQuantityFilter = 17;

public static final int movementCostFilter = 18;

public static final int totalLabourCostFilter = 19;

public static final int totalOverheadCosFilter = 20;

public static final int subContractCostFilter = 21;

public static final int openingBalanceFilter = 22;

public static final int valOnlyAdjIndFilter = 23;
private static final int valOnlyAdjIndSize = 1;


public static final int spareFilter = 24;
private static final int spareSize = 48;





public StkhstmDMO(){};

public StkhstmDMO(final String warehouse,
final String product,
final Date dated,
final String sequenceNo,
final String movementReference,
final String movementSource,
final Date movementDate,
final String transactionType,
final String comments,
final String fromBinNumber,
final String toBinNumber,
final String batchNumber,
final String lotNumber,
final Date expiryDate,
final String nlCategory,
final String serialNumber,
final String userId,
final BigDecimal movementQuantity,
final BigDecimal movementCost,
final BigDecimal totalLabourCost,
final BigDecimal totalOverheadCos,
final BigDecimal subContractCost,
final BigDecimal openingBalance,
final String valOnlyAdjInd,
final String spare
){

this.warehouse = warehouse;
this.product = product;
this.dated = dated;
this.sequenceNo = sequenceNo;
this.movementReference = movementReference;
this.movementSource = movementSource;
this.movementDate = movementDate;
this.transactionType = transactionType;
this.comments = comments;
this.fromBinNumber = fromBinNumber;
this.toBinNumber = toBinNumber;
this.batchNumber = batchNumber;
this.lotNumber = lotNumber;
this.expiryDate = expiryDate;
this.nlCategory = nlCategory;
this.serialNumber = serialNumber;
this.userId = userId;
this.movementQuantity = movementQuantity;
this.movementCost = movementCost;
this.totalLabourCost = totalLabourCost;
this.totalOverheadCos = totalOverheadCos;
this.subContractCost = subContractCost;
this.openingBalance = openingBalance;
this.valOnlyAdjInd = valOnlyAdjInd;
this.spare = spare;
};


private static final int[] fieldSizes = new int[]{
warehouseSize,
productSize,
0,
sequenceNoSize,
movementReferenceSize,
movementSourceSize,
0,
transactionTypeSize,
commentsSize,
fromBinNumberSize,
toBinNumberSize,
batchNumberSize,
lotNumberSize,
0,
nlCategorySize,
serialNumberSize,
userIdSize,
0,
0,
0,
0,
0,
0,
valOnlyAdjIndSize,
spareSize
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{			((this.warehouse == null) ? null : (this.warehouse.length() <= warehouseSize) ? this.warehouse : this.warehouse.substring(0, this.warehouseSize)),
			((this.product == null) ? null : (this.product.length() <= productSize) ? this.product : this.product.substring(0, this.productSize)),
			this.dated,
			((this.sequenceNo == null) ? null : (this.sequenceNo.length() <= sequenceNoSize) ? this.sequenceNo : this.sequenceNo.substring(0, this.sequenceNoSize)),
			((this.movementReference == null) ? null : (this.movementReference.length() <= movementReferenceSize) ? this.movementReference : this.movementReference.substring(0, this.movementReferenceSize)),
			((this.movementSource == null) ? null : (this.movementSource.length() <= movementSourceSize) ? this.movementSource : this.movementSource.substring(0, this.movementSourceSize)),
			this.movementDate,
			((this.transactionType == null) ? null : (this.transactionType.length() <= transactionTypeSize) ? this.transactionType : this.transactionType.substring(0, this.transactionTypeSize)),
			((this.comments == null) ? null : (this.comments.length() <= commentsSize) ? this.comments : this.comments.substring(0, this.commentsSize)),
			((this.fromBinNumber == null) ? null : (this.fromBinNumber.length() <= fromBinNumberSize) ? this.fromBinNumber : this.fromBinNumber.substring(0, this.fromBinNumberSize)),
			((this.toBinNumber == null) ? null : (this.toBinNumber.length() <= toBinNumberSize) ? this.toBinNumber : this.toBinNumber.substring(0, this.toBinNumberSize)),
			((this.batchNumber == null) ? null : (this.batchNumber.length() <= batchNumberSize) ? this.batchNumber : this.batchNumber.substring(0, this.batchNumberSize)),
			((this.lotNumber == null) ? null : (this.lotNumber.length() <= lotNumberSize) ? this.lotNumber : this.lotNumber.substring(0, this.lotNumberSize)),
			this.expiryDate,
			((this.nlCategory == null) ? null : (this.nlCategory.length() <= nlCategorySize) ? this.nlCategory : this.nlCategory.substring(0, this.nlCategorySize)),
			((this.serialNumber == null) ? null : (this.serialNumber.length() <= serialNumberSize) ? this.serialNumber : this.serialNumber.substring(0, this.serialNumberSize)),
			((this.userId == null) ? null : (this.userId.length() <= userIdSize) ? this.userId : this.userId.substring(0, this.userIdSize)),
			this.movementQuantity,
			this.movementCost,
			this.totalLabourCost,
			this.totalOverheadCos,
			this.subContractCost,
			this.openingBalance,
			((this.valOnlyAdjInd == null) ? null : (this.valOnlyAdjInd.length() <= valOnlyAdjIndSize) ? this.valOnlyAdjInd : this.valOnlyAdjInd.substring(0, this.valOnlyAdjIndSize)),
			((this.spare == null) ? null : (this.spare.length() <= spareSize) ? this.spare : this.spare.substring(0, this.spareSize))
		};
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
	return new DAOArgs(4).arg(this.warehouse).arg(this.product).arg(this.dated).arg(this.sequenceNo); 
}



protected void set(Object[] fields) {
this.warehouse = rtrim((String)fields[0]);
this.product = rtrim((String)fields[1]);
this.dated = ((fields[2] == null)? null : new Date(fields[2]));
this.sequenceNo = rtrim((String)fields[3]);
this.movementReference = rtrim((String)fields[4]);
this.movementSource = rtrim((String)fields[5]);
this.movementDate = ((fields[6] == null)? null : new Date(fields[6]));
this.transactionType = rtrim((String)fields[7]);
this.comments = rtrim((String)fields[8]);
this.fromBinNumber = rtrim((String)fields[9]);
this.toBinNumber = rtrim((String)fields[10]);
this.batchNumber = rtrim((String)fields[11]);
this.lotNumber = rtrim((String)fields[12]);
this.expiryDate = ((fields[13] == null)? null : new Date(fields[13]));
this.nlCategory = rtrim((String)fields[14]);
this.serialNumber = rtrim((String)fields[15]);
this.userId = rtrim((String)fields[16]);
this.movementQuantity = ((BigDecimal)fields[17]);
this.movementCost = ((BigDecimal)fields[18]);
this.totalLabourCost = ((BigDecimal)fields[19]);
this.totalOverheadCos = ((BigDecimal)fields[20]);
this.subContractCost = ((BigDecimal)fields[21]);
this.openingBalance = ((BigDecimal)fields[22]);
this.valOnlyAdjInd = rtrim((String)fields[23]);
this.spare = rtrim((String)fields[24]);
}


public void set(
final String warehouse,
final String product,
final Date dated,
final String sequenceNo,
final String movementReference,
final String movementSource,
final Date movementDate,
final String transactionType,
final String comments,
final String fromBinNumber,
final String toBinNumber,
final String batchNumber,
final String lotNumber,
final Date expiryDate,
final String nlCategory,
final String serialNumber,
final String userId,
final BigDecimal movementQuantity,
final BigDecimal movementCost,
final BigDecimal totalLabourCost,
final BigDecimal totalOverheadCos,
final BigDecimal subContractCost,
final BigDecimal openingBalance,
final String valOnlyAdjInd,
final String spare
)
{

this.warehouse = warehouse;
this.product = product;
this.dated = dated;
this.sequenceNo = sequenceNo;
this.movementReference = movementReference;
this.movementSource = movementSource;
this.movementDate = movementDate;
this.transactionType = transactionType;
this.comments = comments;
this.fromBinNumber = fromBinNumber;
this.toBinNumber = toBinNumber;
this.batchNumber = batchNumber;
this.lotNumber = lotNumber;
this.expiryDate = expiryDate;
this.nlCategory = nlCategory;
this.serialNumber = serialNumber;
this.userId = userId;
this.movementQuantity = movementQuantity;
this.movementCost = movementCost;
this.totalLabourCost = totalLabourCost;
this.totalOverheadCos = totalOverheadCos;
this.subContractCost = subContractCost;
this.openingBalance = openingBalance;
this.valOnlyAdjInd = valOnlyAdjInd;
this.spare = spare;
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

public Date getDated() {
	return dated;
}

public void setDated(Date dated) {
	this.dated = dated;
}

public String getSequenceNo() {
	return sequenceNo;
}

public void setSequenceNo(String sequenceNo) {
	this.sequenceNo = sequenceNo;
}

public String getMovementReference() {
	return movementReference;
}

public void setMovementReference(String movementReference) {
	this.movementReference = movementReference;
}

public String getMovementSource() {
	return movementSource;
}

public void setMovementSource(String movementSource) {
	this.movementSource = movementSource;
}

public Date getMovementDate() {
	return movementDate;
}

public void setMovementDate(Date movementDate) {
	this.movementDate = movementDate;
}

public String getTransactionType() {
	return transactionType;
}

public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

public String getFromBinNumber() {
	return fromBinNumber;
}

public void setFromBinNumber(String fromBinNumber) {
	this.fromBinNumber = fromBinNumber;
}

public String getToBinNumber() {
	return toBinNumber;
}

public void setToBinNumber(String toBinNumber) {
	this.toBinNumber = toBinNumber;
}

public String getBatchNumber() {
	return batchNumber;
}

public void setBatchNumber(String batchNumber) {
	this.batchNumber = batchNumber;
}

public String getLotNumber() {
	return lotNumber;
}

public void setLotNumber(String lotNumber) {
	this.lotNumber = lotNumber;
}

public Date getExpiryDate() {
	return expiryDate;
}

public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}

public String getNlCategory() {
	return nlCategory;
}

public void setNlCategory(String nlCategory) {
	this.nlCategory = nlCategory;
}

public String getSerialNumber() {
	return serialNumber;
}

public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public BigDecimal getMovementQuantity() {
	return movementQuantity;
}

public void setMovementQuantity(BigDecimal movementQuantity) {
	this.movementQuantity = movementQuantity;
}

public BigDecimal getMovementCost() {
	return movementCost;
}

public void setMovementCost(BigDecimal movementCost) {
	this.movementCost = movementCost;
}

public BigDecimal getTotalLabourCost() {
	return totalLabourCost;
}

public void setTotalLabourCost(BigDecimal totalLabourCost) {
	this.totalLabourCost = totalLabourCost;
}

public BigDecimal getTotalOverheadCos() {
	return totalOverheadCos;
}

public void setTotalOverheadCos(BigDecimal totalOverheadCos) {
	this.totalOverheadCos = totalOverheadCos;
}

public BigDecimal getSubContractCost() {
	return subContractCost;
}

public void setSubContractCost(BigDecimal subContractCost) {
	this.subContractCost = subContractCost;
}

public BigDecimal getOpeningBalance() {
	return openingBalance;
}

public void setOpeningBalance(BigDecimal openingBalance) {
	this.openingBalance = openingBalance;
}

public String getValOnlyAdjInd() {
	return valOnlyAdjInd;
}

public void setValOnlyAdjInd(String valOnlyAdjInd) {
	this.valOnlyAdjInd = valOnlyAdjInd;
}

public String getSpare() {
	return spare;
}

public void setSpare(String spare) {
	this.spare = spare;
}


}
