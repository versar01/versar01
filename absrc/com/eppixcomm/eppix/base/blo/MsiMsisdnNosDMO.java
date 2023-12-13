package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class MsiMsisdnNosDMO extends DBO implements Serializable {

	private String MsiOrigProvId;
	private String MsiImpProvId;
	private String MsiOrigServProv;
	private String MsiImpServProv;
	private String MsiMsisdnNo;
	private Integer MsiSubscriberId;
	private String MsiSimNo;
	private String MsiDealerId;
	private String MsiBillAcNo;
	private Integer MsiPartnerId;
	private String MsiApnPopId;
	private String MsiAccType;
	private String MsiUserId;
	private String MsiHlr;
	private String MsiStatus;
	private String MsiMsisdnType;
	private String MsiDummy;
	private String MsiCharAnal1;
	private String MsiCharAnal2;
	private String MsiCharAnal3;
	private String MsiCharAnal4;
	private String MsiCharAnal5;
	private Integer MsiIntAnal1;
	private Integer MsiIntAnal2;
	private Integer MsiIntAnal3;

	public static final int MsiOrigProvIdFilter = 0;
	private static final int MsiOrigProvIdSize = 5;

	public static final int MsiImpProvIdFilter = 1;
	private static final int MsiImpProvIdSize = 5;

	public static final int MsiOrigServProvFilter = 2;
	private static final int MsiOrigServProvSize = 5;

	public static final int MsiImpServProvFilter = 3;
	private static final int MsiImpServProvSize = 5;

	public static final int MsiMsisdnNoFilter = 4;
	private static final int MsiMsisdnNoSize = 15;

	public static final int MsiSubscriberIdFilter = 5;

	public static final int MsiSimNoFilter = 6;
	private static final int MsiSimNoSize = 14;

	public static final int MsiDealerIdFilter = 7;
	private static final int MsiDealerIdSize = 8;

	public static final int MsiBillAcNoFilter = 8;
	private static final int MsiBillAcNoSize = 8;

	public static final int MsiPartnerIdFilter = 9;

	public static final int MsiApnPopIdFilter = 10;
	private static final int MsiApnPopIdSize = 15;

	public static final int MsiAccTypeFilter = 11;
	private static final int MsiAccTypeSize = 5;

	public static final int MsiUserIdFilter = 12;
	private static final int MsiUserIdSize = 10;

	public static final int MsiHlrFilter = 13;
	private static final int MsiHlrSize = 2;

	public static final int MsiStatusFilter = 14;
	private static final int MsiStatusSize = 1;

	public static final int MsiMsisdnTypeFilter = 15;
	private static final int MsiMsisdnTypeSize = 50;

	public static final int MsiDummyFilter = 16;
	private static final int MsiDummySize = 1;

	public static final int MsiCharAnal1Filter = 17;
	private static final int MsiCharAnal1Size = 30;

	public static final int MsiCharAnal2Filter = 18;
	private static final int MsiCharAnal2Size = 30;

	public static final int MsiCharAnal3Filter = 19;
	private static final int MsiCharAnal3Size = 30;

	public static final int MsiCharAnal4Filter = 20;
	private static final int MsiCharAnal4Size = 30;

	public static final int MsiCharAnal5Filter = 21;
	private static final int MsiCharAnal5Size = 30;

	public static final int MsiIntAnal1Filter = 22;

	public static final int MsiIntAnal2Filter = 23;

	public static final int MsiIntAnal3Filter = 24;

	public MsiMsisdnNosDMO() {
	};

	public MsiMsisdnNosDMO(final String MsiOrigProvId,
			final String MsiImpProvId, final String MsiOrigServProv,
			final String MsiImpServProv, final String MsiMsisdnNo,
			final Integer MsiSubscriberId, final String MsiSimNo,
			final String MsiDealerId, final String MsiBillAcNo,
			final Integer MsiPartnerId, final String MsiApnPopId,
			final String MsiAccType, final String MsiUserId,
			final String MsiHlr, final String MsiStatus,
			final String MsiMsisdnType, final String MsiDummy,
			final String MsiCharAnal1, final String MsiCharAnal2,
			final String MsiCharAnal3, final String MsiCharAnal4,
			final String MsiCharAnal5, final Integer MsiIntAnal1,
			final Integer MsiIntAnal2, final Integer MsiIntAnal3) {

		this.MsiOrigProvId = MsiOrigProvId;
		this.MsiImpProvId = MsiImpProvId;
		this.MsiOrigServProv = MsiOrigServProv;
		this.MsiImpServProv = MsiImpServProv;
		this.MsiMsisdnNo = MsiMsisdnNo;
		this.MsiSubscriberId = MsiSubscriberId;
		this.MsiSimNo = MsiSimNo;
		this.MsiDealerId = MsiDealerId;
		this.MsiBillAcNo = MsiBillAcNo;
		this.MsiPartnerId = MsiPartnerId;
		this.MsiApnPopId = MsiApnPopId;
		this.MsiAccType = MsiAccType;
		this.MsiUserId = MsiUserId;
		this.MsiHlr = MsiHlr;
		this.MsiStatus = MsiStatus;
		this.MsiMsisdnType = MsiMsisdnType;
		this.MsiDummy = MsiDummy;
		this.MsiCharAnal1 = MsiCharAnal1;
		this.MsiCharAnal2 = MsiCharAnal2;
		this.MsiCharAnal3 = MsiCharAnal3;
		this.MsiCharAnal4 = MsiCharAnal4;
		this.MsiCharAnal5 = MsiCharAnal5;
		this.MsiIntAnal1 = MsiIntAnal1;
		this.MsiIntAnal2 = MsiIntAnal2;
		this.MsiIntAnal3 = MsiIntAnal3;
	};

	private static final int[] fieldSizes = new int[] { MsiOrigProvIdSize,
			MsiImpProvIdSize, MsiOrigServProvSize, MsiImpServProvSize,
			MsiMsisdnNoSize, 0, MsiSimNoSize, MsiDealerIdSize, MsiBillAcNoSize,
			0, MsiApnPopIdSize, MsiAccTypeSize, MsiUserIdSize, MsiHlrSize,
			MsiStatusSize, MsiMsisdnTypeSize, MsiDummySize, MsiCharAnal1Size,
			MsiCharAnal2Size, MsiCharAnal3Size, MsiCharAnal4Size,
			MsiCharAnal5Size, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.MsiOrigProvId == null) ? null : (this.MsiOrigProvId
						.length() <= MsiOrigProvIdSize) ? this.MsiOrigProvId
						: this.MsiOrigProvId.substring(0,
								this.MsiOrigProvIdSize)),
				((this.MsiImpProvId == null) ? null : (this.MsiImpProvId
						.length() <= MsiImpProvIdSize) ? this.MsiImpProvId
						: this.MsiImpProvId.substring(0, this.MsiImpProvIdSize)),
				((this.MsiOrigServProv == null) ? null
						: (this.MsiOrigServProv.length() <= MsiOrigServProvSize) ? this.MsiOrigServProv
								: this.MsiOrigServProv.substring(0,
										this.MsiOrigServProvSize)),
				((this.MsiImpServProv == null) ? null : (this.MsiImpServProv
						.length() <= MsiImpServProvSize) ? this.MsiImpServProv
						: this.MsiImpServProv.substring(0,
								this.MsiImpServProvSize)),
				((this.MsiMsisdnNo == null) ? null
						: (this.MsiMsisdnNo.length() <= MsiMsisdnNoSize) ? this.MsiMsisdnNo
								: this.MsiMsisdnNo.substring(0,
										this.MsiMsisdnNoSize)),
				this.MsiSubscriberId,
				((this.MsiSimNo == null) ? null
						: (this.MsiSimNo.length() <= MsiSimNoSize) ? this.MsiSimNo
								: this.MsiSimNo.substring(0, this.MsiSimNoSize)),
				((this.MsiDealerId == null) ? null
						: (this.MsiDealerId.length() <= MsiDealerIdSize) ? this.MsiDealerId
								: this.MsiDealerId.substring(0,
										this.MsiDealerIdSize)),
				((this.MsiBillAcNo == null) ? null
						: (this.MsiBillAcNo.length() <= MsiBillAcNoSize) ? this.MsiBillAcNo
								: this.MsiBillAcNo.substring(0,
										this.MsiBillAcNoSize)),
				this.MsiPartnerId,
				((this.MsiApnPopId == null) ? null
						: (this.MsiApnPopId.length() <= MsiApnPopIdSize) ? this.MsiApnPopId
								: this.MsiApnPopId.substring(0,
										this.MsiApnPopIdSize)),
				((this.MsiAccType == null) ? null
						: (this.MsiAccType.length() <= MsiAccTypeSize) ? this.MsiAccType
								: this.MsiAccType.substring(0,
										this.MsiAccTypeSize)),
				((this.MsiUserId == null) ? null
						: (this.MsiUserId.length() <= MsiUserIdSize) ? this.MsiUserId
								: this.MsiUserId.substring(0,
										this.MsiUserIdSize)),
				((this.MsiHlr == null) ? null
						: (this.MsiHlr.length() <= MsiHlrSize) ? this.MsiHlr
								: this.MsiHlr.substring(0, this.MsiHlrSize)),
				((this.MsiStatus == null) ? null
						: (this.MsiStatus.length() <= MsiStatusSize) ? this.MsiStatus
								: this.MsiStatus.substring(0,
										this.MsiStatusSize)),
				((this.MsiMsisdnType == null) ? null : (this.MsiMsisdnType
						.length() <= MsiMsisdnTypeSize) ? this.MsiMsisdnType
						: this.MsiMsisdnType.substring(0,
								this.MsiMsisdnTypeSize)),
				((this.MsiDummy == null) ? null
						: (this.MsiDummy.length() <= MsiDummySize) ? this.MsiDummy
								: this.MsiDummy.substring(0, this.MsiDummySize)),
				((this.MsiCharAnal1 == null) ? null : (this.MsiCharAnal1
						.length() <= MsiCharAnal1Size) ? this.MsiCharAnal1
						: this.MsiCharAnal1.substring(0, this.MsiCharAnal1Size)),
				((this.MsiCharAnal2 == null) ? null : (this.MsiCharAnal2
						.length() <= MsiCharAnal2Size) ? this.MsiCharAnal2
						: this.MsiCharAnal2.substring(0, this.MsiCharAnal2Size)),
				((this.MsiCharAnal3 == null) ? null : (this.MsiCharAnal3
						.length() <= MsiCharAnal3Size) ? this.MsiCharAnal3
						: this.MsiCharAnal3.substring(0, this.MsiCharAnal3Size)),
				((this.MsiCharAnal4 == null) ? null : (this.MsiCharAnal4
						.length() <= MsiCharAnal4Size) ? this.MsiCharAnal4
						: this.MsiCharAnal4.substring(0, this.MsiCharAnal4Size)),
				((this.MsiCharAnal5 == null) ? null : (this.MsiCharAnal5
						.length() <= MsiCharAnal5Size) ? this.MsiCharAnal5
						: this.MsiCharAnal5.substring(0, this.MsiCharAnal5Size)),
				this.MsiIntAnal1, 
				this.MsiIntAnal2, 
				this.MsiIntAnal3 };
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
		return new DAOArgs(2).arg(this.MsiOrigProvId).arg(this.MsiMsisdnNo);
	}

	protected void set(Object[] fields) {
		this.MsiOrigProvId = rtrim((String) fields[0]);
		this.MsiImpProvId = rtrim((String) fields[1]);
		this.MsiOrigServProv = rtrim((String) fields[2]);
		this.MsiImpServProv = rtrim((String) fields[3]);
		this.MsiMsisdnNo = rtrim((String) fields[4]);
		this.MsiSubscriberId = ((Integer) fields[5]);
		this.MsiSimNo = rtrim((String) fields[6]);
		this.MsiDealerId = rtrim((String) fields[7]);
		this.MsiBillAcNo = rtrim((String) fields[8]);
		this.MsiPartnerId = ((Integer) fields[9]);
		this.MsiApnPopId = rtrim((String) fields[10]);
		this.MsiAccType = rtrim((String) fields[11]);
		this.MsiUserId = rtrim((String) fields[12]);
		this.MsiHlr = rtrim((String) fields[13]);
		this.MsiStatus = rtrim((String) fields[14]);
		this.MsiMsisdnType = rtrim((String) fields[15]);
		this.MsiDummy = rtrim((String) fields[16]);
		this.MsiCharAnal1 = rtrim((String) fields[17]);
		this.MsiCharAnal2 = rtrim((String) fields[18]);
		this.MsiCharAnal3 = rtrim((String) fields[19]);
		this.MsiCharAnal4 = rtrim((String) fields[20]);
		this.MsiCharAnal5 = rtrim((String) fields[21]);
		this.MsiIntAnal1 = ((Integer) fields[22]);
		this.MsiIntAnal2 = ((Integer) fields[23]);
		this.MsiIntAnal3 = ((Integer) fields[24]);
	}

	public void set(final String MsiOrigProvId, final String MsiImpProvId,
			final String MsiOrigServProv, final String MsiImpServProv,
			final String MsiMsisdnNo, final Integer MsiSubscriberId,
			final String MsiSimNo, final String MsiDealerId,
			final String MsiBillAcNo, final Integer MsiPartnerId,
			final String MsiApnPopId, final String MsiAccType,
			final String MsiUserId, final String MsiHlr,
			final String MsiStatus, final String MsiMsisdnType,
			final String MsiDummy, final String MsiCharAnal1,
			final String MsiCharAnal2, final String MsiCharAnal3,
			final String MsiCharAnal4, final String MsiCharAnal5,
			final Integer MsiIntAnal1, final Integer MsiIntAnal2,
			final Integer MsiIntAnal3) {

		this.MsiOrigProvId = MsiOrigProvId;
		this.MsiImpProvId = MsiImpProvId;
		this.MsiOrigServProv = MsiOrigServProv;
		this.MsiImpServProv = MsiImpServProv;
		this.MsiMsisdnNo = MsiMsisdnNo;
		this.MsiSubscriberId = MsiSubscriberId;
		this.MsiSimNo = MsiSimNo;
		this.MsiDealerId = MsiDealerId;
		this.MsiBillAcNo = MsiBillAcNo;
		this.MsiPartnerId = MsiPartnerId;
		this.MsiApnPopId = MsiApnPopId;
		this.MsiAccType = MsiAccType;
		this.MsiUserId = MsiUserId;
		this.MsiHlr = MsiHlr;
		this.MsiStatus = MsiStatus;
		this.MsiMsisdnType = MsiMsisdnType;
		this.MsiDummy = MsiDummy;
		this.MsiCharAnal1 = MsiCharAnal1;
		this.MsiCharAnal2 = MsiCharAnal2;
		this.MsiCharAnal3 = MsiCharAnal3;
		this.MsiCharAnal4 = MsiCharAnal4;
		this.MsiCharAnal5 = MsiCharAnal5;
		this.MsiIntAnal1 = MsiIntAnal1;
		this.MsiIntAnal2 = MsiIntAnal2;
		this.MsiIntAnal3 = MsiIntAnal3;
	}

	public String getMsiOrigProvId() {
		return MsiOrigProvId;
	}

	public void setMsiOrigProvId(String msiOrigProvId) {
		MsiOrigProvId = msiOrigProvId;
	}

	public String getMsiImpProvId() {
		return MsiImpProvId;
	}

	public void setMsiImpProvId(String msiImpProvId) {
		MsiImpProvId = msiImpProvId;
	}

	public String getMsiOrigServProv() {
		return MsiOrigServProv;
	}

	public void setMsiOrigServProv(String msiOrigServProv) {
		MsiOrigServProv = msiOrigServProv;
	}

	public String getMsiImpServProv() {
		return MsiImpServProv;
	}

	public void setMsiImpServProv(String msiImpServProv) {
		MsiImpServProv = msiImpServProv;
	}

	public String getMsiMsisdnNo() {
		return MsiMsisdnNo;
	}

	public void setMsiMsisdnNo(String msiMsisdnNo) {
		MsiMsisdnNo = msiMsisdnNo;
	}

	public Integer getMsiSubscriberId() {
		return MsiSubscriberId;
	}

	public void setMsiSubscriberId(Integer msiSubscriberId) {
		MsiSubscriberId = msiSubscriberId;
	}

	public String getMsiSimNo() {
		return MsiSimNo;
	}

	public void setMsiSimNo(String msiSimNo) {
		MsiSimNo = msiSimNo;
	}

	public String getMsiDealerId() {
		return MsiDealerId;
	}

	public void setMsiDealerId(String msiDealerId) {
		MsiDealerId = msiDealerId;
	}

	public String getMsiBillAcNo() {
		return MsiBillAcNo;
	}

	public void setMsiBillAcNo(String msiBillAcNo) {
		MsiBillAcNo = msiBillAcNo;
	}

	public Integer getMsiPartnerId() {
		return MsiPartnerId;
	}

	public void setMsiPartnerId(Integer msiPartnerId) {
		MsiPartnerId = msiPartnerId;
	}

	public String getMsiApnPopId() {
		return MsiApnPopId;
	}

	public void setMsiApnPopId(String msiApnPopId) {
		MsiApnPopId = msiApnPopId;
	}

	public String getMsiAccType() {
		return MsiAccType;
	}

	public void setMsiAccType(String msiAccType) {
		MsiAccType = msiAccType;
	}

	public String getMsiUserId() {
		return MsiUserId;
	}

	public void setMsiUserId(String msiUserId) {
		MsiUserId = msiUserId;
	}

	public String getMsiHlr() {
		return MsiHlr;
	}

	public void setMsiHlr(String msiHlr) {
		MsiHlr = msiHlr;
	}

	public String getMsiStatus() {
		return MsiStatus;
	}

	public void setMsiStatus(String msiStatus) {
		MsiStatus = msiStatus;
	}

	public String getMsiMsisdnType() {
		return MsiMsisdnType;
	}

	public void setMsiMsisdnType(String msiMsisdnType) {
		MsiMsisdnType = msiMsisdnType;
	}

	public String getMsiDummy() {
		return MsiDummy;
	}

	public void setMsiDummy(String msiDummy) {
		MsiDummy = msiDummy;
	}

	public String getMsiCharAnal1() {
		return MsiCharAnal1;
	}

	public void setMsiCharAnal1(String msiCharAnal1) {
		MsiCharAnal1 = msiCharAnal1;
	}

	public String getMsiCharAnal2() {
		return MsiCharAnal2;
	}

	public void setMsiCharAnal2(String msiCharAnal2) {
		MsiCharAnal2 = msiCharAnal2;
	}

	public String getMsiCharAnal3() {
		return MsiCharAnal3;
	}

	public void setMsiCharAnal3(String msiCharAnal3) {
		MsiCharAnal3 = msiCharAnal3;
	}

	public String getMsiCharAnal4() {
		return MsiCharAnal4;
	}

	public void setMsiCharAnal4(String msiCharAnal4) {
		MsiCharAnal4 = msiCharAnal4;
	}

	public String getMsiCharAnal5() {
		return MsiCharAnal5;
	}

	public void setMsiCharAnal5(String msiCharAnal5) {
		MsiCharAnal5 = msiCharAnal5;
	}

	public Integer getMsiIntAnal1() {
		return MsiIntAnal1;
	}

	public void setMsiIntAnal1(Integer msiIntAnal1) {
		MsiIntAnal1 = msiIntAnal1;
	}

	public Integer getMsiIntAnal2() {
		return MsiIntAnal2;
	}

	public void setMsiIntAnal2(Integer msiIntAnal2) {
		MsiIntAnal2 = msiIntAnal2;
	}

	public Integer getMsiIntAnal3() {
		return MsiIntAnal3;
	}

	public void setMsiIntAnal3(Integer msiIntAnal3) {
		MsiIntAnal3 = msiIntAnal3;
	}
}