package com.eppixcomm.eppix.base.blo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.resp.EppixResponse;
import com.eppixcomm.eppix.base.resp.SimDetails;
import com.eppixcomm.eppix.base.resp.SimFutureEvent;
import com.eppixcomm.eppix.base.resp.SimArray;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;

public class SimAPNServicesBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages, ApplicationMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(GetServiceDiscountBLO.class);
	private Logger logger = thrower.getLogger();
	public SimAPNServicesDAC simAPNServicesDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private VamActiveMsisdnDMO vamDMO = null;
	private SmnSimNosDMO smnDMO = null;
	private SbdSubDetsDMO sbdDMO = null;
	private AuxCustomersDMO auxDMO = null;
	private SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
	private SimpleDateFormat dtFormatyyymmdd = new SimpleDateFormat("dd/MM/yyyy");
	private String userName;
	private String hostName;

	TtTypeTextDMO ttDMO = null;
	RcReasonCodeDMO rcDMO = null;
	SmhSimHistoryDMO smhDMO = null;

	@Override
	protected Class<SimAPNServicesDAC> getDACClass() {
		return SimAPNServicesDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.simAPNServicesDAC = (SimAPNServicesDAC) dac;
	}

	public boolean validateApnSim(String sim, String msisdn)
			throws EPPIXBusinessException {

		logger.debug("String sim: " + sim + " String msisdn: " + msisdn);

		return this.doValidations(sim, null, msisdn, "validate", null, null);
	}

	public void doSimSwap(String simOld, String simNew, String msisdn,
			String transactionId, String reasonCode, String partnerId)
			throws EPPIXBusinessException {
		logger.debug("String sim: " + simOld + " String simNew: " + simNew
				+ " String msisdn: " + msisdn + " String transactionId: "
				+ transactionId + " String reasonCode: " + reasonCode
				+ "String partnerId: " + partnerId);

		try {
			// thrower.ifParameterMissing("simOld", simOld);
			thrower.ifParameterMissing("simNew", simNew);
			thrower.ifParameterMissing("transactionId", transactionId);
			thrower.ifParameterMissing("reasonCode", reasonCode);
		} catch (EPPIXSeriousException e1) {
			throw new EPPIXBusinessException(e1.getMessageCode(),
					e1.getMessage());
		}

		boolean createNewAsr = false;

		createNewAsr = this.doValidations(simOld, simNew, msisdn, "swap",
				reasonCode, partnerId);

		if (createNewAsr) {

			AsrAddServReqDMO dmo = new AsrAddServReqDMO();
			Calendar cal = Calendar.getInstance();

			dmo.setAsrTransactId(sbdDMO.getSbdSubscriberId().toString() + "_"
					+ dtFormat.format(cal.getTime())); //

			dmo.setAsrSubscriberId(sbdDMO.getSbdSubscriberId());
			dmo.setAsrActiveFlag("N"); //
			dmo.setAsrMsisdnNo(msisdn); //
			dmo.setAsrSimNo(vamDMO.getVamSimNo()); // Sim no
			dmo.setAsrToSim(simNew);
			dmo.setAsrBillAcNo(sbdDMO.getSbdBillAcNo()); //
			dmo.setAsrPackageCode(sbdDMO.getSbdPackageCode()); //
			dmo.setAsrServiceCode("NONE");
			dmo.setAsrSubmitDate(new DateTime()); //
			dmo.setAsrActionType("SMSWP");
			dmo.setAsrActReasCode("SWPN");
			dmo.setAsrSystemReq(this.getHostName());
			dmo.setAsrComments("APN Management SIMSWAP");
			dmo.setAsrHandsetMake(transactionId);
			dmo.setAsrHandsetModel((partnerId == null || partnerId.length() <= 0) ? ""
					: partnerId);
			dmo.setAsrFileId(sbdDMO.getSbdSubscriberId().toString() + "_"
					+ dtFormat.format(cal.getTime())); //

			dmo.setAsrParamId(new Integer("0"));
			dmo.setAsrParamValue("NONE");

			try {
				this.createAsr(dmo);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				thrower.business(ApplicationMessages.SIM_000201);
			}

			/**
			 * Required update SMN Write history
			 */
			String sCode = "3rdPRTYESS";
			String sVal = "APN Management sim_swap";

			try {
				this.updateSmn(sbdDMO.getSbdSubscriberId(), simNew, "1");
			} catch (EPPIXSeriousException e) {
				logger.debug(e.getMessage());
			}

		}

		// try {
		// this.createSimHistory(sbdDMO.getSbdSubscriberId(), simNew, sCode,
		// sVal);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

		// try {
		// this.createSubscriberHistory(sbdDMO.getSbdSubscriberId(), new
		// Integer("0"), sCode, simOld, simNew);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

	}

	public void doSuspend(String sim, String msisdn, String transactionId,
			String reasonCode, String partnerId) throws EPPIXBusinessException {
		logger.debug("String sim: " + sim + " String msisdn: " + msisdn
				+ " String transactionId: " + transactionId
				+ " String reasonCode: " + reasonCode + "String partnerId: "
				+ partnerId);

		try {
			thrower.ifParameterMissing("transactionId", transactionId);
			thrower.ifParameterMissing("reasonCode", reasonCode);
		} catch (EPPIXSeriousException e1) {
			throw new EPPIXBusinessException(e1.getMessageCode(),
					e1.getMessage());
		}

		this.doValidations(sim, null, msisdn, "suspend", reasonCode, partnerId);

		AsrAddServReqDMO dmo = new AsrAddServReqDMO();
		Calendar cal = Calendar.getInstance();

		dmo.setAsrTransactId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrSubscriberId(sbdDMO.getSbdSubscriberId());
		dmo.setAsrActiveFlag("N"); //
		dmo.setAsrMsisdnNo(msisdn); //
		dmo.setAsrSimNo(vamDMO.getVamSimNo()); // Sim no
		dmo.setAsrBillAcNo(sbdDMO.getSbdBillAcNo()); //
		dmo.setAsrPackageCode(sbdDMO.getSbdPackageCode()); //
		dmo.setAsrSubmitDate(new DateTime());
		dmo.setAsrActionType("SMDEA");
		dmo.setAsrActReasCode("SSPN");
		dmo.setAsrServiceCode("NONE");
		dmo.setAsrComments("APN Management SUSPEND");
		dmo.setAsrSystemReq(this.getHostName());
		dmo.setAsrDeactType("TEMP");
		dmo.setAsrHandsetMake(transactionId);
		dmo.setAsrHandsetModel((partnerId == null || partnerId.length() <= 0) ? ""
				: partnerId);
		dmo.setAsrFileId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrParamId(new Integer("0"));
		dmo.setAsrParamValue("NONE");

		try {
			this.createAsr(dmo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
			thrower.business(ApplicationMessages.SIM_000201);
		}

		/**
		 * Write history changed to use the transaction id ans partner if may
		 * not be available 12-02-2019
		 */
		String sCode = reasonCode;
		String sVal = "APN Mng " + transactionId;

		// try {
		// this.updateSmn(sbdDMO.getSbdSubscriberId(), sim);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

		// try {
		// this.createSimHistory(sbdDMO.getSbdSubscriberId(), sim, sCode, sVal);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

		// try {
		// this.createSubscriberHistory(sbdDMO.getSbdSubscriberId(), new
		// Integer("0"), sCode, sim, sim);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

	}

	public void doUnsuspend(String sim, String msisdn, String transactionId,
			String reasonCode, String partnerId) throws EPPIXBusinessException {
		logger.debug("String sim: " + sim + " String msisdn: " + msisdn
				+ " String transactionId: " + transactionId
				+ " String reasonCode: " + reasonCode + "String partnerId: "
				+ partnerId);

		try {
			thrower.ifParameterMissing("transactionId", transactionId);
			thrower.ifParameterMissing("reasonCode", reasonCode);
		} catch (EPPIXSeriousException e1) {
			throw new EPPIXBusinessException(e1.getMessageCode(),
					e1.getMessage());
		}

		this.doValidations(sim, null, msisdn, "unsuspend", reasonCode,
				partnerId);

		AsrAddServReqDMO dmo = new AsrAddServReqDMO();
		Calendar cal = Calendar.getInstance();

		dmo.setAsrTransactId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrSubscriberId(sbdDMO.getSbdSubscriberId());
		dmo.setAsrActiveFlag("N"); //
		dmo.setAsrMsisdnNo(msisdn); //
		dmo.setAsrSimNo(vamDMO.getVamSimNo()); // Sim no
		dmo.setAsrBillAcNo(sbdDMO.getSbdBillAcNo()); //
		dmo.setAsrPackageCode(sbdDMO.getSbdPackageCode()); //
		dmo.setAsrSubmitDate(new DateTime()); //
		dmo.setAsrActionType("SMREA"); //
		dmo.setAsrActReasCode("SUPN");
		dmo.setAsrServiceCode("NONE");
		dmo.setAsrComments("APN Management UNSUSPEND SIM");
		dmo.setAsrSystemReq(this.getHostName());
		dmo.setAsrHandsetMake(transactionId);
		dmo.setAsrHandsetModel((partnerId == null || partnerId.length() <= 0) ? ""
				: partnerId);
		dmo.setAsrFileId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrParamId(new Integer("0"));
		dmo.setAsrParamValue("NONE");

		try {
			this.createAsr(dmo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
			thrower.business(ApplicationMessages.SIM_000201);
		}

		/**
		 * Write history change 12-02-2019 Use transaction id history.
		 */
		String sCode = reasonCode;
		String sVal = "APN Mng " + transactionId;

		// try {
		// this.updateSmn(sbdDMO.getSbdSubscriberId(), sim);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

		// try {
		// this.createSimHistory(sbdDMO.getSbdSubscriberId(), sim, sCode, sVal);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

		// try {
		// this.createSubscriberHistory(sbdDMO.getSbdSubscriberId(), new
		// Integer("0"), sCode, sim, sim);
		// } catch (EPPIXSeriousException e) {
		// logger.debug(e.getMessage());
		// }

	}

	//
	private boolean doValidations(String simOld, String simNew, String msisdn,
			String type, String rcCode, String partnerId)
			throws EPPIXBusinessException {

		boolean isValid = false;
		boolean isSim = false;
		RcReasonCodeDMO rcDMO = null;
		EhEppixHierarchyDMO ehDmo = null;

		if (simOld != null && simOld.length() > 0) {
			vamDMO = this.getVamFromSim(simOld, null);
			isSim = true;
		} else {
			vamDMO = this.getVamFromMsisdn(msisdn, null);
			isSim = false;
		}

		if (vamDMO == null) {
			if (isSim) {
				thrower.business(ApplicationMessages.SIM_000101, simOld);
			} else {
				thrower.business(ApplicationMessages.SIM_000103, msisdn);
			}
		} else {
			/**
			 * Fix check on ASR where simOld not received.
			 * 18-11-2019
			 */
			if(simOld == null || simOld.length() <= 0) {
				simOld = vamDMO.getVamSimNo();
			}
			
			if (!vamDMO.getVamStatCode().equals("1")
					&& !vamDMO.getVamStatCode().equals("2")
					&& !vamDMO.getVamStatCode().equals("4")) {
				if (isSim) {
					thrower.business(ApplicationMessages.SIM_000102, simOld);
				} else {
					thrower.business(ApplicationMessages.SIM_000104, msisdn);
				}
			}

			if (msisdn != null && msisdn.length() > 0) {
				// Check if the msisnd and sim is same account
				if (!vamDMO.getVamMsisdnNo().equals(msisdn)) {
					thrower.business(ApplicationMessages.SIM_000118,
							new Object[] { msisdn, simOld });
				}
			}

			sbdDMO = this.getSbd(vamDMO.getVamSubscriberId());

			if (sbdDMO == null) {
				thrower.business(ApplicationMessages.SIM_000105);
			} else {

				// Add check if subscriber g=has APN service allocated.
				// boolean hasAPN = false;
				//
				// hasAPN =
				// this.subscriberHasAPNService(sbdDMO.getSbdSubscriberId());
				//
				// if(!hasAPN){
				// thrower.business(ApplicationMessages.SIM_000116);
				// }

				auxDMO = this.getAux(sbdDMO.getSbdBillAcNo());

				if (auxDMO == null) {
					if (isSim) {
						thrower.business(ApplicationMessages.SIM_000106, simOld);
					} else {
						thrower.business(ApplicationMessages.SIM_000107, msisdn);
					}
				} else {
					if (!auxDMO.getAccStatus().equals("OPN")) {
						if (isSim) {
							thrower.business(ApplicationMessages.SIM_000106,
									simOld);
						} else {
							thrower.business(ApplicationMessages.SIM_000107,
									msisdn);
						}
					} else {
						isValid = true;
					}
				}
			}
		}

		logger.debug("\n BEFORE THE PARTNER ID CHECK");

		if (partnerId != null && partnerId.length() > 0) {
			try {
				ehDmo = this.getScEhHH(partnerId, sbdDMO.getSbdBillAcNo());

				if (ehDmo == null) {
					logger.error("Partner id: " + partnerId
							+ " is in valid for account: "
							+ sbdDMO.getSbdBillAcNo());
					thrower.business(ApplicationMessages.SIM_000117, partnerId);
				}

			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				thrower.business(ApplicationMessages.SIM_000117, partnerId);
			}
		}

		logger.debug("\n AFTER THE PARTNER ID CHECK");

		if (isValid) {
			if (type.equals("swap")) {
				try {
					smnDMO = this.getSmnDMO(simNew);
				} catch (EPPIXSeriousException e) {
					thrower.business(ApplicationMessages.SIM_000108, simNew);
				}

				if (smnDMO == null) {
					thrower.business(ApplicationMessages.SIM_000108, simNew);
				} else {
					logger.debug(smnDMO.toString());

					/**
					 * Change reuired. If the sim was allocated check if the sim
					 * belongs to the same subscriber, if so simswap can
					 * proceed.
					 * 
					 * Then check if the transaction is pending in ASR, if so
					 * stop furth proccessing and return success, else create
					 * the ARS record.
					 */
					AsrAddServReqDMO asrCheckDMO = null;
					DAOIterator asrIt = null;

					if (!smnDMO.getSmnStatus().equals("0")) {
						// Check if correctly allocated
						if (!vamDMO.getVamSubscriberId().toString()
								.equals(smnDMO.getSmnAnalysis1())) {
							thrower.business(
									ApplicationMessages.SIM_000119,
									new Object[] { simNew,
											smnDMO.getSmnAnalysis1() });
						} else {
							// Subscriber matches, check if asr exists.

							try {
								asrIt = this.getAsrServiceRequest(
										vamDMO.getVamSubscriberId(), simOld);
							} catch (EPPIXSeriousException e) {
								logger.error(e.getMessage());
							}

							while (asrIt.hasNext()) {
								asrCheckDMO = (AsrAddServReqDMO) asrIt.next();

								logger.debug(asrCheckDMO.toString());

								if (asrCheckDMO.getAsrToSim().equals(simNew)
										&& asrCheckDMO.getAsrSimNo().equals(
												simOld)
										&& asrCheckDMO.getAsrActionType()
												.equals("SMSWP")) {
									// we have a valid asr record, do not create
									// new record.
									logger.debug("\nFOUND EXISTING ASR RECORD FOR THIS SIM SWAP");

									if ("N".equals(asrCheckDMO
											.getAsrActiveFlag())) {
										isValid = false;
									}

									break;
								}
							}
						}

						// thrower.business(ApplicationMessages.SIM_000111,
						// simNew);
					} else if (smnDMO.getSmnAnalysis1() != null
							&& !smnDMO.getSmnAnalysis1().isEmpty()) {
						// thrower.business(ApplicationMessages.SIM_000111,
						// simNew);
						// Check if correctly allocated
						if (!vamDMO.getVamSubscriberId().toString()
								.equals(smnDMO.getSmnAnalysis1())) {

							logger.debug("\nVAM SUB: "
									+ vamDMO.getVamSubscriberId()
									+ " SMN SUB: " + smnDMO.getSmnAnalysis1());

							thrower.business(
									ApplicationMessages.SIM_000119,
									new Object[] { simNew,
											smnDMO.getSmnAnalysis1() });
						} else {
							// Subscriber matches, check id asr exists.

							try {
								asrIt = this.getAsrServiceRequest(
										vamDMO.getVamSubscriberId(), simOld);
							} catch (EPPIXSeriousException e) {
								logger.error(e.getMessage());
							}

							while (asrIt.hasNext()) {
								asrCheckDMO = (AsrAddServReqDMO) asrIt.next();

								logger.debug(asrCheckDMO.toString());

								if (asrCheckDMO.getAsrToSim().equals(simNew)
										&& asrCheckDMO.getAsrSimNo().equals(
												simOld)
										&& asrCheckDMO.getAsrActionType()
												.equals("SMSWP")) {
									// we have a valid asr record, do not create
									// new record.
									logger.debug("\nFOUND EXISTING ASR RECORD FOR THIS SIM SWAP");

									if ("N".equals(asrCheckDMO
											.getAsrActiveFlag())) {
										isValid = false;
									}
									break;
								}
							}
						}
					}
				}

				try {
					rcDMO = this.getReasonCode(rcCode, "SIM_SWAP");

					if (rcDMO == null) {
						thrower.business(ApplicationMessages.SIM_000112,
								new Object[] { rcCode, "sim_swap" });
					}

				} catch (EPPIXSeriousException e) {
					thrower.business(ApplicationMessages.SIM_000112,
							new Object[] { rcCode, "sim_swap" });
				}
			}

			if (type.equals("suspend")) {

				if (!vamDMO.getVamStatCode().equals("1")) {
					thrower.business(ApplicationMessages.SIM_000113, simOld);
				}

				try {
					rcDMO = this.getReasonCode(rcCode, "SIM_DEACT_TEMP");

					if (rcDMO == null) {
						thrower.business(ApplicationMessages.SIM_000112,
								new Object[] { rcCode, "suspend" });
					}

				} catch (EPPIXSeriousException e) {
					thrower.business(ApplicationMessages.SIM_000112,
							new Object[] { rcCode, "suspend" });
				}
			}

			if (type.equals("unsuspend")) {
				if (!vamDMO.getVamStatCode().equals("4")) {
					thrower.business(ApplicationMessages.SIM_000114, simOld);
				}

				try {
					rcDMO = this.getReasonCode(rcCode, "SIM_REACTIVATE");

					if (rcDMO == null) {
						thrower.business(ApplicationMessages.SIM_000112,
								new Object[] { rcCode, "unsuspend" });
					}

				} catch (EPPIXSeriousException e) {
					thrower.business(ApplicationMessages.SIM_000112,
							new Object[] { rcCode, "unsuspend" });
				}

				DAOIterator it = null;

				try {
					it = this.getAsrServiceRequest(vamDMO.getVamSubscriberId(),
							simOld);
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());
				}

				if (it != null) {
					isValid = false;
					while (it.hasNext()) {
						AsrAddServReqDMO asrDmo = (AsrAddServReqDMO) it.next();
						logger.debug("PARTNER ID: "
								+ asrDmo.getAsrHandsetModel()
								+ " PARTNERID REQUEST: " + partnerId);
						logger.debug("ACTION TYPE: "
								+ asrDmo.getAsrActionType());

						/**
						 * Change 15-02-2019 Remove check on partnerId as it may
						 * not exists
						 */

						// if(asrDmo.getAsrHandsetModel().equals(partnerId) &&
						// asrDmo.getAsrActionType().equals("SMDEA")){
						// isValid = true;
						// break;
						// }

						if (asrDmo.getAsrActionType().equals("SMDEA")) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						thrower.business(ApplicationMessages.SIM_000115);
					}
				}
			}
		}

		return isValid;
	}

	private void doValidationRetailSim(String simNo, String userType,
			String userId, String reasonCode, String simAction, Date actionDate)
			throws EPPIXBusinessException {

		logger.debug("\nString simNo: " + simNo + "\nString userType: "
				+ userType + "\nString userId: " + userId
				+ "\nString reasonCode: " + reasonCode + "\nString simAction: "
				+ simAction);

		String[] accountStatus = null;
		String accountNo = null;
		String acStatus = null;
		String accountFraud = null;
		Date currentDate = new Date();

		try {
			thrower.ifParameterMissing("simNo", simNo);
			thrower.ifParameterMissing("userType", userType);
			thrower.ifParameterMissing("userId", userId);
			thrower.ifParameterMissing("reasonCode", reasonCode);
			thrower.ifParameterMissing("simAction", simAction);
			thrower.ifParameterMissing("actionDate", actionDate);
		} catch (EPPIXSeriousException e1) {
			thrower.business(e1.getErrorCode(), e1.getMessage());
		}


		vamDMO = this.getVamFromSim(simNo, null);

		if (vamDMO == null) {
			logger.error("\nNo active record was found for simNo (" + simNo
					+ ")");
			thrower.business(ApplicationMessages.MSIM_000100, simNo);
		} else {
			if (!"1".equals(vamDMO.getVamStatCode())
					&& !"4".equals(vamDMO.getVamStatCode())) {
				logger.error("\nNo active record was found for simNo (" + simNo
						+ ")");
				thrower.business(ApplicationMessages.MSIM_000100, simNo);
			}
		}

		try {
			accountStatus = this.getAuxSbdAccountActive(vamDMO
					.getVamSubscriberId());
		} catch (EPPIXSeriousException e) {
			logger.error("\nNo active account was found for simNo (" + simNo
					+ ")");
			thrower.business(ApplicationMessages.MSIM_000103, simNo);
		}

		accountNo = accountStatus[0];
		acStatus = accountStatus[1];
		accountFraud = accountStatus[2];
		
		logger.debug("\naccountNo: " + accountNo + ": acStatus: " + acStatus + ": accountFraud: " + accountFraud);

		if (!"OPN".equals(acStatus)) {
			logger.error("\nNo active account was found for simNo (" + simNo
					+ ")");
			thrower.business(ApplicationMessages.MSIM_000103, simNo);
		} 

		if (!"NEW".equals(accountFraud) && !"STANDARD".equals(accountFraud)) {
			logger.error("\nThe account is not active for SIM (" + simNo + ")");
			thrower.business(ApplicationMessages.MSIM_000106, simNo);
		}

		if ("SUSPEND".equals(simAction)) {
			/**
			 * Validate that the sim is in the correct status to be suspended
			 * If(vam_stat_code <> 1) Return error Sim($0) not active, suspend
			 * failed
			 */
			
			if(currentDate.after(actionDate)) {
				thrower.business(ApplicationMessages.MSIM_000115, simNo);
			}
			
			if (!"1".equals(vamDMO.getVamStatCode())) {
				logger.error("\nNo active account was found for simNo ("
						+ simNo + ")");
				thrower.business(ApplicationMessages.MSIM_000103, simNo);
			}

			/**
			 * Validate the suspension reason code matches for the provided user
			 * type
			 * 
			 * Sting sql = “select * from tt_type_text where tt_group =
			 * RETAILSIM And tt_type = “userType”” Execute the sql return
			 * tt_type_text record.
			 * 
			 * If not found Return error “The user type (userType provided) is
			 * invalid” Stop further processing.
			 */

			ttDMO = this.getTtTypeText("RETAILSIM", userType);

			if (ttDMO == null) {
				logger.error("\nThe user type (" + userType + ") is invalid");
				thrower.business(ApplicationMessages.MSIM_000112, userType);
			}

			/**
			 * If (tt_type_text.tt_text = “SELF” And reasonCode <> “SSST” or
			 * “SSSS” or “FRAU” or “FRTD” or “IVRR”) Return error reason($0) is
			 * invalid for this channel, suspend failed
			 * 
			 * Stop further processing.
			 */

			if ("SELF".equals(ttDMO.getTtText())) {
				if (!"SSST".equals(reasonCode) && !"SSSS".equals(reasonCode)
//						&& !"FRAU".equals(reasonCode)
//						&& !"FRTD".equals(reasonCode)
						&& !"IVRR".equals(reasonCode)) {
					logger.error("\nreason(" + reasonCode
							+ ") is invalid for this channel, suspend failed");
					thrower.business(ApplicationMessages.MSIM_000113,
							reasonCode);
				}
			} else {

				/**
				 * If (tt_type_text.tt_text <> “SELF”)
				 * 
				 * Sting sql = “select * from rc_reason_code where rc_code =
				 * reasonCode” Execute the sql return rc_reason_code record.
				 * 
				 * If not found Return error “The reason code (reasonCode provided)
				 * is invalid” Stop further processing.
				 */

				try {
					rcDMO = this.getReasonCode(reasonCode, "SIM_DEACT_TEMP");

					if (rcDMO == null) {
						logger.error("\nThe reason code (" + reasonCode
								+ ") is invalid, suspend failed");
						thrower.business(ApplicationMessages.MSIM_000113,
								reasonCode);
					}
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());
					logger.error("\nThe reason code (" + reasonCode
							+ ") is invalid, suspend failed");
					thrower.business(ApplicationMessages.MSIM_000113,
							reasonCode);
				}

			}

		} else if ("UNSUSPEND".equals(simAction)) {
			/**
			 * For SIM unsuspends
			 * 
			 * Validate that the sim is in the correct status to be unsuspended
			 * If( vam_stat_code <> 4) Return error Sim($0) not active,
			 * unsuspend failed
			 */
			
			if(currentDate.after(actionDate)) {
				thrower.business(ApplicationMessages.MSIM_000117, simNo);
			}
			

			if (!"4".equals(vamDMO.getVamStatCode())) {
				logger.error("\nSim(" + simNo
						+ ") is not suspended, unsuspend failed");
				thrower.business(ApplicationMessages.MSIM_000114, simNo);
			}

			/**
			 * Validate the SIM was not originally suspended for fraud or
			 * suspected fraud
			 * 
			 * Sting sql = “select FIRST 1 smh_sim_history.*from smh_sim_history
			 * where smh_subscriber_id = vam_active_msisdn.vam_subscriber_id
			 * (fetched earlier) and smh_sim_no = (sim provided) and
			 * smh_hist_code = "ETD" order by smh_timestamp desc
			 * 
			 * If smh_comment [6,9 ] in (“FRTD “ , “FRAU”) the it was suspended
			 * for either Suspected Fraud or Fraud return error “The channel is
			 * not valid for the unsuspend action”
			 * 
			 * Stop further processing.
			 */
			
			try {
				rcDMO = this.getReasonCode(reasonCode, "SIM_REACTIVATE");

				if (rcDMO == null) {
					logger.error("\nThe reason code (" + reasonCode
							+ ") is invalid, unsuspend failed");
					thrower.business(ApplicationMessages.MSIM_000127,
							reasonCode);
				}
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				logger.error("\nThe reason code (" + reasonCode
						+ ") is invalid, suspend failed");
				thrower.business(ApplicationMessages.MSIM_000127,
						reasonCode);
			}
			
			StringDMO sDMO = null;

			try {
				sDMO = this.simAPNServicesDAC.getSmhHistory(
						vamDMO.getVamSubscriberId(), simNo);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
			
			if(sDMO != null) {
					logger.debug("\nsDMO.getSmhComment(): " + sDMO.getString());
					if(sDMO.getString().length() < 9){
						logger.debug("\nsDMO.getSmhComment()Substring: " + sDMO.getString().substring(5, sDMO.getString().length()));
						
						if (sDMO.getString().substring(5, sDMO.getString().length()).equals("FRTD")
								|| sDMO.getString().substring(5, sDMO.getString().length()).equals("FRAU")) {
							logger.error("\nSim(" + simNo + ") cannot be  unsuspended by this channel");
							thrower.business(ApplicationMessages.MSIM_000108, simNo);
						}
					}else{
						logger.debug("\nsDMO.getSmhComment()Substring: " + sDMO.getString().substring(5, 9));
						
						if (sDMO.getString().substring(5, 9).equals("FRTD")
								|| sDMO.getString().substring(5, 9).equals("FRAU")) {
							logger.error("\nSim(" + simNo + ") cannot be  unsuspended by this channel");
							thrower.business(ApplicationMessages.MSIM_000108, simNo);
						}
					}
			}
			
			SmhSimHistoryDMO smhDmo = null;
			smhDmo = this.getSmh(vamDMO.getVamSubscriberId(), simNo);
			
			if (smhDmo == null) {
				logger.error("\nThe suspension user may not lifted by this user");
				thrower.business(ApplicationMessages.MSIM_000118, reasonCode);
			}

			/**
			 * Validate the unsuspend reason code matches for the provided user
			 * type
			 * 
			 * Sting sql = “select * from tt_type_text where tt_group =
			 * RETAILSIM And tt_type = “userType”” Execute the sql return
			 * tt_type_text record.
			 * 
			 * If not found Return error “The user type (userType provided) is
			 * invalid” Stop further processing.
			 */
			
			

			ttDMO = this.getTtTypeText("RETAILSIM", userType);

			if (ttDMO == null) {
				logger.error("\nThe user type (" + userType + ") is invalid");
				thrower.business(ApplicationMessages.MSIM_000112, userType);
			}

			/**
			 * userType = “SELF”
			 * 
			 * Validate the SIM suspension reason allows for self-service
			 * unsuspend If smh_comment [6,9 ] in (“SSST “, “SSSS”, “IVRR”)
			 * 
			 * If not valid Return error “The suspension user may not lifted by
			 * this user” Stop further processing.
			 */
			
			logger.debug(ttDMO.getTtText());
			

			if ("SELF".equals(ttDMO.getTtText())) {
				if (sDMO != null) {
					logger.debug("\nsDMO.getSmhComment(): " + sDMO.getString());
					if(sDMO.getString().length() < 9){
						logger.debug("\nsDMO.getSmhComment()Substring: " + sDMO.getString().substring(5, sDMO.getString().length()));
						
						if (!sDMO.getString().substring(5, sDMO.getString().length()).equals("SSST")
								&& !sDMO.getString().substring(5, sDMO.getString().length()).equals("SSSS")
									&& !sDMO.getString().substring(5, sDMO.getString().length()).equals("IVRR")) {
							logger.error("\nThe channel is not valid for the unsuspend action");
							thrower.business(ApplicationMessages.MSIM_000118, simNo);
						}
					}else{
						logger.debug("\nsDMO.getSmhComment()Substring: " + sDMO.getString().substring(5, 9));
						
						if (!sDMO.getString().substring(5, 9).equals("SSST")
								&& !sDMO.getString().substring(5, 9).equals("SSSS")
									&& !sDMO.getString().substring(5, 9).equals("IVRR")) {
							logger.error("\nThe channel is not valid for the unsuspend action");
							thrower.business(ApplicationMessages.MSIM_000118, simNo);
						}
					}
				}else{
					logger.error("\nThe suspension user may not lifted by this user");
					thrower.business(ApplicationMessages.MSIM_000118, reasonCode);
				}
			}

			/**
			 * Validate unsuspend reason code is valid If (tt_type_text.tt_text
			 * = “SELF” And reasonCode <> “SSPF” or “SSUS” ) Return error
			 * Reason($0) is invalid for this channel, unsuspend failed Stop
			 * further processing.
			 * 
			 * userType <> “SELF” (dealer, csr_usr) If (tt_type_text.tt_text <>
			 * “SELF”) Validate unsuspend reason code is valid
			 * 
			 * If (tt_type_text.tt_text <> “SELF” And reasonCode in (“REPL”,
			 * “REAS” )) Return error Reason($0) is invalid for this channel,
			 * unsuspend failed Stop further processing.
			 * 
			 * Changed: 08-10-2019
			 * Allow all reason type, only limit if "SELF"
			 * 
			 */

			if ("SELF".equals(ttDMO.getTtText())) {
				if (!"SSPF".equals(reasonCode) && !"SSUS".equals(reasonCode)) {
					logger.error("\nThe reason code (" + reasonCode + ") is invalid for this channel, unsuspend failed");
					thrower.business(ApplicationMessages.MSIM_000113, reasonCode);
				}
//			} else {
//				/**
//				 * Changed, should not allow reason codes "REPL" and "REAS"
//				 */
//				if ("REPL".equals(reasonCode) || "REAS".equals(reasonCode)) {
//					logger.error("\nThe reason code ($0)is invalid for this channel, unsuspend failed");
//					thrower.business(ApplicationMessages.MSIM_000113, reasonCode);
//				}
			}

			/**
			 * Validate the SIM was suspended by the same user If
			 * smh_subscriber_id <> userId then return error “The user id ($0)
			 * is not valid for the unsuspend action”
			 * 
			 * Changed: 08-10-2019
			 * 
			 * Pius Maduna [ MTN South Africa ] 04-10-2019
			 * 
			 * CSR and Dealer may unsuspend any suspended sim.
			 * Can  the CSR unsuspend any subscriber’s sim, with any suspension reason on Eppix/MyCustomer? 
			 * YES for consumer and small business accounts and not for MTN Staff 
			 * 
			 * Can a SIM suspended by one dealer be reactivated by another dealer? YES
			 */
			
			Integer newUserId = null;
			
			if ("SELF".equals(ttDMO.getTtText())) {
				

				try {
					newUserId = new Integer(userId);
				} catch (NumberFormatException e) {
					logger.error("\nThe user id (" + userId + ") is not valid for the unsuspend action\"");
					thrower.business(ApplicationMessages.MSIM_000119, userId);
				}
				
				if (!smhDmo.getSmhSubscriberId().equals(newUserId)) {
					logger.error("\nThe user id (" + userId + ") is not valid for the unsuspend action\"");
					thrower.business(ApplicationMessages.MSIM_000119, userId);
				}
			}
		}
	}

	private VamActiveMsisdnDMO getVamFromSim(String sim, String statCode) {

		VamActiveMsisdnDMO vamDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamSimNoFilter, sim);
	
//		if(statCode != null){
//			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamStatCodeFilter,
//				statCode);
//		}

		try {
			vamDmo = base.vamActiveMsisdn().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		return vamDmo;

	}

	private VamActiveMsisdnDMO getVamFromMsisdn(String msisdn, String statCode) {

		VamActiveMsisdnDMO vamDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter, msisdn);
		
//		if(statCode != null){
//			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamStatCodeFilter,
//				statCode);
//		}

		try {
			vamDmo = base.vamActiveMsisdn().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		return vamDmo;
	}

	private DAOIterator getVamFromSubscriber(String subscriberId, String statCode) {

		VamActiveMsisdnDMO vamDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamSubscriberIdFilter,
				subscriberId);
		
//		if(statCode != null){
//			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamStatCodeFilter,
//				statCode);
//		}
		
		DAOIterator it = null;

		try {
			it = base.vamActiveMsisdn().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		return it;
	}

	private SbdSubDetsDMO getSbd(Integer subscriberId) {
		SbdSubDetsDMO sbdDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
				subscriberId);

		try {
			sbdDmo = base.sbdSubDets().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		return sbdDmo;
	}

	private AuxCustomersDMO getAux(String accountNo) {
		AuxCustomersDMO auxDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, AuxCustomersDMO.billAcNoFilter, accountNo);

		try {
			auxDmo = base.auxCustomers().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		return auxDmo;
	}

	private DAOIterator getAsrServiceRequest(Integer subscriberID, String sim)
			throws EPPIXSeriousException {

		DAOIterator asrIT = null;

		/**
		 * Retrieve service request if exists This is to get the ASR record if
		 * exists to get the transaction id
		 * 
		 */

		try {
			asrIT = this.simAPNServicesDAC.getAsrBySubscriberSim(subscriberID,
					sim);
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to get ASR for subscriber: " + subscriberID
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to get ASR for subscriber: " + subscriberID + " "
							+ e.getMessage());
		}

		// while (asrIT.hasNext()) {
		// asrDMO = asrIT.next();
		// break;
		// }

		return asrIT;
	}

	private void createAsr(AsrAddServReqDMO dmo) throws EPPIXSeriousException {

		try {

			base.asrAddServReq().create(dmo);

		} catch (EPPIXFatalException e) {
			logger.error("Failed to create ASR record for Subscriber: "
					+ dmo.getAsrSubscriberId() + " " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to create ASR record for Subscriber: "
							+ dmo.getAsrSubscriberId() + " " + e.getMessage());
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to create ASR record for Subscriber: "
					+ dmo.getAsrSubscriberId() + " " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to create ASR record for Subscriber: "
							+ dmo.getAsrSubscriberId() + " " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to create ASR record for Subscriber: "
					+ dmo.getAsrSubscriberId() + " " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to create ASR record for Subscriber: "
							+ dmo.getAsrSubscriberId() + " " + e.getMessage());
		}

	}

	private SmnSimNosDMO getSmnDMO(String simNo) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNo);
		SmnSimNosDMO smnDMO = null;

		try {
			smnDMO = base.smnSimNos().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get SMN for sim: " + simNo + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("Failed to get SMN for sim: "
					+ simNo + " " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get SMN for sim: " + simNo + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("Failed to get SMN for sim: "
					+ simNo + " " + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get SMN for sim: " + simNo + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("Failed to get SMN for sim: "
					+ simNo + " " + e.getMessage());
		}

		return smnDMO;
	}

	private void updateSmn(Integer subscriberId, String simNew, String status)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.SET, SmnSimNosDMO.smnStatusFilter, status);
		filter.add(FilterOp.SET, SmnSimNosDMO.smnAnalysis1Filter, subscriberId);
		filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNew);

		try {
			base.smnSimNos().modify(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to updATE SMN for sim: " + simNew + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("Failed to updATE SMN for sim: "
					+ simNew + " " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to updATE SMN for sim: " + simNew + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("Failed to updATE SMN for sim: "
					+ simNew + " " + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Failed to updATE SMN for sim: " + simNew + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("Failed to updATE SMN for sim: "
					+ simNew + " " + e.getMessage());
		}
	}

	private void createSimHistory(Integer subscriberId, String simNo,
			String scode, String sval) throws EPPIXSeriousException {

		thrower.ifParameterMissing("subscriberId", subscriberId);
		thrower.ifParameterMissing("simNo", simNo);
		thrower.ifParameterMissing("scode", scode);
		thrower.ifParameterMissing("sval", sval);

		SmhSimHistoryDMO smhDMO = new SmhSimHistoryDMO();
		smhDMO.setSmhComment(sval);
		smhDMO.setSmhHistCode(scode);
		smhDMO.setSmhSubscriberId(subscriberId);
		smhDMO.setSmhSimNo(simNo);
		smhDMO.setSmhUserId(this.getUserName());
		smhDMO.setSmhTerminalId(this.getHostName());
		smhDMO.setSmhTimestamp(new DateTime());

		try {

			base.smhSimHistory().create(smhDMO);
		} catch (EPPIXBusinessException e) {
			logger.fatal("Insert into smhSimHistory FAILED for SIM: " + simNo
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Insert into smhSimHistory FAILED for SIM: " + simNo
							+ " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.fatal("Insert into smhSimHistory FAILED for SIM: " + simNo
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Insert into smhSimHistory FAILED for SIM: " + simNo
							+ " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.fatal("Insert into smhSimHistory FAILED for SIM: " + simNo
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Insert into smhSimHistory FAILED for SIM: " + simNo
							+ " EXCEPTION: " + e);
		}

	}

	protected void createSubscriberHistory(Integer subscriberId,
			Integer fieldId, String histCode, String oldValue, String newValue)
			throws EPPIXSeriousException {

		SbhSubHistoryDMO sbhDMO = new SbhSubHistoryDMO();
		sbhDMO.setSbhSubscriberId(subscriberId);
		sbhDMO.setSbhFieldId(fieldId);
		sbhDMO.setSbhHistCode(histCode);
		sbhDMO.setSbhOldValue(oldValue);
		sbhDMO.setSbhNewValue(newValue);
		sbhDMO.setSbhUserId(this.getUserName());
		sbhDMO.setSbhTerminalId(this.getHostName());
		sbhDMO.setSbhTimestamp(new DateTime());

		try {
			base.sbhSubHistory().create(sbhDMO);
		} catch (EPPIXBusinessException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		} catch (EPPIXUnexpectedException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		} catch (EPPIXFatalException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		}
	}

	public RcReasonCodeDMO getReasonCode(String reasonCode, String reasonType)
			throws EPPIXSeriousException {

		thrower.ifParameterMissing("REASON CODE", reasonCode);

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, RcReasonCodeDMO.RcCodeFilter, reasonCode);
		RcReasonCodeDMO rcDmo = null;

		if (reasonType != null && !reasonType.equalsIgnoreCase("")) {
			filter.add(FilterOp.EQUAL, RcReasonCodeDMO.RcTypeFilter, reasonType);
		}

		try {
			rcDmo = base.rcReasonCode().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("EXCEPTION GETTING Reason Code " + reasonCode
					+ " in table rc_reason_code: " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("EXCEPTION GETTING Reason Code " + reasonCode
					+ " in table rc_reason_code: " + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("EXCEPTION GETTING Reason Code " + reasonCode
					+ " in table rc_reason_code: " + e.getMessage());
		}
		return rcDmo;
	}

	public boolean subscriberHasAPNService(Integer subscriberId) {
		VasActiveServiceDMO vasDMO = null;

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasSubscriberIdFilter,
				subscriberId);
		filter.add(FilterOp.LIKE, VasActiveServiceDMO.vasServiceCodeFilter,
				"APN%");

		try {
			vasDMO = base.vasActiveService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		if (vasDMO == null) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * 
	 * @param partnerId
	 * @param accountNo
	 * @param parentType
	 * @param childType
	 * @return
	 * @throws EPPIXSeriousException
	 * 
	 *             Parenttype and checild to check = "APNMANAGE"
	 */
	public EhEppixHierarchyDMO getScEhHH(String partnerId, String accountNo)
			throws EPPIXSeriousException {

		Integer scSerial = null;
		Integer hhSerial = null;
		ScSerialCustomerDMO scDMO = null;
		EhEppixHierarchyDMO ehDMO = null;
		HhHierarchyHeadDMO hhDMO = null;
		DAOIterator ehIT = null;
		EhHhDQO ehhhDQO = null;

		if (partnerId != null && partnerId.length() > 0) {
			// Get HH rekord for the part ner id.
			hhDMO = this.simAPNServicesDAC.getPartnerIdLinkHhEh(partnerId);

			if (hhDMO == null) {
				logger.error("Failed to get serial number for partner id: "
						+ partnerId);
				throw new EPPIXSeriousException("1",
						"Failed to get serial number for partner id: "
								+ partnerId);
			} else {
				hhSerial = hhDMO.getHhSerial();
			}
		}

		if (accountNo != null && accountNo.length() > 0) {
			scDMO = this.simAPNServicesDAC.getSerialCustomer(accountNo);

			if (scDMO == null) {
				logger.error("Failed to get serial number for account: "
						+ accountNo);
				throw new EPPIXSeriousException("1",
						"Failed to get serial number for account: " + accountNo);
			} else {
				scSerial = scDMO.getScSerial();
			}
		}

		// ## first check if there are any children for this serial.
		ehIT = this.simAPNServicesDAC.getEppixHierarchyByType(scSerial,
				hhSerial);

		if (ehIT == null) {
			logger.error("Serial: "
					+ scSerial
					+ " does not exist in table eh_eppix_hierarchy for eh_link "
					+ hhSerial);
			throw new EPPIXSeriousException(
					"1",
					"Serial: "
							+ scSerial
							+ " does not exist in table eh_eppix_hierarchy for eh_link "
							+ hhSerial);
		} else {
			while (ehIT.hasNext()) {
				ehDMO = (EhEppixHierarchyDMO) ehIT.next();
				// We have a matching record.
				break;
			}
		}

		ehIT.close();
		ehIT = null;

		return ehDMO;
	}

	private String[] getAuxSbdAccountActive(Integer subscriberId)
			throws EPPIXSeriousException {

		String sql = "select sbd_bill_ac_no, acc_status, aux_analysis_24 "
				+ "From sbd_sub_dets , aux_customers "
				+ "where sbd_subscriber_id = "	+ subscriberId	
				+ " and  bill_ac_no = sbd_bill_ac_no"
				+ " and acc_status = 'OPN' and aux_analysis_24 in ('NEW', 'STANDARD')";
		
		Statement st = null;
		ResultSet rs = null;
		String accountNo = null;
		String acStatus = null;
		String accountFraud = null;
		
		logger.debug("\n" + sql);

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				accountNo = rs.getString(1);
				acStatus = rs.getString(2);
				accountFraud = rs.getString(3);
				break;
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}
		
		if(accountNo != null){
			accountNo = accountNo.trim();
		}
		
		if(acStatus != null){
			acStatus = acStatus.trim();
		}
		
		if(accountFraud != null){
			accountFraud = accountFraud.trim();
		}

		return new String[] { accountNo, acStatus, accountFraud };

	}

	public BaseBLOBinder getBase() {
		return base;
	}

	public void setBase(BaseBLOBinder base) {
		this.base = base;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public EppixResponse simSuspend(String userName, String hostName,
			String language, String simNo, String userID, String userType,
			String reasonCode, Date actionDate) {
		
		this.setUserName(userName);
		this.setHostName(hostName);

		EppixResponse response = new EppixResponse();
		SbdSubDetsDMO sbdDMO = null;

		try {
			this.doValidationRetailSim(simNo, userType, userID, reasonCode,
					"SUSPEND", actionDate);
		} catch (EPPIXBusinessException e1) {
			logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
			response.setErrorType("1");
			response.setErrorCode(e1.getErrorCode());
			response.setEppixStatus("0");
			response.setIsamError(e1.getMessage());
			return response;
		}

		sbdDMO = this.getSbd(vamDMO.getVamSubscriberId());
		
		if(sbdDMO == null){
			try {
				thrower.business(this.MSIM_000102);
			} catch (EPPIXBusinessException e1) {
				logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
				response.setErrorType("1");
				response.setErrorCode(e1.getErrorCode());
				response.setEppixStatus("0");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}

		AsrAddServReqDMO dmo = new AsrAddServReqDMO();
		Calendar cal = Calendar.getInstance();

		dmo.setAsrTransactId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrSubscriberId(sbdDMO.getSbdSubscriberId());
		dmo.setAsrActiveFlag("N"); //
		dmo.setAsrSubscriberId(sbdDMO.getSbdSubscriberId());
		dmo.setAsrSimNo(simNo); // Sim no
		// dmo.setAsrToSim(simNo);
		dmo.setAsrBillAcNo(sbdDMO.getSbdBillAcNo()); //
		dmo.setAsrPackageCode(sbdDMO.getSbdPackageCode()); //
		dmo.setAsrServiceCode("NONE");
		dmo.setAsrSubmitDate(new DateTime(actionDate)); //
		dmo.setAsrActionType("SMDEA");
		dmo.setAsrActReasCode(reasonCode);
		dmo.setAsrDeactType("TEMP");
		dmo.setAsrSystemReq(this.getHostName());
		dmo.setAsrComments("Self Service Suspend");
		
//		dmo.setAsrHandsetMake(sbdDMO.getSbdSubscriberId().toString() + "_"
//				+ dtFormat.format(cal.getTime()));
		// 12-11-2019-Fixed to asr_handset_make	userId
		
		dmo.setAsrHandsetMake(userID);
		dmo.setAsrHandsetModel(userType);
		dmo.setAsrFileId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrParamId(new Integer("0"));
		dmo.setAsrParamValue("NONE");

		try {
			this.createAsr(dmo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
			try {
				thrower.business(ApplicationMessages.SIM_000201);
			} catch (EPPIXBusinessException e1) {
				response.setErrorType("2");
				response.setErrorCode(e1.getErrorCode());
				response.setEppixStatus("0");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}

		response.setErrorType("0");
		response.setErrorCode("0");
		response.setEppixStatus("0");
		response.setIsamError("SUCCESS");

		return response;
	}

	public EppixResponse unsuspend(String userName, String hostName,
			String language, String simNo, String userID, String userType,
			String reasonCode, Date actionDate) {
		
		this.setUserName(userName);
		this.setHostName(hostName);

		EppixResponse response = new EppixResponse();

		try {
			this.doValidationRetailSim(simNo, userType, userID, reasonCode,
					"UNSUSPEND", actionDate);
		} catch (EPPIXBusinessException e1) {
			logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
			response.setErrorType("1");
			response.setErrorCode(e1.getErrorCode());
			response.setEppixStatus("0");
			response.setIsamError(e1.getMessage());
			return response;
		}

		sbdDMO = this.getSbd(vamDMO.getVamSubscriberId());

		AsrAddServReqDMO dmo = new AsrAddServReqDMO();
		Calendar cal = Calendar.getInstance();

		dmo.setAsrTransactId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrSubscriberId(sbdDMO.getSbdSubscriberId());
		dmo.setAsrActiveFlag("N"); //
		// dmo.setAsrMsisdnNo(msisdn); //
		dmo.setAsrSimNo(simNo); // Sim no
		dmo.setAsrToSim(simNo);
		dmo.setAsrBillAcNo(sbdDMO.getSbdBillAcNo()); //
		dmo.setAsrPackageCode(sbdDMO.getSbdPackageCode()); //
		dmo.setAsrServiceCode("NONE");
		dmo.setAsrSubmitDate(new DateTime(actionDate)); //
		dmo.setAsrActionType("SMREA");
		dmo.setAsrActReasCode(reasonCode);
		dmo.setAsrDeactType("TEMP");
		dmo.setAsrSystemReq(this.getHostName());
		dmo.setAsrComments("Self Service UNSUSPEND SIM");
		dmo.setAsrHandsetMake(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime()));
		dmo.setAsrHandsetModel(userType);
		dmo.setAsrFileId(sbdDMO.getSbdSubscriberId().toString() + "_"
				+ dtFormat.format(cal.getTime())); //

		dmo.setAsrParamId(new Integer("0"));
		dmo.setAsrParamValue("NONE");

		try {
			this.createAsr(dmo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
			try {
				thrower.business(ApplicationMessages.SIM_000201);
			} catch (EPPIXBusinessException e1) {
				logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
				response.setErrorType("2");
				response.setErrorCode(e1.getErrorCode());
				response.setEppixStatus("0");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}

		response.setErrorType("0");
		response.setErrorCode("0");
		response.setEppixStatus("0");
		response.setIsamError("SUCCESS");

		return response;
	}

	public SimFutureEvent simGetFutureEvent(String userName, String hostName,
			String language, String simNo, String subscriberId, String msisdn) {

		SimFutureEvent response = new SimFutureEvent();

		/**
		 * Validate input parameters are valid
		 * 
		 * IF LENGTH(subscriberId = 0) Then If LENGTH(simNo = 0) Then IF
		 * LENGTH(msisdn = 0) Then Return error "at least one search parameter
		 * must be provided” Stop further processing
		 */

		if ((subscriberId == null || subscriberId.isEmpty())
				&& (simNo == null || simNo.isEmpty())
				&& (msisdn == null || msisdn.isEmpty())) {

			logger.error("\nALL SUBSCRIBER(" + subscriberId + "), SIMNO("
					+ simNo + ") AND MSISDN(" + msisdn + ") CANNOT BE NULL: ");
			try {
				thrower.business(MSIM_000120);
			} catch (EPPIXBusinessException e) {
				logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
				response.setErrorType("1");
				response.setErrorCode(e.getErrorCode());
				response.setEppixStatus("0");
				response.setIsamError(e.getMessage());
			}
		}

		/**
		 * Check for any future event IF LENGTH(subscriber > 0) then String sql
		 * = “Select * from sfe_sim_fut_event where sfe_subscriber_id =
		 * subscriberId And sfe_event_date > TODAY IF LENGTH(sim > 0) then String
		 * sql = “Select * from sfe_sim_fut_event where sfe_sim_no = simNo And
		 * sfe_event_date > TODAY IF LENGTH(msisdn > 0) then Get sim number
		 * String sql = “Select * from vam_active_msisdn where vam_msisdn_no =
		 * msisdn Execute the sql returning vam_actvie_msisdn record. String sql
		 * = “Select * from sfe_sim_fut_event where sfe_sim_no =
		 * vam_actvie_msisdn.vam_sim_no And sfe_event_date > TODAY
		 * 
		 * Execute the sql returning sfe_sim_fut_event record.
		 * 
		 * If not found Return “No future record was found for simNo (sim
		 * provided or retrieved)” Stop further processing
		 * 
		 * If found return the future event record
		 */

		SfeSimFutEventDMO sfeDMO = null;
		
		/**
		 * idf the MSISDN was passed in , then first get vam record and use the sim for the search
		 */
		
		if(msisdn != null && !msisdn.isEmpty()){
			// search is on MSISDN
			
			this.vamDMO = this.getVamFromMsisdn(msisdn, null);
			
			if(vamDMO == null){
				// invalid MSISDN 
				try {
					thrower.business(this.MSIM_000123, msisdn);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
					response.setErrorType("1");
					response.setErrorCode(e.getErrorCode());
					response.setEppixStatus("0");
					response.setIsamError(e.getMessage());
					return response;
				}
			}else{
				sfeDMO = this.getSfeFutureEvent(null, vamDMO.getVamSimNo());
			}
		}else{
			sfeDMO = this.getSfeFutureEvent(subscriberId, simNo);
		}

		if (sfeDMO == null) {

			logger.error("\nNo future record was found for subscriberId(" + subscriberId
					+ "), SIMNO(" + simNo + ") AND MSISDN(" + msisdn
					+ ")");
			if (subscriberId != null && !subscriberId.isEmpty()) {
				try {
					thrower.business(this.MSIM_000121, subscriberId);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
					response.setErrorType("1");
					response.setErrorCode(e.getErrorCode());
					response.setEppixStatus("0");
					response.setIsamError(e.getMessage());
					return response;
				}
			} else if (simNo != null && !simNo.isEmpty()) {
				try {
					thrower.business(this.MSIM_000122, simNo);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
					response.setErrorType("1");
					response.setErrorCode(e.getErrorCode());
					response.setEppixStatus("0");
					response.setIsamError(e.getMessage());
					return response;
				}
			} else if (msisdn != null && !msisdn.isEmpty()) {
				try {
					thrower.business(this.MSIM_000123, msisdn);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
					response.setErrorType("1");
					response.setErrorCode(e.getErrorCode());
					response.setEppixStatus("0");
					response.setIsamError(e.getMessage());
					return response;
				}
			} else {
				return null;
			}
		}

		response.setErrorType("0");
		response.setErrorCode("0");
		response.setEppixStatus("0");
		response.setIsamError("SUCCESS");
		response.setEventDate((sfeDMO.getSfeDventDate() == null) ? "": dtFormatyyymmdd.format(sfeDMO.getSfeDventDate()).toString());
		response.setEventId(sfeDMO.getSfeFutEventId());
		response.setMsisdn(vamDMO.getVamMsisdnNo());
		response.setSimNo(sfeDMO.getSfeSimNo());
		response.setSubscriberId(sfeDMO.getSfeSubscriberId().toString());

		return response;
	}

	public SimArray simList(String userName, String hostName, String language,
			String simNo, String subscriberId, String msisdn, String statcode) {

		SimArray response = new SimArray();
		String vamStatus = null;
		boolean statusFound = false;
		String valToSearch = null;
		DAOIterator itVAM = null;
		boolean isIterator = false;
		VamActiveMsisdnDMO vamDmo = null;
		SmhSimHistoryDMO smhDMO = null;
		RcReasonCodeDMO rcDMO = null;

		/**
		 * ] Validate input parameters are valid
		 * 
		 * IF LENGTH(subscriberId = 0) Then If LENGTH(simNo = 0) Then IF
		 * LENGTH(msisdn = 0) Then Return error "at least one search parameter
		 * must be provided” Stop further processing
		 */
		if ((subscriberId == null || subscriberId.isEmpty())
				&& (simNo == null || simNo.isEmpty())
				&& (msisdn == null || msisdn.isEmpty())) {

			logger.error("\nALL SUBSCRIBER(" + subscriberId + "), SIMNO("
					+ simNo + ") AND MSISDN(" + msisdn + ") CANNOT BE NULL: ");
			try {
				thrower.business(MSIM_000120);
			} catch (EPPIXBusinessException e) {
				logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
				response.setErrorType("1");
				response.setErrorCode(e.getErrorCode());
				response.setEppixStatus("0");
				response.setIsamError(e.getMessage());
				return response;
			}
		}

		/**
		 * IF LENGTH(status = 0) Return error "Mandatory parameter status must
		 * be provided” Stop further processing
		 * 
		 * Determine the status code to search for. IF statcode = ‘A’ set
		 * vam_status = “1” IF statcode = ‘S’ set vam_status = ‘4, IF statcode =
		 * ‘T’ set vam_status = ‘6’ IF statcode = ’L’ search for all and do not
		 * apply filter
		 */

		try {
			thrower.ifParameterMissing("statcode", statcode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
			response.setErrorType("1");
			response.setErrorCode(e.getErrorCode());
			response.setEppixStatus("0");
			response.setIsamError(e.getMessage());
			return response;
		}

		if ("A".equals(statcode)) {
			vamStatus = "1";
		} else if ("S".equals(statcode)) {
			vamStatus = "4";
		} else if ("T".equals(statcode)) {
			vamStatus = "6";
		} else if ("L".equals(statcode)) {
			vamStatus = null;
		} else {
			// Invalid stat Code received
			try {
				thrower.business(MSIM_000124, statcode);
			} catch (EPPIXBusinessException e) {
				logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
				response.setErrorType("1");
				response.setErrorCode(e.getErrorCode());
				response.setEppixStatus("0");
				response.setIsamError(e.getMessage());
				return response;
			}
		}

		/**
		 * Get the record details depending on the parameters provided String
		 * sql = “Select * from vam_active_msisdn where vam_subscriber_id =
		 * subscriberId (if provided) And vam_sim_no = simNo (if provided) And
		 * vam_msisdn_no = msisdn (if provided) And vam_status_code = vam_status
		 * (only if statcode <> ‘L’) “
		 * 
		 * If not found Return error “No record was found for $0 (parameter
		 * provided)” Stop further processing
		 * 
		 * If searching by subscriber id only then multiple records may be
		 * returned e.g. for dual call or esim. In such a scenario the loop and
		 * build the record array for each msisdn and sim returned.
		 */

		if (subscriberId != null && !subscriberId.isEmpty()) {
			itVAM = this.getVamFromSubscriber(subscriberId, vamStatus);

			if (itVAM == null) {
				try {
					thrower.business(MSIM_000125, subscriberId);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
					response.setErrorType("1");
					response.setErrorCode(e.getErrorCode());
					response.setEppixStatus("0");
					response.setIsamError(e.getMessage());
					return response;
				}
			} else {

				if (itVAM.hasNext()) {
					isIterator = true;
				} else {
					try {
						thrower.business(MSIM_000125, subscriberId);
					} catch (EPPIXBusinessException e) {
						logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
						response.setErrorType("1");
						response.setErrorCode(e.getErrorCode());
						response.setEppixStatus("0");
						response.setIsamError(e.getMessage());
						return response;
					}
				}
			}
		} else if (simNo != null && !simNo.isEmpty()) {
			this.vamDMO = this.getVamFromSim(simNo, vamStatus);

			if (this.vamDMO == null) {
				try {
					thrower.business(MSIM_000125, simNo);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
					response.setErrorType("1");
					response.setErrorCode(e.getErrorCode());
					response.setEppixStatus("0");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
			
			itVAM = this.getVamFromSubscriber(vamDMO.getVamSubscriberId().toString(), vamStatus);
			isIterator = true;
			valToSearch = simNo;
			
		} else if (msisdn != null && !msisdn.isEmpty()) {
			this.vamDMO = this.getVamFromMsisdn(msisdn, vamStatus);

			if (this.vamDMO == null) {
				try {
					thrower.business(MSIM_000125, msisdn);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
					response.setErrorType("1");
					response.setErrorCode(e.getErrorCode());
					response.setEppixStatus("0");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
			
			
			itVAM = this.getVamFromSubscriber(vamDMO.getVamSubscriberId().toString(), vamStatus);
			isIterator = true;
			valToSearch = msisdn;
		}

		/**
		 * Set subscriberId = vam_subscriber_id Set simNo = vam_sim_no Set
		 * msisdn = vam_msisdn_no Set connectDate = vam_connect_date Set
		 * disConnectDate = vam_dconnect_date
		 */
		
		/**
		 * Change to apply all records returned for subscribers where multiple 
		 * exists.
		 */


		if (isIterator) {
			while (itVAM.hasNext()) {
				this.vamDMO = (VamActiveMsisdnDMO) itVAM.next();

				SimDetails details = new SimDetails();
				details.setSubscriberId(this.vamDMO.getVamSubscriberId()
						.toString());
				details.setDisConnectDate((vamDMO.getVamDconnectDate() == null) ? "" : dtFormatyyymmdd.format(vamDMO.getVamDconnectDate()));
				details.setMsisdn(this.vamDMO.getVamMsisdnNo());
				details.setSimNo(this.vamDMO.getVamSimNo());
				details.setConnectDate((this.vamDMO.getVamConnectDate() == null) ? "" : dtFormatyyymmdd.format(this.vamDMO.getVamConnectDate()));				
				details.setStatus(this.vamDMO.getVamStatCode());
				details.setMsisdnType((this.vamDMO.getVamMsisdnType() == null) ? "" : this.vamDMO.getVamMsisdnType());
				
				logger.debug("\nSTATUS TO SEARCH: " + vamStatus + " VAM STATUS FOUND: " + this.vamDMO.getVamStatCode());				
				
				if(vamStatus == null){
					statusFound = true;
				}else{
					if(vamStatus.equals(this.vamDMO.getVamStatCode())){
						if(!statusFound){
							statusFound = true;
						}
					}
				}
				
				logger.debug("\nFOUND RECORD FOR STATUS: " + vamStatus + " IS:" + statusFound);
				
				/**
				 * Get the status description for the returned record String sql
				 * = Select * from tt_type_text where tt_group = “MSISTATUS” and
				 * tt_type = vam_status_code Execute the sql return tt_type_text
				 * record
				 * 
				 * If not found Set the StatusText to “UNKNOWN Status” Else Set
				 * StatusText to tt_text
				 */

				this.ttDMO = this.getTtTypeText("MSISTATUS",
						this.vamDMO.getVamStatCode());

				if (ttDMO == null) {
					// something wrong, this is un-expected error
					details.setStatusText("UNKNOWN Status");
				} else {
					details.setStatusText(this.ttDMO.getTtText());
				}

				/**
				 * Determine the hierarchy of the sim IF l_vam.vam_hierarchy = 0
				 * AND l_vam.vam_msisdn_known = 1 msisdnsetUp = "PRIMARY"
				 * 
				 * IF l_vam.vam_hierarchy = 1 AND l_vam.vam_msisdn_known = 1
				 * msisdnsetUp = “ENHANCED MSISDN”
				 * 
				 * IF l_vam.vam_hierarchy = 0 AND l_vam.vam_msisdn_known = 2
				 * msisdnsetUp = "DUALCALL PRIMARY"
				 * 
				 * IF l_vam.vam_hierarchy = 0 AND l_vam.vam_msisdn_known = 3
				 * msisdnsetUp = "DUALCALL SECONDARY"
				 * 
				 * IF l_vam.vam_hierarchy = 1 AND l_vam.vam_msisdn_known = 2
				 * msisdnsetUp = "PRIMARY ENHANCED"
				 * 
				 * 
				 * IF l_vam.vam_hierarchy = 1 AND l_vam.vam_msisdn_known = 3
				 * msisdnsetUp = "SECONDARY ENHANCED"
				 */

				logger.debug("\nVAM HIERARCHY: "
						+ this.vamDMO.getVamHierarchy()
						+ " VAM MISISDN KNOWN: "
						+ this.vamDMO.getVamMsisdnKnown());

				if (this.vamDMO.getVamHierarchy().equals("0")
						&& this.vamDMO.getVamMsisdnKnown().equals("1")) {
					details.setMsisdnsetUp("PRIMARY");
				} else if (this.vamDMO.getVamHierarchy().equals("1")
						&& this.vamDMO.getVamMsisdnKnown().equals("1")) {
					details.setMsisdnsetUp("ENHANCED MSISDN");
				} else if (this.vamDMO.getVamHierarchy().equals("0")
						&& this.vamDMO.getVamMsisdnKnown().equals("2")) {
					details.setMsisdnsetUp("DUALCALL PRIMARY");
				} else if (this.vamDMO.getVamHierarchy().equals("0")
						&& this.vamDMO.getVamMsisdnKnown().equals("3")) {
					details.setMsisdnsetUp("DUALCALL SECONDARY");
				} else if (this.vamDMO.getVamHierarchy().equals("1")
						&& this.vamDMO.getVamMsisdnKnown().equals("2")) {
					details.setMsisdnsetUp("PRIMARY ENHANCED");
				} else if (this.vamDMO.getVamHierarchy().equals("1")
						&& this.vamDMO.getVamMsisdnKnown().equals("3")) {
					details.setMsisdnsetUp("SECONDARY ENHANCED");
				} else {
					// No combination found
				}

				/**
				 * Get the deactivation reasons/history IF vam_stat_code in
				 * (‘4’,’6’)
				 * 
				 * String sql = “SELECT smh_hist_code, smh_comment FROM
				 * smh_sim_history WHERE smh_subscriber_id = subscriberId AND
				 * smh_sim_no = simNo AND smh_hist_code IN
				 * ("ESD","ETCD","FSD","FTDC"
				 * ,"FTD","MDES","SD","TD","TTCD","ETD") ORDER BY smh_timestamp
				 * desc
				 * 
				 * Set historyCode = smh_hist_code Set historyDesc = Set
				 * reasonCode = smh_comment[6,16]
				 */
				smhDMO = null;
				if (this.vamDMO.getVamStatCode().equals("4")
						|| this.vamDMO.getVamStatCode().equals("6")) {
					smhDMO = this.getSmhHistory(
							this.vamDMO.getVamSubscriberId(),
							this.vamDMO.getVamSimNo());
				}

				if (smhDMO != null) {
					details.setHistoryCode(smhDMO.getSmhHistCode());
					details.setHistoryDesc("");
					logger.debug("\nCOMMENT FROM smhDMO.getSmhComment(): "
							+ smhDMO.getSmhComment());
					
					if(smhDMO.getSmhComment().length() < 9){
						logger.debug("\nREASON CODE FROM smhDMO.getSmhComment(): "
							+ smhDMO.getSmhComment().substring(5, smhDMO.getSmhComment().length()));
					details.setReasonCode(smhDMO.getSmhComment().substring(5,
							smhDMO.getSmhComment().length()));
					}else{
						logger.debug("\nREASON CODE FROM smhDMO.getSmhComment(): "
								+ smhDMO.getSmhComment().substring(5, 9));
						details.setReasonCode(smhDMO.getSmhComment().substring(5,
								9));
					}
				} else {
					details.setHistoryCode("");
					details.setHistoryDesc("");
					details.setReasonCode("");
				}

				/**
				 * Get the reason description String sql = “SELECT rc_desc from
				 * rc_reason_code where rc_code = reasonCode” Set comment =
				 * rc_desc
				 * 
				 * Return the record array
				 */

				try {
					rcDMO = this.getReasonCode(details.getReasonCode(), null);

					if (rcDMO == null) {
						logger.error("\nFailed to get reason description for reason code: "
								+ details.getReasonCode());
						details.setComment("");
					} else {
						details.setComment(rcDMO.getRcDesc());
					}

				} catch (EPPIXSeriousException e) {
					logger.error("\nFailed to get reason description for reason code: "
							+ details.getReasonCode());
					logger.error("\n" + e.getMessage());
					details.setComment("");
				}

				logger.debug(details.toString());
				response.addSimDetials(details);

			}// End while
		} else {

			SimDetails details1 = new SimDetails();
			details1.setSubscriberId(this.vamDMO.getVamSubscriberId()
					.toString());
			details1.setDisConnectDate((vamDMO.getVamDconnectDate() == null) ? "" : vamDMO.getVamDconnectDate().toString());
			details1.setMsisdn(this.vamDMO.getVamMsisdnNo());
			details1.setSimNo(this.vamDMO.getVamSimNo());
			details1.setConnectDate(this.vamDMO.getVamConnectDate().toString());
			details1.setMsisdnType((this.vamDMO.getVamMsisdnType() == null) ? "" : this.vamDMO.getVamMsisdnType());

			this.ttDMO = this.getTtTypeText("MSISTATUS",
					this.vamDMO.getVamStatCode());

			if (ttDMO == null) {
				// something wrong, this is un-expected error
				details1.setStatusText("UNKNOWN Status");
			} else {
				details1.setStatusText(this.ttDMO.getTtText());
			}

			logger.debug("\nVAM HIERARCHY: " + this.vamDMO.getVamHierarchy()
					+ " VAM MISISDN KNOWN: " + this.vamDMO.getVamMsisdnKnown());

			if (this.vamDMO.getVamHierarchy().equals("0")
					&& this.vamDMO.getVamMsisdnKnown().equals("1")) {
				details1.setMsisdnsetUp("PRIMARY");
			} else if (this.vamDMO.getVamHierarchy().equals("1")
					&& this.vamDMO.getVamMsisdnKnown().equals("1")) {
				details1.setMsisdnsetUp("ENHANCED MSISDN");
			} else if (this.vamDMO.getVamHierarchy().equals("0")
					&& this.vamDMO.getVamMsisdnKnown().equals("2")) {
				details1.setMsisdnsetUp("DUALCALL PRIMARY");
			} else if (this.vamDMO.getVamHierarchy().equals("0")
					&& this.vamDMO.getVamMsisdnKnown().equals("3")) {
				details1.setMsisdnsetUp("DUALCALL SECONDARY");
			} else if (this.vamDMO.getVamHierarchy().equals("1")
					&& this.vamDMO.getVamMsisdnKnown().equals("2")) {
				details1.setMsisdnsetUp("PRIMARY ENHANCED");
			} else if (this.vamDMO.getVamHierarchy().equals("1")
					&& this.vamDMO.getVamMsisdnKnown().equals("3")) {
				details1.setMsisdnsetUp("SECONDARY ENHANCED");
			} else {
				// No combination found
			}

			smhDMO = null;
			if (this.vamDMO.getVamStatCode().equals("4")
					|| this.vamDMO.getVamStatCode().equals("6")) {
				smhDMO = this.getSmhHistory(this.vamDMO.getVamSubscriberId(),
						this.vamDMO.getVamSimNo());
			}

			if (smhDMO != null) {
				details1.setHistoryCode(smhDMO.getSmhHistCode());
				details1.setHistoryDesc("");
				logger.debug("\nCOMMENT FROM smhDMO.getSmhComment(): "
						+ smhDMO.getSmhComment());
				
				if(smhDMO.getSmhComment().length() < 9){
					logger.debug("\nREASON CODE FROM smhDMO.getSmhComment(): "
						+ smhDMO.getSmhComment().substring(5, smhDMO.getSmhComment().length()));
				details1.setReasonCode(smhDMO.getSmhComment().substring(5,
						smhDMO.getSmhComment().length()));
				}else{
					logger.debug("\nREASON CODE FROM smhDMO.getSmhComment(): "
							+ smhDMO.getSmhComment().substring(5, 9));
					details1.setReasonCode(smhDMO.getSmhComment().substring(5,
							9));
				}
			} else {
				details1.setHistoryCode("");
				details1.setHistoryDesc("");
				details1.setReasonCode("");
			}

			/**
			 * Get the reason description String sql = “SELECT rc_desc from
			 * rc_reason_code where rc_code = reasonCode” Set comment = rc_desc
			 * 
			 * Return the record array
			 */

			try {
				rcDMO = this.getReasonCode(details1.getReasonCode(), null);

				if (rcDMO == null) {
					logger.error("\nFailed to get description for reason code: "
							+ details1.getReasonCode());
					details1.setComment("");
				} else {
					details1.setComment(rcDMO.getRcDesc());
				}

			} catch (EPPIXSeriousException e) {
				logger.error("\nFailed to get description for reason code: "
						+ details1.getReasonCode());
				logger.error("\n" + e.getMessage());
				details1.setComment("");
			}

			logger.debug(details1.toString());
			response.addSimDetials(details1);
		}
		
		logger.debug("\nFOUND A REOCROD FOR THE STATUS BEING SEARCH FOR: " + statusFound);
		
		if(!statusFound){
			/** 
			 * no record was found for the status being search for so send 
			 * no record found error back.
			 */
			response.removeSimDetials();
			
			try {
				thrower.business(MSIM_000125, valToSearch);
			} catch (EPPIXBusinessException e) {
				logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
				response.setErrorType("1");
				response.setErrorCode(e.getErrorCode());
				response.setEppixStatus("0");
				response.setIsamError(e.getMessage());
				return response;
			}
		}
		

		response.setErrorType("0");
		response.setErrorCode("0");
		response.setEppixStatus("0");
		response.setIsamError("SUCCESS");

		return response;
	}

	private TtTypeTextDMO getTtTypeText(String group, String type) {
		/**
		 * Change to get all specified service type
		 */

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, group);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, type);
		TtTypeTextDMO ttDmo = null;

		try {
			ttDmo = base.ttTypeText().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting TT_Type_Text record for group: EXCSERVTRN EXCEPTION: "
					+ e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting TT_Type_Text record for group: EXCSERVTRN EXCEPTION: "
					+ e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting TT_Type_Text record for group: EXCSERVTRN EXCEPTION: "
					+ e);
		}

		return ttDmo;
	}

	private SfeSimFutEventDMO getSfeFutureEvent(String subscriberId,String simNo) {

		SfeSimFutEventDMO sfeDmo = null;
		
		String sql = "";

		if (subscriberId != null && !subscriberId.isEmpty()) {
			sql = "Select * from sfe_sim_fut_event where sfe_subscriber_id = "	+ subscriberId	+ " and sfe_event_date > TODAY";
		} else if (simNo != null && !simNo.isEmpty()) {
			sql = "Select * from sfe_sim_fut_event where sfe_sim_no = '" + simNo + "' and sfe_event_date > TODAY";
		} else {
			return null;
		}
		
			Statement st = null;
			ResultSet rs = null;
			String accountNo = null;
			String acStatus = null;
			String accountFraud = null;
			
			logger.debug("\n" + sql);

			try {
				st = this.getConnection().createStatement();
				rs = st.executeQuery(sql);

				while (rs.next()) {
					sfeDmo = new SfeSimFutEventDMO();
					sfeDmo.setSfeCommand(rs.getString(1));
					sfeDmo.setSfeFutEventId(rs.getString(2));
					sfeDmo.setSfeSubscriberId(rs.getInt(3));
					sfeDmo.setSfeSimNo(rs.getString(4));
					sfeDmo.setSfeMsisdnNo(rs.getString(5));
					sfeDmo.setSfeServiceCode(rs.getString(6));
					sfeDmo.setSfeDventDate(new Date(rs.getDate(7)));
					sfeDmo.setSfeTimestamp(new DateTime(rs.getDate(8)));
					sfeDmo.setSfeCommand(rs.getString(9));
					sfeDmo.setSfeOrigStatus(rs.getShort(10));

					break;
				}

			} catch (SQLException e) {
				logger.error(e.getMessage());
			}
			
			logger.debug((sfeDmo == null) ? null : sfeDmo.toString());
			return sfeDmo;

	}

	private SmhSimHistoryDMO getSmhHistory(Integer subscriberId, String simNo) {
		/**
		 * String sql = “SELECT smh_hist_code, smh_comment FROM smh_sim_history
		 * WHERE smh_subscriber_id = subscriberId AND smh_sim_no = simNo AND
		 * smh_hist_code IN
		 * ("ESD","ETCD","FSD","FTDC","FTD","MDES","SD","TD","TTCD","ETD") ORDER
		 * BY smh_timestamp desc
		 */

		String[] val = new String[] { "ESD", "ETCD", "FSD", "FTDC", "FTD",
				"MDES", "SD", "TD", "TTCD", "ETD" };
		DAOIterator it = null;

		SmhSimHistoryDMO smhDMO = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SmhSimHistoryDMO.smhSubscriberIdFilter,
				subscriberId);
		filter.add(FilterOp.EQUAL, SmhSimHistoryDMO.smhSimNoFilter, simNo);
		filter.add(FilterOp.IN, SmhSimHistoryDMO.smhHistCodeFilter, val);
		filter.add(FilterOp.ORDERBYDESC, SmhSimHistoryDMO.smhTimestampFilter);

		try {
			it = base.smhSimHistory().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}
		
		if (it != null) {
			while (it.hasNext()) {
				smhDMO = (SmhSimHistoryDMO) it.next();
				break;
			}
		}

		return smhDMO;
	}
	
	private SmhSimHistoryDMO getSmh(Integer subscriberId, String simNo) {

		String[] val = new String[] { "ETD" };
//		DAOIterator it = null;

		SmhSimHistoryDMO smhDMO = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SmhSimHistoryDMO.smhSubscriberIdFilter,
				subscriberId);
		filter.add(FilterOp.EQUAL, SmhSimHistoryDMO.smhSimNoFilter, simNo);
		filter.add(FilterOp.IN, SmhSimHistoryDMO.smhHistCodeFilter, val);
		filter.add(FilterOp.ORDERBYDESC, SmhSimHistoryDMO.smhTimestampFilter);

		try {
			smhDMO = base.smhSimHistory().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		return smhDMO;
	}
}
