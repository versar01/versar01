/*


*/

/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
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
import com.eppixcomm.eppix.base.dml.DMLTable;

/**
 * This is the DMLFactory for EanEpxactionNote.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class EanEpxactionNoteAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EanEpxactionNoteAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected EanEpxactionNoteAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "EanEpxactionNote", // dmlName
        "blo.EanEpxactionNoteDMO", // dmoName
        "EAN_EPXACTION_NOTE", // tableName
        3, // numColumns
        "EAN_ACTION_SEQ, EAN_TEXT_SEQ, EAN_TEXT", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "EAN_ACTION_SEQ, EAN_TEXT_SEQ, EAN_TEXT", "", "",
        new String[] { "EAN_ACTION_SEQ", "EAN_TEXT_SEQ", "EAN_TEXT" }, false );

    ;

    table.addFilterBy( "equalEanActionSeq", "EAN_ACTION_SEQ = ?" ) // EQUAL

         .addFilterBy( "notequalEanActionSeq", "EAN_ACTION_SEQ != ?" ) // NOTEQUAL

         .addFilterBy( "nullEanActionSeq", "EAN_ACTION_SEQ IS NULL" ) // IS NULL

         .addFilterBy( "notnullEanActionSeq", "EAN_ACTION_SEQ IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEanActionSeq", "EAN_ACTION_SEQ < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEanActionSeq", "EAN_ACTION_SEQ > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEanActionSeq", "EAN_ACTION_SEQ <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEanActionSeq", "EAN_ACTION_SEQ >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEanActionSeqMatch", "EAN_ACTION_SEQ LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEanActionSeq", "EAN_ACTION_SEQ BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEanActionSeq",
      "(EAN_ACTION_SEQ IS NULL OR EAN_ACTION_SEQ = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEanActionSeq",
      "(EAN_ACTION_SEQ IS NULL OR EAN_ACTION_SEQ < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEanActionSeq",
      "(EAN_ACTION_SEQ IS NULL OR EAN_ACTION_SEQ > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEanActionSeq", "EAN_ACTION_SEQ IN ( ? )" ) // IN

         .addFilterBy( "NOTINEanActionSeq", "EAN_ACTION_SEQ NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EanActionSeqasc", "EAN_ACTION_SEQ ASC" ) // ORDER ASCENDING

         .addOrderBy( "EanActionSeqdesc", "EAN_ACTION_SEQ DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEanTextSeq", "EAN_TEXT_SEQ = ?" ) // EQUAL

         .addFilterBy( "notequalEanTextSeq", "EAN_TEXT_SEQ != ?" ) // NOTEQUAL

         .addFilterBy( "nullEanTextSeq", "EAN_TEXT_SEQ IS NULL" ) // IS NULL

         .addFilterBy( "notnullEanTextSeq", "EAN_TEXT_SEQ IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEanTextSeq", "EAN_TEXT_SEQ < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEanTextSeq", "EAN_TEXT_SEQ > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEanTextSeq", "EAN_TEXT_SEQ <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEanTextSeq", "EAN_TEXT_SEQ >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEanTextSeqMatch", "EAN_TEXT_SEQ LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEanTextSeq", "EAN_TEXT_SEQ BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEanTextSeq",
      "(EAN_TEXT_SEQ IS NULL OR EAN_TEXT_SEQ = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEanTextSeq",
      "(EAN_TEXT_SEQ IS NULL OR EAN_TEXT_SEQ < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEanTextSeq",
      "(EAN_TEXT_SEQ IS NULL OR EAN_TEXT_SEQ > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEanTextSeq", "EAN_TEXT_SEQ IN ( ? )" ) // IN

         .addFilterBy( "NOTINEanTextSeq", "EAN_TEXT_SEQ NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EanTextSeqasc", "EAN_TEXT_SEQ ASC" ) // ORDER ASCENDING

         .addOrderBy( "EanTextSeqdesc", "EAN_TEXT_SEQ DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEanText", "EAN_TEXT = ?" ) // EQUAL

         .addFilterBy( "notequalEanText", "EAN_TEXT != ?" ) // NOTEQUAL

         .addFilterBy( "nullEanText",
      "(EAN_TEXT IS NULL OR LENGTH((EAN_TEXT)) IS NULL OR LENGTH((EAN_TEXT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEanText", "EAN_TEXT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEanText", "EAN_TEXT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEanText", "EAN_TEXT > ?" ) // GREATER THAN

         .addFilterBy( "filterByEanTextMatch", "EAN_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEanText",
      "(EAN_TEXT = ? OR EAN_TEXT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEanText", "EAN_TEXT IN ( ? )" ) // IN

         .addFilterBy( "NOTINEanText", "EAN_TEXT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EanTextasc", "EAN_TEXT ASC" ) // ORDER ASCENDING

         .addOrderBy( "EanTextdesc", "EAN_TEXT DESC" ) // ORDER DESCENDING
    ;

    ;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Gets the DMLFactory singleton instance.
   *
   * @return the DMLFactory object reference.
   *
   * @throws DMLException if an error is detected when instantiating the
   *         DMLFactory.
   */
  public static DMLFactory getDMLFactory(  )
    throws DMLException {
    if ( dml == null ) {
      dml = new EanEpxactionNoteDMLFactory(  );
    }

    return dml;
  }
}
