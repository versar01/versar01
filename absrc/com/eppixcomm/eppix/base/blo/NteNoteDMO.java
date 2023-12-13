package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;



public class NteNoteDMO extends DBO implements Serializable {


public NteNoteDMO(){
	
}

public NteNoteDMO(final Integer nteNoteSerial,
		final Integer nteActionSerial,
		final String nteSource,
		final String nteOpenedBy,
		final DateTime nteOpenedDate,
		final DateTime nteClosedDate,
		final DateTime nteTimestamp,
		final String nteStatus,
		final DateTime nteDeadline,
		final String nteTargetType,
		final Integer nteTargetGroup,
		final String nteTargetUser,
		final String nteReallocBy,
		final DateTime nteReallocDate,
		final String nteSuspendedUser,
		final String nteBillAcNo,
		final String nteInvoiceNo,
		final Integer nteSubscriberId,
		final String nteSimNo,
		final String nteMsisdnNo,
		final String nteReferenceNo,
		final Integer nteLastPage,
		final String ntePriorityType){	
			this.nteNoteSerial = nteNoteSerial;
			this.nteActionSerial = nteActionSerial;
			this.nteSource = nteSource;
			this.nteOpenedBy = nteOpenedBy;
			this.nteOpenedDate = nteOpenedDate;
			this.nteClosedDate = nteClosedDate;
			this.nteTimestamp = nteTimestamp;
			this.nteStatus = nteStatus;
			this.nteDeadline = nteDeadline;
			this.nteTargetType = nteTargetType;
			this.nteTargetGroup = nteTargetGroup;
			this.nteTargetUser = nteTargetUser;
			this.nteReallocBy = nteReallocBy;
			this.nteReallocDate = nteReallocDate;
			this.nteSuspendedUser = nteSuspendedUser;
			this.nteBillAcNo = nteBillAcNo;
			this.nteInvoiceNo = nteInvoiceNo;
			this.nteSubscriberId = nteSubscriberId;
			this.nteSimNo = nteSimNo;
			this.nteMsisdnNo = nteMsisdnNo;
			this.nteReferenceNo = nteReferenceNo;
			this.nteLastPage = nteLastPage;
			this.ntePriorityType = ntePriorityType;	
}

		private Integer nteNoteSerial;
		private Integer nteActionSerial;
		private String nteSource;
		private String nteOpenedBy;
		private DateTime nteOpenedDate;
		private DateTime nteClosedDate;
		private DateTime nteTimestamp;
		private String nteStatus;
		private DateTime nteDeadline;
		private String nteTargetType;
		private Integer nteTargetGroup;
		private String nteTargetUser;
		private String nteReallocBy;
		private DateTime nteReallocDate;
		private String nteSuspendedUser;
		private String nteBillAcNo;
		private String nteInvoiceNo;
		private Integer nteSubscriberId;
		private String nteSimNo;
		private String nteMsisdnNo;
		private String nteReferenceNo;
		private Integer nteLastPage;
		private String ntePriorityType;
		
		public static final int nteNoteSerialFilter = 0; // filter index

		public static final int nteActionSerialFilter = 1; // filter index

		public static final int nteSourceFilter = 2; // filter index
		public static final int nteSourceSize = 1; // field size

		public static final int nteOpenedByFilter = 3; // filter index
		public static final int nteOpenedBySize = 20; // field size

		public static final int nteOpenedDateFilter = 4; // filter index

		public static final int nteClosedDateFilter = 5; // filter index

		public static final int nteTimestampFilter = 6; // filter index

		public static final int nteStatusFilter = 7; // filter index
		public static final int nteStatusSize = 1; // field size

		public static final int nteDeadlineFilter = 8; // filter index

		public static final int nteTargetTypeFilter = 9; // filter index
		public static final int nteTargetTypeSize = 1; // field size

		public static final int nteTargetGroupFilter = 10; // filter index

		public static final int nteTargetUserFilter = 11; // filter index
		public static final int nteTargetUserSize = 20; // field size

		public static final int nteReallocByFilter = 12; // filter index
		public static final int nteReallocBySize = 20; // field size

		public static final int nteReallocDateFilter = 13; // filter index

		public static final int nteSuspendedUserFilter = 14; // filter index
		public static final int nteSuspendedUserSize = 20; // field size

		public static final int nteBillAcNoFilter = 15; // filter index
		public static final int nteBillAcNoSize = 8; // field size

		public static final int nteInvoiceNoFilter = 16; // filter index
		public static final int nteInvoiceNoSize = 10; // field size

		public static final int nteSubscriberIdFilter = 17; // filter index

