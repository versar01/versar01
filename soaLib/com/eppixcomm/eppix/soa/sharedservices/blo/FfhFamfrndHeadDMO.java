package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class FfhFamfrndHeadDMO extends DBO implements Serializable {

	private String ffhServiceCode;
	private Short ffhNumber;
	private Double ffhPercent;
	private String ffhChgCode;
	private String ffhModChg;
	private String ffhModCode;
	private String ffhImmAllow;
	private String ffhImmChg;
	private String ffhImmCode;
	private Short ffhDiscPriority;

	public static final int ffhServiceCodeFilter = 0;
	private static final int ffhServiceCodeSize = 4;

	public static final int ffhNumberFilter = 1;

	public static final int ffhPercentFilter = 2;

	public static final int ffhChgCodeFilter = 3;
	private static final int ffhChgCodeSize = 5;

	public static final int ffhModChgFilter = 4;
	private static final int ffhModChgSize = 1;

	public static final int ffhModCodeFilter = 5;
	private static final int ffhModCodeSize = 5;

	public static final int ffhImmAllowFilter = 6;
	private static final int ffhImmAllowSize = 1;

	public static final int ffhImmChgFilter = 7;
	private static final int ffhImmChgSize = 1;

	public static final int ffhImmCodeFilter = 8;
	private static final int ffhImmCodeSize = 5;

	public static final int ffhDiscPriorityFilter = 9;

	public FfhFamfrndHeadDMO() {
	};

	public FfhFamfrndHeadDMO(final String ffhServiceCode,
			final Short ffhNumber, final Double ffhPercent,
			final String ffhChgCode, final String ffhModChg,
			final String ffhModCode, final String ffhImmAllow,
			final String ffhImmChg, final String ffhImmCode,
			final Short ffhDiscPriority) {

		this.ffhServiceCode = ffhServiceCode;
		this.ffhNumber = ffhNumber;
		this.ffhPercent = ffhPercent;
		this.ffhChgCode = ffhChgCode;
		this.ffhModChg = ffhModChg;
		this.ffhModCode = ffhModCode;
		this.ffhImmAllow = ffhImmAllow;
		this.ffhImmChg = ffhImmChg;
		this.ffhImmCode = ffhImmCode;
		this.ffhDiscPriority = ffhDiscPriority;
	};

	private static final int[] fieldSizes = new int[] { ffhServiceCodeSize, 0,
			0, ffhChgCodeSize, ffhModChgSize, ffhModCodeSize, ffhImmAllowSize,
			ffhImmChgSize, ffhImmCodeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_FLOAT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.ffhServiceCode == null) ? null : (this.ffhServiceCode
						.length() <= ffhServiceCodeSize) ? this.ffhServiceCode
						: this.ffhServiceCode.substring(0,
								this.ffhServiceCodeSize)),
				this.ffhNumber,
				this.ffhPercent,
				((this.ffhChgCode == null) ? null
						: (this.ffhChgCode.length() <= ffhChgCodeSize) ? this.ffhChgCode
								: this.ffhChgCode.substring(0,
										this.ffhChgCodeSize)),
				((this.ffhModChg == null) ? null
						: (this.ffhModChg.length() <= ffhModChgSize) ? this.ffhModChg
								: this.ffhModChg.substring(0,
										this.ffhModChgSize)),
				((this.ffhModCode == null) ? null
						: (this.ffhModCode.length() <= ffhModCodeSize) ? this.ffhModCode
								: this.ffhModCode.substring(0,
										this.ffhModCodeSize)),
				((this.ffhImmAllow == null) ? null
						: (this.ffhImmAllow.length() <= ffhImmAllowSize) ? this.ffhImmAllow
								: this.ffhImmAllow.substring(0,
										this.ffhImmAllowSize)),
				((this.ffhImmChg == null) ? null
						: (this.ffhImmChg.length() <= ffhImmChgSize) ? this.ffhImmChg
								: this.ffhImmChg.substring(0,
										this.ffhImmChgSize)),
				((this.ffhImmCode == null) ? null
						: (this.ffhImmCode.length() <= ffhImmCodeSize) ? this.ffhImmCode
								: this.ffhImmCode.substring(0,
										this.ffhImmCodeSize)),
				this.ffhDiscPriority };
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
		return new DAOArgs(1).arg(this.ffhServiceCode);
	}

	protected void set(Object[] fields) {
		this.ffhServiceCode = rtrim((String) fields[0]);
		this.ffhNumber = ((Short) fields[1]);
		this.ffhPercent = ((Double) fields[2]);
		this.ffhChgCode = rtrim((String) fields[3]);
		this.ffhModChg = rtrim((String) fields[4]);
		this.ffhModCode = rtrim((String) fields[5]);
		this.ffhImmAllow = rtrim((String) fields[6]);
		this.ffhImmChg = rtrim((String) fields[7]);
		this.ffhImmCode = rtrim((String) fields[8]);
		this.ffhDiscPriority = ((Short) fields[9]);
	}

	public void set(final String ffhServiceCode, final Short ffhNumber,
			final Double ffhPercent, final String ffhChgCode,
			final String ffhModChg, final String ffhModCode,
			final String ffhImmAllow, final String ffhImmChg,
			final String ffhImmCode, final Short ffhDiscPriority) {

		this.ffhServiceCode = ffhServiceCode;
		this.ffhNumber = ffhNumber;
		this.ffhPercent = ffhPercent;
		this.ffhChgCode = ffhChgCode;
		this.ffhModChg = ffhModChg;
		this.ffhModCode = ffhModCode;
		this.ffhImmAllow = ffhImmAllow;
		this.ffhImmChg = ffhImmChg;
		this.ffhImmCode = ffhImmCode;
		this.ffhDiscPriority = ffhDiscPriority;
	}

	public String getFfhServiceCode() {
		return ffhServiceCode;
	}

	public void setFfhServiceCode(String ffhServiceCode) {
		this.ffhServiceCode = ffhServiceCode;
	}

	public Short getFfhNumber() {
		return ffhNumber;
	}

	public void setFfhNumber(Short ffhNumber) {
		this.ffhNumber = ffhNumber;
	}

	public Double getFfhPercent() {
		return ffhPercent;
	}

	public void setFfhPercent(Double ffhPercent) {
		this.ffhPercent = ffhPercent;
	}

	public String getFfhChgCode() {
		return ffhChgCode;
	}

	public void setFfhChgCode(String ffhChgCode) {
		this.ffhChgCode = ffhChgCode;
	}

	public String getFfhModChg() {
		return ffhModChg;
	}

	public void setFfhModChg(String ffhModChg) {
		this.ffhModChg = ffhModChg;
	}

	public String getFfhModCode() {
		return ffhModCode;
	}

	public void setFfhModCode(String ffhModCode) {
		this.ffhModCode = ffhModCode;
	}

	public String getFfhImmAllow() {
		return ffhImmAllow;
	}

	public void setFfhImmAllow(String ffhImmAllow) {
		this.ffhImmAllow = ffhImmAllow;
	}

	public String getFfhImmChg() {
		return ffhImmChg;
	}

	public void setFfhImmChg(String ffhImmChg) {
		this.ffhImmChg = ffhImmChg;
	}

	public String getFfhImmCode() {
		return ffhImmCode;
	}

	public void setFfhImmCode(String ffhImmCode) {
		this.ffhImmCode = ffhImmCode;
	}

	public Short getFfhDiscPriority() {
		return ffhDiscPriority;
	}

	public void setFfhDiscPriority(Short ffhDiscPriority) {
		this.ffhDiscPriority = ffhDiscPriority;
	}

}
