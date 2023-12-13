package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class EcfEventCmdFileDMO  extends DBO
implements Serializable {

	private String ecfCommand;
	private String ecfSorbOrder;
	private String ecfStatus;
	private String ecfFile;
	private DateTime ecfTimestamp;
	private String ecfSpid;
	
	public static final int ecfCommandFilter = 0;
	private static final int ecfCommandSize = 16;
	
	public static final int ecfSorbOrderFilter = 1;
	private static final int ecfSorbOrderSize = 40;

	public static final int ecfStatusFilter = 2;
	private static final int ecfStatusSize = 40;
	
	public static final int ecfFileFilter = 3;
	private static final int ecfFileSize = 150;

	public static final int ecfTimestampFilter = 4;
	
	public static final int ecfSpidFilter = 5;
	public static final int ecfSpidSize = 4;
	
	public EcfEventCmdFileDMO(	final String ecfCommand, final String ecfSorbOrder, final String ecfStatus, final String ecfFile, final DateTime ecfTimestamp, final String ecfSpid){
		this.ecfCommand = ecfCommand;
		this.ecfSorbOrder = ecfSorbOrder;
		this.ecfStatus = ecfStatus;
		this.ecfFile = ecfFile;
		this.ecfTimestamp = ecfTimestamp;
		this.ecfSpid = ecfSpid;
	}
	
	public EcfEventCmdFileDMO(){
	}

	private static final int[] fieldSizes = new int[]{
		ecfCommandSize,
		ecfSorbOrderSize,
		ecfStatusSize,
		ecfFileSize,
		0,
		ecfSpidSize
	};
	
	private static final int[] fieldTypes = new int[]{
			FIELD_TYPE_STRING,
			FIELD_TYPE_STRING,
			FIELD_TYPE_STRING,
			FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME,
			FIELD_TYPE_STRING
	};
	
	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[]{
			((this.ecfCommand == null) ? null : (this.ecfCommand.length() <= ecfCommandSize) ? this.ecfCommand : this.ecfCommand.substring(0, this.ecfCommandSize)),
			((this.ecfSorbOrder == null) ? null : (this.ecfSorbOrder.length() <= ecfSorbOrderSize) ? this.ecfSorbOrder : this.ecfSorbOrder.substring(0, this.ecfSorbOrderSize)),
			((this.ecfStatus == null) ? null : (this.ecfStatus.length() <= ecfStatusSize) ? this.ecfStatus : this.ecfStatus.substring(0, this.ecfStatusSize)),
			((this.ecfFile == null) ? null : (this.ecfFile.length() <= ecfFileSize) ? this.ecfFile : this.ecfFile.substring(0, this.ecfFileSize)),
			this.ecfTimestamp,			
			((this.ecfSpid == null) ? null : (this.ecfSpid.length() <= ecfSpidSize) ? this.ecfSpid : this.ecfSpid.substring(0, this.ecfSpidSize))
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
		return null; // new DAOArgs(1).arg((this.ecfCommand == null) ? null : this.ecfCommand.trim());
	}

	protected void set(Object[] fields) {
		this.ecfCommand = rtrim((String)fields[0]);
		this.ecfSorbOrder = rtrim((String)fields[1]);
		this.ecfStatus = rtrim((String)fields[2]);
		this.ecfFile = rtrim((String)fields[3]);
		this.ecfTimestamp = ((fields[4] == null) ? null : new DateTime((DateTime)fields[4]));
		this.ecfSpid = rtrim((String)fields[5]);
	}
	
	public void set(final String ecfCommand,final String ecfSorbOrder, final String ecfStatus, final String ecfFile, final DateTime ecfTimestamp, final String ecfSpid){
		this.ecfCommand = ecfCommand;
		this.ecfSorbOrder = ecfSorbOrder;
		this.ecfStatus = ecfStatus;
		this.ecfFile = ecfFile;
		this.ecfTimestamp = ecfTimestamp;
		this.ecfSpid = ecfSpid;
	}

	public String getEcfCommand() {
		return ecfCommand;
	}

	public void setEcfCommand(String ecfCommand) {
		this.ecfCommand = ecfCommand;
	}

	public String getEcfSorbOrder() {
		return ecfSorbOrder;
	}

	public void setEcfSorbOrder(String ecfSorbOrder) {
		this.ecfSorbOrder = ecfSorbOrder;
	}

	public String getEcfStatus() {
		return ecfStatus;
	}

	public void setEcfStatus(String ecfStatus) {
		this.ecfStatus = ecfStatus;
	}

	public String getEcfFile() {
		return ecfFile;
	}

	public void setEcfFile(String ecfFile) {
		this.ecfFile = ecfFile;
	}

	public DateTime getEcfTimestamp() {
		return ecfTimestamp;
	}

	public void setEcfTimestamp(DateTime ecfTimestamp) {
		this.ecfTimestamp = ecfTimestamp;
	}

	public String getEcfSpid() {
		return ecfSpid;
	}

	public void setEcfSpid(String ecfSpid) {
		this.ecfSpid = ecfSpid;
	}

}
