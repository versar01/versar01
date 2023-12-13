package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class StquemDMO extends DBO implements Serializable {


private String warehouse;
private String product;
private String sequenceNumber;
private String prodCode;
private String serialNumber;
private String batchNumber;
private Date dateReceived;
private String binNumber;
private String lotNumber;
private Date expiryDate;
private String passedInspection;
private String inspectorCode;
private Date inspectionDate;
private String sourceCode;
private String conformityRef;
private BigDecimal quantity;
private BigDecimal quantityFree;
private BigDecimal unitCost;
private BigDecimal labourCost;
private BigDecimal overheadCost;
private BigDecimal subContractCost;
private BigDecimal concentration;
private BigDecimal usersField1;
private BigDecimal usersField2;
private BigDecimal usersField3;
private String usersTextField;
private String spare;
private String expiryDateKey;
private String sellbyDateKey;
private String bestDateKey;
private Date sellByDate;
private Date bestBeforeDate;



public static final int uniqueNoFilter = 0;
private static final int uniqueNoSize = 2;


public static final int warehouseFilter = 1;
private static final int warehouseSize = 2;


public static final int productFilter = 2;
private static final int productSize = 20;


public static final int sequenceNumberFilter = 3;
private static final int sequenceNumberSize = 6;


public static final int prodCodeFilter = 4;
private static final int prodCodeSize = 20;


public static final int serialNumberFilter = 5;
private static final int serialNumberSize = 20;


public static final int batchNumberFilter = 6;
private static final int batchNumberSize = 10;


public static final int dateReceivedFilter = 7;

public static final int binNumberFilter = 8;
private static final int binNumberSize = 10;


public static final int lotNumberFilter = 9;
private static final int lotNumberSize = 10;


public static final int expiryDateFilter = 10;

public static final int passedInspectionFilter = 11;
private static final int passedInspectionSize = 1;


public static final int inspectorCodeFilter = 12;
private static final int inspectorCodeSize = 4;


public static final int inspectionDateFilter = 13;

public static final int sourceCodeFilter = 14;
private static final int sourceCodeSize = 10;


public static final int conformityRefFilter = 15;
private static final int conformityRefSize = 20;


public static final int quantityFilter = 16;

public static final int quantityFreeFilter = 17;

public static final int unitCostFilter = 18;

public static final int labourCostFilter = 19;

public static final int overheadCostFilter = 20;

public static final int subContractCostFilter = 21;

public static final int concentrationFilter = 22;

public static final int usersField1Filter = 23;

public static final int usersField2Filter = 24;

public static final int usersField3Filter = 25;

public static final int usersTextFieldFilter = 26;
private static final int usersTextFieldSize = 10;


public static final int spareFilter = 27;
private static final int spareSize = 6;


public static final int expiryDateKeyFilter = 28;
private static final int expiryDateKeySize = 28;


public static final int sellbyDateKeyFilter = 29;
private static final int sellbyDateKeySize = 28;


public static final int bestDateKeyFilter = 30;
private static final int bestDateKeySize = 28;


public static final int sellByDateFilter = 31;

public static final int bestBeforeDateFilter = 32;




public StquemDMO(){};

public StquemDMO(
final String warehouse,
final String product,
final String sequenceNumber,
final String prodCode,
final String serialNumber,
final String batchNumber,
final Date dateReceived,
final String binNumber,
final String lotNumber,
final Date expiryDate,
final String passedInspection,
final String inspectorCode,
final Date inspectionDate,
final String sourceCode,
final String conformityRef,
final BigDecimal quantity,
final BigDecimal quantityFree,
final BigDecimal unitCost,
final BigDecimal labourCost,
final BigDecimal overheadCost,
final BigDecimal subContractCost,
final BigDecimal concentration,
final BigDecimal usersField1,
final BigDecimal usersField2,
final BigDecimal usersField3,
final String usersTextField,
final String spare,
final String expiryDateKey,
final String sellbyDateKey,
final String bestDateKey,
final Date sellByDate,
final Date bestBeforeDate
){


this.warehouse = warehouse;
this.product = product;
this.sequenceNumber = sequenceNumber;
this.prodCode = prodCode;
this.serialNumber = serialNumber;
this.batchNumber = batchNumber;
this.dateReceived = dateReceived;
this.binNumber = binNumber;
this.lotNumber = lotNumber;
this.expiryDate = expiryDate;
this.passedInspection = passedInspection;
this.inspectorCode = inspectorCode;
this.inspectionDate = inspectionDate;
this.sourceCode = sourceCode;
this.conformityRef = conformityRef;
this.quantity = quantity;
this.quantityFree = quantityFree;
this.unitCost = unitCost;
this.labourCost = labourCost;
this.overheadCost = overheadCost;
this.subContractCost = subContractCost;
this.concentration = concentration;
this.usersField1 = usersField1;
this.usersField2 = usersField2;
this.usersField3 = usersField3;
this.usersTextField = usersTextField;
this.spare = spare;
this.expiryDateKey = expiryDateKey;
this.sellbyDateKey = sellbyDateKey;
this.bestDateKey = bestDateKey;
this.sellByDate = sellByDate;
this.bestBeforeDate = bestBeforeDate;
};


private static final int[] fieldSizes = new int[]{
uniqueNoSize,
warehouseSize,
productSize,
sequenceNumberSize,
prodCodeSize,
serialNumberSize,
batchNumberSize,
0,
binNumberSize,
lotNumberSize,
0,
passedInspectionSize,
inspectorCodeSize,
0,
sourceCodeSize,
conformityRefSize,
0,
0,
0,
0,
0,
0,
0,
0,
0,
0,
usersTextFieldSize,
spareSize,
expiryDateKeySize,
sellbyDateKeySize,
bestDateKeySize,
0,
0
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{((this.warehouse == null) ? null : (this.warehouse.length() <= warehouseSize) ? this.warehouse : this.warehouse.substring(0, this.warehouseSize)),
			((this.product == null) ? null : (this.product.length() <= productSize) ? this.product : this.product.substring(0, this.productSize)),
			((this.sequenceNumber == null) ? null : (this.sequenceNumber.length() <= sequenceNumberSize) ? this.sequenceNumber : this.sequenceNumber.substring(0, this.sequenceNumberSize)),
			((this.prodCode == null) ? null : (this.prodCode.length() <= prodCodeSize) ? this.prodCode : this.prodCode.substring(0, this.prodCodeSize)),
			((this.serialNumber == null) ? null : (this.serialNumber.length() <= serialNumberSize) ? this.serialNumber : this.serialNumber.substring(0, this.serialNumberSize)),
			((this.batchNumber == null) ? null : (this.batchNumber.length() <= batchNumberSize) ? this.batchNumber : this.batchNumber.substring(0, this.batchNumberSize)),
			this.dateReceived,
			((this.binNumber == null) ? null : (this.binNumber.length() <= binNumberSize) ? this.binNumber : this.binNumber.substring(0, this.binNumberSize)),
			((this.lotNumber == null) ? null : (this.lotNumber.length() <= lotNumberSize) ? this.lotNumber : this.lotNumber.substring(0, this.lotNumberSize)),
			this.expiryDate,
			((this.passedInspection == null) ? null : (this.passedInspection.length() <= passedInspectionSize) ? this.passedInspection : this.passedInspection.substring(0, this.passedInspectionSize)),
			((this.inspectorCode == null) ? null : (this.inspectorCode.length() <= inspectorCodeSize) ? this.inspectorCode : this.inspectorCode.substring(0, this.inspectorCodeSize)),
			this.inspectionDate,
			((this.sourceCode == null) ? null : (this.sourceCode.length() <= sourceCodeSize) ? this.sourceCode : this.sourceCode.substring(0, this.sourceCodeSize)),
			((this.conformityRef == null) ? null : (this.conformityRef.length() <= conformityRefSize) ? this.conformityRef : this.conformityRef.substring(0, this.conformityRefSize)),
			this.quantity,
			this.quantityFree,
			this.unitCost,
			this.labourCost,
			this.overheadCost,
			this.subContractCost,
			this.concentration,
			this.usersField1,
			this.usersField2,
			this.usersField3,
			((this.usersTextField == null) ? null : (this.usersTextField.length() <= usersTextFieldSize) ? this.usersTextField : this.usersTextField.substring(0, this.usersTextFieldSize)),
			((this.spare == null) ? null : (this.spare.length() <= spareSize) ? this.spare : this.spare.substring(0, this.spareSize)),
			((this.expiryDateKey == null) ? null : (this.expiryDateKey.length() <= expiryDateKeySize) ? this.expiryDateKey : this.expiryDateKey.substring(0, this.expiryDateKeySize)),
			((this.sellbyDateKey == null) ? null : (this.sellbyDateKey.length() <= sellbyDateKeySize) ? this.sellbyDateKey : this.sellbyDateKey.substring(0, this.sellbyDateKeySize)),
			((this.bestDateKey == null) ? null : (this.bestDateKey.length() <= bestDateKeySize) ? this.bestDateKey : this.bestDateKey.substring(0, this.bestDateKeySize)),
			this.sellByDate,
			this.bestBeforeDate
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
	return new DAOArgs(3).arg(this.warehouse).arg(this.product).arg(this.sequenceNumber); 
}



protected void set(Object[] fields) {
this.warehouse = rtrim((String)fields[0]);
this.product = rtrim((String)fields[1]);
this.sequenceNumber = rtrim((String)fields[2]);
this.prodCode = rtrim((String)fields[3]);
this.serialNumber = rtrim((String)fields[4]);
this.batchNumber = rtrim((String)fields[5]);
this.dateReceived = ((fields[6] == null)? null : new Date(fields[6]));
this.binNumber = rtrim((String)fields[7]);
this.lotNumber = rtrim((String)fields[8]);
this.expiryDate = ((fields[9] == null)? null : new Date(fields[9]));
this.passedInspection = rtrim((String)fields[10]);
this.inspectorCode = rtrim((String)fields[11]);
this.inspectionDate = ((fields[12] == null)? null : new Date(fields[12]));
this.sourceCode = rtrim((String)fields[13]);
this.conformityRef = rtrim((String)fields[14]);
this.quantity = ((BigDecimal)fields[15]);
this.quantityFree = ((BigDecimal)fields[16]);
this.unitCost = ((BigDecimal)fields[17]);
this.labourCost = ((BigDecimal)fields[18]);
this.overheadCost = ((BigDecimal)fields[19]);
this.subContractCost = ((BigDecimal)fields[20]);
this.concentration = ((BigDecimal)fields[21]);
this.usersField1 = ((BigDecimal)fields[22]);
this.usersField2 = ((BigDecimal)fields[23]);
this.usersField3 = ((BigDecimal)fields[24]);
this.usersTextField = rtrim((String)fields[25]);
this.spare = rtrim((String)fields[26]);
this.expiryDateKey = rtrim((String)fields[27]);
this.sellbyDateKey = rtrim((String)fields[28]);
this.bestDateKey = rtrim((String)fields[29]);
this.sellByDate = ((fields[30] == null)? null : new Date(fields[30]));
this.bestBeforeDate = ((fields[31] == null)? null : new Date(fields[31]));
}


public void set(
final String warehouse,
final String product,
final String sequenceNumber,
final String prodCode,
final String serialNumber,
final String batchNumber,
final Date dateReceived,
final String binNumber,
final String lotNumber,
final Date expiryDate,
final String passedInspection,
final String inspectorCode,
final Date inspectionDate,
final String sourceCode,
final String conformityRef,
final BigDecimal quantity,
final BigDecimal quantityFree,
final BigDecimal unitCost,
final BigDecimal labourCost,
final BigDecimal overheadCost,
final BigDecimal subContractCost,
final BigDecimal concentration,
final BigDecimal usersField1,
final BigDecimal usersField2,
final BigDecimal usersField3,
final String usersTextField,
final String spare,
final String expiryDateKey,
final String sellbyDateKey,
final String bestDateKey,
final Date sellByDate,
final Date bestBeforeDate
)
{

this.warehouse = warehouse;
this.product = product;
this.sequenceNumber = sequenceNumber;
this.prodCode = prodCode;
this.serialNumber = serialNumber;
this.batchNumber = batchNumber;
this.dateReceived = dateReceived;
this.binNumber = binNumber;
this.lotNumber = lotNumber;
this.expiryDate = expiryDate;
this.passedInspection = passedInspection;
this.inspectorCode = inspectorCode;
this.inspectionDate = inspectionDate;
this.sourceCode = sourceCode;
this.conformityRef = conformityRef;
this.quantity = quantity;
this.quantityFree = quantityFree;
this.unitCost = unitCost;
this.labourCost = labourCost;
this.overheadCost = overheadCost;
this.subContractCost = subContractCost;
this.concentration = concentration;
this.usersField1 = usersField1;
this.usersField2 = usersField2;
this.usersField3 = usersField3;
this.usersTextField = usersTextField;
this.spare = spare;
this.expiryDateKey = expiryDateKey;
this.sellbyDateKey = sellbyDateKey;
this.bestDateKey = bestDateKey;
this.sellByDate = sellByDate;
this.bestBeforeDate = bestBeforeDate;
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

public String getSequenceNumber() {
	return sequenceNumber;
}

public void setSequenceNumber(String sequenceNumber) {
	this.sequenceNumber = sequenceNumber;
}

public String getProdCode() {
	return prodCode;
}

public void setProdCode(String prodCode) {
	this.prodCode = prodCode;
}

public String getSerialNumber() {
	return serialNumber;
}

public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}

public String getBatchNumber() {
	return batchNumber;
}

public void setBatchNumber(String batchNumber) {
	this.batchNumber = batchNumber;
}

public Date getDateReceived() {
	return dateReceived;
}

public void setDateReceived(Date dateReceived) {
	this.dateReceived = dateReceived;
}

public String getBinNumber() {
	return binNumber;
}

public void setBinNumber(String binNumber) {
	this.binNumber = binNumber;
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

public String getPassedInspection() {
	return passedInspection;
}

public void setPassedInspection(String passedInspection) {
	this.passedInspection = passedInspection;
}

public String getInspectorCode() {
	return inspectorCode;
}

public void setInspectorCode(String inspectorCode) {
	this.inspectorCode = inspectorCode;
}

public Date getInspectionDate() {
	return inspectionDate;
}

public void setInspectionDate(Date inspectionDate) {
	this.inspectionDate = inspectionDate;
}

public String getSourceCode() {
	return sourceCode;
}

public void setSourceCode(String sourceCode) {
	this.sourceCode = sourceCode;
}

public String getConformityRef() {
	return conformityRef;
}

public void setConformityRef(String conformityRef) {
	this.conformityRef = conformityRef;
}

public BigDecimal getQuantity() {
	return quantity;
}

public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
}

public BigDecimal getQuantityFree() {
	return quantityFree;
}

public void setQuantityFree(BigDecimal quantityFree) {
	this.quantityFree = quantityFree;
}

public BigDecimal getUnitCost() {
	return unitCost;
}

public void setUnitCost(BigDecimal unitCost) {
	this.unitCost = unitCost;
}

public BigDecimal getLabourCost() {
	return labourCost;
}

public void setLabourCost(BigDecimal labourCost) {
	this.labourCost = labourCost;
}

public BigDecimal getOverheadCost() {
	return overheadCost;
}

public void setOverheadCost(BigDecimal overheadCost) {
	this.overheadCost = overheadCost;
}

public BigDecimal getSubContractCost() {
	return subContractCost;
}

public void setSubContractCost(BigDecimal subContractCost) {
	this.subContractCost = subContractCost;
}

public BigDecimal getConcentration() {
	return concentration;
}

public void setConcentration(BigDecimal concentration) {
	this.concentration = concentration;
}

public BigDecimal getUsersField1() {
	return usersField1;
}

public void setUsersField1(BigDecimal usersField1) {
	this.usersField1 = usersField1;
}

public BigDecimal getUsersField2() {
	return usersField2;
}

public void setUsersField2(BigDecimal usersField2) {
	this.usersField2 = usersField2;
}

public BigDecimal getUsersField3() {
	return usersField3;
}

public void setUsersField3(BigDecimal usersField3) {
	this.usersField3 = usersField3;
}

public String getUsersTextField() {
	return usersTextField;
}

public void setUsersTextField(String usersTextField) {
	this.usersTextField = usersTextField;
}

public String getSpare() {
	return spare;
}

public void setSpare(String spare) {
	this.spare = spare;
}

public String getExpiryDateKey() {
	return expiryDateKey;
}

public void setExpiryDateKey(String expiryDateKey) {
	this.expiryDateKey = expiryDateKey;
}

public String getSellbyDateKey() {
	return sellbyDateKey;
}

public void setSellbyDateKey(String sellbyDateKey) {
	this.sellbyDateKey = sellbyDateKey;
}

public String getBestDateKey() {
	return bestDateKey;
}

public void setBestDateKey(String bestDateKey) {
	this.bestDateKey = bestDateKey;
}

public Date getSellByDate() {
	return sellByDate;
}

public void setSellByDate(Date sellByDate) {
	this.sellByDate = sellByDate;
}

public Date getBestBeforeDate() {
	return bestBeforeDate;
}

public void setBestBeforeDate(Date bestBeforeDate) {
	this.bestBeforeDate = bestBeforeDate;
}


}
