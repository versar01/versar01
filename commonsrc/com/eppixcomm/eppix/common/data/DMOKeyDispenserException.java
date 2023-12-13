/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

/**
 * Thrown when an error is detected while getting the next DMOKey.
 *
 * @author $Author$
 */
public class DMOKeyDispenserException extends Exception {

    public DMOKeyDispenserException() {}

    public DMOKeyDispenserException( String message ) {
        super(message);
    }

    public DMOKeyDispenserException( String message, Throwable cause ) {
        super(message, cause);
    }

    public DMOKeyDispenserException( Throwable cause ) {
        super(cause);
    }
} /* class DMOKeyDispenserException */