		public static final int nteSimNoFilter = 18; // filter index
		public static final int nteSimNoSize = 14; // field size

		public static final int nteMsisdnNoFilter = 19; // filter index
		public static final int nteMsisdnNoSize = 15; // field size

		public static final int nteReferenceNoFilter = 20; // filter index
		public static final int nteReferenceNoSize = 32; // field size

		public static final int nteLastPageFilter = 21; // filter index

		public static final int ntePriorityTypeFilter = 22; // filter index
		public static final int ntePriorityTypeSize = 1; // field size
		


		protected void generatedKey(Integer key) {
			// TODO Auto-generated method stub
			
		}

		protected Object[] get() {
			return new Object[] {
					nteNoteSerial,
					nteActionSerial,
					nteSource,
					(nteOpenedBy == null) ? null
							: ((nteOpenedBy.length() <= nteOpenedBySize) ? nteOpenedBy
									: nteOpenedBy.substring(0, nteOpenedBySize)),
					nteOpenedDate,
					nteClosedDate,
					nteTimestamp,
					(nteStatus == null) ? null
							: ((nteStatus.length() <= nteStatusSize) ? nteStatus
									: nteStatus.substring(0, nteStatusSize)),
					nteDeadline,
					(nteTargetType == null) ? null
							: ((nteTargetType.length() <= nteTargetTypeSize) ? nteTargetType
									: nteTargetType.substring(0, nteTargetTypeSize)),
					nteTargetGroup,
					(nteTargetUser == null) ? null
							: ((nteTargetUser.length() <= nteTargetUserSize) ? nteTargetUser
									: nteTargetUser.substring(0, nteTargetUserSize)),
					(nteReallocBy == null) ? null
							: ((nteReallocBy.length() <= nteReallocBySize) ? nteReallocBy
									: nteReallocBy.substring(0, nteReallocBySize)),
					nteReallocDate,
					(nteSuspendedUser == null) ? null
							: ((nteSuspendedUser.length() <= nteSuspendedUserSize) ? nteSuspendedUser
									: nteSuspendedUser.substring(0, nteSuspendedUserSize)),
					(nteBillAcNo == null) ? null
							: ((nteBillAcNo.length() <= nteBillAcNoSize) ? nteBillAcNo
									: nteBillAcNo.substring(0, nteBillAcNoSize)),

					(nteInvoiceNo == null) ? null
							: ((nteInvoiceNo.length() <= nteInvoiceNoSize) ? nteInvoiceNo
									: nteInvoiceNo.substring(0, nteInvoiceNoSize)),
					nteSubscriberId,
					(nteSimNo == null) ? null
							: ((nteSimNo.length() <= nteSimNoSize) ? nteSimNo
									: nteSimNo.substring(0, nteSimNoSize)),

					(nteMsisdnNo == null) ? null
							: ((nteMsisdnNo.length() <= nteMsisdnNoSize) ? nteMsisdnNo
									: nteMsisdnNo.substring(0, nteMsisdnNoSize)),

					(nteReferenceNo == null) ? null
							: ((nteReferenceNo.length() <= nteReferenceNoSize) ? nteReferenceNo
									: nteReferenceNo.substring(0, nteReferenceNoSize)),
					nteLastPage,

					(ntePriorityType == null) ? null
							: ((ntePriorityType.length() <= ntePriorityTypeSize) ? ntePriorityType
									: ntePriorityType.substring(0, ntePriorityTypeSize))};
		}
		
		protected void set(Integer nteNoteSerial,
				Integer nteActionSerial,
				String nteSource,
				String nteOpenedBy,
				DateTime nteOpenedDate,
				DateTime nteClosedDate,
				DateTime nteTimestamp,
				String nteStatus,
				DateTime nteDeadline,
				String nteTargetType,
				Integer nteTargetGroup,
				String nteTargetUser,
				String nteReallocBy,
				DateTime nteReallocDate,
				String nteSuspendedUser,
				String nteBillAcNo,
				String nteInvoiceNo,
				Integer nteSubscriberId,
				String nteSimNo,
				String nteMsisdnNo,
				String nteReferenceNo,
				Integer nteLastPage,
				String ntePriorityType){			
					this.nteNoteSerial = nteNoteSerial;
					this.nteActionSerial = nteActionSerial;
					this.nteSource = nteSource;
					this.nteOpenedBy = nteOpenedBy;
					this.nteOpenedDate = nteOpenedDate;
					this.nteClosedDate = nteClosedDate;
					this.nteTimestamp = nteTimestamp;
					this.nteStatus = nteStatus;
					this.nteDeadline = nteDeadline;
					this.nteTargetType = nteTargetType;
					this.nteTargetGroup = nteTargetGroup;
					this.nteTargetUser = nteTargetUser;
					this.nteReallocBy = nteReallocBy;
					this.nteReallocDate = nteReallocDate;
					this.nteSuspendedUser = nteSuspendedUser;
					this.nteBillAcNo = nteBillAcNo;
					this.nteInvoiceNo = nteInvoiceNo;
					this.nteSubscriberId = nteSubscriberId;
					this.nteSimNo = nteSimNo;
					this.nteMsisdnNo = nteMsisdnNo;
					this.nteReferenceNo = nteReferenceNo;
					this.nteLastPage = nteLastPage;
					this.ntePriorityType = ntePriorityType;
		}

