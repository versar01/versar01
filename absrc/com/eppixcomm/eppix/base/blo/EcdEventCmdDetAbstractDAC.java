package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.base.blo.EcdEventCmdDetDMO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * EcdEventCmdDet Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface EcdEventCmdDetAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a EcdEventCmdDet Data Model Object
   *
   * @return a populated EcdEventCmdDet Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EcdEventCmdDetDMO get( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the EcdEventCmdDet object in the database.
   *
   * @param EcdEventCmdDetDMO ecdEventCmdDetDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the EcdEventCmdDet object from the database.
   *
   * @param aEcdEventCmdDet EcdEventCmdDet object
   *
   * @return a populated EcdEventCmdDet object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EcdEventCmdDetDMO lock( EcdEventCmdDetDMO aEcdEventCmdDetDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the EcdEventCmdDet object in the database.
   *
   * @param ecdEventCmdDetDMO EcdEventCmdDet object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the EcdEventCmdDet object from the database.
   *
   * @param ecdEventCmdDetDMO EcdEventCmdDet object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the EcdEventCmdDet object from the database.
   *
   * @param QueryFilter filter object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Modifies the EcdEventCmdDet object using the specified filter in the database.
   *
   * @param filter object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
  * Return true if a EcdEventCmdDet object exists.
  *
  * @param EcdEventCmdDetDMO ecdEventCmdDetDMO
  *
  * @return true if the EcdEventCmdDet object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a EcdEventCmdDet object exists.
    *
    * @param filter
    *
    * @return true if the EcdEventCmdDet object exists.
    *
    * @throws EPPIXSeriousException
    */
  public boolean exists( QueryFilter filter )
    throws EPPIXSeriousException;

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO EcdEventCmdDet Data Model Object
   *
   * @return DTOList of EcdEventCmdDet Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState      state,
    EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param state DOCUMENT ME!
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public EcdEventCmdDetDMO get( QueryFilter filter )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object max( QueryFilter filter )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object min( QueryFilter filter )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public int count( QueryFilter filter )
    throws EPPIXSeriousException;
}
