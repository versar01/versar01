package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AcnActionDMO extends DBO implements Serializable {


	private Integer acnActionSerial;
	private String acnActionType;
	private String acnActionRsn;
	private String acnSuspended;
	private Short acnDefDeadline;
	private Short acnMaxDeadline;
	private String acnEscInd;
	private Short acnEscDelay;
	private Short acnAttachLevel;
	private String acnRefNoFld;
	private String acnInvNoFld;
	private String acnArchiveNotes;
	private String acnDefPriority;



	public static final int acnActionSerialFilter = 0;

	public static final int acnActionTypeFilter = 1;
	private static final int acnActionTypeSize = 8;


	public static final int acnActionRsnFilter = 2;
	private static final int acnActionRsnSize = 8;


	public static final int acnSuspendedFilter = 3;
	private static final int acnSuspendedSize = 1;


	public static final int acnDefDeadlineFilter = 4;

	public static final int acnMaxDeadlineFilter = 5;

	public static final int acnEscIndFilter = 6;
	private static final int acnEscIndSize = 1;


	public static final int acnEscDelayFilter = 7;

	public static final int acnAttachLevelFilter = 8;

	public static final int acnRefNoFldFilter = 9;
	private static final int acnRefNoFldSize = 1;


	public static final int acnInvNoFldFilter = 10;
	private static final int acnInvNoFldSize = 1;


	public static final int acnArchiveNotesFilter = 11;
	private static final int acnArchiveNotesSize = 1;


	public static final int acnDefPriorityFilter = 12;
	private static final int acnDefPrioritySize = 1;





	public AcnActionDMO(){};

	public AcnActionDMO(final Integer acnActionSerial,
	final String acnActionType,
	final String acnActionRsn,
	final String acnSuspended,
	final Short acnDefDeadline,
	final Short acnMaxDeadline,
	final String acnEscInd,
	final Short acnEscDelay,
	final Short acnAttachLevel,
	final String acnRefNoFld,
	final String acnInvNoFld,
	final String acnArchiveNotes,
	final String acnDefPriority
	){

	this.acnActionSerial = acnActionSerial;
	this.acnActionType = acnActionType;
	this.acnActionRsn = acnActionRsn;
	this.acnSuspended = acnSuspended;
	this.acnDefDeadline = acnDefDeadline;
	this.acnMaxDeadline = acnMaxDeadline;
	this.acnEscInd = acnEscInd;
	this.acnEscDelay = acnEscDelay;
	this.acnAttachLevel = acnAttachLevel;
	this.acnRefNoFld = acnRefNoFld;
	this.acnInvNoFld = acnInvNoFld;
	this.acnArchiveNotes = acnArchiveNotes;
	this.acnDefPriority = acnDefPriority;
	};


	private static final int[] fieldSizes = new int[]{
	0,
	acnActionTypeSize,
	acnActionRsnSize,
	acnSuspendedSize,
	0,
	0,
	acnEscIndSize,
	0,
	0,
	acnRefNoFldSize,
	acnInvNoFldSize,
	acnArchiveNotesSize,
	acnDefPrioritySize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_SHORT,
	FIELD_TYPE_SHORT,
	FIELD_TYPE_STRING,
	FIELD_TYPE_SHORT,
	FIELD_TYPE_SHORT,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			this.acnActionSerial,
				((this.acnActionType == null) ? null : (this.acnActionType.length() <= acnActionTypeSize) ? this.acnActionType : this.acnActionType.substring(0, this.acnActionTypeSize)),
				((this.acnActionRsn == null) ? null : (this.acnActionRsn.length() <= acnActionRsnSize) ? this.acnActionRsn : this.acnActionRsn.substring(0, this.acnActionRsnSize)),
				((this.acnSuspended == null) ? null : (this.acnSuspended.length() <= acnSuspendedSize) ? this.acnSuspended : this.acnSuspended.substring(0, this.acnSuspendedSize)),
				this.acnDefDeadline,
				this.acnMaxDeadline,
				((this.acnEscInd == null) ? null : (this.acnEscInd.length() <= acnEscIndSize) ? this.acnEscInd : this.acnEscInd.substring(0, this.acnEscIndSize)),
				this.acnEscDelay,
				this.acnAttachLevel,
				((this.acnRefNoFld == null) ? null : (this.acnRefNoFld.length() <= acnRefNoFldSize) ? this.acnRefNoFld : this.acnRefNoFld.substring(0, this.acnRefNoFldSize)),
				((this.acnInvNoFld == null) ? null : (this.acnInvNoFld.length() <= acnInvNoFldSize) ? this.acnInvNoFld : this.acnInvNoFld.substring(0, this.acnInvNoFldSize)),
				((this.acnArchiveNotes == null) ? null : (this.acnArchiveNotes.length() <= acnArchiveNotesSize) ? this.acnArchiveNotes : this.acnArchiveNotes.substring(0, this.acnArchiveNotesSize)),
				((this.acnDefPriority == null) ? null : (this.acnDefPriority.length() <= acnDefPrioritySize) ? this.acnDefPriority : this.acnDefPriority.substring(0, this.acnDefPrioritySize))
			};
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
		return new DAOArgs(1).arg(this.acnActionSerial); 
	}



	protected void set(Object[] fields) {
	this.acnActionSerial = ((Integer)fields[0]);
	this.acnActionType = rtrim((String)fields[1]);
	this.acnActionRsn = rtrim((String)fields[2]);
	this.acnSuspended = rtrim((String)fields[3]);
	this.acnDefDeadline = ((Short)fields[4]);
	this.acnMaxDeadline = ((Short)fields[5]);
	this.acnEscInd = rtrim((String)fields[6]);
	this.acnEscDelay = ((Short)fields[7]);
	this.acnAttachLevel = ((Short)fields[8]);
	this.acnRefNoFld = rtrim((String)fields[9]);
	this.acnInvNoFld = rtrim((String)fields[10]);
	this.acnArchiveNotes = rtrim((String)fields[11]);
	this.acnDefPriority = rtrim((String)fields[12]);
	}


	public void set(
	final Integer acnActionSerial,
	final String acnActionType,
	final String acnActionRsn,
	final String acnSuspended,
	final Short acnDefDeadline,
	final Short acnMaxDeadline,
	final String acnEscInd,
	final Short acnEscDelay,
	final Short acnAttachLevel,
	final String acnRefNoFld,
	final String acnInvNoFld,
	final String acnArchiveNotes,
	final String acnDefPriority
	)
	{

	this.acnActionSerial = acnActionSerial;
	this.acnActionType = acnActionType;
	this.acnActionRsn = acnActionRsn;
	this.acnSuspended = acnSuspended;
	this.acnDefDeadline = acnDefDeadline;
	this.acnMaxDeadline = acnMaxDeadline;
	this.acnEscInd = acnEscInd;
	this.acnEscDelay = acnEscDelay;
	this.acnAttachLevel = acnAttachLevel;
	this.acnRefNoFld = acnRefNoFld;
	this.acnInvNoFld = acnInvNoFld;
	this.acnArchiveNotes = acnArchiveNotes;
	this.acnDefPriority = acnDefPriority;
	}

	public Integer getAcnActionSerial() {
		return acnActionSerial;
	}

	public void setAcnActionSerial(Integer acnActionSerial) {
		this.acnActionSerial = acnActionSerial;
	}

	public String getAcnActionType() {
		return acnActionType;
	}

	public void setAcnActionType(String acnActionType) {
		this.acnActionType = acnActionType;
	}

	public String getAcnActionRsn() {
		return acnActionRsn;
	}

	public void setAcnActionRsn(String acnActionRsn) {
		this.acnActionRsn = acnActionRsn;
	}

	public String getAcnSuspended() {
		return acnSuspended;
	}

	public void setAcnSuspended(String acnSuspended) {
		this.acnSuspended = acnSuspended;
	}

	public Short getAcnDefDeadline() {
		return acnDefDeadline;
	}

	public void setAcnDefDeadline(Short acnDefDeadline) {
		this.acnDefDeadline = acnDefDeadline;
	}

	public Short getAcnMaxDeadline() {
		return acnMaxDeadline;
	}

	public void setAcnMaxDeadline(Short acnMaxDeadline) {
		this.acnMaxDeadline = acnMaxDeadline;
	}

	public String getAcnEscInd() {
		return acnEscInd;
	}

	public void setAcnEscInd(String acnEscInd) {
		this.acnEscInd = acnEscInd;
	}

	public Short getAcnEscDelay() {
		return acnEscDelay;
	}

	public void setAcnEscDelay(Short acnEscDelay) {
		this.acnEscDelay = acnEscDelay;
	}

	public Short getAcnAttachLevel() {
		return acnAttachLevel;
	}

	public void setAcnAttachLevel(Short acnAttachLevel) {
		this.acnAttachLevel = acnAttachLevel;
	}

	public String getAcnRefNoFld() {
		return acnRefNoFld;
	}

	public void setAcnRefNoFld(String acnRefNoFld) {
		this.acnRefNoFld = acnRefNoFld;
	}

	public String getAcnInvNoFld() {
		return acnInvNoFld;
	}

	public void setAcnInvNoFld(String acnInvNoFld) {
		this.acnInvNoFld = acnInvNoFld;
	}

	public String getAcnArchiveNotes() {
		return acnArchiveNotes;
	}

	public void setAcnArchiveNotes(String acnArchiveNotes) {
		this.acnArchiveNotes = acnArchiveNotes;
	}

	public String getAcnDefPriority() {
		return acnDefPriority;
	}

	public void setAcnDefPriority(String acnDefPriority) {
		this.acnDefPriority = acnDefPriority;
	}



}
