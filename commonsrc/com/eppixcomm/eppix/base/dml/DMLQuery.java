package com.eppixcomm.eppix.base.dml;

public abstract class DMLQuery extends DML {

    protected String    dmoName;

    protected DMLQuery() {}

    public Class getDMOClass() throws DMLException {

        try {
            return Class.forName(dmoName);

         } catch (ClassNotFoundException e) {

            throw new DMLException("DMO class '" + dmoName +
                "' not found: " + e.toString());
        }
    }
}
