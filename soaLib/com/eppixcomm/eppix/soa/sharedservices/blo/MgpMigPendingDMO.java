package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class MgpMigPendingDMO extends DBO implements Serializable {

	private String mgpSimNo;
	private String mgpOldTariff;
	private String mgpNewTariff;
	private Date mgpMigrationDate;
	private String mgpFreeText;

	public static final int mgpSimNoFilter = 0;
	private static final int mgpSimNoSize = 14;

	public static final int mgpOldTariffFilter = 1;
	private static final int mgpOldTariffSize = 20;

	public static final int mgpNewTariffFilter = 2;
	private static final int mgpNewTariffSize = 20;

	public static final int mgpMigrationDateFilter = 3;

	public static final int mgpFreeTextFilter = 4;
	private static final int mgpFreeTextSize = 50;

	public MgpMigPendingDMO() {
	};

	public MgpMigPendingDMO(final String mgpSimNo, final String mgpOldTariff,
			final String mgpNewTariff, final Date mgpMigrationDate,
			final String mgpFreeText) {

		this.mgpSimNo = mgpSimNo;
		this.mgpOldTariff = mgpOldTariff;
		this.mgpNewTariff = mgpNewTariff;
		this.mgpMigrationDate = mgpMigrationDate;
		this.mgpFreeText = mgpFreeText;
	};

	private static final int[] fieldSizes = new int[] { mgpSimNoSize,
			mgpOldTariffSize, mgpNewTariffSize, 0, mgpFreeTextSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.mgpSimNo == null) ? null
						: (this.mgpSimNo.length() <= mgpSimNoSize) ? this.mgpSimNo
								: this.mgpSimNo.substring(0, this.mgpSimNoSize)),
				((this.mgpOldTariff == null) ? null : (this.mgpOldTariff
						.length() <= mgpOldTariffSize) ? this.mgpOldTariff
						: this.mgpOldTariff.substring(0, this.mgpOldTariffSize)),
				((this.mgpNewTariff == null) ? null : (this.mgpNewTariff
						.length() <= mgpNewTariffSize) ? this.mgpNewTariff
						: this.mgpNewTariff.substring(0, this.mgpNewTariffSize)),
				this.mgpMigrationDate,
				((this.mgpFreeText == null) ? null
						: (this.mgpFreeText.length() <= mgpFreeTextSize) ? this.mgpFreeText
								: this.mgpFreeText.substring(0,
										this.mgpFreeTextSize)) };
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
		return new DAOArgs(1).arg(this.mgpSimNo);
	}

	protected void set(Object[] fields) {
		this.mgpSimNo = rtrim((String) fields[0]);
		this.mgpOldTariff = rtrim((String) fields[1]);
		this.mgpNewTariff = rtrim((String) fields[2]);
		this.mgpMigrationDate = ((fields[3] == null) ? null : new Date(
				fields[3]));
		this.mgpFreeText = rtrim((String) fields[4]);
	}

	public void set(final String mgpSimNo, final String mgpOldTariff,
			final String mgpNewTariff, final Date mgpMigrationDate,
			final String mgpFreeText) {

		this.mgpSimNo = mgpSimNo;
		this.mgpOldTariff = mgpOldTariff;
		this.mgpNewTariff = mgpNewTariff;
		this.mgpMigrationDate = mgpMigrationDate;
		this.mgpFreeText = mgpFreeText;
	}

	public String getMgpSimNo() {
		return mgpSimNo;
	}

	public void setMgpSimNo(String mgpSimNo) {
		this.mgpSimNo = mgpSimNo;
	}

	public String getMgpOldTariff() {
		return mgpOldTariff;
	}

	public void setMgpOldTariff(String mgpOldTariff) {
		this.mgpOldTariff = mgpOldTariff;
	}

	public String getMgpNewTariff() {
		return mgpNewTariff;
	}

	public void setMgpNewTariff(String mgpNewTariff) {
		this.mgpNewTariff = mgpNewTariff;
	}

	public Date getMgpMigrationDate() {
		return mgpMigrationDate;
	}

	public void setMgpMigrationDate(Date mgpMigrationDate) {
		this.mgpMigrationDate = mgpMigrationDate;
	}

	public String getMgpFreeText() {
		return mgpFreeText;
	}

	public void setMgpFreeText(String mgpFreeText) {
		this.mgpFreeText = mgpFreeText;
	}

}
