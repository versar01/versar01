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
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import java.math.BigDecimal;

import java.util.Collection;

/**
 * Defines a related group of documents.
 * <p>
 *   Each entry defines a document type, such as all threat to bar letters. It does not differentiate between the different
 *   variants of the document that might be used for different categories of account, nor between the different versions of
 *   the document that may accumulate over time. These variations on the document are listed in dod_doc_definition and
 *   dov_doc_version.
 * </p>
 * <p>
 *   When eppix raises a request for a letter it specifies one of these document types.
 * </p>
 *
 * This class contains any additional logic for DotDocType, if any.
 * It extends the DotDocTypeAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class DotDocType
  extends DotDocTypeAbstractBLO {
}
