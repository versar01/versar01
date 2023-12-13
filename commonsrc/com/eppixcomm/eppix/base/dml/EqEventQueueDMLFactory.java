package com.eppixcomm.eppix.base.dml;


import com.eppixcomm.eppix.base.dml.EqEventQueueAbstractDMLFactory;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class EqEventQueueDMLFactory
  extends EqEventQueueAbstractDMLFactory {
	private static DMLFactory dml = null;
	
//~ Constructors ///////////////////////////////////////////////////////////
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new EqEventQueueDMLFactory();
		}
		return dml;
	}
	
  /**
   * Creates a new EqEventQueueDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected EqEventQueueDMLFactory(  )
    throws DMLException {
    super(  );
	  
	defStaticQuery("listEqEventQueuePriorityDesc", // dmlName
			"blo.EqEventQueueDMO", // dmoName,
			"SELECT eq_command, eq_message, eq_network, eq_priority "
					+ " FROM eq_event_queue "
					+ " ORDER BY eq_priority DESC", true); 
  }	
}

