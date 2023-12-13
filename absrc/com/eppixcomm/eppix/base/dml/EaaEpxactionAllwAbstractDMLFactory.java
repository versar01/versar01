package com.eppixcomm.eppix.base.dml;

public class EaaEpxactionAllwAbstractDMLFactory extends BaseDMLFactory{

	private static DMLFactory dml = null;

	public EaaEpxactionAllwAbstractDMLFactory() throws DMLException{
		
		DMLTable table = defTable( "EaaEpxactionAllw", // dmlName
		        "blo.EaaEpxactionAllwDMO", // dmoName
		        "EAA_EPXACTION_ALLW", // tableName
		        4, // numColumns
		        "EAA_SUBSYSTEM, EAA_ACTION_TYPE, EAA_PEND_DIRECT, EAA_ACT_PROCTYPE",// columnList
		        "EAA_SUBSYSTEM, EAA_ACTION_TYPE", //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		        "EAA_SUBSYSTEM, EAA_ACTION_TYPE, EAA_PEND_DIRECT, EAA_ACT_PROCTYPE", // List of fields
		        "", 
		        "",
		        new String[] {
					"EAA_SUBSYSTEM",
					"EAA_ACION_TYPE",
					"EAA_PEND_DIRECT",
					"EAA_ACT_PROCTYPE"
		        } );
		
		   table.addFilterBy( "equalEaaSubsystem", "(EAA_SUBSYSTEM) = ?" ) // EQUAL

	         .addFilterBy( "notequalEaaSubsystem", "(EAA_SUBSYSTEM) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEaaSubsystem",
	      "(EAA_SUBSYSTEM IS NULL OR LENGTH((EAA_SUBSYSTEM)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEaaSubsystem", "EAA_SUBSYSTEM IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEaaSubsystemMatch", "EAA_SUBSYSTEM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEaaSubsystem",
	      "((EAA_SUBSYSTEM) = ? OR EAA_SUBSYSTEM IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEaaSubsystem", "EAA_SUBSYSTEM IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEaaSubsystem", "EAA_SUBSYSTEM NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EaaSubsystemasc", "EAA_SUBSYSTEM ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EaaSubsystemdesc", "EAA_SUBSYSTEM DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEaaActionType", "(EAA_ACTION_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEaaActionType", "(EAA_ACTION_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEaaActionType",
	      "(EAA_ACTION_TYPE IS NULL OR LENGTH((EAA_ACTION_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEaaActionType", "EAA_ACTION_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEaaActionTypeMatch", "EAA_ACTION_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEaaActionType",
	      "((EAA_ACTION_TYPE) = ? OR EAA_ACTION_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEaaActionType", "EAA_ACTION_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEaaActionType", "EAA_ACTION_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EaaActionTypeasc", "EAA_ACTION_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EaaActionTypedesc", "EAA_ACTION_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEaaPendDirect", "(EAA_PEND_DIRECT) = ?" ) // EQUAL

	         .addFilterBy( "notequalEaaPendDirect", "(EAA_PEND_DIRECT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEaaPendDirect",
	      "(EAA_PEND_DIRECT IS NULL OR LENGTH((EAA_PEND_DIRECT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEaaPendDirect", "EAA_PEND_DIRECT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEaaPendDirectMatch", "EAA_PEND_DIRECT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEaaPendDirect",
	      "((EAA_PEND_DIRECT) = ? OR EAA_PEND_DIRECT IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEaaPendDirect", "EAA_PEND_DIRECT IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEaaPendDirect", "EAA_PEND_DIRECT NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EaaPendDirectasc", "EAA_PEND_DIRECT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EaaPendDirectdesc", "EAA_PEND_DIRECT DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalaaActProctype", "(EAA_ACT_PROCTYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalaaActProctype", "(EAA_ACT_PROCTYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullaaActProctype",
	      "(EAA_ACT_PROCTYPE IS NULL OR LENGTH((EAA_ACT_PROCTYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullaaActProctype", "EAA_ACT_PROCTYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByaaActProctypeMatch", "EAA_ACT_PROCTYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullaaActProctype",
	      "((EAA_ACT_PROCTYPE) = ? OR EAA_ACT_PROCTYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INaaActProctype", "EAA_ACT_PROCTYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINaaActProctype", "EAA_ACT_PROCTYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "aaActProctypeasc", "EAA_ACT_PROCTYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "aaActProctypedesc", "EAA_ACT_PROCTYPE DESC" ) // ORDER DESCENDING
	    ;
	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new EaaEpxactionAllwDMLFactory(  );
	    }

	    return dml;
	  }
}
