package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.util.QueryFilter;

import com.eppixcomm.eppix.common.data.DTOList;

import com.eppixcomm.eppix.common.data.DTOListState;



public interface UrsUrlSettingDAC

  extends UrsUrlSettingAbstractDAC {


	DTOList getList(DTOListState state, QueryFilter filter);


	DTOList getList(DTOListState state, UrsUrlSettingDMO ursUrlSettingDMO);

}
