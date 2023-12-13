package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.SvrServRuleDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SvrVsrDQO extends DBO implements Serializable {

	private SvrServRuleDMO svrDMO;
	private VsrServiceDMO vsrDMO;
	
	private String svrPrimaryServ;
	private String svrServType;
	private String svrTargetServ;
	private String svrServHierarchy;
	private String svrNetTar;
	private String vsrServiceCode;
	private String vsrServiceType;
	private String vsrServiceDesc;
	private String vsrOriginator;
	private String vsrServiceClass;
	private String vsrTempDeact;
	private String vsrProrata;
	private String vsrProviderId;
	private String vsrShortDesc;
	private String vsrSuspend;

	public static final int svrPrimaryServFilter = 0;
	private static final int svrPrimaryServSize = 4;

	public static final int svrServTypeFilter = 1;
	private static final int svrServTypeSize = 1;

	public static final int svrTargetServFilter = 2;
	private static final int svrTargetServSize = 4;

	public static final int svrServHierarchyFilter = 3;
	private static final int svrServHierarchySize = 1;

	public static final int svrNetTarFilter = 4;
	private static final int svrNetTarSize = 5;

	public static final int vsrServiceCodeFilter = 5;
	private static final int vsrServiceCodeSize = 4;

	public static final int vsrServiceTypeFilter = 6;
	private static final int vsrServiceTypeSize = 5;

	public static final int vsrServiceDescFilter = 7;
	private static final int vsrServiceDescSize = 32;

	public static final int vsrOriginatorFilter = 8;
	private static final int vsrOriginatorSize = 1;

	public static final int vsrServiceClassFilter = 9;
	private static final int vsrServiceClassSize = 1;

	public static final int vsrTempDeactFilter = 10;
	private static final int vsrTempDeactSize = 1;

	public static final int vsrProrataFilter = 11;
	private static final int vsrProrataSize = 1;

	public static final int vsrProviderIdFilter = 12;
	private static final int vsrProviderIdSize = 5;

	public static final int vsrShortDescFilter = 13;
	private static final int vsrShortDescSize = 8;

	public static final int vsrSuspendFilter = 14;
	private static final int vsrSuspendSize = 1;

	public SvrVsrDQO() {
	};

	public SvrVsrDQO(final String svrPrimaryServ, final String svrServType,
			final String svrTargetServ, final String svrServHierarchy,
			final String svrNetTar, final String vsrServiceCode,
			final String vsrServiceType, final String vsrServiceDesc,
			final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata,
			final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend) {

		this.svrPrimaryServ = svrPrimaryServ;
		this.svrServType = svrServType;
		this.svrTargetServ = svrTargetServ;
		this.svrServHierarchy = svrServHierarchy;
		this.svrNetTar = svrNetTar;
		this.vsrServiceCode = vsrServiceCode;
		this.vsrServiceType = vsrServiceType;
		this.vsrServiceDesc = vsrServiceDesc;
		this.vsrOriginator = vsrOriginator;
		this.vsrServiceClass = vsrServiceClass;
		this.vsrTempDeact = vsrTempDeact;
		this.vsrProrata = vsrProrata;
		this.vsrProviderId = vsrProviderId;
		this.vsrShortDesc = vsrShortDesc;
		this.vsrSuspend = vsrSuspend;
	};

	private static final int[] fieldSizes = new int[] { svrPrimaryServSize,
			svrServTypeSize, svrTargetServSize, svrServHierarchySize,
			svrNetTarSize, vsrServiceCodeSize, vsrServiceTypeSize,
			vsrServiceDescSize, vsrOriginatorSize, vsrServiceClassSize,
			vsrTempDeactSize, vsrProrataSize, vsrProviderIdSize,
			vsrShortDescSize, vsrSuspendSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.svrPrimaryServ == null) ? null : (this.svrPrimaryServ
						.length() <= svrPrimaryServSize) ? this.svrPrimaryServ
						: this.svrPrimaryServ.substring(0,
								this.svrPrimaryServSize)),
				((this.svrServType == null) ? null
						: (this.svrServType.length() <= svrServTypeSize) ? this.svrServType
								: this.svrServType.substring(0,
										this.svrServTypeSize)),
				((this.svrTargetServ == null) ? null : (this.svrTargetServ
						.length() <= svrTargetServSize) ? this.svrTargetServ
						: this.svrTargetServ.substring(0,
								this.svrTargetServSize)),
				((this.svrServHierarchy == null) ? null
						: (this.svrServHierarchy.length() <= svrServHierarchySize) ? this.svrServHierarchy
								: this.svrServHierarchy.substring(0,
										this.svrServHierarchySize)),
				((this.svrNetTar == null) ? null
						: (this.svrNetTar.length() <= svrNetTarSize) ? this.svrNetTar
								: this.svrNetTar.substring(0,
										this.svrNetTarSize)),
				((this.vsrServiceCode == null) ? null : (this.vsrServiceCode
						.length() <= vsrServiceCodeSize) ? this.vsrServiceCode
						: this.vsrServiceCode.substring(0,
								this.vsrServiceCodeSize)),
				((this.vsrServiceType == null) ? null : (this.vsrServiceType
						.length() <= vsrServiceTypeSize) ? this.vsrServiceType
						: this.vsrServiceType.substring(0,
								this.vsrServiceTypeSize)),
				((this.vsrServiceDesc == null) ? null : (this.vsrServiceDesc
						.length() <= vsrServiceDescSize) ? this.vsrServiceDesc
						: this.vsrServiceDesc.substring(0,
								this.vsrServiceDescSize)),
				((this.vsrOriginator == null) ? null : (this.vsrOriginator
						.length() <= vsrOriginatorSize) ? this.vsrOriginator
						: this.vsrOriginator.substring(0,
								this.vsrOriginatorSize)),
				((this.vsrServiceClass == null) ? null
						: (this.vsrServiceClass.length() <= vsrServiceClassSize) ? this.vsrServiceClass
								: this.vsrServiceClass.substring(0,
										this.vsrServiceClassSize)),
				((this.vsrTempDeact == null) ? null : (this.vsrTempDeact
						.length() <= vsrTempDeactSize) ? this.vsrTempDeact
						: this.vsrTempDeact.substring(0, this.vsrTempDeactSize)),
				((this.vsrProrata == null) ? null
						: (this.vsrProrata.length() <= vsrProrataSize) ? this.vsrProrata
								: this.vsrProrata.substring(0,
										this.vsrProrataSize)),
				((this.vsrProviderId == null) ? null : (this.vsrProviderId
						.length() <= vsrProviderIdSize) ? this.vsrProviderId
						: this.vsrProviderId.substring(0,
								this.vsrProviderIdSize)),
				((this.vsrShortDesc == null) ? null : (this.vsrShortDesc
						.length() <= vsrShortDescSize) ? this.vsrShortDesc
						: this.vsrShortDesc.substring(0, this.vsrShortDescSize)),
				((this.vsrSuspend == null) ? null
						: (this.vsrSuspend.length() <= vsrSuspendSize) ? this.vsrSuspend
								: this.vsrSuspend.substring(0,
										this.vsrSuspendSize)) };
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
		this.svrPrimaryServ = rtrim((String) fields[0]);
		this.svrServType = rtrim((String) fields[1]);
		this.svrTargetServ = rtrim((String) fields[2]);
		this.svrServHierarchy = rtrim((String) fields[3]);
		this.svrNetTar = rtrim((String) fields[4]);
		this.vsrServiceCode = rtrim((String) fields[5]);
		this.vsrServiceType = rtrim((String) fields[6]);
		this.vsrServiceDesc = rtrim((String) fields[7]);
		this.vsrOriginator = rtrim((String) fields[8]);
		this.vsrServiceClass = rtrim((String) fields[9]);
		this.vsrTempDeact = rtrim((String) fields[10]);
		this.vsrProrata = rtrim((String) fields[11]);
		this.vsrProviderId = rtrim((String) fields[12]);
		this.vsrShortDesc = rtrim((String) fields[13]);
		this.vsrSuspend = rtrim((String) fields[14]);
	}

	public void set(final String svrPrimaryServ, final String svrServType,
			final String svrTargetServ, final String svrServHierarchy,
			final String svrNetTar, final String vsrServiceCode,
			final String vsrServiceType, final String vsrServiceDesc,
			final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata,
			final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend) {

		this.svrPrimaryServ = svrPrimaryServ;
		this.svrServType = svrServType;
		this.svrTargetServ = svrTargetServ;
		this.svrServHierarchy = svrServHierarchy;
		this.svrNetTar = svrNetTar;
		this.vsrServiceCode = vsrServiceCode;
		this.vsrServiceType = vsrServiceType;
		this.vsrServiceDesc = vsrServiceDesc;
		this.vsrOriginator = vsrOriginator;
		this.vsrServiceClass = vsrServiceClass;
		this.vsrTempDeact = vsrTempDeact;
		this.vsrProrata = vsrProrata;
		this.vsrProviderId = vsrProviderId;
		this.vsrShortDesc = vsrShortDesc;
		this.vsrSuspend = vsrSuspend;
	}
	
	public void deConstruct(){
		svrDMO = new SvrServRuleDMO(svrPrimaryServ, svrServType, svrTargetServ, svrServHierarchy);
		
		vsrDMO = new VsrServiceDMO(vsrServiceCode, vsrServiceType, vsrServiceDesc, vsrOriginator, vsrServiceClass, vsrTempDeact, vsrProrata, vsrProviderId, vsrShortDesc, vsrSuspend);
	}

	public String getSvrPrimaryServ() {
		return svrPrimaryServ;
	}

	public void setSvrPrimaryServ(String svrPrimaryServ) {
		this.svrPrimaryServ = svrPrimaryServ;
	}

	public String getSvrServType() {
		return svrServType;
	}

	public void setSvrServType(String svrServType) {
		this.svrServType = svrServType;
	}

	public String getSvrTargetServ() {
		return svrTargetServ;
	}

	public void setSvrTargetServ(String svrTargetServ) {
		this.svrTargetServ = svrTargetServ;
	}

	public String getSvrServHierarchy() {
		return svrServHierarchy;
	}

	public void setSvrServHierarchy(String svrServHierarchy) {
		this.svrServHierarchy = svrServHierarchy;
	}

	public String getSvrNetTar() {
		return svrNetTar;
	}

	public void setSvrNetTar(String svrNetTar) {
		this.svrNetTar = svrNetTar;
	}

	public String getVsrServiceCode() {
		return vsrServiceCode;
	}

	public void setVsrServiceCode(String vsrServiceCode) {
		this.vsrServiceCode = vsrServiceCode;
	}

	public String getVsrServiceType() {
		return vsrServiceType;
	}

	public void setVsrServiceType(String vsrServiceType) {
		this.vsrServiceType = vsrServiceType;
	}

	public String getVsrServiceDesc() {
		return vsrServiceDesc;
	}

	public void setVsrServiceDesc(String vsrServiceDesc) {
		this.vsrServiceDesc = vsrServiceDesc;
	}

	public String getVsrOriginator() {
		return vsrOriginator;
	}

	public void setVsrOriginator(String vsrOriginator) {
		this.vsrOriginator = vsrOriginator;
	}

	public String getVsrServiceClass() {
		return vsrServiceClass;
	}

	public void setVsrServiceClass(String vsrServiceClass) {
		this.vsrServiceClass = vsrServiceClass;
	}

	public String getVsrTempDeact() {
		return vsrTempDeact;
	}

	public void setVsrTempDeact(String vsrTempDeact) {
		this.vsrTempDeact = vsrTempDeact;
	}

	public String getVsrProrata() {
		return vsrProrata;
	}

	public void setVsrProrata(String vsrProrata) {
		this.vsrProrata = vsrProrata;
	}

	public String getVsrProviderId() {
		return vsrProviderId;
	}

	public void setVsrProviderId(String vsrProviderId) {
		this.vsrProviderId = vsrProviderId;
	}

	public String getVsrShortDesc() {
		return vsrShortDesc;
	}

	public void setVsrShortDesc(String vsrShortDesc) {
		this.vsrShortDesc = vsrShortDesc;
	}

	public String getVsrSuspend() {
		return vsrSuspend;
	}

	public void setVsrSuspend(String vsrSuspend) {
		this.vsrSuspend = vsrSuspend;
	}

	public SvrServRuleDMO getSvrDMO() {
		return svrDMO;
	}

	public void setSvrDMO(SvrServRuleDMO svrDMO) {
		this.svrDMO = svrDMO;
	}

	public VsrServiceDMO getVsrDMO() {
		return vsrDMO;
	}

	public void setVsrDMO(VsrServiceDMO vsrDMO) {
		this.vsrDMO = vsrDMO;
	}

	@Override
	public String toString() {
		return "\nSvrVsrDQO [\nsvrDMO=" + svrDMO + "\nvsrDMO=" + vsrDMO
				+ "\nsvrPrimaryServ=" + svrPrimaryServ + "\nsvrServType="
				+ svrServType + "\nsvrTargetServ=" + svrTargetServ
				+ "\nsvrServHierarchy=" + svrServHierarchy + "\nsvrNetTar="
				+ svrNetTar + "\nvsrServiceCode=" + vsrServiceCode
				+ "\nvsrServiceType=" + vsrServiceType + "\nvsrServiceDesc="
				+ vsrServiceDesc + "\nvsrOriginator=" + vsrOriginator
				+ "\nvsrServiceClass=" + vsrServiceClass + "\nvsrTempDeact="
				+ vsrTempDeact + "\nvsrProrata=" + vsrProrata
				+ "\nvsrProviderId=" + vsrProviderId + "\nvsrShortDesc="
				+ vsrShortDesc + "\nvsrSuspend=" + vsrSuspend + "]";
	}

}
