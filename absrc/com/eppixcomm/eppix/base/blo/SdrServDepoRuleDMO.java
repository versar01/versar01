package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SdrServDepoRuleDMO extends DBO
implements Serializable {

	private String sdrPackageCode;
	private String sdrServiceCode;
	private Integer sdrVerRuleNum;
	private String sdrReasonId;
	private BigDecimal sdrDepositAmount;
	private String sdrReleaseFlag;
	private Integer sdrReleaseType;
	private String sdrReleaseTgId;
	private String sdrReleUserId;
	private String sdrReleLetterId;
	private Integer sdrRelDelayDays;
	private Integer sdrPendingType;
	private String sdrPendTgId;
	private String sdrPendUserId;
	private Integer sdrPayDelayDays;
	private String sdrOverrideFlag;
	
	
	public static final int sdrPackageCodeFilter = 0;
	private static final int sdrPackageCodeSize = 5;

	public static final int sdrServiceCodeFilter = 1;
	private static final int sdrServiceCodeSize = 4;

	public static final int sdrVerRuleNumFilter = 2;

	public static final int sdrReasonIdFilter = 3;
	private static final int sdrReasonIdSize = 4;

	public static final int sdrDepositAmountFilter = 4;

	public static final int sdrReleaseFlagFilter = 5;
	private static final int sdrReleaseFlagSize = 1;

	public static final int sdrReleaseTypeFilter = 6;

	public static final int sdrReleaseTgIdFilter = 7;
	private static final int sdrReleaseTgIdSize = 10;

	public static final int sdrReleUserIdFilter = 8;
	private static final int sdrReleUserIdSize = 20;

	public static final int sdrReleLetterIdFilter = 9;
	private static final int sdrReleLetterIdSize = 10;

	public static final int sdrRelDelayDaysFilter = 10;

	public static final int sdrPendingTypeFilter = 11;

	public static final int sdrPendTgIdFilter = 12;
	private static final int sdrPendTgIdSize = 10;

	public static final int sdrPendUserIdFilter = 13;
	private static final int sdrPendUserIdSize = 20;

	public static final int sdrPayDelayDaysFilter = 14;

	public static final int sdrOverrideFlagFilter = 15;
	private static final int sdrOverrideFlagSize = 1;
	
	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[]{
				(sdrPackageCode  == null ) ? null : ( ( sdrPackageCode.length(  ) <= sdrPackageCodeSize ) ? sdrPackageCode : sdrPackageCode.substring( 0, sdrPackageCodeSize )),
				( sdrServiceCode == null ) ? null : ( ( sdrServiceCode.length(  ) <= sdrServiceCodeSize ) ?  sdrServiceCode: sdrServiceCode.substring( 0, sdrServiceCodeSize )),
				sdrVerRuleNum,
				( sdrReasonId == null ) ? null : ( ( sdrReasonId.length(  ) <= sdrReasonIdSize ) ? sdrReasonId : sdrReasonId.substring( 0, sdrReasonIdSize )),
				sdrDepositAmount,
				( sdrReleaseFlag == null ) ? null : ( ( sdrReleaseFlag.length(  ) <= sdrReleaseFlagSize ) ? sdrReleaseFlag : sdrReleaseFlag.substring( 0, sdrReleaseFlagSize )),
				sdrReleaseType,
				( sdrReleaseTgId == null ) ? null : ( ( sdrReleaseTgId.length(  ) <= sdrReleaseTgIdSize ) ? sdrReleaseTgId : sdrReleaseTgId.substring( 0, sdrReleaseTgIdSize )),
				( sdrReleUserId == null ) ? null : ( ( sdrReleUserId.length(  ) <= sdrReleUserIdSize ) ? sdrReleUserId : sdrReleUserId.substring( 0, sdrReleUserIdSize )),
				( sdrReleLetterId == null ) ? null : ( ( sdrReleLetterId.length(  ) <= sdrReleLetterIdSize ) ? sdrReleLetterId : sdrReleLetterId.substring( 0, sdrReleLetterIdSize )),
				sdrRelDelayDays,
				sdrPendingType,
				( sdrPendTgId == null ) ? null : ( ( sdrPendTgId.length(  ) <= sdrPendTgIdSize ) ? sdrPendTgId : sdrPendTgId.substring( 0, sdrPendTgIdSize )),
				( sdrPendUserId == null ) ? null : ( ( sdrPendUserId.length(  ) <= sdrPendUserIdSize ) ? sdrPendUserId : sdrPendUserId.substring( 0, sdrPendUserIdSize )),
				sdrPayDelayDays,
				( sdrOverrideFlag == null ) ? null : ( ( sdrOverrideFlag.length(  ) <= sdrOverrideFlagSize ) ? sdrOverrideFlag : sdrOverrideFlag.substring( 0, sdrOverrideFlagSize ))
		};
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}
	
	private static final int[] fieldSizes = new int[]{
				sdrPackageCodeSize,
				sdrServiceCodeSize,
				0,
				sdrReasonIdSize,
				0,
				sdrReleaseFlagSize,
				0,
				sdrReleaseTgIdSize,
				sdrReleUserIdSize,
				sdrReleLetterIdSize,
				0,
				0,
				sdrPendTgIdSize,
				sdrPendUserIdSize,
				0,
				sdrOverrideFlagSize
	};

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	
	private static final int[] fieldTypes = new int[]{
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER, 
		FIELD_TYPE_STRING,
		FIELD_TYPE_BIGDECIMAL,
		FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING
	};
	
	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs(3)
		.arg((this.sdrPackageCode == null) ? null : this.sdrPackageCode.trim())
		.arg((this.sdrServiceCode == null) ? null : this.sdrServiceCode.trim())
		.arg(this.sdrVerRuleNum);
	}

	protected void set(Object[] fields) {
		sdrPackageCode = rtrim((String) fields[0]); 
		sdrServiceCode = rtrim((String) fields[1]);
		sdrVerRuleNum = (Integer)fields[2];
		sdrReasonId = rtrim((String) fields[3]);
		sdrDepositAmount = (BigDecimal)fields[4];
		sdrReleaseFlag = rtrim((String) fields[5]);
		sdrReleaseType = (Integer)fields[6];
		sdrReleaseTgId = rtrim((String) fields[7]);
		sdrReleUserId = rtrim((String) fields[8]);
		sdrReleLetterId = rtrim((String) fields[9]);
		sdrRelDelayDays = (Integer)fields[10];
		sdrPendingType = (Integer)fields[11];
		sdrPendTgId = rtrim((String) fields[12]);
		sdrPendUserId = rtrim((String) fields[13]);
		sdrPayDelayDays = (Integer)fields[14];
		sdrOverrideFlag = rtrim((String) fields[15]);
	}

	public String getSdrPackageCode() {
		return sdrPackageCode;
	}

	public void setSdrPackageCode(String sdrPackageCode) {
		this.sdrPackageCode = sdrPackageCode;
	}

	public String getSdrServiceCode() {
		return sdrServiceCode;
	}

	public void setSdrServiceCode(String sdrServiceCode) {
		this.sdrServiceCode = sdrServiceCode;
	}

	public Integer getSdrVerRuleNum() {
		return sdrVerRuleNum;
	}

	public void setSdrVerRuleNum(Integer sdrVerRuleNum) {
		this.sdrVerRuleNum = sdrVerRuleNum;
	}

	public String getSdrReasonId() {
		return sdrReasonId;
	}

	public void setSdrReasonId(String sdrReasonId) {
		this.sdrReasonId = sdrReasonId;
	}

	public BigDecimal getSdrDepositAmount() {
		return sdrDepositAmount;
	}

	public void setSdrDepositAmount(BigDecimal sdrDepositAmount) {
		this.sdrDepositAmount = sdrDepositAmount;
	}

	public String getSdrReleaseFlag() {
		return sdrReleaseFlag;
	}

	public void setSdrReleaseFlag(String sdrReleaseFlag) {
		this.sdrReleaseFlag = sdrReleaseFlag;
	}

	public Integer getSdrReleaseType() {
		return sdrReleaseType;
	}

	public void setSdrReleaseType(Integer sdrReleaseType) {
		this.sdrReleaseType = sdrReleaseType;
	}

	public String getSdrReleaseTgId() {
		return sdrReleaseTgId;
	}

	public void setSdrReleaseTgId(String sdrReleaseTgId) {
		this.sdrReleaseTgId = sdrReleaseTgId;
	}

	public String getSdrReleUserId() {
		return sdrReleUserId;
	}

	public void setSdrReleUserId(String sdrReleUserId) {
		this.sdrReleUserId = sdrReleUserId;
	}

	public String getSdrReleLetterId() {
		return sdrReleLetterId;
	}

	public void setSdrReleLetterId(String sdrReleLetterId) {
		this.sdrReleLetterId = sdrReleLetterId;
	}

	public Integer getSdrRelDelayDays() {
		return sdrRelDelayDays;
	}

	public void setSdrRelDelayDays(Integer sdrRelDelayDays) {
		this.sdrRelDelayDays = sdrRelDelayDays;
	}

	public Integer getSdrPendingType() {
		return sdrPendingType;
	}

	public void setSdrPendingType(Integer sdrPendingType) {
		this.sdrPendingType = sdrPendingType;
	}

	public String getSdrPendTgId() {
		return sdrPendTgId;
	}

	public void setSdrPendTgId(String sdrPendTgId) {
		this.sdrPendTgId = sdrPendTgId;
	}

	public String getSdrPendUserId() {
		return sdrPendUserId;
	}

	public void setSdrPendUserId(String sdrPendUserId) {
		this.sdrPendUserId = sdrPendUserId;
	}

	public Integer getSdrPayDelayDays() {
		return sdrPayDelayDays;
	}

	public void setSdrPayDelayDays(Integer sdrPayDelayDays) {
		this.sdrPayDelayDays = sdrPayDelayDays;
	}

	public String getSdrOverrideFlag() {
		return sdrOverrideFlag;
	}

	public void setSdrOverrideFlag(String sdrOverrideFlag) {
		this.sdrOverrideFlag = sdrOverrideFlag;
	}
	
}
