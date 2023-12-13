/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.common.data.transformation.TransformationException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Element;

/**
 * Holds the current state of a DTOList (paged list) object. The state includes 
 * the position of the page in the overall query result set and the number of 
 * rows to retrieve per page. 
 *
 * @version $Revision: 1.4 $
 * @author $Author$
 * @since $jdk$
 */
public class DTOListState extends DTO implements Serializable {

  public static final int MAX_ELEMENTS = 4000;

  public static final int DEFAULT_ELEMENTS = 20;

  /** The maximum number of rows to retrieve per page. */
  protected int maxRows = DEFAULT_ELEMENTS;

  /** The actual number of rows retrieved for the current page. */
  protected int numRows = 0;

  /** DOCUMENT ME! */
  protected int startAt = 0;

  /** DOCUMENT ME! */
  protected String lastKey = null;

  /** First page indicator. */
  protected boolean isFirst = false;

  /** Last page indicator. */
  protected boolean isLast = false;

  /** DOCUMENT ME! */
  protected int direction = 0;

  /**
   * Creates a new DTOListState object.
   */
  public DTOListState() {
  }

  public DTOListState(DTOListState state) {
    if (state == null) {
      maxRows = DEFAULT_ELEMENTS;
    } else {
      direction = state.direction;
      isFirst = state.isFirst;
      isLast = state.isLast;
      maxRows = state.maxRows;
      numRows = state.numRows;
      startAt = state.startAt;
      lastKey = state.lastKey;
    }
  }

  /**
   * Creates a new DTOListState object.
   *
   * @param state xml element representing state of the list. null when a new 
   *        list is being retrieved.
   *
   * @throws EPPIXSeriousException if the xml format of the state is invalid.
   */
//  public DTOListState(Element state) throws EPPIXSeriousException {
//    List errors = new ArrayList( );
//    
//    populate(state, errors, null);
//    
//    _setTransformationErrors( errors );
//  }

  /**
   * Creates a new DTOListState object.
   *
   * @param maxRows the maximun number of rows to retrieve per page.
   */
  public DTOListState(int maxRows) {

    if (maxRows < 0 || maxRows > MAX_ELEMENTS) {

      this.maxRows = MAX_ELEMENTS;

    } else {

      this.maxRows = maxRows;
    }
  }

  /**
   * Sets the direction in which the page will be moved threw the result set of 
   * the underlying query.
   *
   * @param direction the direction in which to move the page throw the 
   *        result set of the underlying query: -<br>
   *        -1 = backward<br>
   *         0 = no movement<br>
   *         1 = forward<br> 
   *
   * @return this DTOListState object.
   */
  public DTOListState direction(int direction) {
    if ((direction < 0) && !isFirst) {
      this.direction = -1;
    } else if ((direction > 0) && !isLast) {
      this.direction = 1;
    } else {
      this.direction = 0;
    }

    return this;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isFirst() {
    return this.isFirst;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isLast() {
    return this.isLast;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DTOListState next() {
    if (!isLast) {
      direction = 1;
      //startAt+=numRows;
    }

    return this;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DTOListState prev() {
    if (!isFirst) {
      direction = -1;
    }

    return this;
  }

  // Get methods ///////////////////////////////////////////////////////////////

  public boolean getIsFirst() {
    return this.isFirst;
  }

  public boolean getIsLast() {
    return this.isLast;
  }

  public int getMaxRows() {
    return maxRows;
  }

  public int getNumRows() {
    return numRows;
  }

  public int getStartAt() {
    return startAt;
  }

  public String getLastKey() {
    return lastKey;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void setIsFirst(boolean isFirst) {
    this.isFirst = isFirst;
  }

  public void setIsLast(boolean isLast) {
    this.isLast = isLast;
  }

  public void setMaxRows(int maxRows) {
    this.maxRows = maxRows;
  }

  public void setNumRows(int numRows) {
    this.numRows = numRows;
  }

  public void setStartAt(int startAt) {
    this.startAt = startAt;
  }

  public void setLastKey(String lastKey) {
    this.lastKey = lastKey;
  }
}