package com.eppixcomm.eppix.base.dml;


public class NgsNetGroupServAbstractDMLFactory extends BaseDMLFactory{

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new NgsNetGroupServAbstractDMLFactory();
		}
		return dml;
	}	
	
	protected NgsNetGroupServAbstractDMLFactory() throws DMLException {
		
		DMLTable table = defTable( "NgsNetGroupServ", // dmlName
	            "blo.NgsNetGroupServDMO", // dmoName 
	            "NGS_NET_GROUP_SERV", // tableName
	            17, // numColumns
	            "NGS_CODE, NGS_NETWORK, NGS_NET_SERV_CODE, NGS_SEQUENCE, NGS_APPLY_TEXT, " +
	            "NGS_MODIFY_TEXT, NGS_REMOVE_TEXT, NGS_PARAM_NAME1, NGS_PARAM_VALUE1, " +
	            "NGS_PARAM_NAME2, NGS_PARAM_VALUE2, NGS_PARAM_NAME3, NGS_PARAM_VALUE3, " +
	            "NGS_PARAM_NAME4, NGS_PARAM_VALUE4, NGS_PARAM_NAME5, NGS_PARAM_VALUE5", // columnList
	            "NGS_CODE, NGS_NETWORK, NGS_NET_SERV_CODE, NGS_SEQUENCE", //primaryKey
	            "" // versionCol     
	          , false, // generatedKey
	          "NGS_CODE, NGS_NETWORK, NGS_NET_SERV_CODE, NGS_SEQUENCE, NGS_APPLY_TEXT, " +
	            "NGS_MODIFY_TEXT, NGS_REMOVE_TEXT, NGS_PARAM_NAME1, NGS_PARAM_VALUE1, " +
	            "NGS_PARAM_NAME2, NGS_PARAM_VALUE2, NGS_PARAM_NAME3, NGS_PARAM_VALUE3, " +
	            "NGS_PARAM_NAME4, NGS_PARAM_VALUE4, NGS_PARAM_NAME5, NGS_PARAM_VALUE5",
	            "", "",
	            new String[] {
				"NGS_CODE",	"NGS_NETWORK",
				"NGS_NET_SERV_CODE", "NGS_SEQUENCE",
				"NGS_APPLY_TEXT", "NGS_MODIFY_TEXT",
				"NGS_REMOVE_TEXT", "NGS_PARAM_NAME1",
				"NGS_PARAM_VALUE1", "NGS_PARAM_NAME2",
				"NGS_PARAM_VALUE2",	"NGS_PARAM_NAME3",
				"NGS_PARAM_VALUE3",	"NGS_PARAM_NAME4",
				"NGS_PARAM_VALUE4",	"NGS_PARAM_NAME5",
				"NGS_PARAM_VALUE5"
				},true );	
//==========================================================================================
	    table.addFilterBy( "equalNgsCode", "NGS_CODE = ?" ) // EQUAL

        .addFilterBy( "notequalNgsCode", "NGS_CODE != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsCode",
     "(NGS_CODE IS NULL OR NGS_CODE = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsCode", "NGS_CODE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsCode", "NGS_CODE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsCode", "NGS_CODE > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsCodeMatch", "NGS_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsCode",
     "NGS_CODE = ? OR NGS_CODE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsCode", "NGS_CODE IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsCode", "NGS_CODE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsCodeasc", "NGS_CODE ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsCodedesc", "NGS_CODE DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsNetwork", "NGS_NETWORK = ?" ) // EQUAL

        .addFilterBy( "notequalNgsNetwork", "NGS_NETWORK != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsNetwork",
     "(NGS_NETWORK IS NULL OR NGS_NETWORK = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsNetwork", "NGS_NETWORK IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsNetwork", "NGS_NETWORK < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsNetwork", "NGS_NETWORK > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsNetworkMatch", "NGS_NETWORK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsNetwork",
     "NGS_NETWORK = ? OR NGS_NETWORK IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsNetwork", "NGS_NETWORK IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsNetwork", "NGS_NETWORK NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsNetworkasc", "NGS_NETWORK ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsNetworkdesc", "NGS_NETWORK DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsNetServCode", "NGS_NET_SERV_CODE = ?" ) // EQUAL

        .addFilterBy( "notequalNgsNetServCode", "NGS_NET_SERV_CODE != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsNetServCode",
     "(NGS_NET_SERV_CODE IS NULL OR NGS_NET_SERV_CODE = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsNetServCode", "NGS_NET_SERV_CODE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsNetServCode", "NGS_NET_SERV_CODE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsNetServCode", "NGS_NET_SERV_CODE > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsNetServCodeMatch", "NGS_NET_SERV_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsNetServCode",
     "NGS_NET_SERV_CODE = ? OR NGS_NET_SERV_CODE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsNetServCode", "NGS_NET_SERV_CODE IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsNetServCode", "NGS_NET_SERV_CODE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsNetServCodeasc", "NGS_NET_SERV_CODE ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsNetServCodedesc", "NGS_NET_SERV_CODE DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsSequence", "NGS_SEQUENCE = ?" ) // EQUAL

        .addFilterBy( "notequalNgsSequence", "NGS_SEQUENCE != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsSequence",
     "(NGS_SEQUENCE IS NULL OR NGS_SEQUENCE = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsSequence", "NGS_SEQUENCE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsSequence", "NGS_SEQUENCE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsSequence", "NGS_SEQUENCE > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsSequenceMatch", "NGS_SEQUENCE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsSequence",
     "NGS_SEQUENCE = ? OR NGS_SEQUENCE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsSequence", "NGS_SEQUENCE IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsSequence", "NGS_SEQUENCE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsSequenceasc", "NGS_SEQUENCE ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsSequencedesc", "NGS_SEQUENCE DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsApplyText", "NGS_APPLY_TEXT = ?" ) // EQUAL

        .addFilterBy( "notequalNgsApplyText", "NGS_APPLY_TEXT != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsApplyText",
     "(NGS_APPLY_TEXT IS NULL OR NGS_APPLY_TEXT = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsApplyText", "NGS_APPLY_TEXT IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsApplyText", "NGS_APPLY_TEXT < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsApplyText", "NGS_APPLY_TEXT > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsApplyTextMatch", "NGS_APPLY_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsApplyText",
     "NGS_APPLY_TEXT = ? OR NGS_APPLY_TEXT IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsApplyText", "NGS_APPLY_TEXT IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsApplyText", "NGS_APPLY_TEXT NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsApplyTextasc", "NGS_APPLY_TEXT ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsApplyTextdesc", "NGS_APPLY_TEXT DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsModifyText", "NGS_MODIFY_TEXT = ?" ) // EQUAL

        .addFilterBy( "notequalNgsModifyText", "NGS_MODIFY_TEXT != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsModifyText",
     "(NGS_MODIFY_TEXT IS NULL OR NGS_MODIFY_TEXT = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsModifyText", "NGS_MODIFY_TEXT IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsModifyText", "NGS_MODIFY_TEXT < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsModifyText", "NGS_MODIFY_TEXT > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsModifyTextMatch", "NGS_MODIFY_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsModifyText",
     "NGS_MODIFY_TEXT = ? OR NGS_MODIFY_TEXT IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsModifyText", "NGS_MODIFY_TEXT IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsModifyText", "NGS_MODIFY_TEXT NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsModifyTextasc", "NGS_MODIFY_TEXT ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsModifyTextdesc", "NGS_MODIFY_TEXT DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsRemoveText", "NGS_REMOVE_TEXT = ?" ) // EQUAL

        .addFilterBy( "notequalNgsRemoveText", "NGS_REMOVE_TEXT != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsRemoveText",
     "(NGS_REMOVE_TEXT IS NULL OR NGS_REMOVE_TEXT = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsRemoveText", "NGS_REMOVE_TEXT IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsRemoveText", "NGS_REMOVE_TEXT < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsRemoveText", "NGS_REMOVE_TEXT > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsRemoveTextMatch", "NGS_REMOVE_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsRemoveText",
     "NGS_REMOVE_TEXT = ? OR NGS_REMOVE_TEXT IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsRemoveText", "NGS_REMOVE_TEXT IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsRemoveText", "NGS_REMOVE_TEXT NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsRemoveTextasc", "NGS_REMOVE_TEXT ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsRemoveTextdesc", "NGS_REMOVE_TEXT DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamName1", "NGS_PARAM_NAME1 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamName1", "NGS_PARAM_NAME1 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamName1",
     "(NGS_PARAM_NAME1 IS NULL OR NGS_PARAM_NAME1 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamName1", "NGS_PARAM_NAME1 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamName1", "NGS_PARAM_NAME1 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamName1", "NGS_PARAM_NAME1 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamName1Match", "NGS_PARAM_NAME1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamName1",
     "NGS_PARAM_NAME1 = ? OR NGS_PARAM_NAME1 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamName1", "NGS_PARAM_NAME1 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamName1", "NGS_PARAM_NAME1 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamName1asc", "NGS_PARAM_NAME1 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamName1desc", "NGS_PARAM_NAME1 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamName2", "NGS_PARAM_NAME2 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamName2", "NGS_PARAM_NAME2 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamName2",
     "(NGS_PARAM_NAME2 IS NULL OR NGS_PARAM_NAME2 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamName2", "NGS_PARAM_NAME2 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamName2", "NGS_PARAM_NAME2 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamName2", "NGS_PARAM_NAME2 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamName2Match", "NGS_PARAM_NAME2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamName2",
     "NGS_PARAM_NAME2 = ? OR NGS_PARAM_NAME2 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamName2", "NGS_PARAM_NAME2 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamName2", "NGS_PARAM_NAME2 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamName2asc", "NGS_PARAM_NAME2 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamName2desc", "NGS_PARAM_NAME2 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamName3", "NGS_PARAM_NAME3 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamName3", "NGS_PARAM_NAME3 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamName3",
     "(NGS_PARAM_NAME3 IS NULL OR NGS_PARAM_NAME3 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamName3", "NGS_PARAM_NAME3 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamName3", "NGS_PARAM_NAME3 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamName3", "NGS_PARAM_NAME3 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamName3Match", "NGS_PARAM_NAME3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamName3",
     "NGS_PARAM_NAME3 = ? OR NGS_PARAM_NAME3 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamName3", "NGS_PARAM_NAME3 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamName3", "NGS_PARAM_NAME3 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamName3asc", "NGS_PARAM_NAME3 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamName3desc", "NGS_PARAM_NAME3 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamName4", "NGS_PARAM_NAME4 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamName4", "NGS_PARAM_NAME4 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamName4",
     "(NGS_PARAM_NAME4 IS NULL OR NGS_PARAM_NAME4 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamName4", "NGS_PARAM_NAME4 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamName4", "NGS_PARAM_NAME4 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamName4", "NGS_PARAM_NAME4 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamName4Match", "NGS_PARAM_NAME4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamName4",
     "NGS_PARAM_NAME4 = ? OR NGS_PARAM_NAME4 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamName4", "NGS_PARAM_NAME4 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamName4", "NGS_PARAM_NAME4 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamName4asc", "NGS_PARAM_NAME4 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamName4desc", "NGS_PARAM_NAME4 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamName5", "NGS_PARAM_NAME5 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamName5", "NGS_PARAM_NAME5 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamName5",
     "(NGS_PARAM_NAME5 IS NULL OR NGS_PARAM_NAME5 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamName5", "NGS_PARAM_NAME5 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamName5", "NGS_PARAM_NAME5 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamName5", "NGS_PARAM_NAME5 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamName5Match", "NGS_PARAM_NAME5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamName5",
     "NGS_PARAM_NAME5 = ? OR NGS_PARAM_NAME5 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamName5", "NGS_PARAM_NAME5 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamName5", "NGS_PARAM_NAME5 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamName5asc", "NGS_PARAM_NAME5 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamName5desc", "NGS_PARAM_NAME5 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamValue1", "NGS_PARAM_VALUE1 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamValue1", "NGS_PARAM_VALUE1 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamValue1",
     "(NGS_PARAM_VALUE1 IS NULL OR NGS_PARAM_VALUE1 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamValue1", "NGS_PARAM_VALUE1 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamValue1", "NGS_PARAM_VALUE1 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamValue1", "NGS_PARAM_VALUE1 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamValue1Match", "NGS_PARAM_VALUE1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamValue1",
     "NGS_PARAM_VALUE1 = ? OR NGS_PARAM_VALUE1 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamValue1", "NGS_PARAM_VALUE1 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamValue1", "NGS_PARAM_VALUE1 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamValue1asc", "NGS_PARAM_VALUE1 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamValue1desc", "NGS_PARAM_VALUE1 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamValue2", "NGS_PARAM_VALUE2 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamValue2", "NGS_PARAM_VALUE2 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamValue2",
     "(NGS_PARAM_VALUE2 IS NULL OR NGS_PARAM_VALUE2 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamValue2", "NGS_PARAM_VALUE2 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamValue2", "NGS_PARAM_VALUE2 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamValue2", "NGS_PARAM_VALUE2 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamValue2Match", "NGS_PARAM_VALUE2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamValue2",
     "NGS_PARAM_VALUE2 = ? OR NGS_PARAM_VALUE2 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamValue2", "NGS_PARAM_VALUE2 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamValue2", "NGS_PARAM_VALUE2 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamValue2asc", "NGS_PARAM_VALUE2 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamValue2desc", "NGS_PARAM_VALUE2 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamValue3", "NGS_PARAM_VALUE3 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamValue3", "NGS_PARAM_VALUE3 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamValue3",
     "(NGS_PARAM_VALUE3 IS NULL OR NGS_PARAM_VALUE3 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamValue3", "NGS_PARAM_VALUE3 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamValue3", "NGS_PARAM_VALUE3 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamValue3", "NGS_PARAM_VALUE3 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamValue3Match", "NGS_PARAM_VALUE3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamValue3",
     "NGS_PARAM_VALUE3 = ? OR NGS_PARAM_VALUE3 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamValue3", "NGS_PARAM_VALUE3 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamValue3", "NGS_PARAM_VALUE3 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamValue3asc", "NGS_PARAM_VALUE3 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamValue3desc", "NGS_PARAM_VALUE3 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamValue4", "NGS_PARAM_VALUE4 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamValue4", "NGS_PARAM_VALUE4 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamValue4",
     "(NGS_PARAM_VALUE4 IS NULL OR NGS_PARAM_VALUE4 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamValue4", "NGS_PARAM_VALUE4 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamValue4", "NGS_PARAM_VALUE4 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamValue4", "NGS_PARAM_VALUE4 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamValue4Match", "NGS_PARAM_VALUE4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamValue4",
     "NGS_PARAM_VALUE4 = ? OR NGS_PARAM_VALUE4 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamValue4", "NGS_PARAM_VALUE4 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamValue4", "NGS_PARAM_VALUE4 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamValue4asc", "NGS_PARAM_VALUE4 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamValue4desc", "NGS_PARAM_VALUE4 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNgsParamValue5", "NGS_PARAM_VALUE5 = ?" ) // EQUAL

        .addFilterBy( "notequalNgsParamValue5", "NGS_PARAM_VALUE5 != ?" ) // NOTEQUAL

        .addFilterBy( "nullNgsParamValue5",
     "(NGS_PARAM_VALUE5 IS NULL OR NGS_PARAM_VALUE5 = 0)" ) // IS NULL

        .addFilterBy( "notnullNgsParamValue5", "NGS_PARAM_VALUE5 IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNgsParamValue5", "NGS_PARAM_VALUE5 < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNgsParamValue5", "NGS_PARAM_VALUE5 > ?" ) // GREATER THAN

        .addFilterBy( "filterByNgsParamValue5Match", "NGS_PARAM_VALUE5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNgsParamValue5",
     "NGS_PARAM_VALUE5 = ? OR NGS_PARAM_VALUE5 IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNgsParamValue5", "NGS_PARAM_VALUE5 IN ( ? )" ) // IN

        .addFilterBy( "NOTINNgsParamValue5", "NGS_PARAM_VALUE5 NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NgsParamValue5asc", "NGS_PARAM_VALUE5 ASC" ) // ORDER ASCENDING

        .addOrderBy( "NgsParamValue5desc", "NGS_PARAM_VALUE5 DESC" ) // ORDER DESCENDING
        ;
	    
//	  ==========================================================================================
	}	
}
