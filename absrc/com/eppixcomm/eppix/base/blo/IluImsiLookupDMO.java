package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class IluImsiLookupDMO extends DBO implements Serializable {

	private String IluImsiNo;
	private String IluBasicServ;
	private String IluSimNo;
	private String IluMsisdn;
	private Date IluDate;
	private DateTime IluTimestamp;

	public static final int IluImsiNoFilter = 0;
	private static final int IluImsiNoSize = 15;

	public static final int IluBasicServFilter = 1;
	private static final int IluBasicServSize = 10;

	public static final int IluSimNoFilter = 2;
	private static final int IluSimNoSize = 14;

	public static final int IluMsisdnFilter = 3;
	private static final int IluMsisdnSize = 15;

	public static final int IluDateFilter = 4;

	public static final int IluTimestampFilter = 5;

	public IluImsiLookupDMO() {
	};

	public IluImsiLookupDMO(final String IluImsiNo, final String IluBasicServ,
			final String IluSimNo, final String IluMsisdn, final Date IluDate,
			final DateTime IluTimestamp) {

		this.IluImsiNo = IluImsiNo;
		this.IluBasicServ = IluBasicServ;
		this.IluSimNo = IluSimNo;
		this.IluMsisdn = IluMsisdn;
		this.IluDate = IluDate;
		this.IluTimestamp = IluTimestamp;
	};

	private static final int[] fieldSizes = new int[] { IluImsiNoSize,
			IluBasicServSize, IluSimNoSize, IluMsisdnSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.IluImsiNo == null) ? null
						: (this.IluImsiNo.length() <= IluImsiNoSize) ? this.IluImsiNo
								: this.IluImsiNo.substring(0,
										this.IluImsiNoSize)),
				((this.IluBasicServ == null) ? null : (this.IluBasicServ
						.length() <= IluBasicServSize) ? this.IluBasicServ
						: this.IluBasicServ.substring(0, this.IluBasicServSize)),
				((this.IluSimNo == null) ? null
						: (this.IluSimNo.length() <= IluSimNoSize) ? this.IluSimNo
								: this.IluSimNo.substring(0, this.IluSimNoSize)),
				((this.IluMsisdn == null) ? null
						: (this.IluMsisdn.length() <= IluMsisdnSize) ? this.IluMsisdn
								: this.IluMsisdn.substring(0,
										this.IluMsisdnSize)), 
										
				((this.IluDate == null) ? null : new Date((Date) this.IluDate)),
				this.IluTimestamp };
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
		return new DAOArgs(2).arg(this.IluMsisdn).arg(this.IluDate);
	}

	protected void set(Object[] fields) {
		this.IluImsiNo = rtrim((String) fields[0]);
		this.IluBasicServ = rtrim((String) fields[1]);
		this.IluSimNo = rtrim((String) fields[2]);
		this.IluMsisdn = rtrim((String) fields[3]);
		this.IluDate = ((IluDate == null) ? null : new Date((Date) fields[4]));
		this.IluTimestamp = ((IluTimestamp == null) ? null : new DateTime((DateTime) fields[5]));
	}

	public void set(final String IluImsiNo, final String IluBasicServ,
			final String IluSimNo, final String IluMsisdn, final Date IluDate,
			final DateTime IluTimestamp) {

		this.IluImsiNo = IluImsiNo;
		this.IluBasicServ = IluBasicServ;
		this.IluSimNo = IluSimNo;
		this.IluMsisdn = IluMsisdn;
		this.IluDate = IluDate;
		this.IluTimestamp = IluTimestamp;
	}

	public String getIluImsiNo() {
		return IluImsiNo;
	}

	public void setIluImsiNo(String iluImsiNo) {
		IluImsiNo = iluImsiNo;
	}

	public String getIluBasicServ() {
		return IluBasicServ;
	}

	public void setIluBasicServ(String iluBasicServ) {
		IluBasicServ = iluBasicServ;
	}

	public String getIluSimNo() {
		return IluSimNo;
	}

	public void setIluSimNo(String iluSimNo) {
		IluSimNo = iluSimNo;
	}

	public String getIluMsisdn() {
		return IluMsisdn;
	}

	public void setIluMsisdn(String iluMsisdn) {
		IluMsisdn = iluMsisdn;
	}

	public Date getIluDate() {
		return IluDate;
	}

	public void setIluDate(Date iluDate) {
		IluDate = iluDate;
	}

	public DateTime getIluTimestamp() {
		return IluTimestamp;
	}

	public void setIluTimestamp(DateTime iluTimestamp) {
		IluTimestamp = iluTimestamp;
	}

}