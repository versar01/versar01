/*============================================================================================= *
 *
 * (c) 2006 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.blo;


/**
 * One entry for each msisdn taken by the subscriber.
 * <p>
 *   Shows the sim that the number applies to.
 * </p>
 * <p>
 *   Many of the fields are the same as on ACTIVE. On active they relate to the subscription or the primary msisdn. Here they
 *   relate to the particular msisdn in question.
 * </p>
 * <p>
 *   As with active table these records are retained once they reach 'permanent deactivation' status. They are then deleted
 *   once a certain amount of time has passed. The amount of time is defined by system key ASWAIT&lt;network&gt; where
 *   network is D1, D2, etc.
 * </p>
 *
 * This class contains any additional logic for VamActiveMsisdn, if any.
 * It extends the VamActiveMsisdnAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class VamActiveMsisdn extends VamActiveMsisdnAbstractBLO {

	protected Class getDACClass() {
		return VamActiveMsisdnDAC.class;
	}


}
