package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.util.DependencyStatus;
import com.eppixcomm.eppix.common.util.BatchStatus;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * This is used in conjunction with the pgc_program_contrl table to determine the current status of a program.
 *
 * This class contains any additional logic for PgsProgramStatus, if any.
 * It extends the PgsProgramStatusAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class PgsProgramStatus extends PgsProgramStatusAbstractBLO {

  /**
   * 
   * @param programId
   * @param cycle
   * @return
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public PgsProgramStatusDMO getProgramStatus(String programId, String cycle)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    
    logger.debug("getProgramStatus( programId, cycle )");
    
    QueryFilter filter = new QueryFilter();

    if (cycle == null) {
      filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsProgramIdFilter,
          programId);
      filter.add(FilterOp.EQUALORNULL, PgsProgramStatusDMO.pgsCycleFilter, " ");
    } else {
      filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsProgramIdFilter,
          programId);
      filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsCycleFilter, cycle);
    }

    return get(filter);
  }

  /**
   * 
   * @param pgsDMO
   * @return
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean updateProgramStatus(PgsProgramStatusDMO pgsDMO)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("updateProgramStatus( pgs )");

    //    FUNCTION programstatus_update(p_pgs)                 
    //    
    //    DEFINE                                               
    //        p_pgs       RECORD LIKE pgs_program_status.*,    
    //        l_status    INTEGER                              
    //                                                         
    //        IF p_pgs.pgs_cycle IS NULL THEN                  
    //            UPDATE pgs_program_status                    
    //            SET * = p_pgs.*                              
    //            WHERE pgs_program_id = p_pgs.pgs_program_id  
    //            AND (pgs_cycle IS NULL OR pgs_cycle = " ")   
    //        ELSE                                             
    //            UPDATE pgs_program_status                    
    //            SET * = p_pgs.*                              
    //            WHERE pgs_program_id = p_pgs.pgs_program_id  
    //            AND pgs_cycle = p_pgs.pgs_cycle              
    //        END IF                                           
    //                                                         
    //        IF SQLCA.SQLERRD[3] = 0 THEN                     
    //            ## Update not performed successfully         
    //            LET l_status = 1      
    //            ELSE                        
    //            ## Update was OK        
    //            LET l_status = 0        
    //        END IF                      
    //                                    
    //        RETURN l_status             
    //                                    
    //    END FUNCTION
    QueryFilter filter = new QueryFilter(PgsProgramStatusDMO.class);
    //    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsCycleFilter, pgsDMO.getPgsCycle()); 
    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsDescriptionFilter, pgsDMO
        .getPgsDescription());
    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsErrorMessFilter, pgsDMO
        .getPgsErrorMess());
    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsIsamValueFilter, pgsDMO
        .getPgsIsamValue());
    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsStatusClassFilter, pgsDMO
        .getPgsStatusClass());
    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsStatusFilter, pgsDMO
        .getPgsStatus());
    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsStatusValueFilter, pgsDMO
        .getPgsStatusValue());

    if (pgsDMO.getPgsCycle() == null) {
      filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsProgramIdFilter, pgsDMO
          .getPgsProgramId());
      filter
          .add(FilterOp.EQUALORNULL, PgsProgramStatusDMO.pgsCycleFilter, null);
    } else {
      filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsProgramIdFilter, pgsDMO
          .getPgsProgramId());
      filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsCycleFilter, pgsDMO
          .getPgsCycle());
    }

    try {
      modify(filter);
    } catch (EPPIXObjectNotFoundException e) {
      return false;
    }

    return true;
  }

  /**
   * 
   * @param programId
   * @param status
   * @param cycle
   * @return
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean existsForStatus(String programId, DependencyStatus status,
      String cycle) throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("existsForStatus, programId, status, cycle )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsProgramIdFilter,
        programId);
    filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsStatusFilter,
        DependencyStatus.map(status));
    filter.add(FilterOp.NOTEQUAL, PgsProgramStatusDMO.pgsCycleFilter, cycle);
    return exists(filter);
  }

  /**
   * 
   * @param programId
   * @param status
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void updateStatusForId(String programId, BatchStatus status)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("updateStatusForId( programId, status )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, PgsProgramStatusDMO.pgsStatusFilter, BatchStatus
        .map(status));
    filter.add(FilterOp.EQUAL, PgsProgramStatusDMO.pgsProgramIdFilter,
        programId);

    modify(filter);
  }
}
