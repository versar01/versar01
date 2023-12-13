package com.eppixcomm.eppix.base.blo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class N1FileReader extends DOFileReader {

	public N1FileReader(File intputFile, String detailLinePrefix,
			int refStartOffset, int refEndOffset, int codeStartOffset,
			int codeEndOffset) {
		super(intputFile, detailLinePrefix, refStartOffset, refEndOffset,
				codeStartOffset, codeEndOffset);
	}

//	@Override
	public void loadFile() {
		try {
			BufferedReader in = new BufferedReader(new FileReader(inputFile));

			String line;
			while ((line = in.readLine()) != null) {
				// find the line with the data...
				if (line.contains(detailLinePrefix)) {

					if (entryList == null) {
						entryList = new ArrayList(50);
					}

					DOFileEntry entry = new DOFileEntry(line.substring(refStartOffset,
							refEndOffset), line.substring(codeStartOffset, codeEndOffset));

					entryList.add(entry);
				}
			}
			in.close();
		} catch (IOException e) {
		}

	}

}