		protected Integer versionNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		protected void versionNumber(Integer versionNumber) {
			// TODO Auto-generated method stub			
		}
		
		private final int[] fieldSizes = new int[] {
				0,
				0,
				nteSourceSize,
				nteOpenedBySize,
				0,
				0,
				0,
				nteStatusSize,
				0,
				nteTargetTypeSize,
				0,
				nteTargetUserSize,
				nteReallocBySize,
				0,
				nteSuspendedUserSize,
				nteBillAcNoSize,
				nteInvoiceNoSize,
				0,
				nteSimNoSize,
				nteMsisdnNoSize,
				nteReferenceNoSize,
				0,
				ntePriorityTypeSize
		};		

		protected int[] fieldSizes() {
			return fieldSizes;
		}
		
		private static final int[] fieldTypes = new int[] { 
			FIELD_TYPE_INTEGER /*  nteNoteSerial   */,
			FIELD_TYPE_INTEGER /*  nteActionSerial   */,
			FIELD_TYPE_STRING /*  nteSource   */,
			FIELD_TYPE_STRING /*  nteOpenedBy   */,
			FIELD_TYPE_DATETIME /*  nteOpenedDate   */,
			FIELD_TYPE_DATETIME /*  nteClosedDate   */,
			FIELD_TYPE_DATETIME /*  nteTimestamp   */,
			FIELD_TYPE_STRING /*  nteStatus   */,
			FIELD_TYPE_DATETIME /*  nteDeadline   */,
			FIELD_TYPE_STRING /*  nteTargetType   */,
			FIELD_TYPE_INTEGER /*  nteTargetGroup   */,
			FIELD_TYPE_STRING /*  nteTargetUser   */,
			FIELD_TYPE_STRING /*  nteReallocBy   */,
			FIELD_TYPE_DATETIME /*  nteReallocDate   */,
			FIELD_TYPE_STRING /*  nteSuspendedUser   */,
			FIELD_TYPE_STRING /*  nteBillAcNo   */,
			FIELD_TYPE_STRING /*  nteInvoiceNo   */,
			FIELD_TYPE_INTEGER /*  nteSubscriberId   */,
			FIELD_TYPE_STRING /*  nteSimNo   */,
			FIELD_TYPE_STRING /*  nteMsisdnNo   */,
			FIELD_TYPE_STRING /*  nteReferenceNo   */,
			FIELD_TYPE_INTEGER /*  nteLastPage   */,
			FIELD_TYPE_STRING /*  ntePriorityType   */
		};

		protected int[] fieldTypes() {
			return fieldTypes;
		}

		protected DAOArgs primaryKey() {
			return new DAOArgs( 1 ).arg(nteNoteSerial);
		}

		protected void set(Object[] fields) {
			this.nteNoteSerial = (Integer) fields[0];
			this.nteActionSerial = (Integer) fields[1];
			this.nteSource = rtrim((String) fields[2]);
			this.nteOpenedBy = rtrim((String) fields[3]);
			this.nteOpenedDate = (DateTime) fields[4];
			this.nteClosedDate = (DateTime) fields[5];
			this.nteTimestamp = (DateTime) fields[6];
			this.nteStatus = (String) fields[7];
			this.nteDeadline = (DateTime) fields[8];
			this.nteTargetType = rtrim((String) fields[9]);
			this.nteTargetGroup = (Integer) fields[10];
			this.nteTargetUser = rtrim((String) fields[11]);
			this.nteReallocBy = rtrim((String) fields[12]);
			this.nteReallocDate = (DateTime) fields[13];
			this.nteSuspendedUser = rtrim((String) fields[14]); 
			this.nteBillAcNo = rtrim((String) fields[15]);
			this.nteInvoiceNo = rtrim((String) fields[16]);
			this.nteSubscriberId = (Integer) fields[17];
			this.nteSimNo = rtrim((String) fields[18]);
			this.nteMsisdnNo = rtrim((String) fields[19]);
			this.nteReferenceNo = rtrim((String) fields[20]);
			this.nteLastPage = (Integer) fields[21];
			this.ntePriorityType = rtrim((String) fields[22]);
			
		}		
		
