package com.eppixcomm.eppix.common.util;

public final class Actions {

	/**
	 * Subscriber Create
	 */
	public static final Actions SUBSCRIBERCREATE = new Actions(
			"SUBSCRIBERCREATE", 0);
	/**
	 * Package Migration
	 */
	public static final Actions PACKAGEMIGRATION = new Actions(
			"PACKAGEMIGRATION", 1);
	/**
	 * Tariff Migration
	 */
	public static final Actions TARIFFMIGRATION = new Actions(
			"TARIFFMIGRATION", 2);
	/**
	 * Basic Service Migration
	 */
	public static final Actions BASICSERVICEMIGRATE = new Actions(
			"BASICSERVICEMIGRATE", 3);
	/**
	 * Basic Service Deactivation
	 */
	public static final Actions BASICSERVICEDEACT = new Actions(
			"BASICSERVICEDEACT", 4);
	/**
	 * SIM Activation
	 */
	public static final Actions SIMACTIVATE = new Actions("SUBSCRIBERCREATE", 5);
	/**
	 * ESN Activation
	 */
	public static final Actions ESNACTIVATE = new Actions("ESNACTIVATE", 6);
	/**
	 * SIM Deactivation
	 */
	public static final Actions SIMDEACTIVATE = new Actions("SIMDEACTIVATE", 7);
	/**
	 * ESN Deactivation
	 */
	public static final Actions ESNDEACTIVATE = new Actions("ESNDEACTIVATE", 8);
	/**
	 * SIM Swap
	 */
	public static final Actions SIMSWAP = new Actions("SIMSWAP", 9);
	/**
	 * ESN Swap
	 */
	public static final Actions ESNSWAP = new Actions("ESNSWAP", 10);
	/**
	 * MSISDN Activation
	 */
	public static final Actions MSISDNACTIVATE = new Actions("MSISDNACTIVATE",
			11);
	/**
	 * MIN Activation
	 */
	public static final Actions MINACTIVATE = new Actions("MINACTIVATE", 12);
	/**
	 * MSISDN Deactivation
	 */
	public static final Actions MSISDNDEACTIVATE = new Actions(
			"MSISDNDEACTIVATE", 13);
	/**
	 * MIN Deactivation
	 */
	public static final Actions MINDEACTIVATE = new Actions("MINDEACTIVATE", 14);
	/**
	 * MSISDN Swap
	 */
	public static final Actions MSISDNSWAP = new Actions("MSISDNSWAP", 15);
	/**
	 * MIN Swap
	 */
	public static final Actions MINSWAP = new Actions("MINSWAP", 16);
	private static final Actions[] $VALUES = { SUBSCRIBERCREATE,
			PACKAGEMIGRATION, TARIFFMIGRATION, BASICSERVICEMIGRATE,
			BASICSERVICEDEACT, SIMACTIVATE, ESNACTIVATE, SIMDEACTIVATE,
			ESNDEACTIVATE, SIMSWAP, ESNSWAP, MSISDNACTIVATE, MINACTIVATE,
			MSISDNDEACTIVATE, MINDEACTIVATE, MSISDNSWAP, MINSWAP };
	private static final long serialVersionUID = 0L;

	private String name;
	private int index;

	public static Actions[] values() {
		return (Actions[]) $VALUES.clone();
	}

	private Actions(String string, int i) {
		name = string;
		index = i;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}
}
