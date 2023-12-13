/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import java.util.List;

/**
 * This is the Data Access Controller interface for the Audit Business
 * Object.
 *
 * @author BaH
 * @version $Revision: 1.1 $
 *
 * @since $jdk$
 */
public interface HistoryDAC {
  /**
   * Creates the Audit object in the database.
   *
   * @param auditDMO Audit object.
   *
   * @throws EPPIXSeriousException
   */
  public void create(HistoryDMO auditDMO) throws EPPIXSeriousException;

  /**
   * Creates Audit Data Model Objects from a passed in list of Audit DMOs.
   *
   * @param audits a List of Audit Data Model Object.
   *
   * @throws EPPIXSeriousException
   */
  public void create(List audits) throws EPPIXSeriousException;

  /**
   * Deletes an Audit Data Model Object.
   *
   * @param auditDMO The Audit Data Model Object to delete.
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete(HistoryDMO auditDMO)
    throws
      EPPIXSeriousException,
      EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Retrieves a list of Audit objects.
   *
   * @param auditDMO Audit object.
   *
   * @return List of Audit objects.
   *
   * @throws EPPIXSeriousException
   */
  public List getList(HistoryDMO auditDMO) throws EPPIXSeriousException;

  /**
   * Retrieves a paged list of Audit objects.
   * 
   * @param state previous state of the list.
   * @param auditDMO Audit object.
   * 
   * @return DTOList of Audit objects.
   * 
   * @throws EPPIXSeriousException
   */
  public DTOList getList(DTOListState state, HistoryDMO auditDMO)
    throws EPPIXSeriousException;
}