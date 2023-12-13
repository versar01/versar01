package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class PicPrtnrInstCdeDMO extends DBO implements Serializable {

	private Integer picInstrId;
	private Integer picPartnerId;
	private String picPartnerInstrType;
	private String picSupportInstrType;
	private String picCustomerInstrType;
	private String picEmailAdd1;
	private String picEmailAdd2;
	private String picMsisdn1;
	private String picMsisdn2;
	private String picSupportEmail;
	private String picSupportMsisdn;
	private Integer picUriId;

	public static final int picInstrIdFilter = 0;

	public static final int picPartnerIdFilter = 1;

	public static final int picPartnerInstrTypeFilter = 2;
	private static final int picPartnerInstrTypeSize = 1;

	public static final int picSupportInstrTypeFilter = 3;
	private static final int picSupportInstrTypeSize = 1;

	public static final int picCustomerInstrTypeFilter = 4;
	private static final int picCustomerInstrTypeSize = 1;

	public static final int picEmailAdd1Filter = 5;
	private static final int picEmailAdd1Size = 256;

	public static final int picEmailAdd2Filter = 6;
	private static final int picEmailAdd2Size = 256;

	public static final int picMsisdn1Filter = 7;
	private static final int picMsisdn1Size = 15;

	public static final int picMsisdn2Filter = 8;
	private static final int picMsisdn2Size = 15;

	public static final int picSupportEmailFilter = 9;
	private static final int picSupportEmailSize = 256;

	public static final int picSupportMsisdnFilter = 10;
	private static final int picSupportMsisdnSize = 15;

	public static final int picUriIdFilter = 11;

	public PicPrtnrInstCdeDMO() {
	};

	public PicPrtnrInstCdeDMO(final Integer picInstrId,
			final Integer picPartnerId, final String picPartnerInstrType,
			final String picSupportInstrType,
			final String picCustomerInstrType, final String picEmailAdd1,
			final String picEmailAdd2, final String picMsisdn1,
			final String picMsisdn2, final String picSupportEmail,
			final String picSupportMsisdn, final Integer picUriId) {

		this.picInstrId = picInstrId;
		this.picPartnerId = picPartnerId;
		this.picPartnerInstrType = picPartnerInstrType;
		this.picSupportInstrType = picSupportInstrType;
		this.picCustomerInstrType = picCustomerInstrType;
		this.picEmailAdd1 = picEmailAdd1;
		this.picEmailAdd2 = picEmailAdd2;
		this.picMsisdn1 = picMsisdn1;
		this.picMsisdn2 = picMsisdn2;
		this.picSupportEmail = picSupportEmail;
		this.picSupportMsisdn = picSupportMsisdn;
		this.picUriId = picUriId;
	};

	private static final int[] fieldSizes = new int[] { 0, 0,
			picPartnerInstrTypeSize, picSupportInstrTypeSize,
			picCustomerInstrTypeSize, picEmailAdd1Size, picEmailAdd2Size,
			picMsisdn1Size, picMsisdn2Size, picSupportEmailSize,
			picSupportMsisdnSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.picInstrId,
				this.picPartnerId,
				((this.picPartnerInstrType == null) ? null
						: (this.picPartnerInstrType.length() <= picPartnerInstrTypeSize) ? this.picPartnerInstrType
								: this.picPartnerInstrType.substring(0,
										this.picPartnerInstrTypeSize)),
				((this.picSupportInstrType == null) ? null
						: (this.picSupportInstrType.length() <= picSupportInstrTypeSize) ? this.picSupportInstrType
								: this.picSupportInstrType.substring(0,
										this.picSupportInstrTypeSize)),
				((this.picCustomerInstrType == null) ? null
						: (this.picCustomerInstrType.length() <= picCustomerInstrTypeSize) ? this.picCustomerInstrType
								: this.picCustomerInstrType.substring(0,
										this.picCustomerInstrTypeSize)),
				((this.picEmailAdd1 == null) ? null : (this.picEmailAdd1
						.length() <= picEmailAdd1Size) ? this.picEmailAdd1
						: this.picEmailAdd1.substring(0, this.picEmailAdd1Size)),
				((this.picEmailAdd2 == null) ? null : (this.picEmailAdd2
						.length() <= picEmailAdd2Size) ? this.picEmailAdd2
						: this.picEmailAdd2.substring(0, this.picEmailAdd2Size)),
				((this.picMsisdn1 == null) ? null
						: (this.picMsisdn1.length() <= picMsisdn1Size) ? this.picMsisdn1
								: this.picMsisdn1.substring(0,
										this.picMsisdn1Size)),
				((this.picMsisdn2 == null) ? null
						: (this.picMsisdn2.length() <= picMsisdn2Size) ? this.picMsisdn2
								: this.picMsisdn2.substring(0,
										this.picMsisdn2Size)),
				((this.picSupportEmail == null) ? null
						: (this.picSupportEmail.length() <= picSupportEmailSize) ? this.picSupportEmail
								: this.picSupportEmail.substring(0,
										this.picSupportEmailSize)),
				((this.picSupportMsisdn == null) ? null
						: (this.picSupportMsisdn.length() <= picSupportMsisdnSize) ? this.picSupportMsisdn
								: this.picSupportMsisdn.substring(0,
										this.picSupportMsisdnSize)),
				this.picUriId };
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
		return null;
	}

	protected void set(Object[] fields) {
		this.picInstrId = ((Integer) fields[0]);
		this.picPartnerId = ((Integer) fields[1]);
		this.picPartnerInstrType = rtrim((String) fields[2]);
		this.picSupportInstrType = rtrim((String) fields[3]);
		this.picCustomerInstrType = rtrim((String) fields[4]);
		this.picEmailAdd1 = rtrim((String) fields[5]);
		this.picEmailAdd2 = rtrim((String) fields[6]);
		this.picMsisdn1 = rtrim((String) fields[7]);
		this.picMsisdn2 = rtrim((String) fields[8]);
		this.picSupportEmail = rtrim((String) fields[9]);
		this.picSupportMsisdn = rtrim((String) fields[10]);
		this.picUriId = ((Integer) fields[11]);
	}

	public void set(final Integer picInstrId, final Integer picPartnerId,
			final String picPartnerInstrType, final String picSupportInstrType,
			final String picCustomerInstrType, final String picEmailAdd1,
			final String picEmailAdd2, final String picMsisdn1,
			final String picMsisdn2, final String picSupportEmail,
			final String picSupportMsisdn, final Integer picUriId) {

		this.picInstrId = picInstrId;
		this.picPartnerId = picPartnerId;
		this.picPartnerInstrType = picPartnerInstrType;
		this.picSupportInstrType = picSupportInstrType;
		this.picCustomerInstrType = picCustomerInstrType;
		this.picEmailAdd1 = picEmailAdd1;
		this.picEmailAdd2 = picEmailAdd2;
		this.picMsisdn1 = picMsisdn1;
		this.picMsisdn2 = picMsisdn2;
		this.picSupportEmail = picSupportEmail;
		this.picSupportMsisdn = picSupportMsisdn;
		this.picUriId = picUriId;
	}

	public Integer getPicInstrId() {
		return picInstrId;
	}

	public void setPicInstrId(Integer picInstrId) {
		this.picInstrId = picInstrId;
	}

	public Integer getPicPartnerId() {
		return picPartnerId;
	}

	public void setPicPartnerId(Integer picPartnerId) {
		this.picPartnerId = picPartnerId;
	}

	public String getPicPartnerInstrType() {
		return picPartnerInstrType;
	}

	public void setPicPartnerInstrType(String picPartnerInstrType) {
		this.picPartnerInstrType = picPartnerInstrType;
	}

	public String getPicSupportInstrType() {
		return picSupportInstrType;
	}

	public void setPicSupportInstrType(String picSupportInstrType) {
		this.picSupportInstrType = picSupportInstrType;
	}

	public String getPicCustomerInstrType() {
		return picCustomerInstrType;
	}

	public void setPicCustomerInstrType(String picCustomerInstrType) {
		this.picCustomerInstrType = picCustomerInstrType;
	}

	public String getPicEmailAdd1() {
		return picEmailAdd1;
	}

	public void setPicEmailAdd1(String picEmailAdd1) {
		this.picEmailAdd1 = picEmailAdd1;
	}

	public String getPicEmailAdd2() {
		return picEmailAdd2;
	}

	public void setPicEmailAdd2(String picEmailAdd2) {
		this.picEmailAdd2 = picEmailAdd2;
	}

	public String getPicMsisdn1() {
		return picMsisdn1;
	}

	public void setPicMsisdn1(String picMsisdn1) {
		this.picMsisdn1 = picMsisdn1;
	}

	public String getPicMsisdn2() {
		return picMsisdn2;
	}

	public void setPicMsisdn2(String picMsisdn2) {
		this.picMsisdn2 = picMsisdn2;
	}

	public String getPicSupportEmail() {
		return picSupportEmail;
	}

	public void setPicSupportEmail(String picSupportEmail) {
		this.picSupportEmail = picSupportEmail;
	}

	public String getPicSupportMsisdn() {
		return picSupportMsisdn;
	}

	public void setPicSupportMsisdn(String picSupportMsisdn) {
		this.picSupportMsisdn = picSupportMsisdn;
	}

	public Integer getPicUriId() {
		return picUriId;
	}

	public void setPicUriId(Integer picUriId) {
		this.picUriId = picUriId;
	}

}
