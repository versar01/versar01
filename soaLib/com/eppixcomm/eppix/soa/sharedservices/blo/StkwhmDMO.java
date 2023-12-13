package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class StkwhmDMO extends DBO implements Serializable {

	private String warehouse;
	private String description;
	private String monthEndFormul01;
	private String monthEndFormul02;
	private String monthEndFormul03;
	private String monthEndFormul04;
	private String monthEndFormul05;
	private String monthEndFormul06;
	private String monthEndFormul07;
	private String monthEndFormul08;
	private String monthEndFormul09;
	private String monthEndFormul10;
	private String blankLine01;
	private String blankLine02;
	private String blankLine03;
	private String blankLine04;
	private String blankLine05;
	private String blankLine06;
	private String blankLine07;
	private String blankLine08;
	private String blankLine09;
	private String blankLine10;
	private String shippingSite;

	public static final int warehouseFilter = 0;
	private static final int warehouseSize = 2;

	public static final int descriptionFilter = 1;
	private static final int descriptionSize = 20;

	public static final int monthEndFormul01Filter = 2;
	private static final int monthEndFormul01Size = 60;

	public static final int monthEndFormul02Filter = 3;
	private static final int monthEndFormul02Size = 60;

	public static final int monthEndFormul03Filter = 4;
	private static final int monthEndFormul03Size = 60;

	public static final int monthEndFormul04Filter = 5;
	private static final int monthEndFormul04Size = 60;

	public static final int monthEndFormul05Filter = 6;
	private static final int monthEndFormul05Size = 60;

	public static final int monthEndFormul06Filter = 7;
	private static final int monthEndFormul06Size = 60;

	public static final int monthEndFormul07Filter = 8;
	private static final int monthEndFormul07Size = 60;

	public static final int monthEndFormul08Filter = 9;
	private static final int monthEndFormul08Size = 60;

	public static final int monthEndFormul09Filter = 10;
	private static final int monthEndFormul09Size = 60;

	public static final int monthEndFormul10Filter = 11;
	private static final int monthEndFormul10Size = 60;

	public static final int blankLine01Filter = 12;
	private static final int blankLine01Size = 1;

	public static final int blankLine02Filter = 13;
	private static final int blankLine02Size = 1;

	public static final int blankLine03Filter = 14;
	private static final int blankLine03Size = 1;

	public static final int blankLine04Filter = 15;
	private static final int blankLine04Size = 1;

	public static final int blankLine05Filter = 16;
	private static final int blankLine05Size = 1;

	public static final int blankLine06Filter = 17;
	private static final int blankLine06Size = 1;

	public static final int blankLine07Filter = 18;
	private static final int blankLine07Size = 1;

	public static final int blankLine08Filter = 19;
	private static final int blankLine08Size = 1;

	public static final int blankLine09Filter = 20;
	private static final int blankLine09Size = 1;

	public static final int blankLine10Filter = 21;
	private static final int blankLine10Size = 1;

	public static final int shippingSiteFilter = 22;
	private static final int shippingSiteSize = 2;

	public StkwhmDMO() {
	};

	public StkwhmDMO(final String warehouse, final String description,
			final String monthEndFormul01, final String monthEndFormul02,
			final String monthEndFormul03, final String monthEndFormul04,
			final String monthEndFormul05, final String monthEndFormul06,
			final String monthEndFormul07, final String monthEndFormul08,
			final String monthEndFormul09, final String monthEndFormul10,
			final String blankLine01, final String blankLine02,
			final String blankLine03, final String blankLine04,
			final String blankLine05, final String blankLine06,
			final String blankLine07, final String blankLine08,
			final String blankLine09, final String blankLine10,
			final String shippingSite) {

		this.warehouse = warehouse;
		this.description = description;
		this.monthEndFormul01 = monthEndFormul01;
		this.monthEndFormul02 = monthEndFormul02;
		this.monthEndFormul03 = monthEndFormul03;
		this.monthEndFormul04 = monthEndFormul04;
		this.monthEndFormul05 = monthEndFormul05;
		this.monthEndFormul06 = monthEndFormul06;
		this.monthEndFormul07 = monthEndFormul07;
		this.monthEndFormul08 = monthEndFormul08;
		this.monthEndFormul09 = monthEndFormul09;
		this.monthEndFormul10 = monthEndFormul10;
		this.blankLine01 = blankLine01;
		this.blankLine02 = blankLine02;
		this.blankLine03 = blankLine03;
		this.blankLine04 = blankLine04;
		this.blankLine05 = blankLine05;
		this.blankLine06 = blankLine06;
		this.blankLine07 = blankLine07;
		this.blankLine08 = blankLine08;
		this.blankLine09 = blankLine09;
		this.blankLine10 = blankLine10;
		this.shippingSite = shippingSite;
	};

	private static final int[] fieldSizes = new int[] { warehouseSize,
			descriptionSize, monthEndFormul01Size, monthEndFormul02Size,
			monthEndFormul03Size, monthEndFormul04Size, monthEndFormul05Size,
			monthEndFormul06Size, monthEndFormul07Size, monthEndFormul08Size,
			monthEndFormul09Size, monthEndFormul10Size, blankLine01Size,
			blankLine02Size, blankLine03Size, blankLine04Size, blankLine05Size,
			blankLine06Size, blankLine07Size, blankLine08Size, blankLine09Size,
			blankLine10Size, shippingSiteSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.warehouse == null) ? null
						: (this.warehouse.length() <= warehouseSize) ? this.warehouse
								: this.warehouse.substring(0,
										this.warehouseSize)),
				((this.description == null) ? null
						: (this.description.length() <= descriptionSize) ? this.description
								: this.description.substring(0,
										this.descriptionSize)),
				((this.monthEndFormul01 == null) ? null
						: (this.monthEndFormul01.length() <= monthEndFormul01Size) ? this.monthEndFormul01
								: this.monthEndFormul01.substring(0,
										this.monthEndFormul01Size)),
				((this.monthEndFormul02 == null) ? null
						: (this.monthEndFormul02.length() <= monthEndFormul02Size) ? this.monthEndFormul02
								: this.monthEndFormul02.substring(0,
										this.monthEndFormul02Size)),
				((this.monthEndFormul03 == null) ? null
						: (this.monthEndFormul03.length() <= monthEndFormul03Size) ? this.monthEndFormul03
								: this.monthEndFormul03.substring(0,
										this.monthEndFormul03Size)),
				((this.monthEndFormul04 == null) ? null
						: (this.monthEndFormul04.length() <= monthEndFormul04Size) ? this.monthEndFormul04
								: this.monthEndFormul04.substring(0,
										this.monthEndFormul04Size)),
				((this.monthEndFormul05 == null) ? null
						: (this.monthEndFormul05.length() <= monthEndFormul05Size) ? this.monthEndFormul05
								: this.monthEndFormul05.substring(0,
										this.monthEndFormul05Size)),
				((this.monthEndFormul06 == null) ? null
						: (this.monthEndFormul06.length() <= monthEndFormul06Size) ? this.monthEndFormul06
								: this.monthEndFormul06.substring(0,
										this.monthEndFormul06Size)),
				((this.monthEndFormul07 == null) ? null
						: (this.monthEndFormul07.length() <= monthEndFormul07Size) ? this.monthEndFormul07
								: this.monthEndFormul07.substring(0,
										this.monthEndFormul07Size)),
				((this.monthEndFormul08 == null) ? null
						: (this.monthEndFormul08.length() <= monthEndFormul08Size) ? this.monthEndFormul08
								: this.monthEndFormul08.substring(0,
										this.monthEndFormul08Size)),
				((this.monthEndFormul09 == null) ? null
						: (this.monthEndFormul09.length() <= monthEndFormul09Size) ? this.monthEndFormul09
								: this.monthEndFormul09.substring(0,
										this.monthEndFormul09Size)),
				((this.monthEndFormul10 == null) ? null
						: (this.monthEndFormul10.length() <= monthEndFormul10Size) ? this.monthEndFormul10
								: this.monthEndFormul10.substring(0,
										this.monthEndFormul10Size)),
				((this.blankLine01 == null) ? null
						: (this.blankLine01.length() <= blankLine01Size) ? this.blankLine01
								: this.blankLine01.substring(0,
										this.blankLine01Size)),
				((this.blankLine02 == null) ? null
						: (this.blankLine02.length() <= blankLine02Size) ? this.blankLine02
								: this.blankLine02.substring(0,
										this.blankLine02Size)),
				((this.blankLine03 == null) ? null
						: (this.blankLine03.length() <= blankLine03Size) ? this.blankLine03
								: this.blankLine03.substring(0,
										this.blankLine03Size)),
				((this.blankLine04 == null) ? null
						: (this.blankLine04.length() <= blankLine04Size) ? this.blankLine04
								: this.blankLine04.substring(0,
										this.blankLine04Size)),
				((this.blankLine05 == null) ? null
						: (this.blankLine05.length() <= blankLine05Size) ? this.blankLine05
								: this.blankLine05.substring(0,
										this.blankLine05Size)),
				((this.blankLine06 == null) ? null
						: (this.blankLine06.length() <= blankLine06Size) ? this.blankLine06
								: this.blankLine06.substring(0,
										this.blankLine06Size)),
				((this.blankLine07 == null) ? null
						: (this.blankLine07.length() <= blankLine07Size) ? this.blankLine07
								: this.blankLine07.substring(0,
										this.blankLine07Size)),
				((this.blankLine08 == null) ? null
						: (this.blankLine08.length() <= blankLine08Size) ? this.blankLine08
								: this.blankLine08.substring(0,
										this.blankLine08Size)),
				((this.blankLine09 == null) ? null
						: (this.blankLine09.length() <= blankLine09Size) ? this.blankLine09
								: this.blankLine09.substring(0,
										this.blankLine09Size)),
				((this.blankLine10 == null) ? null
						: (this.blankLine10.length() <= blankLine10Size) ? this.blankLine10
								: this.blankLine10.substring(0,
										this.blankLine10Size)),
				((this.shippingSite == null) ? null : (this.shippingSite
						.length() <= shippingSiteSize) ? this.shippingSite
						: this.shippingSite.substring(0, this.shippingSiteSize)) };
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
		return new DAOArgs(1).arg(this.warehouse);
	}

	protected void set(Object[] fields) {
		this.warehouse = rtrim((String) fields[0]);
		this.description = rtrim((String) fields[1]);
		this.monthEndFormul01 = rtrim((String) fields[2]);
		this.monthEndFormul02 = rtrim((String) fields[3]);
		this.monthEndFormul03 = rtrim((String) fields[4]);
		this.monthEndFormul04 = rtrim((String) fields[5]);
		this.monthEndFormul05 = rtrim((String) fields[6]);
		this.monthEndFormul06 = rtrim((String) fields[7]);
		this.monthEndFormul07 = rtrim((String) fields[8]);
		this.monthEndFormul08 = rtrim((String) fields[9]);
		this.monthEndFormul09 = rtrim((String) fields[10]);
		this.monthEndFormul10 = rtrim((String) fields[11]);
		this.blankLine01 = rtrim((String) fields[12]);
		this.blankLine02 = rtrim((String) fields[13]);
		this.blankLine03 = rtrim((String) fields[14]);
		this.blankLine04 = rtrim((String) fields[15]);
		this.blankLine05 = rtrim((String) fields[16]);
		this.blankLine06 = rtrim((String) fields[17]);
		this.blankLine07 = rtrim((String) fields[18]);
		this.blankLine08 = rtrim((String) fields[19]);
		this.blankLine09 = rtrim((String) fields[20]);
		this.blankLine10 = rtrim((String) fields[21]);
		this.shippingSite = rtrim((String) fields[22]);
	}

	public void set(final String warehouse, final String description,
			final String monthEndFormul01, final String monthEndFormul02,
			final String monthEndFormul03, final String monthEndFormul04,
			final String monthEndFormul05, final String monthEndFormul06,
			final String monthEndFormul07, final String monthEndFormul08,
			final String monthEndFormul09, final String monthEndFormul10,
			final String blankLine01, final String blankLine02,
			final String blankLine03, final String blankLine04,
			final String blankLine05, final String blankLine06,
			final String blankLine07, final String blankLine08,
			final String blankLine09, final String blankLine10,
			final String shippingSite) {

		this.warehouse = warehouse;
		this.description = description;
		this.monthEndFormul01 = monthEndFormul01;
		this.monthEndFormul02 = monthEndFormul02;
		this.monthEndFormul03 = monthEndFormul03;
		this.monthEndFormul04 = monthEndFormul04;
		this.monthEndFormul05 = monthEndFormul05;
		this.monthEndFormul06 = monthEndFormul06;
		this.monthEndFormul07 = monthEndFormul07;
		this.monthEndFormul08 = monthEndFormul08;
		this.monthEndFormul09 = monthEndFormul09;
		this.monthEndFormul10 = monthEndFormul10;
		this.blankLine01 = blankLine01;
		this.blankLine02 = blankLine02;
		this.blankLine03 = blankLine03;
		this.blankLine04 = blankLine04;
		this.blankLine05 = blankLine05;
		this.blankLine06 = blankLine06;
		this.blankLine07 = blankLine07;
		this.blankLine08 = blankLine08;
		this.blankLine09 = blankLine09;
		this.blankLine10 = blankLine10;
		this.shippingSite = shippingSite;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMonthEndFormul01() {
		return monthEndFormul01;
	}

	public void setMonthEndFormul01(String monthEndFormul01) {
		this.monthEndFormul01 = monthEndFormul01;
	}

	public String getMonthEndFormul02() {
		return monthEndFormul02;
	}

	public void setMonthEndFormul02(String monthEndFormul02) {
		this.monthEndFormul02 = monthEndFormul02;
	}

	public String getMonthEndFormul03() {
		return monthEndFormul03;
	}

	public void setMonthEndFormul03(String monthEndFormul03) {
		this.monthEndFormul03 = monthEndFormul03;
	}

	public String getMonthEndFormul04() {
		return monthEndFormul04;
	}

	public void setMonthEndFormul04(String monthEndFormul04) {
		this.monthEndFormul04 = monthEndFormul04;
	}

	public String getMonthEndFormul05() {
		return monthEndFormul05;
	}

	public void setMonthEndFormul05(String monthEndFormul05) {
		this.monthEndFormul05 = monthEndFormul05;
	}

	public String getMonthEndFormul06() {
		return monthEndFormul06;
	}

	public void setMonthEndFormul06(String monthEndFormul06) {
		this.monthEndFormul06 = monthEndFormul06;
	}

	public String getMonthEndFormul07() {
		return monthEndFormul07;
	}

	public void setMonthEndFormul07(String monthEndFormul07) {
		this.monthEndFormul07 = monthEndFormul07;
	}

	public String getMonthEndFormul08() {
		return monthEndFormul08;
	}

	public void setMonthEndFormul08(String monthEndFormul08) {
		this.monthEndFormul08 = monthEndFormul08;
	}

	public String getMonthEndFormul09() {
		return monthEndFormul09;
	}

	public void setMonthEndFormul09(String monthEndFormul09) {
		this.monthEndFormul09 = monthEndFormul09;
	}

	public String getMonthEndFormul10() {
		return monthEndFormul10;
	}

	public void setMonthEndFormul10(String monthEndFormul10) {
		this.monthEndFormul10 = monthEndFormul10;
	}

	public String getBlankLine01() {
		return blankLine01;
	}

	public void setBlankLine01(String blankLine01) {
		this.blankLine01 = blankLine01;
	}

	public String getBlankLine02() {
		return blankLine02;
	}

	public void setBlankLine02(String blankLine02) {
		this.blankLine02 = blankLine02;
	}

	public String getBlankLine03() {
		return blankLine03;
	}

	public void setBlankLine03(String blankLine03) {
		this.blankLine03 = blankLine03;
	}

	public String getBlankLine04() {
		return blankLine04;
	}

	public void setBlankLine04(String blankLine04) {
		this.blankLine04 = blankLine04;
	}

	public String getBlankLine05() {
		return blankLine05;
	}

	public void setBlankLine05(String blankLine05) {
		this.blankLine05 = blankLine05;
	}

	public String getBlankLine06() {
		return blankLine06;
	}

	public void setBlankLine06(String blankLine06) {
		this.blankLine06 = blankLine06;
	}

	public String getBlankLine07() {
		return blankLine07;
	}

	public void setBlankLine07(String blankLine07) {
		this.blankLine07 = blankLine07;
	}

	public String getBlankLine08() {
		return blankLine08;
	}

	public void setBlankLine08(String blankLine08) {
		this.blankLine08 = blankLine08;
	}

	public String getBlankLine09() {
		return blankLine09;
	}

	public void setBlankLine09(String blankLine09) {
		this.blankLine09 = blankLine09;
	}

	public String getBlankLine10() {
		return blankLine10;
	}

	public void setBlankLine10(String blankLine10) {
		this.blankLine10 = blankLine10;
	}

	public String getShippingSite() {
		return shippingSite;
	}

	public void setShippingSite(String shippingSite) {
		this.shippingSite = shippingSite;
	}

}
