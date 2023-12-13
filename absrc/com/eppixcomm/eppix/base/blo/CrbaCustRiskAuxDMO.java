package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;



public class CrbaCustRiskAuxDMO extends DBO implements Serializable {


private String crbaBillAcNo;
private BigDecimal crbaAccDiscVal;
private BigDecimal crbaAuxFloat1;
private BigDecimal crbaAuxFloat2;
private BigDecimal crbaAuxFloat3;
private BigDecimal crbaAuxInt1;
private BigDecimal crbaAuxInt2;
private BigDecimal crbaAuxInt3;
private String crbaAuxChar1;
private String crbaAuxChar2;
private String crbaAuxChar3;
private DateTime crbaAuxDate1;
private DateTime crbaAuxDate2;
private DateTime crbaAuxDate3;



public static final int crbaBillAcNoFilter = 0;
private static final int crbaBillAcNoSize = 8;


public static final int crbaAccDiscValFilter = 1;

public static final int crbaAuxFloat1Filter = 2;

public static final int crbaAuxFloat2Filter = 3;

public static final int crbaAuxFloat3Filter = 4;

public static final int crbaAuxInt1Filter = 5;

public static final int crbaAuxInt2Filter = 6;

public static final int crbaAuxInt3Filter = 7;

public static final int crbaAuxChar1Filter = 8;
private static final int crbaAuxChar1Size = 30;


public static final int crbaAuxChar2Filter = 9;
private static final int crbaAuxChar2Size = 30;


public static final int crbaAuxChar3Filter = 10;
private static final int crbaAuxChar3Size = 30;


public static final int crbaAuxDate1Filter = 11;

public static final int crbaAuxDate2Filter = 12;

public static final int crbaAuxDate3Filter = 13;




public CrbaCustRiskAuxDMO(){};

public CrbaCustRiskAuxDMO(final String crbaBillAcNo,
final BigDecimal crbaAccDiscVal,
final BigDecimal crbaAuxFloat1,
final BigDecimal crbaAuxFloat2,
final BigDecimal crbaAuxFloat3,
final BigDecimal crbaAuxInt1,
final BigDecimal crbaAuxInt2,
final BigDecimal crbaAuxInt3,
final String crbaAuxChar1,
final String crbaAuxChar2,
final String crbaAuxChar3,
final DateTime crbaAuxDate1,
final DateTime crbaAuxDate2,
final DateTime crbaAuxDate3
){

this.crbaBillAcNo = crbaBillAcNo;
this.crbaAccDiscVal = crbaAccDiscVal;
this.crbaAuxFloat1 = crbaAuxFloat1;
this.crbaAuxFloat2 = crbaAuxFloat2;
this.crbaAuxFloat3 = crbaAuxFloat3;
this.crbaAuxInt1 = crbaAuxInt1;
this.crbaAuxInt2 = crbaAuxInt2;
this.crbaAuxInt3 = crbaAuxInt3;
this.crbaAuxChar1 = crbaAuxChar1;
this.crbaAuxChar2 = crbaAuxChar2;
this.crbaAuxChar3 = crbaAuxChar3;
this.crbaAuxDate1 = crbaAuxDate1;
this.crbaAuxDate2 = crbaAuxDate2;
this.crbaAuxDate3 = crbaAuxDate3;
};


private static final int[] fieldSizes = new int[]{
crbaBillAcNoSize,
0,
0,
0,
0,
0,
0,
0,
crbaAuxChar1Size,
crbaAuxChar2Size,
crbaAuxChar3Size,
0,
0,
0
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_STRING,
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
FIELD_TYPE_DATETIME,
FIELD_TYPE_DATETIME,
FIELD_TYPE_DATETIME
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{			((this.crbaBillAcNo == null) ? null : (this.crbaBillAcNo.length() <= crbaBillAcNoSize) ? this.crbaBillAcNo : this.crbaBillAcNo.substring(0, this.crbaBillAcNoSize)),
			this.crbaAccDiscVal,
			this.crbaAuxFloat1,
			this.crbaAuxFloat2,
			this.crbaAuxFloat3,
			this.crbaAuxInt1,
			this.crbaAuxInt2,
			this.crbaAuxInt3,
			((this.crbaAuxChar1 == null) ? null : (this.crbaAuxChar1.length() <= crbaAuxChar1Size) ? this.crbaAuxChar1 : this.crbaAuxChar1.substring(0, this.crbaAuxChar1Size)),
			((this.crbaAuxChar2 == null) ? null : (this.crbaAuxChar2.length() <= crbaAuxChar2Size) ? this.crbaAuxChar2 : this.crbaAuxChar2.substring(0, this.crbaAuxChar2Size)),
			((this.crbaAuxChar3 == null) ? null : (this.crbaAuxChar3.length() <= crbaAuxChar3Size) ? this.crbaAuxChar3 : this.crbaAuxChar3.substring(0, this.crbaAuxChar3Size)),
			this.crbaAuxDate1,
			this.crbaAuxDate2,
			this.crbaAuxDate3
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
	DAOArgs args = new DAOArgs(1).arg(this.crbaBillAcNo);
	return args; 
}



protected void set(Object[] fields) {
this.crbaBillAcNo = rtrim((String)fields[0]);
this.crbaAccDiscVal = ((BigDecimal)fields[1]);
this.crbaAuxFloat1 = ((BigDecimal)fields[2]);
this.crbaAuxFloat2 = ((BigDecimal)fields[3]);
this.crbaAuxFloat3 = ((BigDecimal)fields[4]);
this.crbaAuxInt1 = ((BigDecimal)fields[5]);
this.crbaAuxInt2 = ((BigDecimal)fields[6]);
this.crbaAuxInt3 = ((BigDecimal)fields[7]);
this.crbaAuxChar1 = rtrim((String)fields[8]);
this.crbaAuxChar2 = rtrim((String)fields[9]);
this.crbaAuxChar3 = rtrim((String)fields[10]);
this.crbaAuxDate1 = (fields[11] == null)? null : (DateTime) fields[11];
this.crbaAuxDate2 = (fields[12] == null)? null : (DateTime) fields[12];
this.crbaAuxDate3 = (fields[13] == null)? null : (DateTime) fields[13];
}


public void set(
final String crbaBillAcNo,
final BigDecimal crbaAccDiscVal,
final BigDecimal crbaAuxFloat1,
final BigDecimal crbaAuxFloat2,
final BigDecimal crbaAuxFloat3,
final BigDecimal crbaAuxInt1,
final BigDecimal crbaAuxInt2,
final BigDecimal crbaAuxInt3,
final String crbaAuxChar1,
final String crbaAuxChar2,
final String crbaAuxChar3,
final DateTime crbaAuxDate1,
final DateTime crbaAuxDate2,
final DateTime crbaAuxDate3
)
{

this.crbaBillAcNo = crbaBillAcNo;
this.crbaAccDiscVal = crbaAccDiscVal;
this.crbaAuxFloat1 = crbaAuxFloat1;
this.crbaAuxFloat2 = crbaAuxFloat2;
this.crbaAuxFloat3 = crbaAuxFloat3;
this.crbaAuxInt1 = crbaAuxInt1;
this.crbaAuxInt2 = crbaAuxInt2;
this.crbaAuxInt3 = crbaAuxInt3;
this.crbaAuxChar1 = crbaAuxChar1;
this.crbaAuxChar2 = crbaAuxChar2;
this.crbaAuxChar3 = crbaAuxChar3;
this.crbaAuxDate1 = crbaAuxDate1;
this.crbaAuxDate2 = crbaAuxDate2;
this.crbaAuxDate3 = crbaAuxDate3;
}

public String getCrbaBillAcNo() {
	return crbaBillAcNo;
}

public void setCrbaBillAcNo(String crbaBillAcNo) {
	this.crbaBillAcNo = crbaBillAcNo;
}

public BigDecimal getCrbaAccDiscVal() {
	return crbaAccDiscVal;
}

public void setCrbaAccDiscVal(BigDecimal crbaAccDiscVal) {
	this.crbaAccDiscVal = crbaAccDiscVal;
}

public BigDecimal getCrbaAuxFloat1() {
	return crbaAuxFloat1;
}

public void setCrbaAuxFloat1(BigDecimal crbaAuxFloat1) {
	this.crbaAuxFloat1 = crbaAuxFloat1;
}

public BigDecimal getCrbaAuxFloat2() {
	return crbaAuxFloat2;
}

public void setCrbaAuxFloat2(BigDecimal crbaAuxFloat2) {
	this.crbaAuxFloat2 = crbaAuxFloat2;
}

public BigDecimal getCrbaAuxFloat3() {
	return crbaAuxFloat3;
}

public void setCrbaAuxFloat3(BigDecimal crbaAuxFloat3) {
	this.crbaAuxFloat3 = crbaAuxFloat3;
}

public BigDecimal getCrbaAuxInt1() {
	return crbaAuxInt1;
}

public void setCrbaAuxInt1(BigDecimal crbaAuxInt1) {
	this.crbaAuxInt1 = crbaAuxInt1;
}

public BigDecimal getCrbaAuxInt2() {
	return crbaAuxInt2;
}

public void setCrbaAuxInt2(BigDecimal crbaAuxInt2) {
	this.crbaAuxInt2 = crbaAuxInt2;
}

public BigDecimal getCrbaAuxInt3() {
	return crbaAuxInt3;
}

public void setCrbaAuxInt3(BigDecimal crbaAuxInt3) {
	this.crbaAuxInt3 = crbaAuxInt3;
}

public String getCrbaAuxChar1() {
	return crbaAuxChar1;
}

public void setCrbaAuxChar1(String crbaAuxChar1) {
	this.crbaAuxChar1 = crbaAuxChar1;
}

public String getCrbaAuxChar2() {
	return crbaAuxChar2;
}

public void setCrbaAuxChar2(String crbaAuxChar2) {
	this.crbaAuxChar2 = crbaAuxChar2;
}

public String getCrbaAuxChar3() {
	return crbaAuxChar3;
}

public void setCrbaAuxChar3(String crbaAuxChar3) {
	this.crbaAuxChar3 = crbaAuxChar3;
}

public DateTime getCrbaAuxDate1() {
	return crbaAuxDate1;
}

public void setCrbaAuxDate1(DateTime crbaAuxDate1) {
	this.crbaAuxDate1 = crbaAuxDate1;
}

public DateTime getCrbaAuxDate2() {
	return crbaAuxDate2;
}

public void setCrbaAuxDate2(DateTime crbaAuxDate2) {
	this.crbaAuxDate2 = crbaAuxDate2;
}

public DateTime getCrbaAuxDate3() {
	return crbaAuxDate3;
}

public void setCrbaAuxDate3(DateTime crbaAuxDate3) {
	this.crbaAuxDate3 = crbaAuxDate3;
}

}