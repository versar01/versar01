package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;



public class NpsN2nPerformSendsmsDMO  extends DBO
implements Serializable {
	
	private Integer npsSerial;
	private String npsFunction;
	private String npsOption;
	private String npsPortId;
	private String npsMsisdn;
	private String npsDesc;
	private String npsSource;
	private String npsTransId;
	private String npsSim;
	private DateTime npsTimestamp;
	
	public static final int npsSerialFilter = 0;

	public static final int npsFunctionFilter = 1;
	public static final int npsFunctionSize = 10;

	public static final int npsOptionFilter = 2;
	public static final int npsOptionSize = 100;

	public static final int npsPortIdFilter = 3;
	public static final int npsPortIdSize = 50;

	public static final int npsMsisdnFilter = 4;
	public static final int npsMsisdnSize = 15;

	public static final int npsDescFilter = 5;
	public static final int npsDescSize = 250;

	public static final int npsSourceFilter = 6;
	public static final int npsSourceSize = 30;

	public static final int npsTransIdFilter = 7;
	public static final int npsTransIdSize = 10;

	public static final int npsSimFilter = 8;
	public static final int npsSimSize = 20;

	public static final int npsTimestampFilter = 9;
	
	public NpsN2nPerformSendsmsDMO(){
		
	}

	public NpsN2nPerformSendsmsDMO(final Integer npsSerial,
			final String npsFunction,
			final String npsOption,
			final String npsPortId,
			final String npsMsisdn,
			final String npsDesc,
			final String npsSource,
			final String npsTransId,
			final String npsSim,
			final DateTime npsTimestamp){
		this.npsSerial = npsSerial;
		this.npsFunction = npsFunction;
		this.npsOption = npsOption;
		this.npsPortId = npsPortId;
		this.npsMsisdn = npsMsisdn;
		this.npsDesc = npsDesc;
		this.npsSource = npsSource;
		this.npsTransId = npsTransId;
		this.npsSim = npsSim;
		this.npsTimestamp = npsTimestamp;
	}
	
	private static final int[] fieldSizes = new int[]{
		0,
		npsFunctionSize,
		npsOptionSize,
		npsPortIdSize,
		npsMsisdnSize,
		npsDescSize,
		npsSourceSize,
		npsTransIdSize,
		npsSimSize,
		0
	};	
	
	private static final int[] fieldTypes = new int[]{
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_DATETIME
	};
	
	protected Object[] get() {
		return new Object[]{
			npsSerial,
			((this.npsFunction == null) ? null : (this.npsFunction.length() <= npsFunctionSize) ? this.npsFunction : this.npsFunction.substring(0, this.npsFunctionSize)),
			((this.npsOption == null) ? null : (this.npsOption.length() <= npsOptionSize) ? this.npsOption : this.npsOption.substring(0, this.npsOptionSize)),
			((this.npsPortId == null) ? null : (this.npsPortId.length() <= npsPortIdSize) ? this.npsPortId : this.npsPortId.substring(0, this.npsPortIdSize)),
			((this.npsMsisdn == null) ? null : (this.npsMsisdn.length() <= npsMsisdnSize) ? this.npsMsisdn : this.npsMsisdn.substring(0, this.npsMsisdnSize)),
			((this.npsDesc == null) ? null : (this.npsDesc.length() <= npsDescSize) ? this.npsDesc : this.npsDesc.substring(0, this.npsDescSize)),
			((this.npsSource == null) ? null : (this.npsSource.length() <= npsSourceSize) ? this.npsSource : this.npsSource.substring(0, this.npsSourceSize)),
			((this.npsTransId == null) ? null : (this.npsTransId.length() <= npsTransIdSize) ? this.npsTransId : this.npsTransId.substring(0, this.npsTransIdSize)),
			((this.npsSim == null) ? null : (this.npsSim.length() <= npsSimSize) ? this.npsSim : this.npsSim.substring(0, this.npsSimSize)),
			this.npsTimestamp
		};
	}
	
	protected void generatedKey(Integer key) {
		this.setNpsSerial(key);
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
	    return new DAOArgs( 1 ).arg( ( this.npsSerial == null ) ? null
                : this.npsSerial);
	}
	
	protected void set(Object[] fields) {
		this.npsSerial = (Integer)fields[0];
		this.npsFunction = rtrim((String)fields[1]);
		this.npsOption = rtrim((String)fields[2]);
		this.npsPortId = rtrim((String)fields[3]);
		this.npsMsisdn = rtrim((String)fields[4]);
		this.npsDesc = rtrim((String)fields[5]);
		this.npsSource = rtrim((String)fields[6]);
		this.npsTransId = rtrim((String)fields[7]);
		this.npsSim = rtrim((String)fields[8]);
		this.npsTimestamp = ((fields[9] == null) ? null : new DateTime((DateTime)fields[9]));	
	}
	
	public void set(final Integer npsSerial,
			final String npsFunction,
			final String npsOption,
			final String npsPortId,
			final String npsMsisdn,
			final String npsDesc,
			final String npsSource,
			final String npsTransId,
			final String npsSim,
			final DateTime npsTimestamp){
		this.npsSerial = npsSerial;
		this.npsFunction = npsFunction;
		this.npsOption = npsOption;
		this.npsPortId = npsPortId;
		this.npsMsisdn = npsMsisdn;
		this.npsDesc = npsDesc;
		this.npsSource = npsSource;
		this.npsTransId = npsTransId;
		this.npsSim = npsSim;
		this.npsTimestamp = npsTimestamp;
	}

	public Integer getNpsSerial() {
		return npsSerial;
	}

	public void setNpsSerial(Integer npsSerial) {
		this.npsSerial = npsSerial;
	}

	public String getNpsFunction() {
		return npsFunction;
	}

	public void setNpsFunction(String npsFunction) {
		this.npsFunction = npsFunction;
	}

	public String getNpsOption() {
		return npsOption;
	}

	public void setNpsOption(String npsOption) {
		this.npsOption = npsOption;
	}

	public String getNpsPortId() {
		return npsPortId;
	}

	public void setNpsPortId(String npsPortId) {
		this.npsPortId = npsPortId;
	}

	public String getNpsMsisdn() {
		return npsMsisdn;
	}

	public void setNpsMsisdn(String npsMsisdn) {
		this.npsMsisdn = npsMsisdn;
	}

	public String getNpsDesc() {
		return npsDesc;
	}

	public void setNpsDesc(String npsDesc) {
		this.npsDesc = npsDesc;
	}

	public String getNpsSource() {
		return npsSource;
	}

	public void setNpsSource(String npsSource) {
		this.npsSource = npsSource;
	}

	public String getNpsTransId() {
		return npsTransId;
	}

	public void setNpsTransId(String npsTransId) {
		this.npsTransId = npsTransId;
	}

	public String getNpsSim() {
		return npsSim;
	}

	public void setNpsSim(String npsSim) {
		this.npsSim = npsSim;
	}

	public DateTime getNpsTimestamp() {
		return npsTimestamp;
	}

	public void setNpsTimestamp(DateTime npsTimestamp) {
		this.npsTimestamp = npsTimestamp;
	}
}