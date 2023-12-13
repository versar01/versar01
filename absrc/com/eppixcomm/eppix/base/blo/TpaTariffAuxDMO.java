package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TpaTariffAuxDMO extends DBO implements Serializable {


	private String tpaTariff;
	private String tpaAudience;
	private Float tpaPromoSub;
	private Float tpaNormalSub;


	public static final int TpaTariffFilter = 0;
	private static final int TpaTariffSize = 20;

	public static final int TpaAudienceFilter = 1;
	private static final int TpaAudienceSize = 30;

	public static final int TpaPromoSubFilter = 2;

	public static final int TpaNormalSubFilter = 3;

	public TpaTariffAuxDMO() {
	};

	public TpaTariffAuxDMO(final String TpaTariff,
			final String TpaAudience, final Float TpaPromoSub,
			final Float TpaNormalSub) {

		this.tpaTariff = TpaTariff;
		this.tpaAudience = TpaAudience;
		this.tpaPromoSub = TpaPromoSub;
		this.tpaNormalSub = TpaNormalSub;
	};

	private static final int[] fieldSizes = new int[] { 0, TpaTariffSize,
			TpaAudienceSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_FLOAT,
			FIELD_TYPE_FLOAT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
					((this.tpaTariff == null) ? null
						: (this.tpaTariff.length() <= TpaTariffSize) ? this.tpaTariff
								: this.tpaTariff.substring(0,
										this.TpaTariffSize)),
				((this.tpaAudience == null) ? null
						: (this.tpaAudience.length() <= TpaAudienceSize) ? this.tpaAudience
								: this.tpaAudience.substring(0,
										this.TpaAudienceSize)),
				this.tpaPromoSub, this.tpaNormalSub };
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
		return new DAOArgs(1).arg(this.tpaTariff);
	}

	protected void set(Object[] fields) {
		this.tpaTariff = rtrim((String) fields[0]);
		this.tpaAudience = rtrim((String) fields[1]);
		this.tpaPromoSub = (Float)fields[2];
		this.tpaNormalSub = (Float)fields[3];
	}

	public void set(final String TpaTariff,
			final String TpaAudience, final Float TpaPromoSub,
			final Float TpaNormalSub) {

		this.tpaTariff = TpaTariff;
		this.tpaAudience = TpaAudience;
		this.tpaPromoSub = TpaPromoSub;
		this.tpaNormalSub = TpaNormalSub;
	}

	public String getTpaTariff() {
		return tpaTariff;
	}

	public void setTpaTariff(String tpaTariff) {
		this.tpaTariff = tpaTariff;
	}

	public String getTpaAudience() {
		return tpaAudience;
	}

	public void setTpaAudience(String tpaAudience) {
		this.tpaAudience = tpaAudience;
	}

	public Float getTpaPromoSub() {
		return tpaPromoSub;
	}

	public void setTpaPromoSub(Float tpaPromoSub) {
		this.tpaPromoSub = tpaPromoSub;
	}

	public Float getTpaNormalSub() {
		return tpaNormalSub;
	}

	public void setTpaNormalSub(Float tpaNormalSub) {
		this.tpaNormalSub = tpaNormalSub;
	}

}