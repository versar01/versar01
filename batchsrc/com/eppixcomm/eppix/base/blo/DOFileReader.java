package com.eppixcomm.eppix.base.blo;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public abstract class DOFileReader implements Iterator {

	public class DOFileEntry {
		private String refNo;

		private String reason;

		public DOFileEntry(String refNo, String reason) {
			this.refNo = refNo;
			this.reason = reason;
		}

		public String getReason() {
			return reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getRefNo() {
			return refNo;
		}

		public void setRefNo(String refNo) {
			this.refNo = refNo;
		}
	}

	protected int refEndOffset;

	protected int refStartOffset;

	protected int codeEndOffset;

	protected int codeStartOffset;
	
	protected String detailLinePrefix;

	protected File inputFile;

	protected List entryList;

	protected Iterator i;

	public DOFileReader(File intputFile, String detailLinePrefix, int refStartOffset, int refEndOffset,
			int codeStartOffset, int codeEndOffset) {
		this.inputFile = intputFile;
		this.detailLinePrefix = detailLinePrefix;
		this.refStartOffset = refStartOffset;
		this.refEndOffset = refEndOffset;
		this.codeStartOffset = codeStartOffset;
		this.codeEndOffset = codeEndOffset;

		loadFile();

		if (entryList != null) {
			i = entryList.iterator();
		}
	}

	public abstract void loadFile();

	public boolean hasNext() {
		return (i != null) ? i.hasNext() : false;
	}

	public Object next() {
		return (i != null) ? i.next() : null;
	}

	public void remove() {
		// does nothing...
	}

}