		public Integer getNteNote() {
			return nteNoteSerial;
		}

		public void setNteNote(Integer nteNote) {
			this.nteNoteSerial = nteNote;
		}

		public Integer getNteActionSerial() {
			return nteActionSerial;
		}

		public void setNteActionSerial(Integer nteActionSerial) {
			this.nteActionSerial = nteActionSerial;
		}

		public String getNteSource() {
			return nteSource;
		}

		public void setNteSource(String nteSource) {
			this.nteSource = nteSource;
		}

		public String getNteOpenedBy() {
			return nteOpenedBy;
		}

		public void setNteOpenedBy(String nteOpenedBy) {
			this.nteOpenedBy = nteOpenedBy;
		}

		public DateTime getNteOpenedDate() {
			return nteOpenedDate;
		}

		public void setNteOpenedDate(DateTime nteOpenedDate) {
			this.nteOpenedDate = nteOpenedDate;
		}

		public DateTime getNteClosedDate() {
			return nteClosedDate;
		}

		public void setNteClosedDate(DateTime nteClosedDate) {
			this.nteClosedDate = nteClosedDate;
		}

		public DateTime getNteTimestamp() {
			return nteTimestamp;
		}

		public void setNteTimestamp(DateTime nteTimestamp) {
			this.nteTimestamp = nteTimestamp;
		}

		public String getNteStatus() {
			return nteStatus;
		}

		public void setNteStatus(String nteStatus) {
			this.nteStatus = nteStatus;
		}

		public DateTime getNteDeadline() {
			return nteDeadline;
		}

		public void setNteDeadline(DateTime nteDeadline) {
			this.nteDeadline = nteDeadline;
		}

		public String getNteTargetType() {
			return nteTargetType;
		}

		public void setNteTargetType(String nteTargetType) {
			this.nteTargetType = nteTargetType;
		}

		public Integer getNteTargetGroup() {
			return nteTargetGroup;
		}

		public void setNteTargetGroup(Integer nteTargetGroup) {
			this.nteTargetGroup = nteTargetGroup;
		}

		public String getNteTargetUser() {
			return nteTargetUser;
		}

		public void setNteTargetUser(String nteTargetUser) {
			this.nteTargetUser = nteTargetUser;
		}

		public String getNteReallocBy() {
			return nteReallocBy;
		}

		public void setNteReallocBy(String nteReallocBy) {
			this.nteReallocBy = nteReallocBy;
		}

		public DateTime getNteReallocDate() {
			return nteReallocDate;
		}

		public void setNteReallocDate(DateTime nteReallocDate) {
			this.nteReallocDate = nteReallocDate;
		}

		public String getNteSuspendedUser() {
			return nteSuspendedUser;
		}

		public void setNteSuspendedUser(String nteSuspendedUser) {
			this.nteSuspendedUser = nteSuspendedUser;
		}

		public String getNteBillAcNo() {
			return nteBillAcNo;
		}

		public void setNteBillAcNo(String nteBillAcNo) {
			this.nteBillAcNo = nteBillAcNo;
		}

		public String getNteInvoiceNo() {
			return nteInvoiceNo;
		}

		public void setNteInvoiceNo(String nteInvoiceNo) {
			this.nteInvoiceNo = nteInvoiceNo;
		}

		public Integer getNteSubscriberId() {
			return nteSubscriberId;
		}

		public void setNteSubscriberId(Integer nteSubscriberId) {
			this.nteSubscriberId = nteSubscriberId;
		}

		public String getNteSimNo() {
			return nteSimNo;
		}

		public void setNteSimNo(String nteSimNo) {
			this.nteSimNo = nteSimNo;
		}

		public String getNteMsisdnNo() {
			return nteMsisdnNo;
		}

		public void setNteMsisdnNo(String nteMsisdnNo) {
			this.nteMsisdnNo = nteMsisdnNo;
		}

		public String getNteReferenceNo() {
			return nteReferenceNo;
		}

		public void setNteReferenceNo(String nteReferenceNo) {
			this.nteReferenceNo = nteReferenceNo;
		}

		public Integer getNteLastPage() {
			return nteLastPage;
		}

		public void setNteLastPage(Integer nteLastPage) {
			this.nteLastPage = nteLastPage;
		}

		public String getNtePriorityType() {
			return ntePriorityType;
		}

		public void setNtePriorityType(String ntePriorityType) {
			this.ntePriorityType = ntePriorityType;
		}
}