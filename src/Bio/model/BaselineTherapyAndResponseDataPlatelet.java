package Bio.model;

import java.sql.Date;

public class BaselineTherapyAndResponseDataPlatelet {
	private int baselineTherapyAndResponseDataPlateletId;
	private String modeOfTreatment;
	private String regimen;
	private Date dateStarted;
	private String phaseOfTheDisease;

	public int getBaselineTherapyAndResponseDataPlateletId() {
		return baselineTherapyAndResponseDataPlateletId;
	}

	public void setBaselineTherapyAndResponseDataPlateletId(int baselineTherapyAndResponseDataPlateletId) {
		this.baselineTherapyAndResponseDataPlateletId = baselineTherapyAndResponseDataPlateletId;
	}

	public String getModeOfTreatment() {
		return modeOfTreatment;
	}

	public void setModeOfTreatment(String modeOfTreatment) {
		this.modeOfTreatment = modeOfTreatment;
	}

	public String getRegimen() {
		return regimen;
	}

	public void setRegimen(String regimen) {
		this.regimen = regimen;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public String getPhaseOfTheDisease() {
		return phaseOfTheDisease;
	}

	public void setPhaseOfTheDisease(String phaseOfTheDisease) {
		this.phaseOfTheDisease = phaseOfTheDisease;
	}

}
