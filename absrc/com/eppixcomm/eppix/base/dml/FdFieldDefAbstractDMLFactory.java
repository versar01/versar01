package com.eppixcomm.eppix.base.dml;

public class FdFieldDefAbstractDMLFactory extends BaseDMLFactory {
	private static DMLFactory dml = null;

	protected FdFieldDefAbstractDMLFactory() throws DMLException {
		;
		DMLTable table = defTable(
				"FdFieldDef", // DML Name
				"blo.FdFieldDefDMO", // dmoName
				"fd_field_def", // tableName
				2, // numColumns
				"FD_FIELD_NAME, FD_FIELD_ID, FD_HIST_DESC, FD_AUDIT_REQD, FD_FIELD_LOCKED", // columnList
				"FD_FIELD_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"FD_FIELD_NAME, FD_FIELD_ID, FD_HIST_DESC, FD_AUDIT_REQD, FD_FIELD_LOCKED",
				"", "", new String[] { "FD_FIELD_NAME", "FD_FIELD_ID",
						"FD_HIST_DESC", "FD_AUDIT_REQD", "FD_FIELD_LOCKED"},
				true);
		
		
		table.addFilterBy("equalFdFieldName", /* PK attribute */
		"FD_FIELD_NAME = ? ")
				.addFilterBy("filterByFdFieldNameMatch", "FD_FIELD_NAME LIKE ?")
				.addFilterBy("INFdFieldName", "FD_FIELD_NAME IN ( ? ) ") // IN

				.addFilterBy("NOTINFdFieldName", "FD_FIELD_NAME NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFdFieldName", "FD_FIELD_NAME != ?") // NOTEQUAL

				.addFilterBy(
						"nullFdFieldName",
						"(FD_FIELD_NAME IS NULL OR LENGTH(FD_FIELD_NAME) IS NULL OR LENGTH(FD_FIELD_NAME) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFdFieldName",
						"FD_FIELD_NAME IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFdFieldName", "FD_FIELD_NAME < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFdFieldName", "FD_FIELD_NAME > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFdFieldNameMatch",
						"FD_FIELD_NAME LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFdFieldName",
						"(FD_FIELD_NAME = ? OR FD_FIELD_NAME IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FdFieldName asc", "FD_FIELD_NAME ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FdFieldName desc", "FD_FIELD_NAME DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFdFieldId", /* PK attribute */
		"FD_FIELD_ID = ? ")
				.addFilterBy("filterByFdFieldIdMatch", "FD_FIELD_ID LIKE ?")
				.addFilterBy("INFdFieldId", "FD_FIELD_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFdFieldId", "FD_FIELD_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFdFieldId", "FD_FIELD_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFdFieldId",
						"(FD_FIELD_ID IS NULL OR LENGTH(FD_FIELD_ID) IS NULL OR LENGTH(FD_FIELD_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullFdFieldId", "FD_FIELD_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFdFieldId", "FD_FIELD_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFdFieldId", "FD_FIELD_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFdFieldIdMatch", "FD_FIELD_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFdFieldId",
						"(FD_FIELD_ID = ? OR FD_FIELD_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FdFieldId asc", "FD_FIELD_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FdFieldId desc", "FD_FIELD_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalFdHistDesc", /* PK attribute */
		"FD_HIST_DESC = ? ")
				.addFilterBy("filterByFdHistDescMatch", "FD_HIST_DESC LIKE ?")
				.addFilterBy("INFdHistDesc", "FD_HIST_DESC IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFdHistDesc", "FD_HIST_DESC NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFdHistDesc", "FD_HIST_DESC != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFdHistDesc",
						"(FD_HIST_DESC IS NULL OR LENGTH(FD_HIST_DESC) IS NULL OR LENGTH(FD_HIST_DESC) = 0)") // IS
																												// NULL

				.addFilterBy("notnullFdHistDesc", "FD_HIST_DESC IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFdHistDesc", "FD_HIST_DESC < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFdHistDesc", "FD_HIST_DESC > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFdHistDescMatch", "FD_HIST_DESC LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFdHistDesc",
						"(FD_HIST_DESC = ? OR FD_HIST_DESC IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FdHistDesc asc", "FD_HIST_DESC ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FdHistDesc desc", "FD_HIST_DESC DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFdAuditReqd", /* PK attribute */
		"FD_AUDIT_REQD = ? ")
				.addFilterBy("filterByFdAuditReqdMatch", "FD_AUDIT_REQD LIKE ?")
				.addFilterBy("INFdAuditReqd", "FD_AUDIT_REQD IN ( ? ) ") // IN

				.addFilterBy("NOTINFdAuditReqd", "FD_AUDIT_REQD NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFdAuditReqd", "FD_AUDIT_REQD != ?") // NOTEQUAL

				.addFilterBy(
						"nullFdAuditReqd",
						"(FD_AUDIT_REQD IS NULL OR LENGTH(FD_AUDIT_REQD) IS NULL OR LENGTH(FD_AUDIT_REQD) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFdAuditReqd",
						"FD_AUDIT_REQD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFdAuditReqd", "FD_AUDIT_REQD < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFdAuditReqd", "FD_AUDIT_REQD > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFdAuditReqdMatch",
						"FD_AUDIT_REQD LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFdAuditReqd",
						"(FD_AUDIT_REQD = ? OR FD_AUDIT_REQD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FdAuditReqd asc", "FD_AUDIT_REQD ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FdAuditReqd desc", "FD_AUDIT_REQD DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFdFieldLocked", /* PK attribute */
		"FD_FIELD_LOCKED = ? ")
				.addFilterBy("filterByFdFieldLockedMatch",
						"FD_FIELD_LOCKED LIKE ?")
				.addFilterBy("INFdFieldLocked", "FD_FIELD_LOCKED IN ( ? ) ") // IN

				.addFilterBy("NOTINFdFieldLocked",
						"FD_FIELD_LOCKED NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFdFieldLocked", "FD_FIELD_LOCKED != ?") // NOTEQUAL

				.addFilterBy(
						"nullFdFieldLocked",
						"(FD_FIELD_LOCKED IS NULL OR LENGTH(FD_FIELD_LOCKED) IS NULL OR LENGTH(FD_FIELD_LOCKED) = 0)") // IS
																														// NULL

				.addFilterBy("notnullFdFieldLocked",
						"FD_FIELD_LOCKED IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFdFieldLocked", "FD_FIELD_LOCKED < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanFdFieldLocked", "FD_FIELD_LOCKED > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByFdFieldLockedMatch",
						"FD_FIELD_LOCKED LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullFdFieldLocked",
						"(FD_FIELD_LOCKED = ? OR FD_FIELD_LOCKED IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FdFieldLocked asc", "FD_FIELD_LOCKED ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FdFieldLocked desc", "FD_FIELD_LOCKED DESC ") // ORDER
																			// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new FdFieldDefDMLFactory();
		}

		return dml;
	}

}
