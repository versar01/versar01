package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EdEventDependsDMO   extends DBO
implements Serializable {

	public EdEventDependsDMO(){

	}

	public EdEventDependsDMO(
		final String edParent,
		final String edChild,
		final String edBond){
		this.edParent = edParent;
		this.edChild = edChild;
		this.edBond = edBond;
	}

	  //---------------------
	  // Field type declarations
	  //---------------------
	  /**
	   * Defines the internal behaviour of the fields so the internal layers can manipulate them without
	   * needing to introspect them.
	   * The order of the fields in the definition must match the actual order in this DMO.
	   */
	  private static final int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING /* std public attribute: ed_parent char(16)  */,
	      FIELD_TYPE_STRING /* std public attribute: ed_child char(16)  */,
	      FIELD_TYPE_STRING /* std public attribute: ed_bond char(1)  */
	    };
	  
	  private final int[] fieldSizes = new int[] {
			 edParentSize,
			 edChildSize,
			edBondSize
	  };
	      

	  public int[] fieldSizes() {
	  	return fieldSizes;
	  }  

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int edParentFilter = 0; // filter index
	  private static final int edParentSize = 16; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int edChildFilter = 1; // filter index
	  private static final int edChildSize = 16; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int edBondFilter = 2; // filter index
	  private static final int edBondSize = 16; // field size

	  //---------------------
	  // Field declarations
	  //---------------------
	  // all attributes
	  private String edParent;
	  private String edChild;
	  private String edBond;

	  /**
	   * Not used by this class.
	   *
	   */
	  protected void generatedKey( final Integer key ) {
	  }

	  /**
	   * DOCUMENT ME!
	   *
	   * @return
	   */
	  protected Integer versionNumber(  ) {
	    return null;
	  }

	  /**
	   * DOCUMENT ME!
	   *
	   * @param recordVersion DOCUMENT ME!
	   */
	  protected void versionNumber( final Integer recordVersion ) {
	  }

	  // DMO method implementations ////////////////////////////////////////////////
	  /**
	   * DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   */
	  protected DAOArgs primaryKey(  ) {
//	    return new DAOArgs(2).arg( ( this.edParent == null ) ? null: this.edParent.trim()).arg( this.ecdSeqno );
		  return null;
	  }

	  protected int[] fieldTypes(  ) {
		    return fieldTypes;
	  }

	  protected Object[] get(  ) {
		    return new Object[] {
		      ( edParent == null ) ? null
		                             : ( ( edParent.length(  ) <= edParentSize )
		      ? edParent
		      : edParent.substring( 0, edParentSize ) // auto trimmed to fit, if required.
		       ),
		      ( edChild == null ) ? null
		                             : ( ( edChild.length(  ) <= edChildSize )
		      ? edChild
		      : edChild.substring( 0, edChildSize ) // auto trimmed to fit, if required.
		       ),
		      ( edBond == null ) ? null
		                          : ( ( edBond.length(  ) <= edBondSize ) ? edBond
		                          : edBond.substring( 0, edBondSize ) // auto trimmed to fit, if required.
		       )
		    };
		  }

	  protected void set( final Object[] fields ) {
		    edParent = rtrim( (String) fields[0] );
		    edChild = rtrim( (String) fields[1] );
		    edBond = rtrim( (String) fields[2] );
		  }

	  public void set(
			    final String edParent,
			    final String  edChild,
			    final String edBond ) {
			    this.edParent = edParent;
			    this.edChild = edChild;
			    this.edBond = edBond;
			  }

	public String getEdBond() {
		return edBond;
	}

	public void setEdBond(String edBond) {
		this.edBond = getPadded(edBond, edBondFilter);
	}

	public String getEdChild() {
		return edChild;
	}

	public void setEdChild(String edChild) {
		this.edChild = getPadded(edChild, edChildFilter);
	}

	public String getEdParent() {
		return edParent;
	}

	public void setEdParent(String edParent) {
		this.edParent = getPadded(edParent, edParentFilter);
	}


}
