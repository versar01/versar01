package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface DAOIterator extends Iterator {

    public void close() throws EPPIXSeriousException;
    public boolean hasNext();
//    public Object next() throws NoSuchElementException;
    public Object next() throws NoSuchElementException;
    public void remove();
    public Object fetchNext() throws EPPIXSeriousException;
    public Object fetchNext( Object dmo ) throws EPPIXSeriousException;

}
