/*


 */

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

package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;

/**
 * This is the DMLFactory for NextPrn.
 * 
 * @version $Revision: 1.1 $
 * @since $jdk$
 */
public class NextPrnDMLFactory extends BaseDMLFactory {
  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  /**
         * Gets the DMLFactory singleton instance.
         * 
         * @return the DMLFactory object reference.
         * 
         * @throws DMLException
         *                 if an error is detected when instantiating the
         *                 DMLFactory.
         */
  protected static DMLFactory getDMLFactory() throws DMLException {
    if (dml == null) {
      dml = new NextPrnDMLFactory();
    }

    return dml;
  }

  protected NextPrnDMLFactory() throws DMLException {

    ;

    defTable("NextPrn", // dmlName
	".common.blo.NextPrnDMO", // dmoName
	"NEXT_PRN", // tableName
	1, // numColumns

	"NEXT_PRN"

	,// columnList

	"", // primaryKey

	"" // versionCol
	, false, // generatedKey

	"NEXT_PRN"

	, "", "", false)

    .addFilterBy("equalNextPrn", "NEXT_PRN = ?")

    .addFilterBy("lessthanNextPrn", "NEXT_PRN < ?")

    .addFilterBy("greaterthanNextPrn", "NEXT_PRN > ?")

    .addFilterBy("lessthanorequalNextPrn", "NEXT_PRN <= ?")

    .addFilterBy("greaterthanorequalNextPrn", "NEXT_PRN >= ?")

    .addFilterBy("betweenNextPrn", "NEXT_PRN BETWEEN ? AND ?")

    ;

  }
}
