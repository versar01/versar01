package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class NttNtwrkTrfTypeDMO extends DBO implements Serializable {

	private String NttNtwrkTariff;
	private Date NttStartDate;
	private Date NttEndDate;
	private Integer NttContractPer;
	private String NttAllowSpMigr;
	private String NttAllowMsiSwap;

	public static final int NttNtwrkTariffFilter = 0;
	private static final int NttNtwrkTariffSize = 5;

	public static final int NttStartDateFilter = 1;

	public static final int NttEndDateFilter = 2;

	public static final int NttContractPerFilter = 3;

	public static final int NttAllowSpMigrFilter = 4;
	private static final int NttAllowSpMigrSize = 1;

	public static final int NttAllowMsiSwapFilter = 5;
	private static final int NttAllowMsiSwapSize = 1;

	public NttNtwrkTrfTypeDMO() {
	};

	public NttNtwrkTrfTypeDMO(final String NttNtwrkTariff,
			final Date NttStartDate, final Date NttEndDate,
			final Integer NttContractPer, final String NttAllowSpMigr,
			final String NttAllowMsiSwap) {

		this.NttNtwrkTariff = NttNtwrkTariff;
		this.NttStartDate = NttStartDate;
		this.NttEndDate = NttEndDate;
		this.NttContractPer = NttContractPer;
		this.NttAllowSpMigr = NttAllowSpMigr;
		this.NttAllowMsiSwap = NttAllowMsiSwap;
	};

	private static final int[] fieldSizes = new int[] { NttNtwrkTariffSize, 0,
			0, 0, NttAllowSpMigrSize, NttAllowMsiSwapSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.NttNtwrkTariff == null) ? null : (this.NttNtwrkTariff
						.length() <= NttNtwrkTariffSize) ? this.NttNtwrkTariff
						: this.NttNtwrkTariff.substring(0,
								this.NttNtwrkTariffSize)),
				this.NttStartDate,
				this.NttEndDate,
				this.NttContractPer,
				((this.NttAllowSpMigr == null) ? null : (this.NttAllowSpMigr
						.length() <= NttAllowSpMigrSize) ? this.NttAllowSpMigr
						: this.NttAllowSpMigr.substring(0,
								this.NttAllowSpMigrSize)),
				((this.NttAllowMsiSwap == null) ? null
						: (this.NttAllowMsiSwap.length() <= NttAllowMsiSwapSize) ? this.NttAllowMsiSwap
								: this.NttAllowMsiSwap.substring(0,
										this.NttAllowMsiSwapSize)) };
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
		return new DAOArgs(1).arg(this.NttNtwrkTariff);
	}

	protected void set(Object[] fields) {
		this.NttNtwrkTariff = rtrim((String) fields[0]);
		this.NttStartDate = ((NttStartDate == null) ? null : new Date(
				(Date) fields[1]));
		this.NttEndDate = ((NttEndDate == null) ? null : new Date(
				(Date) fields[2]));
		this.NttContractPer = ((Integer) fields[3]);
		this.NttAllowSpMigr = rtrim((String) fields[4]);
		this.NttAllowMsiSwap = rtrim((String) fields[5]);
	}

	public void set(final String NttNtwrkTariff, final Date NttStartDate,
			final Date NttEndDate, final Integer NttContractPer,
			final String NttAllowSpMigr, final String NttAllowMsiSwap) {

		this.NttNtwrkTariff = NttNtwrkTariff;
		this.NttStartDate = NttStartDate;
		this.NttEndDate = NttEndDate;
		this.NttContractPer = NttContractPer;
		this.NttAllowSpMigr = NttAllowSpMigr;
		this.NttAllowMsiSwap = NttAllowMsiSwap;
	}

	public String getNttNtwrkTariff() {
		return NttNtwrkTariff;
	}

	public void setNttNtwrkTariff(String nttNtwrkTariff) {
		NttNtwrkTariff = nttNtwrkTariff;
	}

	public Date getNttStartDate() {
		return NttStartDate;
	}

	public void setNttStartDate(Date nttStartDate) {
		NttStartDate = nttStartDate;
	}

	public Date getNttEndDate() {
		return NttEndDate;
	}

	public void setNttEndDate(Date nttEndDate) {
		NttEndDate = nttEndDate;
	}

	public Integer getNttContractPer() {
		return NttContractPer;
	}

	public void setNttContractPer(Integer nttContractPer) {
		NttContractPer = nttContractPer;
	}

	public String getNttAllowSpMigr() {
		return NttAllowSpMigr;
	}

	public void setNttAllowSpMigr(String nttAllowSpMigr) {
		NttAllowSpMigr = nttAllowSpMigr;
	}

	public String getNttAllowMsiSwap() {
		return NttAllowMsiSwap;
	}

	public void setNttAllowMsiSwap(String nttAllowMsiSwap) {
		NttAllowMsiSwap = nttAllowMsiSwap;
	}

}