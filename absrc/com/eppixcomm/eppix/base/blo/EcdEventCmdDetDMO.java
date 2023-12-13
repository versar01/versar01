package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

//---------------------
// imports
//---------------------
import com.eppixcomm.eppix.common.util.DateTime;
import java.io.Serializable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for an EcdEventCmdDet.
 *
 *
 * <H3> An EcdEventCmdDet is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table contains the details for all events, which need to be communicated to Network Elements.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> EcdEventCmdDet Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for an ecdEventCmdDet into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one ecdEventCmdDet. An ecdEventCmdDet is:
 * This table contains the details for all events, which need to be communicated to Network Elements.
 * </P>
 * <P>
 *     It corresponds to the business logic object EcdEventCmdDet which
 *     contains all the business behaviour of an ecdEventCmdDet but is not visible outside the
 *     BASE module.
 * </P>
 * <P>
 *     As a value object it has few methods.
 *     The methods it does have are not business logic, they are just methods to make constructing and manipulating it easier.
 * </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 *
 * <H3> These Value Objects Contain: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *    This value object contains fields for all the details of an ecdEventCmdDet, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of an ecdEventCmdDet:</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <TABLE BORDER="0" CELLPADDING="5" CELLSPACING="3">
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top"></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Name</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Datatype</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Nullable</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Description</U></TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecdCommand</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique Id for message
 *
 *     <P>
 *       This attribute forms part of the primary key.
 *     </P>
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getEcdCommand()">
 *           getEcdCommand
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcdCommand(java.lang.String)">
 *           setEcdCommand (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecdSeqno</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Sequence number
 *
 *     <P>
 *       This attribute forms part of the primary key.
 *     </P>
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getEcdSeqno()">
 *           getEcdSeqno
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcdSeqno(java.lang.Short)">
 *           setEcdSeqno (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecdDetType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Detail type
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getEcdDetType()">
 *           getEcdDetType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcdDetType(java.lang.String)">
 *           setEcdDetType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecdText</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Detail text
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getEcdText()">
 *           getEcdText
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcdText(java.lang.String)">
 *           setEcdText (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecdFlag</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getEcdFlag()">
 *           getEcdFlag
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcdFlag(java.lang.String)">
 *           setEcdFlag (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 * </TABLE>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * <P>
 *   <U>Fields that carry attributes from other value objects (known as 'flattened in' attributes):</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object has no attributes 'flattened in' from other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 *
 * <P>
 *   <U>Fields that can carry one or more associated value objects (known as 'embedded' value objects).</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object never contains any embedded value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 * <H3> These Value Objects Are Contained by: </H3>


 * <P>
 *   <U>Selected Fields Flattened into:</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     No attributes from this value object get 'flattened in' to other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * <P>
 *   <U>Whole Value Object Embedded in:</U>
 * </P>
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object is never embedded in other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * @see EcdEventCmdDet
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class EcdEventCmdDetDMO
  extends DBO
  implements Serializable, Comparable{
  //~ Static variables/initializers //////////////////////////////////////////

	protected Logger logger = Logger.getLogger(EcdEventCmdDetDMO.class);
  //---------------------
  // Field type declarations
  //---------------------
  /**
   * Defines the internal behaviour of the fields so the internal layers can manipulate them without
   * needing to introspect them.
   * The order of the fields in the definition must match the actual order in this DMO.
   */
  private static final int[] fieldTypes = new int[] {
      FIELD_TYPE_STRING /* std public attribute: ecdCommand  */,
      FIELD_TYPE_SHORT /* std public attribute: ecdSeqno  */,
      FIELD_TYPE_STRING /* std public attribute: ecdDetType  */,
      FIELD_TYPE_STRING /* std public attribute: ecdText  */,
      FIELD_TYPE_STRING /* std public attribute: ecdFlag  */,
      FIELD_TYPE_DATETIME
    };
  
  private final int[] fieldSizes = new int[] {
		  	ecdCommandSize,
			0,
			ecdDetTypeSize,
			ecdTextSize,
			ecdFlagSize,
			0
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecdCommandFilter = 0; // filter index
  private static final int ecdCommandSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecdSeqnoFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecdDetTypeFilter = 2; // filter index
  private static final int ecdDetTypeSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecdTextFilter = 3; // filter index
  private static final int ecdTextSize = 1000; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecdFlagFilter = 4; // filter index
  private static final int ecdFlagSize = 1; // field size
  
  public static final int ecdTimeStampFilter = 5; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private Short ecdSeqno; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String ecdCommand; // Loaded from Schema
  private String ecdDetType; // Loaded from Schema
  private String ecdFlag; // Loaded from Schema
  private String ecdText; // Loaded from Schema
  private DateTime ecdTimeStamp;
  
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EcdEventCmdDetDMO object.
   */
  public EcdEventCmdDetDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new EcdEventCmdDetDMO object.
   *
   * @param ecdCommand DOCUMENT ME!
   * @param ecdSeqno DOCUMENT ME!
   * @param ecdDetType DOCUMENT ME!
   * @param ecdText DOCUMENT ME!
   * @param ecdFlag DOCUMENT ME!
   */
  public EcdEventCmdDetDMO( 
    final String ecdCommand,
    final Short  ecdSeqno,
    final String ecdDetType,
    final String ecdText,
    final String ecdFlag,
    final DateTime ecdTimeStamp) {
    this.ecdCommand = ecdCommand;

    this.ecdSeqno = ecdSeqno;

    this.ecdDetType = ecdDetType;

    this.ecdText = ecdText;

    this.ecdFlag = ecdFlag;
    this.ecdTimeStamp = ecdTimeStamp;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Not used by this class.
   *
   */
  protected void generatedKey( final Integer key ) {
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
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
    return new DAOArgs( 2 ).arg( ( this.ecdCommand == null ) ? null
                                                             : this.ecdCommand
      .trim(  ) )
                           .arg( this.ecdSeqno );
  }

  // methods for concrete classes follow...
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected int[] fieldTypes(  ) {
    return fieldTypes;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected Object[] get(  ) {
    return new Object[] {
      ( ecdCommand == null ) ? null
                             : ( ( ecdCommand.length(  ) <= ecdCommandSize )
      ? ecdCommand
      : ecdCommand.substring( 0, ecdCommandSize ) // auto trimmed to fit, if required.
       ), ecdSeqno,
      ( ecdDetType == null ) ? null
                             : ( ( ecdDetType.length(  ) <= ecdDetTypeSize )
      ? ecdDetType
      : ecdDetType.substring( 0, ecdDetTypeSize ) // auto trimmed to fit, if required.
       ),
      ( ecdText == null ) ? null
                          : ( ( ecdText.length(  ) <= ecdTextSize ) ? ecdText
                                                                    : ecdText
      .substring( 0, ecdTextSize ) // auto trimmed to fit, if required.
       ),
      ( ecdFlag == null ) ? null
                          : ( ( ecdFlag.length(  ) <= ecdFlagSize ) ? ecdFlag
                                                                    : ecdFlag
      .substring( 0, ecdFlagSize ) // auto trimmed to fit, if required.
       ),
       ecdTimeStamp
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    ecdCommand = rtrim( (String) fields[0] );
    ecdSeqno = (Short) fields[1];
    ecdDetType = rtrim( (String) fields[2] );
    ecdText = (String) fields[3];
    ecdFlag = rtrim( (String) fields[4] );
    ecdTimeStamp = (DateTime) fields[5];

    this.getDetailSegments();
    this.setPriority(this.getSegment());

  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcdCommand(  ) {
    return ecdCommand;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getEcdSeqno(  ) {
    return ecdSeqno;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcdDetType(  ) {
    return ecdDetType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcdText(  ) {
    return ecdText;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcdFlag(  ) {
    return ecdFlag;
  }

  
  public DateTime getEcdTimeStamp(){
	  return (ecdTimeStamp != null)? new DateTime(ecdTimeStamp): null;
  }
  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String ecdCommand,
    final Short  ecdSeqno,
    final String ecdDetType,
    final String ecdText,
    final String ecdFlag,
    final DateTime ecdTimeStamp) {
    this.ecdCommand = ecdCommand;
    this.ecdSeqno = ecdSeqno;
    this.ecdDetType = ecdDetType;
    this.ecdText = ecdText;
    this.ecdFlag = ecdFlag;
    this.ecdTimeStamp = (ecdTimeStamp != null)? new DateTime(ecdTimeStamp): null;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the EcdCommand field.
  *
  * @param ecdCommand
  */
  public void setEcdCommand( final String ecdCommand ) {
    this.ecdCommand = getPadded(ecdCommand, ecdCommandFilter);
  }

  /**
  * Sets the EcdSeqno field.
  *
  * @param ecdSeqno
  */
  public void setEcdSeqno( final Short ecdSeqno ) {
    this.ecdSeqno = ecdSeqno;
  }

  /**
  * Sets the EcdSeqno field.
  *
  * @param ecdSeqno
  */
  public void setEcdSeqno( final int ecdSeqno ) {
	  // this.ecdSeqno = Short.valueOf( (short) ecdSeqno );
	  //  Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
	  this.ecdSeqno = new Short( (short) ecdSeqno );
  }

  /**
  * Sets the EcdDetType field.
  *
  * @param ecdDetType
  */
  public void setEcdDetType( final String ecdDetType ) {
    this.ecdDetType = getPadded(ecdDetType, ecdDetTypeFilter);
  }

  /**
  * Sets the EcdText field.
  *
  * @param ecdText
  */
  public void setEcdText( final String ecdText ) {
    this.ecdText = getPadded(ecdText, ecdTextFilter);
  }

  /**
  * Sets the EcdFlag field.
  *
  * @param ecdFlag
  */
  public void setEcdFlag( final String ecdFlag ) {
    this.ecdFlag = getPadded(ecdFlag, ecdFlagFilter);
  }
  
  public void setEcdTimeStamp(final DateTime ecdTimeStamp){
	  this.ecdTimeStamp = (ecdTimeStamp == null)? null : new DateTime(ecdTimeStamp);
  }

/**
 * All methods and variables required to sort this class inside a list
 */ 
  
	private Integer priority;
	private String paramValue;
	private String segment; 
	private String primaryMsisdn;
	private String msisdn;
	private String sim;
	private String dualSim;
	
	  /**
	   * SJ: Added field to manage dual call checks.
	   */
	  private boolean isdualcall;
	
	public int compareTo(Object obj) throws ClassCastException {
		
		if (!(obj instanceof EcdEventCmdDetDMO))
		      throw new ClassCastException("EcdEventCmdDetDMO object is expecting.");
		 
		int result = priority.compareTo(((EcdEventCmdDetDMO)obj).priority);
		return result;
	}
	
	public void getDetailSegments(){
		int start = 0;
		int end = 0;

		start = ecdText.indexOf("[") + 1;
		end = ecdText.indexOf("]");
		/** 
		 * If any of the brackets is not present, 
		 * then a string out of bounds exception will be thrown.
		 * We will return an empty string here as we 
		 * have checks for empty string in the calling class. 
		 */
		if(start == -1 || end == -1){
			this.setSegment("");
		}else{
			this.setSegment(ecdText.substring(start, end).trim());
		}
	}
	
	public String getParameterValues(String param){
		
		if(logger.isDebugEnabled()){
			logger.debug("getParamterValues: param called: " + param);
			logger.debug("getParamterValues: ecdtext used: " + ecdText);
		}
		
		Pattern pattern = Pattern.compile(param);
		Matcher matcher = pattern.matcher(ecdText);
		String val = "";
		int start = 0;
		int end = 0;
		boolean found = false;

		while(matcher.find()){
			start = matcher.end() + 1;
			val = ecdText.substring(start, ecdText.length());
			end = val.indexOf(",");		
			found = true;
		}
		
		if(found){
			
			//return (val.substring(0, end)).trim();
			if(end == -1){
				/**
				 * There is no string to be proccessed return empty string
				 *
				 */
				return "";
			}else{
				return (val.substring(0, end));
			}
		}
		else{
			return null;
		}
	}	

//	public String getParamValue() {
//		return paramValue;
//	}
//	
//	public void setParamValue(String paramValue) {
//		this.paramValue = paramValue;
//	}
	
	public Integer getPriority() {
		return priority;
	}
	
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	public void setPriority(String segment){
		
		if(segment == null || segment.length() <= 0){
			// nothing to be set for this entry
			this.setPriority(new Integer(98));
		}
		
		this.setPrimaryMsisdn(getParameterValues("PRIMARY_MSISDN"));
		
			if(this.primaryMsisdn == null){
				this.primaryMsisdn = "";
			}
		
		this.setMsisdn(getParameterValues("MSISDN"));
			if(this.msisdn == null){
				this.msisdn = "";
			}
		
		if(segment.equalsIgnoreCase("SERVICE_REQUEST_HEADER")){
			this.setPriority(new Integer(0));
//			LET l_pr_msisdn = 
//                set_mtn_format(get_parameter_value("PRIMARY_MSISDN", 1),
//                            7, "RIGHT")
		}

//	WHEN "ACTIVATE_BSERV"
		else if(segment.equalsIgnoreCase("ACTIVATE_BSERV")){
			/**
			 * Priority here depends on Basic Telephony
			 * either 1 or 2
			 */
			if(this.primaryMsisdn.equalsIgnoreCase(this.msisdn)){
				this.setPriority(new Integer(1));
			}else{
				this.setPriority(new Integer(2));
			}
			
		}
//		IF m_profile = "Y" THEN
//			CALL errorlog("sort_mtn_segments: get l_msisdn")
//		END IF

//        LET l_msisdn = 
//            set_mtn_format(get_parameter_value("MSISDN", l_idx),
//                        7, "RIGHT")

//		IF m_profile = "Y" THEN
//			CALL errorlog("sort_mtn_segments: returned l_msisdn")
//			CALL errorlog(l_msisdn)
//		END IF

//        # We must activate basic telephony first
//        IF l_msisdn = l_pr_msisdn THEN
//			IF m_profile = "Y" THEN
//				CALL errorlog("sort_mtn_segments: insert string 1")
//				CALL errorlog(ma_mtn_n2n[l_idx].n2n_str)
//			END IF
//            INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 1)

//        ELSE
//			IF m_profile = "Y" THEN
//				CALL errorlog("sort_mtn_segments: insert string 2")
//				CALL errorlog(ma_mtn_n2n[l_idx].n2n_str)
//			END IF
//            INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 2)
//        END IF

//	WHEN "APPLY_DUAL_CALL_LINK"
		else if(segment.equalsIgnoreCase("APPLY_DUAL_CALL_LINK")){
			this.setPriority(new Integer(3));
		}
//		INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 3)

//	WHEN "APPLY_TOLL_FREE_LINK"
		else if(segment.equalsIgnoreCase("APPLY_TOLL_FREE_LINK")){
			this.setPriority(new Integer(3));
		}
//		INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 3)

//	WHEN "REMOVE_DUAL_CALL_LINK"
		else if(segment.equalsIgnoreCase("REMOVE_DUAL_CALL_LINK")){
			this.setPriority(new Integer(3));
		}
//		INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 3)

//	WHEN "REMOVE_TOLL_FREE_LINK"
		else if(segment.equalsIgnoreCase("REMOVE_TOLL_FREE_LINK")){
			this.setPriority(new Integer(3));
		}
//		INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 3)

//    WHEN "MODIFY_BSERV"
		else if(segment.equalsIgnoreCase("MODIFY_BSERV")){
			this.setPriority(new Integer(1));
		}
//        INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 1)

//    WHEN "DEACTIVATE_BSERV"
		else if(segment.equalsIgnoreCase("DEACTIVATE_BSERV")){
			this.setPriority(new Integer(1));
		}
//        INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 1)

//    WHEN "PROVIDE"
		else if(segment.equalsIgnoreCase("PROVIDE")){
			this.setPriority(new Integer(5));
		}
//        INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 5)

//    WHEN "WITHDRAW"
		else if(segment.equalsIgnoreCase("WITHDRAW")){
			this.setPriority(new Integer(5));
		}

//        INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 5)

//    WHEN "PTT_FOLDER"
		else if(segment.equalsIgnoreCase("PTT_FOLDER")){
			this.setPriority(new Integer(4));
		}

//        INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 4)

//    WHEN "SERVICE_REQUEST_TRAILER"
		else if(segment.equalsIgnoreCase("SERVICE_REQUEST_TRAILER")){
			this.setPriority(new Integer(99));
		}
//        INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 99)
//    OTHERWISE
		else{
			this.setPriority(new Integer(98));
		}
//        INSERT INTO n2n_sort VALUES(ma_mtn_n2n[l_idx].n2n_str, 98)

	}
	
	public String getSegment() {
		return segment;
	}
	
	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getPrimaryMsisdn() {
		return primaryMsisdn;
	}

	public void setPrimaryMsisdn(String primaryMsisdn) {
		this.primaryMsisdn = primaryMsisdn;
	}

	public boolean isDualCall() {
		return isdualcall;
	}

	public void setDualCall(boolean isDualCall) {
		this.isdualcall = isDualCall;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getDualSim() {
		return dualSim;
	}

	public void setDualSim(String dualSim) {
		this.dualSim = dualSim;
	}
   
}

