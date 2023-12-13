package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class BlhBillLimitHdDMO   extends DBO implements Serializable{

	private Integer blhSubscriberId;
	private String blhServiceCode;
	private BigDecimal blhBillLimitVal;
	private String blhLevel;
	private String blhType;
	private String blhVatInd;
	private BigDecimal blhUnbillUsage;
	private BigDecimal blhUnbillCharges;
	private Integer blhDiff;
	private String blhUserStatus;
	private BigDecimal blhNextThreshold;
	private BigDecimal blhPrevThreshold;
	private Integer blhNextacnId;
	private Integer blhPrevacnId;
	private String blhNetworkAcn;
	private String blhTrigFlag;
	private DateTime blhLastUpdate;
	
	
	public static final int blhSubscriberIdFilter = 0;

	public static final int blhServiceCodeFilter = 1;
	public static final int blhServiceCodeSize = 5;

	public static final int blhBillLimitValFilter = 2;

	public static final int blhLevelFilter = 3;
	public static final int blhLevelSize = 1;

	public static final int blhTypeFilter = 4;
	public static final int blhTypeSize = 1;

	public static final int blhVatIndFilter = 5;
	public static final int blhVatIndSize = 1;

	public static final int blhUnbillUsageFilter = 6;
	public static final int blhUnbillChargesFilter = 7;
	public static final int blhDiffFilter = 8;

	public static final int blhUserStatusFilter = 9;
	public static final int blhUserStatusSize = 1;

	public static final int blhNextThresholdFilter = 10;
	public static final int blhPrevThresholdFilter = 11;
	public static final int blhNextacnIdFilter = 12;
	public static final int blhPrevacnIdFilter = 13;

	public static final int blhNetworkAcnFilter = 14;
	public static final int blhNetworkAcnSize = 3;

	public static final int blhTrigFlagFilter = 15;
	public static final int blhTrigFlagSize = 1;

	public static final int blhLastUpdateFilter = 16;
	
	private static final int[] fieldTypes = new int[]{
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_BIGDECIMAL,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_BIGDECIMAL,
		FIELD_TYPE_BIGDECIMAL,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,		
		FIELD_TYPE_BIGDECIMAL,
		FIELD_TYPE_BIGDECIMAL,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_DATETIME
	};
	
	private static final int[] fieldSizes = new int[]{
			0,
			blhServiceCodeSize,
			0,
			blhLevelSize,
			blhTypeSize,
			blhVatIndSize,
			0,
			0,
			0,
			blhUserStatusSize,
			0,
			0,
			0,
			0,
			blhNetworkAcnSize,
			blhTrigFlagSize,
			0
		};
	
	public BlhBillLimitHdDMO(){
		
	}
	
	public BlhBillLimitHdDMO(final Integer blhSubscriberId,
	final String blhServiceCode,
	final BigDecimal blhBillLimitVal,
	final String blhLevel,
	final String blhType,
	final String blhVatInd,
	final BigDecimal blhUnbillUsage,
	final BigDecimal blhUnbillCharges,
	final Integer blhDiff,
	final String blhUserStatus,
	final BigDecimal blhNextThreshold,
	final BigDecimal blhPrevThreshold,
	final Integer blhNextacnId,
	final Integer blhPrevacnId,
	final String blhNetworkAcn,
	final String blhTrigFlag,
	final DateTime blhLastUpdate){
		this.setBlhSubscriberId(blhSubscriberId);
		this.setBlhServiceCode(blhServiceCode);
		this.setBlhBillLimitVal(blhBillLimitVal);
		this.setBlhLevel(blhLevel);
		this.setBlhType(blhType);
		this.setBlhVatInd(blhVatInd);
		this.setBlhUnbillUsage(blhUnbillUsage);
		this.setBlhUnbillCharges(blhUnbillCharges);
		this.setBlhDiff(blhDiff);
		this.setBlhUserStatus(blhUserStatus);
		this.setBlhNextThreshold(blhNextThreshold);
		this.setBlhPrevThreshold(blhPrevThreshold);
		this.setBlhNextacnId(blhNextacnId);
		this.setBlhPrevacnId(blhPrevacnId);
		this.setBlhNetworkAcn(blhNetworkAcn);
		this.setBlhTrigFlag(blhTrigFlag);
		this.setBlhLastUpdate(blhLastUpdate);	
	}
	
	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub
		
	}

	protected Object[] get() {
		return new Object[]{
		blhSubscriberId,
		(blhServiceCode == null) ? null : (blhServiceCode.length() <= blhServiceCodeSize) ? blhServiceCode : blhServiceCode.substring(0, blhServiceCodeSize),
		blhBillLimitVal,
		(blhLevel == null) ? null : (blhLevel.length() <= blhLevelSize) ? blhLevel : blhLevel.substring(0, blhLevelSize),
		(blhType == null) ? null : (blhType.length() <= blhTypeSize) ? blhType : blhType.substring(0, blhTypeSize),
		(blhVatInd == null) ? null : (blhVatInd.length() <= blhVatIndSize) ? blhVatInd : blhVatInd.substring(0, blhVatIndSize),
		blhUnbillUsage,
		blhUnbillCharges,
		blhDiff,
		(blhUserStatus == null) ? null : (blhUserStatus.length() <= blhUserStatusSize) ? blhUserStatus : blhUserStatus.substring(0, blhUserStatusSize),
		blhNextThreshold,
		blhPrevThreshold,
		blhNextacnId,
		blhPrevacnId,
		(blhNetworkAcn == null) ? null : (blhNetworkAcn.length() <= blhNetworkAcnSize) ? blhNetworkAcn : blhNetworkAcn.substring(0, blhNetworkAcnSize),
		(blhTrigFlag == null) ? null : (blhTrigFlag.length() <= blhTrigFlagSize) ? blhTrigFlag : blhTrigFlag.substring(0, blhTrigFlagSize),
		blhLastUpdate
		};
	}
	
	protected void set(final Integer blhSubscriberId,
			final String blhServiceCode,
			final BigDecimal blhBillLimitVal,
			final String blhLevel,
			final String blhType,
			final String blhVatInd,
			final BigDecimal blhUnbillUsage,
			final BigDecimal blhUnbillCharges,
			final Integer blhDiff,
			final String blhUserStatus,
			final BigDecimal blhNextThreshold,
			final BigDecimal blhPrevThreshold,
			final Integer blhNextacnId,
			final Integer blhPrevacnId,
			final String blhNetworkAcn,
			final String blhTrigFlag,
			final DateTime blhLastUpdate){
				this.setBlhSubscriberId(blhSubscriberId);
				this.setBlhServiceCode(blhServiceCode);
				this.setBlhBillLimitVal(blhBillLimitVal);
				this.setBlhLevel(blhLevel);
				this.setBlhType(blhType);
				this.setBlhVatInd(blhVatInd);
				this.setBlhUnbillUsage(blhUnbillUsage);
				this.setBlhUnbillCharges(blhUnbillCharges);
				this.setBlhDiff(blhDiff);
				this.setBlhUserStatus(blhUserStatus);
				this.setBlhNextThreshold(blhNextThreshold);
				this.setBlhPrevThreshold(blhPrevThreshold);
				this.setBlhNextacnId(blhNextacnId);
				this.setBlhPrevacnId(blhPrevacnId);
				this.setBlhNetworkAcn(blhNetworkAcn);
				this.setBlhTrigFlag(blhTrigFlag);
				this.setBlhLastUpdate(blhLastUpdate);	
			}

	protected Integer versionNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
		// TODO Auto-generated method stub
		
	}

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs(2).arg(this.blhSubscriberId).arg((this.blhServiceCode == null) ? null : (this.blhServiceCode.trim()));
	}

	protected void set(Object[] fields) {
		this.setBlhSubscriberId((Integer)fields[0]);
		this.setBlhServiceCode(rtrim((String)fields[1]));
		this.setBlhBillLimitVal((BigDecimal)fields[2]);
		this.setBlhLevel(rtrim((String)fields[3]));
		this.setBlhType(rtrim((String)fields[4]));
		this.setBlhVatInd(rtrim((String)fields[5]));
		this.setBlhUnbillUsage((BigDecimal)fields[6]);
		this.setBlhUnbillCharges((BigDecimal)fields[7]);
		this.setBlhDiff((Integer)fields[8]);
		this.setBlhUserStatus(rtrim((String)fields[9]));
		this.setBlhNextThreshold((BigDecimal)fields[10]);
		this.setBlhPrevThreshold((BigDecimal)fields[11]);
		this.setBlhNextacnId((Integer)fields[12]);
		this.setBlhPrevacnId((Integer)fields[13]);
		this.setBlhNetworkAcn(rtrim((String)fields[14]));
		this.setBlhTrigFlag(rtrim((String)fields[15]));
		this.setBlhLastUpdate((DateTime)fields[16]);		
	}
	
	public Integer getBlhSubscriberId() {
		return blhSubscriberId;
	}

	public void setBlhSubscriberId(Integer blhSubscriberId) {
		this.blhSubscriberId = blhSubscriberId;
	}

	public String getBlhServiceCode() {
		return blhServiceCode;
	}

	public void setBlhServiceCode(String blhServiceCode) {
		this.blhServiceCode = blhServiceCode;
	}

	public BigDecimal getBlhBillLimitVal() {
		return blhBillLimitVal;
	}

	public void setBlhBillLimitVal(BigDecimal blhBillLimitVal) {
		this.blhBillLimitVal = blhBillLimitVal;
	}

	public String getBlhLevel() {
		return blhLevel;
	}

	public void setBlhLevel(String blhLevel) {
		this.blhLevel = blhLevel;
	}

	public String getBlhType() {
		return blhType;
	}

	public void setBlhType(String blhType) {
		this.blhType = blhType;
	}

	public String getBlhVatInd() {
		return blhVatInd;
	}

	public void setBlhVatInd(String blhVatInd) {
		this.blhVatInd = blhVatInd;
	}

	public BigDecimal getBlhUnbillUsage() {
		return blhUnbillUsage;
	}

	public void setBlhUnbillUsage(BigDecimal blhUnbillUsage) {
		this.blhUnbillUsage = blhUnbillUsage;
	}

	public BigDecimal getBlhUnbillCharges() {
		return blhUnbillCharges;
	}

	public void setBlhUnbillCharges(BigDecimal blhUnbillCharges) {
		this.blhUnbillCharges = blhUnbillCharges;
	}

	public Integer getBlhDiff() {
		return blhDiff;
	}

	public void setBlhDiff(Integer blhDiff) {
		this.blhDiff = blhDiff;
	}

	public String getBlhUserStatus() {
		return blhUserStatus;
	}

	public void setBlhUserStatus(String blhUserStatus) {
		this.blhUserStatus = blhUserStatus;
	}

	public BigDecimal getBlhNextThreshold() {
		return blhNextThreshold;
	}

	public void setBlhNextThreshold(BigDecimal blhNextThreshold) {
		this.blhNextThreshold = blhNextThreshold;
	}

	public BigDecimal getBlhPrevThreshold() {
		return blhPrevThreshold;
	}

	public void setBlhPrevThreshold(BigDecimal blhPrevThreshold) {
		this.blhPrevThreshold = blhPrevThreshold;
	}

	public Integer getBlhNextacnId() {
		return blhNextacnId;
	}

	public void setBlhNextacnId(Integer blhNextacnId) {
		this.blhNextacnId = blhNextacnId;
	}

	public Integer getBlhPrevacnId() {
		return blhPrevacnId;
	}

	public void setBlhPrevacnId(Integer blhPrevacnId) {
		this.blhPrevacnId = blhPrevacnId;
	}

	public String getBlhNetworkAcn() {
		return blhNetworkAcn;
	}

	public void setBlhNetworkAcn(String blhNetworkAcn) {
		this.blhNetworkAcn = blhNetworkAcn;
	}

	public String getBlhTrigFlag() {
		return blhTrigFlag;
	}

	public void setBlhTrigFlag(String blhTrigFlag) {
		this.blhTrigFlag = blhTrigFlag;
	}

	public DateTime getBlhLastUpdate() {
		return blhLastUpdate;
	}

	public void setBlhLastUpdate(DateTime blhLastUpdate) {
		this.blhLastUpdate = blhLastUpdate;
	}
}
