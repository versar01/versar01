package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class MahMassActionHdDMO extends DBO implements Serializable {
	// Globals
	private String mahFileId;
	private String mahCsvFileId;
	private String mahActType;
	private String mahServiceCode;
	private Integer mahParamId;
	private String mahParamValue;
	private String mahPackageCode;
	private String mahTariffCode; 
	private String mahReasonCd;
	private String mahDeactType;
	private String mahUserId;
	private DateTime mahSubmitDate;
	private Integer mahRecsReq;
	private DateTime mahProcessDate;
	private String mahFileStatus;
	private Integer mahRecsProc;
	private String mahComments;
	private String mahAnalysis1;
	private String mahAnalysis2;
	private String mahAnalysis3;
	private String mahAnalysis4;
	private String mahAnalysis5;

	public MahMassActionHdDMO() {

	}

	public MahMassActionHdDMO(final String mahFileId,
			final String mahCsvFileId, final String mahActType,
			final String mahServiceCode, final Integer mahParamId,
			final String mahParamValue, final String mahPackageCode,
			final String mahTariffCode, final String mahReasonCd,
			final String mahDeactType, final String mahUserId,
			final DateTime mahSubmitDate, final Integer mahRecsReq,
			final DateTime mahProcessDate, final String mahFileStatus,
			final Integer mahRecsProc, final String mahComments,
			final String mahAnalysis1, final String mahAnalysis2,
			final String mahAnalysis3, final String mahAnalysis4,
			final String mahAnalysis5) {

		this.mahFileId = mahFileId;
		this.mahCsvFileId = mahCsvFileId;
		this.mahActType = mahActType;
		this.mahServiceCode = mahServiceCode;
		this.mahParamId = mahParamId;
		this.mahParamValue = mahParamValue;
		this.mahPackageCode = mahPackageCode;
		this.mahTariffCode =  mahTariffCode;
		this.mahReasonCd = mahReasonCd;
		this.mahDeactType = mahDeactType;
		this.mahUserId = mahUserId;
		this.mahSubmitDate = mahSubmitDate;
		this.mahRecsReq = mahRecsReq;
		this.mahProcessDate = mahProcessDate;
		this.mahFileStatus = mahFileStatus;
		this.mahRecsProc = mahRecsProc;
		this.mahComments = mahComments;
		this.mahAnalysis1 = mahAnalysis1;
		this.mahAnalysis2 = mahAnalysis2;
		this.mahAnalysis3 = mahAnalysis3;
		this.mahAnalysis4 = mahAnalysis4;
		this.mahAnalysis5 = mahAnalysis5;
	}

	private static int[] fieldTypes = new int[] {
		FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
		FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
		FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
		FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATETIME,
		FIELD_TYPE_INTEGER, FIELD_TYPE_DATETIME, FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
		FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
		FIELD_TYPE_STRING };

	public static final int mahFileIdFilter = 0;
	public static final int mahFileIdSize = 30;

	public static final int mahCsvFileIdFilter = 1;
	public static final int mahCsvFileIdSize = 30;

	public static final int mahActTypeFilter = 2;
	public static final int mahActTypeSize = 5;

	public static final int mahServiceCodeFilter = 3;
	public static final int mahServiceCodeSize = 4;

	public static final int mahParamIdFilter = 4;
	
	public static final int mahParamValueFilter = 5;
	public static final int mahParamValueSize = 20;

	public static final int mahPackageCodeFilter = 6;
	public static final int mahPackageCodeSize = 5;

	public static final int mahTariffCodeFilter = 7;
	public static final int mahTariffCodeSize = 20;

	public static final int mahReasonCdFilter = 8;
	public static final int mahReasonCdSize = 5;
	
	public static final int mahDeactTypeFilter = 9;
	public static final int mahDeactTypeSize = 20;

	public static final int mahUserIdFilter = 10;
	public static final int mahUserIdSize = 20;

	public static final int mahSubmitDateFilter = 11;

	public static final int mahRecsReqFilter = 12;

	public static final int mahProcessDateFilter = 13;

	public static final int mahFileStatusFilter = 14;
	public static final int mahFileStatusSize = 20;
	
	public static final int mahRecsProcFilter = 15;
	
	public static final int mahCommentsFilter = 16;
	public static final int mahCommentsSize = 20;
	
	public static final int mahAnalysis1Filter = 17;
	public static final int mahAnalysis1Size = 100;
	
	public static final int mahAnalysis2Filter = 18;
	public static final int mahAnalysis2Size = 100;
	
	public static final int mahAnalysis3Filter = 19;
	public static final int mahAnalysis3Size = 100;
	
	public static final int mahAnalysis4Filter = 20;
	public static final int mahAnalysis4Size = 100;
	
	public static final int mahAnalysis5Filter = 21;
	public static final int mahAnalysis5Size = 100;
	
	protected void generatedKey(Integer key) {

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
	
	protected DAOArgs primaryKey(  ) {
	    return new DAOArgs( 2 ).arg( ( this.mahFileId == null ) ? null
	                          : this.mahFileId.trim(  ) )
	                           .arg( ( this.mahActType == null ) ? null
	                          : this.mahActType.trim(  ) );	    
	  }	
	
	protected Object[] get() {
		return new Object[] {
		(mahFileId == null ) ? null
						: ( ( mahFileId.length(  ) <= mahFileIdSize ) ? mahFileId 
								: mahFileId.substring( 0, mahFileIdSize )),
		
		(mahCsvFileId == null) ? null
						: ((mahCsvFileId.length() <= mahCsvFileIdSize) ? mahCsvFileId
								: mahCsvFileId.substring(0, mahCsvFileIdSize)),

		(mahActType == null) ? null
						: ((mahActType.length() <= mahActTypeSize) ? mahActType
								: mahActType.substring(0, mahActTypeSize)),

		(mahServiceCode == null) ? null
						: ((mahServiceCode.length() <= mahServiceCodeSize) ? mahServiceCode
								: mahServiceCode.substring(0,
										mahServiceCodeSize)),
		
		mahParamId,
		(mahParamValue == null) ? null
						: ((mahParamValue.length() <= mahParamValueSize) ? mahParamValue
								: mahParamValue.substring(0, mahParamValueSize)),

		(mahParamValue == null) ? null
						: ((mahParamValue.length() <= mahParamValueSize) ? mahParamValue
								: mahParamValue.substring(0, mahParamValueSize)),	

		(mahPackageCode == null) ? null
						: ((mahPackageCode.length() <= mahPackageCodeSize) ? mahPackageCode
								: mahPackageCode.substring(0, mahPackageCodeSize)),

		(mahTariffCode == null) ? null
						: ((mahTariffCode.length() <= mahTariffCodeSize) ? mahTariffCode
								: mahTariffCode.substring(0, mahTariffCodeSize)),	

		(mahReasonCd == null) ? null
						: ((mahReasonCd.length() <= mahReasonCdSize) ? mahReasonCd
								: mahReasonCd.substring(0, mahReasonCdSize)),

		(mahDeactType == null) ? null
						: ((mahDeactType.length() <= mahDeactTypeSize) ? mahDeactType
								: mahDeactType.substring(0, mahDeactTypeSize)),

		(mahUserId == null ) ? null
						: ( ( mahUserId.length(  ) <= mahUserIdSize ) ? mahUserId 
								: mahUserId.substring( 0, mahUserIdSize )),	
		
		(mahSubmitDate == null ) ? null : mahSubmitDate,
		
		mahRecsReq,
				
		(mahProcessDate == null ) ? null : mahProcessDate,
		
		(mahFileStatus == null ) ? null
						: ( ( mahFileStatus.length(  ) <= mahFileStatusSize ) ? mahFileStatus 
								: mahFileStatus.substring( 0, mahFileStatusSize )),
		mahRecsProc,
						
		(mahComments == null ) ? null
						: ( ( mahComments.length(  ) <= mahCommentsSize ) ? mahComments 
								: mahComments.substring( 0, mahCommentsSize )),
								
		(mahAnalysis1 == null ) ? null
						: ( ( mahAnalysis1.length(  ) <= mahAnalysis1Size ) ? mahAnalysis1 
								: mahAnalysis1.substring( 0, mahAnalysis1Size )),
				
		(mahAnalysis2 == null ) ? null
						: ( ( mahAnalysis2.length(  ) <= mahAnalysis2Size ) ? mahAnalysis2 
								: mahAnalysis2.substring( 0, mahAnalysis2Size )),
				
		(mahAnalysis3 == null ) ? null
						: ( ( mahAnalysis3.length(  ) <= mahAnalysis3Size ) ? mahAnalysis3 
								: mahAnalysis3.substring( 0, mahAnalysis3Size )),
								
		(mahAnalysis4 == null ) ? null
						: ( ( mahAnalysis4.length(  ) <= mahAnalysis4Size ) ? mahAnalysis4 
								: mahAnalysis4.substring( 0, mahAnalysis4Size )),
								
		(mahAnalysis5 == null ) ? null
						: ( ( mahAnalysis5.length(  ) <= mahAnalysis5Size ) ? mahAnalysis5 
								: mahAnalysis5.substring( 0, mahAnalysis5Size ))
		};
		
		
		
	} 
	
	protected void set(Object[] fields) {
		this.mahFileId = rtrim( (String) fields[0] );
		this.mahCsvFileId = rtrim( (String) fields[1] );
		this.mahActType = rtrim( (String) fields[2] );
		this.mahActType = rtrim( (String) fields[3] );
		this.mahParamId = (Integer) fields[4];
		this.mahParamValue = rtrim( (String) fields[5] );
		this.mahPackageCode = rtrim( (String) fields[6] );
		this.mahTariffCode =  rtrim( (String) fields[7] );
		this.mahReasonCd = rtrim( (String) fields[8] );
		this.mahDeactType = rtrim( (String) fields[9] );
		this.mahUserId = rtrim( (String) fields[10] );
		this.mahSubmitDate = (DateTime) fields[11];;
		this.mahRecsReq = (Integer) fields[12];
		this.mahProcessDate = (DateTime) fields[13];
		this.mahFileStatus = rtrim( (String) fields[14] );
		this.mahRecsProc = (Integer) fields[15];
		this.mahComments = rtrim( (String) fields[16] );
		this.mahAnalysis1 = rtrim( (String) fields[17] );
		this.mahAnalysis2 = rtrim( (String) fields[18] );
		this.mahAnalysis3 = rtrim( (String) fields[19] );
		this.mahAnalysis4 = rtrim( (String) fields[20] );
		this.mahAnalysis5 = rtrim( (String) fields[21] );
		}

	private static int[] fieldSizes = new int[] { mahFileIdSize,
			mahCsvFileIdSize, mahActTypeSize, mahActTypeSize, 0,
			mahParamValueSize, 0, mahPackageCodeSize, mahTariffCodeSize,
			mahReasonCdSize, mahDeactTypeSize, mahUserIdSize, 0, 0, 0,
			mahFileStatusSize, 0, mahCommentsSize, mahAnalysis1Size,
			mahAnalysis2Size, mahAnalysis3Size, mahAnalysis4Size,
			mahAnalysis5Size };

	public String getMahFileId() {
		return mahFileId;
	}

	public void setMahFileId(String mahFileId) {
		this.mahFileId = mahFileId;
	}

	public String getMahCsvFileId() {
		return mahCsvFileId;
	}

	public void setMahCsvFileId(String mahCsvFileId) {
		this.mahCsvFileId = mahCsvFileId;
	}

	public String getMahActType() {
		return mahActType;
	}

	public void setMahActType(String mahActType) {
		this.mahActType = mahActType;
	}

	public String getMahServiceCode() {
		return mahServiceCode;
	}

	public void setMahServiceCode(String mahServiceCode) {
		this.mahServiceCode = mahServiceCode;
	}

	public Integer getMahParamId() {
		return mahParamId;
	}

	public void setMahParamId(Integer mahParamId) {
		this.mahParamId = mahParamId;
	}

	public String getMahParamValue() {
		return mahParamValue;
	}

	public void setMahParamValue(String mahParamValue) {
		this.mahParamValue = mahParamValue;
	}

	public String getMahPackageCode() {
		return mahPackageCode;
	}

	public void setMahPackageCode(String mahPackageCode) {
		this.mahPackageCode = mahPackageCode;
	}

	public String getMahTariffCode() {
		return mahTariffCode;
	}

	public void setMahTariffCode(String mahTariffCode) {
		this.mahTariffCode = mahTariffCode;
	}

	public String getMahReasonCd() {
		return mahReasonCd;
	}

	public void setMahReasonCd(String mahReasonCd) {
		this.mahReasonCd = mahReasonCd;
	}

	public String getMahDeactType() {
		return mahDeactType;
	}

	public void setMahDeactType(String mahDeactType) {
		this.mahDeactType = mahDeactType;
	}

	public String getMahUserId() {
		return mahUserId;
	}

	public void setMahUserId(String mahUserId) {
		this.mahUserId = mahUserId;
	}

	public DateTime getMahSubmitDate() {
		return mahSubmitDate;
	}

	public void setMahSubmitDate(DateTime mahSubmitDate) {
		this.mahSubmitDate = mahSubmitDate;
	}

	public Integer getMahRecsReq() {
		return mahRecsReq;
	}

	public void setMahRecsReq(Integer mahRecsReq) {
		this.mahRecsReq = mahRecsReq;
	}

	public DateTime getMahProcessDate() {
		return mahProcessDate;
	}

	public void setMahProcessDate(DateTime mahProcessDate) {
		this.mahProcessDate = mahProcessDate;
	}

	public String getMahFileStatus() {
		return mahFileStatus;
	}

	public void setMahFileStatus(String mahFileStatus) {
		this.mahFileStatus = mahFileStatus;
	}

	public Integer getMahRecsProc() {
		return mahRecsProc;
	}

	public void setMahRecsProc(Integer mahRecsProc) {
		this.mahRecsProc = mahRecsProc;
	}

	public String getMahComments() {
		return mahComments;
	}

	public void setMahComments(String mahComments) {
		this.mahComments = mahComments;
	}

	public String getMahAnalysis1() {
		return mahAnalysis1;
	}

	public void setMahAnalysis1(String mahAnalysis1) {
		this.mahAnalysis1 = mahAnalysis1;
	}

	public String getMahAnalysis2() {
		return mahAnalysis2;
	}

	public void setMahAnalysis2(String mahAnalysis2) {
		this.mahAnalysis2 = mahAnalysis2;
	}

	public String getMahAnalysis3() {
		return mahAnalysis3;
	}

	public void setMahAnalysis3(String mahAnalysis3) {
		this.mahAnalysis3 = mahAnalysis3;
	}

	public String getMahAnalysis4() {
		return mahAnalysis4;
	}

	public void setMahAnalysis4(String mahAnalysis4) {
		this.mahAnalysis4 = mahAnalysis4;
	}

	public String getMahAnalysis5() {
		return mahAnalysis5;
	}

	public void setMahAnalysis5(String mahAnalysis5) {
		this.mahAnalysis5 = mahAnalysis5;
	}


}
