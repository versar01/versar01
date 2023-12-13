package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;



public class NteNoteDACImpl extends NteNoteAbstractDACImpl implements NteNoteDAC{

//	public NteNoteDACImpl(UserContext userContext, DAO dao) {
//		super(userContext, dao);
//	}

	public NteNoteDACImpl(DAO dao) {
		super(dao);
	}
}