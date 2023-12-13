package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class NgsNetGroupServDMO extends DBO implements Serializable {

	public NgsNetGroupServDMO() {
	}

	public NgsNetGroupServDMO(final String ngsCode, final String ngsNetwork,
			final String ngsNetServCode, final Integer ngsSequence,
			final String ngsApplyText, final String ngsModifyText,
			final String ngsRemoveText, final String ngsParamName1,
			final String ngsParamValue1, final String ngsParamName2,
			final String ngsParamValue2, final String ngsParamName3,
			final String ngsParamValue3, final String ngsParamName4,
			final String ngsParamValue4, final String ngsParamName5,
			final String ngsParamValue5) {
		this.ngsCode = ngsCode;
		this.ngsNetwork = ngsNetwork;
		this.ngsNetServCode = ngsNetServCode;
		this.ngsSequence = ngsSequence;
		this.ngsApplyText = ngsApplyText;
		this.ngsModifyText = ngsModifyText;
		this.ngsRemoveText = ngsRemoveText;
		this.ngsParamName1 = ngsParamName1;
		this.ngsParamValue1 = ngsParamValue1;
		this.ngsParamName2 = ngsParamName2;
		this.ngsParamValue2 = ngsParamValue2;
		this.ngsParamName3 = ngsParamName3;
		this.ngsParamValue3 = ngsParamValue3;
		this.ngsParamName4 = ngsParamName4;
		this.ngsParamValue4 = ngsParamValue4;
		this.ngsParamName5 = ngsParamName5;
		this.ngsParamValue5 = ngsParamValue5;
	}

	private String ngsCode;
	private String ngsNetwork;
	private String ngsNetServCode;
	private Integer ngsSequence;
	private String ngsApplyText;
	private String ngsModifyText;
	private String ngsRemoveText;
	private String ngsParamName1;
	private String ngsParamValue1;
	private String ngsParamName2;
	private String ngsParamValue2;
	private String ngsParamName3;
	private String ngsParamValue3;
	private String ngsParamName4;
	private String ngsParamValue4;
	private String ngsParamName5;
	private String ngsParamValue5;

	private static final int[] fieldTypes = new int[] { 
		FIELD_TYPE_STRING /* std public  attribute ncrCompressCode*/,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_INTEGER /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */
	};
	
	private final int[] fieldSizes = new int[] {
			ngsCodeSize,
			ngsNetworkSize,
			ngsNetServCodeSize,
			0,
			ngsApplyTextSize,
			ngsModifyTextSize,
			ngsRemoveTextSize,
			ngsParamName1Size,
			ngsParamValue1Size,
			ngsParamName2Size,
			ngsParamValue2Size,
			ngsParamName3Size,
			ngsParamValue3Size,
			ngsParamName4Size,
			ngsParamValue4Size,
			ngsParamName5Size,
			ngsParamValue5Size
	};
	    

	public int[] fieldSizes() {
		return fieldSizes;
	}  

	public static final int ngsCodeFilter = 0; // filter index
	private static final int ngsCodeSize = 15; // field size

	public static final int ngsNetworkFilter = 1; // filter index
	private static final int ngsNetworkSize = 5; // field size

	public static final int ngsNetServCodeFilter = 2; // filter index
	private static final int ngsNetServCodeSize = 10; // field size

	public static final int ngsSequenceFilter = 3; // filter index

	public static final int ngsApplyTextFilter = 4; // filter index
	private static final int ngsApplyTextSize = 30; // field size

	public static final int ngsModifyTextFilter = 5; // filter index
	private static final int ngsModifyTextSize = 30; // field size

	public static final int ngsRemoveTextFilter = 6; // filter index
	private static final int ngsRemoveTextSize = 30; // field size

	public static final int ngsParamName1Filter = 7; // filter index
	private static final int ngsParamName1Size = 30; // field size

	public static final int ngsParamValue1Filter = 8; // filter index
	private static final int ngsParamValue1Size = 30; // field size

	public static final int ngsParamName2Filter = 9; // filter index
	private static final int ngsParamName2Size = 30; // field size

	public static final int ngsParamValue2Filter = 10; // filter index
	private static final int ngsParamValue2Size = 30; // field size

	public static final int ngsParamName3Filter = 11; // filter index
	private static final int ngsParamName3Size = 30; // field size

	public static final int ngsParamValue3Filter = 12; // filter index
	private static final int ngsParamValue3Size = 30; // field size

	public static final int ngsParamName4Filter = 13; // filter index
	private static final int ngsParamName4Size = 30; // field size

	public static final int ngsParamValue4Filter = 14; // filter index
	private static final int ngsParamValue4Size = 30; // field size

	public static final int ngsParamName5Filter = 15; // filter index
	private static final int ngsParamName5Size = 30; // field size

	public static final int ngsParamValue5Filter = 16; // filter index
	private static final int ngsParamValue5Size = 30; // field size

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				(ngsCode == null) ? null
						: ((ngsCode.length() <= ngsCodeSize) ? ngsCode
								: ngsCode.substring(0, ngsCodeSize)),
				(ngsNetwork == null) ? null
						: ((ngsNetwork.length() <= ngsNetworkSize) ? ngsNetwork
								: ngsNetwork.substring(0, ngsNetworkSize)),
				(ngsNetServCode == null) ? null
						: ((ngsNetServCode.length() <= ngsNetServCodeSize) ? ngsNetServCode
								: ngsNetServCode.substring(0,
										ngsNetServCodeSize)),
				ngsSequence,
				(ngsApplyText == null) ? null
						: ((ngsApplyText.length() <= ngsApplyTextSize) ? ngsApplyText
								: ngsApplyText.substring(0, ngsApplyTextSize)),
				(ngsModifyText == null) ? null
						: ((ngsModifyText.length() <= ngsModifyTextSize) ? ngsModifyText
								: ngsModifyText.substring(0, ngsModifyTextSize)),
				(ngsRemoveText == null) ? null
						: ((ngsRemoveText.length() <= ngsRemoveTextSize) ? ngsRemoveText
								: ngsRemoveText.substring(0, ngsRemoveTextSize)),
				(ngsParamName1 == null) ? null
						: ((ngsParamName1.length() <= ngsParamName1Size) ? ngsParamName1
								: ngsParamName1.substring(0, ngsParamName1Size)),
				(ngsParamValue1 == null) ? null
						: ((ngsParamValue1.length() <= ngsParamValue1Size) ? ngsParamValue1
								: ngsParamValue1.substring(0,
										ngsParamValue1Size)),
				(ngsParamName2 == null) ? null
						: ((ngsParamName2.length() <= ngsParamName2Size) ? ngsParamName2
								: ngsParamName2.substring(0, ngsParamName2Size)),
				(ngsParamValue2 == null) ? null
						: ((ngsParamValue2.length() <= ngsParamValue2Size) ? ngsParamValue2
								: ngsParamValue2.substring(0,
										ngsParamValue2Size)),
				(ngsParamName3 == null) ? null
						: ((ngsParamName3.length() <= ngsParamName3Size) ? ngsParamName3
								: ngsParamName3.substring(0, ngsParamName3Size)),
				(ngsParamValue3 == null) ? null
						: ((ngsParamValue3.length() <= ngsParamValue3Size) ? ngsParamValue3
								: ngsParamValue3.substring(0,
										ngsParamValue3Size)),
				(ngsParamName4 == null) ? null
						: ((ngsParamName4.length() <= ngsParamName4Size) ? ngsParamName4
								: ngsParamName4.substring(0, ngsParamName4Size)),
				(ngsParamValue4 == null) ? null
						: ((ngsParamValue4.length() <= ngsParamValue4Size) ? ngsParamValue4
								: ngsParamValue4.substring(0,
										ngsParamValue4Size)),
				(ngsParamName5 == null) ? null
						: ((ngsParamName5.length() <= ngsParamName5Size) ? ngsParamName5
								: ngsParamName5.substring(0, ngsParamName5Size)),
				(ngsParamValue5 == null) ? null
						: ((ngsParamValue5.length() <= ngsParamValue5Size) ? ngsParamValue5
								: ngsParamValue5.substring(0, ngsParamValue5Size)) };
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected DAOArgs primaryKey() {
	    return new DAOArgs( 4 ).arg(( this.ngsCode == null) ? null: this.ngsCode.trim())
	    .arg(( this.ngsNetwork == null) ? null: this.ngsNetwork.trim())
	    .arg(( this.ngsNetServCode == null) ? null: this.ngsNetServCode.trim())
	    .arg(this.ngsSequence);
	    //ngs_code, ngs_network, ngs_net_serv_code, ngs_sequence
	}

	protected void set(final Object[] fields) {
		ngsCode = rtrim((String) fields[0]);
		ngsNetwork = rtrim((String) fields[1]);
		ngsNetServCode = rtrim((String) fields[2]);
		ngsSequence = (Integer) fields[3];
		ngsApplyText = rtrim((String) fields[4]);
		ngsModifyText = rtrim((String) fields[5]);
		ngsRemoveText = rtrim((String) fields[6]);
		ngsParamName1 = rtrim((String) fields[7]);
		ngsParamValue1 = rtrim((String) fields[8]);
		ngsParamName2 = rtrim((String) fields[9]);
		ngsParamValue2 = rtrim((String) fields[10]);
		ngsParamName3 = rtrim((String) fields[11]);
		ngsParamValue3 = rtrim((String) fields[12]);
		ngsParamName4 = rtrim((String) fields[13]);
		ngsParamValue4 = rtrim((String) fields[14]);
		ngsParamName5 = rtrim((String) fields[15]);
		ngsParamValue5 = rtrim((String) fields[16]);
	}

	protected void set(String ngsCode, String ngsNetwork,
			String ngsNetServCode, Integer ngsSequence, String ngsApplyText,
			String ngsModifyText, String ngsRemoveText, String ngsParamName1,
			String ngsParamValue1, String ngsParamName2, String ngsParamValue2,
			String ngsParamName3, String ngsParamValue3, String ngsParamName4,
			String ngsParamValue4, String ngsParamName5, String ngsParamValue5) {
		this.ngsCode = ngsCode;
		this.ngsNetwork = ngsNetwork;
		this.ngsNetServCode = ngsNetServCode;
		this.ngsSequence = ngsSequence;
		this.ngsApplyText = ngsApplyText;
		this.ngsModifyText = ngsModifyText;
		this.ngsRemoveText = ngsRemoveText;
		this.ngsParamName1 = ngsParamName1;
		this.ngsParamValue1 = ngsParamValue1;
		this.ngsParamName2 = ngsParamName2;
		this.ngsParamValue2 = ngsParamValue2;
		this.ngsParamName3 = ngsParamName3;
		this.ngsParamValue3 = ngsParamValue3;
		this.ngsParamName4 = ngsParamName4;
		this.ngsParamValue4 = ngsParamValue4;
		this.ngsParamName5 = ngsParamName5;
		this.ngsParamValue5 = ngsParamValue5;
	}

	protected int[] fieldTypes() {
		return this.fieldTypes;
	}

	public String getNgsCode() {
		return ngsCode;
	}

	public void setNgsCode(String ngsCode) {
		this.ngsCode = getPadded(ngsCode, ngsCodeFilter);
	}

	public String getNgsNetwork() {
		return ngsNetwork;
	}

	public void setNgsNetwork(String ngsNetwork) {
		this.ngsNetwork = getPadded(ngsNetwork, ngsNetworkFilter);
	}

	public String getNgsNetServCode() {
		return ngsNetServCode;
	}

	public void setNgsNetServCode(String ngsNetServCode) {
		this.ngsNetServCode = getPadded(ngsNetServCode, ngsNetServCodeFilter);
	}

	public Integer getNgsSequence() {
		return ngsSequence;
	}

	public void setNgsSequence(Integer ngsSequence) {
		this.ngsSequence = ngsSequence;
	}

	public String getNgsApplyText() {
		return ngsApplyText;
	}

	public void setNgsApplyText(String ngsApplyText) {
		this.ngsApplyText = getPadded(ngsApplyText, ngsApplyTextFilter);
	}

	public String getNgsModifyText() {
		return ngsModifyText;
	}

	public void setNgsModifyText(String ngsModifyText) {
		this.ngsModifyText = getPadded(ngsModifyText, ngsModifyTextFilter);
	}

	public String getNgsRemoveText() {
		return ngsRemoveText;
	}

	public void setNgsRemoveText(String ngsRemoveText) {
		this.ngsRemoveText = getPadded(ngsRemoveText, ngsRemoveTextFilter);
	}

	public String getNgsParamName1() {
		return ngsParamName1;
	}

	public void setNgsParamName1(String ngsParamName1) {
		this.ngsParamName1 = getPadded(ngsParamName1, ngsParamName1Filter);
	}

	public String getNgsParamValue1() {
		return ngsParamValue1;
	}

	public void setNgsParamValue1(String ngsParamValue1) {
		this.ngsParamValue1 = getPadded(ngsParamValue1, ngsParamValue1Filter);
	}

	public String getNgsParamName2() {
		return ngsParamName2;
	}

	public void setNgsParamName2(String ngsParamName2) {
		this.ngsParamName2 = getPadded(ngsParamName2, ngsParamName2Filter);
	}

	public String getNgsParamValue2() {
		return ngsParamValue2;
	}

	public void setNgsParamValue2(String ngsParamValue2) {
		this.ngsParamValue2 = getPadded(ngsParamValue2, ngsParamValue2Filter);
	}

	public String getNgsParamName3() {
		return ngsParamName3;
	}

	public void setNgsParamName3(String ngsParamName3) {
		this.ngsParamName3 = getPadded(ngsParamName3, ngsParamName3Filter);
	}

	public String getNgsParamValue3() {
		return ngsParamValue3;
	}

	public void setNgsParamValue3(String ngsParamValue3) {
		this.ngsParamValue3 = getPadded(ngsParamValue3, ngsParamValue3Filter);
	}

	public String getNgsParamName4() {
		return ngsParamName4;
	}

	public void setNgsParamName4(String ngsParamName4) {
		this.ngsParamName4 = getPadded(ngsParamName4, ngsParamName4Filter);
	}

	public String getNgsParamValue4() {
		return ngsParamValue4;
	}

	public void setNgsParamValue4(String ngsParamValue4) {
		this.ngsParamValue4 = getPadded(ngsParamValue4, ngsParamValue4Filter);
	}

	public String getNgsParamName5() {
		return ngsParamName5;
	}

	public void setNgsParamName5(String ngsParamName5) {
		this.ngsParamName5 = getPadded(ngsParamName5, ngsParamName5Filter);
	}

	public String getNgsParamValue5() {
		return ngsParamValue5;
	}

	public void setNgsParamValue5(String ngsParamValue5) {
		this.ngsParamValue5 = getPadded(ngsParamValue5, ngsParamValue5Filter);
	}

}
