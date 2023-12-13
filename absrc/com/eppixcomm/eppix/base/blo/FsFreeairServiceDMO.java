package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class FsFreeairServiceDMO extends DBO implements Serializable {


	private String FsServiceCode;
	private Integer FsGroupId;
	private Integer FsFreeSeconds;
	private Integer FsActRule;
	private Integer FsDeactRule;
	private String FsAirLateCall;
	private Integer FsBillPeriodNo;
	private String FsShareTime;
	private String FsTakeTimeOver;



	public static final int FsServiceCodeFilter = 0;
	private static final int FsServiceCodeSize = 4;


	public static final int FsGroupIdFilter = 1;

	public static final int FsFreeSecondsFilter = 2;

	public static final int FsActRuleFilter = 3;

	public static final int FsDeactRuleFilter = 4;

	public static final int FsAirLateCallFilter = 5;
	private static final int FsAirLateCallSize = 1;


	public static final int FsBillPeriodNoFilter = 6;

	public static final int FsShareTimeFilter = 7;
	private static final int FsShareTimeSize = 1;


	public static final int FsTakeTimeOverFilter = 8;
	private static final int FsTakeTimeOverSize = 1;

	public FsFreeairServiceDMO(){};

	public FsFreeairServiceDMO(final String FsServiceCode,
	final Integer FsGroupId,
	final Integer FsFreeSeconds,
	final Integer FsActRule,
	final Integer FsDeactRule,
	final String FsAirLateCall,
	final Integer FsBillPeriodNo,
	final String FsShareTime,
	final String FsTakeTimeOver
	){

	this.FsServiceCode = FsServiceCode;
	this.FsGroupId = FsGroupId;
	this.FsFreeSeconds = FsFreeSeconds;
	this.FsActRule = FsActRule;
	this.FsDeactRule = FsDeactRule;
	this.FsAirLateCall = FsAirLateCall;
	this.FsBillPeriodNo = FsBillPeriodNo;
	this.FsShareTime = FsShareTime;
	this.FsTakeTimeOver = FsTakeTimeOver;
	};


	private static final int[] fieldSizes = new int[]{
	FsServiceCodeSize,
	0,
	0,
	0,
	0,
	FsAirLateCallSize,
	0,
	FsShareTimeSize,
	FsTakeTimeOverSize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_STRING,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			((this.FsServiceCode == null) ? null : (this.FsServiceCode.length() <= FsServiceCodeSize) ? this.FsServiceCode : this.FsServiceCode.substring(0, this.FsServiceCodeSize)),
				this.FsGroupId,
				this.FsFreeSeconds,
				this.FsActRule,
				this.FsDeactRule,
				((this.FsAirLateCall == null) ? null : (this.FsAirLateCall.length() <= FsAirLateCallSize) ? this.FsAirLateCall : this.FsAirLateCall.substring(0, this.FsAirLateCallSize)),
				this.FsBillPeriodNo,
				((this.FsShareTime == null) ? null : (this.FsShareTime.length() <= FsShareTimeSize) ? this.FsShareTime : this.FsShareTime.substring(0, this.FsShareTimeSize)),
				((this.FsTakeTimeOver == null) ? null : (this.FsTakeTimeOver.length() <= FsTakeTimeOverSize) ? this.FsTakeTimeOver : this.FsTakeTimeOver.substring(0, this.FsTakeTimeOverSize))
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
		return new DAOArgs(1).arg(this.FsServiceCode); 
	}



	protected void set(Object[] fields) {
	this.FsServiceCode = rtrim((String)fields[0]);
	this.FsGroupId = ((Integer)fields[1]);
	this.FsFreeSeconds = ((Integer)fields[2]);
	this.FsActRule = ((Integer)fields[3]);
	this.FsDeactRule = ((Integer)fields[4]);
	this.FsAirLateCall = rtrim((String)fields[5]);
	this.FsBillPeriodNo = ((Integer)fields[6]);
	this.FsShareTime = rtrim((String)fields[7]);
	this.FsTakeTimeOver = rtrim((String)fields[8]);
	}


	public void set(
	final String FsServiceCode,
	final Integer FsGroupId,
	final Integer FsFreeSeconds,
	final Integer FsActRule,
	final Integer FsDeactRule,
	final String FsAirLateCall,
	final Integer FsBillPeriodNo,
	final String FsShareTime,
	final String FsTakeTimeOver
	)
	{

	this.FsServiceCode = FsServiceCode;
	this.FsGroupId = FsGroupId;
	this.FsFreeSeconds = FsFreeSeconds;
	this.FsActRule = FsActRule;
	this.FsDeactRule = FsDeactRule;
	this.FsAirLateCall = FsAirLateCall;
	this.FsBillPeriodNo = FsBillPeriodNo;
	this.FsShareTime = FsShareTime;
	this.FsTakeTimeOver = FsTakeTimeOver;
	}

	public String getFsServiceCode() {
		return FsServiceCode;
	}

	public void setFsServiceCode(String fsServiceCode) {
		FsServiceCode = fsServiceCode;
	}

	public Integer getFsGroupId() {
		return FsGroupId;
	}

	public void setFsGroupId(Integer fsGroupId) {
		FsGroupId = fsGroupId;
	}

	public Integer getFsFreeSeconds() {
		return FsFreeSeconds;
	}

	public void setFsFreeSeconds(Integer fsFreeSeconds) {
		FsFreeSeconds = fsFreeSeconds;
	}

	public Integer getFsActRule() {
		return FsActRule;
	}

	public void setFsActRule(Integer fsActRule) {
		FsActRule = fsActRule;
	}

	public Integer getFsDeactRule() {
		return FsDeactRule;
	}

	public void setFsDeactRule(Integer fsDeactRule) {
		FsDeactRule = fsDeactRule;
	}

	public String getFsAirLateCall() {
		return FsAirLateCall;
	}

	public void setFsAirLateCall(String fsAirLateCall) {
		FsAirLateCall = fsAirLateCall;
	}

	public Integer getFsBillPeriodNo() {
		return FsBillPeriodNo;
	}

	public void setFsBillPeriodNo(Integer fsBillPeriodNo) {
		FsBillPeriodNo = fsBillPeriodNo;
	}

	public String getFsShareTime() {
		return FsShareTime;
	}

	public void setFsShareTime(String fsShareTime) {
		FsShareTime = fsShareTime;
	}

	public String getFsTakeTimeOver() {
		return FsTakeTimeOver;
	}

	public void setFsTakeTimeOver(String fsTakeTimeOver) {
		FsTakeTimeOver = fsTakeTimeOver;
	}



}