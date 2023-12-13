/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.dml.DMLDynamicQuery;
import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import java.util.List;

/**
 * This Data Access Object interface provides methods to access and
 * manipulate data using JDBC. DAO implementations should be instantiated by
 * a factory class, one per EPPIX module. A {@link
 * com.eppixcomm.eppix.base.dml.DMLFactory} is required to provide the SQL
 * statements that the DAO methods can execute.
 *
 * @version $Revision: 1.5 $
 * @author $Author$
 * @since $jdk$
 */
public interface DAO {
  /**
   * Allows an exception handler/logger other than the default provided by
   * the DAO implentation to be used.
   *
   * @param thrower exception handler/logger.
   */
  public void setThrower(DAOThrower thrower);

  /**
   * Closes all of the database resources allocated to the DAO.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void close() throws EPPIXSeriousException;

  /**
   * Closes the database resources associated with the named DML.
   *
   * @param dmlName name of the DML.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void close(String dmlName) throws EPPIXSeriousException;

  /**
   * Retrieves a single {@link DBO} from the database by its primary key.
   *
   * @param dbo (required) the DBO to be populated.
   *
   * @return a populated DBO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   *
   * @see #lock(DBO dbo)
   */
  public DBO get(DBO dbo) throws EPPIXSeriousException;

