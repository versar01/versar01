package com.eppixcomm.eppix.base.dml;



public class PfsPocFldrSubsAbstractDMLFactory extends BaseDMLFactory {

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new DotDocTypeAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected PfsPocFldrSubsAbstractDMLFactory(  )
	    throws DMLException {
	    ;

	    DMLTable table = defTable( "PfsPocFldrSubs", // dmlName
	        "blo.PfsPocFldrSubsDMO", // dmoName
	        "PFS_POC_FLDR_SUBS", // tableName
	        14, // numColumns
	        "PFS_SUBSCRIBER_ID,PFS_FOLDER_ID,PFS_STATUS", // columnList
	        "PFS_SUBSCRIBER_ID", //primaryKey
	        "" // versionCol     
	      , false, // generatedKey
	        "PFS_SUBSCRIBER_ID,PFS_FOLDER_ID,PFS_STATUS",
	        "", "",
	        new String[] {
	    		"PFS_SUBSCRIBER_ID",
	    		"PFS_FOLDER_ID",
	    		"PFS_STATUS"
	        } );

	    
	    table.addFilterBy( "equalPfsSubscriberId", /* PK attribute */
	    "PFS_SUBSCRIBER_ID = ? ")
	         .addFilterBy( "filterByPfsSubscriberIdMatch", "PFS_SUBSCRIBER_ID LIKE ?")
	         .addFilterBy( "INPfsSubscriberId","PFS_SUBSCRIBER_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINPfsSubscriberId","PFS_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalPfsSubscriberId","PFS_SUBSCRIBER_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullPfsSubscriberId",   "(PFS_SUBSCRIBER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullPfsSubscriberId","PFS_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanPfsSubscriberId","PFS_SUBSCRIBER_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanPfsSubscriberId","PFS_SUBSCRIBER_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterByPfsSubscriberIdMatch","PFS_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullPfsSubscriberId",
	      "(PFS_SUBSCRIBER_ID = ? OR PFS_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("PfsSubscriberId asc", "PFS_SUBSCRIBER_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("PfsSubscriberId desc", "PFS_SUBSCRIBER_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalPfsFolderId", /* PK attribute */
	    "PFS_FOLDER_ID = ? ")
	         .addFilterBy( "filterByPfsFolderIdMatch", "PFS_FOLDER_ID LIKE ?")
	         .addFilterBy( "INPfsFolderId","PFS_FOLDER_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINPfsFolderId","PFS_FOLDER_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalPfsFolderId","PFS_FOLDER_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullPfsFolderId",   "(PFS_FOLDER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullPfsFolderId","PFS_FOLDER_ID IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanPfsFolderId","PFS_FOLDER_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanPfsFolderId","PFS_FOLDER_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterByPfsFolderIdMatch","PFS_FOLDER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullPfsFolderId",
	      "(PFS_FOLDER_ID = ? OR PFS_FOLDER_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("PfsFolderId asc", "PFS_FOLDER_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("PfsFolderId desc", "PFS_FOLDER_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalPfsStatus", /* PK attribute */
	    "PFS_STATUS = ? ")
	         .addFilterBy( "filterByPfsStatusMatch", "PFS_STATUS LIKE ?")
	         .addFilterBy( "INPfsStatus","PFS_STATUS IN ( ? ) ") // IN

	         .addFilterBy( "NOTINPfsStatus","PFS_STATUS NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalPfsStatus","PFS_STATUS != ?") // NOTEQUAL

	         .addFilterBy( "nullPfsStatus",   "(PFS_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullPfsStatus","PFS_STATUS IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanPfsStatus","PFS_STATUS < ? ") // LESS THAN

	         .addFilterBy( "greaterthanPfsStatus","PFS_STATUS > ? ") // GREATER THAN

	         .addFilterBy( "filterByPfsStatusMatch","PFS_STATUS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullPfsStatus",
	      "(PFS_STATUS = ? OR PFS_STATUS IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("PfsStatus asc", "PFS_STATUS ASC ") // ORDER ASCENDING

	         .addOrderBy("PfsStatus desc", "PFS_STATUS DESC ") // ORDER DESCENDING
	    ;
;}

}