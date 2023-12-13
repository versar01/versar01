package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;



public class SbaSubAuxDMO   extends DBO
implements Serializable {
	private Integer sbaSubscriberId;
	private String sbaIdNumber;
	private String sbaMatchcode;
	private String sbaMarketing;
	private String sbaThirdParty;
	private String sbaCustdept;
	private String sbaDealerId;
	private String sbaDepartment;
	private String sbaSalesman;
	private String sbaRegion;
	private Integer sbaInvoiceAddrid;
	private String sbaInvAccount;
	private String sbaPrepaidStat;
	private String sbaAnalysis1;
	private String sbaAnalysis2;
	private String sbaAnalysis3;
	private String sbaAnalysis4;
	private String sbaAnalysis5;
	private String sbaAnalysis6;
	private String sbaAnalysis7;
	private String sbaAnalysis8;
	private String sbaAnalysis9;
	private String sbaAnalysis10;
	private String sbaAnalysis11;
	private String sbaAnalysis12;
	private String sbaAnalysis13;
	private String sbaAnalysis14;
	private String sbaAnalysis15;
	private String sbaAnalysis16;
	private String sbaAnalysis17;
	private String sbaAnalysis18;
	private String sbaAnalysis19;
	private String sbaAnalysis20;
	private String sbaAnalysis21;
	private String sbaAnalysis22;
	private String sbaAnalysis23;
	private String sbaAnalysis24;
	private String sbaAnalysis25;
	private String sbaAnalysis26;
	private String sbaAnalysis27;
	private String sbaAnalysis28;
	private String sbaAnalysis29;
	private String sbaAnalysis30;
	private String sbaComments;

	
	private static int[] fieldTypes = new int[]{
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER,
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
	
	public static final int  sbaSubscriberIdFilter = 0;

	public static final int  sbaIdNumberFilter = 1;
	public static final int  sbaIdNumberSize = 20;

	public static final int  sbaMatchcodeFilter = 2;
	public static final int  sbaMatchcodeSize = 20; 

	public static final int  sbaMarketingFilter = 3;
	public static final int  sbaMarketingSize = 1; 

	public static final int  sbaThirdPartyFilter = 4;
	public static final int  sbaThirdPartySize = 1; 

	public static final int  sbaCustdeptFilter = 5;
	public static final int  sbaCustdeptSize = 10;

	public static final int  sbaDealerIdFilter = 6;
	public static final int  sbaDealerIdSize = 8;

	public static final int  sbaDepartmentFilter = 7;
	public static final int  sbaDepartmentSize = 10; 

	public static final int  sbaSalesmanFilter = 8;
	public static final int  sbaSalesmanSize = 10;

	public static final int  sbaRegionFilter = 9;
	public static final int  sbaRegionSize = 6;

	public static final int  sbaInvoiceAddridFilter = 10;

	public static final int  sbaInvAccountFilter = 11;
	public static final int  sbaInvAccountSize = 8;

	public static final int  sbaPrepaidStatFilter = 12;
	public static final int  sbaPrepaidStatSize = 2;

	public static final int  sbaAnalysis1Filter = 13;
	public static final int  sbaAnalysis1Size = 30;

	public static final int  sbaAnalysis2Filter = 14;
	public static final int  sbaAnalysis2Size = 30;

	public static final int  sbaAnalysis3Filter = 15;
	public static final int  sbaAnalysis3Size = 30;

	public static final int  sbaAnalysis4Filter = 16;
	public static final int  sbaAnalysis4Size = 30;

	public static final int  sbaAnalysis5Filter = 17;
	public static final int  sbaAnalysis5Size = 30;

	public static final int  sbaAnalysis6Filter = 18;
	public static final int  sbaAnalysis6Size = 30;

	public static final int  sbaAnalysis7Filter = 19;
	public static final int  sbaAnalysis7Size = 30;

	public static final int  sbaAnalysis8Filter = 20;
	public static final int  sbaAnalysis8Size = 30;

	public static final int  sbaAnalysis9Filter = 21;
	public static final int  sbaAnalysis9Size = 30;

	public static final int  sbaAnalysis10Filter = 22;
	public static final int  sbaAnalysis10Size = 30;

	public static final int  sbaAnalysis11Filter = 23;
	public static final int  sbaAnalysis11Size = 30;

	public static final int  sbaAnalysis12Filter = 24;
	public static final int  sbaAnalysis12Size = 30;

	public static final int  sbaAnalysis13Filter = 25;
	public static final int  sbaAnalysis13Size = 30;

	public static final int  sbaAnalysis14Filter = 26;
	public static final int  sbaAnalysis14Size = 30;

	public static final int  sbaAnalysis15Filter = 27;
	public static final int  sbaAnalysis15Size = 30;

	public static final int  sbaAnalysis16Filter = 28;
	public static final int  sbaAnalysis16Size = 30;

	public static final int  sbaAnalysis17Filter = 29;
	public static final int  sbaAnalysis17Size = 30;

	public static final int  sbaAnalysis18Filter = 30;
	public static final int  sbaAnalysis18Size = 30;

	public static final int  sbaAnalysis19Filter = 31;
	public static final int  sbaAnalysis19Size = 30;

	public static final int  sbaAnalysis20Filter = 32;
	public static final int  sbaAnalysis20Size = 30;

	public static final int  sbaAnalysis21Filter = 33;
	public static final int  sbaAnalysis21Size = 30;

	public static final int  sbaAnalysis22Filter = 34;
	public static final int  sbaAnalysis22Size = 30;

	public static final int  sbaAnalysis23Filter = 35;
	public static final int  sbaAnalysis23Size = 30;

	public static final int  sbaAnalysis24Filter = 36;
	public static final int  sbaAnalysis24Size = 30;

	public static final int  sbaAnalysis25Filter = 37;
	public static final int  sbaAnalysis25Size = 30;

	public static final int  sbaAnalysis26Filter = 38;
	public static final int  sbaAnalysis26Size = 30;

	public static final int  sbaAnalysis27Filter = 39;
	public static final int  sbaAnalysis27Size = 30;

	public static final int  sbaAnalysis28Filter = 40;
	public static final int  sbaAnalysis28Size = 50;

	public static final int  sbaAnalysis29Filter = 41;
	public static final int  sbaAnalysis29Size = 30;

	public static final int  sbaAnalysis30Filter = 42;
	public static final int  sbaAnalysis30Size = 30;

	public static final int  sbaCommentsFilter = 43;
	public static final int  sbaCommentsSize = 50;
	
	private static int[] fieldSizes = new int[] {
		0,
		sbaIdNumberSize,
		sbaMatchcodeSize, 
		sbaMarketingSize,
		sbaThirdPartySize, 
		sbaCustdeptSize,
		sbaDealerIdSize,
		sbaDepartmentSize,
		sbaSalesmanSize,
		sbaRegionSize,
		0,
		sbaInvAccountSize,
		sbaPrepaidStatSize,
		sbaAnalysis1Size,
		sbaAnalysis2Size,
		sbaAnalysis3Size,
		sbaAnalysis4Size,
		sbaAnalysis5Size,
		sbaAnalysis6Size,
		sbaAnalysis7Size,
		sbaAnalysis8Size,
		sbaAnalysis9Size,
		sbaAnalysis10Size,
		sbaAnalysis11Size,
		sbaAnalysis12Size,
		sbaAnalysis13Size,
		sbaAnalysis14Size,
		sbaAnalysis15Size,
		sbaAnalysis16Size,
		sbaAnalysis17Size,
		sbaAnalysis18Size,
		sbaAnalysis19Size,
		sbaAnalysis20Size,
		sbaAnalysis21Size,
		sbaAnalysis22Size,
		sbaAnalysis23Size,
		sbaAnalysis24Size,
		sbaAnalysis25Size,
		sbaAnalysis26Size,
		sbaAnalysis27Size,
		sbaAnalysis28Size,
		sbaAnalysis29Size,
		sbaAnalysis30Size,
		sbaCommentsSize
	};

	public SbaSubAuxDMO(){
		
	}
	
	public SbaSubAuxDMO(final Integer sbaSubscriberId,
			final String sbaIdNumber,
			final String sbaMatchcode,
			final String sbaMarketing,
			final String sbaThirdParty,
			final String sbaCustdept,
			final String sbaDealerId,
			final String sbaDepartment,
			final String sbaSalesman,
			final String sbaRegion,
			final Integer sbaInvoiceAddrid,
			final String sbaInvAccount,
			final String sbaPrepaidStat,
			final String sbaAnalysis1,
			final String sbaAnalysis2,
			final String sbaAnalysis3,
			final String sbaAnalysis4,
			final String sbaAnalysis5,
			final String sbaAnalysis6,
			final String sbaAnalysis7,
			final String sbaAnalysis8,
			final String sbaAnalysis9,
			final String sbaAnalysis10,
			final String sbaAnalysis11,
			final String sbaAnalysis12,
			final String sbaAnalysis13,
			final String sbaAnalysis14,
			final String sbaAnalysis15,
			final String sbaAnalysis16,
			final String sbaAnalysis17,
			final String sbaAnalysis18,
			final String sbaAnalysis19,
			final String sbaAnalysis20,
			final String sbaAnalysis21,
			final String sbaAnalysis22,
			final String sbaAnalysis23,
			final String sbaAnalysis24,
			final String sbaAnalysis25,
			final String sbaAnalysis26,
			final String sbaAnalysis27,
			final String sbaAnalysis28,
			final String sbaAnalysis29,
			final String sbaAnalysis30,
			final String sbaComments){
		this.sbaSubscriberId = sbaSubscriberId;
		this.sbaIdNumber = sbaIdNumber;
		this.sbaMatchcode = sbaMatchcode;
		this.sbaMarketing = sbaMarketing;
		this.sbaThirdParty = sbaThirdParty;
		this.sbaCustdept = sbaCustdept;
		this.sbaDealerId = sbaDealerId;
		this.sbaDepartment = sbaDepartment;
		this.sbaSalesman = sbaSalesman;
		this.sbaRegion = sbaRegion;
		this.sbaInvoiceAddrid = sbaInvoiceAddrid;
		this.sbaInvAccount = sbaInvAccount;
		this.sbaPrepaidStat = sbaPrepaidStat;
		this.sbaAnalysis1 = sbaAnalysis1;
		this.sbaAnalysis2 = sbaAnalysis2;
		this.sbaAnalysis3 = sbaAnalysis3;
		this.sbaAnalysis4 = sbaAnalysis4;
		this.sbaAnalysis5 = sbaAnalysis5;
		this.sbaAnalysis6 = sbaAnalysis6;
		this.sbaAnalysis7 = sbaAnalysis7;
		this.sbaAnalysis8 = sbaAnalysis8;
		this.sbaAnalysis9 = sbaAnalysis9;
		this.sbaAnalysis10 = sbaAnalysis10;
		this.sbaAnalysis11 = sbaAnalysis11;
		this.sbaAnalysis12 = sbaAnalysis12;
		this.sbaAnalysis13 = sbaAnalysis13;
		this.sbaAnalysis14 = sbaAnalysis14;
		this.sbaAnalysis15 = sbaAnalysis15;
		this.sbaAnalysis16 = sbaAnalysis16;
		this.sbaAnalysis17 = sbaAnalysis17;
		this.sbaAnalysis18 = sbaAnalysis18;
		this.sbaAnalysis19 = sbaAnalysis19;
		this.sbaAnalysis20 = sbaAnalysis20;
		this.sbaAnalysis21 = sbaAnalysis21;
		this.sbaAnalysis22 = sbaAnalysis22;
		this.sbaAnalysis23 = sbaAnalysis23;
		this.sbaAnalysis24 = sbaAnalysis24;
		this.sbaAnalysis25 = sbaAnalysis25;
		this.sbaAnalysis26 = sbaAnalysis26;
		this.sbaAnalysis27 = sbaAnalysis27;
		this.sbaAnalysis28 = sbaAnalysis28;
		this.sbaAnalysis29 = sbaAnalysis29;
		this.sbaAnalysis30 = sbaAnalysis30;
		this.sbaComments = sbaComments;
	}
	
	protected void generatedKey(Integer key) {

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
		return new DAOArgs( 1 ).arg( ( this.sbaSubscriberId == null ) ? null
                : this.sbaSubscriberId);
	}

	protected Object[] get() {
		 return new Object[] {
				 sbaSubscriberId,
				 (sbaIdNumber == null ) ? null : ( ( sbaIdNumber.length(  ) <= sbaIdNumberSize ) ? sbaIdNumber 
				       : sbaIdNumber.substring( 0, sbaIdNumberSize ) // auto trimmed to fit, if required.
				       ),
				 
				 (sbaMatchcode == null ) ? null : ( ( sbaMatchcode.length(  ) <= sbaMatchcodeSize ) ? sbaMatchcode 
				       : sbaMatchcode.substring( 0, sbaMatchcodeSize ) // auto trimmed to fit, if required.
				       ), 
				 
				 (sbaMarketing == null ) ? null : ( ( sbaMarketing.length(  ) <= sbaMarketingSize ) ? sbaMarketing 
				       : sbaMarketing.substring( 0, sbaMarketingSize ) // auto trimmed to fit, if required.
				       ),
				
				 (sbaThirdParty == null ) ? null : ( ( sbaThirdParty.length(  ) <= sbaThirdPartySize ) ? sbaThirdParty 
				       : sbaThirdParty.substring( 0, sbaThirdPartySize ) // auto trimmed to fit, if required.
				       ), 

				 (sbaCustdept == null ) ? null : ( ( sbaCustdept.length(  ) <= sbaCustdeptSize ) ? sbaCustdept 
				       : sbaCustdept.substring( 0, sbaCustdeptSize ) // auto trimmed to fit, if required.
				       ),

				 (sbaDealerId == null ) ? null : ( ( sbaDealerId.length(  ) <= sbaDealerIdSize ) ? sbaDealerId 
				       : sbaDealerId.substring( 0, sbaDealerIdSize ) // auto trimmed to fit, if required.
				       ),

				 (sbaDepartment == null ) ? null : ( ( sbaDepartment.length(  ) <= sbaDepartmentSize ) ? sbaDepartment 
				       : sbaDepartment.substring( 0, sbaDepartmentSize ) // auto trimmed to fit, if required.
				       ),

				 (sbaSalesman == null ) ? null : ( ( sbaSalesman.length(  ) <= sbaSalesmanSize ) ? sbaSalesman 
				       : sbaSalesman.substring( 0, sbaSalesmanSize ) // auto trimmed to fit, if required.
				       ),

				 (sbaRegion == null ) ? null : ( ( sbaRegion.length(  ) <= sbaRegionSize ) ? sbaRegion 
				       : sbaRegion.substring( 0, sbaRegionSize ) // auto trimmed to fit, if required.
				       ),

				 sbaInvoiceAddrid,

				 (sbaInvAccount == null ) ? null : ( ( sbaInvAccount.length(  ) <= sbaInvAccountSize ) ? sbaInvAccount 
				       : sbaInvAccount.substring( 0, sbaInvAccountSize ) // auto trimmed to fit, if required.
				       ),

				 (sbaPrepaidStat == null ) ? null : ( ( sbaPrepaidStat.length(  ) <= sbaPrepaidStatSize ) ? sbaPrepaidStat 
				       : sbaPrepaidStat.substring( 0, sbaPrepaidStatSize ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis1 == null ) ? null : ( ( sbaAnalysis1.length(  ) <= sbaAnalysis1Size ) ? sbaAnalysis2 
				       : sbaAnalysis1.substring( 0, sbaAnalysis1Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis2 == null ) ? null : ( ( sbaAnalysis2.length(  ) <= sbaAnalysis2Size ) ? sbaAnalysis2
				       : sbaAnalysis2.substring( 0, sbaAnalysis2Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis3 == null ) ? null : ( ( sbaAnalysis3.length(  ) <= sbaAnalysis3Size ) ? sbaAnalysis3
				       : sbaAnalysis3.substring( 0, sbaAnalysis3Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis4 == null ) ? null : ( ( sbaAnalysis4.length(  ) <= sbaAnalysis4Size ) ? sbaAnalysis4
				       : sbaAnalysis4.substring( 0, sbaAnalysis4Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis5 == null ) ? null : ( ( sbaAnalysis5.length(  ) <= sbaAnalysis5Size ) ? sbaAnalysis5
				       : sbaAnalysis5.substring( 0, sbaAnalysis5Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis6 == null ) ? null : ( ( sbaAnalysis6.length(  ) <= sbaAnalysis6Size ) ? sbaAnalysis6
				       : sbaAnalysis6.substring( 0, sbaAnalysis6Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis7 == null ) ? null : ( ( sbaAnalysis7.length(  ) <= sbaAnalysis7Size ) ? sbaAnalysis7
				       : sbaAnalysis7.substring( 0, sbaAnalysis7Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis8 == null ) ? null : ( ( sbaAnalysis8.length(  ) <= sbaAnalysis8Size ) ? sbaAnalysis8
				       : sbaAnalysis8.substring( 0, sbaAnalysis8Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis9 == null ) ? null : ( ( sbaAnalysis9.length(  ) <= sbaAnalysis9Size ) ? sbaAnalysis9
				       : sbaAnalysis9.substring( 0, sbaAnalysis9Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis10 == null ) ? null : ( ( sbaAnalysis10.length(  ) <= sbaAnalysis10Size ) ? sbaAnalysis10
				       : sbaAnalysis10.substring( 0, sbaAnalysis10Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis11 == null ) ? null : ( ( sbaAnalysis11.length(  ) <= sbaAnalysis11Size ) ? sbaAnalysis11
				       : sbaAnalysis11.substring( 0, sbaAnalysis11Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis12 == null ) ? null : ( ( sbaAnalysis12.length(  ) <= sbaAnalysis12Size ) ? sbaAnalysis12
				       : sbaAnalysis12.substring( 0, sbaAnalysis12Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis13 == null ) ? null : ( ( sbaAnalysis13.length(  ) <= sbaAnalysis13Size ) ? sbaAnalysis13
				       : sbaAnalysis13.substring( 0, sbaAnalysis13Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis14 == null ) ? null : ( ( sbaAnalysis14.length(  ) <= sbaAnalysis14Size ) ? sbaAnalysis14
				       : sbaAnalysis14.substring( 0, sbaAnalysis14Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis15 == null ) ? null : ( ( sbaAnalysis15.length(  ) <= sbaAnalysis15Size ) ? sbaAnalysis15
				       : sbaAnalysis15.substring( 0, sbaAnalysis15Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis16 == null ) ? null : ( ( sbaAnalysis16.length(  ) <= sbaAnalysis16Size ) ? sbaAnalysis16
				       : sbaAnalysis16.substring( 0, sbaAnalysis16Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis17 == null ) ? null : ( ( sbaAnalysis17.length(  ) <= sbaAnalysis17Size ) ? sbaAnalysis17
				       : sbaAnalysis17.substring( 0, sbaAnalysis17Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis18 == null ) ? null : ( ( sbaAnalysis18.length(  ) <= sbaAnalysis18Size ) ? sbaAnalysis18
				       : sbaAnalysis18.substring( 0, sbaAnalysis18Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis19 == null ) ? null : ( ( sbaAnalysis19.length(  ) <= sbaAnalysis19Size ) ? sbaAnalysis19
				       : sbaAnalysis19.substring( 0, sbaAnalysis19Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis20 == null ) ? null : ( ( sbaAnalysis20.length(  ) <= sbaAnalysis20Size ) ? sbaAnalysis20
				       : sbaAnalysis20.substring( 0, sbaAnalysis20Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis21 == null ) ? null : ( ( sbaAnalysis21.length(  ) <= sbaAnalysis21Size ) ? sbaAnalysis21
				       : sbaAnalysis21.substring( 0, sbaAnalysis21Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis22 == null ) ? null : ( ( sbaAnalysis22.length(  ) <= sbaAnalysis22Size ) ? sbaAnalysis22
				       : sbaAnalysis22.substring( 0, sbaAnalysis22Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis23 == null ) ? null : ( ( sbaAnalysis23.length(  ) <= sbaAnalysis23Size ) ? sbaAnalysis23
				       : sbaAnalysis23.substring( 0, sbaAnalysis23Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis24 == null ) ? null : ( ( sbaAnalysis24.length(  ) <= sbaAnalysis24Size ) ? sbaAnalysis24
				       : sbaAnalysis24.substring( 0, sbaAnalysis24Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis25 == null ) ? null : ( ( sbaAnalysis25.length(  ) <= sbaAnalysis25Size ) ? sbaAnalysis25
				       : sbaAnalysis25.substring( 0, sbaAnalysis25Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis26 == null ) ? null : ( ( sbaAnalysis26.length(  ) <= sbaAnalysis26Size ) ? sbaAnalysis26
				       : sbaAnalysis26.substring( 0, sbaAnalysis26Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis27 == null ) ? null : ( ( sbaAnalysis27.length(  ) <= sbaAnalysis27Size ) ? sbaAnalysis27
				       : sbaAnalysis27.substring( 0, sbaAnalysis27Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis28 == null ) ? null : ( ( sbaAnalysis28.length(  ) <= sbaAnalysis28Size ) ? sbaAnalysis28
				       : sbaAnalysis28.substring( 0, sbaAnalysis28Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis29 == null ) ? null : ( ( sbaAnalysis29.length(  ) <= sbaAnalysis29Size ) ? sbaAnalysis29
				       : sbaAnalysis29.substring( 0, sbaAnalysis29Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaAnalysis30 == null ) ? null : ( ( sbaAnalysis30.length(  ) <= sbaAnalysis30Size ) ? sbaAnalysis30
				       : sbaAnalysis30.substring( 0, sbaAnalysis30Size ) // auto trimmed to fit, if required.
				       ),

				 (sbaComments == null ) ? null : ( ( sbaComments.length(  ) <= sbaCommentsSize ) ? sbaComments 
				       : sbaComments.substring( 0, sbaCommentsSize ) // auto trimmed to fit, if required.
				       )
		 };
	}
	
	protected void set(Object[] fields) {
		sbaSubscriberId = (Integer) fields[0];
		sbaIdNumber = rtrim( (String) fields[1] );
		sbaMatchcode = rtrim( (String) fields[2] );
		sbaMarketing = rtrim( (String) fields[3] );
		sbaThirdParty = rtrim( (String) fields[4] );
		sbaCustdept = rtrim( (String) fields[5] );
		sbaDealerId = rtrim( (String) fields[6] );
		sbaDepartment = rtrim( (String) fields[7] );
		sbaSalesman = rtrim( (String) fields[8] );
		sbaRegion = rtrim( (String) fields[9] );
		sbaInvoiceAddrid = (Integer) fields[10];
		sbaInvAccount = rtrim( (String) fields[11] );
		sbaPrepaidStat = rtrim( (String) fields[12] );
		sbaAnalysis1 = rtrim( (String) fields[13] );
		sbaAnalysis2 = rtrim( (String) fields[14] );
		sbaAnalysis3 = rtrim( (String) fields[15] );
		sbaAnalysis4 = rtrim( (String) fields[16] );
		sbaAnalysis5 = rtrim( (String) fields[17] );
		sbaAnalysis6 = rtrim( (String) fields[18] );
		sbaAnalysis7 = rtrim( (String) fields[19] );
		sbaAnalysis8 = rtrim( (String) fields[20] );
		sbaAnalysis9 = rtrim( (String) fields[21] );
		sbaAnalysis10 = rtrim( (String) fields[22] );
		sbaAnalysis11 = rtrim( (String) fields[23] );
		sbaAnalysis12 = rtrim( (String) fields[24] );
		sbaAnalysis13 = rtrim( (String) fields[25] );
		sbaAnalysis14 = rtrim( (String) fields[26] );
		sbaAnalysis15 = rtrim( (String) fields[27] );
		sbaAnalysis16 = rtrim( (String) fields[28] );
		sbaAnalysis17 = rtrim( (String) fields[29] );
		sbaAnalysis18 = rtrim( (String) fields[30] );
		sbaAnalysis19 = rtrim( (String) fields[31] );
		sbaAnalysis20 = rtrim( (String) fields[32] );
		sbaAnalysis21 = rtrim( (String) fields[33] );
		sbaAnalysis22 = rtrim( (String) fields[34] );
		sbaAnalysis23 = rtrim( (String) fields[35] );
		sbaAnalysis24 = rtrim( (String) fields[36] );
		sbaAnalysis25 = rtrim( (String) fields[37] );
		sbaAnalysis26 = rtrim( (String) fields[38] );
		sbaAnalysis27 = rtrim( (String) fields[39] );
		sbaAnalysis28 = rtrim( (String) fields[40] );
		sbaAnalysis29 = rtrim( (String) fields[41] );
		sbaAnalysis30 = rtrim( (String) fields[42] );
		sbaComments = rtrim( (String) fields[43] );
	}

	public Integer getSbaSubscriberId() {
		return sbaSubscriberId;
	}

	public void setSbaSubscriberId(Integer sbaSubscriberId) {
		this.sbaSubscriberId = sbaSubscriberId;
	}

	public String getSbaIdNumber() {
		return sbaIdNumber;
	}

	public void setSbaIdNumber(String sbaIdNumber) {
		this.sbaIdNumber = this.getPadded(sbaIdNumber, sbaIdNumberSize);
	}

	public String getSbaMatchcode() {
		return sbaMatchcode;
	}

	public void setSbaMatchcode(String sbaMatchcode) {
		this.sbaMatchcode = this.getPadded(sbaMatchcode, sbaMatchcodeSize);
	}

	public String getSbaMarketing() {
		return sbaMarketing;
	}

	public void setSbaMarketing(String sbaMarketing) {
		this.sbaMarketing = this.getPadded(sbaMarketing, sbaMarketingSize);
	}

	public String getSbaThirdParty() {
		return sbaThirdParty;
	}

	public void setSbaThirdParty(String sbaThirdParty) {
		this.sbaThirdParty = this.getPadded(sbaThirdParty, sbaThirdPartySize);
	}

	public String getSbaCustdept() {
		return sbaCustdept;
	}

	public void setSbaCustdept(String sbaCustdept) {
		this.sbaCustdept = this.getPadded(sbaCustdept, sbaCustdeptSize);
	}

	public String getSbaDealerId() {
		return sbaDealerId;
	}

	public void setSbaDealerId(String sbaDealerId) {
		this.sbaDealerId = this.getPadded(sbaDealerId, sbaDealerIdSize);
	}

	public String getSbaDepartment() {
		return sbaDepartment;
	}

	public void setSbaDepartment(String sbaDepartment) {
		this.sbaDepartment = this.getPadded(sbaDepartment, sbaDepartmentSize);
	}

	public String getSbaSalesman() {
		return sbaSalesman;
	}

	public void setSbaSalesman(String sbaSalesman) {
		this.sbaSalesman = this.getPadded(sbaSalesman, sbaSalesmanSize);
	}

	public String getSbaRegion() {
		return sbaRegion;
	}

	public void setSbaRegion(String sbaRegion) {
		this.sbaRegion = this.getPadded(sbaRegion, sbaRegionSize);
	}

	public Integer getSbaInvoiceAddrid() {
		return sbaInvoiceAddrid;
	}

	public void setSbaInvoiceAddrid(Integer sbaInvoiceAddrid) {
		this.sbaInvoiceAddrid = sbaInvoiceAddrid;
	}

	public String getSbaInvAccount() {
		return sbaInvAccount;
	}

	public void setSbaInvAccount(String sbaInvAccount) {
		this.sbaInvAccount = this.getPadded(sbaInvAccount, sbaInvAccountSize);
	}

	public String getSbaPrepaidStat() {
		return sbaPrepaidStat;
	}

	public void setSbaPrepaidStat(String sbaPrepaidStat) {
		this.sbaPrepaidStat = this.getPadded(sbaPrepaidStat, sbaPrepaidStatSize);
	}

	public String getSbaAnalysis1() {
		return sbaAnalysis1;
	}

	public void setSbaAnalysis1(String sbaAnalysis1) {
		this.sbaAnalysis1 = this.getPadded(sbaAnalysis1, sbaAnalysis1Size);
	}

	public String getSbaAnalysis2() {
		return sbaAnalysis2;
	}

	public void setSbaAnalysis2(String sbaAnalysis2) {
		this.sbaAnalysis2 = this.getPadded(sbaAnalysis2, sbaAnalysis2Size);
	}

	public String getSbaAnalysis3() {
		return sbaAnalysis3;
	}

	public void setSbaAnalysis3(String sbaAnalysis3) {
		this.sbaAnalysis3 = this.getPadded(sbaAnalysis3, sbaAnalysis3Size);
	}

	public String getSbaAnalysis4() {
		return sbaAnalysis4;
	}

	public void setSbaAnalysis4(String sbaAnalysis4) {
		this.sbaAnalysis4 = this.getPadded(sbaAnalysis4, sbaAnalysis4Size);
	}

	public String getSbaAnalysis5() {
		return sbaAnalysis5;
	}

	public void setSbaAnalysis5(String sbaAnalysis5) {
		this.sbaAnalysis5 = this.getPadded(sbaAnalysis5, sbaAnalysis5Size);
	}

	public String getSbaAnalysis6() {
		return sbaAnalysis6;
	}

	public void setSbaAnalysis6(String sbaAnalysis6) {
		this.sbaAnalysis6 = this.getPadded(sbaAnalysis6, sbaAnalysis6Size);
	}

	public String getSbaAnalysis7() {
		return sbaAnalysis7;
	}

	public void setSbaAnalysis7(String sbaAnalysis7) {
		this.sbaAnalysis7 = this.getPadded(sbaAnalysis7, sbaAnalysis7Size);
	}

	public String getSbaAnalysis8() {
		return sbaAnalysis8;
	}

	public void setSbaAnalysis8(String sbaAnalysis8) {
		this.sbaAnalysis8 = this.getPadded(sbaAnalysis8, sbaAnalysis8Size);
	}

	public String getSbaAnalysis9() {
		return sbaAnalysis9;
	}

	public void setSbaAnalysis9(String sbaAnalysis9) {
		this.sbaAnalysis9 = this.getPadded(sbaAnalysis9, sbaAnalysis9Size);
	}

	public String getSbaAnalysis10() {
		return sbaAnalysis10;
	}

	public void setSbaAnalysis10(String sbaAnalysis10) {
		this.sbaAnalysis10 = this.getPadded(sbaAnalysis10, sbaAnalysis10Size);
	}

	public String getSbaAnalysis11() {
		return sbaAnalysis11;
	}

	public void setSbaAnalysis11(String sbaAnalysis11) {
		this.sbaAnalysis11 = this.getPadded(sbaAnalysis11, sbaAnalysis11Size);
	}

	public String getSbaAnalysis12() {
		return sbaAnalysis12;
	}

	public void setSbaAnalysis12(String sbaAnalysis12) {
		this.sbaAnalysis12 = this.getPadded(sbaAnalysis12, sbaAnalysis12Size);
	}

	public String getSbaAnalysis13() {
		return sbaAnalysis13;
	}

	public void setSbaAnalysis13(String sbaAnalysis13) {
		this.sbaAnalysis13 = this.getPadded(sbaAnalysis13, sbaAnalysis13Size);
	}

	public String getSbaAnalysis14() {
		return sbaAnalysis14;
	}

	public void setSbaAnalysis14(String sbaAnalysis14) {
		this.sbaAnalysis14 = this.getPadded(sbaAnalysis14, sbaAnalysis14Size);
	}

	public String getSbaAnalysis15() {
		return sbaAnalysis15;
	}

	public void setSbaAnalysis15(String sbaAnalysis15) {
		this.sbaAnalysis15 = this.getPadded(sbaAnalysis15, sbaAnalysis15Size);
	}

	public String getSbaAnalysis16() {
		return sbaAnalysis16;
	}

	public void setSbaAnalysis16(String sbaAnalysis16) {
		this.sbaAnalysis16 = this.getPadded(sbaAnalysis16, sbaAnalysis16Size);
	}

	public String getSbaAnalysis17() {
		return sbaAnalysis17;
	}

	public void setSbaAnalysis17(String sbaAnalysis17) {
		this.sbaAnalysis17 = this.getPadded(sbaAnalysis17, sbaAnalysis17Size);
	}

	public String getSbaAnalysis18() {
		return sbaAnalysis18;
	}

	public void setSbaAnalysis18(String sbaAnalysis18) {
		this.sbaAnalysis18 = this.getPadded(sbaAnalysis18, sbaAnalysis18Size);
	}

	public String getSbaAnalysis19() {
		return sbaAnalysis19;
	}

	public void setSbaAnalysis19(String sbaAnalysis19) {
		this.sbaAnalysis19 = this.getPadded(sbaAnalysis19, sbaAnalysis19Size);
	}

	public String getSbaAnalysis20() {
		return sbaAnalysis20;
	}

	public void setSbaAnalysis20(String sbaAnalysis20) {
		this.sbaAnalysis20 = this.getPadded(sbaAnalysis20, sbaAnalysis20Size);
	}

	public String getSbaAnalysis21() {
		return sbaAnalysis21;
	}

	public void setSbaAnalysis21(String sbaAnalysis21) {
		this.sbaAnalysis21 = this.getPadded(sbaAnalysis21, sbaAnalysis21Size);
	}

	public String getSbaAnalysis22() {
		return sbaAnalysis22;
	}

	public void setSbaAnalysis22(String sbaAnalysis22) {
		this.sbaAnalysis22 = this.getPadded(sbaAnalysis22, sbaAnalysis22Size);
	}

	public String getSbaAnalysis23() {
		return sbaAnalysis23;
	}

	public void setSbaAnalysis23(String sbaAnalysis23) {
		this.sbaAnalysis23 = this.getPadded(sbaAnalysis23, sbaAnalysis23Size);
	}

	public String getSbaAnalysis24() {
		return sbaAnalysis24;
	}

	public void setSbaAnalysis24(String sbaAnalysis24) {
		this.sbaAnalysis24 = this.getPadded(sbaAnalysis24, sbaAnalysis24Size);
	}

	public String getSbaAnalysis25() {
		return sbaAnalysis25;
	}

	public void setSbaAnalysis25(String sbaAnalysis25) {
		this.sbaAnalysis25 = this.getPadded(sbaAnalysis25, sbaAnalysis25Size);
	}

	public String getSbaAnalysis26() {
		return sbaAnalysis26;
	}

	public void setSbaAnalysis26(String sbaAnalysis26) {
		this.sbaAnalysis26 = this.getPadded(sbaAnalysis26, sbaAnalysis26Size);
	}

	public String getSbaAnalysis27() {
		return sbaAnalysis27;
	}

	public void setSbaAnalysis27(String sbaAnalysis27) {
		this.sbaAnalysis27 = this.getPadded(sbaAnalysis27, sbaAnalysis27Size);
	}

	public String getSbaAnalysis28() {
		return sbaAnalysis28;
	}

	public void setSbaAnalysis28(String sbaAnalysis28) {
		this.sbaAnalysis28 = this.getPadded(sbaAnalysis28, sbaAnalysis28Size);
	}

	public String getSbaAnalysis29() {
		return sbaAnalysis29;
	}

	public void setSbaAnalysis29(String sbaAnalysis29) {
		this.sbaAnalysis29 = this.getPadded(sbaAnalysis29, sbaAnalysis29Size);
	}

	public String getSbaAnalysis30() {
		return sbaAnalysis30;
	}

	public void setSbaAnalysis30(String sbaAnalysis30) {
		this.sbaAnalysis30 = this.getPadded(sbaAnalysis30, sbaAnalysis30Size);
	}

	public String getSbaComments() {
		return sbaComments;
	}

	public void setSbaComments(String sbaComments) {
		this.sbaComments = this.getPadded(sbaComments, sbaCommentsSize);
	}
}