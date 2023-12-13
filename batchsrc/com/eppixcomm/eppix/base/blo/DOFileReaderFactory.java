package com.eppixcomm.eppix.base.blo;

import java.io.File;

public class DOFileReaderFactory {

	public static DOFileReader getFileReader(String instCode, File intputFile,
			String detailLinePrefix, int refStartOffset, int refEndOffset,
			int codeStartOffset, int codeEndOffset) {

		DOFileReader reader = null;

		if ("N1".equals(instCode)) {
			reader = new N1FileReader(intputFile, detailLinePrefix, refStartOffset,
					refEndOffset, codeStartOffset, codeStartOffset);
		} else if ("S1".equals(instCode)) {
			reader = new S1FileReader(intputFile, detailLinePrefix, refStartOffset,
					refEndOffset, codeStartOffset, codeStartOffset);
		} else if ("L1".equals(instCode)) {
			// L1 format doesn't use start/end...  but rather is an XML format instead.
			reader = new L1FileReader(intputFile);
		}

		return reader;

	}
}
