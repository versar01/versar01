package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EfqFutureQueueDMO extends DBO implements Serializable {

	private String efqCommand;
	private String efqMessage;
	private String efqNetwork;
	private Short efqPriority;

	public static final int efqCommandFilter = 0;
	private static final int efqCommandSize = 16;

	public static final int efqMessageFilter = 1;
	private static final int efqMessageSize = 30;

	public static final int efqNetworkFilter = 2;
	private static final int efqNetworkSize = 5;

	public static final int efqPriorityFilter = 3;

	public EfqFutureQueueDMO() {
	};

	public EfqFutureQueueDMO(final String efqCommand, final String efqMessage,
			final String efqNetwork, final Short efqPriority) {

		this.efqCommand = efqCommand;
		this.efqMessage = efqMessage;
		this.efqNetwork = efqNetwork;
		this.efqPriority = efqPriority;
	};

	private static final int[] fieldSizes = new int[] { efqCommandSize,
			efqMessageSize, efqNetworkSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.efqCommand == null) ? null
						: (this.efqCommand.length() <= efqCommandSize) ? this.efqCommand
								: this.efqCommand.substring(0,
										this.efqCommandSize)),
				((this.efqMessage == null) ? null
						: (this.efqMessage.length() <= efqMessageSize) ? this.efqMessage
								: this.efqMessage.substring(0,
										this.efqMessageSize)),
				((this.efqNetwork == null) ? null
						: (this.efqNetwork.length() <= efqNetworkSize) ? this.efqNetwork
								: this.efqNetwork.substring(0,
										this.efqNetworkSize)), this.efqPriority };
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return null;
	}

	protected void set(Object[] fields) {
		this.efqCommand = rtrim((String) fields[0]);
		this.efqMessage = rtrim((String) fields[1]);
		this.efqNetwork = rtrim((String) fields[2]);
		this.efqPriority = ((Short) fields[3]);
	}

	public void set(final String efqCommand, final String efqMessage,
			final String efqNetwork, final Short efqPriority) {

		this.efqCommand = efqCommand;
		this.efqMessage = efqMessage;
		this.efqNetwork = efqNetwork;
		this.efqPriority = efqPriority;
	}

	public String getEfqCommand() {
		return efqCommand;
	}

	public void setEfqCommand(String efqCommand) {
		this.efqCommand = efqCommand;
	}

	public String getEfqMessage() {
		return efqMessage;
	}

	public void setEfqMessage(String efqMessage) {
		this.efqMessage = efqMessage;
	}

	public String getEfqNetwork() {
		return efqNetwork;
	}

	public void setEfqNetwork(String efqNetwork) {
		this.efqNetwork = efqNetwork;
	}

	public Short getEfqPriority() {
		return efqPriority;
	}

	public void setEfqPriority(Short efqPriority) {
		this.efqPriority = efqPriority;
	}

}
