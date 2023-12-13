package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PpcPttProdCfgDQO extends DBO implements Serializable {
	
	private String ppcProduct;
	private String ppcDescription;
	private Integer ppcMaxUsers;
	private String ppcServiceCode;

	public static final int ppcProductFilter = 0;
	private static final int ppcProductSize = 7;

	public static final int ppcDescriptionFilter = 1;
	private static final int ppcDescriptionSize = 60;

	public static final int ppcMaxUsersFilter = 2;

	public static final int ppcServiceCodeFilter = 3;
	private static final int ppcServiceCodeSize = 4;

	public PpcPttProdCfgDQO() {
	};

	public PpcPttProdCfgDQO(final String ppcProduct,
			final String ppcDescription, final Integer ppcMaxUsers,
			final String ppcServiceCode) {

		this.ppcProduct = ppcProduct;
		this.ppcDescription = ppcDescription;
		this.ppcMaxUsers = ppcMaxUsers;
		this.ppcServiceCode = ppcServiceCode;
	};

	private static final int[] fieldSizes = new int[] { ppcProductSize,
			ppcDescriptionSize, 0, ppcServiceCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.ppcProduct == null) ? null
						: (this.ppcProduct.length() <= ppcProductSize) ? this.ppcProduct
								: this.ppcProduct.substring(0,
										this.ppcProductSize)),
				((this.ppcDescription == null) ? null : (this.ppcDescription
						.length() <= ppcDescriptionSize) ? this.ppcDescription
						: this.ppcDescription.substring(0,
								this.ppcDescriptionSize)),
				this.ppcMaxUsers,
				((this.ppcServiceCode == null) ? null : (this.ppcServiceCode
						.length() <= ppcServiceCodeSize) ? this.ppcServiceCode
						: this.ppcServiceCode.substring(0,
								this.ppcServiceCodeSize)) };
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
		this.ppcProduct = rtrim((String) fields[0]);
		this.ppcDescription = rtrim((String) fields[1]);
		this.ppcMaxUsers = ((Integer) fields[2]);
		this.ppcServiceCode = rtrim((String) fields[3]);
	}

	public void set(final String ppcProduct, final String ppcDescription,
			final Integer ppcMaxUsers, final String ppcServiceCode) {

		this.ppcProduct = ppcProduct;
		this.ppcDescription = ppcDescription;
		this.ppcMaxUsers = ppcMaxUsers;
		this.ppcServiceCode = ppcServiceCode;
	}

	public String getPpcProduct() {
		return ppcProduct;
	}

	public void setPpcProduct(String ppcProduct) {
		this.ppcProduct = ppcProduct;
	}

	public String getPpcDescription() {
		return ppcDescription;
	}

	public void setPpcDescription(String ppcDescription) {
		this.ppcDescription = ppcDescription;
	}

	public Integer getPpcMaxUsers() {
		return ppcMaxUsers;
	}

	public void setPpcMaxUsers(Integer ppcMaxUsers) {
		this.ppcMaxUsers = ppcMaxUsers;
	}

	public String getPpcServiceCode() {
		return ppcServiceCode;
	}

	public void setPpcServiceCode(String ppcServiceCode) {
		this.ppcServiceCode = ppcServiceCode;
	}
}
