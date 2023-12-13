/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DAOIteratorImpl implements DAOIterator,
    Iterator {
  /** DOCUMENT ME! */
  private DAOImpl dao;

  /** DOCUMENT ME! */
  private Class dmoClass;

  /** DOCUMENT ME! */
  private PreparedStatement stmt;

  /** DOCUMENT ME! */
  private ResultSet rs;

  /** DOCUMENT ME! */
  private boolean hasNext;

  /**
   * Creates a new DAOIteratorImpl object.
   *
   * @param dao DOCUMENT ME!
   * @param dmoClass DOCUMENT ME!
   * @param stmt DOCUMENT ME!
   * @param rs DOCUMENT ME!
   * @param hasNext DOCUMENT ME!
   */
  protected DAOIteratorImpl(DAOImpl dao, Class dmoClass,
      PreparedStatement stmt, ResultSet rs, boolean hasNext) {
    this.dao = dao;
    this.dmoClass = dmoClass;
    this.stmt = stmt;
    this.rs = rs;
    this.hasNext = hasNext;
  }

  /**
   * DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public void close() throws EPPIXSeriousException {
    try {
      if (rs != null) {
        rs.close();
        rs = null;
        hasNext = false;
      }

      if (stmt != null) {
        stmt.close();
        stmt = null;
      }
    } catch (SQLException e) {
      dao.thrower.unexpected(DAOImpl.getErrorMessage(e), e);
    }
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean hasNext() {
    return hasNext;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws NoSuchElementException DOCUMENT ME!
   */
  public Object next() throws NoSuchElementException {

    DMO dmo = null;

    try {
      try {
        if (hasNext) {
        	dmo = (DMO) dao.fetchDMO(dmoClass, rs);
        	hasNext = rs.next();
        }
      } catch (SQLException e) {
        dao.thrower.unexpected(DAOImpl.getErrorMessage(e), e);
      }
    } catch (EPPIXSeriousException e) {
      // re-throw exception for compatability with the Iterator interface
//   		throw new NoSuchElementException(e.getMessage());
    	/**
    	 * SJ: Change for N2N issue on no such element. So we wont throw a exception amymore
    	 * but log the error and stop the iteration.
    	 * Date: 5 June 2012
    	 */
    	hasNext = false;
    	dao.logger.error(e.getMessage());
    }

    return dmo;
  }

  /**
   * DOCUMENT ME!
   *
   * @throws UnsupportedOperationException DOCUMENT ME!
   */
  public void remove() {
    throw new UnsupportedOperationException();
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object fetchNext() throws EPPIXSeriousException {

    DMO dmo = null;

    try {
      if (hasNext) {
        dmo = (DMO) dao.fetchDMO(dmoClass, rs);
        hasNext = rs.next();
      }
    } catch (SQLException e) {
      dao.thrower.unexpected(DAOImpl.getErrorMessage(e), e);
    }

    return dmo;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmo DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object fetchNext(Object dmo) throws EPPIXSeriousException {
    try {
      if (hasNext) {
        dmo = (DMO) ((dmo == null) ? dao.fetchDMO(dmoClass, rs) : dao.fetchDMO(
            (DMO) dmo, rs));
        hasNext = rs.next();
      } else {
        dmo = null;
      }
    } catch (SQLException e) {
      dao.thrower.unexpected(DAOImpl.getErrorMessage(e), e);
    }

    return dmo;
  }
}
