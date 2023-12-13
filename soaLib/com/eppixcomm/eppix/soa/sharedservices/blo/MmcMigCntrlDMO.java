package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class MmcMigCntrlDMO extends DBO implements Serializable {

	private String mmcType;
	private String mmcFrom;
	private String mmcTo;
	private String mmcAutomate;
	private String mmcInContChg;
	private String mmcOutContChg;
	private String mmcChgMapAct;
	private String mmcChgNomapAct;
	private String mmcChgMapPro;
	private String mmcChgNomapPro;
	private String mmcInsPending;

	public static final int mmcTypeFilter = 0;
	private static final int mmcTypeSize = 10;	

	public static final int mmcFromFilter = 1;
	private static final int mmcFromSize = 20;

	public static final int mmcToFilter = 2;
	private static final int mmcToSize = 20;

	public static final int mmcAutomateFilter = 3;
	private static final int mmcAutomateSize = 1;

	public static final int mmcInContChgFilter = 4;
	private static final int mmcInContChgSize = 5;

	public static final int mmcOutContChgFilter = 5;
	private static final int mmcOutContChgSize = 5;

	public static final int mmcChgMapActFilter = 6;
	private static final int mmcChgMapActSize = 1;

	public static final int mmcChgNomapActFilter = 7;
	private static final int mmcChgNomapActSize = 1;

	public static final int mmcChgMapProFilter = 8;
	private static final int mmcChgMapProSize = 1;

	public static final int mmcChgNomapProFilter = 9;
	private static final int mmcChgNomapProSize = 1;

	public static final int mmcInsPendingFilter = 10;
	private static final int mmcInsPendingSize = 1;

	public MmcMigCntrlDMO() {
	};

	public MmcMigCntrlDMO(final String mmcType, final String mmcFrom,
			final String mmcTo, final String mmcAutomate,
			final String mmcInContChg, final String mmcOutContChg,
			final String mmcChgMapAct, final String mmcChgNomapAct,
			final String mmcChgMapPro, final String mmcChgNomapPro,
			final String mmcInsPending) {

		this.mmcType = mmcType;
		this.mmcFrom = mmcFrom;
		this.mmcTo = mmcTo;
		this.mmcAutomate = mmcAutomate;
		this.mmcInContChg = mmcInContChg;
		this.mmcOutContChg = mmcOutContChg;
		this.mmcChgMapAct = mmcChgMapAct;
		this.mmcChgNomapAct = mmcChgNomapAct;
		this.mmcChgMapPro = mmcChgMapPro;
		this.mmcChgNomapPro = mmcChgNomapPro;
		this.mmcInsPending = mmcInsPending;
	};

	private static final int[] fieldSizes = new int[] { mmcTypeSize,
			mmcFromSize, mmcToSize, mmcAutomateSize, mmcInContChgSize,
			mmcOutContChgSize, mmcChgMapActSize, mmcChgNomapActSize,
			mmcChgMapProSize, mmcChgNomapProSize, mmcInsPendingSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.mmcType == null) ? null
						: (this.mmcType.length() <= mmcTypeSize) ? this.mmcType
								: this.mmcType.substring(0, this.mmcTypeSize)),
				((this.mmcFrom == null) ? null
						: (this.mmcFrom.length() <= mmcFromSize) ? this.mmcFrom
								: this.mmcFrom.substring(0, this.mmcFromSize)),
				((this.mmcTo == null) ? null
						: (this.mmcTo.length() <= mmcToSize) ? this.mmcTo
								: this.mmcTo.substring(0, this.mmcToSize)),
				((this.mmcAutomate == null) ? null
						: (this.mmcAutomate.length() <= mmcAutomateSize) ? this.mmcAutomate
								: this.mmcAutomate.substring(0,
										this.mmcAutomateSize)),
				((this.mmcInContChg == null) ? null : (this.mmcInContChg
						.length() <= mmcInContChgSize) ? this.mmcInContChg
						: this.mmcInContChg.substring(0, this.mmcInContChgSize)),
				((this.mmcOutContChg == null) ? null : (this.mmcOutContChg
						.length() <= mmcOutContChgSize) ? this.mmcOutContChg
						: this.mmcOutContChg.substring(0,
								this.mmcOutContChgSize)),
				((this.mmcChgMapAct == null) ? null : (this.mmcChgMapAct
						.length() <= mmcChgMapActSize) ? this.mmcChgMapAct
						: this.mmcChgMapAct.substring(0, this.mmcChgMapActSize)),
				((this.mmcChgNomapAct == null) ? null : (this.mmcChgNomapAct
						.length() <= mmcChgNomapActSize) ? this.mmcChgNomapAct
						: this.mmcChgNomapAct.substring(0,
								this.mmcChgNomapActSize)),
				((this.mmcChgMapPro == null) ? null : (this.mmcChgMapPro
						.length() <= mmcChgMapProSize) ? this.mmcChgMapPro
						: this.mmcChgMapPro.substring(0, this.mmcChgMapProSize)),
				((this.mmcChgNomapPro == null) ? null : (this.mmcChgNomapPro
						.length() <= mmcChgNomapProSize) ? this.mmcChgNomapPro
						: this.mmcChgNomapPro.substring(0,
								this.mmcChgNomapProSize)),
				((this.mmcInsPending == null) ? null : (this.mmcInsPending
						.length() <= mmcInsPendingSize) ? this.mmcInsPending
						: this.mmcInsPending.substring(0,
								this.mmcInsPendingSize)) };
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
		this.mmcType = rtrim((String) fields[0]);
		this.mmcFrom = rtrim((String) fields[1]);
		this.mmcTo = rtrim((String) fields[2]);
		this.mmcAutomate = rtrim((String) fields[3]);
		this.mmcInContChg = rtrim((String) fields[4]);
		this.mmcOutContChg = rtrim((String) fields[5]);
		this.mmcChgMapAct = rtrim((String) fields[6]);
		this.mmcChgNomapAct = rtrim((String) fields[7]);
		this.mmcChgMapPro = rtrim((String) fields[8]);
		this.mmcChgNomapPro = rtrim((String) fields[9]);
		this.mmcInsPending = rtrim((String) fields[10]);
	}

	public void set(final String mmcType, final String mmcFrom,
			final String mmcTo, final String mmcAutomate,
			final String mmcInContChg, final String mmcOutContChg,
			final String mmcChgMapAct, final String mmcChgNomapAct,
			final String mmcChgMapPro, final String mmcChgNomapPro,
			final String mmcInsPending) {

		this.mmcType = mmcType;
		this.mmcFrom = mmcFrom;
		this.mmcTo = mmcTo;
		this.mmcAutomate = mmcAutomate;
		this.mmcInContChg = mmcInContChg;
		this.mmcOutContChg = mmcOutContChg;
		this.mmcChgMapAct = mmcChgMapAct;
		this.mmcChgNomapAct = mmcChgNomapAct;
		this.mmcChgMapPro = mmcChgMapPro;
		this.mmcChgNomapPro = mmcChgNomapPro;
		this.mmcInsPending = mmcInsPending;
	}

	public String getMmcType() {
		return mmcType;
	}

	public void setMmcType(String mmcType) {
		this.mmcType = mmcType;
	}

	public String getMmcFrom() {
		return mmcFrom;
	}

	public void setMmcFrom(String mmcFrom) {
		this.mmcFrom = mmcFrom;
	}

	public String getMmcTo() {
		return mmcTo;
	}

	public void setMmcTo(String mmcTo) {
		this.mmcTo = mmcTo;
	}

	public String getMmcAutomate() {
		return mmcAutomate;
	}

	public void setMmcAutomate(String mmcAutomate) {
		this.mmcAutomate = mmcAutomate;
	}

	public String getMmcInContChg() {
		return mmcInContChg;
	}

	public void setMmcInContChg(String mmcInContChg) {
		this.mmcInContChg = mmcInContChg;
	}

	public String getMmcOutContChg() {
		return mmcOutContChg;
	}

	public void setMmcOutContChg(String mmcOutContChg) {
		this.mmcOutContChg = mmcOutContChg;
	}

	public String getMmcChgMapAct() {
		return mmcChgMapAct;
	}

	public void setMmcChgMapAct(String mmcChgMapAct) {
		this.mmcChgMapAct = mmcChgMapAct;
	}

	public String getMmcChgNomapAct() {
		return mmcChgNomapAct;
	}

	public void setMmcChgNomapAct(String mmcChgNomapAct) {
		this.mmcChgNomapAct = mmcChgNomapAct;
	}

	public String getMmcChgMapPro() {
		return mmcChgMapPro;
	}

	public void setMmcChgMapPro(String mmcChgMapPro) {
		this.mmcChgMapPro = mmcChgMapPro;
	}

	public String getMmcChgNomapPro() {
		return mmcChgNomapPro;
	}

	public void setMmcChgNomapPro(String mmcChgNomapPro) {
		this.mmcChgNomapPro = mmcChgNomapPro;
	}

	public String getMmcInsPending() {
		return mmcInsPending;
	}

	public void setMmcInsPending(String mmcInsPending) {
		this.mmcInsPending = mmcInsPending;
	}

}
