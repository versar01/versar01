package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;



public class Hm2HandsetModelDMO extends DBO
implements Serializable {

	private Integer hm2ModelId;
	private String hm2ManuId;
	private String hm2Model;
	private String hm2ActiveInd;

	protected static final int hm2ModelIdFilter = 0;

	protected static final int hm2ManuIdFilter = 1;
	protected static final int hm2ManuIdSize = 5;

	protected static final int hm2ModelFilter = 2;
	protected static final int hm2ModelSize = 30;

	protected static final int hm2ActiveIndFilter = 3;
	protected static final int hm2ActiveIndSize = 1;

	private static final int[] fieldTypes = new int[]{
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
	};
	
	private static final int[] fieldSizes = new int[]{
	0,
	hm2ManuIdSize,
	hm2ModelSize,
	hm2ActiveIndSize
	};

	protected void generatedKey(Integer key) {
	}
	
	

	protected Object[] get() {
		return new Object[]{
				hm2ModelId,
				(hm2ManuId == null) ? null
                        : ( ( hm2ManuId.length(  ) <= hm2ManuIdSize )
              			      ? hm2ManuId
              			      : hm2ManuId.substring( 0, hm2ManuIdSize ) // auto trimmed to fit, if required.
              			       ),
				(hm2Model == null) ? null
                        : ( ( hm2Model.length(  ) <= hm2ModelSize )
              			      ? hm2Model
              			      : hm2Model.substring( 0, hm2ModelSize ) // auto trimmed to fit, if required.
              			       ),
				(hm2ActiveInd == null) ? null
                        : ( ( hm2ActiveInd.length(  ) <= hm2ActiveIndSize )
              			      ? hm2ActiveInd
              			      : hm2ActiveInd.substring( 0, hm2ActiveIndSize ) // auto trimmed to fit, if required.
              			       ),
		};
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs(1).arg(this.hm2ModelId);
	}

	protected void set(final Object[] fields) {
		this.hm2ModelId = ((Integer)fields[0]);
		this.hm2ManuId = rtrim((String)fields[1]);
		this.hm2Model = rtrim((String)fields[2]);
		this.hm2ActiveInd = rtrim((String)fields[3]);
	}

	public Integer getHm2ModelId() {
		return hm2ModelId;
	}

	public void setHm2ModelId(Integer hm2ModelId) {
		this.hm2ModelId = hm2ModelId;
	}

	public String getHm2ManuId() {
		return hm2ManuId;
	}

	public void setHm2ManuId(String hm2ManuId) {
		this.hm2ManuId = getPadded(hm2ManuId, hm2ManuIdFilter);
	}

	public String getHm2Model() {
		return hm2Model;
	}

	public void setHm2Model(String hm2Model) {
		this.hm2Model = getPadded(hm2Model, hm2ModelFilter);
	}

	public String getHm2ActiveInd() {
		return hm2ActiveInd;
	}

	public void setHm2ActiveInd(String hm2ActiveInd) {
		this.hm2ActiveInd = getPadded(hm2ActiveInd, hm2ActiveIndFilter);
	}
}