package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class ErbEpxRskBndDMO extends DBO implements Serializable {

	private Integer erbRiskId;
	private String erbText;
	private BigDecimal erbBadRate;
	private BigDecimal erbColRate;
	private BigDecimal erbSimDeal;
	private BigDecimal erbDeviceDeal;
	private Integer erbRank;

	public static final int erbRiskIdFilter = 0;

	public static final int erbTextFilter = 1;
	private static final int erbTextSize = 30;

	public static final int erbBadRateFilter = 2;

	public static final int erbColRateFilter = 3;

	public static final int erbSimDealFilter = 4;

	public static final int erbDeviceDealFilter = 5;

	public static final int erbRankFilter = 6;

	public ErbEpxRskBndDMO() {
	};

	public ErbEpxRskBndDMO(final Integer erbRiskId, final String erbText,
			final BigDecimal erbBadRate, final BigDecimal erbColRate,
			final BigDecimal erbSimDeal, final BigDecimal erbDeviceDeal,
			final Integer erbRank) {

		this.erbRiskId = erbRiskId;
		this.erbText = erbText;
		this.erbBadRate = erbBadRate;
		this.erbColRate = erbColRate;
		this.erbSimDeal = erbSimDeal;
		this.erbDeviceDeal = erbDeviceDeal;
		this.erbRank = erbRank;
	};

	private static final int[] fieldSizes = new int[] { 0, erbTextSize, 0, 0,
			0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.erbRiskId,
				((this.erbText == null) ? null
						: (this.erbText.length() <= erbTextSize) ? this.erbText
								: this.erbText.substring(0, this.erbTextSize)),
				this.erbBadRate, this.erbColRate, this.erbSimDeal,
				this.erbDeviceDeal, this.erbRank };
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
		return new DAOArgs().arg(this.erbRiskId);
	}

	protected void set(Object[] fields) {
		this.erbRiskId = ((Integer) fields[0]);
		this.erbText = rtrim((String) fields[1]);
		this.erbBadRate = ((BigDecimal) fields[2]);
		this.erbColRate = ((BigDecimal) fields[3]);
		this.erbSimDeal = ((BigDecimal) fields[4]);
		this.erbDeviceDeal = ((BigDecimal) fields[5]);
		this.erbRank = ((Integer) fields[6]);
	}

	public void set(final Integer erbRiskId, final String erbText,
			final BigDecimal erbBadRate, final BigDecimal erbColRate,
			final BigDecimal erbSimDeal, final BigDecimal erbDeviceDeal,
			final Integer erbRank) {

		this.erbRiskId = erbRiskId;
		this.erbText = erbText;
		this.erbBadRate = erbBadRate;
		this.erbColRate = erbColRate;
		this.erbSimDeal = erbSimDeal;
		this.erbDeviceDeal = erbDeviceDeal;
		this.erbRank = erbRank;
	}

	public Integer getErbRiskId() {
		return erbRiskId;
	}

	public void setErbRiskId(Integer erbRiskId) {
		this.erbRiskId = erbRiskId;
	}

	public String getErbText() {
		return erbText;
	}

	public void setErbText(String erbText) {
		this.erbText = erbText;
	}

	public BigDecimal getErbBadRate() {
		return erbBadRate;
	}

	public void setErbBadRate(BigDecimal erbBadRate) {
		this.erbBadRate = erbBadRate;
	}

	public BigDecimal getErbColRate() {
		return erbColRate;
	}

	public void setErbColRate(BigDecimal erbColRate) {
		this.erbColRate = erbColRate;
	}

	public BigDecimal getErbSimDeal() {
		return erbSimDeal;
	}

	public void setErbSimDeal(BigDecimal erbSimDeal) {
		this.erbSimDeal = erbSimDeal;
	}

	public BigDecimal getErbDeviceDeal() {
		return erbDeviceDeal;
	}

	public void setErbDeviceDeal(BigDecimal erbDeviceDeal) {
		this.erbDeviceDeal = erbDeviceDeal;
	}

	public Integer getErbRank() {
		return erbRank;
	}

	public void setErbRank(Integer erbRank) {
		this.erbRank = erbRank;
	}

}
