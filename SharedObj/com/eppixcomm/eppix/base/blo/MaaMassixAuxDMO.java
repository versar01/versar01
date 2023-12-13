package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class MaaMassixAuxDMO extends DBO implements Serializable {

	private String maaTransactId;
	private String maaActiveFlag;
	private String maaActionType;
	private String maaFileId;
	private String maaMsisdnNo;
	private String maaSimNo;
	private String maaBillAcNo;
	private Integer maaSubscriberId;
	private String maaAnalysis1;
	private String maaAnalysis2;
	private String maaAnalysis3;
	private String maaAnalysis4;
	private String maaAnalysis5;
	private String maaAnalysis6;
	private String maaAnalysis7;
	private String maaAnalysis8;
	private String maaAnalysis9;
	private String maaAnalysis10;
	private String maaAnalysis11;
	private String maaAnalysis12;
	private String maaAnalysis13;
	private String maaAnalysis14;
	private String maaAnalysis15;
	private String maaAnalysis16;
	private String maaAnalysis17;
	private String maaAnalysis18;
	private String maaAnalysis19;
	private String maaAnalysis20;
	private String maaAnalysis21;
	private String maaAnalysis22;
	private String maaAnalysis23;
	private String maaAnalysis24;
	private String maaAnalysis25;
	private String maaAnalysis26;
	private String maaAnalysis27;
	private String maaAnalysis28;
	private String maaAnalysis29;
	private String maaAnalysis30;
	private Date maaSubmitDate;
	private Date maaProcessedDate;
	private String maaProcessedStat;
	private String maaComments;
	private String maaSystemReq;

	public static final int maaTransactIdFilter = 0;
	private static final int maaTransactIdSize = 45;

	public static final int maaActiveFlagFilter = 1;
	private static final int maaActiveFlagSize = 1;

	public static final int maaActionTypeFilter = 2;
	private static final int maaActionTypeSize = 5;

	public static final int maaFileIdFilter = 3;
	private static final int maaFileIdSize = 30;

	public static final int maaMsisdnNoFilter = 4;
	private static final int maaMsisdnNoSize = 15;

	public static final int maaSimNoFilter = 5;
	private static final int maaSimNoSize = 15;

	public static final int maaBillAcNoFilter = 6;
	private static final int maaBillAcNoSize = 8;

	public static final int maaSubscriberIdFilter = 7;

	public static final int maaAnalysis1Filter = 8;
	private static final int maaAnalysis1Size = 15;

	public static final int maaAnalysis2Filter = 9;
	private static final int maaAnalysis2Size = 15;

	public static final int maaAnalysis3Filter = 10;
	private static final int maaAnalysis3Size = 15;

	public static final int maaAnalysis4Filter = 11;
	private static final int maaAnalysis4Size = 15;

	public static final int maaAnalysis5Filter = 12;
	private static final int maaAnalysis5Size = 15;

	public static final int maaAnalysis6Filter = 13;
	private static final int maaAnalysis6Size = 15;

	public static final int maaAnalysis7Filter = 14;
	private static final int maaAnalysis7Size = 15;

	public static final int maaAnalysis8Filter = 15;
	private static final int maaAnalysis8Size = 15;

	public static final int maaAnalysis9Filter = 16;
	private static final int maaAnalysis9Size = 15;

	public static final int maaAnalysis10Filter = 17;
	private static final int maaAnalysis10Size = 15;

	public static final int maaAnalysis11Filter = 18;
	private static final int maaAnalysis11Size = 15;

	public static final int maaAnalysis12Filter = 19;
	private static final int maaAnalysis12Size = 15;

	public static final int maaAnalysis13Filter = 20;
	private static final int maaAnalysis13Size = 15;

	public static final int maaAnalysis14Filter = 21;
	private static final int maaAnalysis14Size = 15;

	public static final int maaAnalysis15Filter = 22;
	private static final int maaAnalysis15Size = 15;

	public static final int maaAnalysis16Filter = 23;
	private static final int maaAnalysis16Size = 15;

	public static final int maaAnalysis17Filter = 24;
	private static final int maaAnalysis17Size = 15;

	public static final int maaAnalysis18Filter = 25;
	private static final int maaAnalysis18Size = 15;

	public static final int maaAnalysis19Filter = 26;
	private static final int maaAnalysis19Size = 15;

	public static final int maaAnalysis20Filter = 27;
	private static final int maaAnalysis20Size = 15;

	public static final int maaAnalysis21Filter = 28;
	private static final int maaAnalysis21Size = 15;

	public static final int maaAnalysis22Filter = 29;
	private static final int maaAnalysis22Size = 15;

	public static final int maaAnalysis23Filter = 30;
	private static final int maaAnalysis23Size = 15;

	public static final int maaAnalysis24Filter = 31;
	private static final int maaAnalysis24Size = 15;

	public static final int maaAnalysis25Filter = 32;
	private static final int maaAnalysis25Size = 15;

	public static final int maaAnalysis26Filter = 33;
	private static final int maaAnalysis26Size = 15;

	public static final int maaAnalysis27Filter = 34;
	private static final int maaAnalysis27Size = 15;

	public static final int maaAnalysis28Filter = 35;
	private static final int maaAnalysis28Size = 15;

	public static final int maaAnalysis29Filter = 36;
	private static final int maaAnalysis29Size = 15;

	public static final int maaAnalysis30Filter = 37;
	private static final int maaAnalysis30Size = 15;

	public static final int maaSubmitDateFilter = 38;

	public static final int maaProcessedDateFilter = 39;

	public static final int maaProcessedStatFilter = 40;
	private static final int maaProcessedStatSize = 1;

	public static final int maaCommentsFilter = 41;
	private static final int maaCommentsSize = 500;

	public static final int maaSystemReqFilter = 42;
	private static final int maaSystemReqSize = 10;

	public MaaMassixAuxDMO() {
	};

	public MaaMassixAuxDMO(final String maaTransactId, final String maaActiveFlag, final String maaActionType,
			final String maaFileId, final String maaMsisdnNo, final String maaSimNo, final String maaBillAcNo,
			final Integer maaSubscriberId, final String maaAnalysis1, final String maaAnalysis2,
			final String maaAnalysis3, final String maaAnalysis4, final String maaAnalysis5, final String maaAnalysis6,
			final String maaAnalysis7, final String maaAnalysis8, final String maaAnalysis9, final String maaAnalysis10,
			final String maaAnalysis11, final String maaAnalysis12, final String maaAnalysis13,
			final String maaAnalysis14, final String maaAnalysis15, final String maaAnalysis16,
			final String maaAnalysis17, final String maaAnalysis18, final String maaAnalysis19,
			final String maaAnalysis20, final String maaAnalysis21, final String maaAnalysis22,
			final String maaAnalysis23, final String maaAnalysis24, final String maaAnalysis25,
			final String maaAnalysis26, final String maaAnalysis27, final String maaAnalysis28,
			final String maaAnalysis29, final String maaAnalysis30, final Date maaSubmitDate,
			final Date maaProcessedDate, final String maaProcessedStat, final String maaComments,
			final String maaSystemReq) {

		this.maaTransactId = maaTransactId;
		this.maaActiveFlag = maaActiveFlag;
		this.maaActionType = maaActionType;
		this.maaFileId = maaFileId;
		this.maaMsisdnNo = maaMsisdnNo;
		this.maaSimNo = maaSimNo;
		this.maaBillAcNo = maaBillAcNo;
		this.maaSubscriberId = maaSubscriberId;
		this.maaAnalysis1 = maaAnalysis1;
		this.maaAnalysis2 = maaAnalysis2;
		this.maaAnalysis3 = maaAnalysis3;
		this.maaAnalysis4 = maaAnalysis4;
		this.maaAnalysis5 = maaAnalysis5;
		this.maaAnalysis6 = maaAnalysis6;
		this.maaAnalysis7 = maaAnalysis7;
		this.maaAnalysis8 = maaAnalysis8;
		this.maaAnalysis9 = maaAnalysis9;
		this.maaAnalysis10 = maaAnalysis10;
		this.maaAnalysis11 = maaAnalysis11;
		this.maaAnalysis12 = maaAnalysis12;
		this.maaAnalysis13 = maaAnalysis13;
		this.maaAnalysis14 = maaAnalysis14;
		this.maaAnalysis15 = maaAnalysis15;
		this.maaAnalysis16 = maaAnalysis16;
		this.maaAnalysis17 = maaAnalysis17;
		this.maaAnalysis18 = maaAnalysis18;
		this.maaAnalysis19 = maaAnalysis19;
		this.maaAnalysis20 = maaAnalysis20;
		this.maaAnalysis21 = maaAnalysis21;
		this.maaAnalysis22 = maaAnalysis22;
		this.maaAnalysis23 = maaAnalysis23;
		this.maaAnalysis24 = maaAnalysis24;
		this.maaAnalysis25 = maaAnalysis25;
		this.maaAnalysis26 = maaAnalysis26;
		this.maaAnalysis27 = maaAnalysis27;
		this.maaAnalysis28 = maaAnalysis28;
		this.maaAnalysis29 = maaAnalysis29;
		this.maaAnalysis30 = maaAnalysis30;
		this.maaSubmitDate = maaSubmitDate;
		this.maaProcessedDate = maaProcessedDate;
		this.maaProcessedStat = maaProcessedStat;
		this.maaComments = maaComments;
		this.maaSystemReq = maaSystemReq;
	};

	private static final int[] fieldSizes = new int[] { maaTransactIdSize, maaActiveFlagSize, maaActionTypeSize,
			maaFileIdSize, maaMsisdnNoSize, maaSimNoSize, maaBillAcNoSize, 0, maaAnalysis1Size, maaAnalysis2Size,
			maaAnalysis3Size, maaAnalysis4Size, maaAnalysis5Size, maaAnalysis6Size, maaAnalysis7Size, maaAnalysis8Size,
			maaAnalysis9Size, maaAnalysis10Size, maaAnalysis11Size, maaAnalysis12Size, maaAnalysis13Size,
			maaAnalysis14Size, maaAnalysis15Size, maaAnalysis16Size, maaAnalysis17Size, maaAnalysis18Size,
			maaAnalysis19Size, maaAnalysis20Size, maaAnalysis21Size, maaAnalysis22Size, maaAnalysis23Size,
			maaAnalysis24Size, maaAnalysis25Size, maaAnalysis26Size, maaAnalysis27Size, maaAnalysis28Size,
			maaAnalysis29Size, maaAnalysis30Size, 0, 0, maaProcessedStatSize, maaCommentsSize, maaSystemReqSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.maaTransactId == null) ? null
						: (this.maaTransactId.length() <= maaTransactIdSize) ? this.maaTransactId
								: this.maaTransactId.substring(0, this.maaTransactIdSize)),
				((this.maaActiveFlag == null) ? null
						: (this.maaActiveFlag.length() <= maaActiveFlagSize) ? this.maaActiveFlag
								: this.maaActiveFlag.substring(0, this.maaActiveFlagSize)),
				((this.maaActionType == null) ? null
						: (this.maaActionType.length() <= maaActionTypeSize) ? this.maaActionType
								: this.maaActionType.substring(0, this.maaActionTypeSize)),
				((this.maaFileId == null) ? null
						: (this.maaFileId.length() <= maaFileIdSize) ? this.maaFileId
								: this.maaFileId.substring(0, this.maaFileIdSize)),
				((this.maaMsisdnNo == null) ? null
						: (this.maaMsisdnNo.length() <= maaMsisdnNoSize) ? this.maaMsisdnNo
								: this.maaMsisdnNo.substring(0, this.maaMsisdnNoSize)),
				((this.maaSimNo == null) ? null
						: (this.maaSimNo.length() <= maaSimNoSize) ? this.maaSimNo
								: this.maaSimNo.substring(0, this.maaSimNoSize)),
				((this.maaBillAcNo == null) ? null
						: (this.maaBillAcNo.length() <= maaBillAcNoSize) ? this.maaBillAcNo
								: this.maaBillAcNo.substring(0, this.maaBillAcNoSize)),
				this.maaSubscriberId,
				((this.maaAnalysis1 == null) ? null
						: (this.maaAnalysis1.length() <= maaAnalysis1Size) ? this.maaAnalysis1
								: this.maaAnalysis1.substring(0, this.maaAnalysis1Size)),
				((this.maaAnalysis2 == null) ? null
						: (this.maaAnalysis2.length() <= maaAnalysis2Size) ? this.maaAnalysis2
								: this.maaAnalysis2.substring(0, this.maaAnalysis2Size)),
				((this.maaAnalysis3 == null) ? null
						: (this.maaAnalysis3.length() <= maaAnalysis3Size) ? this.maaAnalysis3
								: this.maaAnalysis3.substring(0, this.maaAnalysis3Size)),
				((this.maaAnalysis4 == null) ? null
						: (this.maaAnalysis4.length() <= maaAnalysis4Size) ? this.maaAnalysis4
								: this.maaAnalysis4.substring(0, this.maaAnalysis4Size)),
				((this.maaAnalysis5 == null) ? null
						: (this.maaAnalysis5.length() <= maaAnalysis5Size) ? this.maaAnalysis5
								: this.maaAnalysis5.substring(0, this.maaAnalysis5Size)),
				((this.maaAnalysis6 == null) ? null
						: (this.maaAnalysis6.length() <= maaAnalysis6Size) ? this.maaAnalysis6
								: this.maaAnalysis6.substring(0, this.maaAnalysis6Size)),
				((this.maaAnalysis7 == null) ? null
						: (this.maaAnalysis7.length() <= maaAnalysis7Size) ? this.maaAnalysis7
								: this.maaAnalysis7.substring(0, this.maaAnalysis7Size)),
				((this.maaAnalysis8 == null) ? null
						: (this.maaAnalysis8.length() <= maaAnalysis8Size) ? this.maaAnalysis8
								: this.maaAnalysis8.substring(0, this.maaAnalysis8Size)),
				((this.maaAnalysis9 == null) ? null
						: (this.maaAnalysis9.length() <= maaAnalysis9Size) ? this.maaAnalysis9
								: this.maaAnalysis9.substring(0, this.maaAnalysis9Size)),
				((this.maaAnalysis10 == null) ? null
						: (this.maaAnalysis10.length() <= maaAnalysis10Size) ? this.maaAnalysis10
								: this.maaAnalysis10.substring(0, this.maaAnalysis10Size)),
				((this.maaAnalysis11 == null) ? null
						: (this.maaAnalysis11.length() <= maaAnalysis11Size) ? this.maaAnalysis11
								: this.maaAnalysis11.substring(0, this.maaAnalysis11Size)),
				((this.maaAnalysis12 == null) ? null
						: (this.maaAnalysis12.length() <= maaAnalysis12Size) ? this.maaAnalysis12
								: this.maaAnalysis12.substring(0, this.maaAnalysis12Size)),
				((this.maaAnalysis13 == null) ? null
						: (this.maaAnalysis13.length() <= maaAnalysis13Size) ? this.maaAnalysis13
								: this.maaAnalysis13.substring(0, this.maaAnalysis13Size)),
				((this.maaAnalysis14 == null) ? null
						: (this.maaAnalysis14.length() <= maaAnalysis14Size) ? this.maaAnalysis14
								: this.maaAnalysis14.substring(0, this.maaAnalysis14Size)),
				((this.maaAnalysis15 == null) ? null
						: (this.maaAnalysis15.length() <= maaAnalysis15Size) ? this.maaAnalysis15
								: this.maaAnalysis15.substring(0, this.maaAnalysis15Size)),
				((this.maaAnalysis16 == null) ? null
						: (this.maaAnalysis16.length() <= maaAnalysis16Size) ? this.maaAnalysis16
								: this.maaAnalysis16.substring(0, this.maaAnalysis16Size)),
				((this.maaAnalysis17 == null) ? null
						: (this.maaAnalysis17.length() <= maaAnalysis17Size) ? this.maaAnalysis17
								: this.maaAnalysis17.substring(0, this.maaAnalysis17Size)),
				((this.maaAnalysis18 == null) ? null
						: (this.maaAnalysis18.length() <= maaAnalysis18Size) ? this.maaAnalysis18
								: this.maaAnalysis18.substring(0, this.maaAnalysis18Size)),
				((this.maaAnalysis19 == null) ? null
						: (this.maaAnalysis19.length() <= maaAnalysis19Size) ? this.maaAnalysis19
								: this.maaAnalysis19.substring(0, this.maaAnalysis19Size)),
				((this.maaAnalysis20 == null) ? null
						: (this.maaAnalysis20.length() <= maaAnalysis20Size) ? this.maaAnalysis20
								: this.maaAnalysis20.substring(0, this.maaAnalysis20Size)),
				((this.maaAnalysis21 == null) ? null
						: (this.maaAnalysis21.length() <= maaAnalysis21Size) ? this.maaAnalysis21
								: this.maaAnalysis21.substring(0, this.maaAnalysis21Size)),
				((this.maaAnalysis22 == null) ? null
						: (this.maaAnalysis22.length() <= maaAnalysis22Size) ? this.maaAnalysis22
								: this.maaAnalysis22.substring(0, this.maaAnalysis22Size)),
				((this.maaAnalysis23 == null) ? null
						: (this.maaAnalysis23.length() <= maaAnalysis23Size) ? this.maaAnalysis23
								: this.maaAnalysis23.substring(0, this.maaAnalysis23Size)),
				((this.maaAnalysis24 == null) ? null
						: (this.maaAnalysis24.length() <= maaAnalysis24Size) ? this.maaAnalysis24
								: this.maaAnalysis24.substring(0, this.maaAnalysis24Size)),
				((this.maaAnalysis25 == null) ? null
						: (this.maaAnalysis25.length() <= maaAnalysis25Size) ? this.maaAnalysis25
								: this.maaAnalysis25.substring(0, this.maaAnalysis25Size)),
				((this.maaAnalysis26 == null) ? null
						: (this.maaAnalysis26.length() <= maaAnalysis26Size) ? this.maaAnalysis26
								: this.maaAnalysis26.substring(0, this.maaAnalysis26Size)),
				((this.maaAnalysis27 == null) ? null
						: (this.maaAnalysis27.length() <= maaAnalysis27Size) ? this.maaAnalysis27
								: this.maaAnalysis27.substring(0, this.maaAnalysis27Size)),
				((this.maaAnalysis28 == null) ? null
						: (this.maaAnalysis28.length() <= maaAnalysis28Size) ? this.maaAnalysis28
								: this.maaAnalysis28.substring(0, this.maaAnalysis28Size)),
				((this.maaAnalysis29 == null) ? null
						: (this.maaAnalysis29.length() <= maaAnalysis29Size) ? this.maaAnalysis29
								: this.maaAnalysis29.substring(0, this.maaAnalysis29Size)),
				((this.maaAnalysis30 == null) ? null
						: (this.maaAnalysis30.length() <= maaAnalysis30Size) ? this.maaAnalysis30
								: this.maaAnalysis30.substring(0, this.maaAnalysis30Size)),
				this.maaSubmitDate, this.maaProcessedDate,
				((this.maaProcessedStat == null) ? null
						: (this.maaProcessedStat.length() <= maaProcessedStatSize) ? this.maaProcessedStat
								: this.maaProcessedStat.substring(0, this.maaProcessedStatSize)),
				((this.maaComments == null) ? null
						: (this.maaComments.length() <= maaCommentsSize) ? this.maaComments
								: this.maaComments.substring(0, this.maaCommentsSize)),
				((this.maaSystemReq == null) ? null
						: (this.maaSystemReq.length() <= maaSystemReqSize) ? this.maaSystemReq
								: this.maaSystemReq.substring(0, this.maaSystemReqSize)) };
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
		return new DAOArgs(4).arg(this.maaTransactId).arg(this.maaActiveFlag).arg(this.maaActionType).arg(this.maaFileId);
	}

	protected void set(Object[] fields) {
		this.maaTransactId = rtrim((String) fields[0]);
		this.maaActiveFlag = rtrim((String) fields[1]);
		this.maaActionType = rtrim((String) fields[2]);
		this.maaFileId = rtrim((String) fields[3]);
		this.maaMsisdnNo = rtrim((String) fields[4]);
		this.maaSimNo = rtrim((String) fields[5]);
		this.maaBillAcNo = rtrim((String) fields[6]);
		this.maaSubscriberId = ((Integer) fields[7]);
		this.maaAnalysis1 = rtrim((String) fields[8]);
		this.maaAnalysis2 = rtrim((String) fields[9]);
		this.maaAnalysis3 = rtrim((String) fields[10]);
		this.maaAnalysis4 = rtrim((String) fields[11]);
		this.maaAnalysis5 = rtrim((String) fields[12]);
		this.maaAnalysis6 = rtrim((String) fields[13]);
		this.maaAnalysis7 = rtrim((String) fields[14]);
		this.maaAnalysis8 = rtrim((String) fields[15]);
		this.maaAnalysis9 = rtrim((String) fields[16]);
		this.maaAnalysis10 = rtrim((String) fields[17]);
		this.maaAnalysis11 = rtrim((String) fields[18]);
		this.maaAnalysis12 = rtrim((String) fields[19]);
		this.maaAnalysis13 = rtrim((String) fields[20]);
		this.maaAnalysis14 = rtrim((String) fields[21]);
		this.maaAnalysis15 = rtrim((String) fields[22]);
		this.maaAnalysis16 = rtrim((String) fields[23]);
		this.maaAnalysis17 = rtrim((String) fields[24]);
		this.maaAnalysis18 = rtrim((String) fields[25]);
		this.maaAnalysis19 = rtrim((String) fields[26]);
		this.maaAnalysis20 = rtrim((String) fields[27]);
		this.maaAnalysis21 = rtrim((String) fields[28]);
		this.maaAnalysis22 = rtrim((String) fields[29]);
		this.maaAnalysis23 = rtrim((String) fields[30]);
		this.maaAnalysis24 = rtrim((String) fields[31]);
		this.maaAnalysis25 = rtrim((String) fields[32]);
		this.maaAnalysis26 = rtrim((String) fields[33]);
		this.maaAnalysis27 = rtrim((String) fields[34]);
		this.maaAnalysis28 = rtrim((String) fields[35]);
		this.maaAnalysis29 = rtrim((String) fields[36]);
		this.maaAnalysis30 = rtrim((String) fields[37]);
		this.maaSubmitDate = ((Date) fields[38]);
		this.maaProcessedDate = ((Date) fields[39]);
		this.maaProcessedStat = rtrim((String) fields[40]);
		this.maaComments = rtrim((String) fields[41]);
		this.maaSystemReq = rtrim((String) fields[42]);
	}

	public void set(final String maaTransactId, final String maaActiveFlag, final String maaActionType,
			final String maaFileId, final String maaMsisdnNo, final String maaSimNo, final String maaBillAcNo,
			final Integer maaSubscriberId, final String maaAnalysis1, final String maaAnalysis2,
			final String maaAnalysis3, final String maaAnalysis4, final String maaAnalysis5, final String maaAnalysis6,
			final String maaAnalysis7, final String maaAnalysis8, final String maaAnalysis9, final String maaAnalysis10,
			final String maaAnalysis11, final String maaAnalysis12, final String maaAnalysis13,
			final String maaAnalysis14, final String maaAnalysis15, final String maaAnalysis16,
			final String maaAnalysis17, final String maaAnalysis18, final String maaAnalysis19,
			final String maaAnalysis20, final String maaAnalysis21, final String maaAnalysis22,
			final String maaAnalysis23, final String maaAnalysis24, final String maaAnalysis25,
			final String maaAnalysis26, final String maaAnalysis27, final String maaAnalysis28,
			final String maaAnalysis29, final String maaAnalysis30, final Date maaSubmitDate,
			final Date maaProcessedDate, final String maaProcessedStat, final String maaComments,
			final String maaSystemReq) {

		this.maaTransactId = maaTransactId;
		this.maaActiveFlag = maaActiveFlag;
		this.maaActionType = maaActionType;
		this.maaFileId = maaFileId;
		this.maaMsisdnNo = maaMsisdnNo;
		this.maaSimNo = maaSimNo;
		this.maaBillAcNo = maaBillAcNo;
		this.maaSubscriberId = maaSubscriberId;
		this.maaAnalysis1 = maaAnalysis1;
		this.maaAnalysis2 = maaAnalysis2;
		this.maaAnalysis3 = maaAnalysis3;
		this.maaAnalysis4 = maaAnalysis4;
		this.maaAnalysis5 = maaAnalysis5;
		this.maaAnalysis6 = maaAnalysis6;
		this.maaAnalysis7 = maaAnalysis7;
		this.maaAnalysis8 = maaAnalysis8;
		this.maaAnalysis9 = maaAnalysis9;
		this.maaAnalysis10 = maaAnalysis10;
		this.maaAnalysis11 = maaAnalysis11;
		this.maaAnalysis12 = maaAnalysis12;
		this.maaAnalysis13 = maaAnalysis13;
		this.maaAnalysis14 = maaAnalysis14;
		this.maaAnalysis15 = maaAnalysis15;
		this.maaAnalysis16 = maaAnalysis16;
		this.maaAnalysis17 = maaAnalysis17;
		this.maaAnalysis18 = maaAnalysis18;
		this.maaAnalysis19 = maaAnalysis19;
		this.maaAnalysis20 = maaAnalysis20;
		this.maaAnalysis21 = maaAnalysis21;
		this.maaAnalysis22 = maaAnalysis22;
		this.maaAnalysis23 = maaAnalysis23;
		this.maaAnalysis24 = maaAnalysis24;
		this.maaAnalysis25 = maaAnalysis25;
		this.maaAnalysis26 = maaAnalysis26;
		this.maaAnalysis27 = maaAnalysis27;
		this.maaAnalysis28 = maaAnalysis28;
		this.maaAnalysis29 = maaAnalysis29;
		this.maaAnalysis30 = maaAnalysis30;
		this.maaSubmitDate = maaSubmitDate;
		this.maaProcessedDate = maaProcessedDate;
		this.maaProcessedStat = maaProcessedStat;
		this.maaComments = maaComments;
		this.maaSystemReq = maaSystemReq;
	}

	public String getMaaTransactId() {
		return maaTransactId;
	}

	public void setMaaTransactId(String maaTransactId) {
		this.maaTransactId = maaTransactId;
	}

	public String getMaaActiveFlag() {
		return maaActiveFlag;
	}

	public void setMaaActiveFlag(String maaActiveFlag) {
		this.maaActiveFlag = maaActiveFlag;
	}

	public String getMaaActionType() {
		return maaActionType;
	}

	public void setMaaActionType(String maaActionType) {
		this.maaActionType = maaActionType;
	}

	public String getMaaFileId() {
		return maaFileId;
	}

	public void setMaaFileId(String maaFileId) {
		this.maaFileId = maaFileId;
	}

	public String getMaaMsisdnNo() {
		return maaMsisdnNo;
	}

	public void setMaaMsisdnNo(String maaMsisdnNo) {
		this.maaMsisdnNo = maaMsisdnNo;
	}

	public String getMaaSimNo() {
		return maaSimNo;
	}

	public void setMaaSimNo(String maaSimNo) {
		this.maaSimNo = maaSimNo;
	}

	public String getMaaBillAcNo() {
		return maaBillAcNo;
	}

	public void setMaaBillAcNo(String maaBillAcNo) {
		this.maaBillAcNo = maaBillAcNo;
	}

	public Integer getMaaSubscriberId() {
		return maaSubscriberId;
	}

	public void setMaaSubscriberId(Integer maaSubscriberId) {
		this.maaSubscriberId = maaSubscriberId;
	}

	public String getMaaAnalysis1() {
		return maaAnalysis1;
	}

	public void setMaaAnalysis1(String maaAnalysis1) {
		this.maaAnalysis1 = maaAnalysis1;
	}

	public String getMaaAnalysis2() {
		return maaAnalysis2;
	}

	public void setMaaAnalysis2(String maaAnalysis2) {
		this.maaAnalysis2 = maaAnalysis2;
	}

	public String getMaaAnalysis3() {
		return maaAnalysis3;
	}

	public void setMaaAnalysis3(String maaAnalysis3) {
		this.maaAnalysis3 = maaAnalysis3;
	}

	public String getMaaAnalysis4() {
		return maaAnalysis4;
	}

	public void setMaaAnalysis4(String maaAnalysis4) {
		this.maaAnalysis4 = maaAnalysis4;
	}

	public String getMaaAnalysis5() {
		return maaAnalysis5;
	}

	public void setMaaAnalysis5(String maaAnalysis5) {
		this.maaAnalysis5 = maaAnalysis5;
	}

	public String getMaaAnalysis6() {
		return maaAnalysis6;
	}

	public void setMaaAnalysis6(String maaAnalysis6) {
		this.maaAnalysis6 = maaAnalysis6;
	}

	public String getMaaAnalysis7() {
		return maaAnalysis7;
	}

	public void setMaaAnalysis7(String maaAnalysis7) {
		this.maaAnalysis7 = maaAnalysis7;
	}

	public String getMaaAnalysis8() {
		return maaAnalysis8;
	}

	public void setMaaAnalysis8(String maaAnalysis8) {
		this.maaAnalysis8 = maaAnalysis8;
	}

	public String getMaaAnalysis9() {
		return maaAnalysis9;
	}

	public void setMaaAnalysis9(String maaAnalysis9) {
		this.maaAnalysis9 = maaAnalysis9;
	}

	public String getMaaAnalysis10() {
		return maaAnalysis10;
	}

	public void setMaaAnalysis10(String maaAnalysis10) {
		this.maaAnalysis10 = maaAnalysis10;
	}

	public String getMaaAnalysis11() {
		return maaAnalysis11;
	}

	public void setMaaAnalysis11(String maaAnalysis11) {
		this.maaAnalysis11 = maaAnalysis11;
	}

	public String getMaaAnalysis12() {
		return maaAnalysis12;
	}

	public void setMaaAnalysis12(String maaAnalysis12) {
		this.maaAnalysis12 = maaAnalysis12;
	}

	public String getMaaAnalysis13() {
		return maaAnalysis13;
	}

	public void setMaaAnalysis13(String maaAnalysis13) {
		this.maaAnalysis13 = maaAnalysis13;
	}

	public String getMaaAnalysis14() {
		return maaAnalysis14;
	}

	public void setMaaAnalysis14(String maaAnalysis14) {
		this.maaAnalysis14 = maaAnalysis14;
	}

	public String getMaaAnalysis15() {
		return maaAnalysis15;
	}

	public void setMaaAnalysis15(String maaAnalysis15) {
		this.maaAnalysis15 = maaAnalysis15;
	}

	public String getMaaAnalysis16() {
		return maaAnalysis16;
	}

	public void setMaaAnalysis16(String maaAnalysis16) {
		this.maaAnalysis16 = maaAnalysis16;
	}

	public String getMaaAnalysis17() {
		return maaAnalysis17;
	}

	public void setMaaAnalysis17(String maaAnalysis17) {
		this.maaAnalysis17 = maaAnalysis17;
	}

	public String getMaaAnalysis18() {
		return maaAnalysis18;
	}

	public void setMaaAnalysis18(String maaAnalysis18) {
		this.maaAnalysis18 = maaAnalysis18;
	}

	public String getMaaAnalysis19() {
		return maaAnalysis19;
	}

	public void setMaaAnalysis19(String maaAnalysis19) {
		this.maaAnalysis19 = maaAnalysis19;
	}

	public String getMaaAnalysis20() {
		return maaAnalysis20;
	}

	public void setMaaAnalysis20(String maaAnalysis20) {
		this.maaAnalysis20 = maaAnalysis20;
	}

	public String getMaaAnalysis21() {
		return maaAnalysis21;
	}

	public void setMaaAnalysis21(String maaAnalysis21) {
		this.maaAnalysis21 = maaAnalysis21;
	}

	public String getMaaAnalysis22() {
		return maaAnalysis22;
	}

	public void setMaaAnalysis22(String maaAnalysis22) {
		this.maaAnalysis22 = maaAnalysis22;
	}

	public String getMaaAnalysis23() {
		return maaAnalysis23;
	}

	public void setMaaAnalysis23(String maaAnalysis23) {
		this.maaAnalysis23 = maaAnalysis23;
	}

	public String getMaaAnalysis24() {
		return maaAnalysis24;
	}

	public void setMaaAnalysis24(String maaAnalysis24) {
		this.maaAnalysis24 = maaAnalysis24;
	}

	public String getMaaAnalysis25() {
		return maaAnalysis25;
	}

	public void setMaaAnalysis25(String maaAnalysis25) {
		this.maaAnalysis25 = maaAnalysis25;
	}

	public String getMaaAnalysis26() {
		return maaAnalysis26;
	}

	public void setMaaAnalysis26(String maaAnalysis26) {
		this.maaAnalysis26 = maaAnalysis26;
	}

	public String getMaaAnalysis27() {
		return maaAnalysis27;
	}

	public void setMaaAnalysis27(String maaAnalysis27) {
		this.maaAnalysis27 = maaAnalysis27;
	}

	public String getMaaAnalysis28() {
		return maaAnalysis28;
	}

	public void setMaaAnalysis28(String maaAnalysis28) {
		this.maaAnalysis28 = maaAnalysis28;
	}

	public String getMaaAnalysis29() {
		return maaAnalysis29;
	}

	public void setMaaAnalysis29(String maaAnalysis29) {
		this.maaAnalysis29 = maaAnalysis29;
	}

	public String getMaaAnalysis30() {
		return maaAnalysis30;
	}

	public void setMaaAnalysis30(String maaAnalysis30) {
		this.maaAnalysis30 = maaAnalysis30;
	}

	public Date getMaaSubmitDate() {
		return maaSubmitDate;
	}

	public void setMaaSubmitDate(Date maaSubmitDate) {
		this.maaSubmitDate = maaSubmitDate;
	}

	public Date getMaaProcessedDate() {
		return maaProcessedDate;
	}

	public void setMaaProcessedDate(Date maaProcessedDate) {
		this.maaProcessedDate = maaProcessedDate;
	}

	public String getMaaProcessedStat() {
		return maaProcessedStat;
	}

	public void setMaaProcessedStat(String maaProcessedStat) {
		this.maaProcessedStat = maaProcessedStat;
	}

	public String getMaaComments() {
		return maaComments;
	}

	public void setMaaComments(String maaComments) {
		this.maaComments = maaComments;
	}

	public String getMaaSystemReq() {
		return maaSystemReq;
	}

	public void setMaaSystemReq(String maaSystemReq) {
		this.maaSystemReq = maaSystemReq;
	}
}
