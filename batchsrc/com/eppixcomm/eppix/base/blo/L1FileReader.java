package com.eppixcomm.eppix.base.blo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class L1FileReader extends DOFileReader {

	public L1FileReader(File intputFile) {
		super(intputFile, null, 0, 0, 0, 0);
	}

//	@Override
	public void loadFile() {
		// TODO: BaH Auto-generated method stub
		SAXBuilder parser = new SAXBuilder();
		 try {
			Document doc = parser.build(inputFile);
			
			Element root = doc.getRootElement();
			
			List children = root.getChildren("DebitOrder_VCL_SBL");
			
			for (Iterator i = children.iterator(); i.hasNext();) {
				
				Element node = (Element)i.next();
				
				String reference = node.getChildText("VCLReference").trim();
				String status = node.getChildText("Status");

				DOFileEntry entry = new DOFileEntry(reference, status);
				
//				if (entryList == null) {
//					entryList = new ArrayList<DOFileEntry>();
//				}
				
				entryList.add(entry);
			}
			
		} catch (JDOMException e) {
			// TODO: BaH Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: BaH Auto-generated catch block
			e.printStackTrace();
		}
	}

}
