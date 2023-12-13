package com.eppixcomm.eppix.base.dml;

public class DpfDefPocFolderAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected DpfDefPocFolderAbstractDMLFactory(  )
	    throws DMLException {
	    ;

	    
	    DMLTable table = defTable( "DpfDefPocFolder", // dmlName
	            "blo.DpfDefPocFolderDMO", // dmoName
	            "DPF_DEF_POC_FOLDER", // tableName
	            14, // numColumns
	            "DPF_EH_ID,DPF_NAME,DPF_FOLDER_ID SERIAL,DPF_STATUS,DPF_CREATION_DATE,DPF_CONNECT_DATE,DPF_N2N_FOLDER,DPF_MSISDN_NO,DPF_SIM_NO,DPF_PRODUCT,DPF_REVERSE_BILL"
	            + ", DOT_SUB_REQD, DOT_INV_REQD, DOT_REASON_TYPE, DOT_REASON_CODE, DOT_MANIPULATE", // columnList
	            "DPF_FOLDER_ID", //primaryKey
	            "" // versionCol     
	          , false, // generatedKey
	            "DPF_EH_ID,DPF_NAME,DPF_FOLDER_ID SERIAL,DPF_STATUS,DPF_CREATION_DATE,DPF_CONNECT_DATE,DPF_N2N_FOLDER,DPF_MSISDN_NO,DPF_SIM_NO,DPF_PRODUCT,DPF_REVERSE_BILL",
	            "", "",
	            new String[] {
	    		"DPF_EH_ID",
	    		"DPF_NAME",
	    		"DPF_FOLDER_ID SERIAL",
	    		"DPF_STATUS",
	    		"DPF_CREATION_DATE",
	    		"DPF_CONNECT_DATE",
	    		"DPF_N2N_FOLDER",
	    		"DPF_MSISDN_NO",
	    		"DPF_SIM_NO",
	    		"DPF_PRODUCT",
	    		"DPF_REVERSE_BILL"
	            } );
	    
	    table.addFilterBy( "equalDpfEhId", /* PK attribute */
	"DPF_EH_ID = ? ")
	     .addFilterBy( "filterByDpfEhIdMatch", "DPF_EH_ID LIKE ?")
	     .addFilterBy( "INDpfEhId","DPF_EH_ID IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfEhId","DPF_EH_ID NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfEhId","DPF_EH_ID != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfEhId",   "(DPF_EH_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfEhId","DPF_EH_ID IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfEhId","DPF_EH_ID < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfEhId","DPF_EH_ID > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfEhIdMatch","DPF_EH_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfEhId",
	  "(DPF_EH_ID = ? OR DPF_EH_ID IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfEhId asc", "DPF_EH_ID ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfEhId desc", "DPF_EH_ID DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfName", /* PK attribute */
	"DPF_NAME = ? ")
	     .addFilterBy( "filterByDpfNameMatch", "DPF_NAME LIKE ?")
	     .addFilterBy( "INDpfName","DPF_NAME IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfName","DPF_NAME NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfName","DPF_NAME != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfName",   "(DPF_NAME IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfName","DPF_NAME IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfName","DPF_NAME < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfName","DPF_NAME > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfNameMatch","DPF_NAME LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfName",
	  "(DPF_NAME = ? OR DPF_NAME IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfName asc", "DPF_NAME ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfName desc", "DPF_NAME DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfFolderId", /* PK attribute */
	"DPF_FOLDER_ID SERIAL = ? ")
	     .addFilterBy( "filterByDpfFolderIdMatch", "DPF_FOLDER_ID SERIAL LIKE ?")
	     .addFilterBy( "INDpfFolderId","DPF_FOLDER_ID SERIAL IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfFolderId","DPF_FOLDER_ID SERIAL NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfFolderId","DPF_FOLDER_ID SERIAL != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfFolderId",   "(DPF_FOLDER_ID SERIAL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfFolderId","DPF_FOLDER_ID SERIAL IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfFolderId","DPF_FOLDER_ID SERIAL < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfFolderId","DPF_FOLDER_ID SERIAL > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfFolderIdMatch","DPF_FOLDER_ID SERIAL LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfFolderId",
	  "(DPF_FOLDER_ID SERIAL = ? OR DPF_FOLDER_ID SERIAL IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfFolderId asc", "DPF_FOLDER_ID SERIAL ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfFolderId desc", "DPF_FOLDER_ID SERIAL DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfStatus", /* PK attribute */
	"DPF_STATUS = ? ")
	     .addFilterBy( "filterByDpfStatusMatch", "DPF_STATUS LIKE ?")
	     .addFilterBy( "INDpfStatus","DPF_STATUS IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfStatus","DPF_STATUS NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfStatus","DPF_STATUS != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfStatus",   "(DPF_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfStatus","DPF_STATUS IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfStatus","DPF_STATUS < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfStatus","DPF_STATUS > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfStatusMatch","DPF_STATUS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfStatus",
	  "(DPF_STATUS = ? OR DPF_STATUS IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfStatus asc", "DPF_STATUS ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfStatus desc", "DPF_STATUS DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfCreationDate", /* PK attribute */
	"DPF_CREATION_DATE = ? ")
	     .addFilterBy( "filterByDpfCreationDateMatch", "DPF_CREATION_DATE LIKE ?")
	     .addFilterBy( "INDpfCreationDate","DPF_CREATION_DATE IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfCreationDate","DPF_CREATION_DATE NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfCreationDate","DPF_CREATION_DATE != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfCreationDate",   "(DPF_CREATION_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfCreationDate","DPF_CREATION_DATE IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfCreationDate","DPF_CREATION_DATE < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfCreationDate","DPF_CREATION_DATE > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfCreationDateMatch","DPF_CREATION_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfCreationDate",
	  "(DPF_CREATION_DATE = ? OR DPF_CREATION_DATE IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfCreationDate asc", "DPF_CREATION_DATE ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfCreationDate desc", "DPF_CREATION_DATE DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfConnectDate", /* PK attribute */
	"DPF_CONNECT_DATE = ? ")
	     .addFilterBy( "filterByDpfConnectDateMatch", "DPF_CONNECT_DATE LIKE ?")
	     .addFilterBy( "INDpfConnectDate","DPF_CONNECT_DATE IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfConnectDate","DPF_CONNECT_DATE NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfConnectDate","DPF_CONNECT_DATE != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfConnectDate",   "(DPF_CONNECT_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfConnectDate","DPF_CONNECT_DATE IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfConnectDate","DPF_CONNECT_DATE < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfConnectDate","DPF_CONNECT_DATE > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfConnectDateMatch","DPF_CONNECT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfConnectDate",
	  "(DPF_CONNECT_DATE = ? OR DPF_CONNECT_DATE IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfConnectDate asc", "DPF_CONNECT_DATE ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfConnectDate desc", "DPF_CONNECT_DATE DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfN2nFolder", /* PK attribute */
	"DPF_N2N_FOLDER = ? ")
	     .addFilterBy( "filterByDpfN2nFolderMatch", "DPF_N2N_FOLDER LIKE ?")
	     .addFilterBy( "INDpfN2nFolder","DPF_N2N_FOLDER IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfN2nFolder","DPF_N2N_FOLDER NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfN2nFolder","DPF_N2N_FOLDER != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfN2nFolder",   "(DPF_N2N_FOLDER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfN2nFolder","DPF_N2N_FOLDER IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfN2nFolder","DPF_N2N_FOLDER < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfN2nFolder","DPF_N2N_FOLDER > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfN2nFolderMatch","DPF_N2N_FOLDER LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfN2nFolder",
	  "(DPF_N2N_FOLDER = ? OR DPF_N2N_FOLDER IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfN2nFolder asc", "DPF_N2N_FOLDER ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfN2nFolder desc", "DPF_N2N_FOLDER DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfMsisdnNo", /* PK attribute */
	"DPF_MSISDN_NO = ? ")
	     .addFilterBy( "filterByDpfMsisdnNoMatch", "DPF_MSISDN_NO LIKE ?")
	     .addFilterBy( "INDpfMsisdnNo","DPF_MSISDN_NO IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfMsisdnNo","DPF_MSISDN_NO NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfMsisdnNo","DPF_MSISDN_NO != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfMsisdnNo",   "(DPF_MSISDN_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfMsisdnNo","DPF_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfMsisdnNo","DPF_MSISDN_NO < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfMsisdnNo","DPF_MSISDN_NO > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfMsisdnNoMatch","DPF_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfMsisdnNo",
	  "(DPF_MSISDN_NO = ? OR DPF_MSISDN_NO IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfMsisdnNo asc", "DPF_MSISDN_NO ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfMsisdnNo desc", "DPF_MSISDN_NO DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfSimNo", /* PK attribute */
	"DPF_SIM_NO = ? ")
	     .addFilterBy( "filterByDpfSimNoMatch", "DPF_SIM_NO LIKE ?")
	     .addFilterBy( "INDpfSimNo","DPF_SIM_NO IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfSimNo","DPF_SIM_NO NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfSimNo","DPF_SIM_NO != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfSimNo",   "(DPF_SIM_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfSimNo","DPF_SIM_NO IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfSimNo","DPF_SIM_NO < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfSimNo","DPF_SIM_NO > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfSimNoMatch","DPF_SIM_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfSimNo",
	  "(DPF_SIM_NO = ? OR DPF_SIM_NO IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfSimNo asc", "DPF_SIM_NO ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfSimNo desc", "DPF_SIM_NO DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfProduct", /* PK attribute */
	"DPF_PRODUCT = ? ")
	     .addFilterBy( "filterByDpfProductMatch", "DPF_PRODUCT LIKE ?")
	     .addFilterBy( "INDpfProduct","DPF_PRODUCT IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfProduct","DPF_PRODUCT NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfProduct","DPF_PRODUCT != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfProduct",   "(DPF_PRODUCT IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfProduct","DPF_PRODUCT IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfProduct","DPF_PRODUCT < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfProduct","DPF_PRODUCT > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfProductMatch","DPF_PRODUCT LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfProduct",
	  "(DPF_PRODUCT = ? OR DPF_PRODUCT IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfProduct asc", "DPF_PRODUCT ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfProduct desc", "DPF_PRODUCT DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalDpfReverseBill", /* PK attribute */
	"DPF_REVERSE_BILL = ? ")
	     .addFilterBy( "filterByDpfReverseBillMatch", "DPF_REVERSE_BILL LIKE ?")
	     .addFilterBy( "INDpfReverseBill","DPF_REVERSE_BILL IN ( ? ) ") // IN

	     .addFilterBy( "NOTINDpfReverseBill","DPF_REVERSE_BILL NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalDpfReverseBill","DPF_REVERSE_BILL != ?") // NOTEQUAL

	     .addFilterBy( "nullDpfReverseBill",   "(DPF_REVERSE_BILL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullDpfReverseBill","DPF_REVERSE_BILL IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanDpfReverseBill","DPF_REVERSE_BILL < ? ") // LESS THAN

	     .addFilterBy( "greaterthanDpfReverseBill","DPF_REVERSE_BILL > ? ") // GREATER THAN

	     .addFilterBy( "filterByDpfReverseBillMatch","DPF_REVERSE_BILL LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullDpfReverseBill",
	  "(DPF_REVERSE_BILL = ? OR DPF_REVERSE_BILL IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("DpfReverseBill asc", "DPF_REVERSE_BILL ASC ") // ORDER ASCENDING

	     .addOrderBy("DpfReverseBill desc", "DPF_REVERSE_BILL DESC ") // ORDER DESCENDING
	;
	;}
}