package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface SbeSubEquipAbstractDAC {

public void create( SbeSubEquipDMO sbeSubEquipDMO )
throws EPPIXSeriousException;

public void delete( SbeSubEquipDMO sbeSubEquipDMO )
throws EPPIXSeriousException, EPPIXObjectNotFoundException,
EPPIXObjectExpiredException;

public void delete( QueryFilter filter )
throws EPPIXSeriousException, EPPIXObjectNotFoundException,
EPPIXObjectExpiredException;

public void modify( QueryFilter filter )
throws EPPIXSeriousException, EPPIXObjectExpiredException,
EPPIXObjectNotFoundException;

public boolean exists( SbeSubEquipDMO sbeSubEquipDMO )
throws EPPIXSeriousException;

public boolean exists( QueryFilter filter )
throws EPPIXSeriousException;

public DAOIterator iterate( QueryFilter filter )
throws EPPIXSeriousException;

public SbeSubEquipDMO get( QueryFilter filter )
throws EPPIXSeriousException;

public Object max( QueryFilter filter )
throws EPPIXSeriousException;

public Object min( QueryFilter filter )
throws EPPIXSeriousException;

public int count( QueryFilter filter )
throws EPPIXSeriousException;

}