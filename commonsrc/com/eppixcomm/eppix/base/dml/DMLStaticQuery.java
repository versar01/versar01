package com.eppixcomm.eppix.base.dml;

public class DMLStaticQuery extends DMLQuery {

    private String  selectStmt;
    private boolean isMultiRow;

    protected DMLStaticQuery(
              String    dmlName
            , String    dmoName
            , String    selectStmt
            , boolean   isMultiRow ) throws DMLException {

        if (dmlName == null || dmlName.length() == 0)
            throw new DMLException("Parameter 'dmlName' is required.");

        if (dmoName == null || dmoName.length() == 0)
            throw new DMLException("Parameter 'dmoName' is required.");

        if (selectStmt == null || selectStmt.length() == 0)
            throw new DMLException("Parameter 'selectStmt' is required.");

        this.dmlName    = dmlName;
        this.dmoName    = dmoName;
        this.selectStmt = selectStmt;
        this.isMultiRow = isMultiRow;
    }

    public boolean isMultiRow() throws DMLException {
        return isMultiRow;
    }

    public String getStmtString(
              int       stmtType
            , String    filterBy
            , String    orderBy
            , String tableName
            , String maxField
            , String setArgs) throws DMLException {

        switch (stmtType) {
        case STMT_SELECT:
        case STMT_LIST_ABS:
        case STMT_EXISTS:

            if (tableName != null) {
              // TODO : we may want to change this character to something better at some point..
              
              // This allows us to use bill_cccccyyyymmdd etc as part of a static query 
              // Replaces # with the table name, if found...
              return selectStmt.replaceFirst("\\#", tableName);
              
            } else {
              return selectStmt;
            }
        }

        throw new DMLException("Invalid statement type '" + stmtType
                                      + "' requested for query '" + dmlName
                                      + "'.");
    }

} /* class DMLStaticQuery */
