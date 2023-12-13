/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.common.data.DAOArgs;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.1 $
 * @author $author$
 * @since $jdk$
 */
public abstract class DMLDynamicQuery
  extends DMLQuery {
  /**
   * Creates a new DMLDynamicQuery object.
   */
  public DMLDynamicQuery() {
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmtType DOCUMENT ME!
   * @param filterBy DOCUMENT ME!
   * @param orderBy DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   * @throws UnsupportedOperationException DOCUMENT ME!
   */
  public String getStmtString( int   stmtType,
                               String filterBy,
                               String orderBy )
                       throws DMLException {
    throw new UnsupportedOperationException();
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public abstract String getStmtString( String[] args )
                                throws DMLException;

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public abstract DAOArgs getStmtArgs( String[] args )
                            throws DMLException;
}

