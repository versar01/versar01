package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class RicaPersonVerificationDMO extends DBO implements Serializable {
	// Globals
	private Integer rpvSerial;
	private String rpvCustomerType;
	private String rpvIdPassportNo;
	private String rpvIdType;
	private String rpvCountryCode;
	private String rpvAccNo;
	private String rpvRicaStatus;
	private String rpvFirstnames;
	private String rpvSurname;
	private String rpvRegistration;
	private String rpvAddressLine1;
	private String rpvAddressLine2;
	private String rpvAddressLine3;
	private String rpvPostalCode;
	private String rpvSuburb;
	private String rpvCityTown;
	private String rpvBusinessName;
	private String rpvBaddressLine1;
	private String rpvBaddressLine2;
	private String rpvBaddressLine3;
	private String rpvBpostalCode;
	private String rpvBsuburb;
	private String rpvBcityTown;
	private String rpvMsisdnNo;
	private DateTime rpvDatetimeActioned;
	private String rpvTrickleDesc;

	public RicaPersonVerificationDMO() {

	}

	public RicaPersonVerificationDMO(final Integer rpv_serial,
			final String rpvCustomerType, final String rpvIdPassportNo,
			final String rpvIdType, final String rpvCountryCode,
			final String rpvAccNo, final String rpvRicaStatus,
			final String rpvFirstnames, final String rpvSurname,
			final String rpvRegistration, final String rpvAddressLine1,
			final String rpvAddressLine2, final String rpvAddressLine3,
			final String rpvPostalCode, final String rpvSuburb,
			final String rpvCityTown, final String rpvBusinessName,
			final String rpvBaddressLine1, final String rpvBaddressLine2,
			final String rpvBaddressLine3, final String rpvBpostalCode,
			final String rpvBsuburb, final String rpvBcityTown,
			final String rpvMsisdnNo, final DateTime rpvDatetimeActioned,
			String rpvTrickleDesc) {

		this.rpvSerial = rpv_serial;
		this.rpvCustomerType = rpvCustomerType;
		this.rpvIdPassportNo = rpvIdPassportNo;
		this.rpvIdType = rpvIdType;
		this.rpvCountryCode = rpvCountryCode;
		this.rpvAccNo = rpvAccNo;
		this.rpvRicaStatus = rpvRicaStatus;
		this.rpvFirstnames = rpvFirstnames;
		this.rpvSurname = rpvSurname;
		this.rpvRegistration = rpvRegistration;
		this.rpvAddressLine1 = rpvAddressLine1;
		this.rpvAddressLine2 = rpvAddressLine2;
		this.rpvAddressLine3 = rpvAddressLine3;
		this.rpvPostalCode = rpvPostalCode;
		this.rpvSuburb = rpvSuburb;
		this.rpvCityTown = rpvCityTown;
		this.rpvBusinessName = rpvBusinessName;
		this.rpvBaddressLine1 = rpvBaddressLine1;
		this.rpvBaddressLine2 = rpvBaddressLine2;
		this.rpvBaddressLine3 = rpvBaddressLine3;
		this.rpvBpostalCode = rpvBpostalCode;
		this.rpvBsuburb = rpvBsuburb;
		this.rpvBcityTown = rpvBcityTown;
		this.rpvMsisdnNo = rpvMsisdnNo;
		this.rpvDatetimeActioned = rpvDatetimeActioned;
		this.rpvTrickleDesc = rpvTrickleDesc;
	}

	private static int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATETIME, FIELD_TYPE_STRING };

	public static final int rpvSerialFilter = 0;

	public static final int rpvCustomerTypeFilter = 1;
	public static final int rpvCustomerTypeSize = 1;

	public static final int rpvIdPassportNoFilter = 2;
	public static final int rpvIdPassportNoSize = 20;

	public static final int rpvIdTypeFilter = 3;
	public static final int rpvIdTypeSize = 1;

	public static final int rpvCountryCodeFilter = 4;
	public static final int rpvCountryCodeSize = 3;

	public static final int rpvAccNoFilter = 5;
	public static final int rpvAccNoSize = 8;

	public static final int rpvRicaStatusFilter = 6;
	public static final int rpvRicaStatusSize = 1;

	public static final int rpvFirstnamesFilter = 7;
	public static final int rpvFirstnamesSize = 2500;

	public static final int rpvSurnameFilter = 8;
	public static final int rpvSurnameSize = 50;

	public static final int rpvRegistrationFilter = 9;
	public static final int rpvRegistrationSize = 50;

	public static final int rpvAddressLine1Filter = 10;
	public static final int rpvAddressLine1Size = 50;

	public static final int rpvAddressLine2Filter = 11;
	public static final int rpvAddressLine2Size = 50;

	public static final int rpvAddressLine3Filter = 12;
	public static final int rpvAddressLine3Size = 50;

	public static final int rpvPostalCodeFilter = 13;
	public static final int rpvPostalCodeSize = 10;

	public static final int rpvSuburbFilter = 14;
	public static final int rpvSuburbSize = 50;

	public static final int rpvCityTownFilter = 15;
	public static final int rpvCityTownSize = 50;

	public static final int rpvBusinessNameFilter = 16;
	public static final int rpvBusinessNameSize = 100;

	public static final int rpvBaddressLine1Filter = 17;
	public static final int rpvBaddressLine1Size = 50;

	public static final int rpvBaddressLine2Filter = 18;
	public static final int rpvBaddressLine2Size = 50;

	public static final int rpvBaddressLine3Filter = 19;
	public static final int rpvBaddressLine3Size = 50;

	public static final int rpvBpostalCodeFilter = 20;
	public static final int rpvBpostalCodeSize = 10;

	public static final int rpvBsuburbFilter = 21;
	public static final int rpvBsuburbSize = 50;

	public static final int rpvBcityTownFilter = 22;
	public static final int rpvBcityTownSize = 50;

	public static final int rpvMsisdnNoFilter = 23;
	public static final int rpvMsisdnNoSize = 20;

	public static final int rpvDatetimeActionedFilter = 24;
	
	public static final int rpvTrickleDescFilter = 25;
	public static final int rpvTrickleDescSize = 50;	
	
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
	
	protected DAOArgs primaryKey() {
		return new DAOArgs( 1 ).arg( ( this.rpvSerial == null ) ? null
                : this.rpvSerial);
	}	
	
	protected Object[] get() {
		return new Object[] {
		rpvSerial,

		(rpvCustomerType == null ) ? null : ( ( rpvCustomerType.length(  ) <= rpvCustomerTypeSize ) ? rpvCustomerType 
		: rpvCustomerType.substring( 0, rpvCustomerTypeSize ) // auto trimmed to fit, if required.
		),

		(rpvIdPassportNo == null ) ? null : ( ( rpvIdPassportNo.length(  ) <= rpvIdPassportNoSize ) ? rpvIdPassportNo 
		: rpvIdPassportNo.substring( 0, rpvIdPassportNoSize ) // auto trimmed to fit, if required.
		),	

		(rpvIdType == null ) ? null : ( ( rpvIdType.length(  ) <= rpvIdTypeSize ) ? rpvIdType 
		: rpvIdType.substring( 0, rpvIdTypeSize ) // auto trimmed to fit, if required.
		),	

		(rpvCountryCode == null ) ? null : ( ( rpvCountryCode.length(  ) <= rpvCountryCodeSize ) ? rpvCountryCode 
		: rpvCountryCode.substring( 0, rpvCountryCodeSize ) // auto trimmed to fit, if required.
		),	

		(rpvAccNo == null ) ? null : ( ( rpvAccNo.length(  ) <= rpvAccNoSize ) ? rpvAccNo 
		: rpvAccNo.substring( 0, rpvAccNoSize ) // auto trimmed to fit, if required.
		),	

		(rpvRicaStatus == null ) ? null : ( ( rpvRicaStatus.length(  ) <= rpvRicaStatusSize ) ? rpvRicaStatus 
		: rpvRicaStatus.substring( 0, rpvIdPassportNoSize ) // auto trimmed to fit, if required.
		),	

		(rpvFirstnames == null ) ? null : ( ( rpvFirstnames.length(  ) <= rpvFirstnamesSize ) ? rpvFirstnames 
		: rpvFirstnames.substring( 0, rpvFirstnamesSize ) // auto trimmed to fit, if required.
		),	

		(rpvSurname == null ) ? null : ( ( rpvSurname.length(  ) <= rpvSurnameSize ) ? rpvSurname 
		: rpvSurname.substring( 0, rpvSurnameSize ) // auto trimmed to fit, if required.
		),	

		(rpvRegistration == null ) ? null : ( ( rpvRegistration.length(  ) <= rpvRegistrationSize ) ? rpvRegistration 
		: rpvRegistration.substring( 0, rpvRegistrationSize ) // auto trimmed to fit, if required.
		),	

		(rpvAddressLine1 == null ) ? null : ( ( rpvAddressLine1.length(  ) <= rpvAddressLine1Size ) ? rpvAddressLine1 
		: rpvAddressLine1.substring( 0, rpvAddressLine1Size ) // auto trimmed to fit, if required.
		),	

		(rpvAddressLine2 == null ) ? null : ( ( rpvAddressLine2.length(  ) <= rpvAddressLine2Size ) ? rpvAddressLine2 
		: rpvAddressLine2.substring( 0, rpvAddressLine2Size ) // auto trimmed to fit, if required.
		),	

		(rpvAddressLine3 == null ) ? null : ( ( rpvAddressLine3.length(  ) <= rpvAddressLine3Size ) ? rpvAddressLine3 
		: rpvAddressLine3.substring( 0, rpvAddressLine3Size ) // auto trimmed to fit, if required.
		),	

		(rpvPostalCode == null ) ? null : ( ( rpvPostalCode.length(  ) <= rpvPostalCodeSize ) ? rpvPostalCode 
		: rpvPostalCode.substring( 0, rpvPostalCodeSize ) // auto trimmed to fit, if required.
		),	

		(rpvSuburb == null ) ? null : ( ( rpvSuburb.length(  ) <= rpvSuburbSize ) ? rpvSuburb 
		: rpvSuburb.substring( 0, rpvSuburbSize ) // auto trimmed to fit, if required.
		),	

		(rpvCityTown == null ) ? null : ( ( rpvCityTown.length(  ) <= rpvCityTownSize ) ? rpvCityTown 
		: rpvCityTown.substring( 0, rpvCityTownSize ) // auto trimmed to fit, if required.
		),	

		(rpvBusinessName == null ) ? null : ( ( rpvBusinessName.length(  ) <= rpvBusinessNameSize ) ? rpvBusinessName 
		: rpvBusinessName.substring( 0, rpvBusinessNameSize ) // auto trimmed to fit, if required.
		),	

		(rpvBaddressLine1 == null ) ? null : ( ( rpvBaddressLine1.length(  ) <= rpvBaddressLine1Size ) ? rpvBaddressLine1 
		: rpvBaddressLine1.substring( 0, rpvBaddressLine1Size ) // auto trimmed to fit, if required.
		),	

		(rpvBaddressLine2 == null ) ? null : ( ( rpvBaddressLine2.length(  ) <= rpvBaddressLine2Size ) ? rpvBaddressLine2 
		: rpvBaddressLine2.substring( 0, rpvBaddressLine2Size ) // auto trimmed to fit, if required.
		),	

		(rpvBaddressLine3 == null ) ? null : ( ( rpvBaddressLine3.length(  ) <= rpvBaddressLine3Size ) ? rpvBaddressLine3 
		: rpvBaddressLine3.substring( 0, rpvBaddressLine3Size ) // auto trimmed to fit, if required.
		),	

		(rpvBpostalCode == null ) ? null : ( ( rpvBpostalCode.length(  ) <= rpvBpostalCodeSize ) ? rpvBpostalCode 
		: rpvBpostalCode.substring( 0, rpvBpostalCodeSize ) // auto trimmed to fit, if required.
		),	

		(rpvBsuburb == null ) ? null : ( ( rpvBsuburb.length(  ) <= rpvBsuburbSize ) ? rpvBsuburb 
		: rpvBsuburb.substring( 0, rpvBsuburbSize ) // auto trimmed to fit, if required.
		),	

		(rpvBcityTown == null ) ? null : ( ( rpvBcityTown.length(  ) <= rpvBcityTownSize ) ? rpvBcityTown 
		: rpvBcityTown.substring( 0, rpvBcityTownSize ) // auto trimmed to fit, if required.
		),	

		(rpvMsisdnNo == null ) ? null : ( ( rpvMsisdnNo.length(  ) <= rpvMsisdnNoSize ) ? rpvMsisdnNo 
		: rpvMsisdnNo.substring( 0, rpvMsisdnNoSize ) // auto trimmed to fit, if required.
		),	

		(rpvDatetimeActioned == null ) ? null : rpvDatetimeActioned,
		
		(rpvTrickleDesc == null ) ? null : ( ( rpvTrickleDesc.length(  ) <= rpvTrickleDescSize ) ? rpvTrickleDesc 
		: rpvTrickleDesc.substring( 0, rpvTrickleDescSize ) // auto trimmed to fit, if required.
		)
		};
	} 
	
	protected void set(Object[] fields) {
		this.rpvSerial = (Integer) fields[0];
		this.rpvCustomerType = rtrim( (String) fields[1] );
		this.rpvIdPassportNo = rtrim( (String) fields[2] );
		this.rpvIdType = rtrim( (String) fields[3] );
		this.rpvCountryCode = rtrim( (String) fields[4] );
		this.rpvAccNo = rtrim( (String) fields[5] );
		this.rpvRicaStatus = rtrim( (String) fields[6] );
		this.rpvFirstnames = rtrim( (String) fields[7] );
		this.rpvSurname = rtrim( (String) fields[8] );
		this.rpvRegistration = rtrim( (String) fields[9] );
		this.rpvAddressLine1 = rtrim( (String) fields[10] );
		this.rpvAddressLine2 = rtrim( (String) fields[11] );
		this.rpvAddressLine3 = rtrim( (String) fields[12] );
		this.rpvPostalCode = rtrim( (String) fields[13] );
		this.rpvSuburb = rtrim( (String) fields[14] );
		this.rpvCityTown = rtrim( (String) fields[15] );
		this.rpvBusinessName = rtrim( (String) fields[16] );
		this.rpvBaddressLine1 = rtrim( (String) fields[17] );
		this.rpvBaddressLine2 = rtrim( (String) fields[18] );
		this.rpvBaddressLine3 = rtrim( (String) fields[19] );
		this.rpvBpostalCode = rtrim( (String) fields[20] );
		this.rpvBsuburb = rtrim( (String) fields[21] );
		this.rpvBcityTown = rtrim( (String) fields[22]);
		this.rpvMsisdnNo = rtrim( (String) fields[23]);
		this.rpvDatetimeActioned = (DateTime) fields[24];
		this.rpvTrickleDesc = rtrim( (String) fields[25]);
		}

	private static int[] fieldSizes = new int[] { 0, rpvCustomerTypeSize,
			rpvIdPassportNoSize, rpvIdTypeSize, rpvCountryCodeSize,
			rpvAccNoSize, rpvRicaStatusSize, rpvFirstnamesSize, rpvSurnameSize,
			rpvRegistrationSize, rpvAddressLine1Size, rpvAddressLine2Size,
			rpvAddressLine3Size, rpvPostalCodeSize, rpvSuburbSize,
			rpvCityTownSize, rpvBusinessNameSize, rpvBaddressLine1Size,
			rpvBaddressLine2Size, rpvBaddressLine3Size, rpvBpostalCodeSize,
			rpvBsuburbSize, rpvBcityTownSize, rpvMsisdnNoSize, 0 , rpvTrickleDescSize};

	public Integer getRpvSerial() {
		return rpvSerial;
	}

	public void setRpvSerial(Integer rpv_serial) {
		this.rpvSerial = rpv_serial;
	}

	public String getRpvCustomerType() {
		return rpvCustomerType;
	}

	public void setRpvCustomerType(String rpvCustomerType) {
		this.rpvCustomerType = this.getPadded(rpvCustomerType, rpvCustomerTypeSize); 
	}

	public String getRpvIdPassportNo() {
		return rpvIdPassportNo;
	}

	public void setRpvIdPassportNo(String rpvIdPassportNo) {
		this.rpvIdPassportNo = this.getPadded(rpvIdPassportNo, rpvIdPassportNoSize);
	}

	public String getRpvIdType() {
		return rpvIdType;
	}

	public void setRpvIdType(String rpvIdType) {
		this.rpvIdType = this.getPadded(rpvIdType, rpvIdTypeSize);
	}

	public String getRpvCountryCode() {
		return rpvCountryCode;
	}

	public void setRpvCountryCode(String rpvCountryCode) {
		this.rpvCountryCode = this.getPadded(rpvCountryCode, rpvCountryCodeSize);
	}

	public String getRpvAccNo() {
		return rpvAccNo;
	}

	public void setRpvAccNo(String rpvAccNo) {
		this.rpvAccNo = this.getPadded(rpvAccNo, rpvAccNoSize);
	}

	public String getRpvRicaStatus() {
		return rpvRicaStatus;
	}

	public void setRpvRicaStatus(String rpvRicaStatus) {
		this.rpvRicaStatus = this.getPadded(rpvRicaStatus, rpvRicaStatusSize);
	}

	public String getRpvFirstnames() {
		return rpvFirstnames;
	}

	public void setRpvFirstnames(String rpvFirstnames) {
		this.rpvFirstnames = this.getPadded(rpvFirstnames, rpvFirstnamesSize);
	}

	public String getRpvSurname() {
		return rpvSurname;
	}

	public void setRpvSurname(String rpvSurname) {
		this.rpvSurname = this.getPadded(rpvSurname, rpvSurnameSize);
	}

	public String getRpvRegistration() {
		return rpvRegistration;
	}

	public void setRpvRegistration(String rpvRegistration) {
		this.rpvRegistration = this.getPadded(rpvRegistration, rpvRegistrationSize);
	}

	public String getRpvAddressLine1() {
		return rpvAddressLine1;
	}

	public void setRpvAddressLine1(String rpvAddressLine1) {
		this.rpvAddressLine1 = this.getPadded(rpvAddressLine1, rpvAddressLine1Size);
	}

	public String getRpvAddressLine2() {
		return rpvAddressLine2;
	}

	public void setRpvAddressLine2(String rpvAddressLine2) {
		this.rpvAddressLine2 = this.getPadded(rpvAddressLine2, rpvAddressLine2Size);
	}

	public String getRpvAddressLine3() {
		return rpvAddressLine3;
	}

	public void setRpvAddressLine3(String rpvAddressLine3) {
		this.rpvAddressLine3 = this.getPadded(rpvAddressLine3, rpvAddressLine3Size);
	}

	public String getRpvPostalCode() {
		return rpvPostalCode;
	}

	public void setRpvPostalCode(String rpvPostalCode) {
		this.rpvPostalCode = this.getPadded(rpvPostalCode, rpvPostalCodeSize);
	}

	public String getRpvSuburb() {
		return rpvSuburb;
	}

	public void setRpvSuburb(String rpvSuburb) {
		this.rpvSuburb = this.getPadded(rpvSuburb, rpvSuburbSize);
	}

	public String getRpvCityTown() {
		return rpvCityTown;
	}

	public void setRpvCityTown(String rpvCityTown) {
		this.rpvCityTown = this.getPadded(rpvCityTown, rpvCityTownSize);
	}

	public String getRpvBusinessName() {
		return rpvBusinessName;
	}

	public void setRpvBusinessName(String rpvBusinessName) {
		this.rpvBusinessName = this.getPadded(rpvBusinessName, rpvBusinessNameSize);
	}

	public String getRpvBaddressLine1() {
		return rpvBaddressLine1;
	}

	public void setRpvBaddressLine1(String rpvBaddressLine1) {
		this.rpvBaddressLine1 = this.getPadded(rpvBaddressLine1, rpvBaddressLine1Size);
	}

	public String getRpvBaddressLine2() {
		return rpvBaddressLine2;
	}

	public void setRpvBaddressLine2(String rpvBaddressLine2) {
		this.rpvBaddressLine2 = this.getPadded(rpvBaddressLine2, rpvBaddressLine2Size);
	}

	public String getRpvBaddressLine3() {
		return rpvBaddressLine3;
	}

	public void setRpvBaddressLine3(String rpvBaddressLine3) {
		this.rpvBaddressLine3 = this.getPadded(rpvBaddressLine3, rpvBaddressLine3Size);
	}

	public String getRpvBpostalCode() {
		return rpvBpostalCode;
	}

	public void setRpvBpostalCode(String rpvBpostalCode) {
		this.rpvBpostalCode = this.getPadded(rpvBpostalCode, rpvBpostalCodeSize);
	}

	public String getRpvBsuburb() {
		return rpvBsuburb;
	}

	public void setRpvBsuburb(String rpvBsuburb) {
		this.rpvBsuburb = this.getPadded(rpvBsuburb, rpvBsuburbSize);
	}

	public String getRpvBcityTown() {
		return rpvBcityTown;
	}

	public void setRpvBcityTown(String rpvBcityTown) {
		this.rpvBcityTown = this.getPadded(rpvBcityTown, rpvBcityTownSize);
	}

	public String getRpvMsisdnNo() {
		return rpvMsisdnNo;
	}

	public void setRpvMsisdnNo(String rpvMsisdnNo) {
		this.rpvMsisdnNo = this.getPadded(rpvMsisdnNo, rpvMsisdnNoSize);
	}

	public DateTime getRpvDatetimeActioned() {
		return rpvDatetimeActioned;
	}

	public void setRpvDatetimeActioned(DateTime rpvDatetimeActioned) {
		this.rpvDatetimeActioned = rpvDatetimeActioned;
	}

	public String getRpvTrickleDesc() {
		return rpvTrickleDesc;
	}

	public void setRpvTrickleDesc(String rpvTrickleDesc) {
		this.rpvTrickleDesc = rpvTrickleDesc;
	}

}