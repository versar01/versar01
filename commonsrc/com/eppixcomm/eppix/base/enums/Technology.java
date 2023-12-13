package com.eppixcomm.eppix.base.enums;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;

/**
 * @author jon.lucas
 */
public final class Technology {
	public static final Technology GSM = new Technology("GSM", 0);
	public static final Technology TDMA = new Technology("TDMA", 1);
	public static final Technology ALL = new Technology("ALL", 2);
	private static final Technology[] $VALUES = { GSM, TDMA, ALL };
	private static final long serialVersionUID = 0L;

	private String name;
	private int index;

	public static Technology[] values() {
		return (Technology[]) $VALUES.clone();
	}

	private Technology(String string, int i) {
		name = string;
		index = i;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

	/**
	 * Returns the string version of the technology enumeration.
	 * 
	 * @param technology
	 * @return the mapped technology.
	 */
	public static String map(Technology technology) {

		switch (technology.getIndex()) {
		case 0:
			return "GSM";
		case 1:
			return "TDMA";
		case 2:
			return "ALL";
		}
		return null;
	}

	/**
	 * Returns the enumerated technology.
	 * 
	 * @param technology
	 * @return the mapped technology
	 * @throws EPPIXBusinessException
	 */
	public static Technology map(String technology)
			throws EPPIXBusinessException {

		if ("GSM".equals(technology)) {
			return GSM;
		}
		if ("TDMA".equals(technology)) {
			return TDMA;
		}
		if ("ALL".equals(technology)) {
			return ALL;
		}
		throw new EPPIXBusinessException("Technology '" + technology
				+ "' is invalid.");
	}

	public String toString() {
		return map(this);
	}
}
