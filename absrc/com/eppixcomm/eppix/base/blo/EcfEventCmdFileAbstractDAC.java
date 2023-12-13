package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface EcfEventCmdFileAbstractDAC {

	  public EcfEventCmdFileDMO get( EcfEventCmdFileDMO ecfEventCmdFileDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the ecfEventCmdFile object in the database.
	   *
	   * @param EcfEventCmdFileDMO ecfEventCmdFileDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( EcfEventCmdFileDMO ecfEventCmdFileDMO )
	    throws EPPIXSeriousException;

//	  /**
//	   * Locks and retrieves the ecfEventCmdFile object from the database.
//	   *
//	   * @param aecfEventCmdFile ecfEventCmdFile object
//	   *
//	   * @return a populated ecfEventCmdFile object or null if not found.
//	   *
//	   * @throws EPPIXSeriousException
//	   */
//	  public EcfEventCmdFileDMO lock( EcfEventCmdFileDMO aEcfEventCmdFileDMO )
//	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  /**
	   * Modifies the ecfEventCmdFile object in the database.
	   *
	   * @param ecfEventCmdFileDMO ecfEventCmdFile object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
//	  public void modify( EcfEventCmdFileDMO ecfEventCmdFileDMO )
//	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
//	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the ecfEventCmdFile object from the database.
	   *
	   * @param ecfEventCmdFileDMO ecfEventCmdFile object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( EcfEventCmdFileDMO ecfEventCmdFileDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the ecfEventCmdFile object from the database.
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
	   * Modifies the ecfEventCmdFile object using the specified filter in the database.
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
	  * Return true if a ecfEventCmdFile object exists.
	  *
	  * @param EcfEventCmdFileDMO ecfEventCmdFileDMO
	  *
	  * @return true if the ecfEventCmdFile object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
//	  public boolean exists( EcfEventCmdFileDMO ecfEventCmdFileDMO )
//	    throws EPPIXSeriousException;

	  /**
	    * Return true if a ecfEventCmdFile object exists.
	    *
	    * @param filter
	    *
	    * @return true if the ecfEventCmdFile object exists.
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
	   * @param locationDMO ecfEventCmdFile Data Model Object
	   *
	   * @return DTOList of ecfEventCmdFile Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<EcfEventCmdFileDMO> getList( 
//	    DTOListState  state,
//	    EcfEventCmdFileDMO ecfEventCmdFileDMO )
//	    throws EPPIXSeriousException;

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
	//  public DTOList<EcfEventCmdFileDMO> getList( 
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public Iterator iterate( QueryFilter filter )
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
	  public EcfEventCmdFileDMO get( QueryFilter filter )
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
