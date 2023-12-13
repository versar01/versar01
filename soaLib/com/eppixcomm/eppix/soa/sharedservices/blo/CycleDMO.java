package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class CycleDMO extends DBO implements Serializable {

	private String cycle;
	private Date invoiceDate;
	private Date invoiceDue;
	private Integer totalCalls;
	private String useStatus;
	private Date useStartTime;
	private Date useEndTime;
	private Short useRuns;
	private DateTime useElapsed;
	private Integer useSubs;
	private Integer useSurchSubs;
	private Integer useGrantSubs;
	private Integer useDiscs;
	private Integer useSurchDiscs;
	private Integer useGrantDiscs;
	private Integer useCalls;
	private Integer useSurchCalls;
	private Integer useGrantCalls;
	private Double useVal;
	private Double useSurchOrigVal;
	private Double useGrantOrigVal;
	private Double useSurchVal;
	private Double useGrantDiscVal;
	private Date runDate;
	private Date cycleStart;
	private Date cycleEnd;
	private Integer noOfInvs;
	private Double totalAmount;
	private String startInvoice;
	private String endInvoice;
	private Double totalNet;
	private Double totalVat;
	private Date startTime;
	private Date endTime;
	private String cycleStatus;
	private String batchNum;
	private Date cycleRunDate;
	private Date cycleInvoiceDate;
	private Integer invsExtracted;
	private Integer invsFormatted;

	public static final int cycleFilter = 0;
	private static final int cycleSize = 5;

	public static final int invoiceDateFilter = 1;

	public static final int invoiceDueFilter = 2;

	public static final int totalCallsFilter = 3;

	public static final int useStatusFilter = 4;
	private static final int useStatusSize = 1;

	public static final int useStartTimeFilter = 5;

	public static final int useEndTimeFilter = 6;

	public static final int useRunsFilter = 7;

	public static final int useElapsedFilter = 8;

	public static final int useSubsFilter = 9;

	public static final int useSurchSubsFilter = 10;

	public static final int useGrantSubsFilter = 11;

	public static final int useDiscsFilter = 12;

	public static final int useSurchDiscsFilter = 13;

	public static final int useGrantDiscsFilter = 14;

	public static final int useCallsFilter = 15;

	public static final int useSurchCallsFilter = 16;

	public static final int useGrantCallsFilter = 17;

	public static final int useValFilter = 18;

	public static final int useSurchOrigValFilter = 19;

	public static final int useGrantOrigValFilter = 20;

	public static final int useSurchValFilter = 21;

	public static final int useGrantDiscValFilter = 22;

	public static final int runDateFilter = 23;

	public static final int cycleStartFilter = 24;

	public static final int cycleEndFilter = 25;

	public static final int noOfInvsFilter = 26;

	public static final int totalAmountFilter = 27;

	public static final int startInvoiceFilter = 28;
	private static final int startInvoiceSize = 10;

	public static final int endInvoiceFilter = 29;
	private static final int endInvoiceSize = 10;

	public static final int totalNetFilter = 30;

	public static final int totalVatFilter = 31;

	public static final int startTimeFilter = 32;

	public static final int endTimeFilter = 33;

	public static final int cycleStatusFilter = 34;
	private static final int cycleStatusSize = 6;

	public static final int batchNumFilter = 35;
	private static final int batchNumSize = 6;

	public static final int cycleRunDateFilter = 36;

	public static final int cycleInvoiceDateFilter = 37;

	public static final int invsExtractedFilter = 38;

	public static final int invsFormattedFilter = 39;

	public CycleDMO() {
	};

	public CycleDMO(final String cycle, final Date invoiceDate,
			final Date invoiceDue, final Integer totalCalls,
			final String useStatus, final Date useStartTime,
			final Date useEndTime, final Short useRuns,
			final DateTime useElapsed, final Integer useSubs,
			final Integer useSurchSubs, final Integer useGrantSubs,
			final Integer useDiscs, final Integer useSurchDiscs,
			final Integer useGrantDiscs, final Integer useCalls,
			final Integer useSurchCalls, final Integer useGrantCalls,
			final Double useVal, final Double useSurchOrigVal,
			final Double useGrantOrigVal, final Double useSurchVal,
			final Double useGrantDiscVal, final Date runDate,
			final Date cycleStart, final Date cycleEnd, final Integer noOfInvs,
			final Double totalAmount, final String startInvoice,
			final String endInvoice, final Double totalNet,
			final Double totalVat, final Date startTime, final Date endTime,
			final String cycleStatus, final String batchNum,
			final Date cycleRunDate, final Date cycleInvoiceDate,
			final Integer invsExtracted, final Integer invsFormatted) {

		this.cycle = cycle;
		this.invoiceDate = invoiceDate;
		this.invoiceDue = invoiceDue;
		this.totalCalls = totalCalls;
		this.useStatus = useStatus;
		this.useStartTime = useStartTime;
		this.useEndTime = useEndTime;
		this.useRuns = useRuns;
		this.useElapsed = useElapsed;
		this.useSubs = useSubs;
		this.useSurchSubs = useSurchSubs;
		this.useGrantSubs = useGrantSubs;
		this.useDiscs = useDiscs;
		this.useSurchDiscs = useSurchDiscs;
		this.useGrantDiscs = useGrantDiscs;
		this.useCalls = useCalls;
		this.useSurchCalls = useSurchCalls;
		this.useGrantCalls = useGrantCalls;
		this.useVal = useVal;
		this.useSurchOrigVal = useSurchOrigVal;
		this.useGrantOrigVal = useGrantOrigVal;
		this.useSurchVal = useSurchVal;
		this.useGrantDiscVal = useGrantDiscVal;
		this.runDate = runDate;
		this.cycleStart = cycleStart;
		this.cycleEnd = cycleEnd;
		this.noOfInvs = noOfInvs;
		this.totalAmount = totalAmount;
		this.startInvoice = startInvoice;
		this.endInvoice = endInvoice;
		this.totalNet = totalNet;
		this.totalVat = totalVat;
		this.startTime = startTime;
		this.endTime = endTime;
		this.cycleStatus = cycleStatus;
		this.batchNum = batchNum;
		this.cycleRunDate = cycleRunDate;
		this.cycleInvoiceDate = cycleInvoiceDate;
		this.invsExtracted = invsExtracted;
		this.invsFormatted = invsFormatted;
	};

	private static final int[] fieldSizes = new int[] { cycleSize, 0, 0, 0,
			useStatusSize, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, startInvoiceSize, endInvoiceSize, 0, 0, 0, 0,
			cycleStatusSize, batchNumSize, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_SHORT, FIELD_TYPE_DATETIME, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_FLOAT,
			FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT,
			FIELD_TYPE_FLOAT, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_FLOAT,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_FLOAT,
			FIELD_TYPE_FLOAT, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.cycle == null) ? null
						: (this.cycle.length() <= cycleSize) ? this.cycle
								: this.cycle.substring(0, this.cycleSize)),
				this.invoiceDate,
				this.invoiceDue,
				this.totalCalls,
				((this.useStatus == null) ? null
						: (this.useStatus.length() <= useStatusSize) ? this.useStatus
								: this.useStatus.substring(0,
										this.useStatusSize)),
				this.useStartTime,
				this.useEndTime,
				this.useRuns,
				this.useElapsed,
				this.useSubs,
				this.useSurchSubs,
				this.useGrantSubs,
				this.useDiscs,
				this.useSurchDiscs,
				this.useGrantDiscs,
				this.useCalls,
				this.useSurchCalls,
				this.useGrantCalls,
				this.useVal,
				this.useSurchOrigVal,
				this.useGrantOrigVal,
				this.useSurchVal,
				this.useGrantDiscVal,
				this.runDate,
				this.cycleStart,
				this.cycleEnd,
				this.noOfInvs,
				this.totalAmount,
				((this.startInvoice == null) ? null : (this.startInvoice
						.length() <= startInvoiceSize) ? this.startInvoice
						: this.startInvoice.substring(0, this.startInvoiceSize)),
				((this.endInvoice == null) ? null
						: (this.endInvoice.length() <= endInvoiceSize) ? this.endInvoice
								: this.endInvoice.substring(0,
										this.endInvoiceSize)),
				this.totalNet,
				this.totalVat,
				this.startTime,
				this.endTime,
				((this.cycleStatus == null) ? null
						: (this.cycleStatus.length() <= cycleStatusSize) ? this.cycleStatus
								: this.cycleStatus.substring(0,
										this.cycleStatusSize)),
				((this.batchNum == null) ? null
						: (this.batchNum.length() <= batchNumSize) ? this.batchNum
								: this.batchNum.substring(0, this.batchNumSize)),
				this.cycleRunDate, this.cycleInvoiceDate, this.invsExtracted,
				this.invsFormatted };
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
		this.cycle = rtrim((String) fields[0]);
		this.invoiceDate = ((fields[1] == null) ? null : new Date(
				 fields[1]));
		this.invoiceDue = ((fields[2] == null) ? null : new Date(
				 fields[2]));
		this.totalCalls = ((Integer) fields[3]);
		this.useStatus = rtrim((String) fields[4]);
		this.useStartTime = ((fields[5] == null) ? null : new Date(
				 fields[5]));
		this.useEndTime = ((fields[6] == null) ? null : new Date(
				 fields[6]));
		this.useRuns = ((Short) fields[7]);
		this.useElapsed = ((fields[8] == null) ? null : new DateTime(
				(DateTime) fields[8]));
		this.useSubs = ((Integer) fields[9]);
		this.useSurchSubs = ((Integer) fields[10]);
		this.useGrantSubs = ((Integer) fields[11]);
		this.useDiscs = ((Integer) fields[12]);
		this.useSurchDiscs = ((Integer) fields[13]);
		this.useGrantDiscs = ((Integer) fields[14]);
		this.useCalls = ((Integer) fields[15]);
		this.useSurchCalls = ((Integer) fields[16]);
		this.useGrantCalls = ((Integer) fields[17]);
		this.useVal = ((Double) fields[18]);
		this.useSurchOrigVal = ((Double) fields[19]);
		this.useGrantOrigVal = ((Double) fields[20]);
		this.useSurchVal = ((Double) fields[21]);
		this.useGrantDiscVal = ((Double) fields[22]);
		this.runDate = ((fields[23] == null) ? null : new Date(
				 fields[23]));
		this.cycleStart = ((fields[24] == null) ? null : new Date(
				 fields[24]));
		this.cycleEnd = ((fields[25] == null) ? null : new Date(
				 fields[25]));
		this.noOfInvs = ((Integer) fields[26]);
		this.totalAmount = ((Double) fields[27]);
		this.startInvoice = rtrim((String) fields[28]);
		this.endInvoice = rtrim((String) fields[29]);
		this.totalNet = ((Double) fields[30]);
		this.totalVat = ((Double) fields[31]);
		this.startTime = ((fields[32] == null) ? null : new Date(
				 fields[32]));
		this.endTime = ((fields[33] == null) ? null : new Date(
				 fields[33]));
		this.cycleStatus = rtrim((String) fields[34]);
		this.batchNum = rtrim((String) fields[35]);
		this.cycleRunDate = ((fields[36] == null) ? null : new Date(
				 fields[36]));
		this.cycleInvoiceDate = ((fields[37] == null) ? null : new Date(
				 fields[37]));
		this.invsExtracted = ((Integer) fields[38]);
		this.invsFormatted = ((Integer) fields[39]);
	}

	public void set(final String cycle, final Date invoiceDate,
			final Date invoiceDue, final Integer totalCalls,
			final String useStatus, final Date useStartTime,
			final Date useEndTime, final Short useRuns,
			final DateTime useElapsed, final Integer useSubs,
			final Integer useSurchSubs, final Integer useGrantSubs,
			final Integer useDiscs, final Integer useSurchDiscs,
			final Integer useGrantDiscs, final Integer useCalls,
			final Integer useSurchCalls, final Integer useGrantCalls,
			final Double useVal, final Double useSurchOrigVal,
			final Double useGrantOrigVal, final Double useSurchVal,
			final Double useGrantDiscVal, final Date runDate,
			final Date cycleStart, final Date cycleEnd, final Integer noOfInvs,
			final Double totalAmount, final String startInvoice,
			final String endInvoice, final Double totalNet,
			final Double totalVat, final Date startTime, final Date endTime,
			final String cycleStatus, final String batchNum,
			final Date cycleRunDate, final Date cycleInvoiceDate,
			final Integer invsExtracted, final Integer invsFormatted) {

		this.cycle = cycle;
		this.invoiceDate = invoiceDate;
		this.invoiceDue = invoiceDue;
		this.totalCalls = totalCalls;
		this.useStatus = useStatus;
		this.useStartTime = useStartTime;
		this.useEndTime = useEndTime;
		this.useRuns = useRuns;
		this.useElapsed = useElapsed;
		this.useSubs = useSubs;
		this.useSurchSubs = useSurchSubs;
		this.useGrantSubs = useGrantSubs;
		this.useDiscs = useDiscs;
		this.useSurchDiscs = useSurchDiscs;
		this.useGrantDiscs = useGrantDiscs;
		this.useCalls = useCalls;
		this.useSurchCalls = useSurchCalls;
		this.useGrantCalls = useGrantCalls;
		this.useVal = useVal;
		this.useSurchOrigVal = useSurchOrigVal;
		this.useGrantOrigVal = useGrantOrigVal;
		this.useSurchVal = useSurchVal;
		this.useGrantDiscVal = useGrantDiscVal;
		this.runDate = runDate;
		this.cycleStart = cycleStart;
		this.cycleEnd = cycleEnd;
		this.noOfInvs = noOfInvs;
		this.totalAmount = totalAmount;
		this.startInvoice = startInvoice;
		this.endInvoice = endInvoice;
		this.totalNet = totalNet;
		this.totalVat = totalVat;
		this.startTime = startTime;
		this.endTime = endTime;
		this.cycleStatus = cycleStatus;
		this.batchNum = batchNum;
		this.cycleRunDate = cycleRunDate;
		this.cycleInvoiceDate = cycleInvoiceDate;
		this.invsExtracted = invsExtracted;
		this.invsFormatted = invsFormatted;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Date getInvoiceDue() {
		return invoiceDue;
	}

	public void setInvoiceDue(Date invoiceDue) {
		this.invoiceDue = invoiceDue;
	}

	public Integer getTotalCalls() {
		return totalCalls;
	}

	public void setTotalCalls(Integer totalCalls) {
		this.totalCalls = totalCalls;
	}

	public String getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public Date getUseStartTime() {
		return useStartTime;
	}

	public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

	public Date getUseEndTime() {
		return useEndTime;
	}

	public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

	public Short getUseRuns() {
		return useRuns;
	}

	public void setUseRuns(Short useRuns) {
		this.useRuns = useRuns;
	}

	public DateTime getUseElapsed() {
		return useElapsed;
	}

	public void setUseElapsed(DateTime useElapsed) {
		this.useElapsed = useElapsed;
	}

	public Integer getUseSubs() {
		return useSubs;
	}

	public void setUseSubs(Integer useSubs) {
		this.useSubs = useSubs;
	}

	public Integer getUseSurchSubs() {
		return useSurchSubs;
	}

	public void setUseSurchSubs(Integer useSurchSubs) {
		this.useSurchSubs = useSurchSubs;
	}

	public Integer getUseGrantSubs() {
		return useGrantSubs;
	}

	public void setUseGrantSubs(Integer useGrantSubs) {
		this.useGrantSubs = useGrantSubs;
	}

	public Integer getUseDiscs() {
		return useDiscs;
	}

	public void setUseDiscs(Integer useDiscs) {
		this.useDiscs = useDiscs;
	}

	public Integer getUseSurchDiscs() {
		return useSurchDiscs;
	}

	public void setUseSurchDiscs(Integer useSurchDiscs) {
		this.useSurchDiscs = useSurchDiscs;
	}

	public Integer getUseGrantDiscs() {
		return useGrantDiscs;
	}

	public void setUseGrantDiscs(Integer useGrantDiscs) {
		this.useGrantDiscs = useGrantDiscs;
	}

	public Integer getUseCalls() {
		return useCalls;
	}

	public void setUseCalls(Integer useCalls) {
		this.useCalls = useCalls;
	}

	public Integer getUseSurchCalls() {
		return useSurchCalls;
	}

	public void setUseSurchCalls(Integer useSurchCalls) {
		this.useSurchCalls = useSurchCalls;
	}

	public Integer getUseGrantCalls() {
		return useGrantCalls;
	}

	public void setUseGrantCalls(Integer useGrantCalls) {
		this.useGrantCalls = useGrantCalls;
	}

	public Double getUseVal() {
		return useVal;
	}

	public void setUseVal(Double useVal) {
		this.useVal = useVal;
	}

	public Double getUseSurchOrigVal() {
		return useSurchOrigVal;
	}

	public void setUseSurchOrigVal(Double useSurchOrigVal) {
		this.useSurchOrigVal = useSurchOrigVal;
	}

	public Double getUseGrantOrigVal() {
		return useGrantOrigVal;
	}

	public void setUseGrantOrigVal(Double useGrantOrigVal) {
		this.useGrantOrigVal = useGrantOrigVal;
	}

	public Double getUseSurchVal() {
		return useSurchVal;
	}

	public void setUseSurchVal(Double useSurchVal) {
		this.useSurchVal = useSurchVal;
	}

	public Double getUseGrantDiscVal() {
		return useGrantDiscVal;
	}

	public void setUseGrantDiscVal(Double useGrantDiscVal) {
		this.useGrantDiscVal = useGrantDiscVal;
	}

	public Date getRunDate() {
		return runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	public Date getCycleStart() {
		return cycleStart;
	}

	public void setCycleStart(Date cycleStart) {
		this.cycleStart = cycleStart;
	}

	public Date getCycleEnd() {
		return cycleEnd;
	}

	public void setCycleEnd(Date cycleEnd) {
		this.cycleEnd = cycleEnd;
	}

	public Integer getNoOfInvs() {
		return noOfInvs;
	}

	public void setNoOfInvs(Integer noOfInvs) {
		this.noOfInvs = noOfInvs;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStartInvoice() {
		return startInvoice;
	}

	public void setStartInvoice(String startInvoice) {
		this.startInvoice = startInvoice;
	}

	public String getEndInvoice() {
		return endInvoice;
	}

	public void setEndInvoice(String endInvoice) {
		this.endInvoice = endInvoice;
	}

	public Double getTotalNet() {
		return totalNet;
	}

	public void setTotalNet(Double totalNet) {
		this.totalNet = totalNet;
	}

	public Double getTotalVat() {
		return totalVat;
	}

	public void setTotalVat(Double totalVat) {
		this.totalVat = totalVat;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCycleStatus() {
		return cycleStatus;
	}

	public void setCycleStatus(String cycleStatus) {
		this.cycleStatus = cycleStatus;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public Date getCycleRunDate() {
		return cycleRunDate;
	}

	public void setCycleRunDate(Date cycleRunDate) {
		this.cycleRunDate = cycleRunDate;
	}

	public Date getCycleInvoiceDate() {
		return cycleInvoiceDate;
	}

	public void setCycleInvoiceDate(Date cycleInvoiceDate) {
		this.cycleInvoiceDate = cycleInvoiceDate;
	}

	public Integer getInvsExtracted() {
		return invsExtracted;
	}

	public void setInvsExtracted(Integer invsExtracted) {
		this.invsExtracted = invsExtracted;
	}

	public Integer getInvsFormatted() {
		return invsFormatted;
	}

	public void setInvsFormatted(Integer invsFormatted) {
		this.invsFormatted = invsFormatted;
	}

}
