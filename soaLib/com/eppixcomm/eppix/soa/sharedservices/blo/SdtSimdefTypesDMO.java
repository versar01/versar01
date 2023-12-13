package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SdtSimdefTypesDMO extends DBO implements Serializable {


private String sdtArticleNo;
private String sdtCardType;
private String sdtLayout;
private String sdtLettType;
private String sdtText1;
private String sdtText2;
private String sdtText3;
private String sdtText4;
private String sdtLogo;
private String sdtPinDis;
private String sdtConfig;
private String sdtShortMess;
private String sdtAbbreDial;


public static final int sdtArticleNoFilter = 0;
private static final int sdtArticleNoSize = 20;


public static final int sdtCardTypeFilter = 1;
private static final int sdtCardTypeSize = 2;


public static final int sdtLayoutFilter = 2;
private static final int sdtLayoutSize = 6;


public static final int sdtLettTypeFilter = 3;
private static final int sdtLettTypeSize = 8;


public static final int sdtText1Filter = 4;
private static final int sdtText1Size = 40;


public static final int sdtText2Filter = 5;
private static final int sdtText2Size = 40;


public static final int sdtText3Filter = 6;
private static final int sdtText3Size = 40;


public static final int sdtText4Filter = 7;
private static final int sdtText4Size = 40;


public static final int sdtLogoFilter = 8;
private static final int sdtLogoSize = 8;


public static final int sdtPinDisFilter = 9;
private static final int sdtPinDisSize = 1;


public static final int sdtConfigFilter = 10;
private static final int sdtConfigSize = 8;


public static final int sdtShortMessFilter = 11;
private static final int sdtShortMessSize = 3;


public static final int sdtAbbreDialFilter = 12;
private static final int sdtAbbreDialSize = 3;





public SdtSimdefTypesDMO(){};

public SdtSimdefTypesDMO(final String sdtArticleNo,
final String sdtCardType,
final String sdtLayout,
final String sdtLettType,
final String sdtText1,
final String sdtText2,
final String sdtText3,
final String sdtText4,
final String sdtLogo,
final String sdtPinDis,
final String sdtConfig,
final String sdtShortMess,
final String sdtAbbreDial
){

this.sdtArticleNo = sdtArticleNo;
this.sdtCardType = sdtCardType;
this.sdtLayout = sdtLayout;
this.sdtLettType = sdtLettType;
this.sdtText1 = sdtText1;
this.sdtText2 = sdtText2;
this.sdtText3 = sdtText3;
this.sdtText4 = sdtText4;
this.sdtLogo = sdtLogo;
this.sdtPinDis = sdtPinDis;
this.sdtConfig = sdtConfig;
this.sdtShortMess = sdtShortMess;
this.sdtAbbreDial = sdtAbbreDial;
};


private static final int[] fieldSizes = new int[]{
sdtArticleNoSize,
sdtCardTypeSize,
sdtLayoutSize,
sdtLettTypeSize,
sdtText1Size,
sdtText2Size,
sdtText3Size,
sdtText4Size,
sdtLogoSize,
sdtPinDisSize,
sdtConfigSize,
sdtShortMessSize,
sdtAbbreDialSize
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{			((this.sdtArticleNo == null) ? null : (this.sdtArticleNo.length() <= sdtArticleNoSize) ? this.sdtArticleNo : this.sdtArticleNo.substring(0, this.sdtArticleNoSize)),
			((this.sdtCardType == null) ? null : (this.sdtCardType.length() <= sdtCardTypeSize) ? this.sdtCardType : this.sdtCardType.substring(0, this.sdtCardTypeSize)),
			((this.sdtLayout == null) ? null : (this.sdtLayout.length() <= sdtLayoutSize) ? this.sdtLayout : this.sdtLayout.substring(0, this.sdtLayoutSize)),
			((this.sdtLettType == null) ? null : (this.sdtLettType.length() <= sdtLettTypeSize) ? this.sdtLettType : this.sdtLettType.substring(0, this.sdtLettTypeSize)),
			((this.sdtText1 == null) ? null : (this.sdtText1.length() <= sdtText1Size) ? this.sdtText1 : this.sdtText1.substring(0, this.sdtText1Size)),
			((this.sdtText2 == null) ? null : (this.sdtText2.length() <= sdtText2Size) ? this.sdtText2 : this.sdtText2.substring(0, this.sdtText2Size)),
			((this.sdtText3 == null) ? null : (this.sdtText3.length() <= sdtText3Size) ? this.sdtText3 : this.sdtText3.substring(0, this.sdtText3Size)),
			((this.sdtText4 == null) ? null : (this.sdtText4.length() <= sdtText4Size) ? this.sdtText4 : this.sdtText4.substring(0, this.sdtText4Size)),
			((this.sdtLogo == null) ? null : (this.sdtLogo.length() <= sdtLogoSize) ? this.sdtLogo : this.sdtLogo.substring(0, this.sdtLogoSize)),
			((this.sdtPinDis == null) ? null : (this.sdtPinDis.length() <= sdtPinDisSize) ? this.sdtPinDis : this.sdtPinDis.substring(0, this.sdtPinDisSize)),
			((this.sdtConfig == null) ? null : (this.sdtConfig.length() <= sdtConfigSize) ? this.sdtConfig : this.sdtConfig.substring(0, this.sdtConfigSize)),
			((this.sdtShortMess == null) ? null : (this.sdtShortMess.length() <= sdtShortMessSize) ? this.sdtShortMess : this.sdtShortMess.substring(0, this.sdtShortMessSize)),
			((this.sdtAbbreDial == null) ? null : (this.sdtAbbreDial.length() <= sdtAbbreDialSize) ? this.sdtAbbreDial : this.sdtAbbreDial.substring(0, this.sdtAbbreDialSize))
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
	return new DAOArgs(1).arg(this.sdtArticleNo); 
}



protected void set(Object[] fields) {
this.sdtArticleNo = rtrim((String)fields[0]);
this.sdtCardType = rtrim((String)fields[1]);
this.sdtLayout = rtrim((String)fields[2]);
this.sdtLettType = rtrim((String)fields[3]);
this.sdtText1 = rtrim((String)fields[4]);
this.sdtText2 = rtrim((String)fields[5]);
this.sdtText3 = rtrim((String)fields[6]);
this.sdtText4 = rtrim((String)fields[7]);
this.sdtLogo = rtrim((String)fields[8]);
this.sdtPinDis = rtrim((String)fields[9]);
this.sdtConfig = rtrim((String)fields[10]);
this.sdtShortMess = rtrim((String)fields[11]);
this.sdtAbbreDial = rtrim((String)fields[12]);
}


public void set(
final String sdtArticleNo,
final String sdtCardType,
final String sdtLayout,
final String sdtLettType,
final String sdtText1,
final String sdtText2,
final String sdtText3,
final String sdtText4,
final String sdtLogo,
final String sdtPinDis,
final String sdtConfig,
final String sdtShortMess,
final String sdtAbbreDial
)
{

this.sdtArticleNo = sdtArticleNo;
this.sdtCardType = sdtCardType;
this.sdtLayout = sdtLayout;
this.sdtLettType = sdtLettType;
this.sdtText1 = sdtText1;
this.sdtText2 = sdtText2;
this.sdtText3 = sdtText3;
this.sdtText4 = sdtText4;
this.sdtLogo = sdtLogo;
this.sdtPinDis = sdtPinDis;
this.sdtConfig = sdtConfig;
this.sdtShortMess = sdtShortMess;
this.sdtAbbreDial = sdtAbbreDial;
}

public String getSdtArticleNo() {
	return sdtArticleNo;
}

public void setSdtArticleNo(String sdtArticleNo) {
	this.sdtArticleNo = sdtArticleNo;
}

public String getSdtCardType() {
	return sdtCardType;
}

public void setSdtCardType(String sdtCardType) {
	this.sdtCardType = sdtCardType;
}

public String getSdtLayout() {
	return sdtLayout;
}

public void setSdtLayout(String sdtLayout) {
	this.sdtLayout = sdtLayout;
}

public String getSdtLettType() {
	return sdtLettType;
}

public void setSdtLettType(String sdtLettType) {
	this.sdtLettType = sdtLettType;
}

public String getSdtText1() {
	return sdtText1;
}

public void setSdtText1(String sdtText1) {
	this.sdtText1 = sdtText1;
}

public String getSdtText2() {
	return sdtText2;
}

public void setSdtText2(String sdtText2) {
	this.sdtText2 = sdtText2;
}

public String getSdtText3() {
	return sdtText3;
}

public void setSdtText3(String sdtText3) {
	this.sdtText3 = sdtText3;
}

public String getSdtText4() {
	return sdtText4;
}

public void setSdtText4(String sdtText4) {
	this.sdtText4 = sdtText4;
}

public String getSdtLogo() {
	return sdtLogo;
}

public void setSdtLogo(String sdtLogo) {
	this.sdtLogo = sdtLogo;
}

public String getSdtPinDis() {
	return sdtPinDis;
}

public void setSdtPinDis(String sdtPinDis) {
	this.sdtPinDis = sdtPinDis;
}

public String getSdtConfig() {
	return sdtConfig;
}

public void setSdtConfig(String sdtConfig) {
	this.sdtConfig = sdtConfig;
}

public String getSdtShortMess() {
	return sdtShortMess;
}

public void setSdtShortMess(String sdtShortMess) {
	this.sdtShortMess = sdtShortMess;
}

public String getSdtAbbreDial() {
	return sdtAbbreDial;
}

public void setSdtAbbreDial(String sdtAbbreDial) {
	this.sdtAbbreDial = sdtAbbreDial;
}


}