  public DBO get(DBO dbo, String tableName) throws EPPIXSeriousException;

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain com.eppixcomm.eppix.common.dml.DMLParamQuery
   * parameterised SQL query} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the parameterised query or table.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   *
   * @see #lock( String dmlName, String filterBy, DAOArgs filterArgs )
   */
  public DMO get(String dmlName, String filterBy, DAOArgs filterArgs)
    throws EPPIXSeriousException;

  public DMO get(String dmlName, String filterBy, DAOArgs filterArgs, String tableName)
  throws EPPIXSeriousException;

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain com.eppixcomm.eppix.common.dml.DMLParamQuery
   * parameterised SQL query} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the parameterised query or table.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the parameterised query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   *
   * @see #lock( String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo
   *      )
   */
  public DMO get(String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo)
    throws EPPIXSeriousException;

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain com.eppixcomm.eppix.common.dml.DMLStaticQuery
   * static SQL query} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DMO get(String dmlName, DAOArgs stmtArgs)
    throws EPPIXSeriousException;

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain com.eppixcomm.eppix.common.dml.DMLStaticQuery
   * static SQL query} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the static SQL query.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the static SQL query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DMO get(String dmlName, DAOArgs stmtArgs, DMO dmo)
    throws EPPIXSeriousException;

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain com.eppixcomm.eppix.common.dml.DMLDynamicQuery
   * dynamic SQL query} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the dynamic SQL query.
   * @param stmtArgs (required) string arguments that are passed to the
   *        dynamic query class
   *        (com.eppixcomm.eppix.common.dml.DMLDynamicQuery), to enable it to
   *        compose an appropriate SQL SELECT statament.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DMO get(String dmlName, String[] stmtArgs)
    throws EPPIXSeriousException;

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain com.eppixcomm.eppix.common.dml.DMLDynamicQuery
   * dynamic SQL query} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the dynamic SQL query.
   * @param stmtArgs (required) string arguments that are passed to the
   *        dynamic query class
   *        (com.eppixcomm.eppix.common.dml.DMLDynamicQuery), to enable it to
   *        compose an appropriate SQL SELECT statament.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the dynamic SQL query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DMO get(String dmlName, String[] stmtArgs, DMO dmo)
    throws EPPIXSeriousException;

  /**
   * The same as {@link #get(DBO dbo)} except a 'FOR UPDATE' lock is placed
   * on the row.
   *
   * @param dbo (required) the DBO to be populated.
   *
   * @return a populated DBO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  public DBO lock(DBO dbo)
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * The same as {@link #get( String dmlName, String filterBy, DAOArgs
   * filterArgs )} except a 'FOR UPDATE' lock is placed on the row.
   *
   * @param dmlName (required) the name of the parameterised query or table.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  public DMO lock(String dmlName, String filterBy, DAOArgs filterArgs)
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  public DMO lock(String dmlName, String filterBy, DAOArgs filterArgs, String tableName)
  throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * The same as {@link #get( String dmlName, String filterBy, DAOArgs
   * filterArgs, DMO dmo )} except a 'FOR UPDATE' lock is placed on the row.
   *
   * @param dmlName (required) the name of the parameterised query or table.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the parameterised query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  public DMO lock(String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo)
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Indicates whether the {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL query}
   * returns any rows.
   *
   * @param queryArgs parameterised query arguments object.
   *
   * @return true if the query returns one or more rows, false if not.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public boolean exists(DAOParamQueryArgs queryArgs)
    throws EPPIXSeriousException;

  public boolean exists(DAOParamQueryArgs queryArgs, String tableName)
  throws EPPIXSeriousException;

  /**
   * Indicates whether the {@link DBO} exists in the database. The class of
   * the DBO is used to consult the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition that will provide an
   * appropriate SELECT statement to ascertain whether the DBO exists based
   * on its primary key.
   *
   * @param dbo a DBO for which a table definition exists in the DMLFactory.
   *
   * @return true if the DBO exists in the database, false if not.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public boolean exists(DBO dbo) throws EPPIXSeriousException;

  public boolean exists(DBO dbo, String tableName) throws EPPIXSeriousException;

  /**
   * Indicates whether the {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL query}
   * returns any rows.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row(s) in the database.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   *
   * @return true if the query returns one or more rows, false if not.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public boolean exists(String dmlName, String filterBy, DAOArgs filterArgs)
    throws EPPIXSeriousException;

  public boolean exists(String dmlName, String filterBy, DAOArgs filterArgs, String tableName)
  throws EPPIXSeriousException;

  /**
   * Counts the number of rows retrieved by the {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL query}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row(s) in the database.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   *
   * @return the number of rows retrieved by the query.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public int count(String dmlName, String filterBy, DAOArgs filterArgs)
    throws EPPIXSeriousException;

  public int count(String dmlName, String filterBy, DAOArgs filterArgs, String tableName)
  throws EPPIXSeriousException;

  public Object max(String dmlName, String filterBy, DAOArgs filterArgs, int maxField)
  throws EPPIXSeriousException;

  public Object max(String dmlName, String filterBy, DAOArgs filterArgs, int maxField, String tableName)
  throws EPPIXSeriousException;

  public Object min(String dmlName, String filterBy, DAOArgs filterArgs, int maxField)
  throws EPPIXSeriousException;

  public Object min(String dmlName, String filterBy, DAOArgs filterArgs, int minField, String tableName)
  throws EPPIXSeriousException;

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLParamQuery parameterised SQL query}. A default value for
   * the initialCapacity of the List is assumed.
   *
   * @param queryArgs query arguments object. 
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the List overflows LIST_CAPACITY_MAX; the named DML does
   *         not exist in the DMLFactory; the named DML does not refer to a
   *         parameterised SQL query; the DMLFactory is unable to provide a
   *         SELECT statement for the specified filterBy or orderBy; the DMO
   *         class does not exist or can not be instantiated; or an SQL
   *         error is detected.
   */
  public List getList(DAOParamQueryArgs queryArgs)
    throws EPPIXSeriousException;

  public List getList(DAOParamQueryArgs queryArgs, String tableName)
  throws EPPIXSeriousException;

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLStaticQuery static SQL query}. A default value for the
   * initialCapacity of the List is assumed.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the List overflows LIST_CAPACITY_MAX; the named DML does
   *         not exist in the DMLFactory; the named DML does not refer to a
   *         static SQL query; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, DAOArgs stmtArgs)
    throws EPPIXSeriousException;

  public List getList(String dmlName, DAOArgs stmtArgs, String tableName)
  throws EPPIXSeriousException;

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLStaticQuery static SQL query}.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   * @param initialCapacity the initial capacity of the List to be
   *        returned.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a static SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, DAOArgs stmtArgs, int initialCapacity)
    throws EPPIXSeriousException;

  public List getList(String dmlName, DAOArgs stmtArgs, int initialCapacity, String tableName)
  throws EPPIXSeriousException;

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL
   * query}. A default value for the initialCapacity of the List is
   * assumed.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public List getList(
    String dmlName,
    String filterBy,
    DAOArgs filterArgs,
    String orderBy)
    throws EPPIXSeriousException;

  public List getList(
      String dmlName,
      String filterBy,
      DAOArgs filterArgs,
      String orderBy,
      String tableName)
      throws EPPIXSeriousException;

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLParamQuery parameterised SQL query}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   * @param initialCapacity the initial capacity of the List to be
   *        returned.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public List getList(
    String dmlName,
    String filterBy,
    DAOArgs filterArgs,
    String orderBy,
    int initialCapacity)
    throws EPPIXSeriousException;

  public List getList(
      String dmlName,
      String filterBy,
      DAOArgs filterArgs,
      String orderBy,
      int initialCapacity,
      String tableName)
      throws EPPIXSeriousException;

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLDynamicQuery dynamic SQL query}. A default value for the
   * initialCapacity of the List is assumed.
   *
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class (DMLDynamicQuery), to enable it to compose an
   *        appropriate SQL SELECT statament.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, String[] args)
    throws EPPIXSeriousException;

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLDynamicQuery dynamic SQL query}.
   *
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class (DMLDynamicQuery), to enable it to compose an
   *        appropriate SQL SELECT statament.
   * @param initialCapacity the initial capacity of the List to be
   *        returned.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, String[] args, int initialCapacity)
    throws EPPIXSeriousException;

  /**
   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. Each
   * subsequent set of values is retrieved by absolute row number that is
   * stored in the state ({@link DTOListState}).
   *
   * @param state current state of the list.
   * @param queryArgs query arguments object. 
   *
   * @return DTOList of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public DTOList getListAbs(DTOListState state, DAOParamQueryArgs queryArgs)
     throws EPPIXSeriousException;

  public DTOList getListAbs(DTOListState state, DAOParamQueryArgs queryArgs, String tableName)
  throws EPPIXSeriousException;

  /**
   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
   * of executing a {@linkPlain DMLStaticQuery static SQL query}. Each
   * subsequent set of values is retrieved by absolute row number that is
   * stored in the state ({@link DTOListState}).
   *
   * @param state current state of the list.
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   *
   * @return DTOList of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a static SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public DTOList getListAbs(
    DTOListState state,
    String dmlName,
    DAOArgs stmtArgs)
    throws EPPIXSeriousException;

  /**
   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. Each
   * subsequent set of values is retrieved by absolute row number that is
   * stored in the state ({@link DTOListState}).
   *
   * @param state current state of the list.
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   *
   * @return DTOList of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public DTOList getListAbs(
    DTOListState state,
    String dmlName,
    String filterBy,
    DAOArgs filterArgs,
    String orderBy)
    throws EPPIXSeriousException;

  /**
   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
   * of executing a {@linkPlain DMLDynamicQuery dynamic SQL query}. Each
   * subsequent set of values is retrieved by absolute row number that is
   * stored in the state ({@link DTOListState}).
   *
   * @param state current state of the list.
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class ({@link DMLDynamicQuery#getStmtString(String[]
   *        args)}), to enable it to compose an appropriate SQL SELECT
   *        statament.
   *
   * @return DTOList of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public DTOList getListAbs(DTOListState state, String dmlName, String[] args)
    throws EPPIXSeriousException;

  /**
   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. The
   * list is ordered by primary key. Each subsequent set of values is
   * retrieved based on the primary key that is stored in the state ({@link
   * DTOListState}).
   *
   * @param state current state of the list.
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   *
   * @return DTOList of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public DTOList getListKey(
    DTOListState state,
    String dmlName,
    String filterBy,
    DAOArgs filterArgs)
    throws EPPIXSeriousException;

  /**
   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. The
   * list is ordered by primary key. Each subsequent set of values is
   * retrieved based on the primary key that is stored in the state ({@link
   * DTOListState}).
   *
   * @param state current state of the list.
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param isAscending boolean flag; when true the list is ordered by
   *        ascending primary key, when false the list is ordered by 
   *        descending primary key.
   *
   * @return DTOList of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public DTOList getListKey(
    DTOListState state,
    String dmlName,
    String filterBy,
    DAOArgs filterArgs,
    boolean isAscending)
    throws EPPIXSeriousException;
    
  /**
   * Retrieves the dml name of the table definition associated with the dmoClass
   * from the dml factory.
   * 
   * @param dmoClass dmo class
   * 
   * @return dml name or the empty string if no table definition is found.
   */
  public String getTableDMLName( Class dmoClass );    

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL query}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DAOIterator iterator(
    String dmlName,
    String filterBy,
    DAOArgs filterArgs,
    String orderBy)
    throws EPPIXSeriousException;

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL query}. The
   * rows can optionally be locked 'FOR UPDATE'.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   * @param forUpdate when true, a 'FOR UPDATE' lock is acquired.
   *
   * @return - DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DAOIterator iterator(
    String dmlName,
    String filterBy,
    DAOArgs filterArgs,
    String orderBy,
    boolean forUpdate)
    throws EPPIXSeriousException;

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain DMLStaticQuery
   * static SQL query}.
   *
   * @param queryArgs (required) query arguments object.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a static SQL query; or an SQL error is
   *         detected.
   */
  public DAOIterator iterator( DAOParamQueryArgs queryArgs)
    throws EPPIXSeriousException;

  /**
   * @param queryArgs
   * @param lock
   * @return
   * @throws EPPIXSeriousException
   * @{@link Deprecated}
   */
  public DAOIterator  iterator( DAOParamQueryArgs queryArgs, boolean lock)
  throws EPPIXSeriousException;

  public DAOIterator  iterator( DAOParamQueryArgs queryArgs, String tableName)
  throws EPPIXSeriousException;

  public DAOIterator  iterator( DAOParamQueryArgs queryArgs, String tableName, boolean lock)
  throws EPPIXSeriousException;

  public DAOIterator iterator( String dmlName, DAOArgs stmtArgs, String tableName)
  throws EPPIXSeriousException;
  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLStaticQuery static SQL query}.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DAOIterator iterator( String dmlName, DAOArgs stmtArgs)
  throws EPPIXSeriousException;

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLDynamicQuery dynamic SQL query}.
   *
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs (required) string arguments that are passed to the
   *        dynamic query class
   *        (com.eppixcomm.eppix.common.dml.DMLDynamicQuery), to enable it to
   *        compose an appropriate SQL SELECT statament.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public DAOIterator iterator( String dmlName, String[] stmtArgs)
    throws EPPIXSeriousException;

  /**
   * Inserts a single {@link DBO} into the database. The class of the DBO is
   * used to consult the {@link com.eppixcomm.eppix.base.dml.DMLFactory} to
   * obtain a {@link com.eppixcomm.eppix.base.dml.DMLTable} definition, that
   * will provide an appropriate INSERT statement. If the underlying table
   * has a version number (used for optimistic locking) then the version
   * number of the DBO is set to 1.
   *
   * @param dbo (required) the DBO to be inserted, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void insert(DBO dbo) throws EPPIXSeriousException;

  public void insert(DBO dbo, String tableName) throws EPPIXSeriousException;

  /**
   * Inserts an array of {@link DBO DBOs} into the database. The class of the
   * first DBO element in the array, is used to consult the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition, that will provide an
   * appropriate INSERT statement. If the underlying table has a version
   * number (used for optimistic locking) then the version number of the DBO
   * is set to 1.
   *
   * @param dbos (required) the array of DBOs to be inserted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the array must be of the same class.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void insert(DBO[] dbos) throws EPPIXSeriousException;

  /**
   * Inserts a List of {@link DBO DBOs} into the database. The class of
   * the first DBO element in the collection, is used to consult the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition, that will provide an
   * appropriate INSERT statement. If the underlying table has a version
   * number (used for optimistic locking) then the version number of the DBO
   * is set to 1.
   *
   * @param dbos (required) the List of DBOs to be inserted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the collection must be of the same class.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void insert(List dbos) throws EPPIXSeriousException;

  /**
   * Updates a single {@link DBO}, by its primary key, in the database. The
   * class of the DBO is used to consult the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition, that will provide a
   * suitable UPDATE statement. If the underlying table has a version number
   * (used for optimistic locking) then the version number of the DBO is
   * incremented by 1.
   *
   * @param dbo (required) the DBO to be updated, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void update(DBO dbo)
    throws
      EPPIXSeriousException,
      EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  public void update(DBO dbo, String tableName)
  throws
    EPPIXSeriousException,
    EPPIXObjectExpiredException,
    EPPIXObjectNotFoundException;

  /**
   * Updates a single {@link DBO}, by the specified filter, in the database.
   * The filter must be defined as identifying a single row in the database.
   * The class of the DBO is used to consult the {@link DMLFactory} to
   * obtain a {@link DMLTable} definition, that will provide a suitable
   * UPDATE statement. If the underlying table has a version number (used
   * for optimistic locking) then the version number of the DBO is
   * incremented by 1.
   * 
   * @param dbo (required) the DBO to be updated, for which a table
   *        definition exists in the DMLFactory.
   * @param queryArgs (required) query arguments object.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an UPDATE statement; the
   *         filter is defined as returning more than one row; more than one
   *         row is affected by the update; or an SQL error is detected.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void update(DBO dbo, DAOParamQueryArgs queryArgs)
  	throws EPPIXSeriousException, EPPIXObjectExpiredException,
  	EPPIXObjectNotFoundException;

  public void update(DBO dbo, DAOParamQueryArgs queryArgs, String tableName)
		throws EPPIXSeriousException, EPPIXObjectExpiredException,
		EPPIXObjectNotFoundException;

  public void updateCustom(DBO dbo, DAOParamQueryArgs queryArgs)
  throws EPPIXSeriousException, EPPIXObjectExpiredException,
  EPPIXObjectNotFoundException;

  public void updateCustom(DBO dbo, DAOParamQueryArgs queryArgs, String tableName)
  throws EPPIXSeriousException, EPPIXObjectExpiredException,
  EPPIXObjectNotFoundException;
  
  /**
   * SJ: Changes to allow for multiple record update.
   * 12-11-2014
   * 
   * If isMultiple = true, we will not fail on row count > 1
   */
  
  public void updateCustomMultiple(DBO dbo, DAOParamQueryArgs queryArgs, boolean isMultiple)
	      throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;
  
  public void updateCustomMultiple(DBO dbo, DAOParamQueryArgs queryArgs,
	      String tableName, boolean isMultiple) throws EPPIXSeriousException,
	      EPPIXObjectExpiredException, EPPIXObjectNotFoundException;
  
  public void updateCustomMultiple(DBO dbo, String filterBy, DAOArgs filterArgs,
	      String tableName, String setArgs, boolean isMultiple) throws EPPIXSeriousException,
	      EPPIXObjectExpiredException, EPPIXObjectNotFoundException;

  /**
   * Updates a single {@link DBO}, by the specified filter, in the database.
   * The filter must be defined as identifying a single row in the database.
   * The class of the DBO is used to consult the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition, that will provide a
   * suitable UPDATE statement. If the underlying table has a version number
   * (used for optimistic locking) then the version number of the DBO is
   * incremented by 1.
   *
   * @param dbo (required) the DBO to be updated, for which a table
   *        definition exists in the DMLFactory.
   * @param filterBy (required) name of the filter defined for the table that
   *        will be used to update the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void update(DBO dbo, String filterBy, DAOArgs filterArgs)
    throws
      EPPIXSeriousException,
      EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Updates an array of {@link DBO DBOs}, by primary key, in the database.
   * The class of the first DBO element in the array, is used to consult the
   * {@link com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition, that will provide a
   * suitable UPDATE statement. If the underlying table has a version number
   * (used for optimistic locking) then the version number of the DBO is
   * incremented by 1.
   *
   * @param dbos (required) the array of DBOs to be updated, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the array must be of the same class.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void update(DBO[] dbos) throws EPPIXSeriousException;

  /**
   * Updates a List of {@link DBO DBOs}, by primary key, in the
   * database. The class of the first DBO element in the collection, is used
   * to consult the {@link com.eppixcomm.eppix.base.dml.DMLFactory} to obtain
   * a {@link com.eppixcomm.eppix.base.dml.DMLTable} definition, that will
   * provide a suitable UPDATE statement. If the underlying table has a
   * version number (used for optimistic locking) then the version number of
   * the DBO is incremented by 1.
   *
   * @param dbos (required) the List of DBOs to be updated, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the collection must be of the same class.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void update(List dbos) throws EPPIXSeriousException;

  /**
   * Deletes a single {@link DBO}, by its primary key, from the database. The
   * class of the DBO is used to consult the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition, that will provide a
   * suitable DELETE statement.
   *
   * @param dbo (required) the DBO to be deleted, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void delete(DBO dbo)
    throws
      EPPIXSeriousException,
      EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  public void delete(DBO dbo, String tableName)
  throws
    EPPIXSeriousException,
    EPPIXObjectExpiredException,
    EPPIXObjectNotFoundException;

  /**
   * Deletes an array of {@link DBO DBOs}, by primary key, from the database.
   * The class of the first DBO element in the array, is used to consult the
   * {@link com.eppixcomm.eppix.base.dml.DMLFactory} to obtain a {@link
   * com.eppixcomm.eppix.base.dml.DMLTable} definition, that will provide an
   * appropriate DELETE statement.
   *
   * @param dbos (required) the array of DBOs to be deleted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the array must be of the same class.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void delete(DBO[] dbos) throws EPPIXSeriousException;

  /**
   * Deletes a List of {@link DBO DBOs}, by primary key, from the
   * database. The class of the first DBO element in the collection, is used
   * to consult the {@link com.eppixcomm.eppix.base.dml.DMLFactory} to obtain
   * a {@link com.eppixcomm.eppix.base.dml.DMLTable} definition, that will
   * provide an appropriate DELETE statement.
   *
   * @param dbos (required) the List of DBOs to be deleted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the collection must be of the same class.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void delete(List dbos) throws EPPIXSeriousException;

  /**
   * Deletes 0 or more rows from the database as identified by the
   * {@linkPlain com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL
   * query}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to delete the row from the database.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   *
   * @return the number of rows deleted.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public int delete(String dmlName, String filterBy, DAOArgs filterArgs)
    throws EPPIXSeriousException;

  /**
   * Executes a {@linkPlain com.eppixcomm.eppix.common.dml.DMLStaticUpdate
   * static SQL update} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the static SQL update defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the UPDATE
   *        or DELETE statement defined in the DMLFactory.
   *
   * @return the number of rows affected by the update.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public int execute(String dmlName, DAOArgs stmtArgs)
    throws EPPIXSeriousException;

  /**
   * Executes a {@linkPlain com.eppixcomm.eppix.common.dml.DMLDynamicUpdate
   * dynamic SQL update} defined in the {@link
   * com.eppixcomm.eppix.base.dml.DMLFactory}.
   *
   * @param dmlName (required) the name of the dynamic SQL update defined in
   *        the DMLFactory.
   * @param stmtArgs (required) string arguments that are passed to the
   *        dynamic update class (DMLDynamicUpdate), to enable it to compose
   *        an appropriate SQL UPDATE or DELETE statament.
   *
   * @return the number of rows affected by the update.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public int execute(String dmlName, String[] stmtArgs)
    throws EPPIXSeriousException;

  /**
   * Performs an action on a {@link DBO} according to its {@link DMO#_action}
   * field.
   *
   * @param dbo (required) the DBO to be inserted, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void action(DBO dbo)
    throws
      EPPIXSeriousException,
      EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * For each {@link DBO} in the List an action is performed according
   * to its {@link DMO#_action} field.
   *
   * @param dbos (required) the List of DBOs to be actioned, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the collection must be of the same class.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public void action(List dbos) throws EPPIXSeriousException;

  /**
   * Provides the wildcard character used by the database to match any
   * sequence.
   *
   * @return wildcard string.
   */
  public String wildcardForAnySequence();

  /**
   * Provides the wildcard character used by the database to match a single
   * character.
   *
   * @return wildcard string.
   */
  public String wildcardForSingleChar();
  
  public void defStaticUpdate(String dmlName, String stmt) throws DMLException;
  
}
