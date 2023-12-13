/**
 * 
 */
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

/**
 * @author Mahant_S
 *
 */
public interface EdfEnhancedDataFaxAbstractDAC {

	 public EdfEnhancedDataFaxDMO get( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the EdfEnhancedDataFax object in the database.
	   *
	   * @param EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Locks and retrieves the EdfEnhancedDataFax object from the database.
	   *
	   * @param aEdfEnhancedDataFax EdfEnhancedDataFax object
	   *
	   * @return a populated EdfEnhancedDataFax object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public EdfEnhancedDataFaxDMO lock( EdfEnhancedDataFaxDMO aEdfEnhancedDataFaxDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  /**
	   * Modifies the EdfEnhancedDataFax object in the database.
	   *
	   * @param edfEnhancedDataFaxDMO EdfEnhancedDataFax object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the EdfEnhancedDataFax object from the database.
	   *
	   * @param edfEnhancedDataFaxDMO EdfEnhancedDataFax object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the EdfEnhancedDataFax object from the database.
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
	   * Modifies the EdfEnhancedDataFax object using the specified filter in the database.
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
	  * Return true if a EdfEnhancedDataFax object exists.
	  *
	  * @param EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO
	  *
	  * @return true if the EdfEnhancedDataFax object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXSeriousException;

	  /**
	    * Return true if a EdfEnhancedDataFax object exists.
	    *
	    * @param filter
	    *
	    * @return true if the EdfEnhancedDataFax object exists.
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
	   * @param locationDMO EdfEnhancedDataFax Data Model Object
	   *
	   * @return DTOList of EdfEnhancedDataFax Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<EdfEnhancedDataFaxDMO> getList( 
//	    DTOListState state,
//	    EdfEnhancedDataFaxDMO  edfEnhancedDataFaxDMO )
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
	//  public DTOList<EdfEnhancedDataFaxDMO> getList( 
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
	  public EdfEnhancedDataFaxDMO get( QueryFilter filter )
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
