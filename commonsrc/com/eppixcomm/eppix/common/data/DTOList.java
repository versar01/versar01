/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import java.io.Serializable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A list object.
 *
 * @version $Revision: 1.2 $
 * @author $Author: BHenderson $
 *
 */
public class DTOList extends DTO implements List, Serializable {

  /** State of the list. */
  protected DTOListState state;

  /** List of DTOs. */
  protected List list;

  public DTOList() {
  }

  public DTOList(List list) {
	  this.setList(list);
  }
  
  /**
   * Creates a new DTOList object.
   *
   * @param state DOCUMENT ME!
   * @param list
   */
  public DTOList(DTOListState state, List list) {

    this.state = state;
    this.list = list;
  }

//  public void add(int index,  element) {
//    list.add(index, element);
//  }

//  public boolean add(E o) {
//    return list.add(o);
//  }


  public boolean addAll(Collection c) {
    return list.addAll(c);
  }


  public boolean addAll(int index, Collection c) {
    return list.addAll(c);
  }

  public void clear() {
    list.clear();
  }

  public boolean contains(Object o) {
    return list.contains(o);
  }

  public boolean containsAll(Collection c) {
    return list.containsAll(c);
  }

//  public E get(int index) {
//    return list.get(index);
//  }

  public List getList() {
    return list;
  }

  public DTOListState getState() {
    return state;
  }

  public int indexOf(Object o) {
    return list.indexOf(o);
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public Iterator iterator() {
    return list.iterator();
  }

  public int lastIndexOf(Object o) {
    return list.lastIndexOf(o);
  }

  public List list() {
    return this;
  }

  public ListIterator listIterator() {
    return list.listIterator();
  }

  public ListIterator listIterator(int index) {
    return list.listIterator(index);
  }

//  public E remove(int index) {
//    return list.remove(index);
//  }

  public boolean remove(Object o) {
    return list.remove(o);
  }

  public boolean removeAll(Collection c) {
    return list.removeAll(c);
  }

  public boolean retainAll(Collection c) {
    return list.retainAll(c);
  }

//  public E set(int index, E element) {
//    return list.set(index, element);
//  }

  public void setList(List list) {
    this.list = list;
  }

  public void setState(DTOListState state) {
    this.state = state;
  }

  public int size() {
	  if(list != null){
		  return list.size();	  
	  }else{
		  return 0;
	  }    
  }

  public List subList(int fromIndex, int toIndex) {
    return list.subList(fromIndex, toIndex);
  }

  public Object[] toArray() {
    return list.toArray();
  }

public boolean add(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}

public void add(int arg0, Object arg1) {
	// TODO Auto-generated method stub
	
}

public Object get(int arg0) {
	// TODO Auto-generated method stub
	return this.list.get(arg0);
}

public Object remove(int arg0) {
	// TODO Auto-generated method stub
	return null;
}

public Object set(int arg0, Object arg1) {
	// TODO Auto-generated method stub
	return null;
}

public Object[] toArray(Object[] arg0) {
	// TODO Auto-generated method stub
	return null;
}

//  public <T> T[] toArray(T[] a) {
//    return list.toArray(a);
//  }
}