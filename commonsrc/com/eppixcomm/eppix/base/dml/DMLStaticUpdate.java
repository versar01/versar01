package com.eppixcomm.eppix.base.dml;

public class DMLStaticUpdate extends DML {

    private String  updateStmt;

    protected DMLStaticUpdate(
              String    dmlName
            , String    updateStmt ) throws DMLException {

        if (dmlName == null || dmlName.length() == 0)
            throw new DMLException("Parameter 'dmlName' is required.");

        if (updateStmt == null || updateStmt.length() == 0)
            throw new DMLException("Parameter 'updateStmt' is required.");

        this.dmlName    = dmlName;
        this.updateStmt = updateStmt;
    }

    public String getStmtString(
              int       stmtType
            , String    filterByName
            , String    orderByName
            , String tableName
            , String maxField
            , String setArgs) throws DMLException {

        return updateStmt;
    }

} /* class DMLStaticUpdate */
